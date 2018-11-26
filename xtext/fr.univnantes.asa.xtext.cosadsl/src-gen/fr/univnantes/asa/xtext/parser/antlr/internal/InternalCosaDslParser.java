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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCosaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CompositeConfiguration'", "'={'", "','", "'}'", "'Configuration'", "'Component'", "'Connector'", "'Roles{'", "'Port'", "'Binding'", "'{'", "'Attachement'", "':{'", "'to'", "'Service'", "'RequiredService'", "'ProvidedService'", "'Role'", "'RequiredRole'", "'ProvidedRole'", "'RequiredPort'", "'ProvidedPort'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCosaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCosaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCosaDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCosaDsl.g"; }



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




    // $ANTLR start "entryRuleCompositeConfiguration"
    // InternalCosaDsl.g:64:1: entryRuleCompositeConfiguration returns [EObject current=null] : iv_ruleCompositeConfiguration= ruleCompositeConfiguration EOF ;
    public final EObject entryRuleCompositeConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeConfiguration = null;


        try {
            // InternalCosaDsl.g:64:63: (iv_ruleCompositeConfiguration= ruleCompositeConfiguration EOF )
            // InternalCosaDsl.g:65:2: iv_ruleCompositeConfiguration= ruleCompositeConfiguration EOF
            {
             newCompositeNode(grammarAccess.getCompositeConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeConfiguration=ruleCompositeConfiguration();

            state._fsp--;

             current =iv_ruleCompositeConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeConfiguration"


    // $ANTLR start "ruleCompositeConfiguration"
    // InternalCosaDsl.g:71:1: ruleCompositeConfiguration returns [EObject current=null] : (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' ) ;
    public final EObject ruleCompositeConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_connectors_6_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_ports_9_0 = null;

        EObject lv_ports_11_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;

        EObject lv_attachements_15_0 = null;

        EObject lv_attachements_17_0 = null;

        EObject lv_configurations_18_0 = null;

        EObject lv_configurations_20_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:77:2: ( (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' ) )
            // InternalCosaDsl.g:78:2: (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' )
            {
            // InternalCosaDsl.g:78:2: (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' )
            // InternalCosaDsl.g:79:3: otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeConfigurationAccess().getCompositeConfigurationKeyword_0());
            		
            // InternalCosaDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:106:3: ( (lv_components_3_0= ruleComponent ) )
            // InternalCosaDsl.g:107:4: (lv_components_3_0= ruleComponent )
            {
            // InternalCosaDsl.g:107:4: (lv_components_3_0= ruleComponent )
            // InternalCosaDsl.g:108:5: lv_components_3_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_components_3_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:125:3: (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCosaDsl.g:126:4: otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:130:4: ( (lv_components_5_0= ruleComponent ) )
            	    // InternalCosaDsl.g:131:5: (lv_components_5_0= ruleComponent )
            	    {
            	    // InternalCosaDsl.g:131:5: (lv_components_5_0= ruleComponent )
            	    // InternalCosaDsl.g:132:6: lv_components_5_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_5_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCosaDsl.g:150:3: ( (lv_connectors_6_0= ruleConnector ) )
            // InternalCosaDsl.g:151:4: (lv_connectors_6_0= ruleConnector )
            {
            // InternalCosaDsl.g:151:4: (lv_connectors_6_0= ruleConnector )
            // InternalCosaDsl.g:152:5: lv_connectors_6_0= ruleConnector
            {

            					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_connectors_6_0=ruleConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            					}
            					add(
            						current,
            						"connectors",
            						lv_connectors_6_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Connector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:169:3: (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCosaDsl.g:170:4: otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCosaDsl.g:174:4: ( (lv_connectors_8_0= ruleConnector ) )
            	    // InternalCosaDsl.g:175:5: (lv_connectors_8_0= ruleConnector )
            	    {
            	    // InternalCosaDsl.g:175:5: (lv_connectors_8_0= ruleConnector )
            	    // InternalCosaDsl.g:176:6: lv_connectors_8_0= ruleConnector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_connectors_8_0=ruleConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectors",
            	    							lv_connectors_8_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Connector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCosaDsl.g:194:3: ( (lv_ports_9_0= rulePort ) )
            // InternalCosaDsl.g:195:4: (lv_ports_9_0= rulePort )
            {
            // InternalCosaDsl.g:195:4: (lv_ports_9_0= rulePort )
            // InternalCosaDsl.g:196:5: lv_ports_9_0= rulePort
            {

            					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_ports_9_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_9_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:213:3: (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCosaDsl.g:214:4: otherlv_10= ',' ( (lv_ports_11_0= rulePort ) )
            	    {
            	    otherlv_10=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCosaDsl.g:218:4: ( (lv_ports_11_0= rulePort ) )
            	    // InternalCosaDsl.g:219:5: (lv_ports_11_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:219:5: (lv_ports_11_0= rulePort )
            	    // InternalCosaDsl.g:220:6: lv_ports_11_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_ports_11_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_11_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCosaDsl.g:238:3: ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCosaDsl.g:239:4: ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    {
            	    // InternalCosaDsl.g:239:4: ( (lv_bindings_12_0= ruleBinding ) )
            	    // InternalCosaDsl.g:240:5: (lv_bindings_12_0= ruleBinding )
            	    {
            	    // InternalCosaDsl.g:240:5: (lv_bindings_12_0= ruleBinding )
            	    // InternalCosaDsl.g:241:6: lv_bindings_12_0= ruleBinding
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_bindings_12_0=ruleBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bindings",
            	    							lv_bindings_12_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Binding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:258:4: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==13) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:259:5: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,13,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_9_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:263:5: ( (lv_bindings_14_0= ruleBinding ) )
            	    	    // InternalCosaDsl.g:264:6: (lv_bindings_14_0= ruleBinding )
            	    	    {
            	    	    // InternalCosaDsl.g:264:6: (lv_bindings_14_0= ruleBinding )
            	    	    // InternalCosaDsl.g:265:7: lv_bindings_14_0= ruleBinding
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_bindings_14_0=ruleBinding();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"bindings",
            	    	    								lv_bindings_14_0,
            	    	    								"fr.univnantes.asa.xtext.CosaDsl.Binding");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalCosaDsl.g:284:3: ( (lv_attachements_15_0= ruleAttachement ) )
            // InternalCosaDsl.g:285:4: (lv_attachements_15_0= ruleAttachement )
            {
            // InternalCosaDsl.g:285:4: (lv_attachements_15_0= ruleAttachement )
            // InternalCosaDsl.g:286:5: lv_attachements_15_0= ruleAttachement
            {

            					newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_attachements_15_0=ruleAttachement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            					}
            					add(
            						current,
            						"attachements",
            						lv_attachements_15_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Attachement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:303:3: (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCosaDsl.g:304:4: otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) )
            	    {
            	    otherlv_16=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_16, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalCosaDsl.g:308:4: ( (lv_attachements_17_0= ruleAttachement ) )
            	    // InternalCosaDsl.g:309:5: (lv_attachements_17_0= ruleAttachement )
            	    {
            	    // InternalCosaDsl.g:309:5: (lv_attachements_17_0= ruleAttachement )
            	    // InternalCosaDsl.g:310:6: lv_attachements_17_0= ruleAttachement
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_attachements_17_0=ruleAttachement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attachements",
            	    							lv_attachements_17_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Attachement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCosaDsl.g:328:3: ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCosaDsl.g:329:4: ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )*
            	    {
            	    // InternalCosaDsl.g:329:4: ( (lv_configurations_18_0= ruleConfiguration ) )
            	    // InternalCosaDsl.g:330:5: (lv_configurations_18_0= ruleConfiguration )
            	    {
            	    // InternalCosaDsl.g:330:5: (lv_configurations_18_0= ruleConfiguration )
            	    // InternalCosaDsl.g:331:6: lv_configurations_18_0= ruleConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_configurations_18_0=ruleConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"configurations",
            	    							lv_configurations_18_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Configuration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:348:4: (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==13) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:349:5: otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_12_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:353:5: ( (lv_configurations_20_0= ruleConfiguration ) )
            	    	    // InternalCosaDsl.g:354:6: (lv_configurations_20_0= ruleConfiguration )
            	    	    {
            	    	    // InternalCosaDsl.g:354:6: (lv_configurations_20_0= ruleConfiguration )
            	    	    // InternalCosaDsl.g:355:7: lv_configurations_20_0= ruleConfiguration
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_configurations_20_0=ruleConfiguration();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getCompositeConfigurationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"configurations",
            	    	    								lv_configurations_20_0,
            	    	    								"fr.univnantes.asa.xtext.CosaDsl.Configuration");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeConfiguration"


    // $ANTLR start "entryRuleConfiguration"
    // InternalCosaDsl.g:382:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalCosaDsl.g:382:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalCosaDsl.g:383:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalCosaDsl.g:389:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* otherlv_18= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_connectors_6_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_ports_9_0 = null;

        EObject lv_ports_11_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;

        EObject lv_attachements_15_0 = null;

        EObject lv_attachements_17_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:395:2: ( (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* otherlv_18= '}' ) )
            // InternalCosaDsl.g:396:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* otherlv_18= '}' )
            {
            // InternalCosaDsl.g:396:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* otherlv_18= '}' )
            // InternalCosaDsl.g:397:3: otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalCosaDsl.g:401:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:402:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:402:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:403:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:424:3: ( (lv_components_3_0= ruleComponent ) )
            // InternalCosaDsl.g:425:4: (lv_components_3_0= ruleComponent )
            {
            // InternalCosaDsl.g:425:4: (lv_components_3_0= ruleComponent )
            // InternalCosaDsl.g:426:5: lv_components_3_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_components_3_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:443:3: (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCosaDsl.g:444:4: otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:448:4: ( (lv_components_5_0= ruleComponent ) )
            	    // InternalCosaDsl.g:449:5: (lv_components_5_0= ruleComponent )
            	    {
            	    // InternalCosaDsl.g:449:5: (lv_components_5_0= ruleComponent )
            	    // InternalCosaDsl.g:450:6: lv_components_5_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_5_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCosaDsl.g:468:3: ( (lv_connectors_6_0= ruleConnector ) )
            // InternalCosaDsl.g:469:4: (lv_connectors_6_0= ruleConnector )
            {
            // InternalCosaDsl.g:469:4: (lv_connectors_6_0= ruleConnector )
            // InternalCosaDsl.g:470:5: lv_connectors_6_0= ruleConnector
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_connectors_6_0=ruleConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"connectors",
            						lv_connectors_6_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Connector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:487:3: (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCosaDsl.g:488:4: otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCosaDsl.g:492:4: ( (lv_connectors_8_0= ruleConnector ) )
            	    // InternalCosaDsl.g:493:5: (lv_connectors_8_0= ruleConnector )
            	    {
            	    // InternalCosaDsl.g:493:5: (lv_connectors_8_0= ruleConnector )
            	    // InternalCosaDsl.g:494:6: lv_connectors_8_0= ruleConnector
            	    {

            	    						newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_connectors_8_0=ruleConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectors",
            	    							lv_connectors_8_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Connector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCosaDsl.g:512:3: ( (lv_ports_9_0= rulePort ) )
            // InternalCosaDsl.g:513:4: (lv_ports_9_0= rulePort )
            {
            // InternalCosaDsl.g:513:4: (lv_ports_9_0= rulePort )
            // InternalCosaDsl.g:514:5: lv_ports_9_0= rulePort
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_ports_9_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_9_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:531:3: (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCosaDsl.g:532:4: otherlv_10= ',' ( (lv_ports_11_0= rulePort ) )
            	    {
            	    otherlv_10=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCosaDsl.g:536:4: ( (lv_ports_11_0= rulePort ) )
            	    // InternalCosaDsl.g:537:5: (lv_ports_11_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:537:5: (lv_ports_11_0= rulePort )
            	    // InternalCosaDsl.g:538:6: lv_ports_11_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_ports_11_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_11_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalCosaDsl.g:556:3: ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCosaDsl.g:557:4: ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    {
            	    // InternalCosaDsl.g:557:4: ( (lv_bindings_12_0= ruleBinding ) )
            	    // InternalCosaDsl.g:558:5: (lv_bindings_12_0= ruleBinding )
            	    {
            	    // InternalCosaDsl.g:558:5: (lv_bindings_12_0= ruleBinding )
            	    // InternalCosaDsl.g:559:6: lv_bindings_12_0= ruleBinding
            	    {

            	    						newCompositeNode(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_bindings_12_0=ruleBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bindings",
            	    							lv_bindings_12_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Binding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:576:4: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==13) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:577:5: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,13,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_13, grammarAccess.getConfigurationAccess().getCommaKeyword_9_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:581:5: ( (lv_bindings_14_0= ruleBinding ) )
            	    	    // InternalCosaDsl.g:582:6: (lv_bindings_14_0= ruleBinding )
            	    	    {
            	    	    // InternalCosaDsl.g:582:6: (lv_bindings_14_0= ruleBinding )
            	    	    // InternalCosaDsl.g:583:7: lv_bindings_14_0= ruleBinding
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_bindings_14_0=ruleBinding();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"bindings",
            	    	    								lv_bindings_14_0,
            	    	    								"fr.univnantes.asa.xtext.CosaDsl.Binding");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalCosaDsl.g:602:3: ( (lv_attachements_15_0= ruleAttachement ) )
            // InternalCosaDsl.g:603:4: (lv_attachements_15_0= ruleAttachement )
            {
            // InternalCosaDsl.g:603:4: (lv_attachements_15_0= ruleAttachement )
            // InternalCosaDsl.g:604:5: lv_attachements_15_0= ruleAttachement
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_attachements_15_0=ruleAttachement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"attachements",
            						lv_attachements_15_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Attachement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:621:3: (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCosaDsl.g:622:4: otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) )
            	    {
            	    otherlv_16=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_16, grammarAccess.getConfigurationAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalCosaDsl.g:626:4: ( (lv_attachements_17_0= ruleAttachement ) )
            	    // InternalCosaDsl.g:627:5: (lv_attachements_17_0= ruleAttachement )
            	    {
            	    // InternalCosaDsl.g:627:5: (lv_attachements_17_0= ruleAttachement )
            	    // InternalCosaDsl.g:628:6: lv_attachements_17_0= ruleAttachement
            	    {

            	    						newCompositeNode(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attachements_17_0=ruleAttachement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attachements",
            	    							lv_attachements_17_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Attachement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleComponent"
    // InternalCosaDsl.g:654:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCosaDsl.g:654:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCosaDsl.g:655:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCosaDsl.g:661:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ports_3_0 = null;

        EObject lv_ports_5_0 = null;

        EObject lv_services_6_0 = null;

        EObject lv_services_8_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:667:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' ) )
            // InternalCosaDsl.g:668:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )
            {
            // InternalCosaDsl.g:668:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )
            // InternalCosaDsl.g:669:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalCosaDsl.g:673:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:674:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:674:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:675:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getEqualsSignLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:696:3: ( (lv_ports_3_0= rulePort ) )
            // InternalCosaDsl.g:697:4: (lv_ports_3_0= rulePort )
            {
            // InternalCosaDsl.g:697:4: (lv_ports_3_0= rulePort )
            // InternalCosaDsl.g:698:5: lv_ports_3_0= rulePort
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_ports_3_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:715:3: (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCosaDsl.g:716:4: otherlv_4= ',' ( (lv_ports_5_0= rulePort ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:720:4: ( (lv_ports_5_0= rulePort ) )
            	    // InternalCosaDsl.g:721:5: (lv_ports_5_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:721:5: (lv_ports_5_0= rulePort )
            	    // InternalCosaDsl.g:722:6: lv_ports_5_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_ports_5_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_5_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalCosaDsl.g:740:3: ( (lv_services_6_0= ruleService ) )
            // InternalCosaDsl.g:741:4: (lv_services_6_0= ruleService )
            {
            // InternalCosaDsl.g:741:4: (lv_services_6_0= ruleService )
            // InternalCosaDsl.g:742:5: lv_services_6_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_services_6_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"services",
            						lv_services_6_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:759:3: (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCosaDsl.g:760:4: otherlv_7= ',' ( (lv_services_8_0= ruleService ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCosaDsl.g:764:4: ( (lv_services_8_0= ruleService ) )
            	    // InternalCosaDsl.g:765:5: (lv_services_8_0= ruleService )
            	    {
            	    // InternalCosaDsl.g:765:5: (lv_services_8_0= ruleService )
            	    // InternalCosaDsl.g:766:6: lv_services_8_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_services_8_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"services",
            	    							lv_services_8_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalCosaDsl.g:792:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCosaDsl.g:792:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCosaDsl.g:793:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCosaDsl.g:799:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' otherlv_3= 'Roles{' ( (lv_roles_4_0= ruleRole ) ) otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_roles_4_0 = null;

        EObject lv_roles_6_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:805:2: ( (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' otherlv_3= 'Roles{' ( (lv_roles_4_0= ruleRole ) ) otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) otherlv_7= '}' otherlv_8= '}' ) )
            // InternalCosaDsl.g:806:2: (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' otherlv_3= 'Roles{' ( (lv_roles_4_0= ruleRole ) ) otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalCosaDsl.g:806:2: (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' otherlv_3= 'Roles{' ( (lv_roles_4_0= ruleRole ) ) otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) otherlv_7= '}' otherlv_8= '}' )
            // InternalCosaDsl.g:807:3: otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '={' otherlv_3= 'Roles{' ( (lv_roles_4_0= ruleRole ) ) otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            // InternalCosaDsl.g:811:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:812:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:812:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:813:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getEqualsSignLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getRolesKeyword_3());
            		
            // InternalCosaDsl.g:838:3: ( (lv_roles_4_0= ruleRole ) )
            // InternalCosaDsl.g:839:4: (lv_roles_4_0= ruleRole )
            {
            // InternalCosaDsl.g:839:4: (lv_roles_4_0= ruleRole )
            // InternalCosaDsl.g:840:5: lv_roles_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_roles_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getCommaKeyword_5());
            		
            // InternalCosaDsl.g:861:3: ( (lv_roles_6_0= ruleRole ) )
            // InternalCosaDsl.g:862:4: (lv_roles_6_0= ruleRole )
            {
            // InternalCosaDsl.g:862:4: (lv_roles_6_0= ruleRole )
            // InternalCosaDsl.g:863:5: lv_roles_6_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_roles_6_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_6_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePort"
    // InternalCosaDsl.g:892:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalCosaDsl.g:892:45: (iv_rulePort= rulePort EOF )
            // InternalCosaDsl.g:893:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalCosaDsl.g:899:1: rulePort returns [EObject current=null] : (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_Port_Impl_0 = null;

        EObject this_RequiredPort_1 = null;

        EObject this_ProvidedPort_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:905:2: ( (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort ) )
            // InternalCosaDsl.g:906:2: (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort )
            {
            // InternalCosaDsl.g:906:2: (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCosaDsl.g:907:3: this_Port_Impl_0= rulePort_Impl
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getPort_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_Impl_0=rulePort_Impl();

                    state._fsp--;


                    			current = this_Port_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:916:3: this_RequiredPort_1= ruleRequiredPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequiredPort_1=ruleRequiredPort();

                    state._fsp--;


                    			current = this_RequiredPort_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:925:3: this_ProvidedPort_2= ruleProvidedPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProvidedPort_2=ruleProvidedPort();

                    state._fsp--;


                    			current = this_ProvidedPort_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleService"
    // InternalCosaDsl.g:937:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalCosaDsl.g:937:48: (iv_ruleService= ruleService EOF )
            // InternalCosaDsl.g:938:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalCosaDsl.g:944:1: ruleService returns [EObject current=null] : (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_Service_Impl_0 = null;

        EObject this_RequiredService_1 = null;

        EObject this_ProvidedService_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:950:2: ( (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService ) )
            // InternalCosaDsl.g:951:2: (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService )
            {
            // InternalCosaDsl.g:951:2: (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt18=1;
                }
                break;
            case 26:
                {
                alt18=2;
                }
                break;
            case 27:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCosaDsl.g:952:3: this_Service_Impl_0= ruleService_Impl
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Service_Impl_0=ruleService_Impl();

                    state._fsp--;


                    			current = this_Service_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:961:3: this_RequiredService_1= ruleRequiredService
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getRequiredServiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequiredService_1=ruleRequiredService();

                    state._fsp--;


                    			current = this_RequiredService_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:970:3: this_ProvidedService_2= ruleProvidedService
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getProvidedServiceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProvidedService_2=ruleProvidedService();

                    state._fsp--;


                    			current = this_ProvidedService_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRole"
    // InternalCosaDsl.g:982:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalCosaDsl.g:982:45: (iv_ruleRole= ruleRole EOF )
            // InternalCosaDsl.g:983:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalCosaDsl.g:989:1: ruleRole returns [EObject current=null] : (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_Role_Impl_0 = null;

        EObject this_RequiredRole_1 = null;

        EObject this_ProvidedRole_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:995:2: ( (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole ) )
            // InternalCosaDsl.g:996:2: (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole )
            {
            // InternalCosaDsl.g:996:2: (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCosaDsl.g:997:3: this_Role_Impl_0= ruleRole_Impl
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRole_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_Impl_0=ruleRole_Impl();

                    state._fsp--;


                    			current = this_Role_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:1006:3: this_RequiredRole_1= ruleRequiredRole
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRequiredRoleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequiredRole_1=ruleRequiredRole();

                    state._fsp--;


                    			current = this_RequiredRole_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:1015:3: this_ProvidedRole_2= ruleProvidedRole
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getProvidedRoleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProvidedRole_2=ruleProvidedRole();

                    state._fsp--;


                    			current = this_ProvidedRole_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEString"
    // InternalCosaDsl.g:1027:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCosaDsl.g:1027:47: (iv_ruleEString= ruleEString EOF )
            // InternalCosaDsl.g:1028:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCosaDsl.g:1034:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCosaDsl.g:1040:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCosaDsl.g:1041:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCosaDsl.g:1041:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCosaDsl.g:1042:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:1050:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePort_Impl"
    // InternalCosaDsl.g:1061:1: entryRulePort_Impl returns [EObject current=null] : iv_rulePort_Impl= rulePort_Impl EOF ;
    public final EObject entryRulePort_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort_Impl = null;


        try {
            // InternalCosaDsl.g:1061:50: (iv_rulePort_Impl= rulePort_Impl EOF )
            // InternalCosaDsl.g:1062:2: iv_rulePort_Impl= rulePort_Impl EOF
            {
             newCompositeNode(grammarAccess.getPort_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort_Impl=rulePort_Impl();

            state._fsp--;

             current =iv_rulePort_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort_Impl"


    // $ANTLR start "rulePort_Impl"
    // InternalCosaDsl.g:1068:1: rulePort_Impl returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePort_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1074:2: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1075:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1075:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1076:3: () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1076:3: ()
            // InternalCosaDsl.g:1077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPort_ImplAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPort_ImplAccess().getPortKeyword_1());
            		
            // InternalCosaDsl.g:1087:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1088:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1088:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1089:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPort_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPort_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort_Impl"


    // $ANTLR start "entryRuleBinding"
    // InternalCosaDsl.g:1110:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalCosaDsl.g:1110:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalCosaDsl.g:1111:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalCosaDsl.g:1117:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'Binding' otherlv_1= '{' ( (lv_portProvided_2_0= rulePort ) ) ( (lv_portRequired_3_0= rulePort ) ) otherlv_4= '}' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_portProvided_2_0 = null;

        EObject lv_portRequired_3_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1123:2: ( (otherlv_0= 'Binding' otherlv_1= '{' ( (lv_portProvided_2_0= rulePort ) ) ( (lv_portRequired_3_0= rulePort ) ) otherlv_4= '}' ) )
            // InternalCosaDsl.g:1124:2: (otherlv_0= 'Binding' otherlv_1= '{' ( (lv_portProvided_2_0= rulePort ) ) ( (lv_portRequired_3_0= rulePort ) ) otherlv_4= '}' )
            {
            // InternalCosaDsl.g:1124:2: (otherlv_0= 'Binding' otherlv_1= '{' ( (lv_portProvided_2_0= rulePort ) ) ( (lv_portRequired_3_0= rulePort ) ) otherlv_4= '}' )
            // InternalCosaDsl.g:1125:3: otherlv_0= 'Binding' otherlv_1= '{' ( (lv_portProvided_2_0= rulePort ) ) ( (lv_portRequired_3_0= rulePort ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindingKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCosaDsl.g:1133:3: ( (lv_portProvided_2_0= rulePort ) )
            // InternalCosaDsl.g:1134:4: (lv_portProvided_2_0= rulePort )
            {
            // InternalCosaDsl.g:1134:4: (lv_portProvided_2_0= rulePort )
            // InternalCosaDsl.g:1135:5: lv_portProvided_2_0= rulePort
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getPortProvidedPortParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_portProvided_2_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"portProvided",
            						lv_portProvided_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:1152:3: ( (lv_portRequired_3_0= rulePort ) )
            // InternalCosaDsl.g:1153:4: (lv_portRequired_3_0= rulePort )
            {
            // InternalCosaDsl.g:1153:4: (lv_portRequired_3_0= rulePort )
            // InternalCosaDsl.g:1154:5: lv_portRequired_3_0= rulePort
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getPortRequiredPortParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_portRequired_3_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"portRequired",
            						lv_portRequired_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleAttachement"
    // InternalCosaDsl.g:1179:1: entryRuleAttachement returns [EObject current=null] : iv_ruleAttachement= ruleAttachement EOF ;
    public final EObject entryRuleAttachement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachement = null;


        try {
            // InternalCosaDsl.g:1179:52: (iv_ruleAttachement= ruleAttachement EOF )
            // InternalCosaDsl.g:1180:2: iv_ruleAttachement= ruleAttachement EOF
            {
             newCompositeNode(grammarAccess.getAttachementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttachement=ruleAttachement();

            state._fsp--;

             current =iv_ruleAttachement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttachement"


    // $ANTLR start "ruleAttachement"
    // InternalCosaDsl.g:1186:1: ruleAttachement returns [EObject current=null] : (otherlv_0= 'Attachement' otherlv_1= ':{' ( (lv_role_2_0= ruleRole ) ) otherlv_3= 'to' ( (lv_port_4_0= rulePort ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttachement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_role_2_0 = null;

        EObject lv_port_4_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1192:2: ( (otherlv_0= 'Attachement' otherlv_1= ':{' ( (lv_role_2_0= ruleRole ) ) otherlv_3= 'to' ( (lv_port_4_0= rulePort ) ) otherlv_5= '}' ) )
            // InternalCosaDsl.g:1193:2: (otherlv_0= 'Attachement' otherlv_1= ':{' ( (lv_role_2_0= ruleRole ) ) otherlv_3= 'to' ( (lv_port_4_0= rulePort ) ) otherlv_5= '}' )
            {
            // InternalCosaDsl.g:1193:2: (otherlv_0= 'Attachement' otherlv_1= ':{' ( (lv_role_2_0= ruleRole ) ) otherlv_3= 'to' ( (lv_port_4_0= rulePort ) ) otherlv_5= '}' )
            // InternalCosaDsl.g:1194:3: otherlv_0= 'Attachement' otherlv_1= ':{' ( (lv_role_2_0= ruleRole ) ) otherlv_3= 'to' ( (lv_port_4_0= rulePort ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAttachementAccess().getAttachementKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttachementAccess().getColonLeftCurlyBracketKeyword_1());
            		
            // InternalCosaDsl.g:1202:3: ( (lv_role_2_0= ruleRole ) )
            // InternalCosaDsl.g:1203:4: (lv_role_2_0= ruleRole )
            {
            // InternalCosaDsl.g:1203:4: (lv_role_2_0= ruleRole )
            // InternalCosaDsl.g:1204:5: lv_role_2_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAttachementAccess().getRoleRoleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_role_2_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttachementRule());
            					}
            					set(
            						current,
            						"role",
            						lv_role_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAttachementAccess().getToKeyword_3());
            		
            // InternalCosaDsl.g:1225:3: ( (lv_port_4_0= rulePort ) )
            // InternalCosaDsl.g:1226:4: (lv_port_4_0= rulePort )
            {
            // InternalCosaDsl.g:1226:4: (lv_port_4_0= rulePort )
            // InternalCosaDsl.g:1227:5: lv_port_4_0= rulePort
            {

            					newCompositeNode(grammarAccess.getAttachementAccess().getPortPortParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_port_4_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttachementRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_4_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttachement"


    // $ANTLR start "entryRuleService_Impl"
    // InternalCosaDsl.g:1252:1: entryRuleService_Impl returns [EObject current=null] : iv_ruleService_Impl= ruleService_Impl EOF ;
    public final EObject entryRuleService_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService_Impl = null;


        try {
            // InternalCosaDsl.g:1252:53: (iv_ruleService_Impl= ruleService_Impl EOF )
            // InternalCosaDsl.g:1253:2: iv_ruleService_Impl= ruleService_Impl EOF
            {
             newCompositeNode(grammarAccess.getService_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService_Impl=ruleService_Impl();

            state._fsp--;

             current =iv_ruleService_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService_Impl"


    // $ANTLR start "ruleService_Impl"
    // InternalCosaDsl.g:1259:1: ruleService_Impl returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleService_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1265:2: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1266:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1266:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1267:3: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1267:3: ()
            // InternalCosaDsl.g:1268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getService_ImplAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getService_ImplAccess().getServiceKeyword_1());
            		
            // InternalCosaDsl.g:1278:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1279:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1279:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1280:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getService_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService_Impl"


    // $ANTLR start "entryRuleRequiredService"
    // InternalCosaDsl.g:1301:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalCosaDsl.g:1301:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalCosaDsl.g:1302:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalCosaDsl.g:1308:1: ruleRequiredService returns [EObject current=null] : ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1314:2: ( ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1315:2: ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1315:2: ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1316:3: () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1316:3: ()
            // InternalCosaDsl.g:1317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredServiceAccess().getRequiredServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_1());
            		
            // InternalCosaDsl.g:1327:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1328:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1328:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1329:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleProvidedService"
    // InternalCosaDsl.g:1350:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalCosaDsl.g:1350:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalCosaDsl.g:1351:2: iv_ruleProvidedService= ruleProvidedService EOF
            {
             newCompositeNode(grammarAccess.getProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedService=ruleProvidedService();

            state._fsp--;

             current =iv_ruleProvidedService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedService"


    // $ANTLR start "ruleProvidedService"
    // InternalCosaDsl.g:1357:1: ruleProvidedService returns [EObject current=null] : ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1363:2: ( ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1364:2: ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1364:2: ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1365:3: () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1365:3: ()
            // InternalCosaDsl.g:1366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedServiceAccess().getProvidedServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_1());
            		
            // InternalCosaDsl.g:1376:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1377:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1377:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1378:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleRole_Impl"
    // InternalCosaDsl.g:1399:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalCosaDsl.g:1399:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalCosaDsl.g:1400:2: iv_ruleRole_Impl= ruleRole_Impl EOF
            {
             newCompositeNode(grammarAccess.getRole_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole_Impl=ruleRole_Impl();

            state._fsp--;

             current =iv_ruleRole_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole_Impl"


    // $ANTLR start "ruleRole_Impl"
    // InternalCosaDsl.g:1406:1: ruleRole_Impl returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1412:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1413:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1413:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1414:3: () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1414:3: ()
            // InternalCosaDsl.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRole_ImplAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRole_ImplAccess().getRoleKeyword_1());
            		
            // InternalCosaDsl.g:1425:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1426:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1426:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1427:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRole_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole_Impl"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCosaDsl.g:1448:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCosaDsl.g:1448:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCosaDsl.g:1449:2: iv_ruleRequiredRole= ruleRequiredRole EOF
            {
             newCompositeNode(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredRole=ruleRequiredRole();

            state._fsp--;

             current =iv_ruleRequiredRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalCosaDsl.g:1455:1: ruleRequiredRole returns [EObject current=null] : ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1461:2: ( ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1462:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1462:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1463:3: () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1463:3: ()
            // InternalCosaDsl.g:1464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1());
            		
            // InternalCosaDsl.g:1474:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1475:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1475:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1476:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCosaDsl.g:1497:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCosaDsl.g:1497:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCosaDsl.g:1498:2: iv_ruleProvidedRole= ruleProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedRole=ruleProvidedRole();

            state._fsp--;

             current =iv_ruleProvidedRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalCosaDsl.g:1504:1: ruleProvidedRole returns [EObject current=null] : ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1510:2: ( ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1511:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1511:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1512:3: () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1512:3: ()
            // InternalCosaDsl.g:1513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1());
            		
            // InternalCosaDsl.g:1523:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1524:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1524:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1525:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredPort"
    // InternalCosaDsl.g:1546:1: entryRuleRequiredPort returns [EObject current=null] : iv_ruleRequiredPort= ruleRequiredPort EOF ;
    public final EObject entryRuleRequiredPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPort = null;


        try {
            // InternalCosaDsl.g:1546:53: (iv_ruleRequiredPort= ruleRequiredPort EOF )
            // InternalCosaDsl.g:1547:2: iv_ruleRequiredPort= ruleRequiredPort EOF
            {
             newCompositeNode(grammarAccess.getRequiredPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredPort=ruleRequiredPort();

            state._fsp--;

             current =iv_ruleRequiredPort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredPort"


    // $ANTLR start "ruleRequiredPort"
    // InternalCosaDsl.g:1553:1: ruleRequiredPort returns [EObject current=null] : ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRequiredPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1559:2: ( ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1560:2: ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1560:2: ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1561:3: () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1561:3: ()
            // InternalCosaDsl.g:1562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredPortAccess().getRequiredPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredPortAccess().getRequiredPortKeyword_1());
            		
            // InternalCosaDsl.g:1572:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1573:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1573:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1574:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredPortAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredPort"


    // $ANTLR start "entryRuleProvidedPort"
    // InternalCosaDsl.g:1595:1: entryRuleProvidedPort returns [EObject current=null] : iv_ruleProvidedPort= ruleProvidedPort EOF ;
    public final EObject entryRuleProvidedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPort = null;


        try {
            // InternalCosaDsl.g:1595:53: (iv_ruleProvidedPort= ruleProvidedPort EOF )
            // InternalCosaDsl.g:1596:2: iv_ruleProvidedPort= ruleProvidedPort EOF
            {
             newCompositeNode(grammarAccess.getProvidedPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedPort=ruleProvidedPort();

            state._fsp--;

             current =iv_ruleProvidedPort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedPort"


    // $ANTLR start "ruleProvidedPort"
    // InternalCosaDsl.g:1602:1: ruleProvidedPort returns [EObject current=null] : ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProvidedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1608:2: ( ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1609:2: ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1609:2: ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1610:3: () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1610:3: ()
            // InternalCosaDsl.g:1611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedPortAccess().getProvidedPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedPortAccess().getProvidedPortKeyword_1());
            		
            // InternalCosaDsl.g:1621:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1622:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1622:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1623:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedPortAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univnantes.asa.xtext.CosaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedPort"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180082000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000502000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});

}