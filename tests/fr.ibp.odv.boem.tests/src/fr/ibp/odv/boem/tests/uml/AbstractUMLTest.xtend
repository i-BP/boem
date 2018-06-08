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

import org.junit.Before
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl

@SuppressWarnings("restriction")
class AbstractUMLTest {

	protected var ResourceSet rs;

	@Before
	@SuppressWarnings("restriction")
	def void setup() {
		rs = new ResourceSetImpl
		rs.packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("uml", new UMLResourceFactoryImpl)
	}

	protected def getResourceSet() {
		return rs;
	}

}
