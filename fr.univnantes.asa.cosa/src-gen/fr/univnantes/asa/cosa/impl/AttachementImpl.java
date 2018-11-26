/**
 */
package fr.univnantes.asa.cosa.impl;

import fr.univnantes.asa.cosa.Attachement;
import fr.univnantes.asa.cosa.CosaPackage;
import fr.univnantes.asa.cosa.Port;
import fr.univnantes.asa.cosa.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.asa.cosa.impl.AttachementImpl#getRole <em>Role</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.impl.AttachementImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementImpl extends MinimalEObjectImpl.Container implements Attachement {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ATTACHEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CosaPackage.ATTACHEMENT__ROLE, oldRole, newRole);
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
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject) role).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.ATTACHEMENT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject) newRole).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.ATTACHEMENT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.ATTACHEMENT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Port newPort, NotificationChain msgs) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CosaPackage.ATTACHEMENT__PORT, oldPort, newPort);
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
	public void setPort(Port newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject) port).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.ATTACHEMENT__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject) newPort).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CosaPackage.ATTACHEMENT__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.ATTACHEMENT__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CosaPackage.ATTACHEMENT__ROLE:
			return basicSetRole(null, msgs);
		case CosaPackage.ATTACHEMENT__PORT:
			return basicSetPort(null, msgs);
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
		case CosaPackage.ATTACHEMENT__ROLE:
			return getRole();
		case CosaPackage.ATTACHEMENT__PORT:
			return getPort();
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
		case CosaPackage.ATTACHEMENT__ROLE:
			setRole((Role) newValue);
			return;
		case CosaPackage.ATTACHEMENT__PORT:
			setPort((Port) newValue);
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
		case CosaPackage.ATTACHEMENT__ROLE:
			setRole((Role) null);
			return;
		case CosaPackage.ATTACHEMENT__PORT:
			setPort((Port) null);
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
		case CosaPackage.ATTACHEMENT__ROLE:
			return role != null;
		case CosaPackage.ATTACHEMENT__PORT:
			return port != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachementImpl
