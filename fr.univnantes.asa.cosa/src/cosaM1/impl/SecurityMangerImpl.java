/**
 */
package cosaM1.impl;

import cosa.impl.ComponentImpl;

import cosaM1.CosaM1Package;
import cosaM1.CredentialQuery;
import cosaM1.SecurityAuth;
import cosaM1.SecurityManager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.SecurityMangerImpl#getCredentialquery <em>Credentialquery</em>}</li>
 *   <li>{@link cosaM1.impl.SecurityMangerImpl#getSecurityauth <em>Securityauth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityMangerImpl extends ComponentImpl implements SecurityManager {

	
	private String securityauthStr;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityMangerImpl() {
		super();
	}


	@Override
	public void verifySecurity(String calledRole) {
		// TODO Auto-generated method stub
		this.securityauthStr = calledRole;
		//this.sd.update(EnumAction.callSecurityQuery, this.securityauthStr);
	}

	
	@Override
	public String getSecurityauthStr() {
		return securityauthStr;
	}

	@Override
	public void setSecurityauthStr(String securityauthStr) {
		this.securityauthStr = securityauthStr;
	}


// ------------------------------ NOT USED -------------------------------
	


	/**
	 * The cached value of the '{@link #getCredentialquery() <em>Credentialquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialquery()
	 * @generated
	 * @ordered
	 */
	protected CredentialQuery credentialquery;

	/**
	 * The cached value of the '{@link #getSecurityauth() <em>Securityauth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityauth()
	 * @generated
	 * @ordered
	 */
	protected SecurityAuth securityauth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.SECURITY_MANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialQuery getCredentialquery() {
		return credentialquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentialquery(CredentialQuery newCredentialquery, NotificationChain msgs) {
		CredentialQuery oldCredentialquery = credentialquery;
		credentialquery = newCredentialquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY, oldCredentialquery, newCredentialquery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentialquery(CredentialQuery newCredentialquery) {
		if (newCredentialquery != credentialquery) {
			NotificationChain msgs = null;
			if (credentialquery != null)
				msgs = ((InternalEObject)credentialquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY, null, msgs);
			if (newCredentialquery != null)
				msgs = ((InternalEObject)newCredentialquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY, null, msgs);
			msgs = basicSetCredentialquery(newCredentialquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY, newCredentialquery, newCredentialquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAuth getSecurityauth() {
		return securityauth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityauth(SecurityAuth newSecurityauth, NotificationChain msgs) {
		SecurityAuth oldSecurityauth = securityauth;
		securityauth = newSecurityauth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SECURITY_MANGER__SECURITYAUTH, oldSecurityauth, newSecurityauth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityauth(SecurityAuth newSecurityauth) {
		if (newSecurityauth != securityauth) {
			NotificationChain msgs = null;
			if (securityauth != null)
				msgs = ((InternalEObject)securityauth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SECURITY_MANGER__SECURITYAUTH, null, msgs);
			if (newSecurityauth != null)
				msgs = ((InternalEObject)newSecurityauth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SECURITY_MANGER__SECURITYAUTH, null, msgs);
			msgs = basicSetSecurityauth(newSecurityauth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SECURITY_MANGER__SECURITYAUTH, newSecurityauth, newSecurityauth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY:
				return basicSetCredentialquery(null, msgs);
			case CosaM1Package.SECURITY_MANGER__SECURITYAUTH:
				return basicSetSecurityauth(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY:
				return getCredentialquery();
			case CosaM1Package.SECURITY_MANGER__SECURITYAUTH:
				return getSecurityauth();
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
			case CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY:
				setCredentialquery((CredentialQuery)newValue);
				return;
			case CosaM1Package.SECURITY_MANGER__SECURITYAUTH:
				setSecurityauth((SecurityAuth)newValue);
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
			case CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY:
				setCredentialquery((CredentialQuery)null);
				return;
			case CosaM1Package.SECURITY_MANGER__SECURITYAUTH:
				setSecurityauth((SecurityAuth)null);
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
			case CosaM1Package.SECURITY_MANGER__CREDENTIALQUERY:
				return credentialquery != null;
			case CosaM1Package.SECURITY_MANGER__SECURITYAUTH:
				return securityauth != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityMangerImpl
