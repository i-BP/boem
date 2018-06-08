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
import fr.ibp.odv.boem.mm.test.BoemTest.Node
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*

/**
 * Test the BOEM API for non-containment EReferences
 */
class APITestRef extends AbstractAPITest {

	extension BoemFactory factory = new BoemFactory(BoemTestPackage.eINSTANCE)

	/**
	 * Tests that an element registered against an id can be accessed with its id within the tree
	 */
	@Test
	def testSimpleRef() {
		val it = A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referenceNodeA = Node.buildRef("id1")
			]
			childrenNodeA += "id1" >> Node.build [
				name = "ANode"
			]
		].buildTree

		assertNoBoemUriLeft(root)
		assertNoAdapterLeft(root)
		val target = access(Node, "id1");
		assertEquals("ANode", target.name)
		val refOwner = access(B, "id0");
		assertEquals(target, refOwner.referenceNodeA)

	}

	/**
	 * Same as {@link #testSimpleRef} but using the syntax "<<"
	 */
	@Test
	def testSimpleRef_Bis() {
		val it = A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referenceNodeA = Node << "id1"
			]
			childrenNodeA += "id1" >> Node.build [
				name = "ANode"
			]
		].buildTree

		assertNoBoemUriLeft(root)
		assertNoAdapterLeft(root)
		val target = access(Node, "id1");
		assertEquals("ANode", target.name)
		val refOwner = access(B, "id0");
		assertEquals(target, refOwner.referenceNodeA)
	}

	@Test
	def testAccess() {
		val it = A.build [
			name = "AName"
			childrenNodeA += "id1" >> Node.build [
				name = "ANode"
			]
		].buildTree

		val target = access(Node, "id1");
		val taget2 = ("id1" => it) as Node
		assertTrue(taget2 == target)
		val target3 = access("id1")
		assertTrue(target3 == target)
		assertTrue(target == "id1" => it)

	}

	@Test(expected=IllegalStateException)
	def void testSimpleRef_UnknownId() {
		A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referenceNodeA = Node.buildRef("id1")
			]
			childrenNodeA += Node.build [
				name = "ANode"
			]
		].buildTree
	}

	@Test(expected=IllegalStateException)
	def void testSimpleRef_IncompatibleType() {
		A.build [
			name = "AName"
			autoContainementA += #{"id0" >> B.build [
				referenceNodeA = Node.buildRef("id1")
			], "id1" >> B.build [
				name = "BName"
			]}
		].buildTree
	}

	@Test
	def testManyRef() {
		val it = A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referencesNodeA += Node.buildRef("id1")
			]
			childrenNodeA += "id1" >> Node.build [
				name = "ANode"
			]
		].buildTree

		assertNoAdapterLeft(root)
		val target = access(Node, "id1");
		assertEquals("ANode", target.name)
		val refOwner = access(B, "id0");
		assertNoBoemUriLeft(root)
		assertEquals(1, refOwner.referencesNodeA.size)
		assertEquals(target, refOwner.referencesNodeA.get(0))

	}

	@Test
	def testManyRef2() {
		val it = A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referencesNodeA += #[
					Node.buildRef("id1"),
					Node.buildRef("id2"),
					Node.buildRef("id3")
				]
			]
			childrenNodeA += #{
				"id1" >> Node.build [
					name = "id1"
				],
				"id2" >> Node.build [
					name = "id2"
				],
				"id3" >> Node.build [
					name = "id3"
				]
			}
		].buildTree

		assertNoBoemUriLeft(root)
		assertNoAdapterLeft(root)
		val refOwner = access(B, "id0");
		assertEquals(3, refOwner.referencesNodeA.size)
		assertEquals(access(Node, "id1"), refOwner.referencesNodeA.get(0))
		assertEquals(access(Node, "id2"), refOwner.referencesNodeA.get(1))
		assertEquals(access(Node, "id3"), refOwner.referencesNodeA.get(2))

	}

	@Test(expected=IllegalStateException)
	def void testManyRef_UnknowId() {
		A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referencesNodeA += Node.buildRef("id1")
			]
			childrenNodeA += Node.build [
				name = "ANode"
			]
		].buildTree
	}

	@Test(expected=IllegalStateException)
	def void testManyRef_IncorrecType() {
		A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referencesNodeA += Node.buildRef("id0")
			]
		].buildTree
	}

}
