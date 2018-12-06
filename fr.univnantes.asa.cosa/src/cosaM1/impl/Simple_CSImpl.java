/**
 */
package cosaM1.impl;

import cosa.impl.ConfigurationImpl;

import cosaM1.Client;
import cosaM1.CosaM1Package;
import cosaM1.RPC;
import cosaM1.Serveur;
import cosaM1.ServeurDetail;
import cosaM1.Simple_CS;
import cosaM1.bind2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.Simple_CSImpl#getClient <em>Client</em>}</li>
 *   <li>{@link cosaM1.impl.Simple_CSImpl#getServeur <em>Serveur</em>}</li>
 *   <li>{@link cosaM1.impl.Simple_CSImpl#getServeurdetail <em>Serveurdetail</em>}</li>
 *   <li>{@link cosaM1.impl.Simple_CSImpl#getBind2 <em>Bind2</em>}</li>
 *   <li>{@link cosaM1.impl.Simple_CSImpl#getRpc <em>Rpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Simple_CSImpl extends ConfigurationImpl implements Simple_CS {
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
	 * The cached value of the '{@link #getServeurdetail() <em>Serveurdetail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeurdetail()
	 * @generated
	 * @ordered
	 */
	protected ServeurDetail serveurdetail;

	/**
	 * The cached value of the '{@link #getBind2() <em>Bind2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind2()
	 * @generated
	 * @ordered
	 */
	protected bind2 bind2;

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
	public Client getClient() {
		return client;
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
				msgs = ((InternalEObject)client).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__CLIENT, null, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__CLIENT, null, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__CLIENT, newClient, newClient));
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
	public void setServeur(Serveur newServeur) {
		if (newServeur != serveur) {
			NotificationChain msgs = null;
			if (serveur != null)
				msgs = ((InternalEObject)serveur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__SERVEUR, null, msgs);
			if (newServeur != null)
				msgs = ((InternalEObject)newServeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__SERVEUR, null, msgs);
			msgs = basicSetServeur(newServeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__SERVEUR, newServeur, newServeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurDetail getServeurdetail() {
		return serveurdetail;
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
public void setRpc(RPC newRpc) {
	if (newRpc != rpc) {
		NotificationChain msgs = null;
		if (rpc != null)
			msgs = ((InternalEObject)rpc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__RPC, null, msgs);
		if (newRpc != null)
			msgs = ((InternalEObject)newRpc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__RPC, null, msgs);
		msgs = basicSetRpc(newRpc, msgs);
		if (msgs != null) msgs.dispatch();
	}
	else if (eNotificationRequired())
		eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__RPC, newRpc, newRpc));
}


	@Override
	public void update(EnumAction action,String request) {
		switch (action) {
		case callClient:
			
			break;
		case callServeur:
			this.serveur.RecieveRequest(request);
			break;
		case callRPC:
			this.rpc.requestFromClient(request);
			break;
		case callServeurDetail:
			this.serveurdetail.update(EnumAction.callConnectionManager, this.serveur.getProvideStr());
			break;
		default:
			break;
		}
	}


//--------------------------- NOT USED -------------------------------------------------------------------------



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.SIMPLE_CS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__SERVEUR, oldServeur, newServeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServeurdetail(ServeurDetail newServeurdetail, NotificationChain msgs) {
		ServeurDetail oldServeurdetail = serveurdetail;
		serveurdetail = newServeurdetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__SERVEURDETAIL, oldServeurdetail, newServeurdetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServeurdetail(ServeurDetail newServeurdetail) {
		if (newServeurdetail != serveurdetail) {
			NotificationChain msgs = null;
			if (serveurdetail != null)
				msgs = ((InternalEObject)serveurdetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__SERVEURDETAIL, null, msgs);
			if (newServeurdetail != null)
				msgs = ((InternalEObject)newServeurdetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__SERVEURDETAIL, null, msgs);
			msgs = basicSetServeurdetail(newServeurdetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__SERVEURDETAIL, newServeurdetail, newServeurdetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bind2 getBind2() {
		return bind2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBind2(bind2 newBind2, NotificationChain msgs) {
		bind2 oldBind2 = bind2;
		bind2 = newBind2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__BIND2, oldBind2, newBind2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBind2(bind2 newBind2) {
		if (newBind2 != bind2) {
			NotificationChain msgs = null;
			if (bind2 != null)
				msgs = ((InternalEObject)bind2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__BIND2, null, msgs);
			if (newBind2 != null)
				msgs = ((InternalEObject)newBind2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SIMPLE_CS__BIND2, null, msgs);
			msgs = basicSetBind2(newBind2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__BIND2, newBind2, newBind2));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SIMPLE_CS__RPC, oldRpc, newRpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.SIMPLE_CS__CLIENT:
				return basicSetClient(null, msgs);
			case CosaM1Package.SIMPLE_CS__SERVEUR:
				return basicSetServeur(null, msgs);
			case CosaM1Package.SIMPLE_CS__SERVEURDETAIL:
				return basicSetServeurdetail(null, msgs);
			case CosaM1Package.SIMPLE_CS__BIND2:
				return basicSetBind2(null, msgs);
			case CosaM1Package.SIMPLE_CS__RPC:
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
			case CosaM1Package.SIMPLE_CS__CLIENT:
				return getClient();
			case CosaM1Package.SIMPLE_CS__SERVEUR:
				return getServeur();
			case CosaM1Package.SIMPLE_CS__SERVEURDETAIL:
				return getServeurdetail();
			case CosaM1Package.SIMPLE_CS__BIND2:
				return getBind2();
			case CosaM1Package.SIMPLE_CS__RPC:
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
			case CosaM1Package.SIMPLE_CS__CLIENT:
				setClient((Client)newValue);
				return;
			case CosaM1Package.SIMPLE_CS__SERVEUR:
				setServeur((Serveur)newValue);
				return;
			case CosaM1Package.SIMPLE_CS__SERVEURDETAIL:
				setServeurdetail((ServeurDetail)newValue);
				return;
			case CosaM1Package.SIMPLE_CS__BIND2:
				setBind2((bind2)newValue);
				return;
			case CosaM1Package.SIMPLE_CS__RPC:
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
			case CosaM1Package.SIMPLE_CS__CLIENT:
				setClient((Client)null);
				return;
			case CosaM1Package.SIMPLE_CS__SERVEUR:
				setServeur((Serveur)null);
				return;
			case CosaM1Package.SIMPLE_CS__SERVEURDETAIL:
				setServeurdetail((ServeurDetail)null);
				return;
			case CosaM1Package.SIMPLE_CS__BIND2:
				setBind2((bind2)null);
				return;
			case CosaM1Package.SIMPLE_CS__RPC:
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
			case CosaM1Package.SIMPLE_CS__CLIENT:
				return client != null;
			case CosaM1Package.SIMPLE_CS__SERVEUR:
				return serveur != null;
			case CosaM1Package.SIMPLE_CS__SERVEURDETAIL:
				return serveurdetail != null;
			case CosaM1Package.SIMPLE_CS__BIND2:
				return bind2 != null;
			case CosaM1Package.SIMPLE_CS__RPC:
				return rpc != null;
		}
		return super.eIsSet(featureID);
	}

} //Simple_CSImpl
