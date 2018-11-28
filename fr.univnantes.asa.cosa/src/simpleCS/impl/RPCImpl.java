/**
 */
package simpleCS.impl;

import cosa.impl.ConnectorImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleCS.RPC;
import simpleCS.SimpleCSPackage;
import simpleCS.called;
import simpleCS.caller;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleCS.impl.RPCImpl#getCalled <em>Called</em>}</li>
 *   <li>{@link simpleCS.impl.RPCImpl#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCImpl extends ConnectorImpl implements RPC {
	/**
	 * The cached value of the '{@link #getCalled() <em>Called</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalled()
	 * @generated
	 * @ordered
	 */
	protected called called;

	/**
	 * The cached value of the '{@link #getCaller() <em>Caller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaller()
	 * @generated
	 * @ordered
	 */
	protected caller caller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleCSPackage.Literals.RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public called getCalled() {
		return called;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalled(called newCalled, NotificationChain msgs) {
		called oldCalled = called;
		called = newCalled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.RPC__CALLED, oldCalled, newCalled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalled(called newCalled) {
		if (newCalled != called) {
			NotificationChain msgs = null;
			if (called != null)
				msgs = ((InternalEObject)called).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.RPC__CALLED, null, msgs);
			if (newCalled != null)
				msgs = ((InternalEObject)newCalled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.RPC__CALLED, null, msgs);
			msgs = basicSetCalled(newCalled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.RPC__CALLED, newCalled, newCalled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public caller getCaller() {
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaller(caller newCaller, NotificationChain msgs) {
		caller oldCaller = caller;
		caller = newCaller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleCSPackage.RPC__CALLER, oldCaller, newCaller);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaller(caller newCaller) {
		if (newCaller != caller) {
			NotificationChain msgs = null;
			if (caller != null)
				msgs = ((InternalEObject)caller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.RPC__CALLER, null, msgs);
			if (newCaller != null)
				msgs = ((InternalEObject)newCaller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleCSPackage.RPC__CALLER, null, msgs);
			msgs = basicSetCaller(newCaller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleCSPackage.RPC__CALLER, newCaller, newCaller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleCSPackage.RPC__CALLED:
				return basicSetCalled(null, msgs);
			case SimpleCSPackage.RPC__CALLER:
				return basicSetCaller(null, msgs);
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
			case SimpleCSPackage.RPC__CALLED:
				return getCalled();
			case SimpleCSPackage.RPC__CALLER:
				return getCaller();
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
			case SimpleCSPackage.RPC__CALLED:
				setCalled((called)newValue);
				return;
			case SimpleCSPackage.RPC__CALLER:
				setCaller((caller)newValue);
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
			case SimpleCSPackage.RPC__CALLED:
				setCalled((called)null);
				return;
			case SimpleCSPackage.RPC__CALLER:
				setCaller((caller)null);
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
			case SimpleCSPackage.RPC__CALLED:
				return called != null;
			case SimpleCSPackage.RPC__CALLER:
				return caller != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCImpl
