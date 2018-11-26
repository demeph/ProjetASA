/**
 */
package fr.univnantes.asa.cosa.impl;

import fr.univnantes.asa.cosa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CosaFactoryImpl extends EFactoryImpl implements CosaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CosaFactory init() {
		try {
			CosaFactory theCosaFactory = (CosaFactory) EPackage.Registry.INSTANCE.getEFactory(CosaPackage.eNS_URI);
			if (theCosaFactory != null) {
				return theCosaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CosaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CosaPackage.COMPONENT:
			return createComponent();
		case CosaPackage.CONNECTOR:
			return createConnector();
		case CosaPackage.PORT:
			return createPort();
		case CosaPackage.ROLE:
			return createRole();
		case CosaPackage.SERVICE:
			return createService();
		case CosaPackage.CONFIGURATION:
			return createConfiguration();
		case CosaPackage.REQUIRED_PORT:
			return createRequiredPort();
		case CosaPackage.PROVIDED_PORT:
			return createProvidedPort();
		case CosaPackage.REQUIRED_ROLE:
			return createRequiredRole();
		case CosaPackage.PROVIDED_ROLE:
			return createProvidedRole();
		case CosaPackage.REQUIRED_SERVICE:
			return createRequiredService();
		case CosaPackage.PROVIDED_SERVICE:
			return createProvidedService();
		case CosaPackage.ATTACHEMENT:
			return createAttachement();
		case CosaPackage.BINDING:
			return createBinding();
		case CosaPackage.NAMED_ELEMENT:
			return createNamedElement();
		case CosaPackage.SIMPLE_CONFIGURATION:
			return createSimpleConfiguration();
		case CosaPackage.COMPOSITE_CONFIGURATION:
			return createCompositeConfiguration();
		case CosaPackage.GLUE:
			return createGlue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort createRequiredPort() {
		RequiredPortImpl requiredPort = new RequiredPortImpl();
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort createProvidedPort() {
		ProvidedPortImpl providedPort = new ProvidedPortImpl();
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole createRequiredRole() {
		RequiredRoleImpl requiredRole = new RequiredRoleImpl();
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole createProvidedRole() {
		ProvidedRoleImpl providedRole = new ProvidedRoleImpl();
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredService createRequiredService() {
		RequiredServiceImpl requiredService = new RequiredServiceImpl();
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedService createProvidedService() {
		ProvidedServiceImpl providedService = new ProvidedServiceImpl();
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachement createAttachement() {
		AttachementImpl attachement = new AttachementImpl();
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConfiguration createSimpleConfiguration() {
		SimpleConfigurationImpl simpleConfiguration = new SimpleConfigurationImpl();
		return simpleConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConfiguration createCompositeConfiguration() {
		CompositeConfigurationImpl compositeConfiguration = new CompositeConfigurationImpl();
		return compositeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaPackage getCosaPackage() {
		return (CosaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CosaPackage getPackage() {
		return CosaPackage.eINSTANCE;
	}

} //CosaFactoryImpl
