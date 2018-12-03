/**
 */
package cosaM1;

import cosa.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bind1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.bind1#getExternalsocket <em>Externalsocket</em>}</li>
 *   <li>{@link cosaM1.bind1#getConnectionMangerexternalsocket <em>Connection Mangerexternalsocket</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getbind1()
 * @model
 * @generated
 */
public interface bind1 extends Binding {
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
	 * @see cosaM1.CosaM1Package#getbind1_Externalsocket()
	 * @model required="true"
	 * @generated
	 */
	ExternalSocket getExternalsocket();

	/**
	 * Sets the value of the '{@link cosaM1.bind1#getExternalsocket <em>Externalsocket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket</em>' reference.
	 * @see #getExternalsocket()
	 * @generated
	 */
	void setExternalsocket(ExternalSocket value);

	/**
	 * Returns the value of the '<em><b>Connection Mangerexternalsocket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Mangerexternalsocket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Mangerexternalsocket</em>' reference.
	 * @see #setConnectionMangerexternalsocket(ExternalSocket)
	 * @see cosaM1.CosaM1Package#getbind1_ConnectionMangerexternalsocket()
	 * @model required="true"
	 * @generated
	 */
	ExternalSocket getConnectionMangerexternalsocket();

	/**
	 * Sets the value of the '{@link cosaM1.bind1#getConnectionMangerexternalsocket <em>Connection Mangerexternalsocket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Mangerexternalsocket</em>' reference.
	 * @see #getConnectionMangerexternalsocket()
	 * @generated
	 */
	void setConnectionMangerexternalsocket(ExternalSocket value);

} // bind1
