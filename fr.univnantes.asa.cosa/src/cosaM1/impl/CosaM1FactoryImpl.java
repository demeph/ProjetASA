/**
 */
package cosaM1.impl;

import cosaM1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CosaM1FactoryImpl extends EFactoryImpl implements CosaM1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CosaM1Factory init() {
		try {
			CosaM1Factory theCosaM1Factory = (CosaM1Factory)EPackage.Registry.INSTANCE.getEFactory(CosaM1Package.eNS_URI);
			if (theCosaM1Factory != null) {
				return theCosaM1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CosaM1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaM1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CosaM1Package.SIMPLE_CS: return createSimple_CS();
			case CosaM1Package.CLIENT: return createClient();
			case CosaM1Package.SERVEUR: return createServeur();
			case CosaM1Package.SERVEUR_DETAIL: return createServeurDetail();
			case CosaM1Package.REQUEST: return createRequest();
			case CosaM1Package.SEND_REQUEST: return createSendRequest();
			case CosaM1Package.PROVIDE: return createProvide();
			case CosaM1Package.RECIEVE_REQUEST: return createRecieveRequest();
			case CosaM1Package.EXTERNAL_SOCKET: return createExternalSocket();
			case CosaM1Package.CONNECTION_MANAGER: return createConnectionManager();
			case CosaM1Package.SECURITY_MANGER: return createSecurityManger();
			case CosaM1Package.DATABASE: return createDatabase();
			case CosaM1Package.DB_QUERY: return createDBQuery();
			case CosaM1Package.SECURITY_CHECK: return createSecurityCheck();
			case CosaM1Package.SECURITY_AUTH: return createSecurityAuth();
			case CosaM1Package.CREDENTIAL_QUERY: return createCredentialQuery();
			case CosaM1Package.SQL_QUERY: return createSQLQuery();
			case CosaM1Package.CALLED: return createcalled();
			case CosaM1Package.CALLER: return createcaller();
			case CosaM1Package.CLERANCE_REQUEST: return createCleranceRequest();
			case CosaM1Package.SECURITY_QUERY: return createSecurityQuery();
			case CosaM1Package.ATTACH1: return createattach1();
			case CosaM1Package.ATTACH2: return createattach2();
			case CosaM1Package.ATTACH3: return createattach3();
			case CosaM1Package.ATTACH4: return createattach4();
			case CosaM1Package.QUERY: return createQuery();
			case CosaM1Package.SECURITY_MANAGEMENT: return createSecurityManagement();
			case CosaM1Package.RPC: return createRPC();
			case CosaM1Package.ATTACH5: return createattach5();
			case CosaM1Package.ATTACH6: return createattach6();
			case CosaM1Package.BIND1: return createbind1();
			case CosaM1Package.BIND2: return createbind2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple_CS createSimple_CS() {
		Simple_CSImpl simple_CS = new Simple_CSImpl();
		return simple_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur createServeur() {
		ServeurImpl serveur = new ServeurImpl();
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurDetail createServeurDetail() {
		ServeurDetailImpl serveurDetail = new ServeurDetailImpl();
		return serveurDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendRequest createSendRequest() {
		SendRequestImpl sendRequest = new SendRequestImpl();
		return sendRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide createProvide() {
		ProvideImpl provide = new ProvideImpl();
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecieveRequest createRecieveRequest() {
		RecieveRequestImpl recieveRequest = new RecieveRequestImpl();
		return recieveRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket createExternalSocket() {
		ExternalSocketImpl externalSocket = new ExternalSocketImpl();
		return externalSocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager createConnectionManager() {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManger createSecurityManger() {
		SecurityMangerImpl securityManger = new SecurityMangerImpl();
		return securityManger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBQuery createDBQuery() {
		DBQueryImpl dbQuery = new DBQueryImpl();
		return dbQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCheck createSecurityCheck() {
		SecurityCheckImpl securityCheck = new SecurityCheckImpl();
		return securityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAuth createSecurityAuth() {
		SecurityAuthImpl securityAuth = new SecurityAuthImpl();
		return securityAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialQuery createCredentialQuery() {
		CredentialQueryImpl credentialQuery = new CredentialQueryImpl();
		return credentialQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQuery createSQLQuery() {
		SQLQueryImpl sqlQuery = new SQLQueryImpl();
		return sqlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public called createcalled() {
		calledImpl called = new calledImpl();
		return called;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public caller createcaller() {
		callerImpl caller = new callerImpl();
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleranceRequest createCleranceRequest() {
		CleranceRequestImpl cleranceRequest = new CleranceRequestImpl();
		return cleranceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityQuery createSecurityQuery() {
		SecurityQueryImpl securityQuery = new SecurityQueryImpl();
		return securityQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach1 createattach1() {
		attach1Impl attach1 = new attach1Impl();
		return attach1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach2 createattach2() {
		attach2Impl attach2 = new attach2Impl();
		return attach2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach3 createattach3() {
		attach3Impl attach3 = new attach3Impl();
		return attach3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach4 createattach4() {
		attach4Impl attach4 = new attach4Impl();
		return attach4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagement createSecurityManagement() {
		SecurityManagementImpl securityManagement = new SecurityManagementImpl();
		return securityManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach5 createattach5() {
		attach5Impl attach5 = new attach5Impl();
		return attach5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach6 createattach6() {
		attach6Impl attach6 = new attach6Impl();
		return attach6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bind1 createbind1() {
		bind1Impl bind1 = new bind1Impl();
		return bind1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bind2 createbind2() {
		bind2Impl bind2 = new bind2Impl();
		return bind2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaM1Package getCosaM1Package() {
		return (CosaM1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CosaM1Package getPackage() {
		return CosaM1Package.eINSTANCE;
	}

} //CosaM1FactoryImpl
