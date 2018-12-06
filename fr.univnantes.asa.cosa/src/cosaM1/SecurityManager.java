/**
 */
package cosaM1;

import cosa.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.SecurityManager#getCredentialquery <em>Credentialquery</em>}</li>
 *   <li>{@link cosaM1.SecurityManager#getSecurityauth <em>Securityauth</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getSecurityManger()
 * @model
 * @generated
 */
public interface SecurityManager extends Component {
	/**
	 * Returns the value of the '<em><b>Credentialquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentialquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentialquery</em>' containment reference.
	 * @see #setCredentialquery(CredentialQuery)
	 * @see cosaM1.CosaM1Package#getSecurityManger_Credentialquery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CredentialQuery getCredentialquery();

	/**
	 * Sets the value of the '{@link cosaM1.SecurityManager#getCredentialquery <em>Credentialquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentialquery</em>' containment reference.
	 * @see #getCredentialquery()
	 * @generated
	 */
	void setCredentialquery(CredentialQuery value);

	/**
	 * Returns the value of the '<em><b>Securityauth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityauth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityauth</em>' containment reference.
	 * @see #setSecurityauth(SecurityAuth)
	 * @see cosaM1.CosaM1Package#getSecurityManger_Securityauth()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityAuth getSecurityauth();

	/**
	 * Sets the value of the '{@link cosaM1.SecurityManager#getSecurityauth <em>Securityauth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityauth</em>' containment reference.
	 * @see #getSecurityauth()
	 * @generated
	 */
	void setSecurityauth(SecurityAuth value);

	void verifySecurity(String calledRole);
	
	ServeurDetail getSd();

	void setSd(ServeurDetail sd);

	String getSecurityauthStr();

	void setSecurityauthStr(String securityauthStr);

} // SecurityManger
