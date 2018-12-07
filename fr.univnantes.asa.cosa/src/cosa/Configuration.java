/**
 */
package cosa;

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
 *   <li>{@link cosa.Configuration#getComponents <em>Components</em>}</li>
 *   <li>{@link cosa.Configuration#getCofigurationinterface <em>Cofigurationinterface</em>}</li>
 *   <li>{@link cosa.Configuration#getAttachements <em>Attachements</em>}</li>
 *   <li>{@link cosa.Configuration#getBindings <em>Bindings</em>}</li>
 *   <li>{@link cosa.Configuration#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends ComposedElement, Subject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Cofigurationinterface</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cofigurationinterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cofigurationinterface</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Cofigurationinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getCofigurationinterface();

	/**
	 * Returns the value of the '<em><b>Attachements</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Attachement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachements</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Attachements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachement> getAttachements();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();
	
	@Override
	void register(Observer obs);
	
	@Override
	void removeObs(Observer obs);
	
	@Override
	void notifyObs();

} // Configuration
