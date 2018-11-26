/**
 */
package fr.univnantes.asa.cosa.util;

import fr.univnantes.asa.cosa.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univnantes.asa.cosa.CosaPackage
 * @generated
 */
public class CosaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CosaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CosaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CosaSwitch<Adapter> modelSwitch = new CosaSwitch<Adapter>() {
		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter caseRequiredPort(RequiredPort object) {
			return createRequiredPortAdapter();
		}

		@Override
		public Adapter caseProvidedPort(ProvidedPort object) {
			return createProvidedPortAdapter();
		}

		@Override
		public Adapter caseRequiredRole(RequiredRole object) {
			return createRequiredRoleAdapter();
		}

		@Override
		public Adapter caseProvidedRole(ProvidedRole object) {
			return createProvidedRoleAdapter();
		}

		@Override
		public Adapter caseRequiredService(RequiredService object) {
			return createRequiredServiceAdapter();
		}

		@Override
		public Adapter caseProvidedService(ProvidedService object) {
			return createProvidedServiceAdapter();
		}

		@Override
		public Adapter caseAttachement(Attachement object) {
			return createAttachementAdapter();
		}

		@Override
		public Adapter caseBinding(Binding object) {
			return createBindingAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseSimpleConfiguration(SimpleConfiguration object) {
			return createSimpleConfigurationAdapter();
		}

		@Override
		public Adapter caseCompositeConfiguration(CompositeConfiguration object) {
			return createCompositeConfigurationAdapter();
		}

		@Override
		public Adapter caseGlue(Glue object) {
			return createGlueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.RequiredPort
	 * @generated
	 */
	public Adapter createRequiredPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.ProvidedPort
	 * @generated
	 */
	public Adapter createProvidedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.RequiredRole
	 * @generated
	 */
	public Adapter createRequiredRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.ProvidedRole
	 * @generated
	 */
	public Adapter createProvidedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.RequiredService
	 * @generated
	 */
	public Adapter createRequiredServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.ProvidedService
	 * @generated
	 */
	public Adapter createProvidedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Attachement
	 * @generated
	 */
	public Adapter createAttachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.SimpleConfiguration <em>Simple Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.SimpleConfiguration
	 * @generated
	 */
	public Adapter createSimpleConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.CompositeConfiguration <em>Composite Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.CompositeConfiguration
	 * @generated
	 */
	public Adapter createCompositeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.asa.cosa.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.asa.cosa.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CosaAdapterFactory
