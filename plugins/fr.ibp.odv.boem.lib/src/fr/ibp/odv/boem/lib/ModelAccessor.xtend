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

import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension fr.ibp.odv.boem.lib.Boems.*

/**
 * A ModelAccessor is the resource of Boems.buildTree method. 
 * It gathers a root EObject and a map of elements with user id
 */
class ModelAccessor<T extends EObject> {

	val T root;

	val Map<String, EObject> mappedElements

	new(T root, Map<String, EObject> mappedElements) {
		this.root = root;
		this.mappedElements = mappedElements
	}

	def getRoot() {
		return root;
	}

	/**
	 * Gets the Map of all elements that have been registered against an id
	 */
	def Map<String, EObject> getMappedElement() {
		return mappedElements;
	}

	def <U extends EObject> U update(Class<U> type, String id, (U)=>void config) {
		val result = mappedElements.get(id)
		if (result !== null) {
			val element = type.cast(result);
			config.apply(element)
			root.buildTree(mappedElements)
			return element
		}
	}

	/**
	 * Gets a list of semantic elements registered against the given ids
	 * @param id the id of the element
	 */
	def Set<EObject> access(List<String> ids) {
		val result = new HashSet
		for (String id : ids) {
			val target = access(id);
			result += target
		}
		return result;
	}

	/**
	 * Gets the semantic element registered against the given id
	 * @param id the id of the element
	 */
	def EObject access(String id) {
		val result = mappedElements.get(id)
		if (result === null) {
			throw new IllegalStateException("Unknown id '" + id + "'")
		}
		return result;
	}

	/**
	 * Gets the semantic element registered against the given id
	 * @param type the type of the expected element
	 * @param id the id of the element
	 */
	def <T extends EObject> T access(Class<T> type, String id) {
		return type.cast(access(id));
	}

	/**
	 * Method used to update a model referenced in this ModelAccessor
	 * This method update the semantic model but also update the Map of element with an id
	 * @param config the updater
	 */
	def update((T)=>void updater) {
		updater.apply(root)
		root.buildTree(mappedElements)
		return this
	}
}
