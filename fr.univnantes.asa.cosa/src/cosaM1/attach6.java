/**
 */
package cosaM1;

import cosa.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attach6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.attach6#getSecuritymanagement <em>Securitymanagement</em>}</li>
 *   <li>{@link cosaM1.attach6#getCalled <em>Called</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getattach6()
 * @model
 * @generated
 */
public interface attach6 extends Attachement {
	/**
	 * Returns the value of the '<em><b>Securitymanagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanagement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanagement</em>' reference.
	 * @see #setSecuritymanagement(SecurityManagement)
	 * @see cosaM1.CosaM1Package#getattach6_Securitymanagement()
	 * @model
	 * @generated
	 */
	SecurityManagement getSecuritymanagement();

	/**
	 * Sets the value of the '{@link cosaM1.attach6#getSecuritymanagement <em>Securitymanagement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanagement</em>' reference.
	 * @see #getSecuritymanagement()
	 * @generated
	 */
	void setSecuritymanagement(SecurityManagement value);

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
	 * @see cosaM1.CosaM1Package#getattach6_Called()
	 * @model
	 * @generated
	 */
	called getCalled();

	/**
	 * Sets the value of the '{@link cosaM1.attach6#getCalled <em>Called</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called</em>' reference.
	 * @see #getCalled()
	 * @generated
	 */
	void setCalled(called value);

} // attach6
