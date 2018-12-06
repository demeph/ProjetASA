/**
 */
package cosaM1;

import cosa.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.ConnectionManager#getExternalsocket <em>Externalsocket</em>}</li>
 *   <li>{@link cosaM1.ConnectionManager#getDbquery <em>Dbquery</em>}</li>
 *   <li>{@link cosaM1.ConnectionManager#getSecuritycheck <em>Securitycheck</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getConnectionManager()
 * @model
 * @generated
 */
public interface ConnectionManager extends Component {
	/**
	 * Returns the value of the '<em><b>Externalsocket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsocket</em>' containment reference.
	 * @see #setExternalsocket(ExternalSocket)
	 * @see cosaM1.CosaM1Package#getConnectionManager_Externalsocket()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExternalSocket getExternalsocket();

	/**
	 * Sets the value of the '{@link cosaM1.ConnectionManager#getExternalsocket <em>Externalsocket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket</em>' containment reference.
	 * @see #getExternalsocket()
	 * @generated
	 */
	void setExternalsocket(ExternalSocket value);

	/**
	 * Returns the value of the '<em><b>Dbquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbquery</em>' containment reference.
	 * @see #setDbquery(DBQuery)
	 * @see cosaM1.CosaM1Package#getConnectionManager_Dbquery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBQuery getDbquery();

	/**
	 * Sets the value of the '{@link cosaM1.ConnectionManager#getDbquery <em>Dbquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbquery</em>' containment reference.
	 * @see #getDbquery()
	 * @generated
	 */
	void setDbquery(DBQuery value);

	/**
	 * Returns the value of the '<em><b>Securitycheck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitycheck</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitycheck</em>' containment reference.
	 * @see #setSecuritycheck(SecurityCheck)
	 * @see cosaM1.CosaM1Package#getConnectionManager_Securitycheck()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityCheck getSecuritycheck();

	/**
	 * Sets the value of the '{@link cosaM1.ConnectionManager#getSecuritycheck <em>Securitycheck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitycheck</em>' containment reference.
	 * @see #getSecuritycheck()
	 * @generated
	 */
	void setSecuritycheck(SecurityCheck value);
	
	
	void requestFromSD(String request);

	String getExtSocketStr();

	void setExtSocketStr(String extSocketStr);

} // ConnectionManager
