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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cosaM1.CosaM1Package
 * @generated
 */
public class CosaM1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CosaM1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaM1Switch() {
		if (modelPackage == null) {
			modelPackage = CosaM1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CosaM1Package.SIMPLE_CS: {
				Simple_CS simple_CS = (Simple_CS)theEObject;
				T result = caseSimple_CS(simple_CS);
				if (result == null) result = caseConfiguration(simple_CS);
				if (result == null) result = caseComposedElement(simple_CS);
				if (result == null) result = caseNamedElement(simple_CS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseComponent(client);
				if (result == null) result = caseNamedElement(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SERVEUR: {
				Serveur serveur = (Serveur)theEObject;
				T result = caseServeur(serveur);
				if (result == null) result = caseComponent(serveur);
				if (result == null) result = caseNamedElement(serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SERVEUR_DETAIL: {
				ServeurDetail serveurDetail = (ServeurDetail)theEObject;
				T result = caseServeurDetail(serveurDetail);
				if (result == null) result = caseConfiguration(serveurDetail);
				if (result == null) result = caseComposedElement(serveurDetail);
				if (result == null) result = caseNamedElement(serveurDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = caseRequiredPort(request);
				if (result == null) result = casePort(request);
				if (result == null) result = caseComponentInterface(request);
				if (result == null) result = caseInterface(request);
				if (result == null) result = caseNamedElement(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SEND_REQUEST: {
				SendRequest sendRequest = (SendRequest)theEObject;
				T result = caseSendRequest(sendRequest);
				if (result == null) result = caseRequiredService(sendRequest);
				if (result == null) result = caseService(sendRequest);
				if (result == null) result = caseInterface(sendRequest);
				if (result == null) result = caseNamedElement(sendRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.PROVIDE: {
				Provide provide = (Provide)theEObject;
				T result = caseProvide(provide);
				if (result == null) result = caseProvidedPort(provide);
				if (result == null) result = casePort(provide);
				if (result == null) result = caseComponentInterface(provide);
				if (result == null) result = caseInterface(provide);
				if (result == null) result = caseNamedElement(provide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.RECIEVE_REQUEST: {
				RecieveRequest recieveRequest = (RecieveRequest)theEObject;
				T result = caseRecieveRequest(recieveRequest);
				if (result == null) result = caseProvidedService(recieveRequest);
				if (result == null) result = caseService(recieveRequest);
				if (result == null) result = caseInterface(recieveRequest);
				if (result == null) result = caseNamedElement(recieveRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.EXTERNAL_SOCKET: {
				ExternalSocket externalSocket = (ExternalSocket)theEObject;
				T result = caseExternalSocket(externalSocket);
				if (result == null) result = caseProvidedPort(externalSocket);
				if (result == null) result = casePort(externalSocket);
				if (result == null) result = caseComponentInterface(externalSocket);
				if (result == null) result = caseInterface(externalSocket);
				if (result == null) result = caseNamedElement(externalSocket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.CONNECTION_MANAGER: {
				ConnectionManager connectionManager = (ConnectionManager)theEObject;
				T result = caseConnectionManager(connectionManager);
				if (result == null) result = caseComponent(connectionManager);
				if (result == null) result = caseNamedElement(connectionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SECURITY_MANGER: {
				SecurityManager securityManger = (SecurityManager)theEObject;
				T result = caseSecurityManger(securityManger);
				if (result == null) result = caseComponent(securityManger);
				if (result == null) result = caseNamedElement(securityManger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseComponent(database);
				if (result == null) result = caseNamedElement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.DB_QUERY: {
				DBQuery dbQuery = (DBQuery)theEObject;
				T result = caseDBQuery(dbQuery);
				if (result == null) result = caseProvidedPort(dbQuery);
				if (result == null) result = casePort(dbQuery);
				if (result == null) result = caseComponentInterface(dbQuery);
				if (result == null) result = caseInterface(dbQuery);
				if (result == null) result = caseNamedElement(dbQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SECURITY_CHECK: {
				SecurityCheck securityCheck = (SecurityCheck)theEObject;
				T result = caseSecurityCheck(securityCheck);
				if (result == null) result = caseRequiredPort(securityCheck);
				if (result == null) result = casePort(securityCheck);
				if (result == null) result = caseComponentInterface(securityCheck);
				if (result == null) result = caseInterface(securityCheck);
				if (result == null) result = caseNamedElement(securityCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SECURITY_AUTH: {
				SecurityAuth securityAuth = (SecurityAuth)theEObject;
				T result = caseSecurityAuth(securityAuth);
				if (result == null) result = caseProvidedPort(securityAuth);
				if (result == null) result = casePort(securityAuth);
				if (result == null) result = caseComponentInterface(securityAuth);
				if (result == null) result = caseInterface(securityAuth);
				if (result == null) result = caseNamedElement(securityAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.CREDENTIAL_QUERY: {
				CredentialQuery credentialQuery = (CredentialQuery)theEObject;
				T result = caseCredentialQuery(credentialQuery);
				if (result == null) result = caseProvidedPort(credentialQuery);
				if (result == null) result = casePort(credentialQuery);
				if (result == null) result = caseComponentInterface(credentialQuery);
				if (result == null) result = caseInterface(credentialQuery);
				if (result == null) result = caseNamedElement(credentialQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SQL_QUERY: {
				SQLQuery sqlQuery = (SQLQuery)theEObject;
				T result = caseSQLQuery(sqlQuery);
				if (result == null) result = caseConnector(sqlQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.CALLED: {
				called called = (called)theEObject;
				T result = casecalled(called);
				if (result == null) result = caseProvidedRole(called);
				if (result == null) result = caseRole(called);
				if (result == null) result = caseConnectorInterface(called);
				if (result == null) result = caseInterface(called);
				if (result == null) result = caseNamedElement(called);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.CALLER: {
				caller caller = (caller)theEObject;
				T result = casecaller(caller);
				if (result == null) result = caseRequiredRole(caller);
				if (result == null) result = caseRole(caller);
				if (result == null) result = caseConnectorInterface(caller);
				if (result == null) result = caseInterface(caller);
				if (result == null) result = caseNamedElement(caller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.CLERANCE_REQUEST: {
				CleranceRequest cleranceRequest = (CleranceRequest)theEObject;
				T result = caseCleranceRequest(cleranceRequest);
				if (result == null) result = caseConnector(cleranceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SECURITY_QUERY: {
				SecurityQuery securityQuery = (SecurityQuery)theEObject;
				T result = caseSecurityQuery(securityQuery);
				if (result == null) result = caseConnector(securityQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.ATTACH1: {
				attach1 attach1 = (attach1)theEObject;
				T result = caseattach1(attach1);
				if (result == null) result = caseAttachement(attach1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.ATTACH2: {
				attach2 attach2 = (attach2)theEObject;
				T result = caseattach2(attach2);
				if (result == null) result = caseAttachement(attach2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.ATTACH3: {
				attach3 attach3 = (attach3)theEObject;
				T result = caseattach3(attach3);
				if (result == null) result = caseAttachement(attach3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.ATTACH4: {
				attach4 attach4 = (attach4)theEObject;
				T result = caseattach4(attach4);
				if (result == null) result = caseAttachement(attach4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseProvidedPort(query);
				if (result == null) result = casePort(query);
				if (result == null) result = caseComponentInterface(query);
				if (result == null) result = caseInterface(query);
				if (result == null) result = caseNamedElement(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.SECURITY_MANAGEMENT: {
				SecurityManagement securityManagement = (SecurityManagement)theEObject;
				T result = caseSecurityManagement(securityManagement);
				if (result == null) result = caseRequiredPort(securityManagement);
				if (result == null) result = casePort(securityManagement);
				if (result == null) result = caseComponentInterface(securityManagement);
				if (result == null) result = caseInterface(securityManagement);
				if (result == null) result = caseNamedElement(securityManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.RPC: {
				RPC rpc = (RPC)theEObject;
				T result = caseRPC(rpc);
				if (result == null) result = caseConnector(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.ATTACH5: {
				attach5 attach5 = (attach5)theEObject;
				T result = caseattach5(attach5);
				if (result == null) result = caseAttachement(attach5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.ATTACH6: {
				attach6 attach6 = (attach6)theEObject;
				T result = caseattach6(attach6);
				if (result == null) result = caseAttachement(attach6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.BIND1: {
				bind1 bind1 = (bind1)theEObject;
				T result = casebind1(bind1);
				if (result == null) result = caseBinding(bind1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaM1Package.BIND2: {
				bind2 bind2 = (bind2)theEObject;
				T result = casebind2(bind2);
				if (result == null) result = caseBinding(bind2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple_CS(Simple_CS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur(Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeurDetail(ServeurDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendRequest(SendRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvide(Provide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recieve Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recieve Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecieveRequest(RecieveRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Socket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Socket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSocket(ExternalSocket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager(ConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManger(SecurityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBQuery(DBQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCheck(SecurityCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityAuth(SecurityAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credential Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credential Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredentialQuery(CredentialQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLQuery(SQLQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>called</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>called</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecalled(called object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>caller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>caller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecaller(caller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clerance Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clerance Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleranceRequest(CleranceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityQuery(SecurityQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attach1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attach1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattach1(attach1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attach2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attach2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattach2(attach2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attach3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attach3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattach3(attach3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attach4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attach4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattach4(attach4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManagement(SecurityManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attach5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attach5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattach5(attach5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attach6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attach6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattach6(attach6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>bind1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>bind1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebind1(bind1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>bind2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>bind2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebind2(bind2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedElement(ComposedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInterface(ComponentInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPort(RequiredPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredService(RequiredService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedPort(ProvidedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedService(ProvidedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorInterface(ConnectorInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedRole(ProvidedRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredRole(RequiredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachement(Attachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CosaM1Switch
