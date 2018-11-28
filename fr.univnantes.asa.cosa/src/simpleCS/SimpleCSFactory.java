/**
 */
package simpleCS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleCS.SimpleCSPackage
 * @generated
 */
public interface SimpleCSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleCSFactory eINSTANCE = simpleCS.impl.SimpleCSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Simple CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple CS</em>'.
	 * @generated
	 */
	Simple_CS createSimple_CS();

	/**
	 * Returns a new object of class '<em>Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur</em>'.
	 * @generated
	 */
	Serveur createServeur();

	/**
	 * Returns a new object of class '<em>Send Request In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Request In</em>'.
	 * @generated
	 */
	Send_Request_In createSend_Request_In();

	/**
	 * Returns a new object of class '<em>Send Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Request</em>'.
	 * @generated
	 */
	Send_Request createSend_Request();

	/**
	 * Returns a new object of class '<em>Send Request Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Request Out</em>'.
	 * @generated
	 */
	Send_Request_Out createSend_Request_Out();

	/**
	 * Returns a new object of class '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC</em>'.
	 * @generated
	 */
	RPC createRPC();

	/**
	 * Returns a new object of class '<em>caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>caller</em>'.
	 * @generated
	 */
	caller createcaller();

	/**
	 * Returns a new object of class '<em>called</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>called</em>'.
	 * @generated
	 */
	called createcalled();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleCSPackage getSimpleCSPackage();

} //SimpleCSFactory
