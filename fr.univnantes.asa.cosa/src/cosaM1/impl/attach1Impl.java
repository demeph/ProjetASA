/**
 */
package cosaM1.impl;

import cosa.impl.AttachementImpl;

import cosaM1.CosaM1Package;
import cosaM1.SecurityCheck;
import cosaM1.attach1;
import cosaM1.caller;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attach1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.attach1Impl#getSecuritycheck <em>Securitycheck</em>}</li>
 *   <li>{@link cosaM1.impl.attach1Impl#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attach1Impl extends AttachementImpl implements attach1 {
	/**
	 * The cached value of the '{@link #getSecuritycheck() <em>Securitycheck</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritycheck()
	 * @generated
	 * @ordered
	 */
	protected SecurityCheck securitycheck;

	/**
	 * The cached value of the '{@link #getCaller() <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaller()
	 * @generated
	 * @ordered
	 */
	protected caller caller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attach1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.ATTACH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCheck getSecuritycheck() {
		if (securitycheck != null && securitycheck.eIsProxy()) {
			InternalEObject oldSecuritycheck = (InternalEObject)securitycheck;
			securitycheck = (SecurityCheck)eResolveProxy(oldSecuritycheck);
			if (securitycheck != oldSecuritycheck) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH1__SECURITYCHECK, oldSecuritycheck, securitycheck));
			}
		}
		return securitycheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCheck basicGetSecuritycheck() {
		return securitycheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritycheck(SecurityCheck newSecuritycheck) {
		SecurityCheck oldSecuritycheck = securitycheck;
		securitycheck = newSecuritycheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH1__SECURITYCHECK, oldSecuritycheck, securitycheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public caller getCaller() {
		if (caller != null && caller.eIsProxy()) {
			InternalEObject oldCaller = (InternalEObject)caller;
			caller = (caller)eResolveProxy(oldCaller);
			if (caller != oldCaller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH1__CALLER, oldCaller, caller));
			}
		}
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public caller basicGetCaller() {
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaller(caller newCaller) {
		caller oldCaller = caller;
		caller = newCaller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH1__CALLER, oldCaller, caller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.ATTACH1__SECURITYCHECK:
				if (resolve) return getSecuritycheck();
				return basicGetSecuritycheck();
			case CosaM1Package.ATTACH1__CALLER:
				if (resolve) return getCaller();
				return basicGetCaller();
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
			case CosaM1Package.ATTACH1__SECURITYCHECK:
				setSecuritycheck((SecurityCheck)newValue);
				return;
			case CosaM1Package.ATTACH1__CALLER:
				setCaller((caller)newValue);
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
			case CosaM1Package.ATTACH1__SECURITYCHECK:
				setSecuritycheck((SecurityCheck)null);
				return;
			case CosaM1Package.ATTACH1__CALLER:
				setCaller((caller)null);
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
			case CosaM1Package.ATTACH1__SECURITYCHECK:
				return securitycheck != null;
			case CosaM1Package.ATTACH1__CALLER:
				return caller != null;
		}
		return super.eIsSet(featureID);
	}

} //attach1Impl
