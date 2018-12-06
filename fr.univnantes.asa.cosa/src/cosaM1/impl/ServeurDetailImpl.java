/**
 */
package cosaM1.impl;

import cosa.impl.ConfigurationImpl;

import cosaM1.CleranceRequest;
import cosaM1.ConnectionManager;
import cosaM1.CosaM1Package;
import cosaM1.Database;
import cosaM1.ExternalSocket;
import cosaM1.SQLQuery;
import cosaM1.SecurityManager;
import cosaM1.SecurityQuery;
import cosaM1.ServeurDetail;
import cosaM1.attach1;
import cosaM1.attach2;
import cosaM1.attach3;
import cosaM1.attach4;
import cosaM1.attach5;
import cosaM1.attach6;
import cosaM1.bind1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getExternalsocket <em>Externalsocket</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getSqlquery <em>Sqlquery</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getClerancerequest <em>Clerancerequest</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getAttach1 <em>Attach1</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getAttach2 <em>Attach2</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getAttach3 <em>Attach3</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getAttach4 <em>Attach4</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getAttach5 <em>Attach5</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getAttach6 <em>Attach6</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getBind1 <em>Bind1</em>}</li>
 *   <li>{@link cosaM1.impl.ServeurDetailImpl#getSecurityquery <em>Securityquery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServeurDetailImpl extends ConfigurationImpl implements ServeurDetail {
	/**
	 * The cached value of the '{@link #getExternalsocket() <em>Externalsocket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsocket()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket externalsocket;

	/**
	 * The cached value of the '{@link #getConnectionmanager() <em>Connectionmanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected ConnectionManager connectionmanager;

	/**
	 * The cached value of the '{@link #getSecuritymanager() <em>Securitymanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanager()
	 * @generated
	 * @ordered
	 */
	protected SecurityManager securitymanager;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getSqlquery() <em>Sqlquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlquery()
	 * @generated
	 * @ordered
	 */
	protected SQLQuery sqlquery;

	/**
	 * The cached value of the '{@link #getClerancerequest() <em>Clerancerequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClerancerequest()
	 * @generated
	 * @ordered
	 */
	protected CleranceRequest clerancerequest;
	
	@Override
	public void update(EnumAction action,String request) {
		switch (action) {
		case callConnectionManager:
			this.connectionmanager.requestFromSD(request);
			break;
		case callClearanceRequest:
			this.clerancerequest.checkSecurity(this.connectionmanager.getExtSocketStr());
			break;
		case callSecurityManager:
			this.securitymanager.verifySecurity(this.clerancerequest.getCalledRole());
			break;
		case callSecurityQuery:
			this.securityquery.transferToDB(this.securitymanager.getSecurityauthStr());
			break;
		case callDatabase:
			this.database.verifySecurityIDs(this.securityquery.getCalledRole());
			break;
		default:
			break;
		}
		
	}
	
//---------------------------- NOT USED ----------------------------------------------------
	

	/**
	 * The cached value of the '{@link #getAttach1() <em>Attach1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach1()
	 * @generated
	 * @ordered
	 */
	protected attach1 attach1;

	/**
	 * The cached value of the '{@link #getAttach2() <em>Attach2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach2()
	 * @generated
	 * @ordered
	 */
	protected attach2 attach2;

	/**
	 * The cached value of the '{@link #getAttach3() <em>Attach3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach3()
	 * @generated
	 * @ordered
	 */
	protected attach3 attach3;

	/**
	 * The cached value of the '{@link #getAttach4() <em>Attach4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach4()
	 * @generated
	 * @ordered
	 */
	protected attach4 attach4;

	/**
	 * The cached value of the '{@link #getAttach5() <em>Attach5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach5()
	 * @generated
	 * @ordered
	 */
	protected attach5 attach5;

	/**
	 * The cached value of the '{@link #getAttach6() <em>Attach6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach6()
	 * @generated
	 * @ordered
	 */
	protected attach6 attach6;

	/**
	 * The cached value of the '{@link #getBind1() <em>Bind1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind1()
	 * @generated
	 * @ordered
	 */
	protected bind1 bind1;

	/**
	 * The cached value of the '{@link #getSecurityquery() <em>Securityquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityquery()
	 * @generated
	 * @ordered
	 */
	protected SecurityQuery securityquery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServeurDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaM1Package.Literals.SERVEUR_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket getExternalsocket() {
		return externalsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalsocket(ExternalSocket newExternalsocket, NotificationChain msgs) {
		ExternalSocket oldExternalsocket = externalsocket;
		externalsocket = newExternalsocket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET, oldExternalsocket, newExternalsocket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalsocket(ExternalSocket newExternalsocket) {
		if (newExternalsocket != externalsocket) {
			NotificationChain msgs = null;
			if (externalsocket != null)
				msgs = ((InternalEObject)externalsocket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET, null, msgs);
			if (newExternalsocket != null)
				msgs = ((InternalEObject)newExternalsocket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET, null, msgs);
			msgs = basicSetExternalsocket(newExternalsocket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET, newExternalsocket, newExternalsocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager getConnectionmanager() {
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionmanager(ConnectionManager newConnectionmanager, NotificationChain msgs) {
		ConnectionManager oldConnectionmanager = connectionmanager;
		connectionmanager = newConnectionmanager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER, oldConnectionmanager, newConnectionmanager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionmanager(ConnectionManager newConnectionmanager) {
		if (newConnectionmanager != connectionmanager) {
			NotificationChain msgs = null;
			if (connectionmanager != null)
				msgs = ((InternalEObject)connectionmanager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER, null, msgs);
			if (newConnectionmanager != null)
				msgs = ((InternalEObject)newConnectionmanager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER, null, msgs);
			msgs = basicSetConnectionmanager(newConnectionmanager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER, newConnectionmanager, newConnectionmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManager getSecuritymanger() {
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuritymanger(SecurityManager newSecuritymanger, NotificationChain msgs) {
		SecurityManager oldSecuritymanger = securitymanager;
		securitymanager = newSecuritymanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER, oldSecuritymanger, newSecuritymanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritymanager(SecurityManager newSecuritymanger) {
		if (newSecuritymanger != securitymanager) {
			NotificationChain msgs = null;
			if (securitymanager != null)
				msgs = ((InternalEObject)securitymanager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER, null, msgs);
			if (newSecuritymanger != null)
				msgs = ((InternalEObject)newSecuritymanger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER, null, msgs);
			msgs = basicSetSecuritymanger(newSecuritymanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER, newSecuritymanger, newSecuritymanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQuery getSqlquery() {
		return sqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlquery(SQLQuery newSqlquery, NotificationChain msgs) {
		SQLQuery oldSqlquery = sqlquery;
		sqlquery = newSqlquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__SQLQUERY, oldSqlquery, newSqlquery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlquery(SQLQuery newSqlquery) {
		if (newSqlquery != sqlquery) {
			NotificationChain msgs = null;
			if (sqlquery != null)
				msgs = ((InternalEObject)sqlquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__SQLQUERY, null, msgs);
			if (newSqlquery != null)
				msgs = ((InternalEObject)newSqlquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__SQLQUERY, null, msgs);
			msgs = basicSetSqlquery(newSqlquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__SQLQUERY, newSqlquery, newSqlquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleranceRequest getClerancerequest() {
		return clerancerequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClerancerequest(CleranceRequest newClerancerequest, NotificationChain msgs) {
		CleranceRequest oldClerancerequest = clerancerequest;
		clerancerequest = newClerancerequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST, oldClerancerequest, newClerancerequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClerancerequest(CleranceRequest newClerancerequest) {
		if (newClerancerequest != clerancerequest) {
			NotificationChain msgs = null;
			if (clerancerequest != null)
				msgs = ((InternalEObject)clerancerequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST, null, msgs);
			if (newClerancerequest != null)
				msgs = ((InternalEObject)newClerancerequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST, null, msgs);
			msgs = basicSetClerancerequest(newClerancerequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST, newClerancerequest, newClerancerequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach1 getAttach1() {
		return attach1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach1(attach1 newAttach1, NotificationChain msgs) {
		attach1 oldAttach1 = attach1;
		attach1 = newAttach1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH1, oldAttach1, newAttach1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach1(attach1 newAttach1) {
		if (newAttach1 != attach1) {
			NotificationChain msgs = null;
			if (attach1 != null)
				msgs = ((InternalEObject)attach1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH1, null, msgs);
			if (newAttach1 != null)
				msgs = ((InternalEObject)newAttach1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH1, null, msgs);
			msgs = basicSetAttach1(newAttach1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH1, newAttach1, newAttach1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach2 getAttach2() {
		return attach2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach2(attach2 newAttach2, NotificationChain msgs) {
		attach2 oldAttach2 = attach2;
		attach2 = newAttach2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH2, oldAttach2, newAttach2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach2(attach2 newAttach2) {
		if (newAttach2 != attach2) {
			NotificationChain msgs = null;
			if (attach2 != null)
				msgs = ((InternalEObject)attach2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH2, null, msgs);
			if (newAttach2 != null)
				msgs = ((InternalEObject)newAttach2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH2, null, msgs);
			msgs = basicSetAttach2(newAttach2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH2, newAttach2, newAttach2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach3 getAttach3() {
		return attach3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach3(attach3 newAttach3, NotificationChain msgs) {
		attach3 oldAttach3 = attach3;
		attach3 = newAttach3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH3, oldAttach3, newAttach3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach3(attach3 newAttach3) {
		if (newAttach3 != attach3) {
			NotificationChain msgs = null;
			if (attach3 != null)
				msgs = ((InternalEObject)attach3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH3, null, msgs);
			if (newAttach3 != null)
				msgs = ((InternalEObject)newAttach3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH3, null, msgs);
			msgs = basicSetAttach3(newAttach3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH3, newAttach3, newAttach3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach4 getAttach4() {
		return attach4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach4(attach4 newAttach4, NotificationChain msgs) {
		attach4 oldAttach4 = attach4;
		attach4 = newAttach4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH4, oldAttach4, newAttach4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach4(attach4 newAttach4) {
		if (newAttach4 != attach4) {
			NotificationChain msgs = null;
			if (attach4 != null)
				msgs = ((InternalEObject)attach4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH4, null, msgs);
			if (newAttach4 != null)
				msgs = ((InternalEObject)newAttach4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH4, null, msgs);
			msgs = basicSetAttach4(newAttach4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH4, newAttach4, newAttach4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach5 getAttach5() {
		return attach5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach5(attach5 newAttach5, NotificationChain msgs) {
		attach5 oldAttach5 = attach5;
		attach5 = newAttach5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH5, oldAttach5, newAttach5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach5(attach5 newAttach5) {
		if (newAttach5 != attach5) {
			NotificationChain msgs = null;
			if (attach5 != null)
				msgs = ((InternalEObject)attach5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH5, null, msgs);
			if (newAttach5 != null)
				msgs = ((InternalEObject)newAttach5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH5, null, msgs);
			msgs = basicSetAttach5(newAttach5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH5, newAttach5, newAttach5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attach6 getAttach6() {
		return attach6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttach6(attach6 newAttach6, NotificationChain msgs) {
		attach6 oldAttach6 = attach6;
		attach6 = newAttach6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH6, oldAttach6, newAttach6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttach6(attach6 newAttach6) {
		if (newAttach6 != attach6) {
			NotificationChain msgs = null;
			if (attach6 != null)
				msgs = ((InternalEObject)attach6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH6, null, msgs);
			if (newAttach6 != null)
				msgs = ((InternalEObject)newAttach6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__ATTACH6, null, msgs);
			msgs = basicSetAttach6(newAttach6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__ATTACH6, newAttach6, newAttach6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bind1 getBind1() {
		return bind1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBind1(bind1 newBind1, NotificationChain msgs) {
		bind1 oldBind1 = bind1;
		bind1 = newBind1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__BIND1, oldBind1, newBind1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBind1(bind1 newBind1) {
		if (newBind1 != bind1) {
			NotificationChain msgs = null;
			if (bind1 != null)
				msgs = ((InternalEObject)bind1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__BIND1, null, msgs);
			if (newBind1 != null)
				msgs = ((InternalEObject)newBind1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__BIND1, null, msgs);
			msgs = basicSetBind1(newBind1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__BIND1, newBind1, newBind1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityQuery getSecurityquery() {
		return securityquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityquery(SecurityQuery newSecurityquery, NotificationChain msgs) {
		SecurityQuery oldSecurityquery = securityquery;
		securityquery = newSecurityquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY, oldSecurityquery, newSecurityquery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityquery(SecurityQuery newSecurityquery) {
		if (newSecurityquery != securityquery) {
			NotificationChain msgs = null;
			if (securityquery != null)
				msgs = ((InternalEObject)securityquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY, null, msgs);
			if (newSecurityquery != null)
				msgs = ((InternalEObject)newSecurityquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY, null, msgs);
			msgs = basicSetSecurityquery(newSecurityquery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY, newSecurityquery, newSecurityquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET:
				return basicSetExternalsocket(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER:
				return basicSetConnectionmanager(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER:
				return basicSetSecuritymanger(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__DATABASE:
				return basicSetDatabase(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__SQLQUERY:
				return basicSetSqlquery(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST:
				return basicSetClerancerequest(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__ATTACH1:
				return basicSetAttach1(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__ATTACH2:
				return basicSetAttach2(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__ATTACH3:
				return basicSetAttach3(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__ATTACH4:
				return basicSetAttach4(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__ATTACH5:
				return basicSetAttach5(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__ATTACH6:
				return basicSetAttach6(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__BIND1:
				return basicSetBind1(null, msgs);
			case CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY:
				return basicSetSecurityquery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET:
				return getExternalsocket();
			case CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER:
				return getConnectionmanager();
			case CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER:
				return getSecuritymanager();
			case CosaM1Package.SERVEUR_DETAIL__DATABASE:
				return getDatabase();
			case CosaM1Package.SERVEUR_DETAIL__SQLQUERY:
				return getSqlquery();
			case CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST:
				return getClerancerequest();
			case CosaM1Package.SERVEUR_DETAIL__ATTACH1:
				return getAttach1();
			case CosaM1Package.SERVEUR_DETAIL__ATTACH2:
				return getAttach2();
			case CosaM1Package.SERVEUR_DETAIL__ATTACH3:
				return getAttach3();
			case CosaM1Package.SERVEUR_DETAIL__ATTACH4:
				return getAttach4();
			case CosaM1Package.SERVEUR_DETAIL__ATTACH5:
				return getAttach5();
			case CosaM1Package.SERVEUR_DETAIL__ATTACH6:
				return getAttach6();
			case CosaM1Package.SERVEUR_DETAIL__BIND1:
				return getBind1();
			case CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY:
				return getSecurityquery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER:
				setSecuritymanager((SecurityManager)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__DATABASE:
				setDatabase((Database)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__SQLQUERY:
				setSqlquery((SQLQuery)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST:
				setClerancerequest((CleranceRequest)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH1:
				setAttach1((attach1)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH2:
				setAttach2((attach2)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH3:
				setAttach3((attach3)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH4:
				setAttach4((attach4)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH5:
				setAttach5((attach5)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH6:
				setAttach6((attach6)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__BIND1:
				setBind1((bind1)newValue);
				return;
			case CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY:
				setSecurityquery((SecurityQuery)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET:
				setExternalsocket((ExternalSocket)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER:
				setSecuritymanager((SecurityManager)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__DATABASE:
				setDatabase((Database)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__SQLQUERY:
				setSqlquery((SQLQuery)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST:
				setClerancerequest((CleranceRequest)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH1:
				setAttach1((attach1)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH2:
				setAttach2((attach2)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH3:
				setAttach3((attach3)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH4:
				setAttach4((attach4)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH5:
				setAttach5((attach5)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH6:
				setAttach6((attach6)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__BIND1:
				setBind1((bind1)null);
				return;
			case CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY:
				setSecurityquery((SecurityQuery)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CosaM1Package.SERVEUR_DETAIL__EXTERNALSOCKET:
				return externalsocket != null;
			case CosaM1Package.SERVEUR_DETAIL__CONNECTIONMANAGER:
				return connectionmanager != null;
			case CosaM1Package.SERVEUR_DETAIL__SECURITYMANAGER:
				return securitymanager != null;
			case CosaM1Package.SERVEUR_DETAIL__DATABASE:
				return database != null;
			case CosaM1Package.SERVEUR_DETAIL__SQLQUERY:
				return sqlquery != null;
			case CosaM1Package.SERVEUR_DETAIL__CLERANCEREQUEST:
				return clerancerequest != null;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH1:
				return attach1 != null;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH2:
				return attach2 != null;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH3:
				return attach3 != null;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH4:
				return attach4 != null;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH5:
				return attach5 != null;
			case CosaM1Package.SERVEUR_DETAIL__ATTACH6:
				return attach6 != null;
			case CosaM1Package.SERVEUR_DETAIL__BIND1:
				return bind1 != null;
			case CosaM1Package.SERVEUR_DETAIL__SECURITYQUERY:
				return securityquery != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public SecurityManager getSecuritymanager() {
		// TODO Auto-generated method stub
		return null;
	}


} //ServeurDetailImpl
