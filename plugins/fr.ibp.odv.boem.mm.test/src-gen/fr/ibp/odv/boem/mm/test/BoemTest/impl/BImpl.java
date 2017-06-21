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
import org.eclipse.emf.ecore.util.InternalEList;

import fr.ibp.odv.boem.mm.test.BoemTest.AnEnumeration;
import fr.ibp.odv.boem.mm.test.BoemTest.B;
import fr.ibp.odv.boem.mm.test.BoemTest.BNode;
import fr.ibp.odv.boem.mm.test.BoemTest.BoemTestPackage;
import fr.ibp.odv.boem.mm.test.BoemTest.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>B</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl#getChildrenNodeB
 * <em>Children Node B</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl#getChildNodeB
 * <em>Child Node B</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl#getEnumAttr <em>Enum
 * Attr</em>}</li>
 * <li>{@link fr.ibp.odv.boem.mm.test.BoemTest.impl.BImpl#getChildrenNodeBNode
 * <em>Children Node BNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BImpl extends AImpl implements B {
	/**
	 * The cached value of the '{@link #getChildrenNodeB() <em>Children Node
	 * B</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getChildrenNodeB()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> childrenNodeB;

	/**
	 * The cached value of the '{@link #getChildNodeB() <em>Child Node B</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChildNodeB()
	 * @generated
	 * @ordered
	 */
	protected Node childNodeB;

	/**
	 * The default value of the '{@link #getEnumAttr() <em>Enum Attr</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnumAttr()
	 * @generated
	 * @ordered
	 */
	protected static final AnEnumeration ENUM_ATTR_EDEFAULT = AnEnumeration.LITERAL0;

	/**
	 * The cached value of the '{@link #getEnumAttr() <em>Enum Attr</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnumAttr()
	 * @generated
	 * @ordered
	 */
	protected AnEnumeration enumAttr = ENUM_ATTR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildrenNodeBNode() <em>Children Node
	 * BNode</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChildrenNodeBNode()
	 * @generated
	 * @ordered
	 */
	protected BNode childrenNodeBNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoemTestPackage.Literals.B;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Node> getChildrenNodeB() {
		if (childrenNodeB == null) {
			childrenNodeB = new EObjectContainmentEList<Node>(Node.class, this, BoemTestPackage.B__CHILDREN_NODE_B);
		}
		return childrenNodeB;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Node getChildNodeB() {
		return childNodeB;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChildNodeB(Node newChildNodeB, NotificationChain msgs) {
		Node oldChildNodeB = childNodeB;
		childNodeB = newChildNodeB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BoemTestPackage.B__CHILD_NODE_B, oldChildNodeB, newChildNodeB);
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
	public void setChildNodeB(Node newChildNodeB) {
		if (newChildNodeB != childNodeB) {
			NotificationChain msgs = null;
			if (childNodeB != null)
				msgs = ((InternalEObject) childNodeB).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BoemTestPackage.B__CHILD_NODE_B, null, msgs);
			if (newChildNodeB != null)
				msgs = ((InternalEObject) newChildNodeB).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BoemTestPackage.B__CHILD_NODE_B, null, msgs);
			msgs = basicSetChildNodeB(newChildNodeB, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.B__CHILD_NODE_B, newChildNodeB,
					newChildNodeB));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AnEnumeration getEnumAttr() {
		return enumAttr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEnumAttr(AnEnumeration newEnumAttr) {
		AnEnumeration oldEnumAttr = enumAttr;
		enumAttr = newEnumAttr == null ? ENUM_ATTR_EDEFAULT : newEnumAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.B__ENUM_ATTR, oldEnumAttr, enumAttr));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BNode getChildrenNodeBNode() {
		if (childrenNodeBNode != null && childrenNodeBNode.eIsProxy()) {
			InternalEObject oldChildrenNodeBNode = (InternalEObject) childrenNodeBNode;
			childrenNodeBNode = (BNode) eResolveProxy(oldChildrenNodeBNode);
			if (childrenNodeBNode != oldChildrenNodeBNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BoemTestPackage.B__CHILDREN_NODE_BNODE,
							oldChildrenNodeBNode, childrenNodeBNode));
			}
		}
		return childrenNodeBNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BNode basicGetChildrenNodeBNode() {
		return childrenNodeBNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setChildrenNodeBNode(BNode newChildrenNodeBNode) {
		BNode oldChildrenNodeBNode = childrenNodeBNode;
		childrenNodeBNode = newChildrenNodeBNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoemTestPackage.B__CHILDREN_NODE_BNODE,
					oldChildrenNodeBNode, childrenNodeBNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BoemTestPackage.B__CHILDREN_NODE_B:
			return ((InternalEList<?>) getChildrenNodeB()).basicRemove(otherEnd, msgs);
		case BoemTestPackage.B__CHILD_NODE_B:
			return basicSetChildNodeB(null, msgs);
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
		case BoemTestPackage.B__CHILDREN_NODE_B:
			return getChildrenNodeB();
		case BoemTestPackage.B__CHILD_NODE_B:
			return getChildNodeB();
		case BoemTestPackage.B__ENUM_ATTR:
			return getEnumAttr();
		case BoemTestPackage.B__CHILDREN_NODE_BNODE:
			if (resolve)
				return getChildrenNodeBNode();
			return basicGetChildrenNodeBNode();
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
		case BoemTestPackage.B__CHILDREN_NODE_B:
			getChildrenNodeB().clear();
			getChildrenNodeB().addAll((Collection<? extends Node>) newValue);
			return;
		case BoemTestPackage.B__CHILD_NODE_B:
			setChildNodeB((Node) newValue);
			return;
		case BoemTestPackage.B__ENUM_ATTR:
			setEnumAttr((AnEnumeration) newValue);
			return;
		case BoemTestPackage.B__CHILDREN_NODE_BNODE:
			setChildrenNodeBNode((BNode) newValue);
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
		case BoemTestPackage.B__CHILDREN_NODE_B:
			getChildrenNodeB().clear();
			return;
		case BoemTestPackage.B__CHILD_NODE_B:
			setChildNodeB((Node) null);
			return;
		case BoemTestPackage.B__ENUM_ATTR:
			setEnumAttr(ENUM_ATTR_EDEFAULT);
			return;
		case BoemTestPackage.B__CHILDREN_NODE_BNODE:
			setChildrenNodeBNode((BNode) null);
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
		case BoemTestPackage.B__CHILDREN_NODE_B:
			return childrenNodeB != null && !childrenNodeB.isEmpty();
		case BoemTestPackage.B__CHILD_NODE_B:
			return childNodeB != null;
		case BoemTestPackage.B__ENUM_ATTR:
			return enumAttr != ENUM_ATTR_EDEFAULT;
		case BoemTestPackage.B__CHILDREN_NODE_BNODE:
			return childrenNodeBNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enumAttr: ");
		result.append(enumAttr);
		result.append(')');
		return result.toString();
	}

} // BImpl
