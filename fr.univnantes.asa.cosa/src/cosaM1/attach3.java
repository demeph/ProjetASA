/**
 */
package cosaM1;

import cosa.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attach3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.attach3#getDbquery <em>Dbquery</em>}</li>
 *   <li>{@link cosaM1.attach3#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getattach3()
 * @model
 * @generated
 */
public interface attach3 extends Attachement {
	/**
	 * Returns the value of the '<em><b>Dbquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbquery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbquery</em>' reference.
	 * @see #setDbquery(DBQuery)
	 * @see cosaM1.CosaM1Package#getattach3_Dbquery()
	 * @model required="true"
	 * @generated
	 */
	DBQuery getDbquery();

	/**
	 * Sets the value of the '{@link cosaM1.attach3#getDbquery <em>Dbquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbquery</em>' reference.
	 * @see #getDbquery()
	 * @generated
	 */
	void setDbquery(DBQuery value);

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
	 * @see cosaM1.CosaM1Package#getattach3_Caller()
	 * @model
	 * @generated
	 */
	caller getCaller();

	/**
	 * Sets the value of the '{@link cosaM1.attach3#getCaller <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(caller value);

} // attach3
