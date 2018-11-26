/*
 * generated by Xtext 2.15.0
 */
package fr.univnantes.asa.xtext.serializer;

import com.google.inject.Inject;
import fr.univnantes.asa.cosa.Attachement;
import fr.univnantes.asa.cosa.Binding;
import fr.univnantes.asa.cosa.Component;
import fr.univnantes.asa.cosa.CompositeConfiguration;
import fr.univnantes.asa.cosa.Configuration;
import fr.univnantes.asa.cosa.Connector;
import fr.univnantes.asa.cosa.CosaPackage;
import fr.univnantes.asa.cosa.Glue;
import fr.univnantes.asa.cosa.Port;
import fr.univnantes.asa.cosa.ProvidedPort;
import fr.univnantes.asa.cosa.ProvidedRole;
import fr.univnantes.asa.cosa.ProvidedService;
import fr.univnantes.asa.cosa.RequiredPort;
import fr.univnantes.asa.cosa.RequiredRole;
import fr.univnantes.asa.cosa.RequiredService;
import fr.univnantes.asa.cosa.Role;
import fr.univnantes.asa.cosa.Service;
import fr.univnantes.asa.cosa.SimpleConfiguration;
import fr.univnantes.asa.xtext.services.CosaDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CosaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CosaDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CosaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CosaPackage.ATTACHEMENT:
				sequence_Attachement(context, (Attachement) semanticObject); 
				return; 
			case CosaPackage.BINDING:
				sequence_Binding(context, (Binding) semanticObject); 
				return; 
			case CosaPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case CosaPackage.COMPOSITE_CONFIGURATION:
				sequence_CompositeConfiguration(context, (CompositeConfiguration) semanticObject); 
				return; 
			case CosaPackage.CONFIGURATION:
				sequence_Configuration_Impl(context, (Configuration) semanticObject); 
				return; 
			case CosaPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case CosaPackage.GLUE:
				sequence_Glue(context, (Glue) semanticObject); 
				return; 
			case CosaPackage.PORT:
				sequence_Port_Impl(context, (Port) semanticObject); 
				return; 
			case CosaPackage.PROVIDED_PORT:
				sequence_ProvidedPort(context, (ProvidedPort) semanticObject); 
				return; 
			case CosaPackage.PROVIDED_ROLE:
				sequence_ProvidedRole(context, (ProvidedRole) semanticObject); 
				return; 
			case CosaPackage.PROVIDED_SERVICE:
				sequence_ProvidedService(context, (ProvidedService) semanticObject); 
				return; 
			case CosaPackage.REQUIRED_PORT:
				sequence_RequiredPort(context, (RequiredPort) semanticObject); 
				return; 
			case CosaPackage.REQUIRED_ROLE:
				sequence_RequiredRole(context, (RequiredRole) semanticObject); 
				return; 
			case CosaPackage.REQUIRED_SERVICE:
				sequence_RequiredService(context, (RequiredService) semanticObject); 
				return; 
			case CosaPackage.ROLE:
				sequence_Role_Impl(context, (Role) semanticObject); 
				return; 
			case CosaPackage.SERVICE:
				sequence_Service_Impl(context, (Service) semanticObject); 
				return; 
			case CosaPackage.SIMPLE_CONFIGURATION:
				sequence_SimpleConfiguration(context, (SimpleConfiguration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attachement returns Attachement
	 *
	 * Constraint:
	 *     (port=Port role=Role port=Port role=Role)
	 */
	protected void sequence_Attachement(ISerializationContext context, Attachement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Binding
	 *
	 * Constraint:
	 *     (portProvided=Port portRequired=Port)
	 */
	protected void sequence_Binding(ISerializationContext context, Binding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.BINDING__PORT_PROVIDED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.BINDING__PORT_PROVIDED));
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.BINDING__PORT_REQUIRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.BINDING__PORT_REQUIRED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingAccess().getPortProvidedPortParserRuleCall_2_0(), semanticObject.getPortProvided());
		feeder.accept(grammarAccess.getBindingAccess().getPortRequiredPortParserRuleCall_4_0(), semanticObject.getPortRequired());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=EString ports+=Port ports+=Port* services+=Service services+=Service*)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns CompositeConfiguration
	 *     CompositeConfiguration returns CompositeConfiguration
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         components+=Component 
	 *         components+=Component* 
	 *         connectors+=Connector 
	 *         connectors+=Connector* 
	 *         ports+=Port 
	 *         ports+=Port* 
	 *         bindings+=Binding 
	 *         bindings+=Binding* 
	 *         attachements+=Attachement 
	 *         attachements+=Attachement* 
	 *         configurations+=Configuration 
	 *         configurations+=Configuration*
	 *     )
	 */
	protected void sequence_CompositeConfiguration(ISerializationContext context, CompositeConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *     Configuration_Impl returns Configuration
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         components+=Component 
	 *         components+=Component* 
	 *         connectors+=Connector 
	 *         connectors+=Connector* 
	 *         ports+=Port 
	 *         ports+=Port* 
	 *         bindings+=Binding 
	 *         bindings+=Binding* 
	 *         attachements+=Attachement 
	 *         attachements+=Attachement*
	 *     )
	 */
	protected void sequence_Configuration_Impl(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Connector
	 *
	 * Constraint:
	 *     (name=EString roles+=Role roles+=Role glue=Glue?)
	 */
	protected void sequence_Connector(ISerializationContext context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Glue returns Glue
	 *
	 * Constraint:
	 *     {Glue}
	 */
	protected void sequence_Glue(ISerializationContext context, Glue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Port returns Port
	 *     Port_Impl returns Port
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Port_Impl(ISerializationContext context, Port semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPort_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns ProvidedPort
	 *     ProvidedPort returns ProvidedPort
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ProvidedPort(ISerializationContext context, ProvidedPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedPortAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns ProvidedRole
	 *     ProvidedRole returns ProvidedRole
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ProvidedRole(ISerializationContext context, ProvidedRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Service returns ProvidedService
	 *     ProvidedService returns ProvidedService
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ProvidedService(ISerializationContext context, ProvidedService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedServiceAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns RequiredPort
	 *     RequiredPort returns RequiredPort
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RequiredPort(ISerializationContext context, RequiredPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredPortAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns RequiredRole
	 *     RequiredRole returns RequiredRole
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RequiredRole(ISerializationContext context, RequiredRole semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Service returns RequiredService
	 *     RequiredService returns RequiredService
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RequiredService(ISerializationContext context, RequiredService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredServiceAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *     Role_Impl returns Role
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Role_Impl(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Service returns Service
	 *     Service_Impl returns Service
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Service_Impl(ISerializationContext context, Service semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CosaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns SimpleConfiguration
	 *     SimpleConfiguration returns SimpleConfiguration
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         components+=Component 
	 *         components+=Component* 
	 *         connectors+=Connector 
	 *         connectors+=Connector* 
	 *         ports+=Port 
	 *         ports+=Port* 
	 *         bindings+=Binding 
	 *         bindings+=Binding* 
	 *         attachements+=Attachement 
	 *         attachements+=Attachement*
	 *     )
	 */
	protected void sequence_SimpleConfiguration(ISerializationContext context, SimpleConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
