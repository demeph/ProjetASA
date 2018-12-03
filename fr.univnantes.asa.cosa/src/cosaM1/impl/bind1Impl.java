/**
 */
package cosaM1.impl;

import cosa.impl.BindingImpl;

import cosaM1.CosaM1Package;
import cosaM1.ExternalSocket;
import cosaM1.bind1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>bind1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.bind1Impl#getExternalsocket <em>Externalsocket</em>}</li>
 *   <li>{@link cosaM1.impl.bind1Impl#getConnectionMangerexternalsocket <em>Connection Mangerexternalsocket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class bind1Impl extends BindingImpl implements bind1 {
	/**
	 * The cached value of the '{@link #getExternalsocket() <em>Externalsocket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsocket()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket externalsocket;

	/**
	 * The cached value of the '{@link #getConnectionMangerexternalsocket() <em>Connection Mangerexternalsocket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMangerexternalsocket()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket connectionMangerexternalsocket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected bind1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.BIND1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket getExternalsocket() {
		if (externalsocket != null && externalsocket.eIsProxy()) {
			InternalEObject oldExternalsocket = (InternalEObject)externalsocket;
			externalsocket = (ExternalSocket)eResolveProxy(oldExternalsocket);
			if (externalsocket != oldExternalsocket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.BIND1__EXTERNALSOCKET, oldExternalsocket, externalsocket));
			}
		}
		return externalsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket basicGetExternalsocket() {
		return externalsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalsocket(ExternalSocket newExternalsocket) {
		ExternalSocket oldExternalsocket = externalsocket;
		externalsocket = newExternalsocket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.BIND1__EXTERNALSOCKET, oldExternalsocket, externalsocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket getConnectionMangerexternalsocket() {
		if (connectionMangerexternalsocket != null && connectionMangerexternalsocket.eIsProxy()) {
			InternalEObject oldConnectionMangerexternalsocket = (InternalEObject)connectionMangerexternalsocket;
			connectionMangerexternalsocket = (ExternalSocket)eResolveProxy(oldConnectionMangerexternalsocket);
			if (connectionMangerexternalsocket != oldConnectionMangerexternalsocket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.BIND1__CONNECTION_MANGEREXTERNALSOCKET, oldConnectionMangerexternalsocket, connectionMangerexternalsocket));
			}
		}
		return connectionMangerexternalsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket basicGetConnectionMangerexternalsocket() {
		return connectionMangerexternalsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionMangerexternalsocket(ExternalSocket newConnectionMangerexternalsocket) {
		ExternalSocket oldConnectionMangerexternalsocket = connectionMangerexternalsocket;
		connectionMangerexternalsocket = newConnectionMangerexternalsocket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.BIND1__CONNECTION_MANGEREXTERNALSOCKET, oldConnectionMangerexternalsocket, connectionMangerexternalsocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.BIND1__EXTERNALSOCKET:
				if (resolve) return getExternalsocket();
				return basicGetExternalsocket();
			case CosaM1Package.BIND1__CONNECTION_MANGEREXTERNALSOCKET:
				if (resolve) return getConnectionMangerexternalsocket();
				return basicGetConnectionMangerexternalsocket();
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
			case CosaM1Package.BIND1__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)newValue);
				return;
			case CosaM1Package.BIND1__CONNECTION_MANGEREXTERNALSOCKET:
				setConnectionMangerexternalsocket((ExternalSocket)newValue);
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
			case CosaM1Package.BIND1__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)null);
				return;
			case CosaM1Package.BIND1__CONNECTION_MANGEREXTERNALSOCKET:
				setConnectionMangerexternalsocket((ExternalSocket)null);
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
			case CosaM1Package.BIND1__EXTERNALSOCKET:
				return externalsocket != null;
			case CosaM1Package.BIND1__CONNECTION_MANGEREXTERNALSOCKET:
				return connectionMangerexternalsocket != null;
		}
		return super.eIsSet(featureID);
	}

} //bind1Impl
