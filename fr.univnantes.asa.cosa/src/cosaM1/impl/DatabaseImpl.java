/**
 */
package cosaM1.impl;

import cosa.impl.ComponentImpl;

import cosaM1.CosaM1Package;
import cosaM1.Database;
import cosaM1.Query;
import cosaM1.SecurityManagement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.DatabaseImpl#getSecuritymanagement <em>Securitymanagement</em>}</li>
 *   <li>{@link cosaM1.impl.DatabaseImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends ComponentImpl implements Database {
	/**
	 * The cached value of the '{@link #getSecuritymanagement() <em>Securitymanagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanagement()
	 * @generated
	 * @ordered
	 */
	protected SecurityManagement securitymanagement;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagement getSecuritymanagement() {
		return securitymanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuritymanagement(SecurityManagement newSecuritymanagement, NotificationChain msgs) {
		SecurityManagement oldSecuritymanagement = securitymanagement;
		securitymanagement = newSecuritymanagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.DATABASE__SECURITYMANAGEMENT, oldSecuritymanagement, newSecuritymanagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritymanagement(SecurityManagement newSecuritymanagement) {
		if (newSecuritymanagement != securitymanagement) {
			NotificationChain msgs = null;
			if (securitymanagement != null)
				msgs = ((InternalEObject)securitymanagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.DATABASE__SECURITYMANAGEMENT, null, msgs);
			if (newSecuritymanagement != null)
				msgs = ((InternalEObject)newSecuritymanagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.DATABASE__SECURITYMANAGEMENT, null, msgs);
			msgs = basicSetSecuritymanagement(newSecuritymanagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.DATABASE__SECURITYMANAGEMENT, newSecuritymanagement, newSecuritymanagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.DATABASE__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.DATABASE__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.DATABASE__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.DATABASE__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.DATABASE__SECURITYMANAGEMENT:
				return basicSetSecuritymanagement(null, msgs);
			case CosaM1Package.DATABASE__QUERY:
				return basicSetQuery(null, msgs);
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
			case CosaM1Package.DATABASE__SECURITYMANAGEMENT:
				return getSecuritymanagement();
			case CosaM1Package.DATABASE__QUERY:
				return getQuery();
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
			case CosaM1Package.DATABASE__SECURITYMANAGEMENT:
				setSecuritymanagement((SecurityManagement)newValue);
				return;
			case CosaM1Package.DATABASE__QUERY:
				setQuery((Query)newValue);
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
			case CosaM1Package.DATABASE__SECURITYMANAGEMENT:
				setSecuritymanagement((SecurityManagement)null);
				return;
			case CosaM1Package.DATABASE__QUERY:
				setQuery((Query)null);
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
			case CosaM1Package.DATABASE__SECURITYMANAGEMENT:
				return securitymanagement != null;
			case CosaM1Package.DATABASE__QUERY:
				return query != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
