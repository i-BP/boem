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
 * '<em><b>B</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeB <em>Children
 * Node B</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildNodeB <em>Child Node
 * B</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getEnumAttr <em>Enum
 * Attr</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeBNode
 * <em>Children Node BNode</em>}</li>
 * </ul>
 *
 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getB()
 * @model
 * @generated
 */
public interface B extends A {
	/**
	 * Returns the value of the '<em><b>Children Node B</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Node B</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children Node B</em>' containment reference
	 *         list.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getB_ChildrenNodeB()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildrenNodeB();

	/**
	 * Returns the value of the '<em><b>Child Node B</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Node B</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Child Node B</em>' containment reference.
	 * @see #setChildNodeB(Node)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getB_ChildNodeB()
	 * @model containment="true"
	 * @generated
	 */
	Node getChildNodeB();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildNodeB <em>Child Node
	 * B</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Child Node B</em>' containment
	 *            reference.
	 * @see #getChildNodeB()
	 * @generated
	 */
	void setChildNodeB(Node value);

	/**
	 * Returns the value of the '<em><b>Enum Attr</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Attr</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enum Attr</em>' attribute.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration
	 * @see #setEnumAttr(AnEnumeration)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getB_EnumAttr()
	 * @model
	 * @generated
	 */
	AnEnumeration getEnumAttr();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getEnumAttr <em>Enum
	 * Attr</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Enum Attr</em>' attribute.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration
	 * @see #getEnumAttr()
	 * @generated
	 */
	void setEnumAttr(AnEnumeration value);

	/**
	 * Returns the value of the '<em><b>Children Node BNode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Node BNode</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children Node BNode</em>' reference.
	 * @see #setChildrenNodeBNode(BNode)
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#getB_ChildrenNodeBNode()
	 * @model
	 * @generated
	 */
	BNode getChildrenNodeBNode();

	/**
	 * Sets the value of the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeBNode
	 * <em>Children Node BNode</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Children Node BNode</em>' reference.
	 * @see #getChildrenNodeBNode()
	 * @generated
	 */
	void setChildrenNodeBNode(BNode value);

} // B
