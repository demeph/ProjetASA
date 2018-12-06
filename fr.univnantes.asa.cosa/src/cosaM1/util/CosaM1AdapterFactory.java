/**
 */
package cosaM1.util;

import cosa.Attachement;
import cosa.Binding;
import cosa.Component;
import cosa.ComponentInterface;
import cosa.ComposedElement;
import cosa.Configuration;
import cosa.Connector;
import cosa.ConnectorInterface;
import cosa.Interface;
import cosa.NamedElement;
import cosa.Port;
import cosa.ProvidedPort;
import cosa.ProvidedRole;
import cosa.ProvidedService;
import cosa.RequiredPort;
import cosa.RequiredRole;
import cosa.RequiredService;
import cosa.Role;
import cosa.Service;

import cosaM1.*;
import cosaM1.SecurityManager;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cosaM1.CosaM1Package
 * @generated
 */
public class CosaM1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CosaM1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaM1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CosaM1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CosaM1Switch<Adapter> modelSwitch =
		new CosaM1Switch<Adapter>() {
			@Override
			public Adapter caseSimple_CS(Simple_CS object) {
				return createSimple_CSAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseServeur(Serveur object) {
				return createServeurAdapter();
			}
			@Override
			public Adapter caseServeurDetail(ServeurDetail object) {
				return createServeurDetailAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseSendRequest(SendRequest object) {
				return createSendRequestAdapter();
			}
			@Override
			public Adapter caseProvide(Provide object) {
				return createProvideAdapter();
			}
			@Override
			public Adapter caseRecieveRequest(RecieveRequest object) {
				return createRecieveRequestAdapter();
			}
			@Override
			public Adapter caseExternalSocket(ExternalSocket object) {
				return createExternalSocketAdapter();
			}
			@Override
			public Adapter caseConnectionManager(ConnectionManager object) {
				return createConnectionManagerAdapter();
			}
			@Override
			public Adapter caseSecurityManger(SecurityManager object) {
				return createSecurityMangerAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseDBQuery(DBQuery object) {
				return createDBQueryAdapter();
			}
			@Override
			public Adapter caseSecurityCheck(SecurityCheck object) {
				return createSecurityCheckAdapter();
			}
			@Override
			public Adapter caseSecurityAuth(SecurityAuth object) {
				return createSecurityAuthAdapter();
			}
			@Override
			public Adapter caseCredentialQuery(CredentialQuery object) {
				return createCredentialQueryAdapter();
			}
			@Override
			public Adapter caseSQLQuery(SQLQuery object) {
				return createSQLQueryAdapter();
			}
			@Override
			public Adapter casecalled(called object) {
				return createcalledAdapter();
			}
			@Override
			public Adapter casecaller(caller object) {
				return createcallerAdapter();
			}
			@Override
			public Adapter caseCleranceRequest(CleranceRequest object) {
				return createCleranceRequestAdapter();
			}
			@Override
			public Adapter caseSecurityQuery(SecurityQuery object) {
				return createSecurityQueryAdapter();
			}
			@Override
			public Adapter caseattach1(attach1 object) {
				return createattach1Adapter();
			}
			@Override
			public Adapter caseattach2(attach2 object) {
				return createattach2Adapter();
			}
			@Override
			public Adapter caseattach3(attach3 object) {
				return createattach3Adapter();
			}
			@Override
			public Adapter caseattach4(attach4 object) {
				return createattach4Adapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseSecurityManagement(SecurityManagement object) {
				return createSecurityManagementAdapter();
			}
			@Override
			public Adapter caseRPC(RPC object) {
				return createRPCAdapter();
			}
			@Override
			public Adapter caseattach5(attach5 object) {
				return createattach5Adapter();
			}
			@Override
			public Adapter caseattach6(attach6 object) {
				return createattach6Adapter();
			}
			@Override
			public Adapter casebind1(bind1 object) {
				return createbind1Adapter();
			}
			@Override
			public Adapter casebind2(bind2 object) {
				return createbind2Adapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseComposedElement(ComposedElement object) {
				return createComposedElementAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseComponentInterface(ComponentInterface object) {
				return createComponentInterfaceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseRequiredPort(RequiredPort object) {
				return createRequiredPortAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseRequiredService(RequiredService object) {
				return createRequiredServiceAdapter();
			}
			@Override
			public Adapter caseProvidedPort(ProvidedPort object) {
				return createProvidedPortAdapter();
			}
			@Override
			public Adapter caseProvidedService(ProvidedService object) {
				return createProvidedServiceAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseConnectorInterface(ConnectorInterface object) {
				return createConnectorInterfaceAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseProvidedRole(ProvidedRole object) {
				return createProvidedRoleAdapter();
			}
			@Override
			public Adapter caseRequiredRole(RequiredRole object) {
				return createRequiredRoleAdapter();
			}
			@Override
			public Adapter caseAttachement(Attachement object) {
				return createAttachementAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Simple_CS <em>Simple CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Simple_CS
	 * @generated
	 */
	public Adapter createSimple_CSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Serveur
	 * @generated
	 */
	public Adapter createServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.ServeurDetail <em>Serveur Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.ServeurDetail
	 * @generated
	 */
	public Adapter createServeurDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SendRequest <em>Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SendRequest
	 * @generated
	 */
	public Adapter createSendRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Provide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Provide
	 * @generated
	 */
	public Adapter createProvideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.RecieveRequest <em>Recieve Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.RecieveRequest
	 * @generated
	 */
	public Adapter createRecieveRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.ExternalSocket <em>External Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.ExternalSocket
	 * @generated
	 */
	public Adapter createExternalSocketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.ConnectionManager
	 * @generated
	 */
	public Adapter createConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SecurityManager <em>Security Manger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SecurityManager
	 * @generated
	 */
	public Adapter createSecurityMangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.DBQuery <em>DB Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.DBQuery
	 * @generated
	 */
	public Adapter createDBQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SecurityCheck <em>Security Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SecurityCheck
	 * @generated
	 */
	public Adapter createSecurityCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SecurityAuth <em>Security Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SecurityAuth
	 * @generated
	 */
	public Adapter createSecurityAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.CredentialQuery <em>Credential Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.CredentialQuery
	 * @generated
	 */
	public Adapter createCredentialQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SQLQuery <em>SQL Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SQLQuery
	 * @generated
	 */
	public Adapter createSQLQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.called <em>called</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.called
	 * @generated
	 */
	public Adapter createcalledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.caller <em>caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.caller
	 * @generated
	 */
	public Adapter createcallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.CleranceRequest <em>Clerance Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.CleranceRequest
	 * @generated
	 */
	public Adapter createCleranceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SecurityQuery <em>Security Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SecurityQuery
	 * @generated
	 */
	public Adapter createSecurityQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.attach1 <em>attach1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.attach1
	 * @generated
	 */
	public Adapter createattach1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.attach2 <em>attach2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.attach2
	 * @generated
	 */
	public Adapter createattach2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.attach3 <em>attach3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.attach3
	 * @generated
	 */
	public Adapter createattach3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.attach4 <em>attach4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.attach4
	 * @generated
	 */
	public Adapter createattach4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.SecurityManagement <em>Security Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.SecurityManagement
	 * @generated
	 */
	public Adapter createSecurityManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.attach5 <em>attach5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.attach5
	 * @generated
	 */
	public Adapter createattach5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.attach6 <em>attach6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.attach6
	 * @generated
	 */
	public Adapter createattach6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.bind1 <em>bind1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.bind1
	 * @generated
	 */
	public Adapter createbind1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosaM1.bind2 <em>bind2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosaM1.bind2
	 * @generated
	 */
	public Adapter createbind2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ComposedElement <em>Composed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ComposedElement
	 * @generated
	 */
	public Adapter createComposedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ComponentInterface
	 * @generated
	 */
	public Adapter createComponentInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.RequiredPort
	 * @generated
	 */
	public Adapter createRequiredPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.RequiredService
	 * @generated
	 */
	public Adapter createRequiredServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ProvidedPort
	 * @generated
	 */
	public Adapter createProvidedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ProvidedService
	 * @generated
	 */
	public Adapter createProvidedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ConnectorInterface <em>Connector Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ConnectorInterface
	 * @generated
	 */
	public Adapter createConnectorInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ProvidedRole
	 * @generated
	 */
	public Adapter createProvidedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.RequiredRole
	 * @generated
	 */
	public Adapter createRequiredRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Attachement
	 * @generated
	 */
	public Adapter createAttachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CosaM1AdapterFactory
