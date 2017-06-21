/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *    Jacob Geisel - extending API and Documentation
 *******************************************************************************/
package fr.ibp.odv.boem.lib

import com.google.common.collect.Iterators
import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.stream.Collectors
import org.eclipse.emf.common.notify.Adapter
import org.eclipse.emf.common.notify.impl.NotificationChainImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMapUtil
import org.eclipse.emf.ecore.util.InternalEList

import static extension fr.ibp.odv.boem.lib.BoemFactory.*

/**
 * Utility class that contains the BOEM APIs.
 * 
 * <p><i>To fully enjoy the BOEM API it should be imported statically as extension</i></p>
 */
class Boems {

	/**
	 * Registers an id against a given {@link EObject}
	 * @param id a unique id
	 * @param value the {@link EObject} value
	 */
	def static <T extends EObject> T >>(String id, T value) {
		setId(value, id)
		return value
	}

	/**
	 * Shortcut for {@link ModelAccessor#access(Class, String)}
	 * @param id the id matching the {@link EObject} to retrieve
	 * @param modelAccessor the model accessor where is stored the given id
	 */
	def static <T extends EObject> EObject =>(String id, ModelAccessor<T> modelAccessor) {
		return modelAccessor.access(id)
	}

	/**
	 * Sets an id on the given EObject (adding an {@link IdAdapter})
	 * @param eObject the targeted EObject
	 * @param id the id
	 */
	private def static void setId(EObject eObject, String id) {
		val idAdapter = EcoreUtil.getAdapter(eObject.eAdapters, IdAdapter) as IdAdapter
		if (idAdapter === null) {
			eObject.eAdapters.add(new IdAdapter(id))
		} else {
			idAdapter.id = id
		}
	}

	/**
	 * Builds the containment tree
	 * <p> This methods gathers all IDs that have been set using ">>" method. It will also replace all references built with {@link BoemFactory#buildRef}</p>
	 * @param eObject the root EObject
	 * @return a new {@link ModelAccessor} 
	 */
	def static <T extends EObject> ModelAccessor<T> buildTree(T eObject) {
		return eObject.buildTree(new HashMap)
	}

	package def static <T extends EObject> ModelAccessor<T> buildTree(T eObject, Map<String, EObject> mappedElements) {
		// Computes the map of ids
		val contentIte = eObject.getCompleteIterator
		while (contentIte.hasNext) {
			val next = contentIte.next
			var String id = next.getId
			if (id !== null) {
				if (mappedElements.containsKey(id) && mappedElements.get(id) != next) {
					throw new IllegalStateException("Duplicated id '" + id + "'");
				}
				mappedElements.put(id, next)
			}
		}
		// Resolves all references using the computed map
		val contentIte2 = eObject.getCompleteIterator
		while (contentIte2.hasNext) {
			val next = contentIte2.next
			next.replaceDelayedFeatureReferences(mappedElements)
		}

		return new ModelAccessor(eObject, mappedElements)
	}

	/**
	 * Builds the containment tree
	 * <p> This methods will gather all id set using '>>' method.
	 *  It will resolve references built with BoemFactory#buildRef.
	 *  It will adds the root into the resource located at the given URI (it create a new one if it does not exist yet)</p>
	 * @param eObject the root EObject
	 * @param rs a ResourceSet used to retrieve the a resource
	 * @param uri URI of the resource
	 * @return ModelAccessor 
	 */
	public static def <T extends EObject> buildTree(T eObject, ResourceSet rs, URI uri) {
		val ma = Boems.buildTree(eObject)
		val resource = rs.createResource(uri)
		resource.contents.add(eObject)
		return ma
	}

	private static def replaceDelayedFeatureReferences(EObject eObject, Map<String, EObject> ids) {
		for (EReference ref : eObject.eClass.EAllReferences.stream.filter[!it.isDerived].collect(Collectors.toList)) {
			eObject.handleEReference(ref, ids)
		}
	}

	private static def handleEReference(EObject eObject, EReference ref, Map<String, EObject> ids) {
		var Collection<InternalEObject> values;
		if (ref.isMany) {
			values = (eObject.eGet(ref, false) as InternalEList<InternalEObject>).basicList
		} else {
			values = Collections.singleton(eObject.eGet(ref, false) as InternalEObject)
		}
		for (InternalEObject target : values) {
			if (target !== null && target.eIsProxy) {
				val proxy = target.eProxyURI
				if (proxy.isIdBoemURI()) {
					val id = proxy.boemId;
					val realTarget = ids.get(id);
					if (realTarget !== null) {
						if (ref.EType.isInstance(realTarget)) {
							eObject.replaceNonResolving(ref, target, realTarget)
						} else {
							throw new IllegalStateException(
								"'" + id + "' targets a '" + realTarget.eClass.name +
									"' element which is not compatible with reference '" + ref.name + "'")
						}
					} else {
						throw new IllegalStateException("Unknown id '" + id + "'. Unable to set '" + ref.name + "'")
					}

				}
			}
		}
	}

	/**
	 * Replaces the old value in the object's feature with the new value .
	 * This method prevents the resolution of EList when replacing a value
	 * @param eObject the object holding the values.
	 * @param eStructuralFeature the feature of the object holding the values.
	 * @param oldValue the value to replace.
	 * @param newValue the replacement value.
	 */
	private static def void replaceNonResolving(EObject eObject, EStructuralFeature eStructuralFeature, Object oldValue,
		Object newValue) {
		if (FeatureMapUtil.isMany(eObject, eStructuralFeature)) {
			// We use internal APIs to avoid resolving any value in the list
			val InternalEList<Object> list = eObject.eGet(eStructuralFeature, false) as InternalEList<Object>;
			val indexOf = list.basicIndexOf(oldValue)
			list.basicRemove(oldValue, new NotificationChainImpl)
			list.addAllUnique(indexOf, Collections.singleton(newValue))
		} else {
			eObject.eSet(eStructuralFeature, newValue);
		}
	}

	private static def getCompleteIterator(EObject o) {
		return Iterators.concat(Iterators.singletonIterator(o), o.eAllContents)
	}

	private def static getId(EObject eObject) {
		var String id = null;
		val List<Adapter> toRemove = newArrayList()
		for (Adapter adapter : eObject.eAdapters) {
			if (adapter instanceof IdAdapter) {
				id = adapter.id
				toRemove.add(adapter)
			}
		}
		eObject.eAdapters.removeAll(toRemove)
		return id

	}
}
