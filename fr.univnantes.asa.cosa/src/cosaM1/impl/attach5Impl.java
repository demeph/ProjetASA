/**
 */
package cosaM1.impl;

import cosa.impl.AttachementImpl;

import cosaM1.CosaM1Package;
import cosaM1.CredentialQuery;
import cosaM1.attach5;
import cosaM1.called;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attach5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.attach5Impl#getCredentialquery <em>Credentialquery</em>}</li>
 *   <li>{@link cosaM1.impl.attach5Impl#getCalled <em>Called</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attach5Impl extends AttachementImpl implements attach5 {
	/**
	 * The cached value of the '{@link #getCredentialquery() <em>Credentialquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialquery()
	 * @generated
	 * @ordered
	 */
	protected CredentialQuery credentialquery;

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
	protected attach5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.ATTACH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialQuery getCredentialquery() {
		if (credentialquery != null && credentialquery.eIsProxy()) {
			InternalEObject oldCredentialquery = (InternalEObject)credentialquery;
			credentialquery = (CredentialQuery)eResolveProxy(oldCredentialquery);
			if (credentialquery != oldCredentialquery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH5__CREDENTIALQUERY, oldCredentialquery, credentialquery));
			}
		}
		return credentialquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialQuery basicGetCredentialquery() {
		return credentialquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentialquery(CredentialQuery newCredentialquery) {
		CredentialQuery oldCredentialquery = credentialquery;
		credentialquery = newCredentialquery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH5__CREDENTIALQUERY, oldCredentialquery, credentialquery));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH5__CALLED, oldCalled, called));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH5__CALLED, oldCalled, called));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.ATTACH5__CREDENTIALQUERY:
				if (resolve) return getCredentialquery();
				return basicGetCredentialquery();
			case CosaM1Package.ATTACH5__CALLED:
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
			case CosaM1Package.ATTACH5__CREDENTIALQUERY:
				setCredentialquery((CredentialQuery)newValue);
				return;
			case CosaM1Package.ATTACH5__CALLED:
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
			case CosaM1Package.ATTACH5__CREDENTIALQUERY:
				setCredentialquery((CredentialQuery)null);
				return;
			case CosaM1Package.ATTACH5__CALLED:
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
			case CosaM1Package.ATTACH5__CREDENTIALQUERY:
				return credentialquery != null;
			case CosaM1Package.ATTACH5__CALLED:
				return called != null;
		}
		return super.eIsSet(featureID);
	}

} //attach5Impl
