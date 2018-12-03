/**
 */
package cosaM1;

import cosa.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attach5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.attach5#getCredentialquery <em>Credentialquery</em>}</li>
 *   <li>{@link cosaM1.attach5#getCalled <em>Called</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getattach5()
 * @model
 * @generated
 */
public interface attach5 extends Attachement {
	/**
	 * Returns the value of the '<em><b>Credentialquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentialquery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentialquery</em>' reference.
	 * @see #setCredentialquery(CredentialQuery)
	 * @see cosaM1.CosaM1Package#getattach5_Credentialquery()
	 * @model required="true"
	 * @generated
	 */
	CredentialQuery getCredentialquery();

	/**
	 * Sets the value of the '{@link cosaM1.attach5#getCredentialquery <em>Credentialquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentialquery</em>' reference.
	 * @see #getCredentialquery()
	 * @generated
	 */
	void setCredentialquery(CredentialQuery value);

	/**
	 * Returns the value of the '<em><b>Called</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called</em>' reference.
	 * @see #setCalled(called)
	 * @see cosaM1.CosaM1Package#getattach5_Called()
	 * @model
	 * @generated
	 */
	called getCalled();

	/**
	 * Sets the value of the '{@link cosaM1.attach5#getCalled <em>Called</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called</em>' reference.
	 * @see #getCalled()
	 * @generated
	 */
	void setCalled(called value);

} // attach5
