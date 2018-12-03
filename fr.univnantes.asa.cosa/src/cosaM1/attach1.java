/**
 */
package cosaM1;

import cosa.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attach1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.attach1#getSecuritycheck <em>Securitycheck</em>}</li>
 *   <li>{@link cosaM1.attach1#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getattach1()
 * @model
 * @generated
 */
public interface attach1 extends Attachement {
	/**
	 * Returns the value of the '<em><b>Securitycheck</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitycheck</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitycheck</em>' reference.
	 * @see #setSecuritycheck(SecurityCheck)
	 * @see cosaM1.CosaM1Package#getattach1_Securitycheck()
	 * @model
	 * @generated
	 */
	SecurityCheck getSecuritycheck();

	/**
	 * Sets the value of the '{@link cosaM1.attach1#getSecuritycheck <em>Securitycheck</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitycheck</em>' reference.
	 * @see #getSecuritycheck()
	 * @generated
	 */
	void setSecuritycheck(SecurityCheck value);

	/**
	 * Returns the value of the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' reference.
	 * @see #setCaller(caller)
	 * @see cosaM1.CosaM1Package#getattach1_Caller()
	 * @model
	 * @generated
	 */
	caller getCaller();

	/**
	 * Sets the value of the '{@link cosaM1.attach1#getCaller <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(caller value);

} // attach1
