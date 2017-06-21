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

import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage;
import fr.ibp.odv.boem.mm.test.BoemTest.C;
import fr.ibp.odv.boem.mm.test.BoemTest.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>C</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl#getChildrenNodeC
 * <em>Children Node C</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl#getChildNodeC
 * <em>Child Node C</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl#getReferencesNodeC
 * <em>References Node C</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.CImpl#getReferenceNodeC
 * <em>Reference Node C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CImpl extends BImpl implements C {
	/**
	 * The cached value of the '{@link #getChildrenNodeC() <em>Children Node
	 * C</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getChildrenNodeC()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> childrenNodeC;

	/**
	 * The cached value of the '{@link #getChildNodeC() <em>Child Node C</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChildNodeC()
	 * @generated
	 * @ordered
	 */
	protected Node childNodeC;

	/**
	 * The cached value of the '{@link #getReferencesNodeC() <em>References Node
	 * C</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferencesNodeC()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> referencesNodeC;

	/**
	 * The cached value of the '{@link #getReferenceNodeC() <em>Reference Node
	 * C</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferenceNodeC()
	 * @generated
	 * @ordered
	 */
	protected Node referenceNodeC;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoemTestPackage.Literals.C;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Node> getChildrenNodeC() {
		if (childrenNodeC == null) {
			childrenNodeC = new EObjectContainmentEList<Node>(Node.class, this, BoemTestPackage.C__CHILDREN_NODE_C);
		}
		return childrenNodeC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Node getChildNodeC() {
		return childNodeC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChildNodeC(Node newChildNodeC, NotificationChain msgs) {
		Node oldChildNodeC = childNodeC;
		childNodeC = newChildNodeC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BoemTestPackage.C__CHILD_NODE_C, oldChildNodeC, newChildNodeC);
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
	public void setChildNodeC(Node newChildNodeC) {
		if (newChildNodeC != childNodeC) {
			NotificationChain msgs = null;
			if (childNodeC != null)
				msgs = ((InternalEObject) childNodeC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BoemTestPackage.C__CHILD_NODE_C, null, msgs);
			if (newChildNodeC != null)
				msgs = ((InternalEObject) newChildNodeC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BoemTestPackage.C__CHILD_NODE_C, null, msgs);
			msgs = basicSetChildNodeC(newChildNodeC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.C__CHILD_NODE_C, newChildNodeC,
					newChildNodeC));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Node> getReferencesNodeC() {
		if (referencesNodeC == null) {
			referencesNodeC = new EObjectResolvingEList<Node>(Node.class, this, BoemTestPackage.C__REFERENCES_NODE_C);
		}
		return referencesNodeC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Node getReferenceNodeC() {
		if (referenceNodeC != null && referenceNodeC.eIsProxy()) {
			InternalEObject oldReferenceNodeC = (InternalEObject) referenceNodeC;
			referenceNodeC = (Node) eResolveProxy(oldReferenceNodeC);
			if (referenceNodeC != oldReferenceNodeC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoemTestPackage.C__REFERENCE_NODE_C,
							oldReferenceNodeC, referenceNodeC));
			}
		}
		return referenceNodeC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetReferenceNodeC() {
		return referenceNodeC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReferenceNodeC(Node newReferenceNodeC) {
		Node oldReferenceNodeC = referenceNodeC;
		referenceNodeC = newReferenceNodeC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.C__REFERENCE_NODE_C,
					oldReferenceNodeC, referenceNodeC));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BoemTestPackage.C__CHILDREN_NODE_C:
			return ((InternalEList<?>) getChildrenNodeC()).basicRemove(otherEnd, msgs);
		case BoemTestPackage.C__CHILD_NODE_C:
			return basicSetChildNodeC(null, msgs);
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
		case BoemTestPackage.C__CHILDREN_NODE_C:
			return getChildrenNodeC();
		case BoemTestPackage.C__CHILD_NODE_C:
			return getChildNodeC();
		case BoemTestPackage.C__REFERENCES_NODE_C:
			return getReferencesNodeC();
		case BoemTestPackage.C__REFERENCE_NODE_C:
			if (resolve)
				return getReferenceNodeC();
			return basicGetReferenceNodeC();
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
		case BoemTestPackage.C__CHILDREN_NODE_C:
			getChildrenNodeC().clear();
			getChildrenNodeC().addAll((Collection<? extends Node>) newValue);
			return;
		case BoemTestPackage.C__CHILD_NODE_C:
			setChildNodeC((Node) newValue);
			return;
		case BoemTestPackage.C__REFERENCES_NODE_C:
			getReferencesNodeC().clear();
			getReferencesNodeC().addAll((Collection<? extends Node>) newValue);
			return;
		case BoemTestPackage.C__REFERENCE_NODE_C:
			setReferenceNodeC((Node) newValue);
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
		case BoemTestPackage.C__CHILDREN_NODE_C:
			getChildrenNodeC().clear();
			return;
		case BoemTestPackage.C__CHILD_NODE_C:
			setChildNodeC((Node) null);
			return;
		case BoemTestPackage.C__REFERENCES_NODE_C:
			getReferencesNodeC().clear();
			return;
		case BoemTestPackage.C__REFERENCE_NODE_C:
			setReferenceNodeC((Node) null);
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
		case BoemTestPackage.C__CHILDREN_NODE_C:
			return childrenNodeC != null && !childrenNodeC.isEmpty();
		case BoemTestPackage.C__CHILD_NODE_C:
			return childNodeC != null;
		case BoemTestPackage.C__REFERENCES_NODE_C:
			return referencesNodeC != null && !referencesNodeC.isEmpty();
		case BoemTestPackage.C__REFERENCE_NODE_C:
			return referenceNodeC != null;
		}
		return super.eIsSet(featureID);
	}

} // CImpl
