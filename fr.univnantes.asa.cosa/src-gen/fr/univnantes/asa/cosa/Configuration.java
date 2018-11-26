/**
 */
package fr.univnantes.asa.cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.asa.cosa.Configuration#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Configuration#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Configuration#getPorts <em>Ports</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Configuration#getBindings <em>Bindings</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Configuration#getAttachements <em>Attachements</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.asa.cosa.CosaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConfiguration_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConfiguration_Connectors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

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
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConfiguration_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConfiguration_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Attachements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.asa.cosa.Attachement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachements</em>' containment reference list.
	 * @see fr.univnantes.asa.cosa.CosaPackage#getConfiguration_Attachements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachement> getAttachements();

} // Configuration
