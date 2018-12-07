/**
 */
package cosaM1;

import cosa.Configuration;
import cosa.Observer;
import cosaM1.impl.EnumAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.Simple_CS#getClient <em>Client</em>}</li>
 *   <li>{@link cosaM1.Simple_CS#getServeur <em>Serveur</em>}</li>
 *   <li>{@link cosaM1.Simple_CS#getServeurdetail <em>Serveurdetail</em>}</li>
 *   <li>{@link cosaM1.Simple_CS#getBind2 <em>Bind2</em>}</li>
 *   <li>{@link cosaM1.Simple_CS#getRpc <em>Rpc</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getSimple_CS()
 * @model
 * @generated
 */
public interface Simple_CS extends Configuration {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference.
	 * @see #setClient(Client)
	 * @see cosaM1.CosaM1Package#getSimple_CS_Client()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link cosaM1.Simple_CS#getClient <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' containment reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Serveur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur</em>' containment reference.
	 * @see #setServeur(Serveur)
	 * @see cosaM1.CosaM1Package#getSimple_CS_Serveur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Serveur getServeur();

	/**
	 * Sets the value of the '{@link cosaM1.Simple_CS#getServeur <em>Serveur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur</em>' containment reference.
	 * @see #getServeur()
	 * @generated
	 */
	void setServeur(Serveur value);

	/**
	 * Returns the value of the '<em><b>Serveurdetail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveurdetail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveurdetail</em>' containment reference.
	 * @see #setServeurdetail(ServeurDetail)
	 * @see cosaM1.CosaM1Package#getSimple_CS_Serveurdetail()
	 * @model containment="true"
	 * @generated
	 */
	ServeurDetail getServeurdetail();

	/**
	 * Sets the value of the '{@link cosaM1.Simple_CS#getServeurdetail <em>Serveurdetail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveurdetail</em>' containment reference.
	 * @see #getServeurdetail()
	 * @generated
	 */
	void setServeurdetail(ServeurDetail value);

	/**
	 * Returns the value of the '<em><b>Bind2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind2</em>' containment reference.
	 * @see #setBind2(bind2)
	 * @see cosaM1.CosaM1Package#getSimple_CS_Bind2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	bind2 getBind2();

	/**
	 * Sets the value of the '{@link cosaM1.Simple_CS#getBind2 <em>Bind2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind2</em>' containment reference.
	 * @see #getBind2()
	 * @generated
	 */
	void setBind2(bind2 value);

	/**
	 * Returns the value of the '<em><b>Rpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc</em>' containment reference.
	 * @see #setRpc(RPC)
	 * @see cosaM1.CosaM1Package#getSimple_CS_Rpc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RPC getRpc();

	/**
	 * Sets the value of the '{@link cosaM1.Simple_CS#getRpc <em>Rpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc</em>' containment reference.
	 * @see #getRpc()
	 * @generated
	 */
	void setRpc(RPC value);

	void handleRequest(EnumAction action, String request);

	@Override
	void register(Observer obs);

	@Override
	void removeObs(Observer obs);

	@Override
	void notifyObs();

	void setAction(EnumAction action);

	void handleResponse();
	
	

} // Simple_CS
