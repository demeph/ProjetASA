/**
 */
package simpleCS;

import cosa.CosaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simpleCS.SimpleCSFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleCSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleCS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simpleCS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleCS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleCSPackage eINSTANCE = simpleCS.impl.SimpleCSPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleCS.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.ClientImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = CosaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTS = CosaPackage.COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SERVICES = CosaPackage.COMPONENT__SERVICES;

	/**
	 * The feature id for the '<em><b>Send request in</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SEND_REQUEST_IN = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SEND_REQUEST = CosaPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Send request out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SEND_REQUEST_OUT = CosaPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleCS.impl.Simple_CSImpl <em>Simple CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.Simple_CSImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getSimple_CS()
	 * @generated
	 */
	int SIMPLE_CS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__NAME = CosaPackage.COMPOSITE_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__COMPONENTS = CosaPackage.COMPOSITE_CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__CONNECTORS = CosaPackage.COMPOSITE_CONFIGURATION__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__PORTS = CosaPackage.COMPOSITE_CONFIGURATION__PORTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__BINDINGS = CosaPackage.COMPOSITE_CONFIGURATION__BINDINGS;

	/**
	 * The feature id for the '<em><b>Attachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__ATTACHEMENTS = CosaPackage.COMPOSITE_CONFIGURATION__ATTACHEMENTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__CONFIGURATIONS = CosaPackage.COMPOSITE_CONFIGURATION__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__CLIENT = CosaPackage.COMPOSITE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__SERVEUR = CosaPackage.COMPOSITE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__RPC = CosaPackage.COMPOSITE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS_FEATURE_COUNT = CosaPackage.COMPOSITE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Simple CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS_OPERATION_COUNT = CosaPackage.COMPOSITE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleCS.impl.ServeurImpl <em>Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.ServeurImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getServeur()
	 * @generated
	 */
	int SERVEUR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__NAME = CosaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__PORTS = CosaPackage.COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__SERVICES = CosaPackage.COMPONENT__SERVICES;

	/**
	 * The number of structural features of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleCS.impl.Send_Request_InImpl <em>Send Request In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.Send_Request_InImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getSend_Request_In()
	 * @generated
	 */
	int SEND_REQUEST_IN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_IN__NAME = CosaPackage.REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_IN__PORT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Request In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_IN_FEATURE_COUNT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Request In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_IN_OPERATION_COUNT = CosaPackage.REQUIRED_PORT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link simpleCS.impl.Send_RequestImpl <em>Send Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.Send_RequestImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getSend_Request()
	 * @generated
	 */
	int SEND_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST__NAME = CosaPackage.PROVIDED_SERVICE__NAME;

	/**
	 * The number of structural features of the '<em>Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_FEATURE_COUNT = CosaPackage.PROVIDED_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST___SEND_REQUEST = CosaPackage.PROVIDED_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_OPERATION_COUNT = CosaPackage.PROVIDED_SERVICE_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link simpleCS.impl.Send_Request_OutImpl <em>Send Request Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.Send_Request_OutImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getSend_Request_Out()
	 * @generated
	 */
	int SEND_REQUEST_OUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_OUT__NAME = CosaPackage.REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_OUT__PORT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Request Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_OUT_FEATURE_COUNT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Request Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_OUT_OPERATION_COUNT = CosaPackage.REQUIRED_PORT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link simpleCS.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.RPCImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NAME = CosaPackage.CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ROLES = CosaPackage.CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = CosaPackage.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Called</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLED = CosaPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLER = CosaPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = CosaPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = CosaPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleCS.impl.callerImpl <em>caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.callerImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getcaller()
	 * @generated
	 */
	int CALLER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER__NAME = CosaPackage.PROVIDED_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_FEATURE_COUNT = CosaPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_OPERATION_COUNT = CosaPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleCS.impl.calledImpl <em>called</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleCS.impl.calledImpl
	 * @see simpleCS.impl.SimpleCSPackageImpl#getcalled()
	 * @generated
	 */
	int CALLED = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED__NAME = CosaPackage.REQUIRED_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>called</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_FEATURE_COUNT = CosaPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>called</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_OPERATION_COUNT = CosaPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link simpleCS.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see simpleCS.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.Client#getSend_request_in <em>Send request in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send request in</em>'.
	 * @see simpleCS.Client#getSend_request_in()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Send_request_in();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.Client#getSend_request <em>Send request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send request</em>'.
	 * @see simpleCS.Client#getSend_request()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Send_request();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.Client#getSend_request_out <em>Send request out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send request out</em>'.
	 * @see simpleCS.Client#getSend_request_out()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Send_request_out();

	/**
	 * Returns the meta object for class '{@link simpleCS.Simple_CS <em>Simple CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple CS</em>'.
	 * @see simpleCS.Simple_CS
	 * @generated
	 */
	EClass getSimple_CS();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.Simple_CS#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client</em>'.
	 * @see simpleCS.Simple_CS#getClient()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Client();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.Simple_CS#getServeur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serveur</em>'.
	 * @see simpleCS.Simple_CS#getServeur()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Serveur();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.Simple_CS#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpc</em>'.
	 * @see simpleCS.Simple_CS#getRpc()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Rpc();

	/**
	 * Returns the meta object for class '{@link simpleCS.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur</em>'.
	 * @see simpleCS.Serveur
	 * @generated
	 */
	EClass getServeur();

	/**
	 * Returns the meta object for class '{@link simpleCS.Send_Request_In <em>Send Request In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Request In</em>'.
	 * @see simpleCS.Send_Request_In
	 * @generated
	 */
	EClass getSend_Request_In();

	/**
	 * Returns the meta object for the attribute '{@link simpleCS.Send_Request_In#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see simpleCS.Send_Request_In#getPort()
	 * @see #getSend_Request_In()
	 * @generated
	 */
	EAttribute getSend_Request_In_Port();

	/**
	 * Returns the meta object for class '{@link simpleCS.Send_Request <em>Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Request</em>'.
	 * @see simpleCS.Send_Request
	 * @generated
	 */
	EClass getSend_Request();

	/**
	 * Returns the meta object for the '{@link simpleCS.Send_Request#sendRequest() <em>Send Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Request</em>' operation.
	 * @see simpleCS.Send_Request#sendRequest()
	 * @generated
	 */
	EOperation getSend_Request__SendRequest();

	/**
	 * Returns the meta object for class '{@link simpleCS.Send_Request_Out <em>Send Request Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Request Out</em>'.
	 * @see simpleCS.Send_Request_Out
	 * @generated
	 */
	EClass getSend_Request_Out();

	/**
	 * Returns the meta object for the attribute '{@link simpleCS.Send_Request_Out#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see simpleCS.Send_Request_Out#getPort()
	 * @see #getSend_Request_Out()
	 * @generated
	 */
	EAttribute getSend_Request_Out_Port();

	/**
	 * Returns the meta object for class '{@link simpleCS.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see simpleCS.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.RPC#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called</em>'.
	 * @see simpleCS.RPC#getCalled()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Called();

	/**
	 * Returns the meta object for the containment reference '{@link simpleCS.RPC#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller</em>'.
	 * @see simpleCS.RPC#getCaller()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Caller();

	/**
	 * Returns the meta object for class '{@link simpleCS.caller <em>caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>caller</em>'.
	 * @see simpleCS.caller
	 * @generated
	 */
	EClass getcaller();

	/**
	 * Returns the meta object for class '{@link simpleCS.called <em>called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>called</em>'.
	 * @see simpleCS.called
	 * @generated
	 */
	EClass getcalled();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleCSFactory getSimpleCSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simpleCS.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.ClientImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Send request in</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SEND_REQUEST_IN = eINSTANCE.getClient_Send_request_in();

		/**
		 * The meta object literal for the '<em><b>Send request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SEND_REQUEST = eINSTANCE.getClient_Send_request();

		/**
		 * The meta object literal for the '<em><b>Send request out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SEND_REQUEST_OUT = eINSTANCE.getClient_Send_request_out();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.Simple_CSImpl <em>Simple CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.Simple_CSImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getSimple_CS()
		 * @generated
		 */
		EClass SIMPLE_CS = eINSTANCE.getSimple_CS();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CS__CLIENT = eINSTANCE.getSimple_CS_Client();

		/**
		 * The meta object literal for the '<em><b>Serveur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CS__SERVEUR = eINSTANCE.getSimple_CS_Serveur();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CS__RPC = eINSTANCE.getSimple_CS_Rpc();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.ServeurImpl <em>Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.ServeurImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getServeur()
		 * @generated
		 */
		EClass SERVEUR = eINSTANCE.getServeur();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.Send_Request_InImpl <em>Send Request In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.Send_Request_InImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getSend_Request_In()
		 * @generated
		 */
		EClass SEND_REQUEST_IN = eINSTANCE.getSend_Request_In();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_REQUEST_IN__PORT = eINSTANCE.getSend_Request_In_Port();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.Send_RequestImpl <em>Send Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.Send_RequestImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getSend_Request()
		 * @generated
		 */
		EClass SEND_REQUEST = eINSTANCE.getSend_Request();

		/**
		 * The meta object literal for the '<em><b>Send Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_REQUEST___SEND_REQUEST = eINSTANCE.getSend_Request__SendRequest();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.Send_Request_OutImpl <em>Send Request Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.Send_Request_OutImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getSend_Request_Out()
		 * @generated
		 */
		EClass SEND_REQUEST_OUT = eINSTANCE.getSend_Request_Out();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_REQUEST_OUT__PORT = eINSTANCE.getSend_Request_Out_Port();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.RPCImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLED = eINSTANCE.getRPC_Called();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLER = eINSTANCE.getRPC_Caller();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.callerImpl <em>caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.callerImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getcaller()
		 * @generated
		 */
		EClass CALLER = eINSTANCE.getcaller();

		/**
		 * The meta object literal for the '{@link simpleCS.impl.calledImpl <em>called</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleCS.impl.calledImpl
		 * @see simpleCS.impl.SimpleCSPackageImpl#getcalled()
		 * @generated
		 */
		EClass CALLED = eINSTANCE.getcalled();

	}

} //SimpleCSPackage
