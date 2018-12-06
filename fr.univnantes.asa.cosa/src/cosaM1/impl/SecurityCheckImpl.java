/**
 */
package cosaM1.impl;

import cosa.impl.RequiredPortImpl;

import cosaM1.CosaM1Package;
import cosaM1.SecurityCheck;
import cosaM1.ServeurDetail;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SecurityCheckImpl extends RequiredPortImpl implements SecurityCheck {
	
	private ServeurDetail sd;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityCheckImpl() {
		super();
	}


	@Override
	public ServeurDetail getSd() {
		return sd;
	}
	
	@Override
	public void setSd(ServeurDetail sd) {
		this.sd = sd;
	}
	
	@Override
	public void transferToDB(String securityauthStr) {
		
	}

	//------------------------ NOT USED --------------------------------
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.SECURITY_CHECK;
	}

} //SecurityCheckImpl
