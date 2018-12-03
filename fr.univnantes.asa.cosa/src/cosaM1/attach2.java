/**
 */
package cosaM1;

import cosa.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attach2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.attach2#getSecurityauth <em>Securityauth</em>}</li>
 *   <li>{@link cosaM1.attach2#getCalled <em>Called</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getattach2()
 * @model
 * @generated
 */
public interface attach2 extends Attachement {
	/**
	 * Returns the value of the '<em><b>Securityauth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityauth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityauth</em>' reference.
	 * @see #setSecurityauth(SecurityAuth)
	 * @see cosaM1.CosaM1Package#getattach2_Securityauth()
	 * @model required="true"
	 * @generated
	 */
	SecurityAuth getSecurityauth();

	/**
	 * Sets the value of the '{@link cosaM1.attach2#getSecurityauth <em>Securityauth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityauth</em>' reference.
	 * @see #getSecurityauth()
	 * @generated
	 */
	void setSecurityauth(SecurityAuth value);

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
	 * @see cosaM1.CosaM1Package#getattach2_Called()
	 * @model required="true"
	 * @generated
	 */
	called getCalled();

	/**
	 * Sets the value of the '{@link cosaM1.attach2#getCalled <em>Called</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called</em>' reference.
	 * @see #getCalled()
	 * @generated
	 */
	void setCalled(called value);

} // attach2
