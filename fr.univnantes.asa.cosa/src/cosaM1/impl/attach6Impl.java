/**
 */
package cosaM1.impl;

import cosa.impl.AttachementImpl;

import cosaM1.CosaM1Package;
import cosaM1.SecurityManagement;
import cosaM1.attach6;
import cosaM1.called;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attach6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.attach6Impl#getSecuritymanagement <em>Securitymanagement</em>}</li>
 *   <li>{@link cosaM1.impl.attach6Impl#getCalled <em>Called</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attach6Impl extends AttachementImpl implements attach6 {
	/**
	 * The cached value of the '{@link #getSecuritymanagement() <em>Securitymanagement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanagement()
	 * @generated
	 * @ordered
	 */
	protected SecurityManagement securitymanagement;

	/**
	 * The cached value of the '{@link #getCalled() <em>Called</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalled()
	 * @generated
	 * @ordered
	 */
	protected called called;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attach6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.ATTACH6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagement getSecuritymanagement() {
		if (securitymanagement != null && securitymanagement.eIsProxy()) {
			InternalEObject oldSecuritymanagement = (InternalEObject)securitymanagement;
			securitymanagement = (SecurityManagement)eResolveProxy(oldSecuritymanagement);
			if (securitymanagement != oldSecuritymanagement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH6__SECURITYMANAGEMENT, oldSecuritymanagement, securitymanagement));
			}
		}
		return securitymanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagement basicGetSecuritymanagement() {
		return securitymanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritymanagement(SecurityManagement newSecuritymanagement) {
		SecurityManagement oldSecuritymanagement = securitymanagement;
		securitymanagement = newSecuritymanagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH6__SECURITYMANAGEMENT, oldSecuritymanagement, securitymanagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public called getCalled() {
		if (called != null && called.eIsProxy()) {
			InternalEObject oldCalled = (InternalEObject)called;
			called = (called)eResolveProxy(oldCalled);
			if (called != oldCalled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH6__CALLED, oldCalled, called));
			}
		}
		return called;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public called basicGetCalled() {
		return called;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalled(called newCalled) {
		called oldCalled = called;
		called = newCalled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH6__CALLED, oldCalled, called));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.ATTACH6__SECURITYMANAGEMENT:
				if (resolve) return getSecuritymanagement();
				return basicGetSecuritymanagement();
			case CosaM1Package.ATTACH6__CALLED:
				if (resolve) return getCalled();
				return basicGetCalled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaM1Package.ATTACH6__SECURITYMANAGEMENT:
				setSecuritymanagement((SecurityManagement)newValue);
				return;
			case CosaM1Package.ATTACH6__CALLED:
				setCalled((called)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CosaM1Package.ATTACH6__SECURITYMANAGEMENT:
				setSecuritymanagement((SecurityManagement)null);
				return;
			case CosaM1Package.ATTACH6__CALLED:
				setCalled((called)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CosaM1Package.ATTACH6__SECURITYMANAGEMENT:
				return securitymanagement != null;
			case CosaM1Package.ATTACH6__CALLED:
				return called != null;
		}
		return super.eIsSet(featureID);
	}

} //attach6Impl
