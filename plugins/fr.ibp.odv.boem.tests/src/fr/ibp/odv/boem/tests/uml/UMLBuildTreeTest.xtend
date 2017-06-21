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
import org.eclipse.uml2.uml.resource.UMLResource
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*
import static extension org.eclipse.emf.common.util.URI.*

class UMLBuildTreeTest extends AbstractUMLTest {

	extension BoemFactory factory = new BoemFactory(UMLPackage.eINSTANCE)

	@Test
	def void testBuildTree() {
		val modelAccessor = Model.build [
			name = "myUmlModel"
			visibility = VisibilityKind.PUBLIC_LITERAL
			ownedTypes += Interface.build [ // Add in containment feature
				name = "myInterface"
				ownedOperations += Operation.build [
					name = "myOperation"
				]
			]
		].buildTree(getResourceSet(), "p2/myUmlModel.uml".createPlatformResourceURI(true))

		assertTrue(getResourceSet().resources.get(0) instanceof UMLResource)
		assertEquals("myUmlModel", modelAccessor.root.name) // modelAccessor.root.name is a Model
	}

}
