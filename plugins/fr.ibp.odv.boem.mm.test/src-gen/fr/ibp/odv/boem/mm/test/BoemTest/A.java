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
 * '<em><b>A</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildrenNodeA <em>Children
 * Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildrenNode2A <em>Children
 * Node2 A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildNodeA <em>Child Node
 * A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getReferencesNodeA
 * <em>References Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getReferenceNodeA <em>Reference
 * Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getAutoContainementA <em>Auto
 * Containement A</em>}</li>
 * </ul>
 *
 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA()
 * @model
 * @generated
 */
public interface A extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Children Node A</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Node A</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children Node A</em>' containment reference
	 *         list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA_ChildrenNodeA()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildrenNodeA();

	/**
	 * Returns the value of the '<em><b>Children Node2 A</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Node2 A</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children Node2 A</em>' containment
	 *         reference list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA_ChildrenNode2A()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildrenNode2A();

	/**
	 * Returns the value of the '<em><b>Child Node A</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Node A</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Child Node A</em>' containment reference.
	 * @see #setChildNodeA(Node)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA_ChildNodeA()
	 * @model containment="true"
	 * @generated
	 */
	Node getChildNodeA();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildNodeA <em>Child Node
	 * A</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Child Node A</em>' containment
	 *            reference.
	 * @see #getChildNodeA()
	 * @generated
	 */
	void setChildNodeA(Node value);

	/**
	 * Returns the value of the '<em><b>References Node A</b></em>' reference
	 * list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Node A</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>References Node A</em>' reference list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA_ReferencesNodeA()
	 * @model
	 * @generated
	 */
	EList<Node> getReferencesNodeA();

	/**
	 * Returns the value of the '<em><b>Reference Node A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Node A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference Node A</em>' reference.
	 * @see #setReferenceNodeA(Node)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA_ReferenceNodeA()
	 * @model
	 * @generated
	 */
	Node getReferenceNodeA();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getReferenceNodeA
	 * <em>Reference Node A</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Node A</em>' reference.
	 * @see #getReferenceNodeA()
	 * @generated
	 */
	void setReferenceNodeA(Node value);

	/**
	 * Returns the value of the '<em><b>Auto Containement A</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.A}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Containement A</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Auto Containement A</em>' containment
	 *         reference list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getA_AutoContainementA()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getAutoContainementA();

} // A
