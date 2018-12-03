/**
 */
package cosaM1.impl;

import cosa.impl.ComponentImpl;

import cosaM1.Client;
import cosaM1.CosaM1Package;
import cosaM1.Request;
import cosaM1.SendRequest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.ClientImpl#getSendrequest <em>Sendrequest</em>}</li>
 *   <li>{@link cosaM1.impl.ClientImpl#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ComponentImpl implements Client {
	/**
	 * The cached value of the '{@link #getSendrequest() <em>Sendrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendrequest()
	 * @generated
	 * @ordered
	 */
	protected SendRequest sendrequest;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

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
		return CosaM1Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendRequest getSendrequest() {
		return sendrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendrequest(SendRequest newSendrequest, NotificationChain msgs) {
		SendRequest oldSendrequest = sendrequest;
		sendrequest = newSendrequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.CLIENT__SENDREQUEST, oldSendrequest, newSendrequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendrequest(SendRequest newSendrequest) {
		if (newSendrequest != sendrequest) {
			NotificationChain msgs = null;
			if (sendrequest != null)
				msgs = ((InternalEObject)sendrequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CLIENT__SENDREQUEST, null, msgs);
			if (newSendrequest != null)
				msgs = ((InternalEObject)newSendrequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CLIENT__SENDREQUEST, null, msgs);
			msgs = basicSetSendrequest(newSendrequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.CLIENT__SENDREQUEST, newSendrequest, newSendrequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.CLIENT__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CLIENT__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.CLIENT__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.CLIENT__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.CLIENT__SENDREQUEST:
				return basicSetSendrequest(null, msgs);
			case CosaM1Package.CLIENT__REQUEST:
				return basicSetRequest(null, msgs);
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
			case CosaM1Package.CLIENT__SENDREQUEST:
				return getSendrequest();
			case CosaM1Package.CLIENT__REQUEST:
				return getRequest();
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
			case CosaM1Package.CLIENT__SENDREQUEST:
				setSendrequest((SendRequest)newValue);
				return;
			case CosaM1Package.CLIENT__REQUEST:
				setRequest((Request)newValue);
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
			case CosaM1Package.CLIENT__SENDREQUEST:
				setSendrequest((SendRequest)null);
				return;
			case CosaM1Package.CLIENT__REQUEST:
				setRequest((Request)null);
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
			case CosaM1Package.CLIENT__SENDREQUEST:
				return sendrequest != null;
			case CosaM1Package.CLIENT__REQUEST:
				return request != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
