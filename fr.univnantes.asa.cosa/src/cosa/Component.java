/**
 */
package cosa;

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
 *   <li>{@link cosa.Component#getComponentinterface <em>Componentinterface</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Componentinterface</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.ComponentInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentinterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentinterface</em>' containment reference list.
	 * @see cosa.CosaPackage#getComponent_Componentinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInterface> getComponentinterface();

} // Component
