/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *******************************************************************************/
package fr.ibp.odv.boem.lib

import java.util.ArrayList
import java.util.Iterator
import java.util.List
import java.util.Map
import java.util.Spliterator
import java.util.Spliterators
import java.util.function.Function
import java.util.function.Supplier
import java.util.stream.Collectors
import java.util.stream.Stream
import java.util.stream.StreamSupport
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.InternalEObject
import static extension fr.ibp.odv.boem.lib.Boems.*

/**
 * A BOEM factory is the main object to build your EMF Model. It can be used as follows
 * <p>
 * <pre>
 * <code>
 * extension BoemFactory factory = new BoemFactory(YOU_MMTestBoemApi.CREATION_RULES)
 * 
 * @Test
 * def testCreationContainment() {
 * 	// Simple creation
 * 	val model = A.build [
 * 		name = "AName"
 * 	].buildTree
 * 
 * 	assertNoAdapterLeft(model.root)
 * 	assertTrue(model.root instanceof A)
 * 	assertEquals("AName", model.root.name)
 * 
 * }
 * </code>
 * </pre>
 * </p>
 */
class BoemFactory {

// Public for testing purpose
	public static val String INTERNAL_URI_SCHEME = "boemuri";

	/**
	 * Map that will hold all the rules to create an EObject. It maps an interface to the supplier of EObject
	 */
	val Map<Class<? extends EObject>, Supplier<? extends EObject>> rules = newHashMap();

	val List<Function<EObject, String>> idProviders = new ArrayList

	new(EPackage... ePackages) {
		val eClasses = Stream.of(ePackages).flatMap [
			it.eAllContents.toStream.filter([it instanceof EClass]).map[it as EClass]
		].filter[!it.isAbstract].collect(Collectors.toList);
		for (EClass eClass : eClasses) {
			rules.put(
				eClass.instanceClass as Class<? extends EObject>, [eClass.EPackage.EFactoryInstance.create(eClass)])
		}
	}

	/**
	 * Converts an iterator to stream
	 * 
	 * @param <T> Type of the stream elements
	 * @param contentIterator iterator
	 * @return A stream of elements satisfying the predicate
	 */
	def static <T> Stream<T> toStream(Iterator<T> contentIterator) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(contentIterator, Spliterator.IMMUTABLE), false);
	}

	/**
	 * Registers an id provider against the current factory
	 * @param provider a function that can extract an Id from an EObject (or return null if it can't)
	 * @return the current instance for convenience
	 */
	def BoemFactory registerIdProvider(Function<EObject, String> provider) {
		idProviders.add(provider)
		return this
	}

	/**
	 * Builds an {@link EObject} and initializes it
	 * @param type the type of EObject to build
	 * @param initializer the consumer in charge of initializing the given {@link EObject}
	 * @return the built {@link EObject}
	 */
	def <T extends EObject> T build(Class<T> type, (T)=>void initializer) {
		val factory = rules.get(type);
		if (factory !== null) {
			val result = type.cast(factory.get);
			if (initializer !== null) {
				initializer.apply(result)
				val id = extractId(result);
				if (id !== null) {
					id >> result
				}
			}
			return result;
		} else {
			throw new IllegalArgumentException("Unknown factory for type " + type.name)
		}
	}

	/**
	 * Builds an {@link EObject}, but does not initialize the newly created object.
	 * @param type the type of EObject to build
	 * @return the built {@link EObject}
	 */
	def <T extends EObject> T build(Class<T> type) {
		return build(type, null)
	}

	private def String extractId(EObject o) {
		for (Function<EObject,String> idExtractor : idProviders) {
			val id = idExtractor.apply(o);
			if (id !== null) {
				return id;
			}
		}
		return null;
	}

	/**
	 * Builds a proxy that will be replaced by the target of the given id when the method {@link Boems#buildTree(EObject, org.eclipse.emf.ecore.resource.ResourceSet, URI)} or {@link Boems#buildTree(EObject)} is called.
	 * @param type the type of proxy to build (the interface of the EClass to build)
	 * @param id the id of the target object
	 * @throw IllegalArgumentException if there is no target matching the given id when the method {@link Boems#buildTree(EObject, org.eclipse.emf.ecore.resource.ResourceSet, URI)} or {@link Boems#buildTree(EObject)} is called.
	 * @return the referenced {@link EObject}
	 */
	def <T extends EObject> T buildRef(Class<T> type, String id) {
		val factory = rules.get(type);
		if (factory !== null) {
			val result = type.cast(factory.get);
			(result as InternalEObject).eSetProxyURI(id.createBoemURI)
			return result;
		} else {
			throw new IllegalArgumentException("Unknown factory for type " + type.name)
		}
	}

	/**
	 * Creates a new {@link EObject} and registers an id against it.
	 * @param type the type of the {@link EObject}
	 * @param id the id by which the newly created {@link EObject} can be retrieved
	 * @return the built {@link EObject}
	 */
	def <T extends EObject> T <<(Class<T> type, String id) {
		val factory = rules.get(type);
		if (factory !== null) {
			val result = type.cast(factory.get);
			(result as InternalEObject).eSetProxyURI(id.createBoemURI)
			return result;
		} else {
			throw new IllegalArgumentException("Unknown factory for type " + type.name)
		}
	}

	/**
	 * Creates an internal {@link URI} that references a given id
	 * @param id the id to match 
	 */
	private def createBoemURI(String id) {
		return URI.createURI(INTERNAL_URI_SCHEME + "://" + id)
	}

	/**
	 * Returns true if the given {@link URI} is a BOEM id {@link URI}
	 */
	package static def boolean isIdBoemURI(URI uri) {
		return uri !== null && INTERNAL_URI_SCHEME.equals(uri.scheme)
	}

	/**
	 * Returns the id stored in the BOEM {@link URI}
	 */
	package static def String getBoemId(URI uri) {
		return uri.authority;
	}

}
