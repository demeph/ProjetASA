/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.CompositeConfiguration#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getCompositeConfiguration()
 * @model
 * @generated
 */
public interface CompositeConfiguration extends Configuration {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see cosa.CosaPackage#getCompositeConfiguration_Configurations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

} // CompositeConfiguration
