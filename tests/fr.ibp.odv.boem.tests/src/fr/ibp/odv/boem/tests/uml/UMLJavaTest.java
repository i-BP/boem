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
package fr.ibp.odv.boem.tests.uml;

import static org.junit.Assert.assertEquals;

import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Test;

public class UMLJavaTest {

	@Test
	public void longTest() {

		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName("myUmlModel");

		Interface it1 = UMLFactory.eINSTANCE.createInterface();
		it1.setName("it1");
		model.getPackagedElements().add(it1);

		Interface it2 = UMLFactory.eINSTANCE.createInterface();
		it2.setName("it2");
		model.getPackagedElements().add(it2);

		Generalization gen = UMLFactory.eINSTANCE.createGeneralization();
		gen.setGeneral(it2);
		it2.getGeneralizations().add(gen);

		Interface it3 = UMLFactory.eINSTANCE.createInterface();
		it3.setName("it3");
		model.getPackagedElements().add(it3);
		gen.setGeneral(it3);

		Operation op = UMLFactory.eINSTANCE.createOperation();
		op.setName("op1");
		it3.getOwnedOperations().add(op);

		Parameter parameter = UMLFactory.eINSTANCE.createParameter();
		parameter.setName("par1");
		parameter.setDirection(ParameterDirectionKind.RETURN_LITERAL);
		parameter.setType(it1);
		op.getOwnedParameters().add(parameter);

		assertEquals(1, it2.getAllOperations().size());
	}

}
