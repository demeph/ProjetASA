/**
 */
package cosaM1.impl;

import cosa.impl.RequiredPortImpl;

import cosaM1.CosaM1Package;
import cosaM1.SecurityManagement;
import cosaM1.ServeurDetail;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SecurityManagementImpl extends RequiredPortImpl implements SecurityManagement {
	
	private ServeurDetail sd;
	
	private String requestStr;
	
	public void sendRequest(String request) {
		this.requestStr = request;
		this.sd.handleRequest(EnumAction.callSecurityManager, requestStr);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.SECURITY_MANAGEMENT;
	}

} //SecurityManagementImpl
