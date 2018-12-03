/**
 */
package cosaM1;

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
 *   <li>{@link cosaM1.Client#getSendrequest <em>Sendrequest</em>}</li>
 *   <li>{@link cosaM1.Client#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getClient()
 * @model
 * @generated
 */
public interface Client extends Component {
	/**
	 * Returns the value of the '<em><b>Sendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendrequest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendrequest</em>' containment reference.
	 * @see #setSendrequest(SendRequest)
	 * @see cosaM1.CosaM1Package#getClient_Sendrequest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SendRequest getSendrequest();

	/**
	 * Sets the value of the '{@link cosaM1.Client#getSendrequest <em>Sendrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendrequest</em>' containment reference.
	 * @see #getSendrequest()
	 * @generated
	 */
	void setSendrequest(SendRequest value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Request)
	 * @see cosaM1.CosaM1Package#getClient_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link cosaM1.Client#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

} // Client
