/**
 */
package cosaM1.impl;

import cosa.impl.ComponentImpl;

import cosaM1.ConnectionManager;
import cosaM1.CosaM1Package;
import cosaM1.DBQuery;
import cosaM1.ExternalSocket;
import cosaM1.SecurityCheck;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.ConnectionManagerImpl#getExternalsocket <em>Externalsocket</em>}</li>
 *   <li>{@link cosaM1.impl.ConnectionManagerImpl#getDbquery <em>Dbquery</em>}</li>
 *   <li>{@link cosaM1.impl.ConnectionManagerImpl#getSecuritycheck <em>Securitycheck</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManagerImpl extends ComponentImpl implements ConnectionManager {
	/**
	 * The cached value of the '{@link #getExternalsocket() <em>Externalsocket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsocket()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket externalsocket;

	/**
	 * The cached value of the '{@link #getDbquery() <em>Dbquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbquery()
	 * @generated
	 * @ordered
	 */
	protected DBQuery dbquery;

	/**
	 * The cached value of the '{@link #getSecuritycheck() <em>Securitycheck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritycheck()
	 * @generated
	 * @ordered
	 */
	protected SecurityCheck securitycheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket getExternalsocket() {
		return externalsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalsocket(ExternalSocket newExternalsocket, NotificationChain msgs) {
		ExternalSocket oldExternalsocket = externalsocket;
		externalsocket = newExternalsocket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET, oldExternalsocket, newExternalsocket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalsocket(ExternalSocket newExternalsocket) {
		if (newExternalsocket != externalsocket) {
			NotificationChain msgs = null;
			if (externalsocket != null)
				msgs = ((InternalEObject)externalsocket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET, null, msgs);
			if (newExternalsocket != null)
				msgs = ((InternalEObject)newExternalsocket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET, null, msgs);
			msgs = basicSetExternalsocket(newExternalsocket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET, newExternalsocket, newExternalsocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBQuery getDbquery() {
		return dbquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbquery(DBQuery newDbquery, NotificationChain msgs) {
		DBQuery oldDbquery = dbquery;
		dbquery = newDbquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.CONNECTION_MANAGER__DBQUERY, oldDbquery, newDbquery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbquery(DBQuery newDbquery) {
		if (newDbquery != dbquery) {
			NotificationChain msgs = null;
			if (dbquery != null)
				msgs = ((InternalEObject)dbquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CONNECTION_MANAGER__DBQUERY, null, msgs);
			if (newDbquery != null)
				msgs = ((InternalEObject)newDbquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CONNECTION_MANAGER__DBQUERY, null, msgs);
			msgs = basicSetDbquery(newDbquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.CONNECTION_MANAGER__DBQUERY, newDbquery, newDbquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCheck getSecuritycheck() {
		return securitycheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuritycheck(SecurityCheck newSecuritycheck, NotificationChain msgs) {
		SecurityCheck oldSecuritycheck = securitycheck;
		securitycheck = newSecuritycheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK, oldSecuritycheck, newSecuritycheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritycheck(SecurityCheck newSecuritycheck) {
		if (newSecuritycheck != securitycheck) {
			NotificationChain msgs = null;
			if (securitycheck != null)
				msgs = ((InternalEObject)securitycheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK, null, msgs);
			if (newSecuritycheck != null)
				msgs = ((InternalEObject)newSecuritycheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK, null, msgs);
			msgs = basicSetSecuritycheck(newSecuritycheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK, newSecuritycheck, newSecuritycheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET:
				return basicSetExternalsocket(null, msgs);
			case CosaM1Package.CONNECTION_MANAGER__DBQUERY:
				return basicSetDbquery(null, msgs);
			case CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK:
				return basicSetSecuritycheck(null, msgs);
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
			case CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET:
				return getExternalsocket();
			case CosaM1Package.CONNECTION_MANAGER__DBQUERY:
				return getDbquery();
			case CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK:
				return getSecuritycheck();
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
			case CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)newValue);
				return;
			case CosaM1Package.CONNECTION_MANAGER__DBQUERY:
				setDbquery((DBQuery)newValue);
				return;
			case CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK:
				setSecuritycheck((SecurityCheck)newValue);
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
			case CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)null);
				return;
			case CosaM1Package.CONNECTION_MANAGER__DBQUERY:
				setDbquery((DBQuery)null);
				return;
			case CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK:
				setSecuritycheck((SecurityCheck)null);
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
			case CosaM1Package.CONNECTION_MANAGER__EXTERNALSOCKET:
				return externalsocket != null;
			case CosaM1Package.CONNECTION_MANAGER__DBQUERY:
				return dbquery != null;
			case CosaM1Package.CONNECTION_MANAGER__SECURITYCHECK:
				return securitycheck != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionManagerImpl
