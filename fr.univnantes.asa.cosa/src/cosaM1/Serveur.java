/**
 */
package cosaM1;

import cosa.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.Serveur#getRecieverequest <em>Recieverequest</em>}</li>
 *   <li>{@link cosaM1.Serveur#getProvide <em>Provide</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getServeur()
 * @model
 * @generated
 */
public interface Serveur extends Component {
	/**
	 * Returns the value of the '<em><b>Recieverequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recieverequest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recieverequest</em>' containment reference.
	 * @see #setRecieverequest(RecieveRequest)
	 * @see cosaM1.CosaM1Package#getServeur_Recieverequest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RecieveRequest getRecieverequest();

	/**
	 * Sets the value of the '{@link cosaM1.Serveur#getRecieverequest <em>Recieverequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recieverequest</em>' containment reference.
	 * @see #getRecieverequest()
	 * @generated
	 */
	void setRecieverequest(RecieveRequest value);

	/**
	 * Returns the value of the '<em><b>Provide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' containment reference.
	 * @see #setProvide(Provide)
	 * @see cosaM1.CosaM1Package#getServeur_Provide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Provide getProvide();

	/**
	 * Sets the value of the '{@link cosaM1.Serveur#getProvide <em>Provide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide</em>' containment reference.
	 * @see #getProvide()
	 * @generated
	 */
	void setProvide(Provide value);

} // Serveur
