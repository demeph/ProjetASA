/**
 */
package cosaM1;

import cosa.CosaPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see cosaM1.CosaM1Factory
 * @model kind="package"
 * @generated
 */
public interface CosaM1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cosaM1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cosaM1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cosaM1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CosaM1Package eINSTANCE = cosaM1.impl.CosaM1PackageImpl.init();

	/**
	 * The meta object id for the '{@link cosaM1.impl.Simple_CSImpl <em>Simple CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.Simple_CSImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSimple_CS()
	 * @generated
	 */
	int SIMPLE_CS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__NAME = CosaPackage.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__ELEMENTS = CosaPackage.CONFIGURATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__COMPONENTS = CosaPackage.CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Cofigurationinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__COFIGURATIONINTERFACE = CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE;

	/**
	 * The feature id for the '<em><b>Attachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__ATTACHEMENTS = CosaPackage.CONFIGURATION__ATTACHEMENTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__BINDINGS = CosaPackage.CONFIGURATION__BINDINGS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__CONNECTORS = CosaPackage.CONFIGURATION__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__CLIENT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__SERVEUR = CosaPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serveurdetail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__SERVEURDETAIL = CosaPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bind2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__BIND2 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS__RPC = CosaPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Simple CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS_FEATURE_COUNT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Simple CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CS_OPERATION_COUNT = CosaPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.ClientImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = CosaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Componentinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__COMPONENTINTERFACE = CosaPackage.COMPONENT__COMPONENTINTERFACE;

	/**
	 * The feature id for the '<em><b>Sendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SENDREQUEST = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__REQUEST = CosaPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.ServeurImpl <em>Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.ServeurImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getServeur()
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
	 * The feature id for the '<em><b>Componentinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__COMPONENTINTERFACE = CosaPackage.COMPONENT__COMPONENTINTERFACE;

	/**
	 * The feature id for the '<em><b>Recieverequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__RECIEVEREQUEST = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__PROVIDE = CosaPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.ServeurDetailImpl <em>Serveur Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.ServeurDetailImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getServeurDetail()
	 * @generated
	 */
	int SERVEUR_DETAIL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__NAME = CosaPackage.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ELEMENTS = CosaPackage.CONFIGURATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__COMPONENTS = CosaPackage.CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Cofigurationinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__COFIGURATIONINTERFACE = CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE;

	/**
	 * The feature id for the '<em><b>Attachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHEMENTS = CosaPackage.CONFIGURATION__ATTACHEMENTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__BINDINGS = CosaPackage.CONFIGURATION__BINDINGS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CONNECTORS = CosaPackage.CONFIGURATION__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Externalsocket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__EXTERNALSOCKET = CosaPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectionmanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CONNECTIONMANAGER = CosaPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Securitymanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__SECURITYMANAGER = CosaPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__DATABASE = CosaPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sqlquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__SQLQUERY = CosaPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Clerancerequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CLERANCEREQUEST = CosaPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attach1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACH1 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attach2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACH2 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attach3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACH3 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attach4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACH4 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attach5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACH5 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attach6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACH6 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Bind1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__BIND1 = CosaPackage.CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Securityquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__SECURITYQUERY = CosaPackage.CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Serveur Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL_FEATURE_COUNT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Serveur Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL_OPERATION_COUNT = CosaPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.RequestImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = CosaPackage.REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TYPE = CosaPackage.REQUIRED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = CosaPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SendRequestImpl <em>Send Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SendRequestImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSendRequest()
	 * @generated
	 */
	int SEND_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST__NAME = CosaPackage.REQUIRED_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST__RETURN_TYPE = CosaPackage.REQUIRED_SERVICE__RETURN_TYPE;

	/**
	 * The number of structural features of the '<em>Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_FEATURE_COUNT = CosaPackage.REQUIRED_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_REQUEST_OPERATION_COUNT = CosaPackage.REQUIRED_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.ProvideImpl <em>Provide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.ProvideImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getProvide()
	 * @generated
	 */
	int PROVIDE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE__NAME = CosaPackage.PROVIDED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE__TYPE = CosaPackage.PROVIDED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Provide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_FEATURE_COUNT = CosaPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_OPERATION_COUNT = CosaPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.RecieveRequestImpl <em>Recieve Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.RecieveRequestImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getRecieveRequest()
	 * @generated
	 */
	int RECIEVE_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_REQUEST__NAME = CosaPackage.PROVIDED_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_REQUEST__RETURN_TYPE = CosaPackage.PROVIDED_SERVICE__RETURN_TYPE;

	/**
	 * The number of structural features of the '<em>Recieve Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_REQUEST_FEATURE_COUNT = CosaPackage.PROVIDED_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recieve Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_REQUEST_OPERATION_COUNT = CosaPackage.PROVIDED_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.ExternalSocketImpl <em>External Socket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.ExternalSocketImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getExternalSocket()
	 * @generated
	 */
	int EXTERNAL_SOCKET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOCKET__NAME = CosaPackage.PROVIDED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOCKET__TYPE = CosaPackage.PROVIDED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>External Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOCKET_FEATURE_COUNT = CosaPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOCKET_OPERATION_COUNT = CosaPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.ConnectionManagerImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__NAME = CosaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Componentinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__COMPONENTINTERFACE = CosaPackage.COMPONENT__COMPONENTINTERFACE;

	/**
	 * The feature id for the '<em><b>Externalsocket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__EXTERNALSOCKET = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dbquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__DBQUERY = CosaPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Securitycheck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__SECURITYCHECK = CosaPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SecurityMangerImpl <em>Security Manger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SecurityMangerImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityManger()
	 * @generated
	 */
	int SECURITY_MANGER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANGER__NAME = CosaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Componentinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANGER__COMPONENTINTERFACE = CosaPackage.COMPONENT__COMPONENTINTERFACE;

	/**
	 * The feature id for the '<em><b>Credentialquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANGER__CREDENTIALQUERY = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityauth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANGER__SECURITYAUTH = CosaPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Manger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANGER_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Manger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANGER_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.DatabaseImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = CosaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Componentinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__COMPONENTINTERFACE = CosaPackage.COMPONENT__COMPONENTINTERFACE;

	/**
	 * The feature id for the '<em><b>Securitymanagement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SECURITYMANAGEMENT = CosaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__QUERY = CosaPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = CosaPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = CosaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.DBQueryImpl <em>DB Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.DBQueryImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getDBQuery()
	 * @generated
	 */
	int DB_QUERY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_QUERY__NAME = CosaPackage.PROVIDED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_QUERY__TYPE = CosaPackage.PROVIDED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>DB Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_QUERY_FEATURE_COUNT = CosaPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DB Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_QUERY_OPERATION_COUNT = CosaPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SecurityCheckImpl <em>Security Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SecurityCheckImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityCheck()
	 * @generated
	 */
	int SECURITY_CHECK = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK__NAME = CosaPackage.REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK__TYPE = CosaPackage.REQUIRED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Security Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK_FEATURE_COUNT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CHECK_OPERATION_COUNT = CosaPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SecurityAuthImpl <em>Security Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SecurityAuthImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityAuth()
	 * @generated
	 */
	int SECURITY_AUTH = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_AUTH__NAME = CosaPackage.PROVIDED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_AUTH__TYPE = CosaPackage.PROVIDED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Security Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_AUTH_FEATURE_COUNT = CosaPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_AUTH_OPERATION_COUNT = CosaPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.CredentialQueryImpl <em>Credential Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.CredentialQueryImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getCredentialQuery()
	 * @generated
	 */
	int CREDENTIAL_QUERY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_QUERY__NAME = CosaPackage.PROVIDED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_QUERY__TYPE = CosaPackage.PROVIDED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Credential Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_QUERY_FEATURE_COUNT = CosaPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credential Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_QUERY_OPERATION_COUNT = CosaPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SQLQueryImpl <em>SQL Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SQLQueryImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSQLQuery()
	 * @generated
	 */
	int SQL_QUERY = 16;

	/**
	 * The feature id for the '<em><b>Connectorinterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CONNECTORINTERFACE = CosaPackage.CONNECTOR__CONNECTORINTERFACE;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__GLUE = CosaPackage.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CALLER = CosaPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CALLED = CosaPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQL Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_FEATURE_COUNT = CosaPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SQL Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_OPERATION_COUNT = CosaPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.calledImpl <em>called</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.calledImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getcalled()
	 * @generated
	 */
	int CALLED = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED__NAME = CosaPackage.PROVIDED_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED__TYPE = CosaPackage.PROVIDED_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>called</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_FEATURE_COUNT = CosaPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>called</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_OPERATION_COUNT = CosaPackage.PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.callerImpl <em>caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.callerImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getcaller()
	 * @generated
	 */
	int CALLER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER__NAME = CosaPackage.REQUIRED_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER__TYPE = CosaPackage.REQUIRED_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_FEATURE_COUNT = CosaPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_OPERATION_COUNT = CosaPackage.REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.CleranceRequestImpl <em>Clerance Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.CleranceRequestImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getCleranceRequest()
	 * @generated
	 */
	int CLERANCE_REQUEST = 19;

	/**
	 * The feature id for the '<em><b>Connectorinterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERANCE_REQUEST__CONNECTORINTERFACE = CosaPackage.CONNECTOR__CONNECTORINTERFACE;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERANCE_REQUEST__GLUE = CosaPackage.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERANCE_REQUEST__CALLER = CosaPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERANCE_REQUEST__CALLED = CosaPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clerance Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERANCE_REQUEST_FEATURE_COUNT = CosaPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clerance Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLERANCE_REQUEST_OPERATION_COUNT = CosaPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SecurityQueryImpl <em>Security Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SecurityQueryImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityQuery()
	 * @generated
	 */
	int SECURITY_QUERY = 20;

	/**
	 * The feature id for the '<em><b>Connectorinterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY__CONNECTORINTERFACE = CosaPackage.CONNECTOR__CONNECTORINTERFACE;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY__GLUE = CosaPackage.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY__CALLER = CosaPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY__CALLED = CosaPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_FEATURE_COUNT = CosaPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_OPERATION_COUNT = CosaPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.attach1Impl <em>attach1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.attach1Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getattach1()
	 * @generated
	 */
	int ATTACH1 = 21;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH1__TARGET = CosaPackage.ATTACHEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH1__SOURCE = CosaPackage.ATTACHEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Securitycheck</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH1__SECURITYCHECK = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH1__CALLER = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attach1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH1_FEATURE_COUNT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attach1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH1_OPERATION_COUNT = CosaPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.attach2Impl <em>attach2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.attach2Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getattach2()
	 * @generated
	 */
	int ATTACH2 = 22;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH2__TARGET = CosaPackage.ATTACHEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH2__SOURCE = CosaPackage.ATTACHEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Securityauth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH2__SECURITYAUTH = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH2__CALLED = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attach2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH2_FEATURE_COUNT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attach2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH2_OPERATION_COUNT = CosaPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.attach3Impl <em>attach3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.attach3Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getattach3()
	 * @generated
	 */
	int ATTACH3 = 23;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH3__TARGET = CosaPackage.ATTACHEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH3__SOURCE = CosaPackage.ATTACHEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Dbquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH3__DBQUERY = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH3__CALLER = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attach3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH3_FEATURE_COUNT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attach3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH3_OPERATION_COUNT = CosaPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.attach4Impl <em>attach4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.attach4Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getattach4()
	 * @generated
	 */
	int ATTACH4 = 24;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH4__TARGET = CosaPackage.ATTACHEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH4__SOURCE = CosaPackage.ATTACHEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH4__QUERY = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH4__CALLER = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attach4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH4_FEATURE_COUNT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attach4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH4_OPERATION_COUNT = CosaPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.QueryImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = CosaPackage.PROVIDED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TYPE = CosaPackage.PROVIDED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = CosaPackage.PROVIDED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = CosaPackage.PROVIDED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.SecurityManagementImpl <em>Security Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.SecurityManagementImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityManagement()
	 * @generated
	 */
	int SECURITY_MANAGEMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGEMENT__NAME = CosaPackage.REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGEMENT__TYPE = CosaPackage.REQUIRED_PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Security Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGEMENT_FEATURE_COUNT = CosaPackage.REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGEMENT_OPERATION_COUNT = CosaPackage.REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.RPCImpl
	 * @see cosaM1.impl.CosaM1PackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 27;

	/**
	 * The feature id for the '<em><b>Connectorinterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CONNECTORINTERFACE = CosaPackage.CONNECTOR__CONNECTORINTERFACE;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = CosaPackage.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLER = CosaPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLED = CosaPackage.CONNECTOR_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link cosaM1.impl.attach5Impl <em>attach5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.attach5Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getattach5()
	 * @generated
	 */
	int ATTACH5 = 28;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH5__TARGET = CosaPackage.ATTACHEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH5__SOURCE = CosaPackage.ATTACHEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Credentialquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH5__CREDENTIALQUERY = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH5__CALLED = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attach5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH5_FEATURE_COUNT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attach5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH5_OPERATION_COUNT = CosaPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.attach6Impl <em>attach6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.attach6Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getattach6()
	 * @generated
	 */
	int ATTACH6 = 29;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH6__TARGET = CosaPackage.ATTACHEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH6__SOURCE = CosaPackage.ATTACHEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Securitymanagement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH6__SECURITYMANAGEMENT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH6__CALLED = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attach6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH6_FEATURE_COUNT = CosaPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attach6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH6_OPERATION_COUNT = CosaPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.bind1Impl <em>bind1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.bind1Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getbind1()
	 * @generated
	 */
	int BIND1 = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND1__SOURCE = CosaPackage.BINDING__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND1__TARGET = CosaPackage.BINDING__TARGET;

	/**
	 * The feature id for the '<em><b>Externalsocket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND1__EXTERNALSOCKET = CosaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection Mangerexternalsocket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND1__CONNECTION_MANGEREXTERNALSOCKET = CosaPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>bind1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND1_FEATURE_COUNT = CosaPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>bind1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND1_OPERATION_COUNT = CosaPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosaM1.impl.bind2Impl <em>bind2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosaM1.impl.bind2Impl
	 * @see cosaM1.impl.CosaM1PackageImpl#getbind2()
	 * @generated
	 */
	int BIND2 = 31;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND2__SOURCE = CosaPackage.BINDING__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND2__TARGET = CosaPackage.BINDING__TARGET;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND2__PROVIDE = CosaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Externalsocket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND2__EXTERNALSOCKET = CosaPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>bind2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND2_FEATURE_COUNT = CosaPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>bind2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND2_OPERATION_COUNT = CosaPackage.BINDING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cosaM1.Simple_CS <em>Simple CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple CS</em>'.
	 * @see cosaM1.Simple_CS
	 * @generated
	 */
	EClass getSimple_CS();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Simple_CS#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client</em>'.
	 * @see cosaM1.Simple_CS#getClient()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Client();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Simple_CS#getServeur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serveur</em>'.
	 * @see cosaM1.Simple_CS#getServeur()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Serveur();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Simple_CS#getServeurdetail <em>Serveurdetail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serveurdetail</em>'.
	 * @see cosaM1.Simple_CS#getServeurdetail()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Serveurdetail();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Simple_CS#getBind2 <em>Bind2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bind2</em>'.
	 * @see cosaM1.Simple_CS#getBind2()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Bind2();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Simple_CS#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpc</em>'.
	 * @see cosaM1.Simple_CS#getRpc()
	 * @see #getSimple_CS()
	 * @generated
	 */
	EReference getSimple_CS_Rpc();

	/**
	 * Returns the meta object for class '{@link cosaM1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see cosaM1.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Client#getSendrequest <em>Sendrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sendrequest</em>'.
	 * @see cosaM1.Client#getSendrequest()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Sendrequest();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Client#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see cosaM1.Client#getRequest()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Request();

	/**
	 * Returns the meta object for class '{@link cosaM1.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur</em>'.
	 * @see cosaM1.Serveur
	 * @generated
	 */
	EClass getServeur();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Serveur#getRecieverequest <em>Recieverequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recieverequest</em>'.
	 * @see cosaM1.Serveur#getRecieverequest()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Recieverequest();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Serveur#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provide</em>'.
	 * @see cosaM1.Serveur#getProvide()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Provide();

	/**
	 * Returns the meta object for class '{@link cosaM1.ServeurDetail <em>Serveur Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Detail</em>'.
	 * @see cosaM1.ServeurDetail
	 * @generated
	 */
	EClass getServeurDetail();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getExternalsocket <em>Externalsocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsocket</em>'.
	 * @see cosaM1.ServeurDetail#getExternalsocket()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Externalsocket();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getConnectionmanager <em>Connectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionmanager</em>'.
	 * @see cosaM1.ServeurDetail#getConnectionmanager()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Connectionmanager();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getSecuritymanager <em>Securitymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanager</em>'.
	 * @see cosaM1.ServeurDetail#getSecuritymanager()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Securitymanager();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see cosaM1.ServeurDetail#getDatabase()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Database();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getSqlquery <em>Sqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlquery</em>'.
	 * @see cosaM1.ServeurDetail#getSqlquery()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Sqlquery();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getClerancerequest <em>Clerancerequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clerancerequest</em>'.
	 * @see cosaM1.ServeurDetail#getClerancerequest()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Clerancerequest();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getAttach1 <em>Attach1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach1</em>'.
	 * @see cosaM1.ServeurDetail#getAttach1()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attach1();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getAttach2 <em>Attach2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach2</em>'.
	 * @see cosaM1.ServeurDetail#getAttach2()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attach2();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getAttach3 <em>Attach3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach3</em>'.
	 * @see cosaM1.ServeurDetail#getAttach3()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attach3();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getAttach4 <em>Attach4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach4</em>'.
	 * @see cosaM1.ServeurDetail#getAttach4()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attach4();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getAttach5 <em>Attach5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach5</em>'.
	 * @see cosaM1.ServeurDetail#getAttach5()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attach5();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getAttach6 <em>Attach6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attach6</em>'.
	 * @see cosaM1.ServeurDetail#getAttach6()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attach6();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getBind1 <em>Bind1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bind1</em>'.
	 * @see cosaM1.ServeurDetail#getBind1()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Bind1();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ServeurDetail#getSecurityquery <em>Securityquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery</em>'.
	 * @see cosaM1.ServeurDetail#getSecurityquery()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Securityquery();

	/**
	 * Returns the meta object for class '{@link cosaM1.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see cosaM1.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for class '{@link cosaM1.SendRequest <em>Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Request</em>'.
	 * @see cosaM1.SendRequest
	 * @generated
	 */
	EClass getSendRequest();

	/**
	 * Returns the meta object for class '{@link cosaM1.Provide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provide</em>'.
	 * @see cosaM1.Provide
	 * @generated
	 */
	EClass getProvide();

	/**
	 * Returns the meta object for class '{@link cosaM1.RecieveRequest <em>Recieve Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recieve Request</em>'.
	 * @see cosaM1.RecieveRequest
	 * @generated
	 */
	EClass getRecieveRequest();

	/**
	 * Returns the meta object for class '{@link cosaM1.ExternalSocket <em>External Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Socket</em>'.
	 * @see cosaM1.ExternalSocket
	 * @generated
	 */
	EClass getExternalSocket();

	/**
	 * Returns the meta object for class '{@link cosaM1.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see cosaM1.ConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ConnectionManager#getExternalsocket <em>Externalsocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsocket</em>'.
	 * @see cosaM1.ConnectionManager#getExternalsocket()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Externalsocket();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ConnectionManager#getDbquery <em>Dbquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbquery</em>'.
	 * @see cosaM1.ConnectionManager#getDbquery()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Dbquery();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.ConnectionManager#getSecuritycheck <em>Securitycheck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitycheck</em>'.
	 * @see cosaM1.ConnectionManager#getSecuritycheck()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Securitycheck();

	/**
	 * Returns the meta object for class '{@link cosaM1.SecurityManager <em>Security Manger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manger</em>'.
	 * @see cosaM1.SecurityManager
	 * @generated
	 */
	EClass getSecurityManger();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.SecurityManager#getCredentialquery <em>Credentialquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentialquery</em>'.
	 * @see cosaM1.SecurityManager#getCredentialquery()
	 * @see #getSecurityManger()
	 * @generated
	 */
	EReference getSecurityManger_Credentialquery();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.SecurityManager#getSecurityauth <em>Securityauth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityauth</em>'.
	 * @see cosaM1.SecurityManager#getSecurityauth()
	 * @see #getSecurityManger()
	 * @generated
	 */
	EReference getSecurityManger_Securityauth();

	/**
	 * Returns the meta object for class '{@link cosaM1.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see cosaM1.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Database#getSecuritymanagement <em>Securitymanagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanagement</em>'.
	 * @see cosaM1.Database#getSecuritymanagement()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Securitymanagement();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.Database#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see cosaM1.Database#getQuery()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Query();

	/**
	 * Returns the meta object for class '{@link cosaM1.DBQuery <em>DB Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Query</em>'.
	 * @see cosaM1.DBQuery
	 * @generated
	 */
	EClass getDBQuery();

	/**
	 * Returns the meta object for class '{@link cosaM1.SecurityCheck <em>Security Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Check</em>'.
	 * @see cosaM1.SecurityCheck
	 * @generated
	 */
	EClass getSecurityCheck();

	/**
	 * Returns the meta object for class '{@link cosaM1.SecurityAuth <em>Security Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Auth</em>'.
	 * @see cosaM1.SecurityAuth
	 * @generated
	 */
	EClass getSecurityAuth();

	/**
	 * Returns the meta object for class '{@link cosaM1.CredentialQuery <em>Credential Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential Query</em>'.
	 * @see cosaM1.CredentialQuery
	 * @generated
	 */
	EClass getCredentialQuery();

	/**
	 * Returns the meta object for class '{@link cosaM1.SQLQuery <em>SQL Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Query</em>'.
	 * @see cosaM1.SQLQuery
	 * @generated
	 */
	EClass getSQLQuery();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.SQLQuery#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller</em>'.
	 * @see cosaM1.SQLQuery#getCaller()
	 * @see #getSQLQuery()
	 * @generated
	 */
	EReference getSQLQuery_Caller();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.SQLQuery#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called</em>'.
	 * @see cosaM1.SQLQuery#getCalled()
	 * @see #getSQLQuery()
	 * @generated
	 */
	EReference getSQLQuery_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.called <em>called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>called</em>'.
	 * @see cosaM1.called
	 * @generated
	 */
	EClass getcalled();

	/**
	 * Returns the meta object for class '{@link cosaM1.caller <em>caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>caller</em>'.
	 * @see cosaM1.caller
	 * @generated
	 */
	EClass getcaller();

	/**
	 * Returns the meta object for class '{@link cosaM1.CleranceRequest <em>Clerance Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clerance Request</em>'.
	 * @see cosaM1.CleranceRequest
	 * @generated
	 */
	EClass getCleranceRequest();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.CleranceRequest#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller</em>'.
	 * @see cosaM1.CleranceRequest#getCaller()
	 * @see #getCleranceRequest()
	 * @generated
	 */
	EReference getCleranceRequest_Caller();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.CleranceRequest#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called</em>'.
	 * @see cosaM1.CleranceRequest#getCalled()
	 * @see #getCleranceRequest()
	 * @generated
	 */
	EReference getCleranceRequest_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.SecurityQuery <em>Security Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Query</em>'.
	 * @see cosaM1.SecurityQuery
	 * @generated
	 */
	EClass getSecurityQuery();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.SecurityQuery#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller</em>'.
	 * @see cosaM1.SecurityQuery#getCaller()
	 * @see #getSecurityQuery()
	 * @generated
	 */
	EReference getSecurityQuery_Caller();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.SecurityQuery#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called</em>'.
	 * @see cosaM1.SecurityQuery#getCalled()
	 * @see #getSecurityQuery()
	 * @generated
	 */
	EReference getSecurityQuery_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.attach1 <em>attach1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attach1</em>'.
	 * @see cosaM1.attach1
	 * @generated
	 */
	EClass getattach1();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach1#getSecuritycheck <em>Securitycheck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securitycheck</em>'.
	 * @see cosaM1.attach1#getSecuritycheck()
	 * @see #getattach1()
	 * @generated
	 */
	EReference getattach1_Securitycheck();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach1#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller</em>'.
	 * @see cosaM1.attach1#getCaller()
	 * @see #getattach1()
	 * @generated
	 */
	EReference getattach1_Caller();

	/**
	 * Returns the meta object for class '{@link cosaM1.attach2 <em>attach2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attach2</em>'.
	 * @see cosaM1.attach2
	 * @generated
	 */
	EClass getattach2();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach2#getSecurityauth <em>Securityauth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securityauth</em>'.
	 * @see cosaM1.attach2#getSecurityauth()
	 * @see #getattach2()
	 * @generated
	 */
	EReference getattach2_Securityauth();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach2#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called</em>'.
	 * @see cosaM1.attach2#getCalled()
	 * @see #getattach2()
	 * @generated
	 */
	EReference getattach2_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.attach3 <em>attach3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attach3</em>'.
	 * @see cosaM1.attach3
	 * @generated
	 */
	EClass getattach3();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach3#getDbquery <em>Dbquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dbquery</em>'.
	 * @see cosaM1.attach3#getDbquery()
	 * @see #getattach3()
	 * @generated
	 */
	EReference getattach3_Dbquery();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach3#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller</em>'.
	 * @see cosaM1.attach3#getCaller()
	 * @see #getattach3()
	 * @generated
	 */
	EReference getattach3_Caller();

	/**
	 * Returns the meta object for class '{@link cosaM1.attach4 <em>attach4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attach4</em>'.
	 * @see cosaM1.attach4
	 * @generated
	 */
	EClass getattach4();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach4#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see cosaM1.attach4#getQuery()
	 * @see #getattach4()
	 * @generated
	 */
	EReference getattach4_Query();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach4#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller</em>'.
	 * @see cosaM1.attach4#getCaller()
	 * @see #getattach4()
	 * @generated
	 */
	EReference getattach4_Caller();

	/**
	 * Returns the meta object for class '{@link cosaM1.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see cosaM1.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for class '{@link cosaM1.SecurityManagement <em>Security Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Management</em>'.
	 * @see cosaM1.SecurityManagement
	 * @generated
	 */
	EClass getSecurityManagement();

	/**
	 * Returns the meta object for class '{@link cosaM1.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see cosaM1.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.RPC#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller</em>'.
	 * @see cosaM1.RPC#getCaller()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Caller();

	/**
	 * Returns the meta object for the containment reference '{@link cosaM1.RPC#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called</em>'.
	 * @see cosaM1.RPC#getCalled()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.attach5 <em>attach5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attach5</em>'.
	 * @see cosaM1.attach5
	 * @generated
	 */
	EClass getattach5();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach5#getCredentialquery <em>Credentialquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credentialquery</em>'.
	 * @see cosaM1.attach5#getCredentialquery()
	 * @see #getattach5()
	 * @generated
	 */
	EReference getattach5_Credentialquery();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach5#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called</em>'.
	 * @see cosaM1.attach5#getCalled()
	 * @see #getattach5()
	 * @generated
	 */
	EReference getattach5_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.attach6 <em>attach6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attach6</em>'.
	 * @see cosaM1.attach6
	 * @generated
	 */
	EClass getattach6();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach6#getSecuritymanagement <em>Securitymanagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securitymanagement</em>'.
	 * @see cosaM1.attach6#getSecuritymanagement()
	 * @see #getattach6()
	 * @generated
	 */
	EReference getattach6_Securitymanagement();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.attach6#getCalled <em>Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called</em>'.
	 * @see cosaM1.attach6#getCalled()
	 * @see #getattach6()
	 * @generated
	 */
	EReference getattach6_Called();

	/**
	 * Returns the meta object for class '{@link cosaM1.bind1 <em>bind1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bind1</em>'.
	 * @see cosaM1.bind1
	 * @generated
	 */
	EClass getbind1();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.bind1#getExternalsocket <em>Externalsocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Externalsocket</em>'.
	 * @see cosaM1.bind1#getExternalsocket()
	 * @see #getbind1()
	 * @generated
	 */
	EReference getbind1_Externalsocket();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.bind1#getConnectionMangerexternalsocket <em>Connection Mangerexternalsocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Mangerexternalsocket</em>'.
	 * @see cosaM1.bind1#getConnectionMangerexternalsocket()
	 * @see #getbind1()
	 * @generated
	 */
	EReference getbind1_ConnectionMangerexternalsocket();

	/**
	 * Returns the meta object for class '{@link cosaM1.bind2 <em>bind2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bind2</em>'.
	 * @see cosaM1.bind2
	 * @generated
	 */
	EClass getbind2();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.bind2#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provide</em>'.
	 * @see cosaM1.bind2#getProvide()
	 * @see #getbind2()
	 * @generated
	 */
	EReference getbind2_Provide();

	/**
	 * Returns the meta object for the reference '{@link cosaM1.bind2#getExternalsocket <em>Externalsocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Externalsocket</em>'.
	 * @see cosaM1.bind2#getExternalsocket()
	 * @see #getbind2()
	 * @generated
	 */
	EReference getbind2_Externalsocket();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CosaM1Factory getCosaM1Factory();

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
		 * The meta object literal for the '{@link cosaM1.impl.Simple_CSImpl <em>Simple CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.Simple_CSImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSimple_CS()
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
		 * The meta object literal for the '<em><b>Serveurdetail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CS__SERVEURDETAIL = eINSTANCE.getSimple_CS_Serveurdetail();

		/**
		 * The meta object literal for the '<em><b>Bind2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CS__BIND2 = eINSTANCE.getSimple_CS_Bind2();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CS__RPC = eINSTANCE.getSimple_CS_Rpc();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.ClientImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Sendrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SENDREQUEST = eINSTANCE.getClient_Sendrequest();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__REQUEST = eINSTANCE.getClient_Request();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.ServeurImpl <em>Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.ServeurImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getServeur()
		 * @generated
		 */
		EClass SERVEUR = eINSTANCE.getServeur();

		/**
		 * The meta object literal for the '<em><b>Recieverequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__RECIEVEREQUEST = eINSTANCE.getServeur_Recieverequest();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__PROVIDE = eINSTANCE.getServeur_Provide();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.ServeurDetailImpl <em>Serveur Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.ServeurDetailImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getServeurDetail()
		 * @generated
		 */
		EClass SERVEUR_DETAIL = eINSTANCE.getServeurDetail();

		/**
		 * The meta object literal for the '<em><b>Externalsocket</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__EXTERNALSOCKET = eINSTANCE.getServeurDetail_Externalsocket();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__CONNECTIONMANAGER = eINSTANCE.getServeurDetail_Connectionmanager();

		/**
		 * The meta object literal for the '<em><b>Securitymanager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__SECURITYMANAGER = eINSTANCE.getServeurDetail_Securitymanager();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__DATABASE = eINSTANCE.getServeurDetail_Database();

		/**
		 * The meta object literal for the '<em><b>Sqlquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__SQLQUERY = eINSTANCE.getServeurDetail_Sqlquery();

		/**
		 * The meta object literal for the '<em><b>Clerancerequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__CLERANCEREQUEST = eINSTANCE.getServeurDetail_Clerancerequest();

		/**
		 * The meta object literal for the '<em><b>Attach1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACH1 = eINSTANCE.getServeurDetail_Attach1();

		/**
		 * The meta object literal for the '<em><b>Attach2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACH2 = eINSTANCE.getServeurDetail_Attach2();

		/**
		 * The meta object literal for the '<em><b>Attach3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACH3 = eINSTANCE.getServeurDetail_Attach3();

		/**
		 * The meta object literal for the '<em><b>Attach4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACH4 = eINSTANCE.getServeurDetail_Attach4();

		/**
		 * The meta object literal for the '<em><b>Attach5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACH5 = eINSTANCE.getServeurDetail_Attach5();

		/**
		 * The meta object literal for the '<em><b>Attach6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACH6 = eINSTANCE.getServeurDetail_Attach6();

		/**
		 * The meta object literal for the '<em><b>Bind1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__BIND1 = eINSTANCE.getServeurDetail_Bind1();

		/**
		 * The meta object literal for the '<em><b>Securityquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__SECURITYQUERY = eINSTANCE.getServeurDetail_Securityquery();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.RequestImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SendRequestImpl <em>Send Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SendRequestImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSendRequest()
		 * @generated
		 */
		EClass SEND_REQUEST = eINSTANCE.getSendRequest();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.ProvideImpl <em>Provide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.ProvideImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getProvide()
		 * @generated
		 */
		EClass PROVIDE = eINSTANCE.getProvide();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.RecieveRequestImpl <em>Recieve Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.RecieveRequestImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getRecieveRequest()
		 * @generated
		 */
		EClass RECIEVE_REQUEST = eINSTANCE.getRecieveRequest();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.ExternalSocketImpl <em>External Socket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.ExternalSocketImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getExternalSocket()
		 * @generated
		 */
		EClass EXTERNAL_SOCKET = eINSTANCE.getExternalSocket();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.ConnectionManagerImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Externalsocket</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__EXTERNALSOCKET = eINSTANCE.getConnectionManager_Externalsocket();

		/**
		 * The meta object literal for the '<em><b>Dbquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__DBQUERY = eINSTANCE.getConnectionManager_Dbquery();

		/**
		 * The meta object literal for the '<em><b>Securitycheck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__SECURITYCHECK = eINSTANCE.getConnectionManager_Securitycheck();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SecurityMangerImpl <em>Security Manger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SecurityMangerImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityManger()
		 * @generated
		 */
		EClass SECURITY_MANGER = eINSTANCE.getSecurityManger();

		/**
		 * The meta object literal for the '<em><b>Credentialquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANGER__CREDENTIALQUERY = eINSTANCE.getSecurityManger_Credentialquery();

		/**
		 * The meta object literal for the '<em><b>Securityauth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANGER__SECURITYAUTH = eINSTANCE.getSecurityManger_Securityauth();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.DatabaseImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Securitymanagement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SECURITYMANAGEMENT = eINSTANCE.getDatabase_Securitymanagement();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__QUERY = eINSTANCE.getDatabase_Query();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.DBQueryImpl <em>DB Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.DBQueryImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getDBQuery()
		 * @generated
		 */
		EClass DB_QUERY = eINSTANCE.getDBQuery();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SecurityCheckImpl <em>Security Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SecurityCheckImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityCheck()
		 * @generated
		 */
		EClass SECURITY_CHECK = eINSTANCE.getSecurityCheck();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SecurityAuthImpl <em>Security Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SecurityAuthImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityAuth()
		 * @generated
		 */
		EClass SECURITY_AUTH = eINSTANCE.getSecurityAuth();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.CredentialQueryImpl <em>Credential Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.CredentialQueryImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getCredentialQuery()
		 * @generated
		 */
		EClass CREDENTIAL_QUERY = eINSTANCE.getCredentialQuery();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SQLQueryImpl <em>SQL Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SQLQueryImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSQLQuery()
		 * @generated
		 */
		EClass SQL_QUERY = eINSTANCE.getSQLQuery();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_QUERY__CALLER = eINSTANCE.getSQLQuery_Caller();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_QUERY__CALLED = eINSTANCE.getSQLQuery_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.calledImpl <em>called</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.calledImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getcalled()
		 * @generated
		 */
		EClass CALLED = eINSTANCE.getcalled();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.callerImpl <em>caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.callerImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getcaller()
		 * @generated
		 */
		EClass CALLER = eINSTANCE.getcaller();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.CleranceRequestImpl <em>Clerance Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.CleranceRequestImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getCleranceRequest()
		 * @generated
		 */
		EClass CLERANCE_REQUEST = eINSTANCE.getCleranceRequest();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLERANCE_REQUEST__CALLER = eINSTANCE.getCleranceRequest_Caller();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLERANCE_REQUEST__CALLED = eINSTANCE.getCleranceRequest_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SecurityQueryImpl <em>Security Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SecurityQueryImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityQuery()
		 * @generated
		 */
		EClass SECURITY_QUERY = eINSTANCE.getSecurityQuery();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_QUERY__CALLER = eINSTANCE.getSecurityQuery_Caller();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_QUERY__CALLED = eINSTANCE.getSecurityQuery_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.attach1Impl <em>attach1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.attach1Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getattach1()
		 * @generated
		 */
		EClass ATTACH1 = eINSTANCE.getattach1();

		/**
		 * The meta object literal for the '<em><b>Securitycheck</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH1__SECURITYCHECK = eINSTANCE.getattach1_Securitycheck();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH1__CALLER = eINSTANCE.getattach1_Caller();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.attach2Impl <em>attach2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.attach2Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getattach2()
		 * @generated
		 */
		EClass ATTACH2 = eINSTANCE.getattach2();

		/**
		 * The meta object literal for the '<em><b>Securityauth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH2__SECURITYAUTH = eINSTANCE.getattach2_Securityauth();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH2__CALLED = eINSTANCE.getattach2_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.attach3Impl <em>attach3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.attach3Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getattach3()
		 * @generated
		 */
		EClass ATTACH3 = eINSTANCE.getattach3();

		/**
		 * The meta object literal for the '<em><b>Dbquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH3__DBQUERY = eINSTANCE.getattach3_Dbquery();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH3__CALLER = eINSTANCE.getattach3_Caller();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.attach4Impl <em>attach4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.attach4Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getattach4()
		 * @generated
		 */
		EClass ATTACH4 = eINSTANCE.getattach4();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH4__QUERY = eINSTANCE.getattach4_Query();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH4__CALLER = eINSTANCE.getattach4_Caller();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.QueryImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.SecurityManagementImpl <em>Security Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.SecurityManagementImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getSecurityManagement()
		 * @generated
		 */
		EClass SECURITY_MANAGEMENT = eINSTANCE.getSecurityManagement();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.RPCImpl
		 * @see cosaM1.impl.CosaM1PackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLER = eINSTANCE.getRPC_Caller();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLED = eINSTANCE.getRPC_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.attach5Impl <em>attach5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.attach5Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getattach5()
		 * @generated
		 */
		EClass ATTACH5 = eINSTANCE.getattach5();

		/**
		 * The meta object literal for the '<em><b>Credentialquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH5__CREDENTIALQUERY = eINSTANCE.getattach5_Credentialquery();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH5__CALLED = eINSTANCE.getattach5_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.attach6Impl <em>attach6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.attach6Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getattach6()
		 * @generated
		 */
		EClass ATTACH6 = eINSTANCE.getattach6();

		/**
		 * The meta object literal for the '<em><b>Securitymanagement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH6__SECURITYMANAGEMENT = eINSTANCE.getattach6_Securitymanagement();

		/**
		 * The meta object literal for the '<em><b>Called</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH6__CALLED = eINSTANCE.getattach6_Called();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.bind1Impl <em>bind1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.bind1Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getbind1()
		 * @generated
		 */
		EClass BIND1 = eINSTANCE.getbind1();

		/**
		 * The meta object literal for the '<em><b>Externalsocket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND1__EXTERNALSOCKET = eINSTANCE.getbind1_Externalsocket();

		/**
		 * The meta object literal for the '<em><b>Connection Mangerexternalsocket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND1__CONNECTION_MANGEREXTERNALSOCKET = eINSTANCE.getbind1_ConnectionMangerexternalsocket();

		/**
		 * The meta object literal for the '{@link cosaM1.impl.bind2Impl <em>bind2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosaM1.impl.bind2Impl
		 * @see cosaM1.impl.CosaM1PackageImpl#getbind2()
		 * @generated
		 */
		EClass BIND2 = eINSTANCE.getbind2();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND2__PROVIDE = eINSTANCE.getbind2_Provide();

		/**
		 * The meta object literal for the '<em><b>Externalsocket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND2__EXTERNALSOCKET = eINSTANCE.getbind2_Externalsocket();

	}

} //CosaM1Package
