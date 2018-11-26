/*
 * generated by Xtext 2.15.0
 */
grammar InternalCosaDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.univnantes.asa.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.univnantes.asa.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.univnantes.asa.xtext.services.CosaDslGrammarAccess;

}

@parser::members {

 	private CosaDslGrammarAccess grammarAccess;

    public InternalCosaDslParser(TokenStream input, CosaDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "CompositeConfiguration";
   	}

   	@Override
   	protected CosaDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCompositeConfiguration
entryRuleCompositeConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeConfigurationRule()); }
	iv_ruleCompositeConfiguration=ruleCompositeConfiguration
	{ $current=$iv_ruleCompositeConfiguration.current; }
	EOF;

// Rule CompositeConfiguration
ruleCompositeConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CompositeConfiguration'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompositeConfigurationAccess().getCompositeConfigurationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='={'
		{
			newLeafNode(otherlv_2, grammarAccess.getCompositeConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0());
				}
				lv_components_3_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
					}
					add(
						$current,
						"components",
						lv_components_3_0,
						"fr.univnantes.asa.xtext.CosaDsl.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0());
					}
					lv_components_5_0=ruleComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
						}
						add(
							$current,
							"components",
							lv_components_5_0,
							"fr.univnantes.asa.xtext.CosaDsl.Component");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0());
				}
				lv_connectors_6_0=ruleConnector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
					}
					add(
						$current,
						"connectors",
						lv_connectors_6_0,
						"fr.univnantes.asa.xtext.CosaDsl.Connector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0());
					}
					lv_connectors_8_0=ruleConnector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
						}
						add(
							$current,
							"connectors",
							lv_connectors_8_0,
							"fr.univnantes.asa.xtext.CosaDsl.Connector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_7_0());
				}
				lv_ports_9_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
					}
					add(
						$current,
						"ports",
						lv_ports_9_0,
						"fr.univnantes.asa.xtext.CosaDsl.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_10=','
			{
				newLeafNode(otherlv_10, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_8_1_0());
					}
					lv_ports_11_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
						}
						add(
							$current,
							"ports",
							lv_ports_11_0,
							"fr.univnantes.asa.xtext.CosaDsl.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0());
					}
					lv_bindings_12_0=ruleBinding
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
						}
						add(
							$current,
							"bindings",
							lv_bindings_12_0,
							"fr.univnantes.asa.xtext.CosaDsl.Binding");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_9_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0());
						}
						lv_bindings_14_0=ruleBinding
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
							}
							add(
								$current,
								"bindings",
								lv_bindings_14_0,
								"fr.univnantes.asa.xtext.CosaDsl.Binding");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0());
				}
				lv_attachements_15_0=ruleAttachement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
					}
					add(
						$current,
						"attachements",
						lv_attachements_15_0,
						"fr.univnantes.asa.xtext.CosaDsl.Attachement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_16=','
			{
				newLeafNode(otherlv_16, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0());
					}
					lv_attachements_17_0=ruleAttachement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
						}
						add(
							$current,
							"attachements",
							lv_attachements_17_0,
							"fr.univnantes.asa.xtext.CosaDsl.Attachement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_0_0());
					}
					lv_configurations_18_0=ruleConfiguration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
						}
						add(
							$current,
							"configurations",
							lv_configurations_18_0,
							"fr.univnantes.asa.xtext.CosaDsl.Configuration");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_19=','
				{
					newLeafNode(otherlv_19, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_12_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_1_1_0());
						}
						lv_configurations_20_0=ruleConfiguration
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
							}
							add(
								$current,
								"configurations",
								lv_configurations_20_0,
								"fr.univnantes.asa.xtext.CosaDsl.Configuration");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)*
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleConfiguration
entryRuleConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationRule()); }
	iv_ruleConfiguration=ruleConfiguration
	{ $current=$iv_ruleConfiguration.current; }
	EOF;

// Rule Configuration
ruleConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Configuration'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='={'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_3_0());
				}
				lv_components_3_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"components",
						lv_components_3_0,
						"fr.univnantes.asa.xtext.CosaDsl.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0());
					}
					lv_components_5_0=ruleComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"components",
							lv_components_5_0,
							"fr.univnantes.asa.xtext.CosaDsl.Component");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0());
				}
				lv_connectors_6_0=ruleConnector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"connectors",
						lv_connectors_6_0,
						"fr.univnantes.asa.xtext.CosaDsl.Connector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0());
					}
					lv_connectors_8_0=ruleConnector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"connectors",
							lv_connectors_8_0,
							"fr.univnantes.asa.xtext.CosaDsl.Connector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_7_0());
				}
				lv_ports_9_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"ports",
						lv_ports_9_0,
						"fr.univnantes.asa.xtext.CosaDsl.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_10=','
			{
				newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_8_1_0());
					}
					lv_ports_11_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"ports",
							lv_ports_11_0,
							"fr.univnantes.asa.xtext.CosaDsl.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0());
					}
					lv_bindings_12_0=ruleBinding
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"bindings",
							lv_bindings_12_0,
							"fr.univnantes.asa.xtext.CosaDsl.Binding");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getConfigurationAccess().getCommaKeyword_9_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0());
						}
						lv_bindings_14_0=ruleBinding
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConfigurationRule());
							}
							add(
								$current,
								"bindings",
								lv_bindings_14_0,
								"fr.univnantes.asa.xtext.CosaDsl.Binding");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0());
				}
				lv_attachements_15_0=ruleAttachement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"attachements",
						lv_attachements_15_0,
						"fr.univnantes.asa.xtext.CosaDsl.Attachement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_16=','
			{
				newLeafNode(otherlv_16, grammarAccess.getConfigurationAccess().getCommaKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0());
					}
					lv_attachements_17_0=ruleAttachement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"attachements",
							lv_attachements_17_0,
							"fr.univnantes.asa.xtext.CosaDsl.Attachement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='={'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getEqualsSignLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0());
				}
				lv_ports_3_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"ports",
						lv_ports_3_0,
						"fr.univnantes.asa.xtext.CosaDsl.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_1_0());
					}
					lv_ports_5_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentRule());
						}
						add(
							$current,
							"ports",
							lv_ports_5_0,
							"fr.univnantes.asa.xtext.CosaDsl.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_0());
				}
				lv_services_6_0=ruleService
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"services",
						lv_services_6_0,
						"fr.univnantes.asa.xtext.CosaDsl.Service");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_6_1_0());
					}
					lv_services_8_0=ruleService
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentRule());
						}
						add(
							$current,
							"services",
							lv_services_8_0,
							"fr.univnantes.asa.xtext.CosaDsl.Service");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleConnector
entryRuleConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectorRule()); }
	iv_ruleConnector=ruleConnector
	{ $current=$iv_ruleConnector.current; }
	EOF;

// Rule Connector
ruleConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Connector'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectorRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='={'
		{
			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getEqualsSignLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Roles{'
		{
			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getRolesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_0());
				}
				lv_roles_4_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectorRule());
					}
					add(
						$current,
						"roles",
						lv_roles_4_0,
						"fr.univnantes.asa.xtext.CosaDsl.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getCommaKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_6_0());
				}
				lv_roles_6_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectorRule());
					}
					add(
						$current,
						"roles",
						lv_roles_6_0,
						"fr.univnantes.asa.xtext.CosaDsl.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPortAccess().getPort_ImplParserRuleCall_0());
		}
		this_Port_Impl_0=rulePort_Impl
		{
			$current = $this_Port_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1());
		}
		this_RequiredPort_1=ruleRequiredPort
		{
			$current = $this_RequiredPort_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_2());
		}
		this_ProvidedPort_2=ruleProvidedPort
		{
			$current = $this_ProvidedPort_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleService
entryRuleService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	iv_ruleService=ruleService
	{ $current=$iv_ruleService.current; }
	EOF;

// Rule Service
ruleService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0());
		}
		this_Service_Impl_0=ruleService_Impl
		{
			$current = $this_Service_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getServiceAccess().getRequiredServiceParserRuleCall_1());
		}
		this_RequiredService_1=ruleRequiredService
		{
			$current = $this_RequiredService_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getServiceAccess().getProvidedServiceParserRuleCall_2());
		}
		this_ProvidedService_2=ruleProvidedService
		{
			$current = $this_ProvidedService_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	iv_ruleRole=ruleRole
	{ $current=$iv_ruleRole.current; }
	EOF;

// Rule Role
ruleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRoleAccess().getRole_ImplParserRuleCall_0());
		}
		this_Role_Impl_0=ruleRole_Impl
		{
			$current = $this_Role_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoleAccess().getRequiredRoleParserRuleCall_1());
		}
		this_RequiredRole_1=ruleRequiredRole
		{
			$current = $this_RequiredRole_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoleAccess().getProvidedRoleParserRuleCall_2());
		}
		this_ProvidedRole_2=ruleProvidedRole
		{
			$current = $this_ProvidedRole_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRulePort_Impl
entryRulePort_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPort_ImplRule()); }
	iv_rulePort_Impl=rulePort_Impl
	{ $current=$iv_rulePort_Impl.current; }
	EOF;

// Rule Port_Impl
rulePort_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPort_ImplAccess().getPortAction_0(),
					$current);
			}
		)
		otherlv_1='Port'
		{
			newLeafNode(otherlv_1, grammarAccess.getPort_ImplAccess().getPortKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPort_ImplAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPort_ImplRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBinding
entryRuleBinding returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingRule()); }
	iv_ruleBinding=ruleBinding
	{ $current=$iv_ruleBinding.current; }
	EOF;

// Rule Binding
ruleBinding returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Binding'
		{
			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindingKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getPortProvidedPortParserRuleCall_2_0());
				}
				lv_portProvided_2_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"portProvided",
						lv_portProvided_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBindingAccess().getPortRequiredPortParserRuleCall_3_0());
				}
				lv_portRequired_3_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBindingRule());
					}
					set(
						$current,
						"portRequired",
						lv_portRequired_3_0,
						"fr.univnantes.asa.xtext.CosaDsl.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAttachement
entryRuleAttachement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttachementRule()); }
	iv_ruleAttachement=ruleAttachement
	{ $current=$iv_ruleAttachement.current; }
	EOF;

// Rule Attachement
ruleAttachement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Attachement'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttachementAccess().getAttachementKeyword_0());
		}
		otherlv_1=':{'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttachementAccess().getColonLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttachementAccess().getRoleRoleParserRuleCall_2_0());
				}
				lv_role_2_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttachementRule());
					}
					set(
						$current,
						"role",
						lv_role_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='to'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttachementAccess().getToKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttachementAccess().getPortPortParserRuleCall_4_0());
				}
				lv_port_4_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttachementRule());
					}
					set(
						$current,
						"port",
						lv_port_4_0,
						"fr.univnantes.asa.xtext.CosaDsl.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleService_Impl
entryRuleService_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getService_ImplRule()); }
	iv_ruleService_Impl=ruleService_Impl
	{ $current=$iv_ruleService_Impl.current; }
	EOF;

// Rule Service_Impl
ruleService_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getService_ImplAccess().getServiceAction_0(),
					$current);
			}
		)
		otherlv_1='Service'
		{
			newLeafNode(otherlv_1, grammarAccess.getService_ImplAccess().getServiceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getService_ImplRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRequiredService
entryRuleRequiredService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredServiceRule()); }
	iv_ruleRequiredService=ruleRequiredService
	{ $current=$iv_ruleRequiredService.current; }
	EOF;

// Rule RequiredService
ruleRequiredService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequiredServiceAccess().getRequiredServiceAction_0(),
					$current);
			}
		)
		otherlv_1='RequiredService'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProvidedService
entryRuleProvidedService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedServiceRule()); }
	iv_ruleProvidedService=ruleProvidedService
	{ $current=$iv_ruleProvidedService.current; }
	EOF;

// Rule ProvidedService
ruleProvidedService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProvidedServiceAccess().getProvidedServiceAction_0(),
					$current);
			}
		)
		otherlv_1='ProvidedService'
		{
			newLeafNode(otherlv_1, grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProvidedServiceAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProvidedServiceRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRole_Impl
entryRuleRole_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRole_ImplRule()); }
	iv_ruleRole_Impl=ruleRole_Impl
	{ $current=$iv_ruleRole_Impl.current; }
	EOF;

// Rule Role_Impl
ruleRole_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRole_ImplAccess().getRoleAction_0(),
					$current);
			}
		)
		otherlv_1='Role'
		{
			newLeafNode(otherlv_1, grammarAccess.getRole_ImplAccess().getRoleKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRole_ImplRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRequiredRole
entryRuleRequiredRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredRoleRule()); }
	iv_ruleRequiredRole=ruleRequiredRole
	{ $current=$iv_ruleRequiredRole.current; }
	EOF;

// Rule RequiredRole
ruleRequiredRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0(),
					$current);
			}
		)
		otherlv_1='RequiredRole'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProvidedRole
entryRuleProvidedRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedRoleRule()); }
	iv_ruleProvidedRole=ruleProvidedRole
	{ $current=$iv_ruleProvidedRole.current; }
	EOF;

// Rule ProvidedRole
ruleProvidedRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0(),
					$current);
			}
		)
		otherlv_1='ProvidedRole'
		{
			newLeafNode(otherlv_1, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRequiredPort
entryRuleRequiredPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredPortRule()); }
	iv_ruleRequiredPort=ruleRequiredPort
	{ $current=$iv_ruleRequiredPort.current; }
	EOF;

// Rule RequiredPort
ruleRequiredPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequiredPortAccess().getRequiredPortAction_0(),
					$current);
			}
		)
		otherlv_1='RequiredPort'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequiredPortAccess().getRequiredPortKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequiredPortAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequiredPortRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProvidedPort
entryRuleProvidedPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedPortRule()); }
	iv_ruleProvidedPort=ruleProvidedPort
	{ $current=$iv_ruleProvidedPort.current; }
	EOF;

// Rule ProvidedPort
ruleProvidedPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProvidedPortAccess().getProvidedPortAction_0(),
					$current);
			}
		)
		otherlv_1='ProvidedPort'
		{
			newLeafNode(otherlv_1, grammarAccess.getProvidedPortAccess().getProvidedPortKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProvidedPortAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProvidedPortRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.univnantes.asa.xtext.CosaDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
