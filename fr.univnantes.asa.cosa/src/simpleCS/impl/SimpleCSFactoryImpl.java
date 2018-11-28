/**
 */
package simpleCS.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleCS.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleCSFactoryImpl extends EFactoryImpl implements SimpleCSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleCSFactory init() {
		try {
			SimpleCSFactory theSimpleCSFactory = (SimpleCSFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleCSPackage.eNS_URI);
			if (theSimpleCSFactory != null) {
				return theSimpleCSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleCSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCSFactoryImpl() {
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
			case SimpleCSPackage.CLIENT: return createClient();
			case SimpleCSPackage.SIMPLE_CS: return createSimple_CS();
			case SimpleCSPackage.SERVEUR: return createServeur();
			case SimpleCSPackage.SEND_REQUEST_IN: return createSend_Request_In();
			case SimpleCSPackage.SEND_REQUEST: return createSend_Request();
			case SimpleCSPackage.SEND_REQUEST_OUT: return createSend_Request_Out();
			case SimpleCSPackage.RPC: return createRPC();
			case SimpleCSPackage.CALLER: return createcaller();
			case SimpleCSPackage.CALLED: return createcalled();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Simple_CS createSimple_CS() {
		Simple_CSImpl simple_CS = new Simple_CSImpl();
		return simple_CS;
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
	public Send_Request_In createSend_Request_In() {
		Send_Request_InImpl send_Request_In = new Send_Request_InImpl();
		return send_Request_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send_Request createSend_Request() {
		Send_RequestImpl send_Request = new Send_RequestImpl();
		return send_Request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send_Request_Out createSend_Request_Out() {
		Send_Request_OutImpl send_Request_Out = new Send_Request_OutImpl();
		return send_Request_Out;
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
	public caller createcaller() {
		callerImpl caller = new callerImpl();
		return caller;
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
	public SimpleCSPackage getSimpleCSPackage() {
		return (SimpleCSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleCSPackage getPackage() {
		return SimpleCSPackage.eINSTANCE;
	}

} //SimpleCSFactoryImpl
