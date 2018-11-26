/**
 */
package fr.univnantes.asa.cosa.impl;

import fr.univnantes.asa.cosa.Binding;
import fr.univnantes.asa.cosa.CosaPackage;
import fr.univnantes.asa.cosa.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getPortProvided <em>Port Provided</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getPortRequired <em>Port Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The cached value of the '{@link #getPortProvided() <em>Port Provided</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProvided()
	 * @generated
	 * @ordered
	 */
	protected Port portProvided;

	/**
	 * The cached value of the '{@link #getPortRequired() <em>Port Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRequired()
	 * @generated
	 * @ordered
	 */
	protected Port portRequired;

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
	public Port getPortProvided() {
		return portProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortProvided(Port newPortProvided, NotificationChain msgs) {
		Port oldPortProvided = portProvided;
		portProvided = newPortProvided;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CosaPackage.BINDING__PORT_PROVIDED, oldPortProvided, newPortProvided);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortProvided(Port newPortProvided) {
		if (newPortProvided != portProvided) {
			NotificationChain msgs = null;
			if (portProvided != null)
				msgs = ((InternalEObject) portProvided).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.BINDING__PORT_PROVIDED, null, msgs);
			if (newPortProvided != null)
				msgs = ((InternalEObject) newPortProvided).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.BINDING__PORT_PROVIDED, null, msgs);
			msgs = basicSetPortProvided(newPortProvided, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_PROVIDED, newPortProvided,
					newPortProvided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortRequired() {
		return portRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortRequired(Port newPortRequired, NotificationChain msgs) {
		Port oldPortRequired = portRequired;
		portRequired = newPortRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CosaPackage.BINDING__PORT_REQUIRED, oldPortRequired, newPortRequired);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortRequired(Port newPortRequired) {
		if (newPortRequired != portRequired) {
			NotificationChain msgs = null;
			if (portRequired != null)
				msgs = ((InternalEObject) portRequired).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.BINDING__PORT_REQUIRED, null, msgs);
			if (newPortRequired != null)
				msgs = ((InternalEObject) newPortRequired).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.BINDING__PORT_REQUIRED, null, msgs);
			msgs = basicSetPortRequired(newPortRequired, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_REQUIRED, newPortRequired,
					newPortRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CosaPackage.BINDING__PORT_PROVIDED:
			return basicSetPortProvided(null, msgs);
		case CosaPackage.BINDING__PORT_REQUIRED:
			return basicSetPortRequired(null, msgs);
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
		case CosaPackage.BINDING__PORT_PROVIDED:
			return getPortProvided();
		case CosaPackage.BINDING__PORT_REQUIRED:
			return getPortRequired();
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
		case CosaPackage.BINDING__PORT_PROVIDED:
			setPortProvided((Port) newValue);
			return;
		case CosaPackage.BINDING__PORT_REQUIRED:
			setPortRequired((Port) newValue);
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
		case CosaPackage.BINDING__PORT_PROVIDED:
			setPortProvided((Port) null);
			return;
		case CosaPackage.BINDING__PORT_REQUIRED:
			setPortRequired((Port) null);
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
		case CosaPackage.BINDING__PORT_PROVIDED:
			return portProvided != null;
		case CosaPackage.BINDING__PORT_REQUIRED:
			return portRequired != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
