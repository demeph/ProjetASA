/**
 */
package fr.univnantes.asa.cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.asa.cosa.Connector#getRoles <em>Roles</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Connector#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.asa.cosa.CosaPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConnector_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConnector_Glue()
	 * @model containment="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link fr.univnantes.asa.cosa.Connector#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

} // Connector
