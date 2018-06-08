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
package fr.ibp.odv.boem.tests.compare;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.ibp.odv.boem.mm.test.BoemTest.A;
import fr.ibp.odv.boem.mm.test.BoemTest.B;
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestFactory;
import fr.ibp.odv.boem.mm.test.BoemTest.C;
import fr.ibp.odv.boem.mm.test.BoemTest.Node;

/**
 * Test used to compare syntax with Boem API
 * 
 * @author Arthur Daussy
 * @author Jacob Geisel
 *
 */
public class JavaTest {

	@Test
	public void test() {
		A a = BoemTestFactory.eINSTANCE.createA();
		a.setName("AName");

		Node singleChildNode = BoemTestFactory.eINSTANCE.createNode();
		singleChildNode.setName("SingleChildNode");
		a.setChildNodeA(singleChildNode);

		Node aNode0 = BoemTestFactory.eINSTANCE.createNode();
		aNode0.setName("ANodeName0");
		a.getChildrenNodeA().add(aNode0);

		Node aNode1 = BoemTestFactory.eINSTANCE.createNode();
		aNode1.setName("ANodeName1");
		a.getChildrenNodeA().add(aNode1);

		Node aNode2 = BoemTestFactory.eINSTANCE.createNode();
		aNode2.setName("ANodeName2");
		a.getChildrenNodeA().add(aNode2);

		a.setReferenceNodeA(aNode2);

		B b = BoemTestFactory.eINSTANCE.createB();
		b.setName("BName");
		a.getAutoContainementA().add(b);

		C c = BoemTestFactory.eINSTANCE.createC();
		c.setName("CName");
		b.getAutoContainementA().add(c);

		A grandChildA = BoemTestFactory.eINSTANCE.createA();
		grandChildA.setName("GrandChildA");
		c.getAutoContainementA().add(grandChildA);

		assertEquals("AName", a.getName());
		assertEquals(3, a.getChildrenNodeA().size());
		assertEquals("SingleChildNode", a.getChildNodeA().getName());
		assertEquals("ANodeName0", a.getChildrenNodeA().get(0).getName());
		assertEquals("ANodeName1", a.getChildrenNodeA().get(1).getName());
		assertEquals("ANodeName2", a.getChildrenNodeA().get(2).getName());
		assertEquals("ANodeName2", a.getReferenceNodeA().getName());

		assertEquals("BName", b.getName());
		assertEquals("CName", c.getName());
		assertEquals("GrandChildA", grandChildA.getName());

	}

}
