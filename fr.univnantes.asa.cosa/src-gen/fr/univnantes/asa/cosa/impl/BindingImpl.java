/**
 */
package fr.univnantes.asa.cosa.impl;

import fr.univnantes.asa.cosa.Binding;
import fr.univnantes.asa.cosa.CosaPackage;
import fr.univnantes.asa.cosa.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getPortRequired <em>Port Required</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getPortProvided <em>Port Provided</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The cached value of the '{@link #getPortRequired() <em>Port Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRequired()
	 * @generated
	 * @ordered
	 */
	protected Port portRequired;

	/**
	 * The cached value of the '{@link #getPortProvided() <em>Port Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProvided()
	 * @generated
	 * @ordered
	 */
	protected Port portProvided;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortRequired() {
		if (portRequired != null && portRequired.eIsProxy()) {
			InternalEObject oldPortRequired = (InternalEObject) portRequired;
			portRequired = (Port) eResolveProxy(oldPortRequired);
			if (portRequired != oldPortRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__PORT_REQUIRED,
							oldPortRequired, portRequired));
			}
		}
		return portRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortRequired() {
		return portRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortRequired(Port newPortRequired) {
		Port oldPortRequired = portRequired;
		portRequired = newPortRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_REQUIRED, oldPortRequired,
					portRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortProvided() {
		if (portProvided != null && portProvided.eIsProxy()) {
			InternalEObject oldPortProvided = (InternalEObject) portProvided;
			portProvided = (Port) eResolveProxy(oldPortProvided);
			if (portProvided != oldPortProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__PORT_PROVIDED,
							oldPortProvided, portProvided));
			}
		}
		return portProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortProvided() {
		return portProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortProvided(Port newPortProvided) {
		Port oldPortProvided = portProvided;
		portProvided = newPortProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_PROVIDED, oldPortProvided,
					portProvided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CosaPackage.BINDING__PORT_REQUIRED:
			if (resolve)
				return getPortRequired();
			return basicGetPortRequired();
		case CosaPackage.BINDING__PORT_PROVIDED:
			if (resolve)
				return getPortProvided();
			return basicGetPortProvided();
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
		case CosaPackage.BINDING__PORT_REQUIRED:
			setPortRequired((Port) newValue);
			return;
		case CosaPackage.BINDING__PORT_PROVIDED:
			setPortProvided((Port) newValue);
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
		case CosaPackage.BINDING__PORT_REQUIRED:
			setPortRequired((Port) null);
			return;
		case CosaPackage.BINDING__PORT_PROVIDED:
			setPortProvided((Port) null);
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
		case CosaPackage.BINDING__PORT_REQUIRED:
			return portRequired != null;
		case CosaPackage.BINDING__PORT_PROVIDED:
			return portProvided != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
