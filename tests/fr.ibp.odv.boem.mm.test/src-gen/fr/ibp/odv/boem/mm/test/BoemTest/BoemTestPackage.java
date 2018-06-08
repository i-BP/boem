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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestFactory
 * @model kind="package"
 * @generated
 */
public interface BoemTestPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "BoemTest";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://fr.ibp.odv/BoemTest";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "BoemTest";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	BoemTestPackage eINSTANCE = fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl.init();

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.NamedElementImpl <em>Named
	 * Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.NamedElementImpl
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children Node A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__CHILDREN_NODE_A = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children Node2 A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__CHILDREN_NODE2_A = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Node A</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__CHILD_NODE_A = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>References Node A</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__REFERENCES_NODE_A = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Node A</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__REFERENCE_NODE_A = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auto Containement A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A__AUTO_CONTAINEMENT_A = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>A</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>A</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getB()
	 * @generated
	 */
	int B = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__NAME = A__NAME;

	/**
	 * The feature id for the '<em><b>Children Node A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__CHILDREN_NODE_A = A__CHILDREN_NODE_A;

	/**
	 * The feature id for the '<em><b>Children Node2 A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__CHILDREN_NODE2_A = A__CHILDREN_NODE2_A;

	/**
	 * The feature id for the '<em><b>Child Node A</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__CHILD_NODE_A = A__CHILD_NODE_A;

	/**
	 * The feature id for the '<em><b>References Node A</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__REFERENCES_NODE_A = A__REFERENCES_NODE_A;

	/**
	 * The feature id for the '<em><b>Reference Node A</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__REFERENCE_NODE_A = A__REFERENCE_NODE_A;

	/**
	 * The feature id for the '<em><b>Auto Containement A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__AUTO_CONTAINEMENT_A = A__AUTO_CONTAINEMENT_A;

	/**
	 * The feature id for the '<em><b>Children Node B</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__CHILDREN_NODE_B = A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Node B</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__CHILD_NODE_B = A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum Attr</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__ENUM_ATTR = A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children Node BNode</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B__CHILDREN_NODE_BNODE = A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>B</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>B</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getC()
	 * @generated
	 */
	int C = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__NAME = B__NAME;

	/**
	 * The feature id for the '<em><b>Children Node A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILDREN_NODE_A = B__CHILDREN_NODE_A;

	/**
	 * The feature id for the '<em><b>Children Node2 A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILDREN_NODE2_A = B__CHILDREN_NODE2_A;

	/**
	 * The feature id for the '<em><b>Child Node A</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILD_NODE_A = B__CHILD_NODE_A;

	/**
	 * The feature id for the '<em><b>References Node A</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__REFERENCES_NODE_A = B__REFERENCES_NODE_A;

	/**
	 * The feature id for the '<em><b>Reference Node A</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__REFERENCE_NODE_A = B__REFERENCE_NODE_A;

	/**
	 * The feature id for the '<em><b>Auto Containement A</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__AUTO_CONTAINEMENT_A = B__AUTO_CONTAINEMENT_A;

	/**
	 * The feature id for the '<em><b>Children Node B</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILDREN_NODE_B = B__CHILDREN_NODE_B;

	/**
	 * The feature id for the '<em><b>Child Node B</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILD_NODE_B = B__CHILD_NODE_B;

	/**
	 * The feature id for the '<em><b>Enum Attr</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__ENUM_ATTR = B__ENUM_ATTR;

	/**
	 * The feature id for the '<em><b>Children Node BNode</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILDREN_NODE_BNODE = B__CHILDREN_NODE_BNODE;

	/**
	 * The feature id for the '<em><b>Children Node C</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILDREN_NODE_C = B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Node C</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__CHILD_NODE_C = B_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>References Node C</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__REFERENCES_NODE_C = B_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Node C</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C__REFERENCE_NODE_C = B_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = B_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.NodeImpl <em>Node</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.NodeImpl
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BNodeImpl <em>BNode</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BNodeImpl
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getBNode()
	 * @generated
	 */
	int BNODE = 4;

	/**
	 * The number of structural features of the '<em>BNode</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BNODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BNode</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BNODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration <em>An
	 * Enumeration</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getAnEnumeration()
	 * @generated
	 */
	int AN_ENUMERATION = 6;

	/**
	 * Returns the meta object for class
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A <em>A</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildrenNodeA <em>Children
	 * Node A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children
	 *         Node A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A#getChildrenNodeA()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_ChildrenNodeA();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildrenNode2A <em>Children
	 * Node2 A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children
	 *         Node2 A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A#getChildrenNode2A()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_ChildrenNode2A();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getChildNodeA <em>Child Node
	 * A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Child Node
	 *         A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A#getChildNodeA()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_ChildNodeA();

	/**
	 * Returns the meta object for the reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getReferencesNodeA
	 * <em>References Node A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference list '<em>References Node
	 *         A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A#getReferencesNodeA()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_ReferencesNodeA();

	/**
	 * Returns the meta object for the reference
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getReferenceNodeA
	 * <em>Reference Node A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Reference Node A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A#getReferenceNodeA()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_ReferenceNodeA();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.A#getAutoContainementA <em>Auto
	 * Containement A</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Auto
	 *         Containement A</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.A#getAutoContainementA()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_AutoContainementA();

	/**
	 * Returns the meta object for class
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B <em>B</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>B</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeB <em>Children
	 * Node B</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children
	 *         Node B</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeB()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_ChildrenNodeB();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildNodeB <em>Child Node
	 * B</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Child Node
	 *         B</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.B#getChildNodeB()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_ChildNodeB();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getEnumAttr <em>Enum
	 * Attr</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Enum Attr</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.B#getEnumAttr()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_EnumAttr();

	/**
	 * Returns the meta object for the reference
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeBNode
	 * <em>Children Node BNode</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Children Node BNode</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.B#getChildrenNodeBNode()
	 * @see #getB()
	 * @generated
	 */
	EReference getB_ChildrenNodeBNode();

	/**
	 * Returns the meta object for class
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C <em>C</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>C</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.C
	 * @generated
	 */
	EClass getC();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getChildrenNodeC <em>Children
	 * Node C</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Children
	 *         Node C</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.C#getChildrenNodeC()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_ChildrenNodeC();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getChildNodeC <em>Child Node
	 * C</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Child Node
	 *         C</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.C#getChildNodeC()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_ChildNodeC();

	/**
	 * Returns the meta object for the reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getReferencesNodeC
	 * <em>References Node C</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference list '<em>References Node
	 *         C</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.C#getReferencesNodeC()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_ReferencesNodeC();

	/**
	 * Returns the meta object for the reference
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.C#getReferenceNodeC
	 * <em>Reference Node C</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Reference Node C</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.C#getReferenceNodeC()
	 * @see #getC()
	 * @generated
	 */
	EReference getC_ReferenceNodeC();

	/**
	 * Returns the meta object for class
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.Node <em>Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.Node#getChildren
	 * <em>Children</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Children</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for class
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.BNode <em>BNode</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>BNode</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BNode
	 * @generated
	 */
	EClass getBNode();

	/**
	 * Returns the meta object for class
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.NamedElement <em>Named
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum
	 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration <em>An
	 * Enumeration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>An Enumeration</em>'.
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration
	 * @generated
	 */
	EEnum getAnEnumeration();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoemTestFactory getBoemTestFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl <em>A</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Children Node A</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference A__CHILDREN_NODE_A = eINSTANCE.getA_ChildrenNodeA();

		/**
		 * The meta object literal for the '<em><b>Children Node2 A</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference A__CHILDREN_NODE2_A = eINSTANCE.getA_ChildrenNode2A();

		/**
		 * The meta object literal for the '<em><b>Child Node A</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference A__CHILD_NODE_A = eINSTANCE.getA_ChildNodeA();

		/**
		 * The meta object literal for the '<em><b>References Node A</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference A__REFERENCES_NODE_A = eINSTANCE.getA_ReferencesNodeA();

		/**
		 * The meta object literal for the '<em><b>Reference Node A</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference A__REFERENCE_NODE_A = eINSTANCE.getA_ReferenceNodeA();

		/**
		 * The meta object literal for the '<em><b>Auto Containement A</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference A__AUTO_CONTAINEMENT_A = eINSTANCE.getA_AutoContainementA();

		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl <em>B</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Children Node B</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference B__CHILDREN_NODE_B = eINSTANCE.getB_ChildrenNodeB();

		/**
		 * The meta object literal for the '<em><b>Child Node B</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference B__CHILD_NODE_B = eINSTANCE.getB_ChildNodeB();

		/**
		 * The meta object literal for the '<em><b>Enum Attr</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute B__ENUM_ATTR = eINSTANCE.getB_EnumAttr();

		/**
		 * The meta object literal for the '<em><b>Children Node BNode</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference B__CHILDREN_NODE_BNODE = eINSTANCE.getB_ChildrenNodeBNode();

		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl <em>C</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getC()
		 * @generated
		 */
		EClass C = eINSTANCE.getC();

		/**
		 * The meta object literal for the '<em><b>Children Node C</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference C__CHILDREN_NODE_C = eINSTANCE.getC_ChildrenNodeC();

		/**
		 * The meta object literal for the '<em><b>Child Node C</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference C__CHILD_NODE_C = eINSTANCE.getC_ChildNodeC();

		/**
		 * The meta object literal for the '<em><b>References Node C</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference C__REFERENCES_NODE_C = eINSTANCE.getC_ReferencesNodeC();

		/**
		 * The meta object literal for the '<em><b>Reference Node C</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference C__REFERENCE_NODE_C = eINSTANCE.getC_ReferenceNodeC();

		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.NodeImpl
		 * <em>Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.NodeImpl
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BNodeImpl
		 * <em>BNode</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BNodeImpl
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getBNode()
		 * @generated
		 */
		EClass BNODE = eINSTANCE.getBNode();

		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.NamedElementImpl
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the
		 * '{@link fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration <em>An
		 * Enumeration</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration
		 * @see fr.ibp.odv.boem.mm.test.BoemTest.impl.BoemTestPackageImpl#getAnEnumeration()
		 * @generated
		 */
		EEnum AN_ENUMERATION = eINSTANCE.getAnEnumeration();

	}

} // BoemTestPackage
