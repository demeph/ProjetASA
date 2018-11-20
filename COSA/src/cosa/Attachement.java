/**
 */
package cosa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Attachement#getRole <em>Role</em>}</li>
 *   <li>{@link cosa.Attachement#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getAttachement()
 * @model
 * @generated
 */
public interface Attachement extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Role)
	 * @see cosa.CosaPackage#getAttachement_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link cosa.Attachement#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(Port)
	 * @see cosa.CosaPackage#getAttachement_Port()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link cosa.Attachement#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // Attachement
