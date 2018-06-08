/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *******************************************************************************/
package fr.ibp.odv.boem.tests.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.ibp.odv.boem.tests.APITestContainmentRef;
import fr.ibp.odv.boem.tests.APITestImplicitId;
import fr.ibp.odv.boem.tests.APITestRef;
import fr.ibp.odv.boem.tests.APITestUpdate;
import fr.ibp.odv.boem.tests.uml.UMLTestSuite;

/**
 * Test suite gathering all test of this plugin
 * 
 * @author Arthur Daussy
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ //
		APITestContainmentRef.class, //
		APITestImplicitId.class, //
		APITestRef.class, //
		APITestUpdate.class, //
		UMLTestSuite.class//
})
public class AllTestsSuite {

}
