/**
 */
package cosa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Binding#getPortProvided <em>Port Provided</em>}</li>
 *   <li>{@link cosa.Binding#getPortRequired <em>Port Required</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Provided</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Provided</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Provided</em>' containment reference.
	 * @see #setPortProvided(Port)
	 * @see cosa.CosaPackage#getBinding_PortProvided()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Port getPortProvided();

	/**
	 * Sets the value of the '{@link cosa.Binding#getPortProvided <em>Port Provided</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Provided</em>' containment reference.
	 * @see #getPortProvided()
	 * @generated
	 */
	void setPortProvided(Port value);

	/**
	 * Returns the value of the '<em><b>Port Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Required</em>' containment reference.
	 * @see #setPortRequired(Port)
	 * @see cosa.CosaPackage#getBinding_PortRequired()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Port getPortRequired();

	/**
	 * Sets the value of the '{@link cosa.Binding#getPortRequired <em>Port Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Required</em>' containment reference.
	 * @see #getPortRequired()
	 * @generated
	 */
	void setPortRequired(Port value);

} // Binding
