/**
 */
package cosaM1.impl;

import cosa.impl.AttachementImpl;

import cosaM1.CosaM1Package;
import cosaM1.DBQuery;
import cosaM1.attach3;
import cosaM1.caller;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attach3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.attach3Impl#getDbquery <em>Dbquery</em>}</li>
 *   <li>{@link cosaM1.impl.attach3Impl#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attach3Impl extends AttachementImpl implements attach3 {
	/**
	 * The cached value of the '{@link #getDbquery() <em>Dbquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbquery()
	 * @generated
	 * @ordered
	 */
	protected DBQuery dbquery;

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
	protected attach3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.ATTACH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBQuery getDbquery() {
		if (dbquery != null && dbquery.eIsProxy()) {
			InternalEObject oldDbquery = (InternalEObject)dbquery;
			dbquery = (DBQuery)eResolveProxy(oldDbquery);
			if (dbquery != oldDbquery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH3__DBQUERY, oldDbquery, dbquery));
			}
		}
		return dbquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBQuery basicGetDbquery() {
		return dbquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbquery(DBQuery newDbquery) {
		DBQuery oldDbquery = dbquery;
		dbquery = newDbquery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH3__DBQUERY, oldDbquery, dbquery));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.ATTACH3__CALLER, oldCaller, caller));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.ATTACH3__CALLER, oldCaller, caller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.ATTACH3__DBQUERY:
				if (resolve) return getDbquery();
				return basicGetDbquery();
			case CosaM1Package.ATTACH3__CALLER:
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
			case CosaM1Package.ATTACH3__DBQUERY:
				setDbquery((DBQuery)newValue);
				return;
			case CosaM1Package.ATTACH3__CALLER:
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
			case CosaM1Package.ATTACH3__DBQUERY:
				setDbquery((DBQuery)null);
				return;
			case CosaM1Package.ATTACH3__CALLER:
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
			case CosaM1Package.ATTACH3__DBQUERY:
				return dbquery != null;
			case CosaM1Package.ATTACH3__CALLER:
				return caller != null;
		}
		return super.eIsSet(featureID);
	}

} //attach3Impl
