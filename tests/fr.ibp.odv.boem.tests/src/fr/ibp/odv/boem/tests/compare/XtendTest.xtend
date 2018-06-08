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
package fr.ibp.odv.boem.tests.compare

import fr.ibp.odv.boem.lib.BoemFactory
import fr.ibp.odv.boem.mm.test.BoemTest.A
import fr.ibp.odv.boem.mm.test.BoemTest.B
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage
import fr.ibp.odv.boem.mm.test.BoemTest.C
import fr.ibp.odv.boem.mm.test.BoemTest.Node
import org.junit.Test

import static org.junit.Assert.*

import static extension fr.ibp.odv.boem.lib.Boems.*

/**
 * Test used to compare syntax with pure java API
 * 
 * @author Arthur Daussy
 * @author Jacob Geisel
 *
 */
class XtendTest {

	extension BoemFactory factory = new BoemFactory(BoemTestPackage.eINSTANCE)

	@Test
	def void test() {
		val it = A.build [
			name = "AName";

			referencesNodeA += Node.buildRef("id4")

			// Single valued containment feature
			childNodeA = "id1" >> Node.build [
				name = "SingleChildName"
			]

			// Adds one child
			childrenNodeA += "id2" >> Node.build [
				name = "ANodeName0"
			]

			// Adds several children at once
			childrenNodeA += #["id3" >> Node.build [
				name = "ANodeName1"
			], "id4" >> Node.build [
				name = "ANodeName2"
			]]

			autoContainementA += "id5" >>B.build [
				name = "BName"
				autoContainementA += "id6" >>C.build [
					name = "CName"
					autoContainementA += "id7" >>A.build[
						name = "GrandChildA"
					]
				]
			]
		].buildTree

		assertEquals("AName", root.name)
		assertEquals(3, root.childrenNodeA.size)
		assertEquals("SingleChildName", access(Node, "id1").name)
		assertEquals("ANodeName0", access(Node, "id2").name)
		assertEquals("ANodeName1", access(Node, "id3").name)
		assertEquals("ANodeName2", access(Node, "id4").name)
		assertEquals("ANodeName2", root.referencesNodeA.get(0).name)
		
		assertEquals("BName", access(B, "id5").name)
		assertEquals("CName", access(C, "id6").name)
		assertEquals("GrandChildA", access(A, "id7").name)
	}
}
