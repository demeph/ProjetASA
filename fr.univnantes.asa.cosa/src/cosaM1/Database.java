/**
 */
package cosaM1;

import cosa.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.Database#getSecuritymanagement <em>Securitymanagement</em>}</li>
 *   <li>{@link cosaM1.Database#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getDatabase()
 * @model
 * @generated
 */
public interface Database extends Component {
	/**
	 * Returns the value of the '<em><b>Securitymanagement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanagement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanagement</em>' containment reference.
	 * @see #setSecuritymanagement(SecurityManagement)
	 * @see cosaM1.CosaM1Package#getDatabase_Securitymanagement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityManagement getSecuritymanagement();

	/**
	 * Sets the value of the '{@link cosaM1.Database#getSecuritymanagement <em>Securitymanagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanagement</em>' containment reference.
	 * @see #getSecuritymanagement()
	 * @generated
	 */
	void setSecuritymanagement(SecurityManagement value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see cosaM1.CosaM1Package#getDatabase_Query()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link cosaM1.Database#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // Database
