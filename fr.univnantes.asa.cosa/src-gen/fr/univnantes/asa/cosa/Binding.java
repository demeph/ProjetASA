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
 *   <li>{@link fr.univnantes.asa.cosa.Binding#getConfigurationProvider <em>Configuration Provider</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.Binding#getComponentSubscriber <em>Component Subscriber</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Configuration Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Provider</em>' reference.
	 * @see #setConfigurationProvider(Configuration)
	 * @see fr.univnantes.asa.cosa.CosaPackage#getBinding_ConfigurationProvider()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfigurationProvider();

	/**
	 * Sets the value of the '{@link fr.univnantes.asa.cosa.Binding#getConfigurationProvider <em>Configuration Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Provider</em>' reference.
	 * @see #getConfigurationProvider()
	 * @generated
	 */
	void setConfigurationProvider(Configuration value);

	/**
	 * Returns the value of the '<em><b>Component Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Subscriber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Subscriber</em>' reference.
	 * @see #setComponentSubscriber(Component)
	 * @see fr.univnantes.asa.cosa.CosaPackage#getBinding_ComponentSubscriber()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentSubscriber();

	/**
	 * Sets the value of the '{@link fr.univnantes.asa.cosa.Binding#getComponentSubscriber <em>Component Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Subscriber</em>' reference.
	 * @see #getComponentSubscriber()
	 * @generated
	 */
	void setComponentSubscriber(Component value);

} // Binding
