/**
 */
package simpleCS.impl;

import cosa.impl.CompositeConfigurationImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import simpleCS.Client;
import simpleCS.RPC;
import simpleCS.Serveur;
import simpleCS.SimpleCSPackage;
import simpleCS.Simple_CS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.impl.Simple_CSImpl#getClient <em>Client</em>}</li>
 *   <li>{@link simpleCS.impl.Simple_CSImpl#getServeur <em>Serveur</em>}</li>
 *   <li>{@link simpleCS.impl.Simple_CSImpl#getRpc <em>Rpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Simple_CSImpl extends CompositeConfigurationImpl implements Simple_CS {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The cached value of the '{@link #getServeur() <em>Serveur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur()
	 * @generated
	 * @ordered
	 */
	protected Serveur serveur;

	/**
	 * The cached value of the '{@link #getRpc() <em>Rpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected RPC rpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simple_CSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleCSPackage.Literals.SIMPLE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.SIMPLE_CS__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.SIMPLE_CS__CLIENT, null, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.SIMPLE_CS__CLIENT, null, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.SIMPLE_CS__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur getServeur() {
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServeur(Serveur newServeur, NotificationChain msgs) {
		Serveur oldServeur = serveur;
		serveur = newServeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.SIMPLE_CS__SERVEUR, oldServeur, newServeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServeur(Serveur newServeur) {
		if (newServeur != serveur) {
			NotificationChain msgs = null;
			if (serveur != null)
				msgs = ((InternalEObject)serveur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.SIMPLE_CS__SERVEUR, null, msgs);
			if (newServeur != null)
				msgs = ((InternalEObject)newServeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.SIMPLE_CS__SERVEUR, null, msgs);
			msgs = basicSetServeur(newServeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.SIMPLE_CS__SERVEUR, newServeur, newServeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC getRpc() {
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRpc(RPC newRpc, NotificationChain msgs) {
		RPC oldRpc = rpc;
		rpc = newRpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.SIMPLE_CS__RPC, oldRpc, newRpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpc(RPC newRpc) {
		if (newRpc != rpc) {
			NotificationChain msgs = null;
			if (rpc != null)
				msgs = ((InternalEObject)rpc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.SIMPLE_CS__RPC, null, msgs);
			if (newRpc != null)
				msgs = ((InternalEObject)newRpc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.SIMPLE_CS__RPC, null, msgs);
			msgs = basicSetRpc(newRpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.SIMPLE_CS__RPC, newRpc, newRpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleCSPackage.SIMPLE_CS__CLIENT:
				return basicSetClient(null, msgs);
			case SimpleCSPackage.SIMPLE_CS__SERVEUR:
				return basicSetServeur(null, msgs);
			case SimpleCSPackage.SIMPLE_CS__RPC:
				return basicSetRpc(null, msgs);
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
			case SimpleCSPackage.SIMPLE_CS__CLIENT:
				return getClient();
			case SimpleCSPackage.SIMPLE_CS__SERVEUR:
				return getServeur();
			case SimpleCSPackage.SIMPLE_CS__RPC:
				return getRpc();
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
			case SimpleCSPackage.SIMPLE_CS__CLIENT:
				setClient((Client)newValue);
				return;
			case SimpleCSPackage.SIMPLE_CS__SERVEUR:
				setServeur((Serveur)newValue);
				return;
			case SimpleCSPackage.SIMPLE_CS__RPC:
				setRpc((RPC)newValue);
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
			case SimpleCSPackage.SIMPLE_CS__CLIENT:
				setClient((Client)null);
				return;
			case SimpleCSPackage.SIMPLE_CS__SERVEUR:
				setServeur((Serveur)null);
				return;
			case SimpleCSPackage.SIMPLE_CS__RPC:
				setRpc((RPC)null);
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
			case SimpleCSPackage.SIMPLE_CS__CLIENT:
				return client != null;
			case SimpleCSPackage.SIMPLE_CS__SERVEUR:
				return serveur != null;
			case SimpleCSPackage.SIMPLE_CS__RPC:
				return rpc != null;
		}
		return super.eIsSet(featureID);
	}

} //Simple_CSImpl
