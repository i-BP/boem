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
import fr.ibp.odv.boem.mm.test.BoemTest.NamedElement
import fr.ibp.odv.boem.mm.test.BoemTest.Node
import org.junit.Test

import static extension fr.ibp.odv.boem.lib.Boems.*

import static org.junit.Assert.*

/**
 * Tests the BOEM API on implicit IDs
 */
class APITestImplicitId extends AbstractAPITest {
	
	extension BoemFactory factory = new BoemFactory(BoemTestPackage.eINSTANCE).registerIdProvider([
		if (it instanceof NamedElement) {
			return it.name
		}
		return null
	])
	
	@Test
	def void testImplicitId() {
		val it = A.build [
			name = "AName"
			autoContainementA += "id0" >> B.build [
				referencesNodeA += #[
					Node.buildRef("id1"),
					Node.buildRef("id2"),
					Node.buildRef("id3"),
					Node.buildRef("id4")
				]
			]
			childrenNodeA += #[
				Node.build[name = "id1"],
				"id2" >> Node.build[name = "id2"],
				"id3" >> Node.build[name = "idX"],
				"id4" >> Node.build[name = "id1"]
				
			]
		].buildTree

		assertNoBoemUriLeft(root)
		assertNoAdapterLeft(root)
		val refOwner = access(B, "id0");
		assertEquals(4, refOwner.referencesNodeA.size)
		assertEquals(access(Node, "id1"), refOwner.referencesNodeA.get(0))
		assertEquals(access(Node, "id2"), refOwner.referencesNodeA.get(1))
		assertEquals(access(Node, "id3"), refOwner.referencesNodeA.get(2))
		assertEquals(access(Node, "id4"), refOwner.referencesNodeA.get(3))
	}
	
	@Test(expected=IllegalStateException)
	def void testDoubleImplicitIds() {
		A.build [
			childrenNodeA += #[
				Node.build[name = "id1"],
				"id1" >> Node.build[]
			]
		].buildTree
	}
	
	@Test(expected=IllegalStateException)
	def void testDoubleImplicitIds2() {
		A.build [
			childrenNodeA += #[
				"id1" >> Node.build[],
				Node.build[name = "id1"]
			]
		].buildTree
	}
	
	@Test(expected=IllegalStateException)
	def void testDoubleImplicitIds3() {
		A.build [
			childrenNodeA += #[
				Node.build[name = "id1"],
				Node.build[name = "id1"]
			]
		].buildTree
	}
}