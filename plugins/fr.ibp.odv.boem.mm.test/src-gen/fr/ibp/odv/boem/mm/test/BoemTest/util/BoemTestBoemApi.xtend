/*******************************************************************************
 * Copyright (c) 2016 OBEO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *    Jacob Geisel - extending Documentation
 *******************************************************************************/
package fr.ibp.odv.boem.mm.test.BoemTest.util

import fr.ibp.odv.boem.mm.test.BoemTest.A
import fr.ibp.odv.boem.mm.test.BoemTest.B
import fr.ibp.odv.boem.mm.test.BoemTest.C
import fr.ibp.odv.boem.mm.test.BoemTest.Node
import fr.ibp.odv.boem.mm.test.BoemTest.BNode
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestFactory
import org.eclipse.emf.ecore.EObject
import java.util.Map
import java.util.function.Supplier

class BoemTestBoemApi {
	/**
	 * Contains all the rules to create an instance of EObject from its class for the Boem Test Metamodel
	 */
	public static val Map<Class<? extends EObject>, Supplier<? extends EObject>> CREATION_RULES = newHashMap(
		A -> [|BoemTestFactory.eINSTANCE.createA],
		B -> [|BoemTestFactory.eINSTANCE.createB],
		C -> [|BoemTestFactory.eINSTANCE.createC],
		Node -> [|BoemTestFactory.eINSTANCE.createNode],
		BNode -> [|BoemTestFactory.eINSTANCE.createBNode]
	)
}
