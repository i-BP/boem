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

import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.VisibilityKind
import org.junit.Test

import static org.junit.Assert.*
import fr.ibp.odv.boem.lib.BoemFactory
import org.eclipse.uml2.uml.UMLPackage

//BOEM Extension
import static extension fr.ibp.odv.boem.lib.Boems.*

class UMLObjectAccessTest extends AbstractUMLTest {

	extension BoemFactory factory = new BoemFactory(UMLPackage.eINSTANCE)

	@Test
	def void testObjectAccess() {

		val modelAccessor = Model.build [
			name = "myUmlModel"
			visibility = VisibilityKind.PUBLIC_LITERAL
			packagedElements += "umlInterface" >> Interface.build [ // Nested creation
				name = "myInterface"
				ownedOperations += "umlOperation" >> Operation.build [
					name = "myOperation"
				]
			]
		].buildTree

		assertEquals("myInterface", modelAccessor.access(Interface, "umlInterface").name) // Verbose accessor syntax (with cast)
		assertEquals(modelAccessor.access(Interface, "umlInterface"), ("umlInterface" => modelAccessor)) // Direct accessor syntax (wihout cast)

		assertEquals("myOperation", modelAccessor.access(Operation, "umlOperation").name) // Verbose accessor syntax (with cast)
		assertEquals(modelAccessor.access(Operation, "umlOperation"), ("umlOperation" => modelAccessor)) // Direct accessor syntax (wihout cast)
	}

}
