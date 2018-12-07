/**
 */
package cosa.impl;

import cosa.Connector;
import cosa.ConnectorInterface;
import cosa.CosaPackage;
import cosa.Glue;
import cosa.Subject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ConnectorImpl#getConnectorinterface <em>Connectorinterface</em>}</li>
 *   <li>{@link cosa.impl.ConnectorImpl#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getConnectorinterface() <em>Connectorinterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInterface> connectorinterface;

	protected Subject subject;
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInterface> getConnectorinterface() {
		if (connectorinterface == null) {
			connectorinterface = new EObjectResolvingEList<ConnectorInterface>(ConnectorInterface.class, this, CosaPackage.CONNECTOR__CONNECTORINTERFACE);
		}
		return connectorinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.CONNECTOR__GLUE, oldGlue, newGlue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject)glue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaPackage.CONNECTOR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject)newGlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaPackage.CONNECTOR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.CONNECTOR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.CONNECTOR__GLUE:
				return basicSetGlue(null, msgs);
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
			case CosaPackage.CONNECTOR__CONNECTORINTERFACE:
				return getConnectorinterface();
			case CosaPackage.CONNECTOR__GLUE:
				return getGlue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaPackage.CONNECTOR__CONNECTORINTERFACE:
				getConnectorinterface().clear();
				getConnectorinterface().addAll((Collection<? extends ConnectorInterface>)newValue);
				return;
			case CosaPackage.CONNECTOR__GLUE:
				setGlue((Glue)newValue);
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
			case CosaPackage.CONNECTOR__CONNECTORINTERFACE:
				getConnectorinterface().clear();
				return;
			case CosaPackage.CONNECTOR__GLUE:
				setGlue((Glue)null);
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
			case CosaPackage.CONNECTOR__CONNECTORINTERFACE:
				return connectorinterface != null && !connectorinterface.isEmpty();
			case CosaPackage.CONNECTOR__GLUE:
				return glue != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getCallerRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCallerRole(String callerRole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCalledRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCalledRole(String calledRole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyConnector() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

} //ConnectorImpl
