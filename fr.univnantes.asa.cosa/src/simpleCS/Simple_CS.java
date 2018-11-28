/**
 */
package simpleCS;

import cosa.CompositeConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.Simple_CS#getClient <em>Client</em>}</li>
 *   <li>{@link simpleCS.Simple_CS#getServeur <em>Serveur</em>}</li>
 *   <li>{@link simpleCS.Simple_CS#getRpc <em>Rpc</em>}</li>
 * </ul>
 *
 * @see simpleCS.SimpleCSPackage#getSimple_CS()
 * @model
 * @generated
 */
public interface Simple_CS extends CompositeConfiguration {
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
	 * @see simpleCS.SimpleCSPackage#getSimple_CS_Client()
	 * @model containment="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link simpleCS.Simple_CS#getClient <em>Client</em>}' containment reference.
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
	 * @see simpleCS.SimpleCSPackage#getSimple_CS_Serveur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Serveur getServeur();

	/**
	 * Sets the value of the '{@link simpleCS.Simple_CS#getServeur <em>Serveur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur</em>' containment reference.
	 * @see #getServeur()
	 * @generated
	 */
	void setServeur(Serveur value);

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
	 * @see simpleCS.SimpleCSPackage#getSimple_CS_Rpc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RPC getRpc();

	/**
	 * Sets the value of the '{@link simpleCS.Simple_CS#getRpc <em>Rpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc</em>' containment reference.
	 * @see #getRpc()
	 * @generated
	 */
	void setRpc(RPC value);

} // Simple_CS
