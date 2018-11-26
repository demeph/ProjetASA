/**
 */
package fr.univnantes.asa.cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.asa.cosa.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Component#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.asa.cosa.CosaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getComponent_Ports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getComponent_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

} // Component
