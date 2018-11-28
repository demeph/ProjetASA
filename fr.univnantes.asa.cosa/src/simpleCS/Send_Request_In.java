/**
 */
package simpleCS;

import cosa.RequiredPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Request In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.Send_Request_In#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see simpleCS.SimpleCSPackage#getSend_Request_In()
 * @model
 * @generated
 */
public interface Send_Request_In extends RequiredPort {

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see simpleCS.SimpleCSPackage#getSend_Request_In_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link simpleCS.Send_Request_In#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);
} // Send_Request_In
