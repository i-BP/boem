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
package fr.ibp.odv.boem.mm.test.BoemTest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration;
import fr.ibp.odv.boem.mm.test.BoemTest.BNode;
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestFactory;
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage;
import fr.ibp.odv.boem.mm.test.BoemTest.NamedElement;
import fr.ibp.odv.boem.mm.test.BoemTest.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class BoemTestPackageImpl extends EPackageImpl implements BoemTestPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum anEnumerationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BoemTestPackageImpl() {
		super(eNS_URI, BoemTestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link BoemTestPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BoemTestPackage init() {
		if (isInited)
			return (BoemTestPackage) EPackage.Registry.INSTANCE.getEPackage(BoemTestPackage.eNS_URI);

		// Obtain or create and register package
		BoemTestPackageImpl theBoemTestPackage = (BoemTestPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BoemTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new BoemTestPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBoemTestPackage.createPackageContents();

		// Initialize created meta-data
		theBoemTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBoemTestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BoemTestPackage.eNS_URI, theBoemTestPackage);
		return theBoemTestPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getA_ChildrenNodeA() {
		return (EReference) aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getA_ChildrenNode2A() {
		return (EReference) aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getA_ChildNodeA() {
		return (EReference) aEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getA_ReferencesNodeA() {
		return (EReference) aEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getA_ReferenceNodeA() {
		return (EReference) aEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getA_AutoContainementA() {
		return (EReference) aEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getB() {
		return bEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getB_ChildrenNodeB() {
		return (EReference) bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getB_ChildNodeB() {
		return (EReference) bEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getB_EnumAttr() {
		return (EAttribute) bEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getB_ChildrenNodeBNode() {
		return (EReference) bEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getC() {
		return cEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getC_ChildrenNodeC() {
		return (EReference) cEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getC_ChildNodeC() {
		return (EReference) cEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getC_ReferencesNodeC() {
		return (EReference) cEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getC_ReferenceNodeC() {
		return (EReference) cEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getNode_Children() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBNode() {
		return bNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getAnEnumeration() {
		return anEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BoemTestFactory getBoemTestFactory() {
		return (BoemTestFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		aEClass = createEClass(A);
		createEReference(aEClass, A__CHILDREN_NODE_A);
		createEReference(aEClass, A__CHILDREN_NODE2_A);
		createEReference(aEClass, A__CHILD_NODE_A);
		createEReference(aEClass, A__REFERENCES_NODE_A);
		createEReference(aEClass, A__REFERENCE_NODE_A);
		createEReference(aEClass, A__AUTO_CONTAINEMENT_A);

		bEClass = createEClass(B);
		createEReference(bEClass, B__CHILDREN_NODE_B);
		createEReference(bEClass, B__CHILD_NODE_B);
		createEAttribute(bEClass, B__ENUM_ATTR);
		createEReference(bEClass, B__CHILDREN_NODE_BNODE);

		cEClass = createEClass(C);
		createEReference(cEClass, C__CHILDREN_NODE_C);
		createEReference(cEClass, C__CHILD_NODE_C);
		createEReference(cEClass, C__REFERENCES_NODE_C);
		createEReference(cEClass, C__REFERENCE_NODE_C);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__CHILDREN);

		bNodeEClass = createEClass(BNODE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		anEnumerationEEnum = createEEnum(AN_ENUMERATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aEClass.getESuperTypes().add(this.getNamedElement());
		bEClass.getESuperTypes().add(this.getA());
		cEClass.getESuperTypes().add(this.getB());
		nodeEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(aEClass, fr.ibp.odv.boem.mm.test.BoemTest.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA_ChildrenNodeA(), this.getNode(), null, "childrenNodeA", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_ChildrenNode2A(), this.getNode(), null, "childrenNode2A", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_ChildNodeA(), this.getNode(), null, "childNodeA", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_ReferencesNodeA(), this.getNode(), null, "referencesNodeA", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_ReferenceNodeA(), this.getNode(), null, "referenceNodeA", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_AutoContainementA(), this.getA(), null, "autoContainementA", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bEClass, fr.ibp.odv.boem.mm.test.BoemTest.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getB_ChildrenNodeB(), this.getNode(), null, "childrenNodeB", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getB_ChildNodeB(), this.getNode(), null, "childNodeB", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getB_EnumAttr(), this.getAnEnumeration(), "enumAttr", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getB_ChildrenNodeBNode(), this.getBNode(), null, "childrenNodeBNode", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEClass, fr.ibp.odv.boem.mm.test.BoemTest.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getC_ChildrenNodeC(), this.getNode(), null, "childrenNodeC", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_ChildNodeC(), this.getNode(), null, "childNodeC", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_ReferencesNodeC(), this.getNode(), null, "referencesNodeC", null, 0, -1,
				fr.ibp.odv.boem.mm.test.BoemTest.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC_ReferenceNodeC(), this.getNode(), null, "referenceNodeC", null, 0, 1,
				fr.ibp.odv.boem.mm.test.BoemTest.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Children(), this.getNode(), null, "children", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(bNodeEClass, BNode.class, "BNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(anEnumerationEEnum, AnEnumeration.class, "AnEnumeration");
		addEEnumLiteral(anEnumerationEEnum, AnEnumeration.LITERAL0);
		addEEnumLiteral(anEnumerationEEnum, AnEnumeration.LITERAL1);
		addEEnumLiteral(anEnumerationEEnum, AnEnumeration.LITERAL2);

		// Create resource
		createResource(eNS_URI);
	}

} // BoemTestPackageImpl
