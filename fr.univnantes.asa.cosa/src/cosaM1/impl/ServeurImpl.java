/**
 */
package cosaM1.impl;

import cosa.impl.ComponentImpl;

import cosaM1.CosaM1Package;
import cosaM1.Provide;
import cosaM1.RecieveRequest;
import cosaM1.Serveur;
import cosaM1.Simple_CS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.ServeurImpl#getRecieverequest <em>Recieverequest</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurImpl#getProvide <em>Provide</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServeurImpl extends ComponentImpl implements Serveur {
	
	private Simple_CS sc;
	
	private String provideStr;
	
	
/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServeurImpl() {
		super();
	}
	
	
	public void RecieveRequest(String request) {
		this.provideStr = request;
		this.sc.handleRequest(EnumAction.callServeurDetail, this.provideStr);
	}
	

	public Simple_CS getSc() {
		return sc;
	}

	public void setSc(Simple_CS sc) {
		this.sc = sc;
	}

	
	
	@Override
	public String getProvideStr() {
		return provideStr;
	}

	@Override
	public void setProvideStr(String provideStr) {
		this.provideStr = provideStr;
	}




	//--------------------------------- NOT USED ---------------------------------------------
	/**
	 * The cached value of the '{@link #getRecieverequest() <em>Recieverequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecieverequest()
	 * @generated
	 * @ordered
	 */
	protected RecieveRequest recieverequest;

	/**
	 * The cached value of the '{@link #getProvide() <em>Provide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvide()
	 * @generated
	 * @ordered
	 */
	protected Provide provide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecieveRequest getRecieverequest() {
		return recieverequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecieverequest(RecieveRequest newRecieverequest, NotificationChain msgs) {
		RecieveRequest oldRecieverequest = recieverequest;
		recieverequest = newRecieverequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR__RECIEVEREQUEST, oldRecieverequest, newRecieverequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecieverequest(RecieveRequest newRecieverequest) {
		if (newRecieverequest != recieverequest) {
			NotificationChain msgs = null;
			if (recieverequest != null)
				msgs = ((InternalEObject)recieverequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR__RECIEVEREQUEST, null, msgs);
			if (newRecieverequest != null)
				msgs = ((InternalEObject)newRecieverequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR__RECIEVEREQUEST, null, msgs);
			msgs = basicSetRecieverequest(newRecieverequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR__RECIEVEREQUEST, newRecieverequest, newRecieverequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide getProvide() {
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvide(Provide newProvide, NotificationChain msgs) {
		Provide oldProvide = provide;
		provide = newProvide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR__PROVIDE, oldProvide, newProvide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvide(Provide newProvide) {
		if (newProvide != provide) {
			NotificationChain msgs = null;
			if (provide != null)
				msgs = ((InternalEObject)provide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR__PROVIDE, null, msgs);
			if (newProvide != null)
				msgs = ((InternalEObject)newProvide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR__PROVIDE, null, msgs);
			msgs = basicSetProvide(newProvide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR__PROVIDE, newProvide, newProvide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.SERVEUR__RECIEVEREQUEST:
				return basicSetRecieverequest(null, msgs);
			case CosaM1Package.SERVEUR__PROVIDE:
				return basicSetProvide(null, msgs);
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
			case CosaM1Package.SERVEUR__RECIEVEREQUEST:
				return getRecieverequest();
			case CosaM1Package.SERVEUR__PROVIDE:
				return getProvide();
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
			case CosaM1Package.SERVEUR__RECIEVEREQUEST:
				setRecieverequest((RecieveRequest)newValue);
				return;
			case CosaM1Package.SERVEUR__PROVIDE:
				setProvide((Provide)newValue);
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
			case CosaM1Package.SERVEUR__RECIEVEREQUEST:
				setRecieverequest((RecieveRequest)null);
				return;
			case CosaM1Package.SERVEUR__PROVIDE:
				setProvide((Provide)null);
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
			case CosaM1Package.SERVEUR__RECIEVEREQUEST:
				return recieverequest != null;
			case CosaM1Package.SERVEUR__PROVIDE:
				return provide != null;
		}
		return super.eIsSet(featureID);
	}

} //ServeurImpl
