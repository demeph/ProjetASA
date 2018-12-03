/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Connector#getConnectorinterface <em>Connectorinterface</em>}</li>
 *   <li>{@link cosa.Connector#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Connectorinterface</b></em>' reference list.
	 * The list contents are of type {@link cosa.ConnectorInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectorinterface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorinterface</em>' reference list.
	 * @see cosa.CosaPackage#getConnector_Connectorinterface()
	 * @model
	 * @generated
	 */
	EList<ConnectorInterface> getConnectorinterface();

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
	 * @see cosa.CosaPackage#getConnector_Glue()
	 * @model containment="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link cosa.Connector#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

} // Connector
