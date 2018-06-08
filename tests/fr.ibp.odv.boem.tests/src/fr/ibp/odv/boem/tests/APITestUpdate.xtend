/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *    Jacob Geisel - extending test coverage and documentation
 *******************************************************************************/
package fr.ibp.odv.boem.tests

import fr.ibp.odv.boem.lib.BoemFactory
import fr.ibp.odv.boem.mm.test.BoemTest.A
import fr.ibp.odv.boem.mm.test.BoemTest.B
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage
import fr.ibp.odv.boem.mm.test.BoemTest.C
import fr.ibp.odv.boem.mm.test.BoemTest.NamedElement
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*

/**
 * Tests the BOEM API on updates
 */
class APITestUpdate extends AbstractAPITest {

	extension BoemFactory factory = new BoemFactory(BoemTestPackage.eINSTANCE)

	/**
	 * Tests to update an element of a model
	 */
	@Test
	def void testUpdatingElement() {

		val maA = A.build [
			autoContainementA += "B" >> B.build [
				autoContainementA += "D" >> C.build[]
			]
		].buildTree

		assertEquals(null, maA.root.name)
		assertEquals(null, maA.access(NamedElement, "B").name)

		maA.update [
			name = "NameA"
			autoContainementA.get(0)=> [
				name = "NameB"
				autoContainementA.get(0)=> [
					name = "NameD"
				]
			]
		]

		assertEquals("NameA", maA.root.name)
		assertEquals("NameB", maA.access(B, "B").name)

		maA.access(B, "B").name = "NameB2"

		assertEquals("NameB2", maA.access(B, "B").name)
	}
	
	/**
	 * Tests to update a sub part of a model
	 */
	@Test
	def void testUpdatingASubTree(){
		val it = A.build [
			autoContainementA += "B" >> B.build [
				autoContainementA += "C" >> C.build[]
			]
		].buildTree
		
		// Throw an illegal state exception since D is not defined
		var exception = false
		try {
			access("D")
		} catch(IllegalStateException e){
			exception = true
		}
		assertTrue(exception)
		
		update(C,"C")[
			autoContainementA += "D" >> C.build[]
		]
		
		assertNotNull(access("D"))
	}
}
