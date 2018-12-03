/**
 */
package cosaM1;

import cosa.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.ServeurDetail#getExternalsocket <em>Externalsocket</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getDatabase <em>Database</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getSqlquery <em>Sqlquery</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getClerancerequest <em>Clerancerequest</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getAttach1 <em>Attach1</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getAttach2 <em>Attach2</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getAttach3 <em>Attach3</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getAttach4 <em>Attach4</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getAttach5 <em>Attach5</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getAttach6 <em>Attach6</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getBind1 <em>Bind1</em>}</li>
 *   <li>{@link cosaM1.ServeurDetail#getSecurityquery <em>Securityquery</em>}</li>
 * </ul>
 *
 * @see cosaM1.CosaM1Package#getServeurDetail()
 * @model
 * @generated
 */
public interface ServeurDetail extends Configuration {
	/**
	 * Returns the value of the '<em><b>Externalsocket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsocket</em>' containment reference.
	 * @see #setExternalsocket(ExternalSocket)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Externalsocket()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExternalSocket getExternalsocket();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getExternalsocket <em>Externalsocket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket</em>' containment reference.
	 * @see #getExternalsocket()
	 * @generated
	 */
	void setExternalsocket(ExternalSocket value);

	/**
	 * Returns the value of the '<em><b>Connectionmanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionmanager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionmanager</em>' containment reference.
	 * @see #setConnectionmanager(ConnectionManager)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Connectionmanager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionManager getConnectionmanager();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getConnectionmanager <em>Connectionmanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionmanager</em>' containment reference.
	 * @see #getConnectionmanager()
	 * @generated
	 */
	void setConnectionmanager(ConnectionManager value);

	/**
	 * Returns the value of the '<em><b>Securitymanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanager</em>' containment reference.
	 * @see #setSecuritymanager(SecurityManger)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Securitymanager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityManger getSecuritymanager();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getSecuritymanager <em>Securitymanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanager</em>' containment reference.
	 * @see #getSecuritymanager()
	 * @generated
	 */
	void setSecuritymanager(SecurityManger value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Database()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Sqlquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqlquery</em>' containment reference.
	 * @see #setSqlquery(SQLQuery)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Sqlquery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SQLQuery getSqlquery();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getSqlquery <em>Sqlquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqlquery</em>' containment reference.
	 * @see #getSqlquery()
	 * @generated
	 */
	void setSqlquery(SQLQuery value);

	/**
	 * Returns the value of the '<em><b>Clerancerequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clerancerequest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clerancerequest</em>' containment reference.
	 * @see #setClerancerequest(CleranceRequest)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Clerancerequest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CleranceRequest getClerancerequest();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getClerancerequest <em>Clerancerequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clerancerequest</em>' containment reference.
	 * @see #getClerancerequest()
	 * @generated
	 */
	void setClerancerequest(CleranceRequest value);

	/**
	 * Returns the value of the '<em><b>Attach1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach1</em>' containment reference.
	 * @see #setAttach1(attach1)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Attach1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	attach1 getAttach1();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getAttach1 <em>Attach1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach1</em>' containment reference.
	 * @see #getAttach1()
	 * @generated
	 */
	void setAttach1(attach1 value);

	/**
	 * Returns the value of the '<em><b>Attach2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach2</em>' containment reference.
	 * @see #setAttach2(attach2)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Attach2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	attach2 getAttach2();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getAttach2 <em>Attach2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach2</em>' containment reference.
	 * @see #getAttach2()
	 * @generated
	 */
	void setAttach2(attach2 value);

	/**
	 * Returns the value of the '<em><b>Attach3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach3</em>' containment reference.
	 * @see #setAttach3(attach3)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Attach3()
	 * @model containment="true" required="true"
	 * @generated
	 */
	attach3 getAttach3();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getAttach3 <em>Attach3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach3</em>' containment reference.
	 * @see #getAttach3()
	 * @generated
	 */
	void setAttach3(attach3 value);

	/**
	 * Returns the value of the '<em><b>Attach4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach4</em>' containment reference.
	 * @see #setAttach4(attach4)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Attach4()
	 * @model containment="true" required="true"
	 * @generated
	 */
	attach4 getAttach4();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getAttach4 <em>Attach4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach4</em>' containment reference.
	 * @see #getAttach4()
	 * @generated
	 */
	void setAttach4(attach4 value);

	/**
	 * Returns the value of the '<em><b>Attach5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach5</em>' containment reference.
	 * @see #setAttach5(attach5)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Attach5()
	 * @model containment="true" required="true"
	 * @generated
	 */
	attach5 getAttach5();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getAttach5 <em>Attach5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach5</em>' containment reference.
	 * @see #getAttach5()
	 * @generated
	 */
	void setAttach5(attach5 value);

	/**
	 * Returns the value of the '<em><b>Attach6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach6</em>' containment reference.
	 * @see #setAttach6(attach6)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Attach6()
	 * @model containment="true" required="true"
	 * @generated
	 */
	attach6 getAttach6();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getAttach6 <em>Attach6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach6</em>' containment reference.
	 * @see #getAttach6()
	 * @generated
	 */
	void setAttach6(attach6 value);

	/**
	 * Returns the value of the '<em><b>Bind1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind1</em>' containment reference.
	 * @see #setBind1(bind1)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Bind1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	bind1 getBind1();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getBind1 <em>Bind1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind1</em>' containment reference.
	 * @see #getBind1()
	 * @generated
	 */
	void setBind1(bind1 value);

	/**
	 * Returns the value of the '<em><b>Securityquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityquery</em>' containment reference.
	 * @see #setSecurityquery(SecurityQuery)
	 * @see cosaM1.CosaM1Package#getServeurDetail_Securityquery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityQuery getSecurityquery();

	/**
	 * Sets the value of the '{@link cosaM1.ServeurDetail#getSecurityquery <em>Securityquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityquery</em>' containment reference.
	 * @see #getSecurityquery()
	 * @generated
	 */
	void setSecurityquery(SecurityQuery value);

} // ServeurDetail
