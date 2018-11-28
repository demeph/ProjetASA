/**
 */
package simpleCS.impl;

import cosa.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleCS.Client;
import simpleCS.Send_Request;
import simpleCS.Send_Request_In;
import simpleCS.Send_Request_Out;
import simpleCS.SimpleCSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.impl.ClientImpl#getSend_request_in <em>Send request in</em>}</li>
 *   <li>{@link simpleCS.impl.ClientImpl#getSend_request <em>Send request</em>}</li>
 *   <li>{@link simpleCS.impl.ClientImpl#getSend_request_out <em>Send request out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ComponentImpl implements Client {
	/**
	 * The cached value of the '{@link #getSend_request_in() <em>Send request in</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_request_in()
	 * @generated
	 * @ordered
	 */
	protected Send_Request_In send_request_in;

	/**
	 * The cached value of the '{@link #getSend_request() <em>Send request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_request()
	 * @generated
	 * @ordered
	 */
	protected Send_Request send_request;

	/**
	 * The cached value of the '{@link #getSend_request_out() <em>Send request out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_request_out()
	 * @generated
	 * @ordered
	 */
	protected Send_Request_Out send_request_out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleCSPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send_Request_In getSend_request_in() {
		return send_request_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSend_request_in(Send_Request_In newSend_request_in, NotificationChain msgs) {
		Send_Request_In oldSend_request_in = send_request_in;
		send_request_in = newSend_request_in;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.CLIENT__SEND_REQUEST_IN, oldSend_request_in, newSend_request_in);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend_request_in(Send_Request_In newSend_request_in) {
		if (newSend_request_in != send_request_in) {
			NotificationChain msgs = null;
			if (send_request_in != null)
				msgs = ((InternalEObject)send_request_in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.CLIENT__SEND_REQUEST_IN, null, msgs);
			if (newSend_request_in != null)
				msgs = ((InternalEObject)newSend_request_in).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.CLIENT__SEND_REQUEST_IN, null, msgs);
			msgs = basicSetSend_request_in(newSend_request_in, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.CLIENT__SEND_REQUEST_IN, newSend_request_in, newSend_request_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send_Request getSend_request() {
		return send_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSend_request(Send_Request newSend_request, NotificationChain msgs) {
		Send_Request oldSend_request = send_request;
		send_request = newSend_request;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.CLIENT__SEND_REQUEST, oldSend_request, newSend_request);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend_request(Send_Request newSend_request) {
		if (newSend_request != send_request) {
			NotificationChain msgs = null;
			if (send_request != null)
				msgs = ((InternalEObject)send_request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.CLIENT__SEND_REQUEST, null, msgs);
			if (newSend_request != null)
				msgs = ((InternalEObject)newSend_request).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.CLIENT__SEND_REQUEST, null, msgs);
			msgs = basicSetSend_request(newSend_request, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.CLIENT__SEND_REQUEST, newSend_request, newSend_request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send_Request_Out getSend_request_out() {
		return send_request_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSend_request_out(Send_Request_Out newSend_request_out, NotificationChain msgs) {
		Send_Request_Out oldSend_request_out = send_request_out;
		send_request_out = newSend_request_out;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.CLIENT__SEND_REQUEST_OUT, oldSend_request_out, newSend_request_out);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend_request_out(Send_Request_Out newSend_request_out) {
		if (newSend_request_out != send_request_out) {
			NotificationChain msgs = null;
			if (send_request_out != null)
				msgs = ((InternalEObject)send_request_out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.CLIENT__SEND_REQUEST_OUT, null, msgs);
			if (newSend_request_out != null)
				msgs = ((InternalEObject)newSend_request_out).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.CLIENT__SEND_REQUEST_OUT, null, msgs);
			msgs = basicSetSend_request_out(newSend_request_out, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.CLIENT__SEND_REQUEST_OUT, newSend_request_out, newSend_request_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleCSPackage.CLIENT__SEND_REQUEST_IN:
				return basicSetSend_request_in(null, msgs);
			case SimpleCSPackage.CLIENT__SEND_REQUEST:
				return basicSetSend_request(null, msgs);
			case SimpleCSPackage.CLIENT__SEND_REQUEST_OUT:
				return basicSetSend_request_out(null, msgs);
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
			case SimpleCSPackage.CLIENT__SEND_REQUEST_IN:
				return getSend_request_in();
			case SimpleCSPackage.CLIENT__SEND_REQUEST:
				return getSend_request();
			case SimpleCSPackage.CLIENT__SEND_REQUEST_OUT:
				return getSend_request_out();
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
			case SimpleCSPackage.CLIENT__SEND_REQUEST_IN:
				setSend_request_in((Send_Request_In)newValue);
				return;
			case SimpleCSPackage.CLIENT__SEND_REQUEST:
				setSend_request((Send_Request)newValue);
				return;
			case SimpleCSPackage.CLIENT__SEND_REQUEST_OUT:
				setSend_request_out((Send_Request_Out)newValue);
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
			case SimpleCSPackage.CLIENT__SEND_REQUEST_IN:
				setSend_request_in((Send_Request_In)null);
				return;
			case SimpleCSPackage.CLIENT__SEND_REQUEST:
				setSend_request((Send_Request)null);
				return;
			case SimpleCSPackage.CLIENT__SEND_REQUEST_OUT:
				setSend_request_out((Send_Request_Out)null);
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
			case SimpleCSPackage.CLIENT__SEND_REQUEST_IN:
				return send_request_in != null;
			case SimpleCSPackage.CLIENT__SEND_REQUEST:
				return send_request != null;
			case SimpleCSPackage.CLIENT__SEND_REQUEST_OUT:
				return send_request_out != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
