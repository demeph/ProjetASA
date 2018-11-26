/**
 */
package fr.univnantes.asa.cosa.impl;

import fr.univnantes.asa.cosa.Binding;
import fr.univnantes.asa.cosa.Component;
import fr.univnantes.asa.cosa.Configuration;
import fr.univnantes.asa.cosa.CosaPackage;
import fr.univnantes.asa.cosa.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getPortRequired <em>Port Required</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getPortProvided <em>Port Provided</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getConfigurationProvider <em>Configuration Provider</em>}</li>
 *   <li>{@link fr.univnantes.asa.cosa.impl.BindingImpl#getComponentSubscriber <em>Component Subscriber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The cached value of the '{@link #getPortRequired() <em>Port Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRequired()
	 * @generated
	 * @ordered
	 */
	protected Port portRequired;

	/**
	 * The cached value of the '{@link #getPortProvided() <em>Port Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProvided()
	 * @generated
	 * @ordered
	 */
	protected Port portProvided;

	/**
	 * The cached value of the '{@link #getConfigurationProvider() <em>Configuration Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationProvider()
	 * @generated
	 * @ordered
	 */
	protected Configuration configurationProvider;

	/**
	 * The cached value of the '{@link #getComponentSubscriber() <em>Component Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Component componentSubscriber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortRequired() {
		if (portRequired != null && portRequired.eIsProxy()) {
			InternalEObject oldPortRequired = (InternalEObject) portRequired;
			portRequired = (Port) eResolveProxy(oldPortRequired);
			if (portRequired != oldPortRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__PORT_REQUIRED,
							oldPortRequired, portRequired));
			}
		}
		return portRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortRequired() {
		return portRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortRequired(Port newPortRequired) {
		Port oldPortRequired = portRequired;
		portRequired = newPortRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_REQUIRED, oldPortRequired,
					portRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortProvided() {
		if (portProvided != null && portProvided.eIsProxy()) {
			InternalEObject oldPortProvided = (InternalEObject) portProvided;
			portProvided = (Port) eResolveProxy(oldPortProvided);
			if (portProvided != oldPortProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__PORT_PROVIDED,
							oldPortProvided, portProvided));
			}
		}
		return portProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortProvided() {
		return portProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortProvided(Port newPortProvided) {
		Port oldPortProvided = portProvided;
		portProvided = newPortProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_PROVIDED, oldPortProvided,
					portProvided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfigurationProvider() {
		if (configurationProvider != null && configurationProvider.eIsProxy()) {
			InternalEObject oldConfigurationProvider = (InternalEObject) configurationProvider;
			configurationProvider = (Configuration) eResolveProxy(oldConfigurationProvider);
			if (configurationProvider != oldConfigurationProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CosaPackage.BINDING__CONFIGURATION_PROVIDER, oldConfigurationProvider,
							configurationProvider));
			}
		}
		return configurationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfigurationProvider() {
		return configurationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationProvider(Configuration newConfigurationProvider) {
		Configuration oldConfigurationProvider = configurationProvider;
		configurationProvider = newConfigurationProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__CONFIGURATION_PROVIDER,
					oldConfigurationProvider, configurationProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponentSubscriber() {
		if (componentSubscriber != null && componentSubscriber.eIsProxy()) {
			InternalEObject oldComponentSubscriber = (InternalEObject) componentSubscriber;
			componentSubscriber = (Component) eResolveProxy(oldComponentSubscriber);
			if (componentSubscriber != oldComponentSubscriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__COMPONENT_SUBSCRIBER,
							oldComponentSubscriber, componentSubscriber));
			}
		}
		return componentSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentSubscriber() {
		return componentSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentSubscriber(Component newComponentSubscriber) {
		Component oldComponentSubscriber = componentSubscriber;
		componentSubscriber = newComponentSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__COMPONENT_SUBSCRIBER,
					oldComponentSubscriber, componentSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CosaPackage.BINDING__PORT_REQUIRED:
			if (resolve)
				return getPortRequired();
			return basicGetPortRequired();
		case CosaPackage.BINDING__PORT_PROVIDED:
			if (resolve)
				return getPortProvided();
			return basicGetPortProvided();
		case CosaPackage.BINDING__CONFIGURATION_PROVIDER:
			if (resolve)
				return getConfigurationProvider();
			return basicGetConfigurationProvider();
		case CosaPackage.BINDING__COMPONENT_SUBSCRIBER:
			if (resolve)
				return getComponentSubscriber();
			return basicGetComponentSubscriber();
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
		case CosaPackage.BINDING__PORT_REQUIRED:
			setPortRequired((Port) newValue);
			return;
		case CosaPackage.BINDING__PORT_PROVIDED:
			setPortProvided((Port) newValue);
			return;
		case CosaPackage.BINDING__CONFIGURATION_PROVIDER:
			setConfigurationProvider((Configuration) newValue);
			return;
		case CosaPackage.BINDING__COMPONENT_SUBSCRIBER:
			setComponentSubscriber((Component) newValue);
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
		case CosaPackage.BINDING__PORT_REQUIRED:
			setPortRequired((Port) null);
			return;
		case CosaPackage.BINDING__PORT_PROVIDED:
			setPortProvided((Port) null);
			return;
		case CosaPackage.BINDING__CONFIGURATION_PROVIDER:
			setConfigurationProvider((Configuration) null);
			return;
		case CosaPackage.BINDING__COMPONENT_SUBSCRIBER:
			setComponentSubscriber((Component) null);
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
		case CosaPackage.BINDING__PORT_REQUIRED:
			return portRequired != null;
		case CosaPackage.BINDING__PORT_PROVIDED:
			return portProvided != null;
		case CosaPackage.BINDING__CONFIGURATION_PROVIDER:
			return configurationProvider != null;
		case CosaPackage.BINDING__COMPONENT_SUBSCRIBER:
			return componentSubscriber != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
