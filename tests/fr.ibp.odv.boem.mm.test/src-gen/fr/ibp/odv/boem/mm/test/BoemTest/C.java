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
 * '<em><b>C</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getChildrenNodeC <em>Children
 * Node C</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getChildNodeC <em>Child Node
 * C</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getReferencesNodeC
 * <em>References Node C</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getReferenceNodeC <em>Reference
 * Node C</em>}</li>
 * </ul>
 *
 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getC()
 * @model
 * @generated
 */
public interface C extends B {
	/**
	 * Returns the value of the '<em><b>Children Node C</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Node C</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children Node C</em>' containment reference
	 *         list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getC_ChildrenNodeC()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildrenNodeC();

	/**
	 * Returns the value of the '<em><b>Child Node C</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Node C</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Child Node C</em>' containment reference.
	 * @see #setChildNodeC(Node)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getC_ChildNodeC()
	 * @model containment="true"
	 * @generated
	 */
	Node getChildNodeC();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getChildNodeC <em>Child Node
	 * C</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Child Node C</em>' containment
	 *            reference.
	 * @see #getChildNodeC()
	 * @generated
	 */
	void setChildNodeC(Node value);

	/**
	 * Returns the value of the '<em><b>References Node C</b></em>' reference
	 * list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Node C</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>References Node C</em>' reference list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getC_ReferencesNodeC()
	 * @model
	 * @generated
	 */
	EList<Node> getReferencesNodeC();

	/**
	 * Returns the value of the '<em><b>Reference Node C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Node C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference Node C</em>' reference.
	 * @see #setReferenceNodeC(Node)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getC_ReferenceNodeC()
	 * @model
	 * @generated
	 */
	Node getReferenceNodeC();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getReferenceNodeC
	 * <em>Reference Node C</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Node C</em>' reference.
	 * @see #getReferenceNodeC()
	 * @generated
	 */
	void setReferenceNodeC(Node value);

} // C
