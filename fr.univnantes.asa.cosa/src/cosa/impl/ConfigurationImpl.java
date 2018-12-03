/**
 */
package cosa.impl;

import cosa.Attachement;
import cosa.Binding;
import cosa.Component;
import cosa.Configuration;
import cosa.Connector;
import cosa.CosaPackage;
import cosa.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ConfigurationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getCofigurationinterface <em>Cofigurationinterface</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getAttachements <em>Attachements</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ComposedElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getCofigurationinterface() <em>Cofigurationinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCofigurationinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> cofigurationinterface;

	/**
	 * The cached value of the '{@link #getAttachements() <em>Attachements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachements()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachement> attachements;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, CosaPackage.CONFIGURATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getCofigurationinterface() {
		if (cofigurationinterface == null) {
			cofigurationinterface = new EObjectContainmentEList<Port>(Port.class, this, CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE);
		}
		return cofigurationinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachement> getAttachements() {
		if (attachements == null) {
			attachements = new EObjectContainmentEList<Attachement>(Attachement.class, this, CosaPackage.CONFIGURATION__ATTACHEMENTS);
		}
		return attachements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, CosaPackage.CONFIGURATION__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, CosaPackage.CONFIGURATION__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.CONFIGURATION__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE:
				return ((InternalEList<?>)getCofigurationinterface()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__ATTACHEMENTS:
				return ((InternalEList<?>)getAttachements()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.CONFIGURATION__COMPONENTS:
				return getComponents();
			case CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE:
				return getCofigurationinterface();
			case CosaPackage.CONFIGURATION__ATTACHEMENTS:
				return getAttachements();
			case CosaPackage.CONFIGURATION__BINDINGS:
				return getBindings();
			case CosaPackage.CONFIGURATION__CONNECTORS:
				return getConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaPackage.CONFIGURATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE:
				getCofigurationinterface().clear();
				getCofigurationinterface().addAll((Collection<? extends Port>)newValue);
				return;
			case CosaPackage.CONFIGURATION__ATTACHEMENTS:
				getAttachements().clear();
				getAttachements().addAll((Collection<? extends Attachement>)newValue);
				return;
			case CosaPackage.CONFIGURATION__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case CosaPackage.CONFIGURATION__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
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
			case CosaPackage.CONFIGURATION__COMPONENTS:
				getComponents().clear();
				return;
			case CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE:
				getCofigurationinterface().clear();
				return;
			case CosaPackage.CONFIGURATION__ATTACHEMENTS:
				getAttachements().clear();
				return;
			case CosaPackage.CONFIGURATION__BINDINGS:
				getBindings().clear();
				return;
			case CosaPackage.CONFIGURATION__CONNECTORS:
				getConnectors().clear();
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
			case CosaPackage.CONFIGURATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case CosaPackage.CONFIGURATION__COFIGURATIONINTERFACE:
				return cofigurationinterface != null && !cofigurationinterface.isEmpty();
			case CosaPackage.CONFIGURATION__ATTACHEMENTS:
				return attachements != null && !attachements.isEmpty();
			case CosaPackage.CONFIGURATION__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case CosaPackage.CONFIGURATION__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
