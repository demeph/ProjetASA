/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.ComposedElement#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getComposedElement()
 * @model abstract="true"
 * @generated
 */
public interface ComposedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.ComposedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see cosa.CosaPackage#getComposedElement_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComposedElement> getElements();

} // ComposedElement
