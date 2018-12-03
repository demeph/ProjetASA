/**
 */
package cosaM1.impl;

import cosa.impl.BindingImpl;

import cosaM1.CosaM1Package;
import cosaM1.ExternalSocket;
import cosaM1.Provide;
import cosaM1.bind2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>bind2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.bind2Impl#getProvide <em>Provide</em>}</li>
 *   <li>{@link cosaM1.impl.bind2Impl#getExternalsocket <em>Externalsocket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class bind2Impl extends BindingImpl implements bind2 {
	/**
	 * The cached value of the '{@link #getProvide() <em>Provide</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvide()
	 * @generated
	 * @ordered
	 */
	protected Provide provide;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected bind2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.BIND2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide getProvide() {
		if (provide != null && provide.eIsProxy()) {
			InternalEObject oldProvide = (InternalEObject)provide;
			provide = (Provide)eResolveProxy(oldProvide);
			if (provide != oldProvide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.BIND2__PROVIDE, oldProvide, provide));
			}
		}
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide basicGetProvide() {
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvide(Provide newProvide) {
		Provide oldProvide = provide;
		provide = newProvide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.BIND2__PROVIDE, oldProvide, provide));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaM1Package.BIND2__EXTERNALSOCKET, oldExternalsocket, externalsocket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.BIND2__EXTERNALSOCKET, oldExternalsocket, externalsocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.BIND2__PROVIDE:
				if (resolve) return getProvide();
				return basicGetProvide();
			case CosaM1Package.BIND2__EXTERNALSOCKET:
				if (resolve) return getExternalsocket();
				return basicGetExternalsocket();
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
			case CosaM1Package.BIND2__PROVIDE:
				setProvide((Provide)newValue);
				return;
			case CosaM1Package.BIND2__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)newValue);
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
			case CosaM1Package.BIND2__PROVIDE:
				setProvide((Provide)null);
				return;
			case CosaM1Package.BIND2__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)null);
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
			case CosaM1Package.BIND2__PROVIDE:
				return provide != null;
			case CosaM1Package.BIND2__EXTERNALSOCKET:
				return externalsocket != null;
		}
		return super.eIsSet(featureID);
	}

} //bind2Impl
