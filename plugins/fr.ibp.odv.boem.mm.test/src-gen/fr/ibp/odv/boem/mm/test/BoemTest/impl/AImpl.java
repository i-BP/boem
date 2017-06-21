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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.ibp.odv.boem.mm.test.BoemTest.A;
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage;
import fr.ibp.odv.boem.mm.test.BoemTest.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>A</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl#getChildrenNodeA
 * <em>Children Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl#getChildrenNode2A
 * <em>Children Node2 A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl#getChildNodeA
 * <em>Child Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl#getReferencesNodeA
 * <em>References Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl#getReferenceNodeA
 * <em>Reference Node A</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.AImpl#getAutoContainementA
 * <em>Auto Containement A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AImpl extends NamedElementImpl implements A {
	/**
	 * The cached value of the '{@link #getChildrenNodeA() <em>Children Node
	 * A</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getChildrenNodeA()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> childrenNodeA;

	/**
	 * The cached value of the '{@link #getChildrenNode2A() <em>Children Node2
	 * A</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getChildrenNode2A()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> childrenNode2A;

	/**
	 * The cached value of the '{@link #getChildNodeA() <em>Child Node A</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChildNodeA()
	 * @generated
	 * @ordered
	 */
	protected Node childNodeA;

	/**
	 * The cached value of the '{@link #getReferencesNodeA() <em>References Node
	 * A</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferencesNodeA()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> referencesNodeA;

	/**
	 * The cached value of the '{@link #getReferenceNodeA() <em>Reference Node
	 * A</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferenceNodeA()
	 * @generated
	 * @ordered
	 */
	protected Node referenceNodeA;

	/**
	 * The cached value of the '{@link #getAutoContainementA() <em>Auto
	 * Containement A</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAutoContainementA()
	 * @generated
	 * @ordered
	 */
	protected EList<A> autoContainementA;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoemTestPackage.Literals.A;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Node> getChildrenNodeA() {
		if (childrenNodeA == null) {
			childrenNodeA = new EObjectContainmentEList<Node>(Node.class, this, BoemTestPackage.A__CHILDREN_NODE_A);
		}
		return childrenNodeA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Node> getChildrenNode2A() {
		if (childrenNode2A == null) {
			childrenNode2A = new EObjectContainmentEList<Node>(Node.class, this, BoemTestPackage.A__CHILDREN_NODE2_A);
		}
		return childrenNode2A;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Node getChildNodeA() {
		return childNodeA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChildNodeA(Node newChildNodeA, NotificationChain msgs) {
		Node oldChildNodeA = childNodeA;
		childNodeA = newChildNodeA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BoemTestPackage.A__CHILD_NODE_A, oldChildNodeA, newChildNodeA);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setChildNodeA(Node newChildNodeA) {
		if (newChildNodeA != childNodeA) {
			NotificationChain msgs = null;
			if (childNodeA != null)
				msgs = ((InternalEObject) childNodeA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BoemTestPackage.A__CHILD_NODE_A, null, msgs);
			if (newChildNodeA != null)
				msgs = ((InternalEObject) newChildNodeA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BoemTestPackage.A__CHILD_NODE_A, null, msgs);
			msgs = basicSetChildNodeA(newChildNodeA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.A__CHILD_NODE_A, newChildNodeA,
					newChildNodeA));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Node> getReferencesNodeA() {
		if (referencesNodeA == null) {
			referencesNodeA = new EObjectResolvingEList<Node>(Node.class, this, BoemTestPackage.A__REFERENCES_NODE_A);
		}
		return referencesNodeA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Node getReferenceNodeA() {
		if (referenceNodeA != null && referenceNodeA.eIsProxy()) {
			InternalEObject oldReferenceNodeA = (InternalEObject) referenceNodeA;
			referenceNodeA = (Node) eResolveProxy(oldReferenceNodeA);
			if (referenceNodeA != oldReferenceNodeA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoemTestPackage.A__REFERENCE_NODE_A,
							oldReferenceNodeA, referenceNodeA));
			}
		}
		return referenceNodeA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetReferenceNodeA() {
		return referenceNodeA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReferenceNodeA(Node newReferenceNodeA) {
		Node oldReferenceNodeA = referenceNodeA;
		referenceNodeA = newReferenceNodeA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.A__REFERENCE_NODE_A,
					oldReferenceNodeA, referenceNodeA));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<A> getAutoContainementA() {
		if (autoContainementA == null) {
			autoContainementA = new EObjectContainmentEList<A>(A.class, this, BoemTestPackage.A__AUTO_CONTAINEMENT_A);
		}
		return autoContainementA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BoemTestPackage.A__CHILDREN_NODE_A:
			return ((InternalEList<?>) getChildrenNodeA()).basicRemove(otherEnd, msgs);
		case BoemTestPackage.A__CHILDREN_NODE2_A:
			return ((InternalEList<?>) getChildrenNode2A()).basicRemove(otherEnd, msgs);
		case BoemTestPackage.A__CHILD_NODE_A:
			return basicSetChildNodeA(null, msgs);
		case BoemTestPackage.A__AUTO_CONTAINEMENT_A:
			return ((InternalEList<?>) getAutoContainementA()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BoemTestPackage.A__CHILDREN_NODE_A:
			return getChildrenNodeA();
		case BoemTestPackage.A__CHILDREN_NODE2_A:
			return getChildrenNode2A();
		case BoemTestPackage.A__CHILD_NODE_A:
			return getChildNodeA();
		case BoemTestPackage.A__REFERENCES_NODE_A:
			return getReferencesNodeA();
		case BoemTestPackage.A__REFERENCE_NODE_A:
			if (resolve)
				return getReferenceNodeA();
			return basicGetReferenceNodeA();
		case BoemTestPackage.A__AUTO_CONTAINEMENT_A:
			return getAutoContainementA();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BoemTestPackage.A__CHILDREN_NODE_A:
			getChildrenNodeA().clear();
			getChildrenNodeA().addAll((Collection<? extends Node>) newValue);
			return;
		case BoemTestPackage.A__CHILDREN_NODE2_A:
			getChildrenNode2A().clear();
			getChildrenNode2A().addAll((Collection<? extends Node>) newValue);
			return;
		case BoemTestPackage.A__CHILD_NODE_A:
			setChildNodeA((Node) newValue);
			return;
		case BoemTestPackage.A__REFERENCES_NODE_A:
			getReferencesNodeA().clear();
			getReferencesNodeA().addAll((Collection<? extends Node>) newValue);
			return;
		case BoemTestPackage.A__REFERENCE_NODE_A:
			setReferenceNodeA((Node) newValue);
			return;
		case BoemTestPackage.A__AUTO_CONTAINEMENT_A:
			getAutoContainementA().clear();
			getAutoContainementA().addAll((Collection<? extends A>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BoemTestPackage.A__CHILDREN_NODE_A:
			getChildrenNodeA().clear();
			return;
		case BoemTestPackage.A__CHILDREN_NODE2_A:
			getChildrenNode2A().clear();
			return;
		case BoemTestPackage.A__CHILD_NODE_A:
			setChildNodeA((Node) null);
			return;
		case BoemTestPackage.A__REFERENCES_NODE_A:
			getReferencesNodeA().clear();
			return;
		case BoemTestPackage.A__REFERENCE_NODE_A:
			setReferenceNodeA((Node) null);
			return;
		case BoemTestPackage.A__AUTO_CONTAINEMENT_A:
			getAutoContainementA().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BoemTestPackage.A__CHILDREN_NODE_A:
			return childrenNodeA != null && !childrenNodeA.isEmpty();
		case BoemTestPackage.A__CHILDREN_NODE2_A:
			return childrenNode2A != null && !childrenNode2A.isEmpty();
		case BoemTestPackage.A__CHILD_NODE_A:
			return childNodeA != null;
		case BoemTestPackage.A__REFERENCES_NODE_A:
			return referencesNodeA != null && !referencesNodeA.isEmpty();
		case BoemTestPackage.A__REFERENCE_NODE_A:
			return referenceNodeA != null;
		case BoemTestPackage.A__AUTO_CONTAINEMENT_A:
			return autoContainementA != null && !autoContainementA.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AImpl
