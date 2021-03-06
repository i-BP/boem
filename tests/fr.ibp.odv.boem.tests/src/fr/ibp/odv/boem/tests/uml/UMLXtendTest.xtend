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
import org.eclipse.uml2.uml.Generalization
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.UMLPackage
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.ParameterDirectionKind
import org.eclipse.uml2.uml.NamedElement

class UMLXtendTest extends AbstractUMLTest {

	extension BoemFactory factory = new BoemFactory(UMLPackage.eINSTANCE).registerIdProvider([
		if (it instanceof NamedElement) {
			return it.name
		}
		return null
	])

	@Test
	def void longTest() {
		val modelAccessor = Model.build [
			name = "myUmlModel"
			packagedElements += #{
				Interface.build [
					name = "it1"
				],
				Interface.build [
					name = "it2"
					generalizations += Generalization.build [
						specific = Interface << "it2"
						general = Interface << "it3"
					]
				],
				Interface.build [
					name = "it3"
					ownedOperations += Operation.build [
						name = "op1"
						ownedParameters += Parameter.build [
							name = "par1"
							direction = ParameterDirectionKind.RETURN_LITERAL
							type = Interface << "it1"
						]
					]
				]
			}
		].buildTree

		val it2 = modelAccessor.access(Interface, "it2")
		assertEquals(1, it2.allOperations.size)
	}
}
