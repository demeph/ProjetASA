/**
 */
package cosaM1;

import cosa.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bind2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.bind2#getProvide <em>Provide</em>}</li>
 *   <li>{@link cosaM1.bind2#getExternalsocket <em>Externalsocket</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getbind2()
 * @model
 * @generated
 */
public interface bind2 extends Binding {
	/**
	 * Returns the value of the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' reference.
	 * @see #setProvide(Provide)
	 * @see cosaM1.CosaM1Package#getbind2_Provide()
	 * @model required="true"
	 * @generated
	 */
	Provide getProvide();

	/**
	 * Sets the value of the '{@link cosaM1.bind2#getProvide <em>Provide</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide</em>' reference.
	 * @see #getProvide()
	 * @generated
	 */
	void setProvide(Provide value);

	/**
	 * Returns the value of the '<em><b>Externalsocket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsocket</em>' reference.
	 * @see #setExternalsocket(ExternalSocket)
	 * @see cosaM1.CosaM1Package#getbind2_Externalsocket()
	 * @model
	 * @generated
	 */
	ExternalSocket getExternalsocket();

	/**
	 * Sets the value of the '{@link cosaM1.bind2#getExternalsocket <em>Externalsocket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket</em>' reference.
	 * @see #getExternalsocket()
	 * @generated
	 */
	void setExternalsocket(ExternalSocket value);

} // bind2
