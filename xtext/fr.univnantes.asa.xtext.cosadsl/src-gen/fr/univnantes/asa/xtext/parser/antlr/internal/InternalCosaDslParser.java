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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CompositeConfiguration'", "'{'", "','", "'}'", "'Component'", "'Connector'", "'glue'", "'Port'", "'Binding'", "'('", "'.'", "')'", "'Attachement'", "'to'", "'Configuration'", "'Service'", "'RequiredService'", "'ProvidedService'", "'Role'", "'RequiredRole'", "'ProvidedRole'", "'Glue'", "'RequiredPort'", "'ProvidedPort'", "'SimpleConfiguration'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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
        	return "Configuration";
       	}

       	@Override
       	protected CosaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfiguration"
    // InternalCosaDsl.g:64:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalCosaDsl.g:64:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalCosaDsl.g:65:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalCosaDsl.g:71:1: ruleConfiguration returns [EObject current=null] : (this_Configuration_Impl_0= ruleConfiguration_Impl | this_SimpleConfiguration_1= ruleSimpleConfiguration | this_CompositeConfiguration_2= ruleCompositeConfiguration ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject this_Configuration_Impl_0 = null;

        EObject this_SimpleConfiguration_1 = null;

        EObject this_CompositeConfiguration_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:77:2: ( (this_Configuration_Impl_0= ruleConfiguration_Impl | this_SimpleConfiguration_1= ruleSimpleConfiguration | this_CompositeConfiguration_2= ruleCompositeConfiguration ) )
            // InternalCosaDsl.g:78:2: (this_Configuration_Impl_0= ruleConfiguration_Impl | this_SimpleConfiguration_1= ruleSimpleConfiguration | this_CompositeConfiguration_2= ruleCompositeConfiguration )
            {
            // InternalCosaDsl.g:78:2: (this_Configuration_Impl_0= ruleConfiguration_Impl | this_SimpleConfiguration_1= ruleSimpleConfiguration | this_CompositeConfiguration_2= ruleCompositeConfiguration )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCosaDsl.g:79:3: this_Configuration_Impl_0= ruleConfiguration_Impl
                    {

                    			newCompositeNode(grammarAccess.getConfigurationAccess().getConfiguration_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Configuration_Impl_0=ruleConfiguration_Impl();

                    state._fsp--;


                    			current = this_Configuration_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:88:3: this_SimpleConfiguration_1= ruleSimpleConfiguration
                    {

                    			newCompositeNode(grammarAccess.getConfigurationAccess().getSimpleConfigurationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleConfiguration_1=ruleSimpleConfiguration();

                    state._fsp--;


                    			current = this_SimpleConfiguration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:97:3: this_CompositeConfiguration_2= ruleCompositeConfiguration
                    {

                    			newCompositeNode(grammarAccess.getConfigurationAccess().getCompositeConfigurationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeConfiguration_2=ruleCompositeConfiguration();

                    state._fsp--;


                    			current = this_CompositeConfiguration_2;
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRulePort"
    // InternalCosaDsl.g:109:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalCosaDsl.g:109:45: (iv_rulePort= rulePort EOF )
            // InternalCosaDsl.g:110:2: iv_rulePort= rulePort EOF
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
    // InternalCosaDsl.g:116:1: rulePort returns [EObject current=null] : (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_Port_Impl_0 = null;

        EObject this_RequiredPort_1 = null;

        EObject this_ProvidedPort_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:122:2: ( (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort ) )
            // InternalCosaDsl.g:123:2: (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort )
            {
            // InternalCosaDsl.g:123:2: (this_Port_Impl_0= rulePort_Impl | this_RequiredPort_1= ruleRequiredPort | this_ProvidedPort_2= ruleProvidedPort )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCosaDsl.g:124:3: this_Port_Impl_0= rulePort_Impl
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
                    // InternalCosaDsl.g:133:3: this_RequiredPort_1= ruleRequiredPort
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
                    // InternalCosaDsl.g:142:3: this_ProvidedPort_2= ruleProvidedPort
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
    // InternalCosaDsl.g:154:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalCosaDsl.g:154:48: (iv_ruleService= ruleService EOF )
            // InternalCosaDsl.g:155:2: iv_ruleService= ruleService EOF
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
    // InternalCosaDsl.g:161:1: ruleService returns [EObject current=null] : (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_Service_Impl_0 = null;

        EObject this_RequiredService_1 = null;

        EObject this_ProvidedService_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:167:2: ( (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService ) )
            // InternalCosaDsl.g:168:2: (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService )
            {
            // InternalCosaDsl.g:168:2: (this_Service_Impl_0= ruleService_Impl | this_RequiredService_1= ruleRequiredService | this_ProvidedService_2= ruleProvidedService )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCosaDsl.g:169:3: this_Service_Impl_0= ruleService_Impl
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
                    // InternalCosaDsl.g:178:3: this_RequiredService_1= ruleRequiredService
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
                    // InternalCosaDsl.g:187:3: this_ProvidedService_2= ruleProvidedService
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
    // InternalCosaDsl.g:199:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalCosaDsl.g:199:45: (iv_ruleRole= ruleRole EOF )
            // InternalCosaDsl.g:200:2: iv_ruleRole= ruleRole EOF
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
    // InternalCosaDsl.g:206:1: ruleRole returns [EObject current=null] : (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_Role_Impl_0 = null;

        EObject this_RequiredRole_1 = null;

        EObject this_ProvidedRole_2 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:212:2: ( (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole ) )
            // InternalCosaDsl.g:213:2: (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole )
            {
            // InternalCosaDsl.g:213:2: (this_Role_Impl_0= ruleRole_Impl | this_RequiredRole_1= ruleRequiredRole | this_ProvidedRole_2= ruleProvidedRole )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCosaDsl.g:214:3: this_Role_Impl_0= ruleRole_Impl
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
                    // InternalCosaDsl.g:223:3: this_RequiredRole_1= ruleRequiredRole
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
                    // InternalCosaDsl.g:232:3: this_ProvidedRole_2= ruleProvidedRole
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


    // $ANTLR start "entryRuleCompositeConfiguration"
    // InternalCosaDsl.g:244:1: entryRuleCompositeConfiguration returns [EObject current=null] : iv_ruleCompositeConfiguration= ruleCompositeConfiguration EOF ;
    public final EObject entryRuleCompositeConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeConfiguration = null;


        try {
            // InternalCosaDsl.g:244:63: (iv_ruleCompositeConfiguration= ruleCompositeConfiguration EOF )
            // InternalCosaDsl.g:245:2: iv_ruleCompositeConfiguration= ruleCompositeConfiguration EOF
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
    // InternalCosaDsl.g:251:1: ruleCompositeConfiguration returns [EObject current=null] : (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ) ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' ) ;
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
            // InternalCosaDsl.g:257:2: ( (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ) ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' ) )
            // InternalCosaDsl.g:258:2: (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ) ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' )
            {
            // InternalCosaDsl.g:258:2: (otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ) ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}' )
            // InternalCosaDsl.g:259:3: otherlv_0= 'CompositeConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ) ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* ( ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* )* ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )* otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeConfigurationAccess().getCompositeConfigurationKeyword_0());
            		
            // InternalCosaDsl.g:263:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:264:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:264:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:265:5: lv_name_1_0= ruleEString
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

            			newLeafNode(otherlv_2, grammarAccess.getCompositeConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:286:3: ( ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* )
            // InternalCosaDsl.g:287:4: ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )*
            {
            // InternalCosaDsl.g:287:4: ( (lv_components_3_0= ruleComponent ) )
            // InternalCosaDsl.g:288:5: (lv_components_3_0= ruleComponent )
            {
            // InternalCosaDsl.g:288:5: (lv_components_3_0= ruleComponent )
            // InternalCosaDsl.g:289:6: lv_components_3_0= ruleComponent
            {

            						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0_0());
            					
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

            // InternalCosaDsl.g:306:4: (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCosaDsl.g:307:5: otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalCosaDsl.g:311:5: ( (lv_components_5_0= ruleComponent ) )
            	    // InternalCosaDsl.g:312:6: (lv_components_5_0= ruleComponent )
            	    {
            	    // InternalCosaDsl.g:312:6: (lv_components_5_0= ruleComponent )
            	    // InternalCosaDsl.g:313:7: lv_components_5_0= ruleComponent
            	    {

            	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_1_1_0());
            	    						
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
            	    break loop5;
                }
            } while (true);


            }

            // InternalCosaDsl.g:332:3: ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCosaDsl.g:333:4: ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            	    {
            	    // InternalCosaDsl.g:333:4: ( (lv_connectors_6_0= ruleConnector ) )
            	    // InternalCosaDsl.g:334:5: (lv_connectors_6_0= ruleConnector )
            	    {
            	    // InternalCosaDsl.g:334:5: (lv_connectors_6_0= ruleConnector )
            	    // InternalCosaDsl.g:335:6: lv_connectors_6_0= ruleConnector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    // InternalCosaDsl.g:352:4: (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==13) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:353:5: otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:357:5: ( (lv_connectors_8_0= ruleConnector ) )
            	    	    // InternalCosaDsl.g:358:6: (lv_connectors_8_0= ruleConnector )
            	    	    {
            	    	    // InternalCosaDsl.g:358:6: (lv_connectors_8_0= ruleConnector )
            	    	    // InternalCosaDsl.g:359:7: lv_connectors_8_0= ruleConnector
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_4_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_6);
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
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalCosaDsl.g:378:3: ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||(LA9_0>=33 && LA9_0<=34)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCosaDsl.g:379:4: ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            	    {
            	    // InternalCosaDsl.g:379:4: ( (lv_ports_9_0= rulePort ) )
            	    // InternalCosaDsl.g:380:5: (lv_ports_9_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:380:5: (lv_ports_9_0= rulePort )
            	    // InternalCosaDsl.g:381:6: lv_ports_9_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_5_0_0());
            	    					
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

            	    // InternalCosaDsl.g:398:4: (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==13) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:399:5: otherlv_10= ',' ( (lv_ports_11_0= rulePort ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,13,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_10, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:403:5: ( (lv_ports_11_0= rulePort ) )
            	    	    // InternalCosaDsl.g:404:6: (lv_ports_11_0= rulePort )
            	    	    {
            	    	    // InternalCosaDsl.g:404:6: (lv_ports_11_0= rulePort )
            	    	    // InternalCosaDsl.g:405:7: lv_ports_11_0= rulePort
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_5_1_1_0());
            	    	    						
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
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCosaDsl.g:424:3: ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCosaDsl.g:425:4: ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    {
            	    // InternalCosaDsl.g:425:4: ( (lv_bindings_12_0= ruleBinding ) )
            	    // InternalCosaDsl.g:426:5: (lv_bindings_12_0= ruleBinding )
            	    {
            	    // InternalCosaDsl.g:426:5: (lv_bindings_12_0= ruleBinding )
            	    // InternalCosaDsl.g:427:6: lv_bindings_12_0= ruleBinding
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalCosaDsl.g:444:4: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==13) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:445:5: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:449:5: ( (lv_bindings_14_0= ruleBinding ) )
            	    	    // InternalCosaDsl.g:450:6: (lv_bindings_14_0= ruleBinding )
            	    	    {
            	    	    // InternalCosaDsl.g:450:6: (lv_bindings_14_0= ruleBinding )
            	    	    // InternalCosaDsl.g:451:7: lv_bindings_14_0= ruleBinding
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_10);
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
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalCosaDsl.g:470:3: ( ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCosaDsl.g:471:4: ( (lv_attachements_15_0= ruleAttachement ) ) (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )*
            	    {
            	    // InternalCosaDsl.g:471:4: ( (lv_attachements_15_0= ruleAttachement ) )
            	    // InternalCosaDsl.g:472:5: (lv_attachements_15_0= ruleAttachement )
            	    {
            	    // InternalCosaDsl.g:472:5: (lv_attachements_15_0= ruleAttachement )
            	    // InternalCosaDsl.g:473:6: lv_attachements_15_0= ruleAttachement
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
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

            	    // InternalCosaDsl.g:490:4: (otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==13) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:491:5: otherlv_16= ',' ( (lv_attachements_17_0= ruleAttachement ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,13,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_16, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_7_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:495:5: ( (lv_attachements_17_0= ruleAttachement ) )
            	    	    // InternalCosaDsl.g:496:6: (lv_attachements_17_0= ruleAttachement )
            	    	    {
            	    	    // InternalCosaDsl.g:496:6: (lv_attachements_17_0= ruleAttachement )
            	    	    // InternalCosaDsl.g:497:7: lv_attachements_17_0= ruleAttachement
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_7_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_12);
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
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalCosaDsl.g:516:3: ( ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )* )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||LA15_0==25||LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCosaDsl.g:517:4: ( (lv_configurations_18_0= ruleConfiguration ) ) (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )*
            	    {
            	    // InternalCosaDsl.g:517:4: ( (lv_configurations_18_0= ruleConfiguration ) )
            	    // InternalCosaDsl.g:518:5: (lv_configurations_18_0= ruleConfiguration )
            	    {
            	    // InternalCosaDsl.g:518:5: (lv_configurations_18_0= ruleConfiguration )
            	    // InternalCosaDsl.g:519:6: lv_configurations_18_0= ruleConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
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

            	    // InternalCosaDsl.g:536:4: (otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==13) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:537:5: otherlv_19= ',' ( (lv_configurations_20_0= ruleConfiguration ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,13,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:541:5: ( (lv_configurations_20_0= ruleConfiguration ) )
            	    	    // InternalCosaDsl.g:542:6: (lv_configurations_20_0= ruleConfiguration )
            	    	    {
            	    	    // InternalCosaDsl.g:542:6: (lv_configurations_20_0= ruleConfiguration )
            	    	    // InternalCosaDsl.g:543:7: lv_configurations_20_0= ruleConfiguration
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_8_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
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
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalCosaDsl.g:570:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCosaDsl.g:570:47: (iv_ruleEString= ruleEString EOF )
            // InternalCosaDsl.g:571:2: iv_ruleEString= ruleEString EOF
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
    // InternalCosaDsl.g:577:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCosaDsl.g:583:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCosaDsl.g:584:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCosaDsl.g:584:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCosaDsl.g:585:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:593:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleComponent"
    // InternalCosaDsl.g:604:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCosaDsl.g:604:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCosaDsl.g:605:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalCosaDsl.g:611:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' ) ;
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
            // InternalCosaDsl.g:617:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' ) )
            // InternalCosaDsl.g:618:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )
            {
            // InternalCosaDsl.g:618:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}' )
            // InternalCosaDsl.g:619:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* ( (lv_services_6_0= ruleService ) ) (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalCosaDsl.g:623:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:624:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:624:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:625:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:646:3: ( (lv_ports_3_0= rulePort ) )
            // InternalCosaDsl.g:647:4: (lv_ports_3_0= rulePort )
            {
            // InternalCosaDsl.g:647:4: (lv_ports_3_0= rulePort )
            // InternalCosaDsl.g:648:5: lv_ports_3_0= rulePort
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalCosaDsl.g:665:3: (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCosaDsl.g:666:4: otherlv_4= ',' ( (lv_ports_5_0= rulePort ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:670:4: ( (lv_ports_5_0= rulePort ) )
            	    // InternalCosaDsl.g:671:5: (lv_ports_5_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:671:5: (lv_ports_5_0= rulePort )
            	    // InternalCosaDsl.g:672:6: lv_ports_5_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop17;
                }
            } while (true);

            // InternalCosaDsl.g:690:3: ( (lv_services_6_0= ruleService ) )
            // InternalCosaDsl.g:691:4: (lv_services_6_0= ruleService )
            {
            // InternalCosaDsl.g:691:4: (lv_services_6_0= ruleService )
            // InternalCosaDsl.g:692:5: lv_services_6_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalCosaDsl.g:709:3: (otherlv_7= ',' ( (lv_services_8_0= ruleService ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCosaDsl.g:710:4: otherlv_7= ',' ( (lv_services_8_0= ruleService ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCosaDsl.g:714:4: ( (lv_services_8_0= ruleService ) )
            	    // InternalCosaDsl.g:715:5: (lv_services_8_0= ruleService )
            	    {
            	    // InternalCosaDsl.g:715:5: (lv_services_8_0= ruleService )
            	    // InternalCosaDsl.g:716:6: lv_services_8_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop18;
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
    // InternalCosaDsl.g:742:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCosaDsl.g:742:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCosaDsl.g:743:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCosaDsl.g:749:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* (otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_roles_3_0 = null;

        EObject lv_roles_5_0 = null;

        EObject lv_glue_7_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:755:2: ( (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* (otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) ) )? otherlv_8= '}' ) )
            // InternalCosaDsl.g:756:2: (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* (otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) ) )? otherlv_8= '}' )
            {
            // InternalCosaDsl.g:756:2: (otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* (otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) ) )? otherlv_8= '}' )
            // InternalCosaDsl.g:757:3: otherlv_0= 'Connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* (otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            // InternalCosaDsl.g:761:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:762:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:762:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:763:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:784:3: ( (lv_roles_3_0= ruleRole ) )
            // InternalCosaDsl.g:785:4: (lv_roles_3_0= ruleRole )
            {
            // InternalCosaDsl.g:785:4: (lv_roles_3_0= ruleRole )
            // InternalCosaDsl.g:786:5: lv_roles_3_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_roles_3_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:803:3: (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCosaDsl.g:804:4: otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:808:4: ( (lv_roles_5_0= ruleRole ) )
            	    // InternalCosaDsl.g:809:5: (lv_roles_5_0= ruleRole )
            	    {
            	    // InternalCosaDsl.g:809:5: (lv_roles_5_0= ruleRole )
            	    // InternalCosaDsl.g:810:6: lv_roles_5_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_roles_5_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_5_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalCosaDsl.g:828:3: (otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCosaDsl.g:829:4: otherlv_6= 'glue' ( (lv_glue_7_0= ruleGlue ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getGlueKeyword_5_0());
                    			
                    // InternalCosaDsl.g:833:4: ( (lv_glue_7_0= ruleGlue ) )
                    // InternalCosaDsl.g:834:5: (lv_glue_7_0= ruleGlue )
                    {
                    // InternalCosaDsl.g:834:5: (lv_glue_7_0= ruleGlue )
                    // InternalCosaDsl.g:835:6: lv_glue_7_0= ruleGlue
                    {

                    						newCompositeNode(grammarAccess.getConnectorAccess().getGlueGlueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_glue_7_0=ruleGlue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorRule());
                    						}
                    						set(
                    							current,
                    							"glue",
                    							lv_glue_7_0,
                    							"fr.univnantes.asa.xtext.CosaDsl.Glue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRulePort_Impl"
    // InternalCosaDsl.g:861:1: entryRulePort_Impl returns [EObject current=null] : iv_rulePort_Impl= rulePort_Impl EOF ;
    public final EObject entryRulePort_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort_Impl = null;


        try {
            // InternalCosaDsl.g:861:50: (iv_rulePort_Impl= rulePort_Impl EOF )
            // InternalCosaDsl.g:862:2: iv_rulePort_Impl= rulePort_Impl EOF
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
    // InternalCosaDsl.g:868:1: rulePort_Impl returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePort_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:874:2: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:875:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:875:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:876:3: () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:876:3: ()
            // InternalCosaDsl.g:877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPort_ImplAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPort_ImplAccess().getPortKeyword_1());
            		
            // InternalCosaDsl.g:887:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:888:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:888:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:889:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:910:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalCosaDsl.g:910:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalCosaDsl.g:911:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalCosaDsl.g:917:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'Binding' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalCosaDsl.g:923:2: ( (otherlv_0= 'Binding' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalCosaDsl.g:924:2: (otherlv_0= 'Binding' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalCosaDsl.g:924:2: (otherlv_0= 'Binding' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalCosaDsl.g:925:3: otherlv_0= 'Binding' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindingKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCosaDsl.g:933:3: ( (otherlv_2= RULE_ID ) )
            // InternalCosaDsl.g:934:4: (otherlv_2= RULE_ID )
            {
            // InternalCosaDsl.g:934:4: (otherlv_2= RULE_ID )
            // InternalCosaDsl.g:935:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getConfigurationProviderConfigurationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getFullStopKeyword_3());
            		
            // InternalCosaDsl.g:950:3: ( (otherlv_4= RULE_ID ) )
            // InternalCosaDsl.g:951:4: (otherlv_4= RULE_ID )
            {
            // InternalCosaDsl.g:951:4: (otherlv_4= RULE_ID )
            // InternalCosaDsl.g:952:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getPortProvidedPortCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getCommaKeyword_5());
            		
            // InternalCosaDsl.g:967:3: ( (otherlv_6= RULE_ID ) )
            // InternalCosaDsl.g:968:4: (otherlv_6= RULE_ID )
            {
            // InternalCosaDsl.g:968:4: (otherlv_6= RULE_ID )
            // InternalCosaDsl.g:969:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getComponentSubscriberComponentCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getBindingAccess().getFullStopKeyword_7());
            		
            // InternalCosaDsl.g:984:3: ( (otherlv_8= RULE_ID ) )
            // InternalCosaDsl.g:985:4: (otherlv_8= RULE_ID )
            {
            // InternalCosaDsl.g:985:4: (otherlv_8= RULE_ID )
            // InternalCosaDsl.g:986:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_8, grammarAccess.getBindingAccess().getPortRequiredPortCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBindingAccess().getRightParenthesisKeyword_9());
            		

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
    // InternalCosaDsl.g:1005:1: entryRuleAttachement returns [EObject current=null] : iv_ruleAttachement= ruleAttachement EOF ;
    public final EObject entryRuleAttachement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachement = null;


        try {
            // InternalCosaDsl.g:1005:52: (iv_ruleAttachement= ruleAttachement EOF )
            // InternalCosaDsl.g:1006:2: iv_ruleAttachement= ruleAttachement EOF
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
    // InternalCosaDsl.g:1012:1: ruleAttachement returns [EObject current=null] : (otherlv_0= 'Attachement' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleAttachement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalCosaDsl.g:1018:2: ( (otherlv_0= 'Attachement' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalCosaDsl.g:1019:2: (otherlv_0= 'Attachement' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalCosaDsl.g:1019:2: (otherlv_0= 'Attachement' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalCosaDsl.g:1020:3: otherlv_0= 'Attachement' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttachementAccess().getAttachementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAttachementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCosaDsl.g:1028:3: ( (otherlv_2= RULE_ID ) )
            // InternalCosaDsl.g:1029:4: (otherlv_2= RULE_ID )
            {
            // InternalCosaDsl.g:1029:4: (otherlv_2= RULE_ID )
            // InternalCosaDsl.g:1030:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttachementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getAttachementAccess().getComponentComponentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAttachementAccess().getFullStopKeyword_3());
            		
            // InternalCosaDsl.g:1045:3: ( (otherlv_4= RULE_ID ) )
            // InternalCosaDsl.g:1046:4: (otherlv_4= RULE_ID )
            {
            // InternalCosaDsl.g:1046:4: (otherlv_4= RULE_ID )
            // InternalCosaDsl.g:1047:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttachementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_4, grammarAccess.getAttachementAccess().getPortPortCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getAttachementAccess().getToKeyword_5());
            		
            // InternalCosaDsl.g:1062:3: ( (otherlv_6= RULE_ID ) )
            // InternalCosaDsl.g:1063:4: (otherlv_6= RULE_ID )
            {
            // InternalCosaDsl.g:1063:4: (otherlv_6= RULE_ID )
            // InternalCosaDsl.g:1064:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttachementRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_6, grammarAccess.getAttachementAccess().getConnectorConnectorCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getAttachementAccess().getFullStopKeyword_7());
            		
            // InternalCosaDsl.g:1079:3: ( (otherlv_8= RULE_ID ) )
            // InternalCosaDsl.g:1080:4: (otherlv_8= RULE_ID )
            {
            // InternalCosaDsl.g:1080:4: (otherlv_8= RULE_ID )
            // InternalCosaDsl.g:1081:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttachementRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_8, grammarAccess.getAttachementAccess().getRoleRoleCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleConfiguration_Impl"
    // InternalCosaDsl.g:1100:1: entryRuleConfiguration_Impl returns [EObject current=null] : iv_ruleConfiguration_Impl= ruleConfiguration_Impl EOF ;
    public final EObject entryRuleConfiguration_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration_Impl = null;


        try {
            // InternalCosaDsl.g:1100:59: (iv_ruleConfiguration_Impl= ruleConfiguration_Impl EOF )
            // InternalCosaDsl.g:1101:2: iv_ruleConfiguration_Impl= ruleConfiguration_Impl EOF
            {
             newCompositeNode(grammarAccess.getConfiguration_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration_Impl=ruleConfiguration_Impl();

            state._fsp--;

             current =iv_ruleConfiguration_Impl; 
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
    // $ANTLR end "entryRuleConfiguration_Impl"


    // $ANTLR start "ruleConfiguration_Impl"
    // InternalCosaDsl.g:1107:1: ruleConfiguration_Impl returns [EObject current=null] : (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ) ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' ) ;
    public final EObject ruleConfiguration_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_connectors_6_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_ports_9_0 = null;

        EObject lv_ports_11_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1113:2: ( (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ) ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' ) )
            // InternalCosaDsl.g:1114:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ) ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' )
            {
            // InternalCosaDsl.g:1114:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ) ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' )
            // InternalCosaDsl.g:1115:3: otherlv_0= 'Configuration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* ) ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfiguration_ImplAccess().getConfigurationKeyword_0());
            		
            // InternalCosaDsl.g:1119:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:1120:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:1120:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:1121:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getConfiguration_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:1142:3: ( (lv_components_3_0= ruleComponent ) )
            // InternalCosaDsl.g:1143:4: (lv_components_3_0= ruleComponent )
            {
            // InternalCosaDsl.g:1143:4: (lv_components_3_0= ruleComponent )
            // InternalCosaDsl.g:1144:5: lv_components_3_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getComponentsComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_components_3_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:1161:3: (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCosaDsl.g:1162:4: otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:1166:4: ( (lv_components_5_0= ruleComponent ) )
            	    // InternalCosaDsl.g:1167:5: (lv_components_5_0= ruleComponent )
            	    {
            	    // InternalCosaDsl.g:1167:5: (lv_components_5_0= ruleComponent )
            	    // InternalCosaDsl.g:1168:6: lv_components_5_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getComponentsComponentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
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
            	    break loop21;
                }
            } while (true);

            // InternalCosaDsl.g:1186:3: ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )
            // InternalCosaDsl.g:1187:4: ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            {
            // InternalCosaDsl.g:1187:4: ( (lv_connectors_6_0= ruleConnector ) )
            // InternalCosaDsl.g:1188:5: (lv_connectors_6_0= ruleConnector )
            {
            // InternalCosaDsl.g:1188:5: (lv_connectors_6_0= ruleConnector )
            // InternalCosaDsl.g:1189:6: lv_connectors_6_0= ruleConnector
            {

            						newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getConnectorsConnectorParserRuleCall_5_0_0());
            					
            pushFollow(FOLLOW_29);
            lv_connectors_6_0=ruleConnector();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
            						}
            						add(
            							current,
            							"connectors",
            							lv_connectors_6_0,
            							"fr.univnantes.asa.xtext.CosaDsl.Connector");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCosaDsl.g:1206:4: (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCosaDsl.g:1207:5: otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

            	    					newLeafNode(otherlv_7, grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_5_1_0());
            	    				
            	    // InternalCosaDsl.g:1211:5: ( (lv_connectors_8_0= ruleConnector ) )
            	    // InternalCosaDsl.g:1212:6: (lv_connectors_8_0= ruleConnector )
            	    {
            	    // InternalCosaDsl.g:1212:6: (lv_connectors_8_0= ruleConnector )
            	    // InternalCosaDsl.g:1213:7: lv_connectors_8_0= ruleConnector
            	    {

            	    							newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getConnectorsConnectorParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_29);
            	    lv_connectors_8_0=ruleConnector();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
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
            	    break loop22;
                }
            } while (true);


            }

            // InternalCosaDsl.g:1232:3: ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18||(LA24_0>=33 && LA24_0<=34)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCosaDsl.g:1233:4: ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            	    {
            	    // InternalCosaDsl.g:1233:4: ( (lv_ports_9_0= rulePort ) )
            	    // InternalCosaDsl.g:1234:5: (lv_ports_9_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:1234:5: (lv_ports_9_0= rulePort )
            	    // InternalCosaDsl.g:1235:6: lv_ports_9_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getPortsPortParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_ports_9_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_9_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:1252:4: (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==13) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:1253:5: otherlv_10= ',' ( (lv_ports_11_0= rulePort ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,13,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_10, grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:1257:5: ( (lv_ports_11_0= rulePort ) )
            	    	    // InternalCosaDsl.g:1258:6: (lv_ports_11_0= rulePort )
            	    	    {
            	    	    // InternalCosaDsl.g:1258:6: (lv_ports_11_0= rulePort )
            	    	    // InternalCosaDsl.g:1259:7: lv_ports_11_0= rulePort
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getPortsPortParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_ports_11_0=rulePort();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
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
            	    	    break loop23;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalCosaDsl.g:1278:3: ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCosaDsl.g:1279:4: ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    {
            	    // InternalCosaDsl.g:1279:4: ( (lv_bindings_12_0= ruleBinding ) )
            	    // InternalCosaDsl.g:1280:5: (lv_bindings_12_0= ruleBinding )
            	    {
            	    // InternalCosaDsl.g:1280:5: (lv_bindings_12_0= ruleBinding )
            	    // InternalCosaDsl.g:1281:6: lv_bindings_12_0= ruleBinding
            	    {

            	    						newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getBindingsBindingParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_bindings_12_0=ruleBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bindings",
            	    							lv_bindings_12_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Binding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:1298:4: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==13) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:1299:5: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_13, grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_7_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:1303:5: ( (lv_bindings_14_0= ruleBinding ) )
            	    	    // InternalCosaDsl.g:1304:6: (lv_bindings_14_0= ruleBinding )
            	    	    {
            	    	    // InternalCosaDsl.g:1304:6: (lv_bindings_14_0= ruleBinding )
            	    	    // InternalCosaDsl.g:1305:7: lv_bindings_14_0= ruleBinding
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getConfiguration_ImplAccess().getBindingsBindingParserRuleCall_7_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_bindings_14_0=ruleBinding();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getConfiguration_ImplRule());
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
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getConfiguration_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConfiguration_Impl"


    // $ANTLR start "entryRuleService_Impl"
    // InternalCosaDsl.g:1332:1: entryRuleService_Impl returns [EObject current=null] : iv_ruleService_Impl= ruleService_Impl EOF ;
    public final EObject entryRuleService_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService_Impl = null;


        try {
            // InternalCosaDsl.g:1332:53: (iv_ruleService_Impl= ruleService_Impl EOF )
            // InternalCosaDsl.g:1333:2: iv_ruleService_Impl= ruleService_Impl EOF
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
    // InternalCosaDsl.g:1339:1: ruleService_Impl returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleService_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1345:2: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1346:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1346:2: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1347:3: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1347:3: ()
            // InternalCosaDsl.g:1348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getService_ImplAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getService_ImplAccess().getServiceKeyword_1());
            		
            // InternalCosaDsl.g:1358:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1359:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1359:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1360:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:1381:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalCosaDsl.g:1381:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalCosaDsl.g:1382:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalCosaDsl.g:1388:1: ruleRequiredService returns [EObject current=null] : ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1394:2: ( ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1395:2: ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1395:2: ( () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1396:3: () otherlv_1= 'RequiredService' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1396:3: ()
            // InternalCosaDsl.g:1397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredServiceAccess().getRequiredServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_1());
            		
            // InternalCosaDsl.g:1407:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1408:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1408:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1409:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:1430:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalCosaDsl.g:1430:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalCosaDsl.g:1431:2: iv_ruleProvidedService= ruleProvidedService EOF
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
    // InternalCosaDsl.g:1437:1: ruleProvidedService returns [EObject current=null] : ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1443:2: ( ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1444:2: ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1444:2: ( () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1445:3: () otherlv_1= 'ProvidedService' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1445:3: ()
            // InternalCosaDsl.g:1446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedServiceAccess().getProvidedServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_1());
            		
            // InternalCosaDsl.g:1456:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1457:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1457:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1458:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:1479:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalCosaDsl.g:1479:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalCosaDsl.g:1480:2: iv_ruleRole_Impl= ruleRole_Impl EOF
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
    // InternalCosaDsl.g:1486:1: ruleRole_Impl returns [EObject current=null] : ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1492:2: ( ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1493:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1493:2: ( () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1494:3: () otherlv_1= 'Role' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1494:3: ()
            // InternalCosaDsl.g:1495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRole_ImplAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRole_ImplAccess().getRoleKeyword_1());
            		
            // InternalCosaDsl.g:1505:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1506:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1506:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1507:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:1528:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCosaDsl.g:1528:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCosaDsl.g:1529:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalCosaDsl.g:1535:1: ruleRequiredRole returns [EObject current=null] : ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1541:2: ( ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1542:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1542:2: ( () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1543:3: () otherlv_1= 'RequiredRole' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1543:3: ()
            // InternalCosaDsl.g:1544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1());
            		
            // InternalCosaDsl.g:1554:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1555:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1555:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1556:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:1577:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCosaDsl.g:1577:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCosaDsl.g:1578:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalCosaDsl.g:1584:1: ruleProvidedRole returns [EObject current=null] : ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1590:2: ( ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1591:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1591:2: ( () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1592:3: () otherlv_1= 'ProvidedRole' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1592:3: ()
            // InternalCosaDsl.g:1593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1());
            		
            // InternalCosaDsl.g:1603:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1604:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1604:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1605:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleGlue"
    // InternalCosaDsl.g:1626:1: entryRuleGlue returns [EObject current=null] : iv_ruleGlue= ruleGlue EOF ;
    public final EObject entryRuleGlue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlue = null;


        try {
            // InternalCosaDsl.g:1626:45: (iv_ruleGlue= ruleGlue EOF )
            // InternalCosaDsl.g:1627:2: iv_ruleGlue= ruleGlue EOF
            {
             newCompositeNode(grammarAccess.getGlueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlue=ruleGlue();

            state._fsp--;

             current =iv_ruleGlue; 
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
    // $ANTLR end "entryRuleGlue"


    // $ANTLR start "ruleGlue"
    // InternalCosaDsl.g:1633:1: ruleGlue returns [EObject current=null] : ( () otherlv_1= 'Glue' ) ;
    public final EObject ruleGlue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCosaDsl.g:1639:2: ( ( () otherlv_1= 'Glue' ) )
            // InternalCosaDsl.g:1640:2: ( () otherlv_1= 'Glue' )
            {
            // InternalCosaDsl.g:1640:2: ( () otherlv_1= 'Glue' )
            // InternalCosaDsl.g:1641:3: () otherlv_1= 'Glue'
            {
            // InternalCosaDsl.g:1641:3: ()
            // InternalCosaDsl.g:1642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlueAccess().getGlueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGlueAccess().getGlueKeyword_1());
            		

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
    // $ANTLR end "ruleGlue"


    // $ANTLR start "entryRuleRequiredPort"
    // InternalCosaDsl.g:1656:1: entryRuleRequiredPort returns [EObject current=null] : iv_ruleRequiredPort= ruleRequiredPort EOF ;
    public final EObject entryRuleRequiredPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPort = null;


        try {
            // InternalCosaDsl.g:1656:53: (iv_ruleRequiredPort= ruleRequiredPort EOF )
            // InternalCosaDsl.g:1657:2: iv_ruleRequiredPort= ruleRequiredPort EOF
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
    // InternalCosaDsl.g:1663:1: ruleRequiredPort returns [EObject current=null] : ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRequiredPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1669:2: ( ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1670:2: ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1670:2: ( () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1671:3: () otherlv_1= 'RequiredPort' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1671:3: ()
            // InternalCosaDsl.g:1672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredPortAccess().getRequiredPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredPortAccess().getRequiredPortKeyword_1());
            		
            // InternalCosaDsl.g:1682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1683:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1683:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1684:5: lv_name_2_0= ruleEString
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
    // InternalCosaDsl.g:1705:1: entryRuleProvidedPort returns [EObject current=null] : iv_ruleProvidedPort= ruleProvidedPort EOF ;
    public final EObject entryRuleProvidedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPort = null;


        try {
            // InternalCosaDsl.g:1705:53: (iv_ruleProvidedPort= ruleProvidedPort EOF )
            // InternalCosaDsl.g:1706:2: iv_ruleProvidedPort= ruleProvidedPort EOF
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
    // InternalCosaDsl.g:1712:1: ruleProvidedPort returns [EObject current=null] : ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProvidedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1718:2: ( ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCosaDsl.g:1719:2: ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCosaDsl.g:1719:2: ( () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCosaDsl.g:1720:3: () otherlv_1= 'ProvidedPort' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCosaDsl.g:1720:3: ()
            // InternalCosaDsl.g:1721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedPortAccess().getProvidedPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedPortAccess().getProvidedPortKeyword_1());
            		
            // InternalCosaDsl.g:1731:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCosaDsl.g:1732:4: (lv_name_2_0= ruleEString )
            {
            // InternalCosaDsl.g:1732:4: (lv_name_2_0= ruleEString )
            // InternalCosaDsl.g:1733:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleSimpleConfiguration"
    // InternalCosaDsl.g:1754:1: entryRuleSimpleConfiguration returns [EObject current=null] : iv_ruleSimpleConfiguration= ruleSimpleConfiguration EOF ;
    public final EObject entryRuleSimpleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleConfiguration = null;


        try {
            // InternalCosaDsl.g:1754:60: (iv_ruleSimpleConfiguration= ruleSimpleConfiguration EOF )
            // InternalCosaDsl.g:1755:2: iv_ruleSimpleConfiguration= ruleSimpleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getSimpleConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleConfiguration=ruleSimpleConfiguration();

            state._fsp--;

             current =iv_ruleSimpleConfiguration; 
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
    // $ANTLR end "entryRuleSimpleConfiguration"


    // $ANTLR start "ruleSimpleConfiguration"
    // InternalCosaDsl.g:1761:1: ruleSimpleConfiguration returns [EObject current=null] : (otherlv_0= 'SimpleConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' ) ;
    public final EObject ruleSimpleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_components_3_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_connectors_6_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_ports_9_0 = null;

        EObject lv_ports_11_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;



        	enterRule();

        try {
            // InternalCosaDsl.g:1767:2: ( (otherlv_0= 'SimpleConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' ) )
            // InternalCosaDsl.g:1768:2: (otherlv_0= 'SimpleConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' )
            {
            // InternalCosaDsl.g:1768:2: (otherlv_0= 'SimpleConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}' )
            // InternalCosaDsl.g:1769:3: otherlv_0= 'SimpleConfiguration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )* ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )* ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )* ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleConfigurationAccess().getSimpleConfigurationKeyword_0());
            		
            // InternalCosaDsl.g:1773:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCosaDsl.g:1774:4: (lv_name_1_0= ruleEString )
            {
            // InternalCosaDsl.g:1774:4: (lv_name_1_0= ruleEString )
            // InternalCosaDsl.g:1775:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getSimpleConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCosaDsl.g:1796:3: ( (lv_components_3_0= ruleComponent ) )
            // InternalCosaDsl.g:1797:4: (lv_components_3_0= ruleComponent )
            {
            // InternalCosaDsl.g:1797:4: (lv_components_3_0= ruleComponent )
            // InternalCosaDsl.g:1798:5: lv_components_3_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getComponentsComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_components_3_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_3_0,
            						"fr.univnantes.asa.xtext.CosaDsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCosaDsl.g:1815:3: (otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCosaDsl.g:1816:4: otherlv_4= ',' ( (lv_components_5_0= ruleComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCosaDsl.g:1820:4: ( (lv_components_5_0= ruleComponent ) )
            	    // InternalCosaDsl.g:1821:5: (lv_components_5_0= ruleComponent )
            	    {
            	    // InternalCosaDsl.g:1821:5: (lv_components_5_0= ruleComponent )
            	    // InternalCosaDsl.g:1822:6: lv_components_5_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
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
            	    break loop27;
                }
            } while (true);

            // InternalCosaDsl.g:1840:3: ( ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )* )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCosaDsl.g:1841:4: ( (lv_connectors_6_0= ruleConnector ) ) (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            	    {
            	    // InternalCosaDsl.g:1841:4: ( (lv_connectors_6_0= ruleConnector ) )
            	    // InternalCosaDsl.g:1842:5: (lv_connectors_6_0= ruleConnector )
            	    {
            	    // InternalCosaDsl.g:1842:5: (lv_connectors_6_0= ruleConnector )
            	    // InternalCosaDsl.g:1843:6: lv_connectors_6_0= ruleConnector
            	    {

            	    						newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_connectors_6_0=ruleConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectors",
            	    							lv_connectors_6_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Connector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:1860:4: (otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==13) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:1861:5: otherlv_7= ',' ( (lv_connectors_8_0= ruleConnector ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:1865:5: ( (lv_connectors_8_0= ruleConnector ) )
            	    	    // InternalCosaDsl.g:1866:6: (lv_connectors_8_0= ruleConnector )
            	    	    {
            	    	    // InternalCosaDsl.g:1866:6: (lv_connectors_8_0= ruleConnector )
            	    	    // InternalCosaDsl.g:1867:7: lv_connectors_8_0= ruleConnector
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getConnectorsConnectorParserRuleCall_5_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_connectors_8_0=ruleConnector();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
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
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalCosaDsl.g:1886:3: ( ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )* )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18||(LA31_0>=33 && LA31_0<=34)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCosaDsl.g:1887:4: ( (lv_ports_9_0= rulePort ) ) (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            	    {
            	    // InternalCosaDsl.g:1887:4: ( (lv_ports_9_0= rulePort ) )
            	    // InternalCosaDsl.g:1888:5: (lv_ports_9_0= rulePort )
            	    {
            	    // InternalCosaDsl.g:1888:5: (lv_ports_9_0= rulePort )
            	    // InternalCosaDsl.g:1889:6: lv_ports_9_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getPortsPortParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_ports_9_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_9_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:1906:4: (otherlv_10= ',' ( (lv_ports_11_0= rulePort ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==13) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:1907:5: otherlv_10= ',' ( (lv_ports_11_0= rulePort ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,13,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_10, grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:1911:5: ( (lv_ports_11_0= rulePort ) )
            	    	    // InternalCosaDsl.g:1912:6: (lv_ports_11_0= rulePort )
            	    	    {
            	    	    // InternalCosaDsl.g:1912:6: (lv_ports_11_0= rulePort )
            	    	    // InternalCosaDsl.g:1913:7: lv_ports_11_0= rulePort
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getPortsPortParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_ports_11_0=rulePort();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
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
            	    	    break loop30;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalCosaDsl.g:1932:3: ( ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCosaDsl.g:1933:4: ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    {
            	    // InternalCosaDsl.g:1933:4: ( (lv_bindings_12_0= ruleBinding ) )
            	    // InternalCosaDsl.g:1934:5: (lv_bindings_12_0= ruleBinding )
            	    {
            	    // InternalCosaDsl.g:1934:5: (lv_bindings_12_0= ruleBinding )
            	    // InternalCosaDsl.g:1935:6: lv_bindings_12_0= ruleBinding
            	    {

            	    						newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getBindingsBindingParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_bindings_12_0=ruleBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bindings",
            	    							lv_bindings_12_0,
            	    							"fr.univnantes.asa.xtext.CosaDsl.Binding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCosaDsl.g:1952:4: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==13) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalCosaDsl.g:1953:5: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_13, grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_7_1_0());
            	    	    				
            	    	    // InternalCosaDsl.g:1957:5: ( (lv_bindings_14_0= ruleBinding ) )
            	    	    // InternalCosaDsl.g:1958:6: (lv_bindings_14_0= ruleBinding )
            	    	    {
            	    	    // InternalCosaDsl.g:1958:6: (lv_bindings_14_0= ruleBinding )
            	    	    // InternalCosaDsl.g:1959:7: lv_bindings_14_0= ruleBinding
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSimpleConfigurationAccess().getBindingsBindingParserRuleCall_7_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_bindings_14_0=ruleBinding();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSimpleConfigurationRule());
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
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSimpleConfigurationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSimpleConfiguration"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000E028D6800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000E028C6800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000600040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000802886800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000802806800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000802006800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000802000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000006000C6000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000006000D6000L});

}