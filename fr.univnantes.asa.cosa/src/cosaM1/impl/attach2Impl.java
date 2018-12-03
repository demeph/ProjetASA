/**
 */
package cosaM1.impl;

import cosa.impl.AttachementImpl;

import cosaM1.CosaM1Package;
import cosaM1.SecurityAuth;
import cosaM1.attach2;
import cosaM1.called;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attach2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.attach2Impl#getSecurityauth <em>Securityauth</em>}</li>
 *   <li>{@link cosaM1.impl.attach2Impl#getCalled <em>Called</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attach2Impl extends AttachementImpl implements attach2 {
	/**
	 * The cached value of the '{@link #getSecurityauth() <em>Securityauth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityauth()
	 * @generated
	 * @ordered
	 */
	protected SecurityAuth securityauth;

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
	protected attach2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.ATTACH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAuth getSecurityauth() {
		if (securityauth != null && securityauth.eIsProxy()) {
			InternalEObject oldSecurityauth = (InternalEObject)securityauth;
			securityauth = (SecurityAuth)eResolveProxy(oldSecurityauth);
			if (securityauth != oldSecurityauth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH2__SECURITYAUTH, oldSecurityauth, securityauth));
			}
		}
		return securityauth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAuth basicGetSecurityauth() {
		return securityauth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityauth(SecurityAuth newSecurityauth) {
		SecurityAuth oldSecurityauth = securityauth;
		securityauth = newSecurityauth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH2__SECURITYAUTH, oldSecurityauth, securityauth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH2__CALLED, oldCalled, called));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH2__CALLED, oldCalled, called));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.ATTACH2__SECURITYAUTH:
				if (resolve) return getSecurityauth();
				return basicGetSecurityauth();
			case CosaM1Package.ATTACH2__CALLED:
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
			case CosaM1Package.ATTACH2__SECURITYAUTH:
				setSecurityauth((SecurityAuth)newValue);
				return;
			case CosaM1Package.ATTACH2__CALLED:
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
			case CosaM1Package.ATTACH2__SECURITYAUTH:
				setSecurityauth((SecurityAuth)null);
				return;
			case CosaM1Package.ATTACH2__CALLED:
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
			case CosaM1Package.ATTACH2__SECURITYAUTH:
				return securityauth != null;
			case CosaM1Package.ATTACH2__CALLED:
				return called != null;
		}
		return super.eIsSet(featureID);
	}

} //attach2Impl
