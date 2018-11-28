/**
 */
package fr.univnantes.asa.cosa;

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
 *   <li>{@link fr.univnantes.asa.cosa.Binding#getPortRequired <em>Port Required</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Binding#getPortProvided <em>Port Provided</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.asa.cosa.CosaPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Required</em>' reference.
	 * @see #setPortRequired(Port)
	 * @see fr.univnantes.asa.cosa.CosaPackage#getBinding_PortRequired()
	 * @model required="true"
	 * @generated
	 */
	Port getPortRequired();

	/**
	 * Sets the value of the '{@link fr.univnantes.asa.cosa.Binding#getPortRequired <em>Port Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Required</em>' reference.
	 * @see #getPortRequired()
	 * @generated
	 */
	void setPortRequired(Port value);

	/**
	 * Returns the value of the '<em><b>Port Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Provided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Provided</em>' reference.
	 * @see #setPortProvided(Port)
	 * @see fr.univnantes.asa.cosa.CosaPackage#getBinding_PortProvided()
	 * @model required="true"
	 * @generated
	 */
	Port getPortProvided();

	/**
	 * Sets the value of the '{@link fr.univnantes.asa.cosa.Binding#getPortProvided <em>Port Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Provided</em>' reference.
	 * @see #getPortProvided()
	 * @generated
	 */
	void setPortProvided(Port value);

} // Binding
