/*
 * generated by Xtext 2.15.0
 */
package fr.univnantes.asa.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.univnantes.asa.xtext.ide.contentassist.antlr.internal.InternalCosaDslParser;
import fr.univnantes.asa.xtext.services.CosaDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CosaDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CosaDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CosaDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getConfigurationAccess().getAlternatives(), "rule__Configuration__Alternatives");
			builder.put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
			builder.put(grammarAccess.getServiceAccess().getAlternatives(), "rule__Service__Alternatives");
			builder.put(grammarAccess.getRoleAccess().getAlternatives(), "rule__Role__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup(), "rule__CompositeConfiguration__Group__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_3(), "rule__CompositeConfiguration__Group_3__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_3_1(), "rule__CompositeConfiguration__Group_3_1__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_4(), "rule__CompositeConfiguration__Group_4__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_4_1(), "rule__CompositeConfiguration__Group_4_1__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_5(), "rule__CompositeConfiguration__Group_5__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_5_1(), "rule__CompositeConfiguration__Group_5_1__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_6(), "rule__CompositeConfiguration__Group_6__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_6_1(), "rule__CompositeConfiguration__Group_6_1__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_7(), "rule__CompositeConfiguration__Group_7__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_7_1(), "rule__CompositeConfiguration__Group_7_1__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_8(), "rule__CompositeConfiguration__Group_8__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getGroup_8_1(), "rule__CompositeConfiguration__Group_8_1__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_4(), "rule__Component__Group_4__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
			builder.put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
			builder.put(grammarAccess.getConnectorAccess().getGroup_4(), "rule__Connector__Group_4__0");
			builder.put(grammarAccess.getConnectorAccess().getGroup_5(), "rule__Connector__Group_5__0");
			builder.put(grammarAccess.getPort_ImplAccess().getGroup(), "rule__Port_Impl__Group__0");
			builder.put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
			builder.put(grammarAccess.getAttachementAccess().getGroup(), "rule__Attachement__Group__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup(), "rule__Configuration_Impl__Group__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_4(), "rule__Configuration_Impl__Group_4__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_5(), "rule__Configuration_Impl__Group_5__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_5_1(), "rule__Configuration_Impl__Group_5_1__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_6(), "rule__Configuration_Impl__Group_6__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_6_1(), "rule__Configuration_Impl__Group_6_1__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_7(), "rule__Configuration_Impl__Group_7__0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getGroup_7_1(), "rule__Configuration_Impl__Group_7_1__0");
			builder.put(grammarAccess.getService_ImplAccess().getGroup(), "rule__Service_Impl__Group__0");
			builder.put(grammarAccess.getRequiredServiceAccess().getGroup(), "rule__RequiredService__Group__0");
			builder.put(grammarAccess.getProvidedServiceAccess().getGroup(), "rule__ProvidedService__Group__0");
			builder.put(grammarAccess.getRole_ImplAccess().getGroup(), "rule__Role_Impl__Group__0");
			builder.put(grammarAccess.getRequiredRoleAccess().getGroup(), "rule__RequiredRole__Group__0");
			builder.put(grammarAccess.getProvidedRoleAccess().getGroup(), "rule__ProvidedRole__Group__0");
			builder.put(grammarAccess.getGlueAccess().getGroup(), "rule__Glue__Group__0");
			builder.put(grammarAccess.getRequiredPortAccess().getGroup(), "rule__RequiredPort__Group__0");
			builder.put(grammarAccess.getProvidedPortAccess().getGroup(), "rule__ProvidedPort__Group__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup(), "rule__SimpleConfiguration__Group__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_4(), "rule__SimpleConfiguration__Group_4__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_5(), "rule__SimpleConfiguration__Group_5__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_5_1(), "rule__SimpleConfiguration__Group_5_1__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_6(), "rule__SimpleConfiguration__Group_6__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_6_1(), "rule__SimpleConfiguration__Group_6_1__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_7(), "rule__SimpleConfiguration__Group_7__0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getGroup_7_1(), "rule__SimpleConfiguration__Group_7_1__0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getNameAssignment_1(), "rule__CompositeConfiguration__NameAssignment_1");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3_0(), "rule__CompositeConfiguration__ComponentsAssignment_3_0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3_1_1(), "rule__CompositeConfiguration__ComponentsAssignment_3_1_1");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_4_0(), "rule__CompositeConfiguration__ConnectorsAssignment_4_0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_4_1_1(), "rule__CompositeConfiguration__ConnectorsAssignment_4_1_1");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_5_0(), "rule__CompositeConfiguration__PortsAssignment_5_0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_5_1_1(), "rule__CompositeConfiguration__PortsAssignment_5_1_1");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_6_0(), "rule__CompositeConfiguration__BindingsAssignment_6_0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_6_1_1(), "rule__CompositeConfiguration__BindingsAssignment_6_1_1");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_7_0(), "rule__CompositeConfiguration__AttachementsAssignment_7_0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_7_1_1(), "rule__CompositeConfiguration__AttachementsAssignment_7_1_1");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_8_0(), "rule__CompositeConfiguration__ConfigurationsAssignment_8_0");
			builder.put(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_8_1_1(), "rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getPortsAssignment_3(), "rule__Component__PortsAssignment_3");
			builder.put(grammarAccess.getComponentAccess().getPortsAssignment_4_1(), "rule__Component__PortsAssignment_4_1");
			builder.put(grammarAccess.getComponentAccess().getServicesAssignment_5(), "rule__Component__ServicesAssignment_5");
			builder.put(grammarAccess.getComponentAccess().getServicesAssignment_6_1(), "rule__Component__ServicesAssignment_6_1");
			builder.put(grammarAccess.getConnectorAccess().getNameAssignment_1(), "rule__Connector__NameAssignment_1");
			builder.put(grammarAccess.getConnectorAccess().getRolesAssignment_3(), "rule__Connector__RolesAssignment_3");
			builder.put(grammarAccess.getConnectorAccess().getRolesAssignment_4_1(), "rule__Connector__RolesAssignment_4_1");
			builder.put(grammarAccess.getConnectorAccess().getGlueAssignment_5_1(), "rule__Connector__GlueAssignment_5_1");
			builder.put(grammarAccess.getPort_ImplAccess().getNameAssignment_2(), "rule__Port_Impl__NameAssignment_2");
			builder.put(grammarAccess.getBindingAccess().getConfigurationProviderAssignment_2(), "rule__Binding__ConfigurationProviderAssignment_2");
			builder.put(grammarAccess.getBindingAccess().getPortProvidedAssignment_4(), "rule__Binding__PortProvidedAssignment_4");
			builder.put(grammarAccess.getBindingAccess().getComponentSubscriberAssignment_6(), "rule__Binding__ComponentSubscriberAssignment_6");
			builder.put(grammarAccess.getBindingAccess().getPortRequiredAssignment_8(), "rule__Binding__PortRequiredAssignment_8");
			builder.put(grammarAccess.getAttachementAccess().getComponentAssignment_2(), "rule__Attachement__ComponentAssignment_2");
			builder.put(grammarAccess.getAttachementAccess().getPortAssignment_4(), "rule__Attachement__PortAssignment_4");
			builder.put(grammarAccess.getAttachementAccess().getConnectorAssignment_6(), "rule__Attachement__ConnectorAssignment_6");
			builder.put(grammarAccess.getAttachementAccess().getRoleAssignment_8(), "rule__Attachement__RoleAssignment_8");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getNameAssignment_1(), "rule__Configuration_Impl__NameAssignment_1");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getComponentsAssignment_3(), "rule__Configuration_Impl__ComponentsAssignment_3");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getComponentsAssignment_4_1(), "rule__Configuration_Impl__ComponentsAssignment_4_1");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getConnectorsAssignment_5_0(), "rule__Configuration_Impl__ConnectorsAssignment_5_0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getConnectorsAssignment_5_1_1(), "rule__Configuration_Impl__ConnectorsAssignment_5_1_1");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getPortsAssignment_6_0(), "rule__Configuration_Impl__PortsAssignment_6_0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getPortsAssignment_6_1_1(), "rule__Configuration_Impl__PortsAssignment_6_1_1");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getBindingsAssignment_7_0(), "rule__Configuration_Impl__BindingsAssignment_7_0");
			builder.put(grammarAccess.getConfiguration_ImplAccess().getBindingsAssignment_7_1_1(), "rule__Configuration_Impl__BindingsAssignment_7_1_1");
			builder.put(grammarAccess.getService_ImplAccess().getNameAssignment_2(), "rule__Service_Impl__NameAssignment_2");
			builder.put(grammarAccess.getRequiredServiceAccess().getNameAssignment_2(), "rule__RequiredService__NameAssignment_2");
			builder.put(grammarAccess.getProvidedServiceAccess().getNameAssignment_2(), "rule__ProvidedService__NameAssignment_2");
			builder.put(grammarAccess.getRole_ImplAccess().getNameAssignment_2(), "rule__Role_Impl__NameAssignment_2");
			builder.put(grammarAccess.getRequiredRoleAccess().getNameAssignment_2(), "rule__RequiredRole__NameAssignment_2");
			builder.put(grammarAccess.getProvidedRoleAccess().getNameAssignment_2(), "rule__ProvidedRole__NameAssignment_2");
			builder.put(grammarAccess.getRequiredPortAccess().getNameAssignment_2(), "rule__RequiredPort__NameAssignment_2");
			builder.put(grammarAccess.getProvidedPortAccess().getNameAssignment_2(), "rule__ProvidedPort__NameAssignment_2");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getNameAssignment_1(), "rule__SimpleConfiguration__NameAssignment_1");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getComponentsAssignment_3(), "rule__SimpleConfiguration__ComponentsAssignment_3");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getComponentsAssignment_4_1(), "rule__SimpleConfiguration__ComponentsAssignment_4_1");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getConnectorsAssignment_5_0(), "rule__SimpleConfiguration__ConnectorsAssignment_5_0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getConnectorsAssignment_5_1_1(), "rule__SimpleConfiguration__ConnectorsAssignment_5_1_1");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getPortsAssignment_6_0(), "rule__SimpleConfiguration__PortsAssignment_6_0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getPortsAssignment_6_1_1(), "rule__SimpleConfiguration__PortsAssignment_6_1_1");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getBindingsAssignment_7_0(), "rule__SimpleConfiguration__BindingsAssignment_7_0");
			builder.put(grammarAccess.getSimpleConfigurationAccess().getBindingsAssignment_7_1_1(), "rule__SimpleConfiguration__BindingsAssignment_7_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CosaDslGrammarAccess grammarAccess;

	@Override
	protected InternalCosaDslParser createParser() {
		InternalCosaDslParser result = new InternalCosaDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CosaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CosaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
