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
import fr.ibp.odv.boem.mm.test.BoemTest.Node
import org.eclipse.emf.ecore.EObject
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*

/**
 * Tests the BOEM API on containment EReferences
 */
class APITestContainmentRef extends AbstractAPITest {

	extension BoemFactory factory = new BoemFactory(BoemTestPackage.eINSTANCE)

	@Test
	def testCreationContainment() {
		// Simple creation
		val model = A.build [
			name = "AName"
		].buildTree

		assertNoAdapterLeft(model.root)
		assertEquals("AName", model.root.name)

	}

	@Test
	def testContainementOverloading() {
		val model = A.build [
			name = "AName"
			autoContainementA += B.build [
				name = "BName"
				autoContainementA += C.build [
					name = "CName"
				]
			]
		].buildTree

		assertEquals("AName", model.root.name)
		assertEquals(1, model.root.autoContainementA.size)
		val b = model.root.autoContainementA.get(0)
		assertEquals("BName", b.name)
		assertEquals(1, b.autoContainementA.size)
		val c = b.autoContainementA.get(0)
		assertEquals("CName", c.name)
	}

	@Test(expected=IllegalArgumentException)
	def void testUnkwonFactory() {
		// Fails it case of using build methods on incorrect object
		EObject.build[]
	}

	@Test
	def testNestedBasicContainment() {

		val model = A.build [
			name = "AName";

			// Single valued containment feature
			childNodeA = Node.build [
				name = "SingleChildName"
			]

			// Adds one child
			childrenNodeA += Node.build [
				name = "ANodeName0"
			]

			// Adds several children at once
			childrenNodeA += #[Node.build [
				name = "ANodeName1"
			], Node.build [
				name = "ANodeName2"
			]]
		].buildTree

		assertNoAdapterLeft(model.root)
		assertEquals("AName", model.root.name)
		assertEquals("SingleChildName", model.root.childNodeA.name)
		assertEquals(3, model.root.childrenNodeA.size)
		assertEquals("ANodeName0", model.root.childrenNodeA.get(0).name)
		assertEquals("ANodeName1", model.root.childrenNodeA.get(1).name)
		assertEquals("ANodeName2", model.root.childrenNodeA.get(2).name)
	}

	@Test(expected=NullPointerException)
	def void testNullContainment() {

		A.build [
			name = "AName";

			// Single valued containment feature
			childNodeA = Node.build [
				name = "SingleChildName"
			]

			// Adds one child
			childrenNodeA += null

			// Adds several children at once
			childrenNodeA += #[null, null]
		].buildTree

	}

	@Test
	def testNestedBasicContainment_Ref() {

		val model = B.build [
			name = "AName"

			// Adds one child with reference
			childrenNodeA += "id0" >> Node.build [
				name = "ANodeName0"
			]
			// Adds several children at once with references
			childrenNodeA += #[
				"id1" >> Node.build [
					name = "ANodeName1"
				],
				"id2" >> Node.build [
					name = "ANodeName2"
				]
			]

			// Adds several children at once with references
			childrenNodeB += #[
				"id3" >> Node.build [
					name = "ANodeName3"
				],
				"id4" >> Node.build [
					name = "ANodeName4"
				]
			]
		].buildTree

		assertNoAdapterLeft(model.root)
		assertEquals("AName", model.root.name)
		assertEquals(3, model.root.childrenNodeA.size)
		assertEquals("ANodeName0", model.access(Node, "id0").name)
		assertEquals("ANodeName1", model.access(Node, "id1").name)
		assertEquals("ANodeName2", model.access(Node, "id2").name)

		assertEquals(2, model.root.childrenNodeB.size)
		assertEquals("ANodeName3", model.access(Node, "id3").name)
		assertEquals("ANodeName4", model.access(Node, "id4").name)
	}

	@Test(expected=IllegalStateException)
	def void testDuplicatedId() {
		A.build [
			name = "AName"
			childrenNodeA += #[
				"id1" >> Node.build [
					name = "ANodeName"
				],
				"id1" >> Node.build [
					name = "ANodeName2"
				]
			]
		].buildTree
	}
}
