/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *    Jacob Geisel - initial API and implementation
 *******************************************************************************/
package fr.ibp.odv.boem.tests.uml

import fr.ibp.odv.boem.lib.BoemFactory
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Generalization
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.VisibilityKind
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*

class UMLSettingReferences extends AbstractUMLTest {

	extension BoemFactory factory = new BoemFactory(UMLPackage.eINSTANCE)
	
	@Test
	def void testMultipleAdd() {

		val modelAccessor = Model.build [
			name = "myUmlModel"
			visibility = VisibilityKind.PUBLIC_LITERAL
			packagedElements += #{ // Nested multiple creation
			"umlInterface" >> Interface.build [ // With id
				name = "myInterface"
			], "umlInterface2" >> Interface.build [ // With id
				name = "myInterface2"
			], Interface.build [ // WithOUT id
				name = "myInterface3"
			]}
		].buildTree

		assertEquals(3, modelAccessor.root.packagedElements.size)
	}

	@Test
	def void testSingleSet() {
		val umlInterface = Interface.build [
			name = "myInterface"
		]

		val classAccessor = Class.build [
			name = "myUmlClass"
			ownedAttributes += Property.build [
				type =  umlInterface
			]
		].buildTree

		assertEquals(umlInterface, classAccessor.root.ownedAttributes.get(0).type)
	}

	@Test
	def void testUsingIds() {

		val modelAccessor = Model.build [
			name = "myUmlModel"
			visibility = VisibilityKind.PUBLIC_LITERAL
			packagedElements += #{"umlInterface" >> Interface.build [
				name = "myInterface"
			], "umlInterface2" >> Interface.build [
				name = "myInterface2"
				generalizations += "umlGen" >> Generalization.build [
					general = buildRef(Interface, "umlInterface") // Builds reference to elements built in the same models
					specific = Interface << "umlInterface2" // Simplified notation
				]
			]}

		].buildTree

		val umlgen = modelAccessor.access(Generalization, "umlGen")
		assertEquals(("umlInterface" => modelAccessor), umlgen.targets.get(0))
		assertEquals(("umlInterface2" => modelAccessor), umlgen.sources.get(0))

	}
}
