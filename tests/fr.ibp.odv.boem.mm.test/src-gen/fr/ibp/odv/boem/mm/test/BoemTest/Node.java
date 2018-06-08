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
package fr.ibp.odv.boem.mm.test.BoemTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.Node#getChildren
 * <em>Children</em>}</li>
 * </ul>
 *
 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildren();
} // Node
