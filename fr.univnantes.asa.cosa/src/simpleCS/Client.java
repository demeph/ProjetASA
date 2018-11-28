/**
 */
package simpleCS;

import cosa.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.Client#getSend_request_in <em>Send request in</em>}</li>
 *   <li>{@link simpleCS.Client#getSend_request <em>Send request</em>}</li>
 *   <li>{@link simpleCS.Client#getSend_request_out <em>Send request out</em>}</li>
 * </ul>
 *
 * @see simpleCS.SimpleCSPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Component {
	/**
	 * Returns the value of the '<em><b>Send request in</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send request in</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send request in</em>' containment reference.
	 * @see #setSend_request_in(Send_Request_In)
	 * @see simpleCS.SimpleCSPackage#getClient_Send_request_in()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Send_Request_In getSend_request_in();

	/**
	 * Sets the value of the '{@link simpleCS.Client#getSend_request_in <em>Send request in</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send request in</em>' containment reference.
	 * @see #getSend_request_in()
	 * @generated
	 */
	void setSend_request_in(Send_Request_In value);

	/**
	 * Returns the value of the '<em><b>Send request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send request</em>' containment reference.
	 * @see #setSend_request(Send_Request)
	 * @see simpleCS.SimpleCSPackage#getClient_Send_request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Send_Request getSend_request();

	/**
	 * Sets the value of the '{@link simpleCS.Client#getSend_request <em>Send request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send request</em>' containment reference.
	 * @see #getSend_request()
	 * @generated
	 */
	void setSend_request(Send_Request value);

	/**
	 * Returns the value of the '<em><b>Send request out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send request out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send request out</em>' containment reference.
	 * @see #setSend_request_out(Send_Request_Out)
	 * @see simpleCS.SimpleCSPackage#getClient_Send_request_out()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Send_Request_Out getSend_request_out();

	/**
	 * Sets the value of the '{@link simpleCS.Client#getSend_request_out <em>Send request out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send request out</em>' containment reference.
	 * @see #getSend_request_out()
	 * @generated
	 */
	void setSend_request_out(Send_Request_Out value);

} // Client
