/**
 */
package cosaM1;

import cosa.RequiredPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Check</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cosaM1.CosaM1Package#getSecurityCheck()
 * @model
 * @generated
 */
public interface SecurityCheck extends RequiredPort {

	ServeurDetail getSd();

	void setSd(ServeurDetail sd);

	void transferToDB(String securityauthStr);
} // SecurityCheck
