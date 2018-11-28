/**
 */
package simpleCS.impl;

import cosa.impl.ProvidedServiceImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import simpleCS.Send_Request;
import simpleCS.SimpleCSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Send_RequestImpl extends ProvidedServiceImpl implements Send_Request {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Send_RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleCSPackage.Literals.SEND_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SimpleCSPackage.SEND_REQUEST___SEND_REQUEST:
				sendRequest();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Send_RequestImpl
