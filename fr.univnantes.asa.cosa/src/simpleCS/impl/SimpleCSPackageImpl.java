/**
 */
package simpleCS.impl;

import cosa.CosaPackage;

import cosa.impl.CosaPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import simpleCS.Client;
import simpleCS.Send_Request;
import simpleCS.Send_Request_In;
import simpleCS.Send_Request_Out;
import simpleCS.Serveur;
import simpleCS.SimpleCSFactory;
import simpleCS.SimpleCSPackage;
import simpleCS.Simple_CS;
import simpleCS.called;
import simpleCS.caller;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleCSPackageImpl extends EPackageImpl implements SimpleCSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple_CSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass send_Request_InEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass send_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass send_Request_OutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simpleCS.SimpleCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleCSPackageImpl() {
		super(eNS_URI, SimpleCSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleCSPackage init() {
		if (isInited) return (SimpleCSPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleCSPackage.eNS_URI);

		// Obtain or create and register package
		SimpleCSPackageImpl theSimpleCSPackage = (SimpleCSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleCSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleCSPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CosaPackageImpl theCosaPackage = (CosaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI) instanceof CosaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI) : CosaPackage.eINSTANCE);

		// Create package meta-data objects
		theSimpleCSPackage.createPackageContents();
		theCosaPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleCSPackage.initializePackageContents();
		theCosaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleCSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleCSPackage.eNS_URI, theSimpleCSPackage);
		return theSimpleCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Send_request_in() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Send_request() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Send_request_out() {
		return (EReference)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple_CS() {
		return simple_CSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_CS_Client() {
		return (EReference)simple_CSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_CS_Serveur() {
		return (EReference)simple_CSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_CS_Rpc() {
		return (EReference)simple_CSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeur() {
		return serveurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSend_Request_In() {
		return send_Request_InEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSend_Request_In_Port() {
		return (EAttribute)send_Request_InEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSend_Request() {
		return send_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSend_Request__SendRequest() {
		return send_RequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSend_Request_Out() {
		return send_Request_OutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSend_Request_Out_Port() {
		return (EAttribute)send_Request_OutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Called() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Caller() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcaller() {
		return callerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcalled() {
		return calledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCSFactory getSimpleCSFactory() {
		return (SimpleCSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__SEND_REQUEST_IN);
		createEReference(clientEClass, CLIENT__SEND_REQUEST);
		createEReference(clientEClass, CLIENT__SEND_REQUEST_OUT);

		simple_CSEClass = createEClass(SIMPLE_CS);
		createEReference(simple_CSEClass, SIMPLE_CS__CLIENT);
		createEReference(simple_CSEClass, SIMPLE_CS__SERVEUR);
		createEReference(simple_CSEClass, SIMPLE_CS__RPC);

		serveurEClass = createEClass(SERVEUR);

		send_Request_InEClass = createEClass(SEND_REQUEST_IN);
		createEAttribute(send_Request_InEClass, SEND_REQUEST_IN__PORT);

		send_RequestEClass = createEClass(SEND_REQUEST);
		createEOperation(send_RequestEClass, SEND_REQUEST___SEND_REQUEST);

		send_Request_OutEClass = createEClass(SEND_REQUEST_OUT);
		createEAttribute(send_Request_OutEClass, SEND_REQUEST_OUT__PORT);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__CALLED);
		createEReference(rpcEClass, RPC__CALLER);

		callerEClass = createEClass(CALLER);

		calledEClass = createEClass(CALLED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CosaPackage theCosaPackage = (CosaPackage)EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(theCosaPackage.getComponent());
		simple_CSEClass.getESuperTypes().add(theCosaPackage.getCompositeConfiguration());
		serveurEClass.getESuperTypes().add(theCosaPackage.getComponent());
		send_Request_InEClass.getESuperTypes().add(theCosaPackage.getRequiredPort());
		send_RequestEClass.getESuperTypes().add(theCosaPackage.getProvidedService());
		send_Request_OutEClass.getESuperTypes().add(theCosaPackage.getRequiredPort());
		rpcEClass.getESuperTypes().add(theCosaPackage.getConnector());
		callerEClass.getESuperTypes().add(theCosaPackage.getProvidedRole());
		calledEClass.getESuperTypes().add(theCosaPackage.getRequiredRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Send_request_in(), this.getSend_Request_In(), null, "send_request_in", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Send_request(), this.getSend_Request(), null, "send_request", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Send_request_out(), this.getSend_Request_Out(), null, "send_request_out", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simple_CSEClass, Simple_CS.class, "Simple_CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_CS_Client(), this.getClient(), null, "client", null, 0, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_CS_Serveur(), this.getServeur(), null, "serveur", null, 1, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_CS_Rpc(), this.getRPC(), null, "rpc", null, 1, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serveurEClass, Serveur.class, "Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(send_Request_InEClass, Send_Request_In.class, "Send_Request_In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSend_Request_In_Port(), ecorePackage.getEString(), "port", null, 0, 1, Send_Request_In.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(send_RequestEClass, Send_Request.class, "Send_Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSend_Request__SendRequest(), null, "sendRequest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(send_Request_OutEClass, Send_Request_Out.class, "Send_Request_Out", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSend_Request_Out_Port(), ecorePackage.getEString(), "port", null, 0, 1, Send_Request_Out.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcEClass, simpleCS.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Called(), this.getcalled(), null, "called", null, 1, 1, simpleCS.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Caller(), this.getcaller(), null, "caller", null, 1, 1, simpleCS.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callerEClass, caller.class, "caller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calledEClass, called.class, "called", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleCSPackageImpl
