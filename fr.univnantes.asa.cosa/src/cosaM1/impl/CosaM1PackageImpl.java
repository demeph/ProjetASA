/**
 */
package cosaM1.impl;

import cosa.CosaPackage;

import cosa.impl.CosaPackageImpl;

import cosaM1.CleranceRequest;
import cosaM1.Client;
import cosaM1.ConnectionManager;
import cosaM1.CosaM1Factory;
import cosaM1.CosaM1Package;
import cosaM1.CredentialQuery;
import cosaM1.DBQuery;
import cosaM1.Database;
import cosaM1.ExternalSocket;
import cosaM1.Provide;
import cosaM1.Query;
import cosaM1.RecieveRequest;
import cosaM1.Request;
import cosaM1.SQLQuery;
import cosaM1.SecurityAuth;
import cosaM1.SecurityCheck;
import cosaM1.SecurityManagement;
import cosaM1.SecurityManger;
import cosaM1.SecurityQuery;
import cosaM1.SendRequest;
import cosaM1.Serveur;
import cosaM1.ServeurDetail;
import cosaM1.Simple_CS;
import cosaM1.attach1;
import cosaM1.attach2;
import cosaM1.attach3;
import cosaM1.attach4;
import cosaM1.attach5;
import cosaM1.attach6;
import cosaM1.bind1;
import cosaM1.bind2;
import cosaM1.called;
import cosaM1.caller;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CosaM1PackageImpl extends EPackageImpl implements CosaM1Package {
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
	private EClass clientEClass = null;

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
	private EClass serveurDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recieveRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityMangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledEClass = null;

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
	private EClass cleranceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attach1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attach2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attach3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attach4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagementEClass = null;

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
	private EClass attach5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attach6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bind1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bind2EClass = null;

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
	 * @see cosaM1.CosaM1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CosaM1PackageImpl() {
		super(eNS_URI, CosaM1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CosaM1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CosaM1Package init() {
		if (isInited) return (CosaM1Package)EPackage.Registry.INSTANCE.getEPackage(CosaM1Package.eNS_URI);

		// Obtain or create and register package
		CosaM1PackageImpl theCosaM1Package = (CosaM1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CosaM1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CosaM1PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CosaPackageImpl theCosaPackage = (CosaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI) instanceof CosaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI) : CosaPackage.eINSTANCE);

		// Create package meta-data objects
		theCosaM1Package.createPackageContents();
		theCosaPackage.createPackageContents();

		// Initialize created meta-data
		theCosaM1Package.initializePackageContents();
		theCosaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCosaM1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CosaM1Package.eNS_URI, theCosaM1Package);
		return theCosaM1Package;
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
	public EReference getSimple_CS_Serveurdetail() {
		return (EReference)simple_CSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_CS_Bind2() {
		return (EReference)simple_CSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_CS_Rpc() {
		return (EReference)simple_CSEClass.getEStructuralFeatures().get(4);
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
	public EReference getClient_Sendrequest() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Request() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
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
	public EReference getServeur_Recieverequest() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Provide() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeurDetail() {
		return serveurDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Externalsocket() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Connectionmanager() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Securitymanager() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Database() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Sqlquery() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Clerancerequest() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attach1() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attach2() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attach3() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attach4() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attach5() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attach6() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Bind1() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Securityquery() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendRequest() {
		return sendRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvide() {
		return provideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecieveRequest() {
		return recieveRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalSocket() {
		return externalSocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Externalsocket() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Dbquery() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Securitycheck() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManger() {
		return securityMangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManger_Credentialquery() {
		return (EReference)securityMangerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManger_Securityauth() {
		return (EReference)securityMangerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Securitymanagement() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Query() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBQuery() {
		return dbQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityCheck() {
		return securityCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityAuth() {
		return securityAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredentialQuery() {
		return credentialQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLQuery() {
		return sqlQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLQuery_Caller() {
		return (EReference)sqlQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLQuery_Called() {
		return (EReference)sqlQueryEClass.getEStructuralFeatures().get(1);
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
	public EClass getcaller() {
		return callerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCleranceRequest() {
		return cleranceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCleranceRequest_Caller() {
		return (EReference)cleranceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCleranceRequest_Called() {
		return (EReference)cleranceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityQuery() {
		return securityQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityQuery_Caller() {
		return (EReference)securityQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityQuery_Called() {
		return (EReference)securityQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattach1() {
		return attach1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach1_Securitycheck() {
		return (EReference)attach1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach1_Caller() {
		return (EReference)attach1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattach2() {
		return attach2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach2_Securityauth() {
		return (EReference)attach2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach2_Called() {
		return (EReference)attach2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattach3() {
		return attach3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach3_Dbquery() {
		return (EReference)attach3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach3_Caller() {
		return (EReference)attach3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattach4() {
		return attach4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach4_Query() {
		return (EReference)attach4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach4_Caller() {
		return (EReference)attach4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManagement() {
		return securityManagementEClass;
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
	public EReference getRPC_Caller() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Called() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattach5() {
		return attach5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach5_Credentialquery() {
		return (EReference)attach5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach5_Called() {
		return (EReference)attach5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattach6() {
		return attach6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach6_Securitymanagement() {
		return (EReference)attach6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattach6_Called() {
		return (EReference)attach6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbind1() {
		return bind1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbind1_Externalsocket() {
		return (EReference)bind1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbind1_ConnectionMangerexternalsocket() {
		return (EReference)bind1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbind2() {
		return bind2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbind2_Provide() {
		return (EReference)bind2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbind2_Externalsocket() {
		return (EReference)bind2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaM1Factory getCosaM1Factory() {
		return (CosaM1Factory)getEFactoryInstance();
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
		simple_CSEClass = createEClass(SIMPLE_CS);
		createEReference(simple_CSEClass, SIMPLE_CS__CLIENT);
		createEReference(simple_CSEClass, SIMPLE_CS__SERVEUR);
		createEReference(simple_CSEClass, SIMPLE_CS__SERVEURDETAIL);
		createEReference(simple_CSEClass, SIMPLE_CS__BIND2);
		createEReference(simple_CSEClass, SIMPLE_CS__RPC);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__SENDREQUEST);
		createEReference(clientEClass, CLIENT__REQUEST);

		serveurEClass = createEClass(SERVEUR);
		createEReference(serveurEClass, SERVEUR__RECIEVEREQUEST);
		createEReference(serveurEClass, SERVEUR__PROVIDE);

		serveurDetailEClass = createEClass(SERVEUR_DETAIL);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__EXTERNALSOCKET);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__CONNECTIONMANAGER);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__SECURITYMANAGER);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__DATABASE);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__SQLQUERY);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__CLERANCEREQUEST);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACH1);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACH2);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACH3);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACH4);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACH5);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACH6);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__BIND1);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__SECURITYQUERY);

		requestEClass = createEClass(REQUEST);

		sendRequestEClass = createEClass(SEND_REQUEST);

		provideEClass = createEClass(PROVIDE);

		recieveRequestEClass = createEClass(RECIEVE_REQUEST);

		externalSocketEClass = createEClass(EXTERNAL_SOCKET);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__EXTERNALSOCKET);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__DBQUERY);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__SECURITYCHECK);

		securityMangerEClass = createEClass(SECURITY_MANGER);
		createEReference(securityMangerEClass, SECURITY_MANGER__CREDENTIALQUERY);
		createEReference(securityMangerEClass, SECURITY_MANGER__SECURITYAUTH);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__SECURITYMANAGEMENT);
		createEReference(databaseEClass, DATABASE__QUERY);

		dbQueryEClass = createEClass(DB_QUERY);

		securityCheckEClass = createEClass(SECURITY_CHECK);

		securityAuthEClass = createEClass(SECURITY_AUTH);

		credentialQueryEClass = createEClass(CREDENTIAL_QUERY);

		sqlQueryEClass = createEClass(SQL_QUERY);
		createEReference(sqlQueryEClass, SQL_QUERY__CALLER);
		createEReference(sqlQueryEClass, SQL_QUERY__CALLED);

		calledEClass = createEClass(CALLED);

		callerEClass = createEClass(CALLER);

		cleranceRequestEClass = createEClass(CLERANCE_REQUEST);
		createEReference(cleranceRequestEClass, CLERANCE_REQUEST__CALLER);
		createEReference(cleranceRequestEClass, CLERANCE_REQUEST__CALLED);

		securityQueryEClass = createEClass(SECURITY_QUERY);
		createEReference(securityQueryEClass, SECURITY_QUERY__CALLER);
		createEReference(securityQueryEClass, SECURITY_QUERY__CALLED);

		attach1EClass = createEClass(ATTACH1);
		createEReference(attach1EClass, ATTACH1__SECURITYCHECK);
		createEReference(attach1EClass, ATTACH1__CALLER);

		attach2EClass = createEClass(ATTACH2);
		createEReference(attach2EClass, ATTACH2__SECURITYAUTH);
		createEReference(attach2EClass, ATTACH2__CALLED);

		attach3EClass = createEClass(ATTACH3);
		createEReference(attach3EClass, ATTACH3__DBQUERY);
		createEReference(attach3EClass, ATTACH3__CALLER);

		attach4EClass = createEClass(ATTACH4);
		createEReference(attach4EClass, ATTACH4__QUERY);
		createEReference(attach4EClass, ATTACH4__CALLER);

		queryEClass = createEClass(QUERY);

		securityManagementEClass = createEClass(SECURITY_MANAGEMENT);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__CALLER);
		createEReference(rpcEClass, RPC__CALLED);

		attach5EClass = createEClass(ATTACH5);
		createEReference(attach5EClass, ATTACH5__CREDENTIALQUERY);
		createEReference(attach5EClass, ATTACH5__CALLED);

		attach6EClass = createEClass(ATTACH6);
		createEReference(attach6EClass, ATTACH6__SECURITYMANAGEMENT);
		createEReference(attach6EClass, ATTACH6__CALLED);

		bind1EClass = createEClass(BIND1);
		createEReference(bind1EClass, BIND1__EXTERNALSOCKET);
		createEReference(bind1EClass, BIND1__CONNECTION_MANGEREXTERNALSOCKET);

		bind2EClass = createEClass(BIND2);
		createEReference(bind2EClass, BIND2__PROVIDE);
		createEReference(bind2EClass, BIND2__EXTERNALSOCKET);
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
		simple_CSEClass.getESuperTypes().add(theCosaPackage.getConfiguration());
		clientEClass.getESuperTypes().add(theCosaPackage.getComponent());
		serveurEClass.getESuperTypes().add(theCosaPackage.getComponent());
		serveurDetailEClass.getESuperTypes().add(theCosaPackage.getConfiguration());
		requestEClass.getESuperTypes().add(theCosaPackage.getRequiredPort());
		sendRequestEClass.getESuperTypes().add(theCosaPackage.getRequiredService());
		provideEClass.getESuperTypes().add(theCosaPackage.getProvidedPort());
		recieveRequestEClass.getESuperTypes().add(theCosaPackage.getProvidedService());
		externalSocketEClass.getESuperTypes().add(theCosaPackage.getProvidedPort());
		connectionManagerEClass.getESuperTypes().add(theCosaPackage.getComponent());
		securityMangerEClass.getESuperTypes().add(theCosaPackage.getComponent());
		databaseEClass.getESuperTypes().add(theCosaPackage.getComponent());
		dbQueryEClass.getESuperTypes().add(theCosaPackage.getProvidedPort());
		securityCheckEClass.getESuperTypes().add(theCosaPackage.getRequiredPort());
		securityAuthEClass.getESuperTypes().add(theCosaPackage.getProvidedPort());
		credentialQueryEClass.getESuperTypes().add(theCosaPackage.getProvidedPort());
		sqlQueryEClass.getESuperTypes().add(theCosaPackage.getConnector());
		calledEClass.getESuperTypes().add(theCosaPackage.getProvidedRole());
		callerEClass.getESuperTypes().add(theCosaPackage.getRequiredRole());
		cleranceRequestEClass.getESuperTypes().add(theCosaPackage.getConnector());
		securityQueryEClass.getESuperTypes().add(theCosaPackage.getConnector());
		attach1EClass.getESuperTypes().add(theCosaPackage.getAttachement());
		attach2EClass.getESuperTypes().add(theCosaPackage.getAttachement());
		attach3EClass.getESuperTypes().add(theCosaPackage.getAttachement());
		attach4EClass.getESuperTypes().add(theCosaPackage.getAttachement());
		queryEClass.getESuperTypes().add(theCosaPackage.getProvidedPort());
		securityManagementEClass.getESuperTypes().add(theCosaPackage.getRequiredPort());
		rpcEClass.getESuperTypes().add(theCosaPackage.getConnector());
		attach5EClass.getESuperTypes().add(theCosaPackage.getAttachement());
		attach6EClass.getESuperTypes().add(theCosaPackage.getAttachement());
		bind1EClass.getESuperTypes().add(theCosaPackage.getBinding());
		bind2EClass.getESuperTypes().add(theCosaPackage.getBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(simple_CSEClass, Simple_CS.class, "Simple_CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_CS_Client(), this.getClient(), null, "client", null, 1, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_CS_Serveur(), this.getServeur(), null, "serveur", null, 1, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_CS_Serveurdetail(), this.getServeurDetail(), null, "serveurdetail", null, 0, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_CS_Bind2(), this.getbind2(), null, "bind2", null, 1, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_CS_Rpc(), this.getRPC(), null, "rpc", null, 1, 1, Simple_CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Sendrequest(), this.getSendRequest(), null, "sendrequest", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Request(), this.getRequest(), null, "request", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serveurEClass, Serveur.class, "Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeur_Recieverequest(), this.getRecieveRequest(), null, "recieverequest", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Provide(), this.getProvide(), null, "provide", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serveurDetailEClass, ServeurDetail.class, "ServeurDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeurDetail_Externalsocket(), this.getExternalSocket(), null, "externalsocket", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Connectionmanager(), this.getConnectionManager(), null, "connectionmanager", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Securitymanager(), this.getSecurityManger(), null, "securitymanager", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Database(), this.getDatabase(), null, "database", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Sqlquery(), this.getSQLQuery(), null, "sqlquery", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Clerancerequest(), this.getCleranceRequest(), null, "clerancerequest", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attach1(), this.getattach1(), null, "attach1", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attach2(), this.getattach2(), null, "attach2", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attach3(), this.getattach3(), null, "attach3", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attach4(), this.getattach4(), null, "attach4", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attach5(), this.getattach5(), null, "attach5", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attach6(), this.getattach6(), null, "attach6", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Bind1(), this.getbind1(), null, "bind1", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Securityquery(), this.getSecurityQuery(), null, "securityquery", null, 1, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendRequestEClass, SendRequest.class, "SendRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(provideEClass, Provide.class, "Provide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recieveRequestEClass, RecieveRequest.class, "RecieveRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalSocketEClass, ExternalSocket.class, "ExternalSocket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Externalsocket(), this.getExternalSocket(), null, "externalsocket", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Dbquery(), this.getDBQuery(), null, "dbquery", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Securitycheck(), this.getSecurityCheck(), null, "securitycheck", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityMangerEClass, SecurityManger.class, "SecurityManger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManger_Credentialquery(), this.getCredentialQuery(), null, "credentialquery", null, 1, 1, SecurityManger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManger_Securityauth(), this.getSecurityAuth(), null, "securityauth", null, 1, 1, SecurityManger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Securitymanagement(), this.getSecurityManagement(), null, "securitymanagement", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Query(), this.getQuery(), null, "query", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbQueryEClass, DBQuery.class, "DBQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityCheckEClass, SecurityCheck.class, "SecurityCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityAuthEClass, SecurityAuth.class, "SecurityAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(credentialQueryEClass, CredentialQuery.class, "CredentialQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlQueryEClass, SQLQuery.class, "SQLQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQLQuery_Caller(), this.getcaller(), null, "caller", null, 1, 1, SQLQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLQuery_Called(), this.getcalled(), null, "called", null, 1, 1, SQLQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calledEClass, called.class, "called", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callerEClass, caller.class, "caller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cleranceRequestEClass, CleranceRequest.class, "CleranceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCleranceRequest_Caller(), this.getcaller(), null, "caller", null, 1, 1, CleranceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCleranceRequest_Called(), this.getcalled(), null, "called", null, 1, 1, CleranceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityQueryEClass, SecurityQuery.class, "SecurityQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityQuery_Caller(), this.getcaller(), null, "caller", null, 1, 1, SecurityQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityQuery_Called(), this.getcalled(), null, "called", null, 1, 1, SecurityQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attach1EClass, attach1.class, "attach1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattach1_Securitycheck(), this.getSecurityCheck(), null, "securitycheck", null, 0, 1, attach1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattach1_Caller(), this.getcaller(), null, "caller", null, 0, 1, attach1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attach2EClass, attach2.class, "attach2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattach2_Securityauth(), this.getSecurityAuth(), null, "securityauth", null, 1, 1, attach2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattach2_Called(), this.getcalled(), null, "called", null, 1, 1, attach2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attach3EClass, attach3.class, "attach3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattach3_Dbquery(), this.getDBQuery(), null, "dbquery", null, 1, 1, attach3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattach3_Caller(), this.getcaller(), null, "caller", null, 0, 1, attach3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attach4EClass, attach4.class, "attach4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattach4_Query(), this.getQuery(), null, "query", null, 0, 1, attach4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattach4_Caller(), this.getcaller(), null, "caller", null, 0, 1, attach4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityManagementEClass, SecurityManagement.class, "SecurityManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpcEClass, cosaM1.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Caller(), this.getcaller(), null, "caller", null, 1, 1, cosaM1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Called(), this.getcalled(), null, "called", null, 1, 1, cosaM1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attach5EClass, attach5.class, "attach5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattach5_Credentialquery(), this.getCredentialQuery(), null, "credentialquery", null, 1, 1, attach5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattach5_Called(), this.getcalled(), null, "called", null, 0, 1, attach5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attach6EClass, attach6.class, "attach6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattach6_Securitymanagement(), this.getSecurityManagement(), null, "securitymanagement", null, 0, 1, attach6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattach6_Called(), this.getcalled(), null, "called", null, 0, 1, attach6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bind1EClass, bind1.class, "bind1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbind1_Externalsocket(), this.getExternalSocket(), null, "externalsocket", null, 1, 1, bind1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbind1_ConnectionMangerexternalsocket(), this.getExternalSocket(), null, "ConnectionMangerexternalsocket", null, 1, 1, bind1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bind2EClass, bind2.class, "bind2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbind2_Provide(), this.getProvide(), null, "provide", null, 1, 1, bind2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbind2_Externalsocket(), this.getExternalSocket(), null, "externalsocket", null, 0, 1, bind2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CosaM1PackageImpl
