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
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.VisibilityKind
import org.junit.Test

import static org.junit.Assert.*

class UMLCreateObject extends AbstractUMLTest {

	//Initializing Factory for BOEM
	extension BoemFactory factory = new BoemFactory(UMLPackage.eINSTANCE)

	@Test
	def void testSimpleCreation() {

		val model = Model.build [ // Simple creation
			it.name = "myUmlModel" // Simple set  
			visibility = VisibilityKind.PUBLIC_LITERAL // it keyword is not necessary
		]

		assertEquals("myUmlModel", model.name)
		assertEquals(VisibilityKind.PUBLIC_LITERAL, model.visibility)
	}

	@Test
	def void testNestedCreation() {

		val model = Model.build [
			name = "myUmlModel"
			visibility = VisibilityKind.PUBLIC_LITERAL
			packagedElements += Interface.build [ // Nested creation
				name = "myInterface"
				ownedOperations += Operation.build [
					name = "myOperation"
				]
			]
		]

		assertEquals("myInterface", model.packagedElements.get(0).name)
		assertEquals("myOperation", (model.packagedElements.get(0) as Interface).operations.get(0).name)
	}
	

}
