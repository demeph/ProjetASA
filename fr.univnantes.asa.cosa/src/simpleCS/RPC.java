/**
 */
package simpleCS;

import cosa.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.RPC#getCalled <em>Called</em>}</li>
 *   <li>{@link simpleCS.RPC#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @see simpleCS.SimpleCSPackage#getRPC()
 * @model
 * @generated
 */
public interface RPC extends Connector {
	/**
	 * Returns the value of the '<em><b>Called</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called</em>' containment reference.
	 * @see #setCalled(called)
	 * @see simpleCS.SimpleCSPackage#getRPC_Called()
	 * @model containment="true" required="true"
	 * @generated
	 */
	called getCalled();

	/**
	 * Sets the value of the '{@link simpleCS.RPC#getCalled <em>Called</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called</em>' containment reference.
	 * @see #getCalled()
	 * @generated
	 */
	void setCalled(called value);

	/**
	 * Returns the value of the '<em><b>Caller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' containment reference.
	 * @see #setCaller(caller)
	 * @see simpleCS.SimpleCSPackage#getRPC_Caller()
	 * @model containment="true" required="true"
	 * @generated
	 */
	caller getCaller();

	/**
	 * Sets the value of the '{@link simpleCS.RPC#getCaller <em>Caller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' containment reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(caller value);

} // RPC
