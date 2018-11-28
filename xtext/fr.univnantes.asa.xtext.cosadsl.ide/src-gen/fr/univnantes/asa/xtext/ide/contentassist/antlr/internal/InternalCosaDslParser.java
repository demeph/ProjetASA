package fr.univnantes.asa.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.univnantes.asa.xtext.services.CosaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCosaDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CompositeConfiguration'", "'{'", "'}'", "','", "'Component'", "'Connector'", "'glue'", "'Port'", "'Binding'", "'('", "'.'", "')'", "'Attachement'", "'to'", "'Configuration'", "'Service'", "'RequiredService'", "'ProvidedService'", "'Role'", "'RequiredRole'", "'ProvidedRole'", "'Glue'", "'RequiredPort'", "'ProvidedPort'", "'SimpleConfiguration'"
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

    	public void setGrammarAccess(CosaDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConfiguration"
    // InternalCosaDsl.g:53:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalCosaDsl.g:54:1: ( ruleConfiguration EOF )
            // InternalCosaDsl.g:55:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalCosaDsl.g:62:1: ruleConfiguration : ( ( rule__Configuration__Alternatives ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:66:2: ( ( ( rule__Configuration__Alternatives ) ) )
            // InternalCosaDsl.g:67:2: ( ( rule__Configuration__Alternatives ) )
            {
            // InternalCosaDsl.g:67:2: ( ( rule__Configuration__Alternatives ) )
            // InternalCosaDsl.g:68:3: ( rule__Configuration__Alternatives )
            {
             before(grammarAccess.getConfigurationAccess().getAlternatives()); 
            // InternalCosaDsl.g:69:3: ( rule__Configuration__Alternatives )
            // InternalCosaDsl.g:69:4: rule__Configuration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRulePort"
    // InternalCosaDsl.g:78:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalCosaDsl.g:79:1: ( rulePort EOF )
            // InternalCosaDsl.g:80:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalCosaDsl.g:87:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:91:2: ( ( ( rule__Port__Alternatives ) ) )
            // InternalCosaDsl.g:92:2: ( ( rule__Port__Alternatives ) )
            {
            // InternalCosaDsl.g:92:2: ( ( rule__Port__Alternatives ) )
            // InternalCosaDsl.g:93:3: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // InternalCosaDsl.g:94:3: ( rule__Port__Alternatives )
            // InternalCosaDsl.g:94:4: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleService"
    // InternalCosaDsl.g:103:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalCosaDsl.g:104:1: ( ruleService EOF )
            // InternalCosaDsl.g:105:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalCosaDsl.g:112:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:116:2: ( ( ( rule__Service__Alternatives ) ) )
            // InternalCosaDsl.g:117:2: ( ( rule__Service__Alternatives ) )
            {
            // InternalCosaDsl.g:117:2: ( ( rule__Service__Alternatives ) )
            // InternalCosaDsl.g:118:3: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // InternalCosaDsl.g:119:3: ( rule__Service__Alternatives )
            // InternalCosaDsl.g:119:4: rule__Service__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Service__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRole"
    // InternalCosaDsl.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalCosaDsl.g:129:1: ( ruleRole EOF )
            // InternalCosaDsl.g:130:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalCosaDsl.g:137:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:141:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalCosaDsl.g:142:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalCosaDsl.g:142:2: ( ( rule__Role__Alternatives ) )
            // InternalCosaDsl.g:143:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalCosaDsl.g:144:3: ( rule__Role__Alternatives )
            // InternalCosaDsl.g:144:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleCompositeConfiguration"
    // InternalCosaDsl.g:153:1: entryRuleCompositeConfiguration : ruleCompositeConfiguration EOF ;
    public final void entryRuleCompositeConfiguration() throws RecognitionException {
        try {
            // InternalCosaDsl.g:154:1: ( ruleCompositeConfiguration EOF )
            // InternalCosaDsl.g:155:1: ruleCompositeConfiguration EOF
            {
             before(grammarAccess.getCompositeConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeConfiguration();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeConfiguration"


    // $ANTLR start "ruleCompositeConfiguration"
    // InternalCosaDsl.g:162:1: ruleCompositeConfiguration : ( ( rule__CompositeConfiguration__Group__0 ) ) ;
    public final void ruleCompositeConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:166:2: ( ( ( rule__CompositeConfiguration__Group__0 ) ) )
            // InternalCosaDsl.g:167:2: ( ( rule__CompositeConfiguration__Group__0 ) )
            {
            // InternalCosaDsl.g:167:2: ( ( rule__CompositeConfiguration__Group__0 ) )
            // InternalCosaDsl.g:168:3: ( rule__CompositeConfiguration__Group__0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup()); 
            // InternalCosaDsl.g:169:3: ( rule__CompositeConfiguration__Group__0 )
            // InternalCosaDsl.g:169:4: rule__CompositeConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeConfiguration"


    // $ANTLR start "entryRuleEString"
    // InternalCosaDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCosaDsl.g:179:1: ( ruleEString EOF )
            // InternalCosaDsl.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCosaDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCosaDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCosaDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalCosaDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCosaDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalCosaDsl.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponent"
    // InternalCosaDsl.g:203:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalCosaDsl.g:204:1: ( ruleComponent EOF )
            // InternalCosaDsl.g:205:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCosaDsl.g:212:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:216:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalCosaDsl.g:217:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalCosaDsl.g:217:2: ( ( rule__Component__Group__0 ) )
            // InternalCosaDsl.g:218:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalCosaDsl.g:219:3: ( rule__Component__Group__0 )
            // InternalCosaDsl.g:219:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalCosaDsl.g:228:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCosaDsl.g:229:1: ( ruleConnector EOF )
            // InternalCosaDsl.g:230:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCosaDsl.g:237:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:241:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalCosaDsl.g:242:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalCosaDsl.g:242:2: ( ( rule__Connector__Group__0 ) )
            // InternalCosaDsl.g:243:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalCosaDsl.g:244:3: ( rule__Connector__Group__0 )
            // InternalCosaDsl.g:244:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePort_Impl"
    // InternalCosaDsl.g:253:1: entryRulePort_Impl : rulePort_Impl EOF ;
    public final void entryRulePort_Impl() throws RecognitionException {
        try {
            // InternalCosaDsl.g:254:1: ( rulePort_Impl EOF )
            // InternalCosaDsl.g:255:1: rulePort_Impl EOF
            {
             before(grammarAccess.getPort_ImplRule()); 
            pushFollow(FOLLOW_1);
            rulePort_Impl();

            state._fsp--;

             after(grammarAccess.getPort_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort_Impl"


    // $ANTLR start "rulePort_Impl"
    // InternalCosaDsl.g:262:1: rulePort_Impl : ( ( rule__Port_Impl__Group__0 ) ) ;
    public final void rulePort_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:266:2: ( ( ( rule__Port_Impl__Group__0 ) ) )
            // InternalCosaDsl.g:267:2: ( ( rule__Port_Impl__Group__0 ) )
            {
            // InternalCosaDsl.g:267:2: ( ( rule__Port_Impl__Group__0 ) )
            // InternalCosaDsl.g:268:3: ( rule__Port_Impl__Group__0 )
            {
             before(grammarAccess.getPort_ImplAccess().getGroup()); 
            // InternalCosaDsl.g:269:3: ( rule__Port_Impl__Group__0 )
            // InternalCosaDsl.g:269:4: rule__Port_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPort_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort_Impl"


    // $ANTLR start "entryRuleBinding"
    // InternalCosaDsl.g:278:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalCosaDsl.g:279:1: ( ruleBinding EOF )
            // InternalCosaDsl.g:280:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalCosaDsl.g:287:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:291:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalCosaDsl.g:292:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalCosaDsl.g:292:2: ( ( rule__Binding__Group__0 ) )
            // InternalCosaDsl.g:293:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalCosaDsl.g:294:3: ( rule__Binding__Group__0 )
            // InternalCosaDsl.g:294:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleAttachement"
    // InternalCosaDsl.g:303:1: entryRuleAttachement : ruleAttachement EOF ;
    public final void entryRuleAttachement() throws RecognitionException {
        try {
            // InternalCosaDsl.g:304:1: ( ruleAttachement EOF )
            // InternalCosaDsl.g:305:1: ruleAttachement EOF
            {
             before(grammarAccess.getAttachementRule()); 
            pushFollow(FOLLOW_1);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getAttachementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttachement"


    // $ANTLR start "ruleAttachement"
    // InternalCosaDsl.g:312:1: ruleAttachement : ( ( rule__Attachement__Group__0 ) ) ;
    public final void ruleAttachement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:316:2: ( ( ( rule__Attachement__Group__0 ) ) )
            // InternalCosaDsl.g:317:2: ( ( rule__Attachement__Group__0 ) )
            {
            // InternalCosaDsl.g:317:2: ( ( rule__Attachement__Group__0 ) )
            // InternalCosaDsl.g:318:3: ( rule__Attachement__Group__0 )
            {
             before(grammarAccess.getAttachementAccess().getGroup()); 
            // InternalCosaDsl.g:319:3: ( rule__Attachement__Group__0 )
            // InternalCosaDsl.g:319:4: rule__Attachement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttachementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttachement"


    // $ANTLR start "entryRuleConfiguration_Impl"
    // InternalCosaDsl.g:328:1: entryRuleConfiguration_Impl : ruleConfiguration_Impl EOF ;
    public final void entryRuleConfiguration_Impl() throws RecognitionException {
        try {
            // InternalCosaDsl.g:329:1: ( ruleConfiguration_Impl EOF )
            // InternalCosaDsl.g:330:1: ruleConfiguration_Impl EOF
            {
             before(grammarAccess.getConfiguration_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration_Impl();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration_Impl"


    // $ANTLR start "ruleConfiguration_Impl"
    // InternalCosaDsl.g:337:1: ruleConfiguration_Impl : ( ( rule__Configuration_Impl__Group__0 ) ) ;
    public final void ruleConfiguration_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:341:2: ( ( ( rule__Configuration_Impl__Group__0 ) ) )
            // InternalCosaDsl.g:342:2: ( ( rule__Configuration_Impl__Group__0 ) )
            {
            // InternalCosaDsl.g:342:2: ( ( rule__Configuration_Impl__Group__0 ) )
            // InternalCosaDsl.g:343:3: ( rule__Configuration_Impl__Group__0 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup()); 
            // InternalCosaDsl.g:344:3: ( rule__Configuration_Impl__Group__0 )
            // InternalCosaDsl.g:344:4: rule__Configuration_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration_Impl"


    // $ANTLR start "entryRuleService_Impl"
    // InternalCosaDsl.g:353:1: entryRuleService_Impl : ruleService_Impl EOF ;
    public final void entryRuleService_Impl() throws RecognitionException {
        try {
            // InternalCosaDsl.g:354:1: ( ruleService_Impl EOF )
            // InternalCosaDsl.g:355:1: ruleService_Impl EOF
            {
             before(grammarAccess.getService_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleService_Impl();

            state._fsp--;

             after(grammarAccess.getService_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService_Impl"


    // $ANTLR start "ruleService_Impl"
    // InternalCosaDsl.g:362:1: ruleService_Impl : ( ( rule__Service_Impl__Group__0 ) ) ;
    public final void ruleService_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:366:2: ( ( ( rule__Service_Impl__Group__0 ) ) )
            // InternalCosaDsl.g:367:2: ( ( rule__Service_Impl__Group__0 ) )
            {
            // InternalCosaDsl.g:367:2: ( ( rule__Service_Impl__Group__0 ) )
            // InternalCosaDsl.g:368:3: ( rule__Service_Impl__Group__0 )
            {
             before(grammarAccess.getService_ImplAccess().getGroup()); 
            // InternalCosaDsl.g:369:3: ( rule__Service_Impl__Group__0 )
            // InternalCosaDsl.g:369:4: rule__Service_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService_Impl"


    // $ANTLR start "entryRuleRequiredService"
    // InternalCosaDsl.g:378:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalCosaDsl.g:379:1: ( ruleRequiredService EOF )
            // InternalCosaDsl.g:380:1: ruleRequiredService EOF
            {
             before(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getRequiredServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalCosaDsl.g:387:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:391:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalCosaDsl.g:392:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalCosaDsl.g:392:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalCosaDsl.g:393:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalCosaDsl.g:394:3: ( rule__RequiredService__Group__0 )
            // InternalCosaDsl.g:394:4: rule__RequiredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleProvidedService"
    // InternalCosaDsl.g:403:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalCosaDsl.g:404:1: ( ruleProvidedService EOF )
            // InternalCosaDsl.g:405:1: ruleProvidedService EOF
            {
             before(grammarAccess.getProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getProvidedServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvidedService"


    // $ANTLR start "ruleProvidedService"
    // InternalCosaDsl.g:412:1: ruleProvidedService : ( ( rule__ProvidedService__Group__0 ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:416:2: ( ( ( rule__ProvidedService__Group__0 ) ) )
            // InternalCosaDsl.g:417:2: ( ( rule__ProvidedService__Group__0 ) )
            {
            // InternalCosaDsl.g:417:2: ( ( rule__ProvidedService__Group__0 ) )
            // InternalCosaDsl.g:418:3: ( rule__ProvidedService__Group__0 )
            {
             before(grammarAccess.getProvidedServiceAccess().getGroup()); 
            // InternalCosaDsl.g:419:3: ( rule__ProvidedService__Group__0 )
            // InternalCosaDsl.g:419:4: rule__ProvidedService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleRole_Impl"
    // InternalCosaDsl.g:428:1: entryRuleRole_Impl : ruleRole_Impl EOF ;
    public final void entryRuleRole_Impl() throws RecognitionException {
        try {
            // InternalCosaDsl.g:429:1: ( ruleRole_Impl EOF )
            // InternalCosaDsl.g:430:1: ruleRole_Impl EOF
            {
             before(grammarAccess.getRole_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRole_Impl();

            state._fsp--;

             after(grammarAccess.getRole_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole_Impl"


    // $ANTLR start "ruleRole_Impl"
    // InternalCosaDsl.g:437:1: ruleRole_Impl : ( ( rule__Role_Impl__Group__0 ) ) ;
    public final void ruleRole_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:441:2: ( ( ( rule__Role_Impl__Group__0 ) ) )
            // InternalCosaDsl.g:442:2: ( ( rule__Role_Impl__Group__0 ) )
            {
            // InternalCosaDsl.g:442:2: ( ( rule__Role_Impl__Group__0 ) )
            // InternalCosaDsl.g:443:3: ( rule__Role_Impl__Group__0 )
            {
             before(grammarAccess.getRole_ImplAccess().getGroup()); 
            // InternalCosaDsl.g:444:3: ( rule__Role_Impl__Group__0 )
            // InternalCosaDsl.g:444:4: rule__Role_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole_Impl"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCosaDsl.g:453:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalCosaDsl.g:454:1: ( ruleRequiredRole EOF )
            // InternalCosaDsl.g:455:1: ruleRequiredRole EOF
            {
             before(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredRole();

            state._fsp--;

             after(grammarAccess.getRequiredRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalCosaDsl.g:462:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:466:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalCosaDsl.g:467:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalCosaDsl.g:467:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalCosaDsl.g:468:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalCosaDsl.g:469:3: ( rule__RequiredRole__Group__0 )
            // InternalCosaDsl.g:469:4: rule__RequiredRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCosaDsl.g:478:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalCosaDsl.g:479:1: ( ruleProvidedRole EOF )
            // InternalCosaDsl.g:480:1: ruleProvidedRole EOF
            {
             before(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedRole();

            state._fsp--;

             after(grammarAccess.getProvidedRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalCosaDsl.g:487:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:491:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalCosaDsl.g:492:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalCosaDsl.g:492:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalCosaDsl.g:493:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalCosaDsl.g:494:3: ( rule__ProvidedRole__Group__0 )
            // InternalCosaDsl.g:494:4: rule__ProvidedRole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleGlue"
    // InternalCosaDsl.g:503:1: entryRuleGlue : ruleGlue EOF ;
    public final void entryRuleGlue() throws RecognitionException {
        try {
            // InternalCosaDsl.g:504:1: ( ruleGlue EOF )
            // InternalCosaDsl.g:505:1: ruleGlue EOF
            {
             before(grammarAccess.getGlueRule()); 
            pushFollow(FOLLOW_1);
            ruleGlue();

            state._fsp--;

             after(grammarAccess.getGlueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlue"


    // $ANTLR start "ruleGlue"
    // InternalCosaDsl.g:512:1: ruleGlue : ( ( rule__Glue__Group__0 ) ) ;
    public final void ruleGlue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:516:2: ( ( ( rule__Glue__Group__0 ) ) )
            // InternalCosaDsl.g:517:2: ( ( rule__Glue__Group__0 ) )
            {
            // InternalCosaDsl.g:517:2: ( ( rule__Glue__Group__0 ) )
            // InternalCosaDsl.g:518:3: ( rule__Glue__Group__0 )
            {
             before(grammarAccess.getGlueAccess().getGroup()); 
            // InternalCosaDsl.g:519:3: ( rule__Glue__Group__0 )
            // InternalCosaDsl.g:519:4: rule__Glue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Glue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlue"


    // $ANTLR start "entryRuleRequiredPort"
    // InternalCosaDsl.g:528:1: entryRuleRequiredPort : ruleRequiredPort EOF ;
    public final void entryRuleRequiredPort() throws RecognitionException {
        try {
            // InternalCosaDsl.g:529:1: ( ruleRequiredPort EOF )
            // InternalCosaDsl.g:530:1: ruleRequiredPort EOF
            {
             before(grammarAccess.getRequiredPortRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredPort();

            state._fsp--;

             after(grammarAccess.getRequiredPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredPort"


    // $ANTLR start "ruleRequiredPort"
    // InternalCosaDsl.g:537:1: ruleRequiredPort : ( ( rule__RequiredPort__Group__0 ) ) ;
    public final void ruleRequiredPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:541:2: ( ( ( rule__RequiredPort__Group__0 ) ) )
            // InternalCosaDsl.g:542:2: ( ( rule__RequiredPort__Group__0 ) )
            {
            // InternalCosaDsl.g:542:2: ( ( rule__RequiredPort__Group__0 ) )
            // InternalCosaDsl.g:543:3: ( rule__RequiredPort__Group__0 )
            {
             before(grammarAccess.getRequiredPortAccess().getGroup()); 
            // InternalCosaDsl.g:544:3: ( rule__RequiredPort__Group__0 )
            // InternalCosaDsl.g:544:4: rule__RequiredPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredPort"


    // $ANTLR start "entryRuleProvidedPort"
    // InternalCosaDsl.g:553:1: entryRuleProvidedPort : ruleProvidedPort EOF ;
    public final void entryRuleProvidedPort() throws RecognitionException {
        try {
            // InternalCosaDsl.g:554:1: ( ruleProvidedPort EOF )
            // InternalCosaDsl.g:555:1: ruleProvidedPort EOF
            {
             before(grammarAccess.getProvidedPortRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedPort();

            state._fsp--;

             after(grammarAccess.getProvidedPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvidedPort"


    // $ANTLR start "ruleProvidedPort"
    // InternalCosaDsl.g:562:1: ruleProvidedPort : ( ( rule__ProvidedPort__Group__0 ) ) ;
    public final void ruleProvidedPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:566:2: ( ( ( rule__ProvidedPort__Group__0 ) ) )
            // InternalCosaDsl.g:567:2: ( ( rule__ProvidedPort__Group__0 ) )
            {
            // InternalCosaDsl.g:567:2: ( ( rule__ProvidedPort__Group__0 ) )
            // InternalCosaDsl.g:568:3: ( rule__ProvidedPort__Group__0 )
            {
             before(grammarAccess.getProvidedPortAccess().getGroup()); 
            // InternalCosaDsl.g:569:3: ( rule__ProvidedPort__Group__0 )
            // InternalCosaDsl.g:569:4: rule__ProvidedPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedPort"


    // $ANTLR start "entryRuleSimpleConfiguration"
    // InternalCosaDsl.g:578:1: entryRuleSimpleConfiguration : ruleSimpleConfiguration EOF ;
    public final void entryRuleSimpleConfiguration() throws RecognitionException {
        try {
            // InternalCosaDsl.g:579:1: ( ruleSimpleConfiguration EOF )
            // InternalCosaDsl.g:580:1: ruleSimpleConfiguration EOF
            {
             before(grammarAccess.getSimpleConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleConfiguration();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleConfiguration"


    // $ANTLR start "ruleSimpleConfiguration"
    // InternalCosaDsl.g:587:1: ruleSimpleConfiguration : ( ( rule__SimpleConfiguration__Group__0 ) ) ;
    public final void ruleSimpleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:591:2: ( ( ( rule__SimpleConfiguration__Group__0 ) ) )
            // InternalCosaDsl.g:592:2: ( ( rule__SimpleConfiguration__Group__0 ) )
            {
            // InternalCosaDsl.g:592:2: ( ( rule__SimpleConfiguration__Group__0 ) )
            // InternalCosaDsl.g:593:3: ( rule__SimpleConfiguration__Group__0 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup()); 
            // InternalCosaDsl.g:594:3: ( rule__SimpleConfiguration__Group__0 )
            // InternalCosaDsl.g:594:4: rule__SimpleConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleConfiguration"


    // $ANTLR start "rule__Configuration__Alternatives"
    // InternalCosaDsl.g:602:1: rule__Configuration__Alternatives : ( ( ruleConfiguration_Impl ) | ( ruleSimpleConfiguration ) | ( ruleCompositeConfiguration ) );
    public final void rule__Configuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:606:1: ( ( ruleConfiguration_Impl ) | ( ruleSimpleConfiguration ) | ( ruleCompositeConfiguration ) )
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
                    // InternalCosaDsl.g:607:2: ( ruleConfiguration_Impl )
                    {
                    // InternalCosaDsl.g:607:2: ( ruleConfiguration_Impl )
                    // InternalCosaDsl.g:608:3: ruleConfiguration_Impl
                    {
                     before(grammarAccess.getConfigurationAccess().getConfiguration_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConfiguration_Impl();

                    state._fsp--;

                     after(grammarAccess.getConfigurationAccess().getConfiguration_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:613:2: ( ruleSimpleConfiguration )
                    {
                    // InternalCosaDsl.g:613:2: ( ruleSimpleConfiguration )
                    // InternalCosaDsl.g:614:3: ruleSimpleConfiguration
                    {
                     before(grammarAccess.getConfigurationAccess().getSimpleConfigurationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleConfiguration();

                    state._fsp--;

                     after(grammarAccess.getConfigurationAccess().getSimpleConfigurationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:619:2: ( ruleCompositeConfiguration )
                    {
                    // InternalCosaDsl.g:619:2: ( ruleCompositeConfiguration )
                    // InternalCosaDsl.g:620:3: ruleCompositeConfiguration
                    {
                     before(grammarAccess.getConfigurationAccess().getCompositeConfigurationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeConfiguration();

                    state._fsp--;

                     after(grammarAccess.getConfigurationAccess().getCompositeConfigurationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Alternatives"


    // $ANTLR start "rule__Port__Alternatives"
    // InternalCosaDsl.g:629:1: rule__Port__Alternatives : ( ( rulePort_Impl ) | ( ruleRequiredPort ) | ( ruleProvidedPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:633:1: ( ( rulePort_Impl ) | ( ruleRequiredPort ) | ( ruleProvidedPort ) )
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
                    // InternalCosaDsl.g:634:2: ( rulePort_Impl )
                    {
                    // InternalCosaDsl.g:634:2: ( rulePort_Impl )
                    // InternalCosaDsl.g:635:3: rulePort_Impl
                    {
                     before(grammarAccess.getPortAccess().getPort_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePort_Impl();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getPort_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:640:2: ( ruleRequiredPort )
                    {
                    // InternalCosaDsl.g:640:2: ( ruleRequiredPort )
                    // InternalCosaDsl.g:641:3: ruleRequiredPort
                    {
                     before(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRequiredPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:646:2: ( ruleProvidedPort )
                    {
                    // InternalCosaDsl.g:646:2: ( ruleProvidedPort )
                    // InternalCosaDsl.g:647:3: ruleProvidedPort
                    {
                     before(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProvidedPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__Service__Alternatives"
    // InternalCosaDsl.g:656:1: rule__Service__Alternatives : ( ( ruleService_Impl ) | ( ruleRequiredService ) | ( ruleProvidedService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:660:1: ( ( ruleService_Impl ) | ( ruleRequiredService ) | ( ruleProvidedService ) )
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
                    // InternalCosaDsl.g:661:2: ( ruleService_Impl )
                    {
                    // InternalCosaDsl.g:661:2: ( ruleService_Impl )
                    // InternalCosaDsl.g:662:3: ruleService_Impl
                    {
                     before(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleService_Impl();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getService_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:667:2: ( ruleRequiredService )
                    {
                    // InternalCosaDsl.g:667:2: ( ruleRequiredService )
                    // InternalCosaDsl.g:668:3: ruleRequiredService
                    {
                     before(grammarAccess.getServiceAccess().getRequiredServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRequiredService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getRequiredServiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:673:2: ( ruleProvidedService )
                    {
                    // InternalCosaDsl.g:673:2: ( ruleProvidedService )
                    // InternalCosaDsl.g:674:3: ruleProvidedService
                    {
                     before(grammarAccess.getServiceAccess().getProvidedServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProvidedService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getProvidedServiceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalCosaDsl.g:683:1: rule__Role__Alternatives : ( ( ruleRole_Impl ) | ( ruleRequiredRole ) | ( ruleProvidedRole ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:687:1: ( ( ruleRole_Impl ) | ( ruleRequiredRole ) | ( ruleProvidedRole ) )
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
                    // InternalCosaDsl.g:688:2: ( ruleRole_Impl )
                    {
                    // InternalCosaDsl.g:688:2: ( ruleRole_Impl )
                    // InternalCosaDsl.g:689:3: ruleRole_Impl
                    {
                     before(grammarAccess.getRoleAccess().getRole_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRole_Impl();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRole_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:694:2: ( ruleRequiredRole )
                    {
                    // InternalCosaDsl.g:694:2: ( ruleRequiredRole )
                    // InternalCosaDsl.g:695:3: ruleRequiredRole
                    {
                     before(grammarAccess.getRoleAccess().getRequiredRoleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRequiredRole();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRequiredRoleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCosaDsl.g:700:2: ( ruleProvidedRole )
                    {
                    // InternalCosaDsl.g:700:2: ( ruleProvidedRole )
                    // InternalCosaDsl.g:701:3: ruleProvidedRole
                    {
                     before(grammarAccess.getRoleAccess().getProvidedRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProvidedRole();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getProvidedRoleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCosaDsl.g:710:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:714:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCosaDsl.g:715:2: ( RULE_STRING )
                    {
                    // InternalCosaDsl.g:715:2: ( RULE_STRING )
                    // InternalCosaDsl.g:716:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:721:2: ( RULE_ID )
                    {
                    // InternalCosaDsl.g:721:2: ( RULE_ID )
                    // InternalCosaDsl.g:722:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__CompositeConfiguration__Group__0"
    // InternalCosaDsl.g:731:1: rule__CompositeConfiguration__Group__0 : rule__CompositeConfiguration__Group__0__Impl rule__CompositeConfiguration__Group__1 ;
    public final void rule__CompositeConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:735:1: ( rule__CompositeConfiguration__Group__0__Impl rule__CompositeConfiguration__Group__1 )
            // InternalCosaDsl.g:736:2: rule__CompositeConfiguration__Group__0__Impl rule__CompositeConfiguration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__0"


    // $ANTLR start "rule__CompositeConfiguration__Group__0__Impl"
    // InternalCosaDsl.g:743:1: rule__CompositeConfiguration__Group__0__Impl : ( 'CompositeConfiguration' ) ;
    public final void rule__CompositeConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:747:1: ( ( 'CompositeConfiguration' ) )
            // InternalCosaDsl.g:748:1: ( 'CompositeConfiguration' )
            {
            // InternalCosaDsl.g:748:1: ( 'CompositeConfiguration' )
            // InternalCosaDsl.g:749:2: 'CompositeConfiguration'
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCompositeConfigurationKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCompositeConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__1"
    // InternalCosaDsl.g:758:1: rule__CompositeConfiguration__Group__1 : rule__CompositeConfiguration__Group__1__Impl rule__CompositeConfiguration__Group__2 ;
    public final void rule__CompositeConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:762:1: ( rule__CompositeConfiguration__Group__1__Impl rule__CompositeConfiguration__Group__2 )
            // InternalCosaDsl.g:763:2: rule__CompositeConfiguration__Group__1__Impl rule__CompositeConfiguration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__1"


    // $ANTLR start "rule__CompositeConfiguration__Group__1__Impl"
    // InternalCosaDsl.g:770:1: rule__CompositeConfiguration__Group__1__Impl : ( ( rule__CompositeConfiguration__NameAssignment_1 ) ) ;
    public final void rule__CompositeConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:774:1: ( ( ( rule__CompositeConfiguration__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:775:1: ( ( rule__CompositeConfiguration__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:775:1: ( ( rule__CompositeConfiguration__NameAssignment_1 ) )
            // InternalCosaDsl.g:776:2: ( rule__CompositeConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:777:2: ( rule__CompositeConfiguration__NameAssignment_1 )
            // InternalCosaDsl.g:777:3: rule__CompositeConfiguration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__2"
    // InternalCosaDsl.g:785:1: rule__CompositeConfiguration__Group__2 : rule__CompositeConfiguration__Group__2__Impl rule__CompositeConfiguration__Group__3 ;
    public final void rule__CompositeConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:789:1: ( rule__CompositeConfiguration__Group__2__Impl rule__CompositeConfiguration__Group__3 )
            // InternalCosaDsl.g:790:2: rule__CompositeConfiguration__Group__2__Impl rule__CompositeConfiguration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CompositeConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__2"


    // $ANTLR start "rule__CompositeConfiguration__Group__2__Impl"
    // InternalCosaDsl.g:797:1: rule__CompositeConfiguration__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:801:1: ( ( '{' ) )
            // InternalCosaDsl.g:802:1: ( '{' )
            {
            // InternalCosaDsl.g:802:1: ( '{' )
            // InternalCosaDsl.g:803:2: '{'
            {
             before(grammarAccess.getCompositeConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__2__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__3"
    // InternalCosaDsl.g:812:1: rule__CompositeConfiguration__Group__3 : rule__CompositeConfiguration__Group__3__Impl rule__CompositeConfiguration__Group__4 ;
    public final void rule__CompositeConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:816:1: ( rule__CompositeConfiguration__Group__3__Impl rule__CompositeConfiguration__Group__4 )
            // InternalCosaDsl.g:817:2: rule__CompositeConfiguration__Group__3__Impl rule__CompositeConfiguration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CompositeConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__3"


    // $ANTLR start "rule__CompositeConfiguration__Group__3__Impl"
    // InternalCosaDsl.g:824:1: rule__CompositeConfiguration__Group__3__Impl : ( ( rule__CompositeConfiguration__Group_3__0 ) ) ;
    public final void rule__CompositeConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:828:1: ( ( ( rule__CompositeConfiguration__Group_3__0 ) ) )
            // InternalCosaDsl.g:829:1: ( ( rule__CompositeConfiguration__Group_3__0 ) )
            {
            // InternalCosaDsl.g:829:1: ( ( rule__CompositeConfiguration__Group_3__0 ) )
            // InternalCosaDsl.g:830:2: ( rule__CompositeConfiguration__Group_3__0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_3()); 
            // InternalCosaDsl.g:831:2: ( rule__CompositeConfiguration__Group_3__0 )
            // InternalCosaDsl.g:831:3: rule__CompositeConfiguration__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__3__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__4"
    // InternalCosaDsl.g:839:1: rule__CompositeConfiguration__Group__4 : rule__CompositeConfiguration__Group__4__Impl rule__CompositeConfiguration__Group__5 ;
    public final void rule__CompositeConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:843:1: ( rule__CompositeConfiguration__Group__4__Impl rule__CompositeConfiguration__Group__5 )
            // InternalCosaDsl.g:844:2: rule__CompositeConfiguration__Group__4__Impl rule__CompositeConfiguration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CompositeConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__4"


    // $ANTLR start "rule__CompositeConfiguration__Group__4__Impl"
    // InternalCosaDsl.g:851:1: rule__CompositeConfiguration__Group__4__Impl : ( ( rule__CompositeConfiguration__Group_4__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:855:1: ( ( ( rule__CompositeConfiguration__Group_4__0 )* ) )
            // InternalCosaDsl.g:856:1: ( ( rule__CompositeConfiguration__Group_4__0 )* )
            {
            // InternalCosaDsl.g:856:1: ( ( rule__CompositeConfiguration__Group_4__0 )* )
            // InternalCosaDsl.g:857:2: ( rule__CompositeConfiguration__Group_4__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_4()); 
            // InternalCosaDsl.g:858:2: ( rule__CompositeConfiguration__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCosaDsl.g:858:3: rule__CompositeConfiguration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__4__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__5"
    // InternalCosaDsl.g:866:1: rule__CompositeConfiguration__Group__5 : rule__CompositeConfiguration__Group__5__Impl rule__CompositeConfiguration__Group__6 ;
    public final void rule__CompositeConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:870:1: ( rule__CompositeConfiguration__Group__5__Impl rule__CompositeConfiguration__Group__6 )
            // InternalCosaDsl.g:871:2: rule__CompositeConfiguration__Group__5__Impl rule__CompositeConfiguration__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__CompositeConfiguration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__5"


    // $ANTLR start "rule__CompositeConfiguration__Group__5__Impl"
    // InternalCosaDsl.g:878:1: rule__CompositeConfiguration__Group__5__Impl : ( ( rule__CompositeConfiguration__Group_5__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:882:1: ( ( ( rule__CompositeConfiguration__Group_5__0 )* ) )
            // InternalCosaDsl.g:883:1: ( ( rule__CompositeConfiguration__Group_5__0 )* )
            {
            // InternalCosaDsl.g:883:1: ( ( rule__CompositeConfiguration__Group_5__0 )* )
            // InternalCosaDsl.g:884:2: ( rule__CompositeConfiguration__Group_5__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_5()); 
            // InternalCosaDsl.g:885:2: ( rule__CompositeConfiguration__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||(LA7_0>=33 && LA7_0<=34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCosaDsl.g:885:3: rule__CompositeConfiguration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeConfiguration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__5__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__6"
    // InternalCosaDsl.g:893:1: rule__CompositeConfiguration__Group__6 : rule__CompositeConfiguration__Group__6__Impl rule__CompositeConfiguration__Group__7 ;
    public final void rule__CompositeConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:897:1: ( rule__CompositeConfiguration__Group__6__Impl rule__CompositeConfiguration__Group__7 )
            // InternalCosaDsl.g:898:2: rule__CompositeConfiguration__Group__6__Impl rule__CompositeConfiguration__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__CompositeConfiguration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__6"


    // $ANTLR start "rule__CompositeConfiguration__Group__6__Impl"
    // InternalCosaDsl.g:905:1: rule__CompositeConfiguration__Group__6__Impl : ( ( rule__CompositeConfiguration__Group_6__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:909:1: ( ( ( rule__CompositeConfiguration__Group_6__0 )* ) )
            // InternalCosaDsl.g:910:1: ( ( rule__CompositeConfiguration__Group_6__0 )* )
            {
            // InternalCosaDsl.g:910:1: ( ( rule__CompositeConfiguration__Group_6__0 )* )
            // InternalCosaDsl.g:911:2: ( rule__CompositeConfiguration__Group_6__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_6()); 
            // InternalCosaDsl.g:912:2: ( rule__CompositeConfiguration__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCosaDsl.g:912:3: rule__CompositeConfiguration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CompositeConfiguration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__6__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__7"
    // InternalCosaDsl.g:920:1: rule__CompositeConfiguration__Group__7 : rule__CompositeConfiguration__Group__7__Impl rule__CompositeConfiguration__Group__8 ;
    public final void rule__CompositeConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:924:1: ( rule__CompositeConfiguration__Group__7__Impl rule__CompositeConfiguration__Group__8 )
            // InternalCosaDsl.g:925:2: rule__CompositeConfiguration__Group__7__Impl rule__CompositeConfiguration__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__CompositeConfiguration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__7"


    // $ANTLR start "rule__CompositeConfiguration__Group__7__Impl"
    // InternalCosaDsl.g:932:1: rule__CompositeConfiguration__Group__7__Impl : ( ( rule__CompositeConfiguration__Group_7__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:936:1: ( ( ( rule__CompositeConfiguration__Group_7__0 )* ) )
            // InternalCosaDsl.g:937:1: ( ( rule__CompositeConfiguration__Group_7__0 )* )
            {
            // InternalCosaDsl.g:937:1: ( ( rule__CompositeConfiguration__Group_7__0 )* )
            // InternalCosaDsl.g:938:2: ( rule__CompositeConfiguration__Group_7__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_7()); 
            // InternalCosaDsl.g:939:2: ( rule__CompositeConfiguration__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCosaDsl.g:939:3: rule__CompositeConfiguration__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeConfiguration__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__7__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__8"
    // InternalCosaDsl.g:947:1: rule__CompositeConfiguration__Group__8 : rule__CompositeConfiguration__Group__8__Impl rule__CompositeConfiguration__Group__9 ;
    public final void rule__CompositeConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:951:1: ( rule__CompositeConfiguration__Group__8__Impl rule__CompositeConfiguration__Group__9 )
            // InternalCosaDsl.g:952:2: rule__CompositeConfiguration__Group__8__Impl rule__CompositeConfiguration__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__CompositeConfiguration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__8"


    // $ANTLR start "rule__CompositeConfiguration__Group__8__Impl"
    // InternalCosaDsl.g:959:1: rule__CompositeConfiguration__Group__8__Impl : ( ( rule__CompositeConfiguration__Group_8__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:963:1: ( ( ( rule__CompositeConfiguration__Group_8__0 )* ) )
            // InternalCosaDsl.g:964:1: ( ( rule__CompositeConfiguration__Group_8__0 )* )
            {
            // InternalCosaDsl.g:964:1: ( ( rule__CompositeConfiguration__Group_8__0 )* )
            // InternalCosaDsl.g:965:2: ( rule__CompositeConfiguration__Group_8__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_8()); 
            // InternalCosaDsl.g:966:2: ( rule__CompositeConfiguration__Group_8__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11||LA10_0==25||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCosaDsl.g:966:3: rule__CompositeConfiguration__Group_8__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CompositeConfiguration__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__8__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__9"
    // InternalCosaDsl.g:974:1: rule__CompositeConfiguration__Group__9 : rule__CompositeConfiguration__Group__9__Impl ;
    public final void rule__CompositeConfiguration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:978:1: ( rule__CompositeConfiguration__Group__9__Impl )
            // InternalCosaDsl.g:979:2: rule__CompositeConfiguration__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__9"


    // $ANTLR start "rule__CompositeConfiguration__Group__9__Impl"
    // InternalCosaDsl.g:985:1: rule__CompositeConfiguration__Group__9__Impl : ( '}' ) ;
    public final void rule__CompositeConfiguration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:989:1: ( ( '}' ) )
            // InternalCosaDsl.g:990:1: ( '}' )
            {
            // InternalCosaDsl.g:990:1: ( '}' )
            // InternalCosaDsl.g:991:2: '}'
            {
             before(grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group__9__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_3__0"
    // InternalCosaDsl.g:1001:1: rule__CompositeConfiguration__Group_3__0 : rule__CompositeConfiguration__Group_3__0__Impl rule__CompositeConfiguration__Group_3__1 ;
    public final void rule__CompositeConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1005:1: ( rule__CompositeConfiguration__Group_3__0__Impl rule__CompositeConfiguration__Group_3__1 )
            // InternalCosaDsl.g:1006:2: rule__CompositeConfiguration__Group_3__0__Impl rule__CompositeConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeConfiguration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_3__0__Impl"
    // InternalCosaDsl.g:1013:1: rule__CompositeConfiguration__Group_3__0__Impl : ( ( rule__CompositeConfiguration__ComponentsAssignment_3_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1017:1: ( ( ( rule__CompositeConfiguration__ComponentsAssignment_3_0 ) ) )
            // InternalCosaDsl.g:1018:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_3_0 ) )
            {
            // InternalCosaDsl.g:1018:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_3_0 ) )
            // InternalCosaDsl.g:1019:2: ( rule__CompositeConfiguration__ComponentsAssignment_3_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3_0()); 
            // InternalCosaDsl.g:1020:2: ( rule__CompositeConfiguration__ComponentsAssignment_3_0 )
            // InternalCosaDsl.g:1020:3: rule__CompositeConfiguration__ComponentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ComponentsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_3__1"
    // InternalCosaDsl.g:1028:1: rule__CompositeConfiguration__Group_3__1 : rule__CompositeConfiguration__Group_3__1__Impl ;
    public final void rule__CompositeConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1032:1: ( rule__CompositeConfiguration__Group_3__1__Impl )
            // InternalCosaDsl.g:1033:2: rule__CompositeConfiguration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_3__1__Impl"
    // InternalCosaDsl.g:1039:1: rule__CompositeConfiguration__Group_3__1__Impl : ( ( rule__CompositeConfiguration__Group_3_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1043:1: ( ( ( rule__CompositeConfiguration__Group_3_1__0 )* ) )
            // InternalCosaDsl.g:1044:1: ( ( rule__CompositeConfiguration__Group_3_1__0 )* )
            {
            // InternalCosaDsl.g:1044:1: ( ( rule__CompositeConfiguration__Group_3_1__0 )* )
            // InternalCosaDsl.g:1045:2: ( rule__CompositeConfiguration__Group_3_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_3_1()); 
            // InternalCosaDsl.g:1046:2: ( rule__CompositeConfiguration__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCosaDsl.g:1046:3: rule__CompositeConfiguration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CompositeConfiguration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_3_1__0"
    // InternalCosaDsl.g:1055:1: rule__CompositeConfiguration__Group_3_1__0 : rule__CompositeConfiguration__Group_3_1__0__Impl rule__CompositeConfiguration__Group_3_1__1 ;
    public final void rule__CompositeConfiguration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1059:1: ( rule__CompositeConfiguration__Group_3_1__0__Impl rule__CompositeConfiguration__Group_3_1__1 )
            // InternalCosaDsl.g:1060:2: rule__CompositeConfiguration__Group_3_1__0__Impl rule__CompositeConfiguration__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__CompositeConfiguration__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_3_1__0__Impl"
    // InternalCosaDsl.g:1067:1: rule__CompositeConfiguration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1071:1: ( ( ',' ) )
            // InternalCosaDsl.g:1072:1: ( ',' )
            {
            // InternalCosaDsl.g:1072:1: ( ',' )
            // InternalCosaDsl.g:1073:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_3_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_3_1__1"
    // InternalCosaDsl.g:1082:1: rule__CompositeConfiguration__Group_3_1__1 : rule__CompositeConfiguration__Group_3_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1086:1: ( rule__CompositeConfiguration__Group_3_1__1__Impl )
            // InternalCosaDsl.g:1087:2: rule__CompositeConfiguration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_3_1__1__Impl"
    // InternalCosaDsl.g:1093:1: rule__CompositeConfiguration__Group_3_1__1__Impl : ( ( rule__CompositeConfiguration__ComponentsAssignment_3_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1097:1: ( ( ( rule__CompositeConfiguration__ComponentsAssignment_3_1_1 ) ) )
            // InternalCosaDsl.g:1098:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_3_1_1 ) )
            {
            // InternalCosaDsl.g:1098:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_3_1_1 ) )
            // InternalCosaDsl.g:1099:2: ( rule__CompositeConfiguration__ComponentsAssignment_3_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3_1_1()); 
            // InternalCosaDsl.g:1100:2: ( rule__CompositeConfiguration__ComponentsAssignment_3_1_1 )
            // InternalCosaDsl.g:1100:3: rule__CompositeConfiguration__ComponentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ComponentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_3_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_4__0"
    // InternalCosaDsl.g:1109:1: rule__CompositeConfiguration__Group_4__0 : rule__CompositeConfiguration__Group_4__0__Impl rule__CompositeConfiguration__Group_4__1 ;
    public final void rule__CompositeConfiguration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1113:1: ( rule__CompositeConfiguration__Group_4__0__Impl rule__CompositeConfiguration__Group_4__1 )
            // InternalCosaDsl.g:1114:2: rule__CompositeConfiguration__Group_4__0__Impl rule__CompositeConfiguration__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeConfiguration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_4__0__Impl"
    // InternalCosaDsl.g:1121:1: rule__CompositeConfiguration__Group_4__0__Impl : ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1125:1: ( ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_0 ) ) )
            // InternalCosaDsl.g:1126:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_0 ) )
            {
            // InternalCosaDsl.g:1126:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_0 ) )
            // InternalCosaDsl.g:1127:2: ( rule__CompositeConfiguration__ConnectorsAssignment_4_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_4_0()); 
            // InternalCosaDsl.g:1128:2: ( rule__CompositeConfiguration__ConnectorsAssignment_4_0 )
            // InternalCosaDsl.g:1128:3: rule__CompositeConfiguration__ConnectorsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConnectorsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_4__1"
    // InternalCosaDsl.g:1136:1: rule__CompositeConfiguration__Group_4__1 : rule__CompositeConfiguration__Group_4__1__Impl ;
    public final void rule__CompositeConfiguration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1140:1: ( rule__CompositeConfiguration__Group_4__1__Impl )
            // InternalCosaDsl.g:1141:2: rule__CompositeConfiguration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_4__1__Impl"
    // InternalCosaDsl.g:1147:1: rule__CompositeConfiguration__Group_4__1__Impl : ( ( rule__CompositeConfiguration__Group_4_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1151:1: ( ( ( rule__CompositeConfiguration__Group_4_1__0 )* ) )
            // InternalCosaDsl.g:1152:1: ( ( rule__CompositeConfiguration__Group_4_1__0 )* )
            {
            // InternalCosaDsl.g:1152:1: ( ( rule__CompositeConfiguration__Group_4_1__0 )* )
            // InternalCosaDsl.g:1153:2: ( rule__CompositeConfiguration__Group_4_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_4_1()); 
            // InternalCosaDsl.g:1154:2: ( rule__CompositeConfiguration__Group_4_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCosaDsl.g:1154:3: rule__CompositeConfiguration__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CompositeConfiguration__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_4_1__0"
    // InternalCosaDsl.g:1163:1: rule__CompositeConfiguration__Group_4_1__0 : rule__CompositeConfiguration__Group_4_1__0__Impl rule__CompositeConfiguration__Group_4_1__1 ;
    public final void rule__CompositeConfiguration__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1167:1: ( rule__CompositeConfiguration__Group_4_1__0__Impl rule__CompositeConfiguration__Group_4_1__1 )
            // InternalCosaDsl.g:1168:2: rule__CompositeConfiguration__Group_4_1__0__Impl rule__CompositeConfiguration__Group_4_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeConfiguration__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_4_1__0__Impl"
    // InternalCosaDsl.g:1175:1: rule__CompositeConfiguration__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1179:1: ( ( ',' ) )
            // InternalCosaDsl.g:1180:1: ( ',' )
            {
            // InternalCosaDsl.g:1180:1: ( ',' )
            // InternalCosaDsl.g:1181:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_4_1__1"
    // InternalCosaDsl.g:1190:1: rule__CompositeConfiguration__Group_4_1__1 : rule__CompositeConfiguration__Group_4_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1194:1: ( rule__CompositeConfiguration__Group_4_1__1__Impl )
            // InternalCosaDsl.g:1195:2: rule__CompositeConfiguration__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_4_1__1__Impl"
    // InternalCosaDsl.g:1201:1: rule__CompositeConfiguration__Group_4_1__1__Impl : ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1205:1: ( ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 ) ) )
            // InternalCosaDsl.g:1206:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 ) )
            {
            // InternalCosaDsl.g:1206:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 ) )
            // InternalCosaDsl.g:1207:2: ( rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_4_1_1()); 
            // InternalCosaDsl.g:1208:2: ( rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 )
            // InternalCosaDsl.g:1208:3: rule__CompositeConfiguration__ConnectorsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConnectorsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_4_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_5__0"
    // InternalCosaDsl.g:1217:1: rule__CompositeConfiguration__Group_5__0 : rule__CompositeConfiguration__Group_5__0__Impl rule__CompositeConfiguration__Group_5__1 ;
    public final void rule__CompositeConfiguration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1221:1: ( rule__CompositeConfiguration__Group_5__0__Impl rule__CompositeConfiguration__Group_5__1 )
            // InternalCosaDsl.g:1222:2: rule__CompositeConfiguration__Group_5__0__Impl rule__CompositeConfiguration__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeConfiguration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_5__0__Impl"
    // InternalCosaDsl.g:1229:1: rule__CompositeConfiguration__Group_5__0__Impl : ( ( rule__CompositeConfiguration__PortsAssignment_5_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1233:1: ( ( ( rule__CompositeConfiguration__PortsAssignment_5_0 ) ) )
            // InternalCosaDsl.g:1234:1: ( ( rule__CompositeConfiguration__PortsAssignment_5_0 ) )
            {
            // InternalCosaDsl.g:1234:1: ( ( rule__CompositeConfiguration__PortsAssignment_5_0 ) )
            // InternalCosaDsl.g:1235:2: ( rule__CompositeConfiguration__PortsAssignment_5_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_5_0()); 
            // InternalCosaDsl.g:1236:2: ( rule__CompositeConfiguration__PortsAssignment_5_0 )
            // InternalCosaDsl.g:1236:3: rule__CompositeConfiguration__PortsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__PortsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_5__1"
    // InternalCosaDsl.g:1244:1: rule__CompositeConfiguration__Group_5__1 : rule__CompositeConfiguration__Group_5__1__Impl ;
    public final void rule__CompositeConfiguration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1248:1: ( rule__CompositeConfiguration__Group_5__1__Impl )
            // InternalCosaDsl.g:1249:2: rule__CompositeConfiguration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_5__1__Impl"
    // InternalCosaDsl.g:1255:1: rule__CompositeConfiguration__Group_5__1__Impl : ( ( rule__CompositeConfiguration__Group_5_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1259:1: ( ( ( rule__CompositeConfiguration__Group_5_1__0 )* ) )
            // InternalCosaDsl.g:1260:1: ( ( rule__CompositeConfiguration__Group_5_1__0 )* )
            {
            // InternalCosaDsl.g:1260:1: ( ( rule__CompositeConfiguration__Group_5_1__0 )* )
            // InternalCosaDsl.g:1261:2: ( rule__CompositeConfiguration__Group_5_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_5_1()); 
            // InternalCosaDsl.g:1262:2: ( rule__CompositeConfiguration__Group_5_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCosaDsl.g:1262:3: rule__CompositeConfiguration__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CompositeConfiguration__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_5_1__0"
    // InternalCosaDsl.g:1271:1: rule__CompositeConfiguration__Group_5_1__0 : rule__CompositeConfiguration__Group_5_1__0__Impl rule__CompositeConfiguration__Group_5_1__1 ;
    public final void rule__CompositeConfiguration__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1275:1: ( rule__CompositeConfiguration__Group_5_1__0__Impl rule__CompositeConfiguration__Group_5_1__1 )
            // InternalCosaDsl.g:1276:2: rule__CompositeConfiguration__Group_5_1__0__Impl rule__CompositeConfiguration__Group_5_1__1
            {
            pushFollow(FOLLOW_15);
            rule__CompositeConfiguration__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_5_1__0__Impl"
    // InternalCosaDsl.g:1283:1: rule__CompositeConfiguration__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1287:1: ( ( ',' ) )
            // InternalCosaDsl.g:1288:1: ( ',' )
            {
            // InternalCosaDsl.g:1288:1: ( ',' )
            // InternalCosaDsl.g:1289:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_5_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_5_1__1"
    // InternalCosaDsl.g:1298:1: rule__CompositeConfiguration__Group_5_1__1 : rule__CompositeConfiguration__Group_5_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1302:1: ( rule__CompositeConfiguration__Group_5_1__1__Impl )
            // InternalCosaDsl.g:1303:2: rule__CompositeConfiguration__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_5_1__1__Impl"
    // InternalCosaDsl.g:1309:1: rule__CompositeConfiguration__Group_5_1__1__Impl : ( ( rule__CompositeConfiguration__PortsAssignment_5_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1313:1: ( ( ( rule__CompositeConfiguration__PortsAssignment_5_1_1 ) ) )
            // InternalCosaDsl.g:1314:1: ( ( rule__CompositeConfiguration__PortsAssignment_5_1_1 ) )
            {
            // InternalCosaDsl.g:1314:1: ( ( rule__CompositeConfiguration__PortsAssignment_5_1_1 ) )
            // InternalCosaDsl.g:1315:2: ( rule__CompositeConfiguration__PortsAssignment_5_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_5_1_1()); 
            // InternalCosaDsl.g:1316:2: ( rule__CompositeConfiguration__PortsAssignment_5_1_1 )
            // InternalCosaDsl.g:1316:3: rule__CompositeConfiguration__PortsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__PortsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_5_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_6__0"
    // InternalCosaDsl.g:1325:1: rule__CompositeConfiguration__Group_6__0 : rule__CompositeConfiguration__Group_6__0__Impl rule__CompositeConfiguration__Group_6__1 ;
    public final void rule__CompositeConfiguration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1329:1: ( rule__CompositeConfiguration__Group_6__0__Impl rule__CompositeConfiguration__Group_6__1 )
            // InternalCosaDsl.g:1330:2: rule__CompositeConfiguration__Group_6__0__Impl rule__CompositeConfiguration__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeConfiguration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_6__0__Impl"
    // InternalCosaDsl.g:1337:1: rule__CompositeConfiguration__Group_6__0__Impl : ( ( rule__CompositeConfiguration__BindingsAssignment_6_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1341:1: ( ( ( rule__CompositeConfiguration__BindingsAssignment_6_0 ) ) )
            // InternalCosaDsl.g:1342:1: ( ( rule__CompositeConfiguration__BindingsAssignment_6_0 ) )
            {
            // InternalCosaDsl.g:1342:1: ( ( rule__CompositeConfiguration__BindingsAssignment_6_0 ) )
            // InternalCosaDsl.g:1343:2: ( rule__CompositeConfiguration__BindingsAssignment_6_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_6_0()); 
            // InternalCosaDsl.g:1344:2: ( rule__CompositeConfiguration__BindingsAssignment_6_0 )
            // InternalCosaDsl.g:1344:3: rule__CompositeConfiguration__BindingsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__BindingsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_6__1"
    // InternalCosaDsl.g:1352:1: rule__CompositeConfiguration__Group_6__1 : rule__CompositeConfiguration__Group_6__1__Impl ;
    public final void rule__CompositeConfiguration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1356:1: ( rule__CompositeConfiguration__Group_6__1__Impl )
            // InternalCosaDsl.g:1357:2: rule__CompositeConfiguration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_6__1__Impl"
    // InternalCosaDsl.g:1363:1: rule__CompositeConfiguration__Group_6__1__Impl : ( ( rule__CompositeConfiguration__Group_6_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1367:1: ( ( ( rule__CompositeConfiguration__Group_6_1__0 )* ) )
            // InternalCosaDsl.g:1368:1: ( ( rule__CompositeConfiguration__Group_6_1__0 )* )
            {
            // InternalCosaDsl.g:1368:1: ( ( rule__CompositeConfiguration__Group_6_1__0 )* )
            // InternalCosaDsl.g:1369:2: ( rule__CompositeConfiguration__Group_6_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_6_1()); 
            // InternalCosaDsl.g:1370:2: ( rule__CompositeConfiguration__Group_6_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCosaDsl.g:1370:3: rule__CompositeConfiguration__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CompositeConfiguration__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_6_1__0"
    // InternalCosaDsl.g:1379:1: rule__CompositeConfiguration__Group_6_1__0 : rule__CompositeConfiguration__Group_6_1__0__Impl rule__CompositeConfiguration__Group_6_1__1 ;
    public final void rule__CompositeConfiguration__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1383:1: ( rule__CompositeConfiguration__Group_6_1__0__Impl rule__CompositeConfiguration__Group_6_1__1 )
            // InternalCosaDsl.g:1384:2: rule__CompositeConfiguration__Group_6_1__0__Impl rule__CompositeConfiguration__Group_6_1__1
            {
            pushFollow(FOLLOW_16);
            rule__CompositeConfiguration__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_6_1__0__Impl"
    // InternalCosaDsl.g:1391:1: rule__CompositeConfiguration__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1395:1: ( ( ',' ) )
            // InternalCosaDsl.g:1396:1: ( ',' )
            {
            // InternalCosaDsl.g:1396:1: ( ',' )
            // InternalCosaDsl.g:1397:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_6_1__1"
    // InternalCosaDsl.g:1406:1: rule__CompositeConfiguration__Group_6_1__1 : rule__CompositeConfiguration__Group_6_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1410:1: ( rule__CompositeConfiguration__Group_6_1__1__Impl )
            // InternalCosaDsl.g:1411:2: rule__CompositeConfiguration__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_6_1__1__Impl"
    // InternalCosaDsl.g:1417:1: rule__CompositeConfiguration__Group_6_1__1__Impl : ( ( rule__CompositeConfiguration__BindingsAssignment_6_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1421:1: ( ( ( rule__CompositeConfiguration__BindingsAssignment_6_1_1 ) ) )
            // InternalCosaDsl.g:1422:1: ( ( rule__CompositeConfiguration__BindingsAssignment_6_1_1 ) )
            {
            // InternalCosaDsl.g:1422:1: ( ( rule__CompositeConfiguration__BindingsAssignment_6_1_1 ) )
            // InternalCosaDsl.g:1423:2: ( rule__CompositeConfiguration__BindingsAssignment_6_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_6_1_1()); 
            // InternalCosaDsl.g:1424:2: ( rule__CompositeConfiguration__BindingsAssignment_6_1_1 )
            // InternalCosaDsl.g:1424:3: rule__CompositeConfiguration__BindingsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__BindingsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_6_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_7__0"
    // InternalCosaDsl.g:1433:1: rule__CompositeConfiguration__Group_7__0 : rule__CompositeConfiguration__Group_7__0__Impl rule__CompositeConfiguration__Group_7__1 ;
    public final void rule__CompositeConfiguration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1437:1: ( rule__CompositeConfiguration__Group_7__0__Impl rule__CompositeConfiguration__Group_7__1 )
            // InternalCosaDsl.g:1438:2: rule__CompositeConfiguration__Group_7__0__Impl rule__CompositeConfiguration__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeConfiguration__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_7__0__Impl"
    // InternalCosaDsl.g:1445:1: rule__CompositeConfiguration__Group_7__0__Impl : ( ( rule__CompositeConfiguration__AttachementsAssignment_7_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1449:1: ( ( ( rule__CompositeConfiguration__AttachementsAssignment_7_0 ) ) )
            // InternalCosaDsl.g:1450:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_7_0 ) )
            {
            // InternalCosaDsl.g:1450:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_7_0 ) )
            // InternalCosaDsl.g:1451:2: ( rule__CompositeConfiguration__AttachementsAssignment_7_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_7_0()); 
            // InternalCosaDsl.g:1452:2: ( rule__CompositeConfiguration__AttachementsAssignment_7_0 )
            // InternalCosaDsl.g:1452:3: rule__CompositeConfiguration__AttachementsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__AttachementsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_7__1"
    // InternalCosaDsl.g:1460:1: rule__CompositeConfiguration__Group_7__1 : rule__CompositeConfiguration__Group_7__1__Impl ;
    public final void rule__CompositeConfiguration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1464:1: ( rule__CompositeConfiguration__Group_7__1__Impl )
            // InternalCosaDsl.g:1465:2: rule__CompositeConfiguration__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_7__1__Impl"
    // InternalCosaDsl.g:1471:1: rule__CompositeConfiguration__Group_7__1__Impl : ( ( rule__CompositeConfiguration__Group_7_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1475:1: ( ( ( rule__CompositeConfiguration__Group_7_1__0 )* ) )
            // InternalCosaDsl.g:1476:1: ( ( rule__CompositeConfiguration__Group_7_1__0 )* )
            {
            // InternalCosaDsl.g:1476:1: ( ( rule__CompositeConfiguration__Group_7_1__0 )* )
            // InternalCosaDsl.g:1477:2: ( rule__CompositeConfiguration__Group_7_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_7_1()); 
            // InternalCosaDsl.g:1478:2: ( rule__CompositeConfiguration__Group_7_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCosaDsl.g:1478:3: rule__CompositeConfiguration__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CompositeConfiguration__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_7_1__0"
    // InternalCosaDsl.g:1487:1: rule__CompositeConfiguration__Group_7_1__0 : rule__CompositeConfiguration__Group_7_1__0__Impl rule__CompositeConfiguration__Group_7_1__1 ;
    public final void rule__CompositeConfiguration__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1491:1: ( rule__CompositeConfiguration__Group_7_1__0__Impl rule__CompositeConfiguration__Group_7_1__1 )
            // InternalCosaDsl.g:1492:2: rule__CompositeConfiguration__Group_7_1__0__Impl rule__CompositeConfiguration__Group_7_1__1
            {
            pushFollow(FOLLOW_17);
            rule__CompositeConfiguration__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_7_1__0__Impl"
    // InternalCosaDsl.g:1499:1: rule__CompositeConfiguration__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1503:1: ( ( ',' ) )
            // InternalCosaDsl.g:1504:1: ( ',' )
            {
            // InternalCosaDsl.g:1504:1: ( ',' )
            // InternalCosaDsl.g:1505:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_7_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_7_1__1"
    // InternalCosaDsl.g:1514:1: rule__CompositeConfiguration__Group_7_1__1 : rule__CompositeConfiguration__Group_7_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1518:1: ( rule__CompositeConfiguration__Group_7_1__1__Impl )
            // InternalCosaDsl.g:1519:2: rule__CompositeConfiguration__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_7_1__1__Impl"
    // InternalCosaDsl.g:1525:1: rule__CompositeConfiguration__Group_7_1__1__Impl : ( ( rule__CompositeConfiguration__AttachementsAssignment_7_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1529:1: ( ( ( rule__CompositeConfiguration__AttachementsAssignment_7_1_1 ) ) )
            // InternalCosaDsl.g:1530:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_7_1_1 ) )
            {
            // InternalCosaDsl.g:1530:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_7_1_1 ) )
            // InternalCosaDsl.g:1531:2: ( rule__CompositeConfiguration__AttachementsAssignment_7_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_7_1_1()); 
            // InternalCosaDsl.g:1532:2: ( rule__CompositeConfiguration__AttachementsAssignment_7_1_1 )
            // InternalCosaDsl.g:1532:3: rule__CompositeConfiguration__AttachementsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__AttachementsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_7_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_8__0"
    // InternalCosaDsl.g:1541:1: rule__CompositeConfiguration__Group_8__0 : rule__CompositeConfiguration__Group_8__0__Impl rule__CompositeConfiguration__Group_8__1 ;
    public final void rule__CompositeConfiguration__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1545:1: ( rule__CompositeConfiguration__Group_8__0__Impl rule__CompositeConfiguration__Group_8__1 )
            // InternalCosaDsl.g:1546:2: rule__CompositeConfiguration__Group_8__0__Impl rule__CompositeConfiguration__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeConfiguration__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_8__0__Impl"
    // InternalCosaDsl.g:1553:1: rule__CompositeConfiguration__Group_8__0__Impl : ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1557:1: ( ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_0 ) ) )
            // InternalCosaDsl.g:1558:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_0 ) )
            {
            // InternalCosaDsl.g:1558:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_0 ) )
            // InternalCosaDsl.g:1559:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_8_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_8_0()); 
            // InternalCosaDsl.g:1560:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_8_0 )
            // InternalCosaDsl.g:1560:3: rule__CompositeConfiguration__ConfigurationsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConfigurationsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_8__1"
    // InternalCosaDsl.g:1568:1: rule__CompositeConfiguration__Group_8__1 : rule__CompositeConfiguration__Group_8__1__Impl ;
    public final void rule__CompositeConfiguration__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1572:1: ( rule__CompositeConfiguration__Group_8__1__Impl )
            // InternalCosaDsl.g:1573:2: rule__CompositeConfiguration__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_8__1__Impl"
    // InternalCosaDsl.g:1579:1: rule__CompositeConfiguration__Group_8__1__Impl : ( ( rule__CompositeConfiguration__Group_8_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1583:1: ( ( ( rule__CompositeConfiguration__Group_8_1__0 )* ) )
            // InternalCosaDsl.g:1584:1: ( ( rule__CompositeConfiguration__Group_8_1__0 )* )
            {
            // InternalCosaDsl.g:1584:1: ( ( rule__CompositeConfiguration__Group_8_1__0 )* )
            // InternalCosaDsl.g:1585:2: ( rule__CompositeConfiguration__Group_8_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_8_1()); 
            // InternalCosaDsl.g:1586:2: ( rule__CompositeConfiguration__Group_8_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCosaDsl.g:1586:3: rule__CompositeConfiguration__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CompositeConfiguration__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_8_1__0"
    // InternalCosaDsl.g:1595:1: rule__CompositeConfiguration__Group_8_1__0 : rule__CompositeConfiguration__Group_8_1__0__Impl rule__CompositeConfiguration__Group_8_1__1 ;
    public final void rule__CompositeConfiguration__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1599:1: ( rule__CompositeConfiguration__Group_8_1__0__Impl rule__CompositeConfiguration__Group_8_1__1 )
            // InternalCosaDsl.g:1600:2: rule__CompositeConfiguration__Group_8_1__0__Impl rule__CompositeConfiguration__Group_8_1__1
            {
            pushFollow(FOLLOW_18);
            rule__CompositeConfiguration__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_8_1__0__Impl"
    // InternalCosaDsl.g:1607:1: rule__CompositeConfiguration__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1611:1: ( ( ',' ) )
            // InternalCosaDsl.g:1612:1: ( ',' )
            {
            // InternalCosaDsl.g:1612:1: ( ',' )
            // InternalCosaDsl.g:1613:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_8_1__1"
    // InternalCosaDsl.g:1622:1: rule__CompositeConfiguration__Group_8_1__1 : rule__CompositeConfiguration__Group_8_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1626:1: ( rule__CompositeConfiguration__Group_8_1__1__Impl )
            // InternalCosaDsl.g:1627:2: rule__CompositeConfiguration__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_8_1__1__Impl"
    // InternalCosaDsl.g:1633:1: rule__CompositeConfiguration__Group_8_1__1__Impl : ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1637:1: ( ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 ) ) )
            // InternalCosaDsl.g:1638:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 ) )
            {
            // InternalCosaDsl.g:1638:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 ) )
            // InternalCosaDsl.g:1639:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_8_1_1()); 
            // InternalCosaDsl.g:1640:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 )
            // InternalCosaDsl.g:1640:3: rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__Group_8_1__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalCosaDsl.g:1649:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1653:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalCosaDsl.g:1654:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalCosaDsl.g:1661:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1665:1: ( ( 'Component' ) )
            // InternalCosaDsl.g:1666:1: ( 'Component' )
            {
            // InternalCosaDsl.g:1666:1: ( 'Component' )
            // InternalCosaDsl.g:1667:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalCosaDsl.g:1676:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1680:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalCosaDsl.g:1681:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalCosaDsl.g:1688:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1692:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:1693:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:1693:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalCosaDsl.g:1694:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:1695:2: ( rule__Component__NameAssignment_1 )
            // InternalCosaDsl.g:1695:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalCosaDsl.g:1703:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1707:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalCosaDsl.g:1708:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalCosaDsl.g:1715:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1719:1: ( ( '{' ) )
            // InternalCosaDsl.g:1720:1: ( '{' )
            {
            // InternalCosaDsl.g:1720:1: ( '{' )
            // InternalCosaDsl.g:1721:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalCosaDsl.g:1730:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1734:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalCosaDsl.g:1735:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalCosaDsl.g:1742:1: rule__Component__Group__3__Impl : ( ( rule__Component__PortsAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1746:1: ( ( ( rule__Component__PortsAssignment_3 ) ) )
            // InternalCosaDsl.g:1747:1: ( ( rule__Component__PortsAssignment_3 ) )
            {
            // InternalCosaDsl.g:1747:1: ( ( rule__Component__PortsAssignment_3 ) )
            // InternalCosaDsl.g:1748:2: ( rule__Component__PortsAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_3()); 
            // InternalCosaDsl.g:1749:2: ( rule__Component__PortsAssignment_3 )
            // InternalCosaDsl.g:1749:3: rule__Component__PortsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__PortsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPortsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalCosaDsl.g:1757:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1761:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalCosaDsl.g:1762:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalCosaDsl.g:1769:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1773:1: ( ( ( rule__Component__Group_4__0 )* ) )
            // InternalCosaDsl.g:1774:1: ( ( rule__Component__Group_4__0 )* )
            {
            // InternalCosaDsl.g:1774:1: ( ( rule__Component__Group_4__0 )* )
            // InternalCosaDsl.g:1775:2: ( rule__Component__Group_4__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // InternalCosaDsl.g:1776:2: ( rule__Component__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCosaDsl.g:1776:3: rule__Component__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalCosaDsl.g:1784:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1788:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalCosaDsl.g:1789:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalCosaDsl.g:1796:1: rule__Component__Group__5__Impl : ( ( rule__Component__ServicesAssignment_5 ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1800:1: ( ( ( rule__Component__ServicesAssignment_5 ) ) )
            // InternalCosaDsl.g:1801:1: ( ( rule__Component__ServicesAssignment_5 ) )
            {
            // InternalCosaDsl.g:1801:1: ( ( rule__Component__ServicesAssignment_5 ) )
            // InternalCosaDsl.g:1802:2: ( rule__Component__ServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getServicesAssignment_5()); 
            // InternalCosaDsl.g:1803:2: ( rule__Component__ServicesAssignment_5 )
            // InternalCosaDsl.g:1803:3: rule__Component__ServicesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Component__ServicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getServicesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalCosaDsl.g:1811:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1815:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalCosaDsl.g:1816:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalCosaDsl.g:1823:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1827:1: ( ( ( rule__Component__Group_6__0 )* ) )
            // InternalCosaDsl.g:1828:1: ( ( rule__Component__Group_6__0 )* )
            {
            // InternalCosaDsl.g:1828:1: ( ( rule__Component__Group_6__0 )* )
            // InternalCosaDsl.g:1829:2: ( rule__Component__Group_6__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_6()); 
            // InternalCosaDsl.g:1830:2: ( rule__Component__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCosaDsl.g:1830:3: rule__Component__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalCosaDsl.g:1838:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1842:1: ( rule__Component__Group__7__Impl )
            // InternalCosaDsl.g:1843:2: rule__Component__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalCosaDsl.g:1849:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1853:1: ( ( '}' ) )
            // InternalCosaDsl.g:1854:1: ( '}' )
            {
            // InternalCosaDsl.g:1854:1: ( '}' )
            // InternalCosaDsl.g:1855:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // InternalCosaDsl.g:1865:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1869:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // InternalCosaDsl.g:1870:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // InternalCosaDsl.g:1877:1: rule__Component__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1881:1: ( ( ',' ) )
            // InternalCosaDsl.g:1882:1: ( ',' )
            {
            // InternalCosaDsl.g:1882:1: ( ',' )
            // InternalCosaDsl.g:1883:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // InternalCosaDsl.g:1892:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1896:1: ( rule__Component__Group_4__1__Impl )
            // InternalCosaDsl.g:1897:2: rule__Component__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // InternalCosaDsl.g:1903:1: rule__Component__Group_4__1__Impl : ( ( rule__Component__PortsAssignment_4_1 ) ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1907:1: ( ( ( rule__Component__PortsAssignment_4_1 ) ) )
            // InternalCosaDsl.g:1908:1: ( ( rule__Component__PortsAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:1908:1: ( ( rule__Component__PortsAssignment_4_1 ) )
            // InternalCosaDsl.g:1909:2: ( rule__Component__PortsAssignment_4_1 )
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_4_1()); 
            // InternalCosaDsl.g:1910:2: ( rule__Component__PortsAssignment_4_1 )
            // InternalCosaDsl.g:1910:3: rule__Component__PortsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__PortsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPortsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_6__0"
    // InternalCosaDsl.g:1919:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1923:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // InternalCosaDsl.g:1924:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__0"


    // $ANTLR start "rule__Component__Group_6__0__Impl"
    // InternalCosaDsl.g:1931:1: rule__Component__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1935:1: ( ( ',' ) )
            // InternalCosaDsl.g:1936:1: ( ',' )
            {
            // InternalCosaDsl.g:1936:1: ( ',' )
            // InternalCosaDsl.g:1937:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__0__Impl"


    // $ANTLR start "rule__Component__Group_6__1"
    // InternalCosaDsl.g:1946:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1950:1: ( rule__Component__Group_6__1__Impl )
            // InternalCosaDsl.g:1951:2: rule__Component__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__1"


    // $ANTLR start "rule__Component__Group_6__1__Impl"
    // InternalCosaDsl.g:1957:1: rule__Component__Group_6__1__Impl : ( ( rule__Component__ServicesAssignment_6_1 ) ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1961:1: ( ( ( rule__Component__ServicesAssignment_6_1 ) ) )
            // InternalCosaDsl.g:1962:1: ( ( rule__Component__ServicesAssignment_6_1 ) )
            {
            // InternalCosaDsl.g:1962:1: ( ( rule__Component__ServicesAssignment_6_1 ) )
            // InternalCosaDsl.g:1963:2: ( rule__Component__ServicesAssignment_6_1 )
            {
             before(grammarAccess.getComponentAccess().getServicesAssignment_6_1()); 
            // InternalCosaDsl.g:1964:2: ( rule__Component__ServicesAssignment_6_1 )
            // InternalCosaDsl.g:1964:3: rule__Component__ServicesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ServicesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getServicesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__1__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalCosaDsl.g:1973:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1977:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCosaDsl.g:1978:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalCosaDsl.g:1985:1: rule__Connector__Group__0__Impl : ( 'Connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1989:1: ( ( 'Connector' ) )
            // InternalCosaDsl.g:1990:1: ( 'Connector' )
            {
            // InternalCosaDsl.g:1990:1: ( 'Connector' )
            // InternalCosaDsl.g:1991:2: 'Connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalCosaDsl.g:2000:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2004:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalCosaDsl.g:2005:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalCosaDsl.g:2012:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2016:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:2017:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:2017:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalCosaDsl.g:2018:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:2019:2: ( rule__Connector__NameAssignment_1 )
            // InternalCosaDsl.g:2019:3: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalCosaDsl.g:2027:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2031:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalCosaDsl.g:2032:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalCosaDsl.g:2039:1: rule__Connector__Group__2__Impl : ( '{' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2043:1: ( ( '{' ) )
            // InternalCosaDsl.g:2044:1: ( '{' )
            {
            // InternalCosaDsl.g:2044:1: ( '{' )
            // InternalCosaDsl.g:2045:2: '{'
            {
             before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // InternalCosaDsl.g:2054:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2058:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalCosaDsl.g:2059:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // InternalCosaDsl.g:2066:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__RolesAssignment_3 ) ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2070:1: ( ( ( rule__Connector__RolesAssignment_3 ) ) )
            // InternalCosaDsl.g:2071:1: ( ( rule__Connector__RolesAssignment_3 ) )
            {
            // InternalCosaDsl.g:2071:1: ( ( rule__Connector__RolesAssignment_3 ) )
            // InternalCosaDsl.g:2072:2: ( rule__Connector__RolesAssignment_3 )
            {
             before(grammarAccess.getConnectorAccess().getRolesAssignment_3()); 
            // InternalCosaDsl.g:2073:2: ( rule__Connector__RolesAssignment_3 )
            // InternalCosaDsl.g:2073:3: rule__Connector__RolesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RolesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRolesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // InternalCosaDsl.g:2081:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2085:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalCosaDsl.g:2086:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Connector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // InternalCosaDsl.g:2093:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__Group_4__0 )* ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2097:1: ( ( ( rule__Connector__Group_4__0 )* ) )
            // InternalCosaDsl.g:2098:1: ( ( rule__Connector__Group_4__0 )* )
            {
            // InternalCosaDsl.g:2098:1: ( ( rule__Connector__Group_4__0 )* )
            // InternalCosaDsl.g:2099:2: ( rule__Connector__Group_4__0 )*
            {
             before(grammarAccess.getConnectorAccess().getGroup_4()); 
            // InternalCosaDsl.g:2100:2: ( rule__Connector__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCosaDsl.g:2100:3: rule__Connector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Connector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getConnectorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__Connector__Group__5"
    // InternalCosaDsl.g:2108:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2112:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalCosaDsl.g:2113:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Connector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__5"


    // $ANTLR start "rule__Connector__Group__5__Impl"
    // InternalCosaDsl.g:2120:1: rule__Connector__Group__5__Impl : ( ( rule__Connector__Group_5__0 )? ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2124:1: ( ( ( rule__Connector__Group_5__0 )? ) )
            // InternalCosaDsl.g:2125:1: ( ( rule__Connector__Group_5__0 )? )
            {
            // InternalCosaDsl.g:2125:1: ( ( rule__Connector__Group_5__0 )? )
            // InternalCosaDsl.g:2126:2: ( rule__Connector__Group_5__0 )?
            {
             before(grammarAccess.getConnectorAccess().getGroup_5()); 
            // InternalCosaDsl.g:2127:2: ( rule__Connector__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCosaDsl.g:2127:3: rule__Connector__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__5__Impl"


    // $ANTLR start "rule__Connector__Group__6"
    // InternalCosaDsl.g:2135:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2139:1: ( rule__Connector__Group__6__Impl )
            // InternalCosaDsl.g:2140:2: rule__Connector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__6"


    // $ANTLR start "rule__Connector__Group__6__Impl"
    // InternalCosaDsl.g:2146:1: rule__Connector__Group__6__Impl : ( '}' ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2150:1: ( ( '}' ) )
            // InternalCosaDsl.g:2151:1: ( '}' )
            {
            // InternalCosaDsl.g:2151:1: ( '}' )
            // InternalCosaDsl.g:2152:2: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__6__Impl"


    // $ANTLR start "rule__Connector__Group_4__0"
    // InternalCosaDsl.g:2162:1: rule__Connector__Group_4__0 : rule__Connector__Group_4__0__Impl rule__Connector__Group_4__1 ;
    public final void rule__Connector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2166:1: ( rule__Connector__Group_4__0__Impl rule__Connector__Group_4__1 )
            // InternalCosaDsl.g:2167:2: rule__Connector__Group_4__0__Impl rule__Connector__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Connector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_4__0"


    // $ANTLR start "rule__Connector__Group_4__0__Impl"
    // InternalCosaDsl.g:2174:1: rule__Connector__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Connector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2178:1: ( ( ',' ) )
            // InternalCosaDsl.g:2179:1: ( ',' )
            {
            // InternalCosaDsl.g:2179:1: ( ',' )
            // InternalCosaDsl.g:2180:2: ','
            {
             before(grammarAccess.getConnectorAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_4__0__Impl"


    // $ANTLR start "rule__Connector__Group_4__1"
    // InternalCosaDsl.g:2189:1: rule__Connector__Group_4__1 : rule__Connector__Group_4__1__Impl ;
    public final void rule__Connector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2193:1: ( rule__Connector__Group_4__1__Impl )
            // InternalCosaDsl.g:2194:2: rule__Connector__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_4__1"


    // $ANTLR start "rule__Connector__Group_4__1__Impl"
    // InternalCosaDsl.g:2200:1: rule__Connector__Group_4__1__Impl : ( ( rule__Connector__RolesAssignment_4_1 ) ) ;
    public final void rule__Connector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2204:1: ( ( ( rule__Connector__RolesAssignment_4_1 ) ) )
            // InternalCosaDsl.g:2205:1: ( ( rule__Connector__RolesAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:2205:1: ( ( rule__Connector__RolesAssignment_4_1 ) )
            // InternalCosaDsl.g:2206:2: ( rule__Connector__RolesAssignment_4_1 )
            {
             before(grammarAccess.getConnectorAccess().getRolesAssignment_4_1()); 
            // InternalCosaDsl.g:2207:2: ( rule__Connector__RolesAssignment_4_1 )
            // InternalCosaDsl.g:2207:3: rule__Connector__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRolesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_4__1__Impl"


    // $ANTLR start "rule__Connector__Group_5__0"
    // InternalCosaDsl.g:2216:1: rule__Connector__Group_5__0 : rule__Connector__Group_5__0__Impl rule__Connector__Group_5__1 ;
    public final void rule__Connector__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2220:1: ( rule__Connector__Group_5__0__Impl rule__Connector__Group_5__1 )
            // InternalCosaDsl.g:2221:2: rule__Connector__Group_5__0__Impl rule__Connector__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__Connector__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5__0"


    // $ANTLR start "rule__Connector__Group_5__0__Impl"
    // InternalCosaDsl.g:2228:1: rule__Connector__Group_5__0__Impl : ( 'glue' ) ;
    public final void rule__Connector__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2232:1: ( ( 'glue' ) )
            // InternalCosaDsl.g:2233:1: ( 'glue' )
            {
            // InternalCosaDsl.g:2233:1: ( 'glue' )
            // InternalCosaDsl.g:2234:2: 'glue'
            {
             before(grammarAccess.getConnectorAccess().getGlueKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getGlueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5__0__Impl"


    // $ANTLR start "rule__Connector__Group_5__1"
    // InternalCosaDsl.g:2243:1: rule__Connector__Group_5__1 : rule__Connector__Group_5__1__Impl ;
    public final void rule__Connector__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2247:1: ( rule__Connector__Group_5__1__Impl )
            // InternalCosaDsl.g:2248:2: rule__Connector__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5__1"


    // $ANTLR start "rule__Connector__Group_5__1__Impl"
    // InternalCosaDsl.g:2254:1: rule__Connector__Group_5__1__Impl : ( ( rule__Connector__GlueAssignment_5_1 ) ) ;
    public final void rule__Connector__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2258:1: ( ( ( rule__Connector__GlueAssignment_5_1 ) ) )
            // InternalCosaDsl.g:2259:1: ( ( rule__Connector__GlueAssignment_5_1 ) )
            {
            // InternalCosaDsl.g:2259:1: ( ( rule__Connector__GlueAssignment_5_1 ) )
            // InternalCosaDsl.g:2260:2: ( rule__Connector__GlueAssignment_5_1 )
            {
             before(grammarAccess.getConnectorAccess().getGlueAssignment_5_1()); 
            // InternalCosaDsl.g:2261:2: ( rule__Connector__GlueAssignment_5_1 )
            // InternalCosaDsl.g:2261:3: rule__Connector__GlueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__GlueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGlueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5__1__Impl"


    // $ANTLR start "rule__Port_Impl__Group__0"
    // InternalCosaDsl.g:2270:1: rule__Port_Impl__Group__0 : rule__Port_Impl__Group__0__Impl rule__Port_Impl__Group__1 ;
    public final void rule__Port_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2274:1: ( rule__Port_Impl__Group__0__Impl rule__Port_Impl__Group__1 )
            // InternalCosaDsl.g:2275:2: rule__Port_Impl__Group__0__Impl rule__Port_Impl__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Port_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__Group__0"


    // $ANTLR start "rule__Port_Impl__Group__0__Impl"
    // InternalCosaDsl.g:2282:1: rule__Port_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Port_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2286:1: ( ( () ) )
            // InternalCosaDsl.g:2287:1: ( () )
            {
            // InternalCosaDsl.g:2287:1: ( () )
            // InternalCosaDsl.g:2288:2: ()
            {
             before(grammarAccess.getPort_ImplAccess().getPortAction_0()); 
            // InternalCosaDsl.g:2289:2: ()
            // InternalCosaDsl.g:2289:3: 
            {
            }

             after(grammarAccess.getPort_ImplAccess().getPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__Group__0__Impl"


    // $ANTLR start "rule__Port_Impl__Group__1"
    // InternalCosaDsl.g:2297:1: rule__Port_Impl__Group__1 : rule__Port_Impl__Group__1__Impl rule__Port_Impl__Group__2 ;
    public final void rule__Port_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2301:1: ( rule__Port_Impl__Group__1__Impl rule__Port_Impl__Group__2 )
            // InternalCosaDsl.g:2302:2: rule__Port_Impl__Group__1__Impl rule__Port_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Port_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__Group__1"


    // $ANTLR start "rule__Port_Impl__Group__1__Impl"
    // InternalCosaDsl.g:2309:1: rule__Port_Impl__Group__1__Impl : ( 'Port' ) ;
    public final void rule__Port_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2313:1: ( ( 'Port' ) )
            // InternalCosaDsl.g:2314:1: ( 'Port' )
            {
            // InternalCosaDsl.g:2314:1: ( 'Port' )
            // InternalCosaDsl.g:2315:2: 'Port'
            {
             before(grammarAccess.getPort_ImplAccess().getPortKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPort_ImplAccess().getPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__Group__1__Impl"


    // $ANTLR start "rule__Port_Impl__Group__2"
    // InternalCosaDsl.g:2324:1: rule__Port_Impl__Group__2 : rule__Port_Impl__Group__2__Impl ;
    public final void rule__Port_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2328:1: ( rule__Port_Impl__Group__2__Impl )
            // InternalCosaDsl.g:2329:2: rule__Port_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__Group__2"


    // $ANTLR start "rule__Port_Impl__Group__2__Impl"
    // InternalCosaDsl.g:2335:1: rule__Port_Impl__Group__2__Impl : ( ( rule__Port_Impl__NameAssignment_2 ) ) ;
    public final void rule__Port_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2339:1: ( ( ( rule__Port_Impl__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:2340:1: ( ( rule__Port_Impl__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:2340:1: ( ( rule__Port_Impl__NameAssignment_2 ) )
            // InternalCosaDsl.g:2341:2: ( rule__Port_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getPort_ImplAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:2342:2: ( rule__Port_Impl__NameAssignment_2 )
            // InternalCosaDsl.g:2342:3: rule__Port_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Port_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPort_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalCosaDsl.g:2351:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2355:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalCosaDsl.g:2356:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalCosaDsl.g:2363:1: rule__Binding__Group__0__Impl : ( 'Binding' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2367:1: ( ( 'Binding' ) )
            // InternalCosaDsl.g:2368:1: ( 'Binding' )
            {
            // InternalCosaDsl.g:2368:1: ( 'Binding' )
            // InternalCosaDsl.g:2369:2: 'Binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBindingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalCosaDsl.g:2378:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2382:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalCosaDsl.g:2383:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalCosaDsl.g:2390:1: rule__Binding__Group__1__Impl : ( '(' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2394:1: ( ( '(' ) )
            // InternalCosaDsl.g:2395:1: ( '(' )
            {
            // InternalCosaDsl.g:2395:1: ( '(' )
            // InternalCosaDsl.g:2396:2: '('
            {
             before(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalCosaDsl.g:2405:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2409:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalCosaDsl.g:2410:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalCosaDsl.g:2417:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ConfigurationProviderAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2421:1: ( ( ( rule__Binding__ConfigurationProviderAssignment_2 ) ) )
            // InternalCosaDsl.g:2422:1: ( ( rule__Binding__ConfigurationProviderAssignment_2 ) )
            {
            // InternalCosaDsl.g:2422:1: ( ( rule__Binding__ConfigurationProviderAssignment_2 ) )
            // InternalCosaDsl.g:2423:2: ( rule__Binding__ConfigurationProviderAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getConfigurationProviderAssignment_2()); 
            // InternalCosaDsl.g:2424:2: ( rule__Binding__ConfigurationProviderAssignment_2 )
            // InternalCosaDsl.g:2424:3: rule__Binding__ConfigurationProviderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ConfigurationProviderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getConfigurationProviderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalCosaDsl.g:2432:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2436:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalCosaDsl.g:2437:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalCosaDsl.g:2444:1: rule__Binding__Group__3__Impl : ( '.' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2448:1: ( ( '.' ) )
            // InternalCosaDsl.g:2449:1: ( '.' )
            {
            // InternalCosaDsl.g:2449:1: ( '.' )
            // InternalCosaDsl.g:2450:2: '.'
            {
             before(grammarAccess.getBindingAccess().getFullStopKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalCosaDsl.g:2459:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2463:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalCosaDsl.g:2464:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalCosaDsl.g:2471:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__PortProvidedAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2475:1: ( ( ( rule__Binding__PortProvidedAssignment_4 ) ) )
            // InternalCosaDsl.g:2476:1: ( ( rule__Binding__PortProvidedAssignment_4 ) )
            {
            // InternalCosaDsl.g:2476:1: ( ( rule__Binding__PortProvidedAssignment_4 ) )
            // InternalCosaDsl.g:2477:2: ( rule__Binding__PortProvidedAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getPortProvidedAssignment_4()); 
            // InternalCosaDsl.g:2478:2: ( rule__Binding__PortProvidedAssignment_4 )
            // InternalCosaDsl.g:2478:3: rule__Binding__PortProvidedAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Binding__PortProvidedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getPortProvidedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // InternalCosaDsl.g:2486:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl rule__Binding__Group__6 ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2490:1: ( rule__Binding__Group__5__Impl rule__Binding__Group__6 )
            // InternalCosaDsl.g:2491:2: rule__Binding__Group__5__Impl rule__Binding__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Binding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalCosaDsl.g:2498:1: rule__Binding__Group__5__Impl : ( ',' ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2502:1: ( ( ',' ) )
            // InternalCosaDsl.g:2503:1: ( ',' )
            {
            // InternalCosaDsl.g:2503:1: ( ',' )
            // InternalCosaDsl.g:2504:2: ','
            {
             before(grammarAccess.getBindingAccess().getCommaKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__6"
    // InternalCosaDsl.g:2513:1: rule__Binding__Group__6 : rule__Binding__Group__6__Impl rule__Binding__Group__7 ;
    public final void rule__Binding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2517:1: ( rule__Binding__Group__6__Impl rule__Binding__Group__7 )
            // InternalCosaDsl.g:2518:2: rule__Binding__Group__6__Impl rule__Binding__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Binding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__6"


    // $ANTLR start "rule__Binding__Group__6__Impl"
    // InternalCosaDsl.g:2525:1: rule__Binding__Group__6__Impl : ( ( rule__Binding__ComponentSubscriberAssignment_6 ) ) ;
    public final void rule__Binding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2529:1: ( ( ( rule__Binding__ComponentSubscriberAssignment_6 ) ) )
            // InternalCosaDsl.g:2530:1: ( ( rule__Binding__ComponentSubscriberAssignment_6 ) )
            {
            // InternalCosaDsl.g:2530:1: ( ( rule__Binding__ComponentSubscriberAssignment_6 ) )
            // InternalCosaDsl.g:2531:2: ( rule__Binding__ComponentSubscriberAssignment_6 )
            {
             before(grammarAccess.getBindingAccess().getComponentSubscriberAssignment_6()); 
            // InternalCosaDsl.g:2532:2: ( rule__Binding__ComponentSubscriberAssignment_6 )
            // InternalCosaDsl.g:2532:3: rule__Binding__ComponentSubscriberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ComponentSubscriberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getComponentSubscriberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__6__Impl"


    // $ANTLR start "rule__Binding__Group__7"
    // InternalCosaDsl.g:2540:1: rule__Binding__Group__7 : rule__Binding__Group__7__Impl rule__Binding__Group__8 ;
    public final void rule__Binding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2544:1: ( rule__Binding__Group__7__Impl rule__Binding__Group__8 )
            // InternalCosaDsl.g:2545:2: rule__Binding__Group__7__Impl rule__Binding__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Binding__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__7"


    // $ANTLR start "rule__Binding__Group__7__Impl"
    // InternalCosaDsl.g:2552:1: rule__Binding__Group__7__Impl : ( '.' ) ;
    public final void rule__Binding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2556:1: ( ( '.' ) )
            // InternalCosaDsl.g:2557:1: ( '.' )
            {
            // InternalCosaDsl.g:2557:1: ( '.' )
            // InternalCosaDsl.g:2558:2: '.'
            {
             before(grammarAccess.getBindingAccess().getFullStopKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__7__Impl"


    // $ANTLR start "rule__Binding__Group__8"
    // InternalCosaDsl.g:2567:1: rule__Binding__Group__8 : rule__Binding__Group__8__Impl rule__Binding__Group__9 ;
    public final void rule__Binding__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2571:1: ( rule__Binding__Group__8__Impl rule__Binding__Group__9 )
            // InternalCosaDsl.g:2572:2: rule__Binding__Group__8__Impl rule__Binding__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Binding__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__8"


    // $ANTLR start "rule__Binding__Group__8__Impl"
    // InternalCosaDsl.g:2579:1: rule__Binding__Group__8__Impl : ( ( rule__Binding__PortRequiredAssignment_8 ) ) ;
    public final void rule__Binding__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2583:1: ( ( ( rule__Binding__PortRequiredAssignment_8 ) ) )
            // InternalCosaDsl.g:2584:1: ( ( rule__Binding__PortRequiredAssignment_8 ) )
            {
            // InternalCosaDsl.g:2584:1: ( ( rule__Binding__PortRequiredAssignment_8 ) )
            // InternalCosaDsl.g:2585:2: ( rule__Binding__PortRequiredAssignment_8 )
            {
             before(grammarAccess.getBindingAccess().getPortRequiredAssignment_8()); 
            // InternalCosaDsl.g:2586:2: ( rule__Binding__PortRequiredAssignment_8 )
            // InternalCosaDsl.g:2586:3: rule__Binding__PortRequiredAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Binding__PortRequiredAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getPortRequiredAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__8__Impl"


    // $ANTLR start "rule__Binding__Group__9"
    // InternalCosaDsl.g:2594:1: rule__Binding__Group__9 : rule__Binding__Group__9__Impl ;
    public final void rule__Binding__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2598:1: ( rule__Binding__Group__9__Impl )
            // InternalCosaDsl.g:2599:2: rule__Binding__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__9"


    // $ANTLR start "rule__Binding__Group__9__Impl"
    // InternalCosaDsl.g:2605:1: rule__Binding__Group__9__Impl : ( ')' ) ;
    public final void rule__Binding__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2609:1: ( ( ')' ) )
            // InternalCosaDsl.g:2610:1: ( ')' )
            {
            // InternalCosaDsl.g:2610:1: ( ')' )
            // InternalCosaDsl.g:2611:2: ')'
            {
             before(grammarAccess.getBindingAccess().getRightParenthesisKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__9__Impl"


    // $ANTLR start "rule__Attachement__Group__0"
    // InternalCosaDsl.g:2621:1: rule__Attachement__Group__0 : rule__Attachement__Group__0__Impl rule__Attachement__Group__1 ;
    public final void rule__Attachement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2625:1: ( rule__Attachement__Group__0__Impl rule__Attachement__Group__1 )
            // InternalCosaDsl.g:2626:2: rule__Attachement__Group__0__Impl rule__Attachement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attachement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__0"


    // $ANTLR start "rule__Attachement__Group__0__Impl"
    // InternalCosaDsl.g:2633:1: rule__Attachement__Group__0__Impl : ( 'Attachement' ) ;
    public final void rule__Attachement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2637:1: ( ( 'Attachement' ) )
            // InternalCosaDsl.g:2638:1: ( 'Attachement' )
            {
            // InternalCosaDsl.g:2638:1: ( 'Attachement' )
            // InternalCosaDsl.g:2639:2: 'Attachement'
            {
             before(grammarAccess.getAttachementAccess().getAttachementKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getAttachementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__0__Impl"


    // $ANTLR start "rule__Attachement__Group__1"
    // InternalCosaDsl.g:2648:1: rule__Attachement__Group__1 : rule__Attachement__Group__1__Impl rule__Attachement__Group__2 ;
    public final void rule__Attachement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2652:1: ( rule__Attachement__Group__1__Impl rule__Attachement__Group__2 )
            // InternalCosaDsl.g:2653:2: rule__Attachement__Group__1__Impl rule__Attachement__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Attachement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__1"


    // $ANTLR start "rule__Attachement__Group__1__Impl"
    // InternalCosaDsl.g:2660:1: rule__Attachement__Group__1__Impl : ( '{' ) ;
    public final void rule__Attachement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2664:1: ( ( '{' ) )
            // InternalCosaDsl.g:2665:1: ( '{' )
            {
            // InternalCosaDsl.g:2665:1: ( '{' )
            // InternalCosaDsl.g:2666:2: '{'
            {
             before(grammarAccess.getAttachementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__1__Impl"


    // $ANTLR start "rule__Attachement__Group__2"
    // InternalCosaDsl.g:2675:1: rule__Attachement__Group__2 : rule__Attachement__Group__2__Impl rule__Attachement__Group__3 ;
    public final void rule__Attachement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2679:1: ( rule__Attachement__Group__2__Impl rule__Attachement__Group__3 )
            // InternalCosaDsl.g:2680:2: rule__Attachement__Group__2__Impl rule__Attachement__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Attachement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__2"


    // $ANTLR start "rule__Attachement__Group__2__Impl"
    // InternalCosaDsl.g:2687:1: rule__Attachement__Group__2__Impl : ( ( rule__Attachement__ComponentAssignment_2 ) ) ;
    public final void rule__Attachement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2691:1: ( ( ( rule__Attachement__ComponentAssignment_2 ) ) )
            // InternalCosaDsl.g:2692:1: ( ( rule__Attachement__ComponentAssignment_2 ) )
            {
            // InternalCosaDsl.g:2692:1: ( ( rule__Attachement__ComponentAssignment_2 ) )
            // InternalCosaDsl.g:2693:2: ( rule__Attachement__ComponentAssignment_2 )
            {
             before(grammarAccess.getAttachementAccess().getComponentAssignment_2()); 
            // InternalCosaDsl.g:2694:2: ( rule__Attachement__ComponentAssignment_2 )
            // InternalCosaDsl.g:2694:3: rule__Attachement__ComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__ComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttachementAccess().getComponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__2__Impl"


    // $ANTLR start "rule__Attachement__Group__3"
    // InternalCosaDsl.g:2702:1: rule__Attachement__Group__3 : rule__Attachement__Group__3__Impl rule__Attachement__Group__4 ;
    public final void rule__Attachement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2706:1: ( rule__Attachement__Group__3__Impl rule__Attachement__Group__4 )
            // InternalCosaDsl.g:2707:2: rule__Attachement__Group__3__Impl rule__Attachement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Attachement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__3"


    // $ANTLR start "rule__Attachement__Group__3__Impl"
    // InternalCosaDsl.g:2714:1: rule__Attachement__Group__3__Impl : ( '.' ) ;
    public final void rule__Attachement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2718:1: ( ( '.' ) )
            // InternalCosaDsl.g:2719:1: ( '.' )
            {
            // InternalCosaDsl.g:2719:1: ( '.' )
            // InternalCosaDsl.g:2720:2: '.'
            {
             before(grammarAccess.getAttachementAccess().getFullStopKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__3__Impl"


    // $ANTLR start "rule__Attachement__Group__4"
    // InternalCosaDsl.g:2729:1: rule__Attachement__Group__4 : rule__Attachement__Group__4__Impl rule__Attachement__Group__5 ;
    public final void rule__Attachement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2733:1: ( rule__Attachement__Group__4__Impl rule__Attachement__Group__5 )
            // InternalCosaDsl.g:2734:2: rule__Attachement__Group__4__Impl rule__Attachement__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Attachement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__4"


    // $ANTLR start "rule__Attachement__Group__4__Impl"
    // InternalCosaDsl.g:2741:1: rule__Attachement__Group__4__Impl : ( ( rule__Attachement__PortAssignment_4 ) ) ;
    public final void rule__Attachement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2745:1: ( ( ( rule__Attachement__PortAssignment_4 ) ) )
            // InternalCosaDsl.g:2746:1: ( ( rule__Attachement__PortAssignment_4 ) )
            {
            // InternalCosaDsl.g:2746:1: ( ( rule__Attachement__PortAssignment_4 ) )
            // InternalCosaDsl.g:2747:2: ( rule__Attachement__PortAssignment_4 )
            {
             before(grammarAccess.getAttachementAccess().getPortAssignment_4()); 
            // InternalCosaDsl.g:2748:2: ( rule__Attachement__PortAssignment_4 )
            // InternalCosaDsl.g:2748:3: rule__Attachement__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttachementAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__4__Impl"


    // $ANTLR start "rule__Attachement__Group__5"
    // InternalCosaDsl.g:2756:1: rule__Attachement__Group__5 : rule__Attachement__Group__5__Impl rule__Attachement__Group__6 ;
    public final void rule__Attachement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2760:1: ( rule__Attachement__Group__5__Impl rule__Attachement__Group__6 )
            // InternalCosaDsl.g:2761:2: rule__Attachement__Group__5__Impl rule__Attachement__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Attachement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__5"


    // $ANTLR start "rule__Attachement__Group__5__Impl"
    // InternalCosaDsl.g:2768:1: rule__Attachement__Group__5__Impl : ( 'to' ) ;
    public final void rule__Attachement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2772:1: ( ( 'to' ) )
            // InternalCosaDsl.g:2773:1: ( 'to' )
            {
            // InternalCosaDsl.g:2773:1: ( 'to' )
            // InternalCosaDsl.g:2774:2: 'to'
            {
             before(grammarAccess.getAttachementAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__5__Impl"


    // $ANTLR start "rule__Attachement__Group__6"
    // InternalCosaDsl.g:2783:1: rule__Attachement__Group__6 : rule__Attachement__Group__6__Impl rule__Attachement__Group__7 ;
    public final void rule__Attachement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2787:1: ( rule__Attachement__Group__6__Impl rule__Attachement__Group__7 )
            // InternalCosaDsl.g:2788:2: rule__Attachement__Group__6__Impl rule__Attachement__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Attachement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__6"


    // $ANTLR start "rule__Attachement__Group__6__Impl"
    // InternalCosaDsl.g:2795:1: rule__Attachement__Group__6__Impl : ( ( rule__Attachement__ConnectorAssignment_6 ) ) ;
    public final void rule__Attachement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2799:1: ( ( ( rule__Attachement__ConnectorAssignment_6 ) ) )
            // InternalCosaDsl.g:2800:1: ( ( rule__Attachement__ConnectorAssignment_6 ) )
            {
            // InternalCosaDsl.g:2800:1: ( ( rule__Attachement__ConnectorAssignment_6 ) )
            // InternalCosaDsl.g:2801:2: ( rule__Attachement__ConnectorAssignment_6 )
            {
             before(grammarAccess.getAttachementAccess().getConnectorAssignment_6()); 
            // InternalCosaDsl.g:2802:2: ( rule__Attachement__ConnectorAssignment_6 )
            // InternalCosaDsl.g:2802:3: rule__Attachement__ConnectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__ConnectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttachementAccess().getConnectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__6__Impl"


    // $ANTLR start "rule__Attachement__Group__7"
    // InternalCosaDsl.g:2810:1: rule__Attachement__Group__7 : rule__Attachement__Group__7__Impl rule__Attachement__Group__8 ;
    public final void rule__Attachement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2814:1: ( rule__Attachement__Group__7__Impl rule__Attachement__Group__8 )
            // InternalCosaDsl.g:2815:2: rule__Attachement__Group__7__Impl rule__Attachement__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Attachement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__7"


    // $ANTLR start "rule__Attachement__Group__7__Impl"
    // InternalCosaDsl.g:2822:1: rule__Attachement__Group__7__Impl : ( '.' ) ;
    public final void rule__Attachement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2826:1: ( ( '.' ) )
            // InternalCosaDsl.g:2827:1: ( '.' )
            {
            // InternalCosaDsl.g:2827:1: ( '.' )
            // InternalCosaDsl.g:2828:2: '.'
            {
             before(grammarAccess.getAttachementAccess().getFullStopKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__7__Impl"


    // $ANTLR start "rule__Attachement__Group__8"
    // InternalCosaDsl.g:2837:1: rule__Attachement__Group__8 : rule__Attachement__Group__8__Impl rule__Attachement__Group__9 ;
    public final void rule__Attachement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2841:1: ( rule__Attachement__Group__8__Impl rule__Attachement__Group__9 )
            // InternalCosaDsl.g:2842:2: rule__Attachement__Group__8__Impl rule__Attachement__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Attachement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attachement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__8"


    // $ANTLR start "rule__Attachement__Group__8__Impl"
    // InternalCosaDsl.g:2849:1: rule__Attachement__Group__8__Impl : ( ( rule__Attachement__RoleAssignment_8 ) ) ;
    public final void rule__Attachement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2853:1: ( ( ( rule__Attachement__RoleAssignment_8 ) ) )
            // InternalCosaDsl.g:2854:1: ( ( rule__Attachement__RoleAssignment_8 ) )
            {
            // InternalCosaDsl.g:2854:1: ( ( rule__Attachement__RoleAssignment_8 ) )
            // InternalCosaDsl.g:2855:2: ( rule__Attachement__RoleAssignment_8 )
            {
             before(grammarAccess.getAttachementAccess().getRoleAssignment_8()); 
            // InternalCosaDsl.g:2856:2: ( rule__Attachement__RoleAssignment_8 )
            // InternalCosaDsl.g:2856:3: rule__Attachement__RoleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__RoleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAttachementAccess().getRoleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__8__Impl"


    // $ANTLR start "rule__Attachement__Group__9"
    // InternalCosaDsl.g:2864:1: rule__Attachement__Group__9 : rule__Attachement__Group__9__Impl ;
    public final void rule__Attachement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2868:1: ( rule__Attachement__Group__9__Impl )
            // InternalCosaDsl.g:2869:2: rule__Attachement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__9"


    // $ANTLR start "rule__Attachement__Group__9__Impl"
    // InternalCosaDsl.g:2875:1: rule__Attachement__Group__9__Impl : ( '}' ) ;
    public final void rule__Attachement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2879:1: ( ( '}' ) )
            // InternalCosaDsl.g:2880:1: ( '}' )
            {
            // InternalCosaDsl.g:2880:1: ( '}' )
            // InternalCosaDsl.g:2881:2: '}'
            {
             before(grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__Group__9__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__0"
    // InternalCosaDsl.g:2891:1: rule__Configuration_Impl__Group__0 : rule__Configuration_Impl__Group__0__Impl rule__Configuration_Impl__Group__1 ;
    public final void rule__Configuration_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2895:1: ( rule__Configuration_Impl__Group__0__Impl rule__Configuration_Impl__Group__1 )
            // InternalCosaDsl.g:2896:2: rule__Configuration_Impl__Group__0__Impl rule__Configuration_Impl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__0"


    // $ANTLR start "rule__Configuration_Impl__Group__0__Impl"
    // InternalCosaDsl.g:2903:1: rule__Configuration_Impl__Group__0__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2907:1: ( ( 'Configuration' ) )
            // InternalCosaDsl.g:2908:1: ( 'Configuration' )
            {
            // InternalCosaDsl.g:2908:1: ( 'Configuration' )
            // InternalCosaDsl.g:2909:2: 'Configuration'
            {
             before(grammarAccess.getConfiguration_ImplAccess().getConfigurationKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__1"
    // InternalCosaDsl.g:2918:1: rule__Configuration_Impl__Group__1 : rule__Configuration_Impl__Group__1__Impl rule__Configuration_Impl__Group__2 ;
    public final void rule__Configuration_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2922:1: ( rule__Configuration_Impl__Group__1__Impl rule__Configuration_Impl__Group__2 )
            // InternalCosaDsl.g:2923:2: rule__Configuration_Impl__Group__1__Impl rule__Configuration_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__1"


    // $ANTLR start "rule__Configuration_Impl__Group__1__Impl"
    // InternalCosaDsl.g:2930:1: rule__Configuration_Impl__Group__1__Impl : ( ( rule__Configuration_Impl__NameAssignment_1 ) ) ;
    public final void rule__Configuration_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2934:1: ( ( ( rule__Configuration_Impl__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:2935:1: ( ( rule__Configuration_Impl__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:2935:1: ( ( rule__Configuration_Impl__NameAssignment_1 ) )
            // InternalCosaDsl.g:2936:2: ( rule__Configuration_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:2937:2: ( rule__Configuration_Impl__NameAssignment_1 )
            // InternalCosaDsl.g:2937:3: rule__Configuration_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__2"
    // InternalCosaDsl.g:2945:1: rule__Configuration_Impl__Group__2 : rule__Configuration_Impl__Group__2__Impl rule__Configuration_Impl__Group__3 ;
    public final void rule__Configuration_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2949:1: ( rule__Configuration_Impl__Group__2__Impl rule__Configuration_Impl__Group__3 )
            // InternalCosaDsl.g:2950:2: rule__Configuration_Impl__Group__2__Impl rule__Configuration_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Configuration_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__2"


    // $ANTLR start "rule__Configuration_Impl__Group__2__Impl"
    // InternalCosaDsl.g:2957:1: rule__Configuration_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2961:1: ( ( '{' ) )
            // InternalCosaDsl.g:2962:1: ( '{' )
            {
            // InternalCosaDsl.g:2962:1: ( '{' )
            // InternalCosaDsl.g:2963:2: '{'
            {
             before(grammarAccess.getConfiguration_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__2__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__3"
    // InternalCosaDsl.g:2972:1: rule__Configuration_Impl__Group__3 : rule__Configuration_Impl__Group__3__Impl rule__Configuration_Impl__Group__4 ;
    public final void rule__Configuration_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2976:1: ( rule__Configuration_Impl__Group__3__Impl rule__Configuration_Impl__Group__4 )
            // InternalCosaDsl.g:2977:2: rule__Configuration_Impl__Group__3__Impl rule__Configuration_Impl__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Configuration_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__3"


    // $ANTLR start "rule__Configuration_Impl__Group__3__Impl"
    // InternalCosaDsl.g:2984:1: rule__Configuration_Impl__Group__3__Impl : ( ( rule__Configuration_Impl__ComponentsAssignment_3 ) ) ;
    public final void rule__Configuration_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2988:1: ( ( ( rule__Configuration_Impl__ComponentsAssignment_3 ) ) )
            // InternalCosaDsl.g:2989:1: ( ( rule__Configuration_Impl__ComponentsAssignment_3 ) )
            {
            // InternalCosaDsl.g:2989:1: ( ( rule__Configuration_Impl__ComponentsAssignment_3 ) )
            // InternalCosaDsl.g:2990:2: ( rule__Configuration_Impl__ComponentsAssignment_3 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getComponentsAssignment_3()); 
            // InternalCosaDsl.g:2991:2: ( rule__Configuration_Impl__ComponentsAssignment_3 )
            // InternalCosaDsl.g:2991:3: rule__Configuration_Impl__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getComponentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__3__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__4"
    // InternalCosaDsl.g:2999:1: rule__Configuration_Impl__Group__4 : rule__Configuration_Impl__Group__4__Impl rule__Configuration_Impl__Group__5 ;
    public final void rule__Configuration_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3003:1: ( rule__Configuration_Impl__Group__4__Impl rule__Configuration_Impl__Group__5 )
            // InternalCosaDsl.g:3004:2: rule__Configuration_Impl__Group__4__Impl rule__Configuration_Impl__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Configuration_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__4"


    // $ANTLR start "rule__Configuration_Impl__Group__4__Impl"
    // InternalCosaDsl.g:3011:1: rule__Configuration_Impl__Group__4__Impl : ( ( rule__Configuration_Impl__Group_4__0 )* ) ;
    public final void rule__Configuration_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3015:1: ( ( ( rule__Configuration_Impl__Group_4__0 )* ) )
            // InternalCosaDsl.g:3016:1: ( ( rule__Configuration_Impl__Group_4__0 )* )
            {
            // InternalCosaDsl.g:3016:1: ( ( rule__Configuration_Impl__Group_4__0 )* )
            // InternalCosaDsl.g:3017:2: ( rule__Configuration_Impl__Group_4__0 )*
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_4()); 
            // InternalCosaDsl.g:3018:2: ( rule__Configuration_Impl__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCosaDsl.g:3018:3: rule__Configuration_Impl__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Configuration_Impl__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__4__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__5"
    // InternalCosaDsl.g:3026:1: rule__Configuration_Impl__Group__5 : rule__Configuration_Impl__Group__5__Impl rule__Configuration_Impl__Group__6 ;
    public final void rule__Configuration_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3030:1: ( rule__Configuration_Impl__Group__5__Impl rule__Configuration_Impl__Group__6 )
            // InternalCosaDsl.g:3031:2: rule__Configuration_Impl__Group__5__Impl rule__Configuration_Impl__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Configuration_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__5"


    // $ANTLR start "rule__Configuration_Impl__Group__5__Impl"
    // InternalCosaDsl.g:3038:1: rule__Configuration_Impl__Group__5__Impl : ( ( rule__Configuration_Impl__Group_5__0 ) ) ;
    public final void rule__Configuration_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3042:1: ( ( ( rule__Configuration_Impl__Group_5__0 ) ) )
            // InternalCosaDsl.g:3043:1: ( ( rule__Configuration_Impl__Group_5__0 ) )
            {
            // InternalCosaDsl.g:3043:1: ( ( rule__Configuration_Impl__Group_5__0 ) )
            // InternalCosaDsl.g:3044:2: ( rule__Configuration_Impl__Group_5__0 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_5()); 
            // InternalCosaDsl.g:3045:2: ( rule__Configuration_Impl__Group_5__0 )
            // InternalCosaDsl.g:3045:3: rule__Configuration_Impl__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__5__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__6"
    // InternalCosaDsl.g:3053:1: rule__Configuration_Impl__Group__6 : rule__Configuration_Impl__Group__6__Impl rule__Configuration_Impl__Group__7 ;
    public final void rule__Configuration_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3057:1: ( rule__Configuration_Impl__Group__6__Impl rule__Configuration_Impl__Group__7 )
            // InternalCosaDsl.g:3058:2: rule__Configuration_Impl__Group__6__Impl rule__Configuration_Impl__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__Configuration_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__6"


    // $ANTLR start "rule__Configuration_Impl__Group__6__Impl"
    // InternalCosaDsl.g:3065:1: rule__Configuration_Impl__Group__6__Impl : ( ( rule__Configuration_Impl__Group_6__0 )* ) ;
    public final void rule__Configuration_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3069:1: ( ( ( rule__Configuration_Impl__Group_6__0 )* ) )
            // InternalCosaDsl.g:3070:1: ( ( rule__Configuration_Impl__Group_6__0 )* )
            {
            // InternalCosaDsl.g:3070:1: ( ( rule__Configuration_Impl__Group_6__0 )* )
            // InternalCosaDsl.g:3071:2: ( rule__Configuration_Impl__Group_6__0 )*
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_6()); 
            // InternalCosaDsl.g:3072:2: ( rule__Configuration_Impl__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18||(LA22_0>=33 && LA22_0<=34)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCosaDsl.g:3072:3: rule__Configuration_Impl__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Configuration_Impl__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__6__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__7"
    // InternalCosaDsl.g:3080:1: rule__Configuration_Impl__Group__7 : rule__Configuration_Impl__Group__7__Impl rule__Configuration_Impl__Group__8 ;
    public final void rule__Configuration_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3084:1: ( rule__Configuration_Impl__Group__7__Impl rule__Configuration_Impl__Group__8 )
            // InternalCosaDsl.g:3085:2: rule__Configuration_Impl__Group__7__Impl rule__Configuration_Impl__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__Configuration_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__7"


    // $ANTLR start "rule__Configuration_Impl__Group__7__Impl"
    // InternalCosaDsl.g:3092:1: rule__Configuration_Impl__Group__7__Impl : ( ( rule__Configuration_Impl__Group_7__0 )* ) ;
    public final void rule__Configuration_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3096:1: ( ( ( rule__Configuration_Impl__Group_7__0 )* ) )
            // InternalCosaDsl.g:3097:1: ( ( rule__Configuration_Impl__Group_7__0 )* )
            {
            // InternalCosaDsl.g:3097:1: ( ( rule__Configuration_Impl__Group_7__0 )* )
            // InternalCosaDsl.g:3098:2: ( rule__Configuration_Impl__Group_7__0 )*
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_7()); 
            // InternalCosaDsl.g:3099:2: ( rule__Configuration_Impl__Group_7__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCosaDsl.g:3099:3: rule__Configuration_Impl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Configuration_Impl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__7__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group__8"
    // InternalCosaDsl.g:3107:1: rule__Configuration_Impl__Group__8 : rule__Configuration_Impl__Group__8__Impl ;
    public final void rule__Configuration_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3111:1: ( rule__Configuration_Impl__Group__8__Impl )
            // InternalCosaDsl.g:3112:2: rule__Configuration_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__8"


    // $ANTLR start "rule__Configuration_Impl__Group__8__Impl"
    // InternalCosaDsl.g:3118:1: rule__Configuration_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Configuration_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3122:1: ( ( '}' ) )
            // InternalCosaDsl.g:3123:1: ( '}' )
            {
            // InternalCosaDsl.g:3123:1: ( '}' )
            // InternalCosaDsl.g:3124:2: '}'
            {
             before(grammarAccess.getConfiguration_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group__8__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_4__0"
    // InternalCosaDsl.g:3134:1: rule__Configuration_Impl__Group_4__0 : rule__Configuration_Impl__Group_4__0__Impl rule__Configuration_Impl__Group_4__1 ;
    public final void rule__Configuration_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3138:1: ( rule__Configuration_Impl__Group_4__0__Impl rule__Configuration_Impl__Group_4__1 )
            // InternalCosaDsl.g:3139:2: rule__Configuration_Impl__Group_4__0__Impl rule__Configuration_Impl__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Configuration_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_4__0"


    // $ANTLR start "rule__Configuration_Impl__Group_4__0__Impl"
    // InternalCosaDsl.g:3146:1: rule__Configuration_Impl__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Configuration_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3150:1: ( ( ',' ) )
            // InternalCosaDsl.g:3151:1: ( ',' )
            {
            // InternalCosaDsl.g:3151:1: ( ',' )
            // InternalCosaDsl.g:3152:2: ','
            {
             before(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_4__1"
    // InternalCosaDsl.g:3161:1: rule__Configuration_Impl__Group_4__1 : rule__Configuration_Impl__Group_4__1__Impl ;
    public final void rule__Configuration_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3165:1: ( rule__Configuration_Impl__Group_4__1__Impl )
            // InternalCosaDsl.g:3166:2: rule__Configuration_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_4__1"


    // $ANTLR start "rule__Configuration_Impl__Group_4__1__Impl"
    // InternalCosaDsl.g:3172:1: rule__Configuration_Impl__Group_4__1__Impl : ( ( rule__Configuration_Impl__ComponentsAssignment_4_1 ) ) ;
    public final void rule__Configuration_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3176:1: ( ( ( rule__Configuration_Impl__ComponentsAssignment_4_1 ) ) )
            // InternalCosaDsl.g:3177:1: ( ( rule__Configuration_Impl__ComponentsAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:3177:1: ( ( rule__Configuration_Impl__ComponentsAssignment_4_1 ) )
            // InternalCosaDsl.g:3178:2: ( rule__Configuration_Impl__ComponentsAssignment_4_1 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getComponentsAssignment_4_1()); 
            // InternalCosaDsl.g:3179:2: ( rule__Configuration_Impl__ComponentsAssignment_4_1 )
            // InternalCosaDsl.g:3179:3: rule__Configuration_Impl__ComponentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__ComponentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getComponentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_5__0"
    // InternalCosaDsl.g:3188:1: rule__Configuration_Impl__Group_5__0 : rule__Configuration_Impl__Group_5__0__Impl rule__Configuration_Impl__Group_5__1 ;
    public final void rule__Configuration_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3192:1: ( rule__Configuration_Impl__Group_5__0__Impl rule__Configuration_Impl__Group_5__1 )
            // InternalCosaDsl.g:3193:2: rule__Configuration_Impl__Group_5__0__Impl rule__Configuration_Impl__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Configuration_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5__0"


    // $ANTLR start "rule__Configuration_Impl__Group_5__0__Impl"
    // InternalCosaDsl.g:3200:1: rule__Configuration_Impl__Group_5__0__Impl : ( ( rule__Configuration_Impl__ConnectorsAssignment_5_0 ) ) ;
    public final void rule__Configuration_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3204:1: ( ( ( rule__Configuration_Impl__ConnectorsAssignment_5_0 ) ) )
            // InternalCosaDsl.g:3205:1: ( ( rule__Configuration_Impl__ConnectorsAssignment_5_0 ) )
            {
            // InternalCosaDsl.g:3205:1: ( ( rule__Configuration_Impl__ConnectorsAssignment_5_0 ) )
            // InternalCosaDsl.g:3206:2: ( rule__Configuration_Impl__ConnectorsAssignment_5_0 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getConnectorsAssignment_5_0()); 
            // InternalCosaDsl.g:3207:2: ( rule__Configuration_Impl__ConnectorsAssignment_5_0 )
            // InternalCosaDsl.g:3207:3: rule__Configuration_Impl__ConnectorsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__ConnectorsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getConnectorsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_5__1"
    // InternalCosaDsl.g:3215:1: rule__Configuration_Impl__Group_5__1 : rule__Configuration_Impl__Group_5__1__Impl ;
    public final void rule__Configuration_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3219:1: ( rule__Configuration_Impl__Group_5__1__Impl )
            // InternalCosaDsl.g:3220:2: rule__Configuration_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5__1"


    // $ANTLR start "rule__Configuration_Impl__Group_5__1__Impl"
    // InternalCosaDsl.g:3226:1: rule__Configuration_Impl__Group_5__1__Impl : ( ( rule__Configuration_Impl__Group_5_1__0 )* ) ;
    public final void rule__Configuration_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3230:1: ( ( ( rule__Configuration_Impl__Group_5_1__0 )* ) )
            // InternalCosaDsl.g:3231:1: ( ( rule__Configuration_Impl__Group_5_1__0 )* )
            {
            // InternalCosaDsl.g:3231:1: ( ( rule__Configuration_Impl__Group_5_1__0 )* )
            // InternalCosaDsl.g:3232:2: ( rule__Configuration_Impl__Group_5_1__0 )*
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_5_1()); 
            // InternalCosaDsl.g:3233:2: ( rule__Configuration_Impl__Group_5_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCosaDsl.g:3233:3: rule__Configuration_Impl__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Configuration_Impl__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_5_1__0"
    // InternalCosaDsl.g:3242:1: rule__Configuration_Impl__Group_5_1__0 : rule__Configuration_Impl__Group_5_1__0__Impl rule__Configuration_Impl__Group_5_1__1 ;
    public final void rule__Configuration_Impl__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3246:1: ( rule__Configuration_Impl__Group_5_1__0__Impl rule__Configuration_Impl__Group_5_1__1 )
            // InternalCosaDsl.g:3247:2: rule__Configuration_Impl__Group_5_1__0__Impl rule__Configuration_Impl__Group_5_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Configuration_Impl__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5_1__0"


    // $ANTLR start "rule__Configuration_Impl__Group_5_1__0__Impl"
    // InternalCosaDsl.g:3254:1: rule__Configuration_Impl__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration_Impl__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3258:1: ( ( ',' ) )
            // InternalCosaDsl.g:3259:1: ( ',' )
            {
            // InternalCosaDsl.g:3259:1: ( ',' )
            // InternalCosaDsl.g:3260:2: ','
            {
             before(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_5_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5_1__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_5_1__1"
    // InternalCosaDsl.g:3269:1: rule__Configuration_Impl__Group_5_1__1 : rule__Configuration_Impl__Group_5_1__1__Impl ;
    public final void rule__Configuration_Impl__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3273:1: ( rule__Configuration_Impl__Group_5_1__1__Impl )
            // InternalCosaDsl.g:3274:2: rule__Configuration_Impl__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5_1__1"


    // $ANTLR start "rule__Configuration_Impl__Group_5_1__1__Impl"
    // InternalCosaDsl.g:3280:1: rule__Configuration_Impl__Group_5_1__1__Impl : ( ( rule__Configuration_Impl__ConnectorsAssignment_5_1_1 ) ) ;
    public final void rule__Configuration_Impl__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3284:1: ( ( ( rule__Configuration_Impl__ConnectorsAssignment_5_1_1 ) ) )
            // InternalCosaDsl.g:3285:1: ( ( rule__Configuration_Impl__ConnectorsAssignment_5_1_1 ) )
            {
            // InternalCosaDsl.g:3285:1: ( ( rule__Configuration_Impl__ConnectorsAssignment_5_1_1 ) )
            // InternalCosaDsl.g:3286:2: ( rule__Configuration_Impl__ConnectorsAssignment_5_1_1 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getConnectorsAssignment_5_1_1()); 
            // InternalCosaDsl.g:3287:2: ( rule__Configuration_Impl__ConnectorsAssignment_5_1_1 )
            // InternalCosaDsl.g:3287:3: rule__Configuration_Impl__ConnectorsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__ConnectorsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getConnectorsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_5_1__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_6__0"
    // InternalCosaDsl.g:3296:1: rule__Configuration_Impl__Group_6__0 : rule__Configuration_Impl__Group_6__0__Impl rule__Configuration_Impl__Group_6__1 ;
    public final void rule__Configuration_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3300:1: ( rule__Configuration_Impl__Group_6__0__Impl rule__Configuration_Impl__Group_6__1 )
            // InternalCosaDsl.g:3301:2: rule__Configuration_Impl__Group_6__0__Impl rule__Configuration_Impl__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Configuration_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6__0"


    // $ANTLR start "rule__Configuration_Impl__Group_6__0__Impl"
    // InternalCosaDsl.g:3308:1: rule__Configuration_Impl__Group_6__0__Impl : ( ( rule__Configuration_Impl__PortsAssignment_6_0 ) ) ;
    public final void rule__Configuration_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3312:1: ( ( ( rule__Configuration_Impl__PortsAssignment_6_0 ) ) )
            // InternalCosaDsl.g:3313:1: ( ( rule__Configuration_Impl__PortsAssignment_6_0 ) )
            {
            // InternalCosaDsl.g:3313:1: ( ( rule__Configuration_Impl__PortsAssignment_6_0 ) )
            // InternalCosaDsl.g:3314:2: ( rule__Configuration_Impl__PortsAssignment_6_0 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getPortsAssignment_6_0()); 
            // InternalCosaDsl.g:3315:2: ( rule__Configuration_Impl__PortsAssignment_6_0 )
            // InternalCosaDsl.g:3315:3: rule__Configuration_Impl__PortsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__PortsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getPortsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_6__1"
    // InternalCosaDsl.g:3323:1: rule__Configuration_Impl__Group_6__1 : rule__Configuration_Impl__Group_6__1__Impl ;
    public final void rule__Configuration_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3327:1: ( rule__Configuration_Impl__Group_6__1__Impl )
            // InternalCosaDsl.g:3328:2: rule__Configuration_Impl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6__1"


    // $ANTLR start "rule__Configuration_Impl__Group_6__1__Impl"
    // InternalCosaDsl.g:3334:1: rule__Configuration_Impl__Group_6__1__Impl : ( ( rule__Configuration_Impl__Group_6_1__0 )* ) ;
    public final void rule__Configuration_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3338:1: ( ( ( rule__Configuration_Impl__Group_6_1__0 )* ) )
            // InternalCosaDsl.g:3339:1: ( ( rule__Configuration_Impl__Group_6_1__0 )* )
            {
            // InternalCosaDsl.g:3339:1: ( ( rule__Configuration_Impl__Group_6_1__0 )* )
            // InternalCosaDsl.g:3340:2: ( rule__Configuration_Impl__Group_6_1__0 )*
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_6_1()); 
            // InternalCosaDsl.g:3341:2: ( rule__Configuration_Impl__Group_6_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCosaDsl.g:3341:3: rule__Configuration_Impl__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Configuration_Impl__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_6_1__0"
    // InternalCosaDsl.g:3350:1: rule__Configuration_Impl__Group_6_1__0 : rule__Configuration_Impl__Group_6_1__0__Impl rule__Configuration_Impl__Group_6_1__1 ;
    public final void rule__Configuration_Impl__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3354:1: ( rule__Configuration_Impl__Group_6_1__0__Impl rule__Configuration_Impl__Group_6_1__1 )
            // InternalCosaDsl.g:3355:2: rule__Configuration_Impl__Group_6_1__0__Impl rule__Configuration_Impl__Group_6_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Configuration_Impl__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6_1__0"


    // $ANTLR start "rule__Configuration_Impl__Group_6_1__0__Impl"
    // InternalCosaDsl.g:3362:1: rule__Configuration_Impl__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration_Impl__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3366:1: ( ( ',' ) )
            // InternalCosaDsl.g:3367:1: ( ',' )
            {
            // InternalCosaDsl.g:3367:1: ( ',' )
            // InternalCosaDsl.g:3368:2: ','
            {
             before(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_6_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6_1__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_6_1__1"
    // InternalCosaDsl.g:3377:1: rule__Configuration_Impl__Group_6_1__1 : rule__Configuration_Impl__Group_6_1__1__Impl ;
    public final void rule__Configuration_Impl__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3381:1: ( rule__Configuration_Impl__Group_6_1__1__Impl )
            // InternalCosaDsl.g:3382:2: rule__Configuration_Impl__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6_1__1"


    // $ANTLR start "rule__Configuration_Impl__Group_6_1__1__Impl"
    // InternalCosaDsl.g:3388:1: rule__Configuration_Impl__Group_6_1__1__Impl : ( ( rule__Configuration_Impl__PortsAssignment_6_1_1 ) ) ;
    public final void rule__Configuration_Impl__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3392:1: ( ( ( rule__Configuration_Impl__PortsAssignment_6_1_1 ) ) )
            // InternalCosaDsl.g:3393:1: ( ( rule__Configuration_Impl__PortsAssignment_6_1_1 ) )
            {
            // InternalCosaDsl.g:3393:1: ( ( rule__Configuration_Impl__PortsAssignment_6_1_1 ) )
            // InternalCosaDsl.g:3394:2: ( rule__Configuration_Impl__PortsAssignment_6_1_1 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getPortsAssignment_6_1_1()); 
            // InternalCosaDsl.g:3395:2: ( rule__Configuration_Impl__PortsAssignment_6_1_1 )
            // InternalCosaDsl.g:3395:3: rule__Configuration_Impl__PortsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__PortsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getPortsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_6_1__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_7__0"
    // InternalCosaDsl.g:3404:1: rule__Configuration_Impl__Group_7__0 : rule__Configuration_Impl__Group_7__0__Impl rule__Configuration_Impl__Group_7__1 ;
    public final void rule__Configuration_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3408:1: ( rule__Configuration_Impl__Group_7__0__Impl rule__Configuration_Impl__Group_7__1 )
            // InternalCosaDsl.g:3409:2: rule__Configuration_Impl__Group_7__0__Impl rule__Configuration_Impl__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Configuration_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7__0"


    // $ANTLR start "rule__Configuration_Impl__Group_7__0__Impl"
    // InternalCosaDsl.g:3416:1: rule__Configuration_Impl__Group_7__0__Impl : ( ( rule__Configuration_Impl__BindingsAssignment_7_0 ) ) ;
    public final void rule__Configuration_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3420:1: ( ( ( rule__Configuration_Impl__BindingsAssignment_7_0 ) ) )
            // InternalCosaDsl.g:3421:1: ( ( rule__Configuration_Impl__BindingsAssignment_7_0 ) )
            {
            // InternalCosaDsl.g:3421:1: ( ( rule__Configuration_Impl__BindingsAssignment_7_0 ) )
            // InternalCosaDsl.g:3422:2: ( rule__Configuration_Impl__BindingsAssignment_7_0 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getBindingsAssignment_7_0()); 
            // InternalCosaDsl.g:3423:2: ( rule__Configuration_Impl__BindingsAssignment_7_0 )
            // InternalCosaDsl.g:3423:3: rule__Configuration_Impl__BindingsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__BindingsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getBindingsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_7__1"
    // InternalCosaDsl.g:3431:1: rule__Configuration_Impl__Group_7__1 : rule__Configuration_Impl__Group_7__1__Impl ;
    public final void rule__Configuration_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3435:1: ( rule__Configuration_Impl__Group_7__1__Impl )
            // InternalCosaDsl.g:3436:2: rule__Configuration_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7__1"


    // $ANTLR start "rule__Configuration_Impl__Group_7__1__Impl"
    // InternalCosaDsl.g:3442:1: rule__Configuration_Impl__Group_7__1__Impl : ( ( rule__Configuration_Impl__Group_7_1__0 )* ) ;
    public final void rule__Configuration_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3446:1: ( ( ( rule__Configuration_Impl__Group_7_1__0 )* ) )
            // InternalCosaDsl.g:3447:1: ( ( rule__Configuration_Impl__Group_7_1__0 )* )
            {
            // InternalCosaDsl.g:3447:1: ( ( rule__Configuration_Impl__Group_7_1__0 )* )
            // InternalCosaDsl.g:3448:2: ( rule__Configuration_Impl__Group_7_1__0 )*
            {
             before(grammarAccess.getConfiguration_ImplAccess().getGroup_7_1()); 
            // InternalCosaDsl.g:3449:2: ( rule__Configuration_Impl__Group_7_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCosaDsl.g:3449:3: rule__Configuration_Impl__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Configuration_Impl__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConfiguration_ImplAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_7_1__0"
    // InternalCosaDsl.g:3458:1: rule__Configuration_Impl__Group_7_1__0 : rule__Configuration_Impl__Group_7_1__0__Impl rule__Configuration_Impl__Group_7_1__1 ;
    public final void rule__Configuration_Impl__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3462:1: ( rule__Configuration_Impl__Group_7_1__0__Impl rule__Configuration_Impl__Group_7_1__1 )
            // InternalCosaDsl.g:3463:2: rule__Configuration_Impl__Group_7_1__0__Impl rule__Configuration_Impl__Group_7_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Configuration_Impl__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7_1__0"


    // $ANTLR start "rule__Configuration_Impl__Group_7_1__0__Impl"
    // InternalCosaDsl.g:3470:1: rule__Configuration_Impl__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration_Impl__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3474:1: ( ( ',' ) )
            // InternalCosaDsl.g:3475:1: ( ',' )
            {
            // InternalCosaDsl.g:3475:1: ( ',' )
            // InternalCosaDsl.g:3476:2: ','
            {
             before(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_7_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfiguration_ImplAccess().getCommaKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7_1__0__Impl"


    // $ANTLR start "rule__Configuration_Impl__Group_7_1__1"
    // InternalCosaDsl.g:3485:1: rule__Configuration_Impl__Group_7_1__1 : rule__Configuration_Impl__Group_7_1__1__Impl ;
    public final void rule__Configuration_Impl__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3489:1: ( rule__Configuration_Impl__Group_7_1__1__Impl )
            // InternalCosaDsl.g:3490:2: rule__Configuration_Impl__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7_1__1"


    // $ANTLR start "rule__Configuration_Impl__Group_7_1__1__Impl"
    // InternalCosaDsl.g:3496:1: rule__Configuration_Impl__Group_7_1__1__Impl : ( ( rule__Configuration_Impl__BindingsAssignment_7_1_1 ) ) ;
    public final void rule__Configuration_Impl__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3500:1: ( ( ( rule__Configuration_Impl__BindingsAssignment_7_1_1 ) ) )
            // InternalCosaDsl.g:3501:1: ( ( rule__Configuration_Impl__BindingsAssignment_7_1_1 ) )
            {
            // InternalCosaDsl.g:3501:1: ( ( rule__Configuration_Impl__BindingsAssignment_7_1_1 ) )
            // InternalCosaDsl.g:3502:2: ( rule__Configuration_Impl__BindingsAssignment_7_1_1 )
            {
             before(grammarAccess.getConfiguration_ImplAccess().getBindingsAssignment_7_1_1()); 
            // InternalCosaDsl.g:3503:2: ( rule__Configuration_Impl__BindingsAssignment_7_1_1 )
            // InternalCosaDsl.g:3503:3: rule__Configuration_Impl__BindingsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Impl__BindingsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_ImplAccess().getBindingsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__Group_7_1__1__Impl"


    // $ANTLR start "rule__Service_Impl__Group__0"
    // InternalCosaDsl.g:3512:1: rule__Service_Impl__Group__0 : rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1 ;
    public final void rule__Service_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3516:1: ( rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1 )
            // InternalCosaDsl.g:3517:2: rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Service_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__0"


    // $ANTLR start "rule__Service_Impl__Group__0__Impl"
    // InternalCosaDsl.g:3524:1: rule__Service_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Service_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3528:1: ( ( () ) )
            // InternalCosaDsl.g:3529:1: ( () )
            {
            // InternalCosaDsl.g:3529:1: ( () )
            // InternalCosaDsl.g:3530:2: ()
            {
             before(grammarAccess.getService_ImplAccess().getServiceAction_0()); 
            // InternalCosaDsl.g:3531:2: ()
            // InternalCosaDsl.g:3531:3: 
            {
            }

             after(grammarAccess.getService_ImplAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__0__Impl"


    // $ANTLR start "rule__Service_Impl__Group__1"
    // InternalCosaDsl.g:3539:1: rule__Service_Impl__Group__1 : rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2 ;
    public final void rule__Service_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3543:1: ( rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2 )
            // InternalCosaDsl.g:3544:2: rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Service_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__1"


    // $ANTLR start "rule__Service_Impl__Group__1__Impl"
    // InternalCosaDsl.g:3551:1: rule__Service_Impl__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3555:1: ( ( 'Service' ) )
            // InternalCosaDsl.g:3556:1: ( 'Service' )
            {
            // InternalCosaDsl.g:3556:1: ( 'Service' )
            // InternalCosaDsl.g:3557:2: 'Service'
            {
             before(grammarAccess.getService_ImplAccess().getServiceKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getService_ImplAccess().getServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__1__Impl"


    // $ANTLR start "rule__Service_Impl__Group__2"
    // InternalCosaDsl.g:3566:1: rule__Service_Impl__Group__2 : rule__Service_Impl__Group__2__Impl ;
    public final void rule__Service_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3570:1: ( rule__Service_Impl__Group__2__Impl )
            // InternalCosaDsl.g:3571:2: rule__Service_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__2"


    // $ANTLR start "rule__Service_Impl__Group__2__Impl"
    // InternalCosaDsl.g:3577:1: rule__Service_Impl__Group__2__Impl : ( ( rule__Service_Impl__NameAssignment_2 ) ) ;
    public final void rule__Service_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3581:1: ( ( ( rule__Service_Impl__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3582:1: ( ( rule__Service_Impl__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3582:1: ( ( rule__Service_Impl__NameAssignment_2 ) )
            // InternalCosaDsl.g:3583:2: ( rule__Service_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getService_ImplAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3584:2: ( rule__Service_Impl__NameAssignment_2 )
            // InternalCosaDsl.g:3584:3: rule__Service_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Service_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getService_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__Group__2__Impl"


    // $ANTLR start "rule__RequiredService__Group__0"
    // InternalCosaDsl.g:3593:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3597:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalCosaDsl.g:3598:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__RequiredService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__0"


    // $ANTLR start "rule__RequiredService__Group__0__Impl"
    // InternalCosaDsl.g:3605:1: rule__RequiredService__Group__0__Impl : ( () ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3609:1: ( ( () ) )
            // InternalCosaDsl.g:3610:1: ( () )
            {
            // InternalCosaDsl.g:3610:1: ( () )
            // InternalCosaDsl.g:3611:2: ()
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceAction_0()); 
            // InternalCosaDsl.g:3612:2: ()
            // InternalCosaDsl.g:3612:3: 
            {
            }

             after(grammarAccess.getRequiredServiceAccess().getRequiredServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__0__Impl"


    // $ANTLR start "rule__RequiredService__Group__1"
    // InternalCosaDsl.g:3620:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3624:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalCosaDsl.g:3625:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RequiredService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__1"


    // $ANTLR start "rule__RequiredService__Group__1__Impl"
    // InternalCosaDsl.g:3632:1: rule__RequiredService__Group__1__Impl : ( 'RequiredService' ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3636:1: ( ( 'RequiredService' ) )
            // InternalCosaDsl.g:3637:1: ( 'RequiredService' )
            {
            // InternalCosaDsl.g:3637:1: ( 'RequiredService' )
            // InternalCosaDsl.g:3638:2: 'RequiredService'
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__1__Impl"


    // $ANTLR start "rule__RequiredService__Group__2"
    // InternalCosaDsl.g:3647:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3651:1: ( rule__RequiredService__Group__2__Impl )
            // InternalCosaDsl.g:3652:2: rule__RequiredService__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__2"


    // $ANTLR start "rule__RequiredService__Group__2__Impl"
    // InternalCosaDsl.g:3658:1: rule__RequiredService__Group__2__Impl : ( ( rule__RequiredService__NameAssignment_2 ) ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3662:1: ( ( ( rule__RequiredService__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3663:1: ( ( rule__RequiredService__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3663:1: ( ( rule__RequiredService__NameAssignment_2 ) )
            // InternalCosaDsl.g:3664:2: ( rule__RequiredService__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3665:2: ( rule__RequiredService__NameAssignment_2 )
            // InternalCosaDsl.g:3665:3: rule__RequiredService__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__2__Impl"


    // $ANTLR start "rule__ProvidedService__Group__0"
    // InternalCosaDsl.g:3674:1: rule__ProvidedService__Group__0 : rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 ;
    public final void rule__ProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3678:1: ( rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 )
            // InternalCosaDsl.g:3679:2: rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ProvidedService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__0"


    // $ANTLR start "rule__ProvidedService__Group__0__Impl"
    // InternalCosaDsl.g:3686:1: rule__ProvidedService__Group__0__Impl : ( () ) ;
    public final void rule__ProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3690:1: ( ( () ) )
            // InternalCosaDsl.g:3691:1: ( () )
            {
            // InternalCosaDsl.g:3691:1: ( () )
            // InternalCosaDsl.g:3692:2: ()
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceAction_0()); 
            // InternalCosaDsl.g:3693:2: ()
            // InternalCosaDsl.g:3693:3: 
            {
            }

             after(grammarAccess.getProvidedServiceAccess().getProvidedServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__0__Impl"


    // $ANTLR start "rule__ProvidedService__Group__1"
    // InternalCosaDsl.g:3701:1: rule__ProvidedService__Group__1 : rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 ;
    public final void rule__ProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3705:1: ( rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 )
            // InternalCosaDsl.g:3706:2: rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__1"


    // $ANTLR start "rule__ProvidedService__Group__1__Impl"
    // InternalCosaDsl.g:3713:1: rule__ProvidedService__Group__1__Impl : ( 'ProvidedService' ) ;
    public final void rule__ProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3717:1: ( ( 'ProvidedService' ) )
            // InternalCosaDsl.g:3718:1: ( 'ProvidedService' )
            {
            // InternalCosaDsl.g:3718:1: ( 'ProvidedService' )
            // InternalCosaDsl.g:3719:2: 'ProvidedService'
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__1__Impl"


    // $ANTLR start "rule__ProvidedService__Group__2"
    // InternalCosaDsl.g:3728:1: rule__ProvidedService__Group__2 : rule__ProvidedService__Group__2__Impl ;
    public final void rule__ProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3732:1: ( rule__ProvidedService__Group__2__Impl )
            // InternalCosaDsl.g:3733:2: rule__ProvidedService__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__2"


    // $ANTLR start "rule__ProvidedService__Group__2__Impl"
    // InternalCosaDsl.g:3739:1: rule__ProvidedService__Group__2__Impl : ( ( rule__ProvidedService__NameAssignment_2 ) ) ;
    public final void rule__ProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3743:1: ( ( ( rule__ProvidedService__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3744:1: ( ( rule__ProvidedService__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3744:1: ( ( rule__ProvidedService__NameAssignment_2 ) )
            // InternalCosaDsl.g:3745:2: ( rule__ProvidedService__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedServiceAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3746:2: ( rule__ProvidedService__NameAssignment_2 )
            // InternalCosaDsl.g:3746:3: rule__ProvidedService__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProvidedServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__2__Impl"


    // $ANTLR start "rule__Role_Impl__Group__0"
    // InternalCosaDsl.g:3755:1: rule__Role_Impl__Group__0 : rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 ;
    public final void rule__Role_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3759:1: ( rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 )
            // InternalCosaDsl.g:3760:2: rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Role_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__0"


    // $ANTLR start "rule__Role_Impl__Group__0__Impl"
    // InternalCosaDsl.g:3767:1: rule__Role_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Role_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3771:1: ( ( () ) )
            // InternalCosaDsl.g:3772:1: ( () )
            {
            // InternalCosaDsl.g:3772:1: ( () )
            // InternalCosaDsl.g:3773:2: ()
            {
             before(grammarAccess.getRole_ImplAccess().getRoleAction_0()); 
            // InternalCosaDsl.g:3774:2: ()
            // InternalCosaDsl.g:3774:3: 
            {
            }

             after(grammarAccess.getRole_ImplAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__0__Impl"


    // $ANTLR start "rule__Role_Impl__Group__1"
    // InternalCosaDsl.g:3782:1: rule__Role_Impl__Group__1 : rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 ;
    public final void rule__Role_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3786:1: ( rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 )
            // InternalCosaDsl.g:3787:2: rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Role_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__1"


    // $ANTLR start "rule__Role_Impl__Group__1__Impl"
    // InternalCosaDsl.g:3794:1: rule__Role_Impl__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3798:1: ( ( 'Role' ) )
            // InternalCosaDsl.g:3799:1: ( 'Role' )
            {
            // InternalCosaDsl.g:3799:1: ( 'Role' )
            // InternalCosaDsl.g:3800:2: 'Role'
            {
             before(grammarAccess.getRole_ImplAccess().getRoleKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRole_ImplAccess().getRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__1__Impl"


    // $ANTLR start "rule__Role_Impl__Group__2"
    // InternalCosaDsl.g:3809:1: rule__Role_Impl__Group__2 : rule__Role_Impl__Group__2__Impl ;
    public final void rule__Role_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3813:1: ( rule__Role_Impl__Group__2__Impl )
            // InternalCosaDsl.g:3814:2: rule__Role_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__2"


    // $ANTLR start "rule__Role_Impl__Group__2__Impl"
    // InternalCosaDsl.g:3820:1: rule__Role_Impl__Group__2__Impl : ( ( rule__Role_Impl__NameAssignment_2 ) ) ;
    public final void rule__Role_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3824:1: ( ( ( rule__Role_Impl__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3825:1: ( ( rule__Role_Impl__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3825:1: ( ( rule__Role_Impl__NameAssignment_2 ) )
            // InternalCosaDsl.g:3826:2: ( rule__Role_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getRole_ImplAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3827:2: ( rule__Role_Impl__NameAssignment_2 )
            // InternalCosaDsl.g:3827:3: rule__Role_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRole_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__Group__2__Impl"


    // $ANTLR start "rule__RequiredRole__Group__0"
    // InternalCosaDsl.g:3836:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3840:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalCosaDsl.g:3841:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__RequiredRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__0"


    // $ANTLR start "rule__RequiredRole__Group__0__Impl"
    // InternalCosaDsl.g:3848:1: rule__RequiredRole__Group__0__Impl : ( () ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3852:1: ( ( () ) )
            // InternalCosaDsl.g:3853:1: ( () )
            {
            // InternalCosaDsl.g:3853:1: ( () )
            // InternalCosaDsl.g:3854:2: ()
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0()); 
            // InternalCosaDsl.g:3855:2: ()
            // InternalCosaDsl.g:3855:3: 
            {
            }

             after(grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__0__Impl"


    // $ANTLR start "rule__RequiredRole__Group__1"
    // InternalCosaDsl.g:3863:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3867:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalCosaDsl.g:3868:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RequiredRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__1"


    // $ANTLR start "rule__RequiredRole__Group__1__Impl"
    // InternalCosaDsl.g:3875:1: rule__RequiredRole__Group__1__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3879:1: ( ( 'RequiredRole' ) )
            // InternalCosaDsl.g:3880:1: ( 'RequiredRole' )
            {
            // InternalCosaDsl.g:3880:1: ( 'RequiredRole' )
            // InternalCosaDsl.g:3881:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__1__Impl"


    // $ANTLR start "rule__RequiredRole__Group__2"
    // InternalCosaDsl.g:3890:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3894:1: ( rule__RequiredRole__Group__2__Impl )
            // InternalCosaDsl.g:3895:2: rule__RequiredRole__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__2"


    // $ANTLR start "rule__RequiredRole__Group__2__Impl"
    // InternalCosaDsl.g:3901:1: rule__RequiredRole__Group__2__Impl : ( ( rule__RequiredRole__NameAssignment_2 ) ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3905:1: ( ( ( rule__RequiredRole__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3906:1: ( ( rule__RequiredRole__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3906:1: ( ( rule__RequiredRole__NameAssignment_2 ) )
            // InternalCosaDsl.g:3907:2: ( rule__RequiredRole__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3908:2: ( rule__RequiredRole__NameAssignment_2 )
            // InternalCosaDsl.g:3908:3: rule__RequiredRole__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequiredRole__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredRoleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__Group__2__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__0"
    // InternalCosaDsl.g:3917:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3921:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalCosaDsl.g:3922:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ProvidedRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__0"


    // $ANTLR start "rule__ProvidedRole__Group__0__Impl"
    // InternalCosaDsl.g:3929:1: rule__ProvidedRole__Group__0__Impl : ( () ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3933:1: ( ( () ) )
            // InternalCosaDsl.g:3934:1: ( () )
            {
            // InternalCosaDsl.g:3934:1: ( () )
            // InternalCosaDsl.g:3935:2: ()
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0()); 
            // InternalCosaDsl.g:3936:2: ()
            // InternalCosaDsl.g:3936:3: 
            {
            }

             after(grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__0__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__1"
    // InternalCosaDsl.g:3944:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3948:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalCosaDsl.g:3949:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedRole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__1"


    // $ANTLR start "rule__ProvidedRole__Group__1__Impl"
    // InternalCosaDsl.g:3956:1: rule__ProvidedRole__Group__1__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3960:1: ( ( 'ProvidedRole' ) )
            // InternalCosaDsl.g:3961:1: ( 'ProvidedRole' )
            {
            // InternalCosaDsl.g:3961:1: ( 'ProvidedRole' )
            // InternalCosaDsl.g:3962:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__1__Impl"


    // $ANTLR start "rule__ProvidedRole__Group__2"
    // InternalCosaDsl.g:3971:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3975:1: ( rule__ProvidedRole__Group__2__Impl )
            // InternalCosaDsl.g:3976:2: rule__ProvidedRole__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__2"


    // $ANTLR start "rule__ProvidedRole__Group__2__Impl"
    // InternalCosaDsl.g:3982:1: rule__ProvidedRole__Group__2__Impl : ( ( rule__ProvidedRole__NameAssignment_2 ) ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3986:1: ( ( ( rule__ProvidedRole__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3987:1: ( ( rule__ProvidedRole__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3987:1: ( ( rule__ProvidedRole__NameAssignment_2 ) )
            // InternalCosaDsl.g:3988:2: ( rule__ProvidedRole__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3989:2: ( rule__ProvidedRole__NameAssignment_2 )
            // InternalCosaDsl.g:3989:3: rule__ProvidedRole__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedRole__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProvidedRoleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__Group__2__Impl"


    // $ANTLR start "rule__Glue__Group__0"
    // InternalCosaDsl.g:3998:1: rule__Glue__Group__0 : rule__Glue__Group__0__Impl rule__Glue__Group__1 ;
    public final void rule__Glue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4002:1: ( rule__Glue__Group__0__Impl rule__Glue__Group__1 )
            // InternalCosaDsl.g:4003:2: rule__Glue__Group__0__Impl rule__Glue__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Glue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Glue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glue__Group__0"


    // $ANTLR start "rule__Glue__Group__0__Impl"
    // InternalCosaDsl.g:4010:1: rule__Glue__Group__0__Impl : ( () ) ;
    public final void rule__Glue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4014:1: ( ( () ) )
            // InternalCosaDsl.g:4015:1: ( () )
            {
            // InternalCosaDsl.g:4015:1: ( () )
            // InternalCosaDsl.g:4016:2: ()
            {
             before(grammarAccess.getGlueAccess().getGlueAction_0()); 
            // InternalCosaDsl.g:4017:2: ()
            // InternalCosaDsl.g:4017:3: 
            {
            }

             after(grammarAccess.getGlueAccess().getGlueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glue__Group__0__Impl"


    // $ANTLR start "rule__Glue__Group__1"
    // InternalCosaDsl.g:4025:1: rule__Glue__Group__1 : rule__Glue__Group__1__Impl ;
    public final void rule__Glue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4029:1: ( rule__Glue__Group__1__Impl )
            // InternalCosaDsl.g:4030:2: rule__Glue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Glue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glue__Group__1"


    // $ANTLR start "rule__Glue__Group__1__Impl"
    // InternalCosaDsl.g:4036:1: rule__Glue__Group__1__Impl : ( 'Glue' ) ;
    public final void rule__Glue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4040:1: ( ( 'Glue' ) )
            // InternalCosaDsl.g:4041:1: ( 'Glue' )
            {
            // InternalCosaDsl.g:4041:1: ( 'Glue' )
            // InternalCosaDsl.g:4042:2: 'Glue'
            {
             before(grammarAccess.getGlueAccess().getGlueKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGlueAccess().getGlueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glue__Group__1__Impl"


    // $ANTLR start "rule__RequiredPort__Group__0"
    // InternalCosaDsl.g:4052:1: rule__RequiredPort__Group__0 : rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1 ;
    public final void rule__RequiredPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4056:1: ( rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1 )
            // InternalCosaDsl.g:4057:2: rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__RequiredPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__0"


    // $ANTLR start "rule__RequiredPort__Group__0__Impl"
    // InternalCosaDsl.g:4064:1: rule__RequiredPort__Group__0__Impl : ( () ) ;
    public final void rule__RequiredPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4068:1: ( ( () ) )
            // InternalCosaDsl.g:4069:1: ( () )
            {
            // InternalCosaDsl.g:4069:1: ( () )
            // InternalCosaDsl.g:4070:2: ()
            {
             before(grammarAccess.getRequiredPortAccess().getRequiredPortAction_0()); 
            // InternalCosaDsl.g:4071:2: ()
            // InternalCosaDsl.g:4071:3: 
            {
            }

             after(grammarAccess.getRequiredPortAccess().getRequiredPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__0__Impl"


    // $ANTLR start "rule__RequiredPort__Group__1"
    // InternalCosaDsl.g:4079:1: rule__RequiredPort__Group__1 : rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2 ;
    public final void rule__RequiredPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4083:1: ( rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2 )
            // InternalCosaDsl.g:4084:2: rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RequiredPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__1"


    // $ANTLR start "rule__RequiredPort__Group__1__Impl"
    // InternalCosaDsl.g:4091:1: rule__RequiredPort__Group__1__Impl : ( 'RequiredPort' ) ;
    public final void rule__RequiredPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4095:1: ( ( 'RequiredPort' ) )
            // InternalCosaDsl.g:4096:1: ( 'RequiredPort' )
            {
            // InternalCosaDsl.g:4096:1: ( 'RequiredPort' )
            // InternalCosaDsl.g:4097:2: 'RequiredPort'
            {
             before(grammarAccess.getRequiredPortAccess().getRequiredPortKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRequiredPortAccess().getRequiredPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__1__Impl"


    // $ANTLR start "rule__RequiredPort__Group__2"
    // InternalCosaDsl.g:4106:1: rule__RequiredPort__Group__2 : rule__RequiredPort__Group__2__Impl ;
    public final void rule__RequiredPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4110:1: ( rule__RequiredPort__Group__2__Impl )
            // InternalCosaDsl.g:4111:2: rule__RequiredPort__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__2"


    // $ANTLR start "rule__RequiredPort__Group__2__Impl"
    // InternalCosaDsl.g:4117:1: rule__RequiredPort__Group__2__Impl : ( ( rule__RequiredPort__NameAssignment_2 ) ) ;
    public final void rule__RequiredPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4121:1: ( ( ( rule__RequiredPort__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:4122:1: ( ( rule__RequiredPort__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:4122:1: ( ( rule__RequiredPort__NameAssignment_2 ) )
            // InternalCosaDsl.g:4123:2: ( rule__RequiredPort__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredPortAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:4124:2: ( rule__RequiredPort__NameAssignment_2 )
            // InternalCosaDsl.g:4124:3: rule__RequiredPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequiredPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__2__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__0"
    // InternalCosaDsl.g:4133:1: rule__ProvidedPort__Group__0 : rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1 ;
    public final void rule__ProvidedPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4137:1: ( rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1 )
            // InternalCosaDsl.g:4138:2: rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ProvidedPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__0"


    // $ANTLR start "rule__ProvidedPort__Group__0__Impl"
    // InternalCosaDsl.g:4145:1: rule__ProvidedPort__Group__0__Impl : ( () ) ;
    public final void rule__ProvidedPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4149:1: ( ( () ) )
            // InternalCosaDsl.g:4150:1: ( () )
            {
            // InternalCosaDsl.g:4150:1: ( () )
            // InternalCosaDsl.g:4151:2: ()
            {
             before(grammarAccess.getProvidedPortAccess().getProvidedPortAction_0()); 
            // InternalCosaDsl.g:4152:2: ()
            // InternalCosaDsl.g:4152:3: 
            {
            }

             after(grammarAccess.getProvidedPortAccess().getProvidedPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__0__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__1"
    // InternalCosaDsl.g:4160:1: rule__ProvidedPort__Group__1 : rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2 ;
    public final void rule__ProvidedPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4164:1: ( rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2 )
            // InternalCosaDsl.g:4165:2: rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ProvidedPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__1"


    // $ANTLR start "rule__ProvidedPort__Group__1__Impl"
    // InternalCosaDsl.g:4172:1: rule__ProvidedPort__Group__1__Impl : ( 'ProvidedPort' ) ;
    public final void rule__ProvidedPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4176:1: ( ( 'ProvidedPort' ) )
            // InternalCosaDsl.g:4177:1: ( 'ProvidedPort' )
            {
            // InternalCosaDsl.g:4177:1: ( 'ProvidedPort' )
            // InternalCosaDsl.g:4178:2: 'ProvidedPort'
            {
             before(grammarAccess.getProvidedPortAccess().getProvidedPortKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProvidedPortAccess().getProvidedPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__1__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__2"
    // InternalCosaDsl.g:4187:1: rule__ProvidedPort__Group__2 : rule__ProvidedPort__Group__2__Impl ;
    public final void rule__ProvidedPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4191:1: ( rule__ProvidedPort__Group__2__Impl )
            // InternalCosaDsl.g:4192:2: rule__ProvidedPort__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__2"


    // $ANTLR start "rule__ProvidedPort__Group__2__Impl"
    // InternalCosaDsl.g:4198:1: rule__ProvidedPort__Group__2__Impl : ( ( rule__ProvidedPort__NameAssignment_2 ) ) ;
    public final void rule__ProvidedPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4202:1: ( ( ( rule__ProvidedPort__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:4203:1: ( ( rule__ProvidedPort__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:4203:1: ( ( rule__ProvidedPort__NameAssignment_2 ) )
            // InternalCosaDsl.g:4204:2: ( rule__ProvidedPort__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedPortAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:4205:2: ( rule__ProvidedPort__NameAssignment_2 )
            // InternalCosaDsl.g:4205:3: rule__ProvidedPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__2__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__0"
    // InternalCosaDsl.g:4214:1: rule__SimpleConfiguration__Group__0 : rule__SimpleConfiguration__Group__0__Impl rule__SimpleConfiguration__Group__1 ;
    public final void rule__SimpleConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4218:1: ( rule__SimpleConfiguration__Group__0__Impl rule__SimpleConfiguration__Group__1 )
            // InternalCosaDsl.g:4219:2: rule__SimpleConfiguration__Group__0__Impl rule__SimpleConfiguration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SimpleConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__0"


    // $ANTLR start "rule__SimpleConfiguration__Group__0__Impl"
    // InternalCosaDsl.g:4226:1: rule__SimpleConfiguration__Group__0__Impl : ( 'SimpleConfiguration' ) ;
    public final void rule__SimpleConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4230:1: ( ( 'SimpleConfiguration' ) )
            // InternalCosaDsl.g:4231:1: ( 'SimpleConfiguration' )
            {
            // InternalCosaDsl.g:4231:1: ( 'SimpleConfiguration' )
            // InternalCosaDsl.g:4232:2: 'SimpleConfiguration'
            {
             before(grammarAccess.getSimpleConfigurationAccess().getSimpleConfigurationKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getSimpleConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__1"
    // InternalCosaDsl.g:4241:1: rule__SimpleConfiguration__Group__1 : rule__SimpleConfiguration__Group__1__Impl rule__SimpleConfiguration__Group__2 ;
    public final void rule__SimpleConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4245:1: ( rule__SimpleConfiguration__Group__1__Impl rule__SimpleConfiguration__Group__2 )
            // InternalCosaDsl.g:4246:2: rule__SimpleConfiguration__Group__1__Impl rule__SimpleConfiguration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SimpleConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__1"


    // $ANTLR start "rule__SimpleConfiguration__Group__1__Impl"
    // InternalCosaDsl.g:4253:1: rule__SimpleConfiguration__Group__1__Impl : ( ( rule__SimpleConfiguration__NameAssignment_1 ) ) ;
    public final void rule__SimpleConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4257:1: ( ( ( rule__SimpleConfiguration__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:4258:1: ( ( rule__SimpleConfiguration__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:4258:1: ( ( rule__SimpleConfiguration__NameAssignment_1 ) )
            // InternalCosaDsl.g:4259:2: ( rule__SimpleConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:4260:2: ( rule__SimpleConfiguration__NameAssignment_1 )
            // InternalCosaDsl.g:4260:3: rule__SimpleConfiguration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__2"
    // InternalCosaDsl.g:4268:1: rule__SimpleConfiguration__Group__2 : rule__SimpleConfiguration__Group__2__Impl rule__SimpleConfiguration__Group__3 ;
    public final void rule__SimpleConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4272:1: ( rule__SimpleConfiguration__Group__2__Impl rule__SimpleConfiguration__Group__3 )
            // InternalCosaDsl.g:4273:2: rule__SimpleConfiguration__Group__2__Impl rule__SimpleConfiguration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SimpleConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__2"


    // $ANTLR start "rule__SimpleConfiguration__Group__2__Impl"
    // InternalCosaDsl.g:4280:1: rule__SimpleConfiguration__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4284:1: ( ( '{' ) )
            // InternalCosaDsl.g:4285:1: ( '{' )
            {
            // InternalCosaDsl.g:4285:1: ( '{' )
            // InternalCosaDsl.g:4286:2: '{'
            {
             before(grammarAccess.getSimpleConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__2__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__3"
    // InternalCosaDsl.g:4295:1: rule__SimpleConfiguration__Group__3 : rule__SimpleConfiguration__Group__3__Impl rule__SimpleConfiguration__Group__4 ;
    public final void rule__SimpleConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4299:1: ( rule__SimpleConfiguration__Group__3__Impl rule__SimpleConfiguration__Group__4 )
            // InternalCosaDsl.g:4300:2: rule__SimpleConfiguration__Group__3__Impl rule__SimpleConfiguration__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__SimpleConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__3"


    // $ANTLR start "rule__SimpleConfiguration__Group__3__Impl"
    // InternalCosaDsl.g:4307:1: rule__SimpleConfiguration__Group__3__Impl : ( ( rule__SimpleConfiguration__ComponentsAssignment_3 ) ) ;
    public final void rule__SimpleConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4311:1: ( ( ( rule__SimpleConfiguration__ComponentsAssignment_3 ) ) )
            // InternalCosaDsl.g:4312:1: ( ( rule__SimpleConfiguration__ComponentsAssignment_3 ) )
            {
            // InternalCosaDsl.g:4312:1: ( ( rule__SimpleConfiguration__ComponentsAssignment_3 ) )
            // InternalCosaDsl.g:4313:2: ( rule__SimpleConfiguration__ComponentsAssignment_3 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getComponentsAssignment_3()); 
            // InternalCosaDsl.g:4314:2: ( rule__SimpleConfiguration__ComponentsAssignment_3 )
            // InternalCosaDsl.g:4314:3: rule__SimpleConfiguration__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getComponentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__3__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__4"
    // InternalCosaDsl.g:4322:1: rule__SimpleConfiguration__Group__4 : rule__SimpleConfiguration__Group__4__Impl rule__SimpleConfiguration__Group__5 ;
    public final void rule__SimpleConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4326:1: ( rule__SimpleConfiguration__Group__4__Impl rule__SimpleConfiguration__Group__5 )
            // InternalCosaDsl.g:4327:2: rule__SimpleConfiguration__Group__4__Impl rule__SimpleConfiguration__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__SimpleConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__4"


    // $ANTLR start "rule__SimpleConfiguration__Group__4__Impl"
    // InternalCosaDsl.g:4334:1: rule__SimpleConfiguration__Group__4__Impl : ( ( rule__SimpleConfiguration__Group_4__0 )* ) ;
    public final void rule__SimpleConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4338:1: ( ( ( rule__SimpleConfiguration__Group_4__0 )* ) )
            // InternalCosaDsl.g:4339:1: ( ( rule__SimpleConfiguration__Group_4__0 )* )
            {
            // InternalCosaDsl.g:4339:1: ( ( rule__SimpleConfiguration__Group_4__0 )* )
            // InternalCosaDsl.g:4340:2: ( rule__SimpleConfiguration__Group_4__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_4()); 
            // InternalCosaDsl.g:4341:2: ( rule__SimpleConfiguration__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCosaDsl.g:4341:3: rule__SimpleConfiguration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleConfiguration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__4__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__5"
    // InternalCosaDsl.g:4349:1: rule__SimpleConfiguration__Group__5 : rule__SimpleConfiguration__Group__5__Impl rule__SimpleConfiguration__Group__6 ;
    public final void rule__SimpleConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4353:1: ( rule__SimpleConfiguration__Group__5__Impl rule__SimpleConfiguration__Group__6 )
            // InternalCosaDsl.g:4354:2: rule__SimpleConfiguration__Group__5__Impl rule__SimpleConfiguration__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__SimpleConfiguration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__5"


    // $ANTLR start "rule__SimpleConfiguration__Group__5__Impl"
    // InternalCosaDsl.g:4361:1: rule__SimpleConfiguration__Group__5__Impl : ( ( rule__SimpleConfiguration__Group_5__0 )* ) ;
    public final void rule__SimpleConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4365:1: ( ( ( rule__SimpleConfiguration__Group_5__0 )* ) )
            // InternalCosaDsl.g:4366:1: ( ( rule__SimpleConfiguration__Group_5__0 )* )
            {
            // InternalCosaDsl.g:4366:1: ( ( rule__SimpleConfiguration__Group_5__0 )* )
            // InternalCosaDsl.g:4367:2: ( rule__SimpleConfiguration__Group_5__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_5()); 
            // InternalCosaDsl.g:4368:2: ( rule__SimpleConfiguration__Group_5__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCosaDsl.g:4368:3: rule__SimpleConfiguration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SimpleConfiguration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__5__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__6"
    // InternalCosaDsl.g:4376:1: rule__SimpleConfiguration__Group__6 : rule__SimpleConfiguration__Group__6__Impl rule__SimpleConfiguration__Group__7 ;
    public final void rule__SimpleConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4380:1: ( rule__SimpleConfiguration__Group__6__Impl rule__SimpleConfiguration__Group__7 )
            // InternalCosaDsl.g:4381:2: rule__SimpleConfiguration__Group__6__Impl rule__SimpleConfiguration__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__SimpleConfiguration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__6"


    // $ANTLR start "rule__SimpleConfiguration__Group__6__Impl"
    // InternalCosaDsl.g:4388:1: rule__SimpleConfiguration__Group__6__Impl : ( ( rule__SimpleConfiguration__Group_6__0 )* ) ;
    public final void rule__SimpleConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4392:1: ( ( ( rule__SimpleConfiguration__Group_6__0 )* ) )
            // InternalCosaDsl.g:4393:1: ( ( rule__SimpleConfiguration__Group_6__0 )* )
            {
            // InternalCosaDsl.g:4393:1: ( ( rule__SimpleConfiguration__Group_6__0 )* )
            // InternalCosaDsl.g:4394:2: ( rule__SimpleConfiguration__Group_6__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_6()); 
            // InternalCosaDsl.g:4395:2: ( rule__SimpleConfiguration__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18||(LA29_0>=33 && LA29_0<=34)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCosaDsl.g:4395:3: rule__SimpleConfiguration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SimpleConfiguration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__6__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__7"
    // InternalCosaDsl.g:4403:1: rule__SimpleConfiguration__Group__7 : rule__SimpleConfiguration__Group__7__Impl rule__SimpleConfiguration__Group__8 ;
    public final void rule__SimpleConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4407:1: ( rule__SimpleConfiguration__Group__7__Impl rule__SimpleConfiguration__Group__8 )
            // InternalCosaDsl.g:4408:2: rule__SimpleConfiguration__Group__7__Impl rule__SimpleConfiguration__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__SimpleConfiguration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__7"


    // $ANTLR start "rule__SimpleConfiguration__Group__7__Impl"
    // InternalCosaDsl.g:4415:1: rule__SimpleConfiguration__Group__7__Impl : ( ( rule__SimpleConfiguration__Group_7__0 )* ) ;
    public final void rule__SimpleConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4419:1: ( ( ( rule__SimpleConfiguration__Group_7__0 )* ) )
            // InternalCosaDsl.g:4420:1: ( ( rule__SimpleConfiguration__Group_7__0 )* )
            {
            // InternalCosaDsl.g:4420:1: ( ( rule__SimpleConfiguration__Group_7__0 )* )
            // InternalCosaDsl.g:4421:2: ( rule__SimpleConfiguration__Group_7__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_7()); 
            // InternalCosaDsl.g:4422:2: ( rule__SimpleConfiguration__Group_7__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCosaDsl.g:4422:3: rule__SimpleConfiguration__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleConfiguration__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__7__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group__8"
    // InternalCosaDsl.g:4430:1: rule__SimpleConfiguration__Group__8 : rule__SimpleConfiguration__Group__8__Impl ;
    public final void rule__SimpleConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4434:1: ( rule__SimpleConfiguration__Group__8__Impl )
            // InternalCosaDsl.g:4435:2: rule__SimpleConfiguration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__8"


    // $ANTLR start "rule__SimpleConfiguration__Group__8__Impl"
    // InternalCosaDsl.g:4441:1: rule__SimpleConfiguration__Group__8__Impl : ( '}' ) ;
    public final void rule__SimpleConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4445:1: ( ( '}' ) )
            // InternalCosaDsl.g:4446:1: ( '}' )
            {
            // InternalCosaDsl.g:4446:1: ( '}' )
            // InternalCosaDsl.g:4447:2: '}'
            {
             before(grammarAccess.getSimpleConfigurationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group__8__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_4__0"
    // InternalCosaDsl.g:4457:1: rule__SimpleConfiguration__Group_4__0 : rule__SimpleConfiguration__Group_4__0__Impl rule__SimpleConfiguration__Group_4__1 ;
    public final void rule__SimpleConfiguration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4461:1: ( rule__SimpleConfiguration__Group_4__0__Impl rule__SimpleConfiguration__Group_4__1 )
            // InternalCosaDsl.g:4462:2: rule__SimpleConfiguration__Group_4__0__Impl rule__SimpleConfiguration__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SimpleConfiguration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_4__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_4__0__Impl"
    // InternalCosaDsl.g:4469:1: rule__SimpleConfiguration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SimpleConfiguration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4473:1: ( ( ',' ) )
            // InternalCosaDsl.g:4474:1: ( ',' )
            {
            // InternalCosaDsl.g:4474:1: ( ',' )
            // InternalCosaDsl.g:4475:2: ','
            {
             before(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_4__1"
    // InternalCosaDsl.g:4484:1: rule__SimpleConfiguration__Group_4__1 : rule__SimpleConfiguration__Group_4__1__Impl ;
    public final void rule__SimpleConfiguration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4488:1: ( rule__SimpleConfiguration__Group_4__1__Impl )
            // InternalCosaDsl.g:4489:2: rule__SimpleConfiguration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_4__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_4__1__Impl"
    // InternalCosaDsl.g:4495:1: rule__SimpleConfiguration__Group_4__1__Impl : ( ( rule__SimpleConfiguration__ComponentsAssignment_4_1 ) ) ;
    public final void rule__SimpleConfiguration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4499:1: ( ( ( rule__SimpleConfiguration__ComponentsAssignment_4_1 ) ) )
            // InternalCosaDsl.g:4500:1: ( ( rule__SimpleConfiguration__ComponentsAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:4500:1: ( ( rule__SimpleConfiguration__ComponentsAssignment_4_1 ) )
            // InternalCosaDsl.g:4501:2: ( rule__SimpleConfiguration__ComponentsAssignment_4_1 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getComponentsAssignment_4_1()); 
            // InternalCosaDsl.g:4502:2: ( rule__SimpleConfiguration__ComponentsAssignment_4_1 )
            // InternalCosaDsl.g:4502:3: rule__SimpleConfiguration__ComponentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__ComponentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getComponentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_5__0"
    // InternalCosaDsl.g:4511:1: rule__SimpleConfiguration__Group_5__0 : rule__SimpleConfiguration__Group_5__0__Impl rule__SimpleConfiguration__Group_5__1 ;
    public final void rule__SimpleConfiguration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4515:1: ( rule__SimpleConfiguration__Group_5__0__Impl rule__SimpleConfiguration__Group_5__1 )
            // InternalCosaDsl.g:4516:2: rule__SimpleConfiguration__Group_5__0__Impl rule__SimpleConfiguration__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleConfiguration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_5__0__Impl"
    // InternalCosaDsl.g:4523:1: rule__SimpleConfiguration__Group_5__0__Impl : ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_0 ) ) ;
    public final void rule__SimpleConfiguration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4527:1: ( ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_0 ) ) )
            // InternalCosaDsl.g:4528:1: ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_0 ) )
            {
            // InternalCosaDsl.g:4528:1: ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_0 ) )
            // InternalCosaDsl.g:4529:2: ( rule__SimpleConfiguration__ConnectorsAssignment_5_0 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getConnectorsAssignment_5_0()); 
            // InternalCosaDsl.g:4530:2: ( rule__SimpleConfiguration__ConnectorsAssignment_5_0 )
            // InternalCosaDsl.g:4530:3: rule__SimpleConfiguration__ConnectorsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__ConnectorsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getConnectorsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_5__1"
    // InternalCosaDsl.g:4538:1: rule__SimpleConfiguration__Group_5__1 : rule__SimpleConfiguration__Group_5__1__Impl ;
    public final void rule__SimpleConfiguration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4542:1: ( rule__SimpleConfiguration__Group_5__1__Impl )
            // InternalCosaDsl.g:4543:2: rule__SimpleConfiguration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_5__1__Impl"
    // InternalCosaDsl.g:4549:1: rule__SimpleConfiguration__Group_5__1__Impl : ( ( rule__SimpleConfiguration__Group_5_1__0 )* ) ;
    public final void rule__SimpleConfiguration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4553:1: ( ( ( rule__SimpleConfiguration__Group_5_1__0 )* ) )
            // InternalCosaDsl.g:4554:1: ( ( rule__SimpleConfiguration__Group_5_1__0 )* )
            {
            // InternalCosaDsl.g:4554:1: ( ( rule__SimpleConfiguration__Group_5_1__0 )* )
            // InternalCosaDsl.g:4555:2: ( rule__SimpleConfiguration__Group_5_1__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_5_1()); 
            // InternalCosaDsl.g:4556:2: ( rule__SimpleConfiguration__Group_5_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==14) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCosaDsl.g:4556:3: rule__SimpleConfiguration__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleConfiguration__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_5_1__0"
    // InternalCosaDsl.g:4565:1: rule__SimpleConfiguration__Group_5_1__0 : rule__SimpleConfiguration__Group_5_1__0__Impl rule__SimpleConfiguration__Group_5_1__1 ;
    public final void rule__SimpleConfiguration__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4569:1: ( rule__SimpleConfiguration__Group_5_1__0__Impl rule__SimpleConfiguration__Group_5_1__1 )
            // InternalCosaDsl.g:4570:2: rule__SimpleConfiguration__Group_5_1__0__Impl rule__SimpleConfiguration__Group_5_1__1
            {
            pushFollow(FOLLOW_14);
            rule__SimpleConfiguration__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5_1__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_5_1__0__Impl"
    // InternalCosaDsl.g:4577:1: rule__SimpleConfiguration__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleConfiguration__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4581:1: ( ( ',' ) )
            // InternalCosaDsl.g:4582:1: ( ',' )
            {
            // InternalCosaDsl.g:4582:1: ( ',' )
            // InternalCosaDsl.g:4583:2: ','
            {
             before(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_5_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5_1__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_5_1__1"
    // InternalCosaDsl.g:4592:1: rule__SimpleConfiguration__Group_5_1__1 : rule__SimpleConfiguration__Group_5_1__1__Impl ;
    public final void rule__SimpleConfiguration__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4596:1: ( rule__SimpleConfiguration__Group_5_1__1__Impl )
            // InternalCosaDsl.g:4597:2: rule__SimpleConfiguration__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5_1__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_5_1__1__Impl"
    // InternalCosaDsl.g:4603:1: rule__SimpleConfiguration__Group_5_1__1__Impl : ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 ) ) ;
    public final void rule__SimpleConfiguration__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4607:1: ( ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 ) ) )
            // InternalCosaDsl.g:4608:1: ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 ) )
            {
            // InternalCosaDsl.g:4608:1: ( ( rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 ) )
            // InternalCosaDsl.g:4609:2: ( rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getConnectorsAssignment_5_1_1()); 
            // InternalCosaDsl.g:4610:2: ( rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 )
            // InternalCosaDsl.g:4610:3: rule__SimpleConfiguration__ConnectorsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__ConnectorsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getConnectorsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_5_1__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_6__0"
    // InternalCosaDsl.g:4619:1: rule__SimpleConfiguration__Group_6__0 : rule__SimpleConfiguration__Group_6__0__Impl rule__SimpleConfiguration__Group_6__1 ;
    public final void rule__SimpleConfiguration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4623:1: ( rule__SimpleConfiguration__Group_6__0__Impl rule__SimpleConfiguration__Group_6__1 )
            // InternalCosaDsl.g:4624:2: rule__SimpleConfiguration__Group_6__0__Impl rule__SimpleConfiguration__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleConfiguration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_6__0__Impl"
    // InternalCosaDsl.g:4631:1: rule__SimpleConfiguration__Group_6__0__Impl : ( ( rule__SimpleConfiguration__PortsAssignment_6_0 ) ) ;
    public final void rule__SimpleConfiguration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4635:1: ( ( ( rule__SimpleConfiguration__PortsAssignment_6_0 ) ) )
            // InternalCosaDsl.g:4636:1: ( ( rule__SimpleConfiguration__PortsAssignment_6_0 ) )
            {
            // InternalCosaDsl.g:4636:1: ( ( rule__SimpleConfiguration__PortsAssignment_6_0 ) )
            // InternalCosaDsl.g:4637:2: ( rule__SimpleConfiguration__PortsAssignment_6_0 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getPortsAssignment_6_0()); 
            // InternalCosaDsl.g:4638:2: ( rule__SimpleConfiguration__PortsAssignment_6_0 )
            // InternalCosaDsl.g:4638:3: rule__SimpleConfiguration__PortsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__PortsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getPortsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_6__1"
    // InternalCosaDsl.g:4646:1: rule__SimpleConfiguration__Group_6__1 : rule__SimpleConfiguration__Group_6__1__Impl ;
    public final void rule__SimpleConfiguration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4650:1: ( rule__SimpleConfiguration__Group_6__1__Impl )
            // InternalCosaDsl.g:4651:2: rule__SimpleConfiguration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_6__1__Impl"
    // InternalCosaDsl.g:4657:1: rule__SimpleConfiguration__Group_6__1__Impl : ( ( rule__SimpleConfiguration__Group_6_1__0 )* ) ;
    public final void rule__SimpleConfiguration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4661:1: ( ( ( rule__SimpleConfiguration__Group_6_1__0 )* ) )
            // InternalCosaDsl.g:4662:1: ( ( rule__SimpleConfiguration__Group_6_1__0 )* )
            {
            // InternalCosaDsl.g:4662:1: ( ( rule__SimpleConfiguration__Group_6_1__0 )* )
            // InternalCosaDsl.g:4663:2: ( rule__SimpleConfiguration__Group_6_1__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_6_1()); 
            // InternalCosaDsl.g:4664:2: ( rule__SimpleConfiguration__Group_6_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCosaDsl.g:4664:3: rule__SimpleConfiguration__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleConfiguration__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_6_1__0"
    // InternalCosaDsl.g:4673:1: rule__SimpleConfiguration__Group_6_1__0 : rule__SimpleConfiguration__Group_6_1__0__Impl rule__SimpleConfiguration__Group_6_1__1 ;
    public final void rule__SimpleConfiguration__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4677:1: ( rule__SimpleConfiguration__Group_6_1__0__Impl rule__SimpleConfiguration__Group_6_1__1 )
            // InternalCosaDsl.g:4678:2: rule__SimpleConfiguration__Group_6_1__0__Impl rule__SimpleConfiguration__Group_6_1__1
            {
            pushFollow(FOLLOW_15);
            rule__SimpleConfiguration__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6_1__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_6_1__0__Impl"
    // InternalCosaDsl.g:4685:1: rule__SimpleConfiguration__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleConfiguration__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4689:1: ( ( ',' ) )
            // InternalCosaDsl.g:4690:1: ( ',' )
            {
            // InternalCosaDsl.g:4690:1: ( ',' )
            // InternalCosaDsl.g:4691:2: ','
            {
             before(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_6_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6_1__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_6_1__1"
    // InternalCosaDsl.g:4700:1: rule__SimpleConfiguration__Group_6_1__1 : rule__SimpleConfiguration__Group_6_1__1__Impl ;
    public final void rule__SimpleConfiguration__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4704:1: ( rule__SimpleConfiguration__Group_6_1__1__Impl )
            // InternalCosaDsl.g:4705:2: rule__SimpleConfiguration__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6_1__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_6_1__1__Impl"
    // InternalCosaDsl.g:4711:1: rule__SimpleConfiguration__Group_6_1__1__Impl : ( ( rule__SimpleConfiguration__PortsAssignment_6_1_1 ) ) ;
    public final void rule__SimpleConfiguration__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4715:1: ( ( ( rule__SimpleConfiguration__PortsAssignment_6_1_1 ) ) )
            // InternalCosaDsl.g:4716:1: ( ( rule__SimpleConfiguration__PortsAssignment_6_1_1 ) )
            {
            // InternalCosaDsl.g:4716:1: ( ( rule__SimpleConfiguration__PortsAssignment_6_1_1 ) )
            // InternalCosaDsl.g:4717:2: ( rule__SimpleConfiguration__PortsAssignment_6_1_1 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getPortsAssignment_6_1_1()); 
            // InternalCosaDsl.g:4718:2: ( rule__SimpleConfiguration__PortsAssignment_6_1_1 )
            // InternalCosaDsl.g:4718:3: rule__SimpleConfiguration__PortsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__PortsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getPortsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_6_1__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_7__0"
    // InternalCosaDsl.g:4727:1: rule__SimpleConfiguration__Group_7__0 : rule__SimpleConfiguration__Group_7__0__Impl rule__SimpleConfiguration__Group_7__1 ;
    public final void rule__SimpleConfiguration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4731:1: ( rule__SimpleConfiguration__Group_7__0__Impl rule__SimpleConfiguration__Group_7__1 )
            // InternalCosaDsl.g:4732:2: rule__SimpleConfiguration__Group_7__0__Impl rule__SimpleConfiguration__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleConfiguration__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_7__0__Impl"
    // InternalCosaDsl.g:4739:1: rule__SimpleConfiguration__Group_7__0__Impl : ( ( rule__SimpleConfiguration__BindingsAssignment_7_0 ) ) ;
    public final void rule__SimpleConfiguration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4743:1: ( ( ( rule__SimpleConfiguration__BindingsAssignment_7_0 ) ) )
            // InternalCosaDsl.g:4744:1: ( ( rule__SimpleConfiguration__BindingsAssignment_7_0 ) )
            {
            // InternalCosaDsl.g:4744:1: ( ( rule__SimpleConfiguration__BindingsAssignment_7_0 ) )
            // InternalCosaDsl.g:4745:2: ( rule__SimpleConfiguration__BindingsAssignment_7_0 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getBindingsAssignment_7_0()); 
            // InternalCosaDsl.g:4746:2: ( rule__SimpleConfiguration__BindingsAssignment_7_0 )
            // InternalCosaDsl.g:4746:3: rule__SimpleConfiguration__BindingsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__BindingsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getBindingsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_7__1"
    // InternalCosaDsl.g:4754:1: rule__SimpleConfiguration__Group_7__1 : rule__SimpleConfiguration__Group_7__1__Impl ;
    public final void rule__SimpleConfiguration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4758:1: ( rule__SimpleConfiguration__Group_7__1__Impl )
            // InternalCosaDsl.g:4759:2: rule__SimpleConfiguration__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_7__1__Impl"
    // InternalCosaDsl.g:4765:1: rule__SimpleConfiguration__Group_7__1__Impl : ( ( rule__SimpleConfiguration__Group_7_1__0 )* ) ;
    public final void rule__SimpleConfiguration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4769:1: ( ( ( rule__SimpleConfiguration__Group_7_1__0 )* ) )
            // InternalCosaDsl.g:4770:1: ( ( rule__SimpleConfiguration__Group_7_1__0 )* )
            {
            // InternalCosaDsl.g:4770:1: ( ( rule__SimpleConfiguration__Group_7_1__0 )* )
            // InternalCosaDsl.g:4771:2: ( rule__SimpleConfiguration__Group_7_1__0 )*
            {
             before(grammarAccess.getSimpleConfigurationAccess().getGroup_7_1()); 
            // InternalCosaDsl.g:4772:2: ( rule__SimpleConfiguration__Group_7_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCosaDsl.g:4772:3: rule__SimpleConfiguration__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleConfiguration__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSimpleConfigurationAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_7_1__0"
    // InternalCosaDsl.g:4781:1: rule__SimpleConfiguration__Group_7_1__0 : rule__SimpleConfiguration__Group_7_1__0__Impl rule__SimpleConfiguration__Group_7_1__1 ;
    public final void rule__SimpleConfiguration__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4785:1: ( rule__SimpleConfiguration__Group_7_1__0__Impl rule__SimpleConfiguration__Group_7_1__1 )
            // InternalCosaDsl.g:4786:2: rule__SimpleConfiguration__Group_7_1__0__Impl rule__SimpleConfiguration__Group_7_1__1
            {
            pushFollow(FOLLOW_16);
            rule__SimpleConfiguration__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7_1__0"


    // $ANTLR start "rule__SimpleConfiguration__Group_7_1__0__Impl"
    // InternalCosaDsl.g:4793:1: rule__SimpleConfiguration__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleConfiguration__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4797:1: ( ( ',' ) )
            // InternalCosaDsl.g:4798:1: ( ',' )
            {
            // InternalCosaDsl.g:4798:1: ( ',' )
            // InternalCosaDsl.g:4799:2: ','
            {
             before(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_7_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSimpleConfigurationAccess().getCommaKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7_1__0__Impl"


    // $ANTLR start "rule__SimpleConfiguration__Group_7_1__1"
    // InternalCosaDsl.g:4808:1: rule__SimpleConfiguration__Group_7_1__1 : rule__SimpleConfiguration__Group_7_1__1__Impl ;
    public final void rule__SimpleConfiguration__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4812:1: ( rule__SimpleConfiguration__Group_7_1__1__Impl )
            // InternalCosaDsl.g:4813:2: rule__SimpleConfiguration__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7_1__1"


    // $ANTLR start "rule__SimpleConfiguration__Group_7_1__1__Impl"
    // InternalCosaDsl.g:4819:1: rule__SimpleConfiguration__Group_7_1__1__Impl : ( ( rule__SimpleConfiguration__BindingsAssignment_7_1_1 ) ) ;
    public final void rule__SimpleConfiguration__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4823:1: ( ( ( rule__SimpleConfiguration__BindingsAssignment_7_1_1 ) ) )
            // InternalCosaDsl.g:4824:1: ( ( rule__SimpleConfiguration__BindingsAssignment_7_1_1 ) )
            {
            // InternalCosaDsl.g:4824:1: ( ( rule__SimpleConfiguration__BindingsAssignment_7_1_1 ) )
            // InternalCosaDsl.g:4825:2: ( rule__SimpleConfiguration__BindingsAssignment_7_1_1 )
            {
             before(grammarAccess.getSimpleConfigurationAccess().getBindingsAssignment_7_1_1()); 
            // InternalCosaDsl.g:4826:2: ( rule__SimpleConfiguration__BindingsAssignment_7_1_1 )
            // InternalCosaDsl.g:4826:3: rule__SimpleConfiguration__BindingsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleConfiguration__BindingsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConfigurationAccess().getBindingsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__Group_7_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__NameAssignment_1"
    // InternalCosaDsl.g:4835:1: rule__CompositeConfiguration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4839:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4840:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4840:2: ( ruleEString )
            // InternalCosaDsl.g:4841:3: ruleEString
            {
             before(grammarAccess.getCompositeConfigurationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__NameAssignment_1"


    // $ANTLR start "rule__CompositeConfiguration__ComponentsAssignment_3_0"
    // InternalCosaDsl.g:4850:1: rule__CompositeConfiguration__ComponentsAssignment_3_0 : ( ruleComponent ) ;
    public final void rule__CompositeConfiguration__ComponentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4854:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:4855:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:4855:2: ( ruleComponent )
            // InternalCosaDsl.g:4856:3: ruleComponent
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__ComponentsAssignment_3_0"


    // $ANTLR start "rule__CompositeConfiguration__ComponentsAssignment_3_1_1"
    // InternalCosaDsl.g:4865:1: rule__CompositeConfiguration__ComponentsAssignment_3_1_1 : ( ruleComponent ) ;
    public final void rule__CompositeConfiguration__ComponentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4869:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:4870:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:4870:2: ( ruleComponent )
            // InternalCosaDsl.g:4871:3: ruleComponent
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__ComponentsAssignment_3_1_1"


    // $ANTLR start "rule__CompositeConfiguration__ConnectorsAssignment_4_0"
    // InternalCosaDsl.g:4880:1: rule__CompositeConfiguration__ConnectorsAssignment_4_0 : ( ruleConnector ) ;
    public final void rule__CompositeConfiguration__ConnectorsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4884:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:4885:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:4885:2: ( ruleConnector )
            // InternalCosaDsl.g:4886:3: ruleConnector
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__ConnectorsAssignment_4_0"


    // $ANTLR start "rule__CompositeConfiguration__ConnectorsAssignment_4_1_1"
    // InternalCosaDsl.g:4895:1: rule__CompositeConfiguration__ConnectorsAssignment_4_1_1 : ( ruleConnector ) ;
    public final void rule__CompositeConfiguration__ConnectorsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4899:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:4900:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:4900:2: ( ruleConnector )
            // InternalCosaDsl.g:4901:3: ruleConnector
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__ConnectorsAssignment_4_1_1"


    // $ANTLR start "rule__CompositeConfiguration__PortsAssignment_5_0"
    // InternalCosaDsl.g:4910:1: rule__CompositeConfiguration__PortsAssignment_5_0 : ( rulePort ) ;
    public final void rule__CompositeConfiguration__PortsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4914:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4915:2: ( rulePort )
            {
            // InternalCosaDsl.g:4915:2: ( rulePort )
            // InternalCosaDsl.g:4916:3: rulePort
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__PortsAssignment_5_0"


    // $ANTLR start "rule__CompositeConfiguration__PortsAssignment_5_1_1"
    // InternalCosaDsl.g:4925:1: rule__CompositeConfiguration__PortsAssignment_5_1_1 : ( rulePort ) ;
    public final void rule__CompositeConfiguration__PortsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4929:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4930:2: ( rulePort )
            {
            // InternalCosaDsl.g:4930:2: ( rulePort )
            // InternalCosaDsl.g:4931:3: rulePort
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__PortsAssignment_5_1_1"


    // $ANTLR start "rule__CompositeConfiguration__BindingsAssignment_6_0"
    // InternalCosaDsl.g:4940:1: rule__CompositeConfiguration__BindingsAssignment_6_0 : ( ruleBinding ) ;
    public final void rule__CompositeConfiguration__BindingsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4944:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:4945:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:4945:2: ( ruleBinding )
            // InternalCosaDsl.g:4946:3: ruleBinding
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__BindingsAssignment_6_0"


    // $ANTLR start "rule__CompositeConfiguration__BindingsAssignment_6_1_1"
    // InternalCosaDsl.g:4955:1: rule__CompositeConfiguration__BindingsAssignment_6_1_1 : ( ruleBinding ) ;
    public final void rule__CompositeConfiguration__BindingsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4959:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:4960:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:4960:2: ( ruleBinding )
            // InternalCosaDsl.g:4961:3: ruleBinding
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__BindingsAssignment_6_1_1"


    // $ANTLR start "rule__CompositeConfiguration__AttachementsAssignment_7_0"
    // InternalCosaDsl.g:4970:1: rule__CompositeConfiguration__AttachementsAssignment_7_0 : ( ruleAttachement ) ;
    public final void rule__CompositeConfiguration__AttachementsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4974:1: ( ( ruleAttachement ) )
            // InternalCosaDsl.g:4975:2: ( ruleAttachement )
            {
            // InternalCosaDsl.g:4975:2: ( ruleAttachement )
            // InternalCosaDsl.g:4976:3: ruleAttachement
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__AttachementsAssignment_7_0"


    // $ANTLR start "rule__CompositeConfiguration__AttachementsAssignment_7_1_1"
    // InternalCosaDsl.g:4985:1: rule__CompositeConfiguration__AttachementsAssignment_7_1_1 : ( ruleAttachement ) ;
    public final void rule__CompositeConfiguration__AttachementsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4989:1: ( ( ruleAttachement ) )
            // InternalCosaDsl.g:4990:2: ( ruleAttachement )
            {
            // InternalCosaDsl.g:4990:2: ( ruleAttachement )
            // InternalCosaDsl.g:4991:3: ruleAttachement
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__AttachementsAssignment_7_1_1"


    // $ANTLR start "rule__CompositeConfiguration__ConfigurationsAssignment_8_0"
    // InternalCosaDsl.g:5000:1: rule__CompositeConfiguration__ConfigurationsAssignment_8_0 : ( ruleConfiguration ) ;
    public final void rule__CompositeConfiguration__ConfigurationsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5004:1: ( ( ruleConfiguration ) )
            // InternalCosaDsl.g:5005:2: ( ruleConfiguration )
            {
            // InternalCosaDsl.g:5005:2: ( ruleConfiguration )
            // InternalCosaDsl.g:5006:3: ruleConfiguration
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__ConfigurationsAssignment_8_0"


    // $ANTLR start "rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1"
    // InternalCosaDsl.g:5015:1: rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1 : ( ruleConfiguration ) ;
    public final void rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5019:1: ( ( ruleConfiguration ) )
            // InternalCosaDsl.g:5020:2: ( ruleConfiguration )
            {
            // InternalCosaDsl.g:5020:2: ( ruleConfiguration )
            // InternalCosaDsl.g:5021:3: ruleConfiguration
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConfiguration__ConfigurationsAssignment_8_1_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalCosaDsl.g:5030:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5034:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5035:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5035:2: ( ruleEString )
            // InternalCosaDsl.g:5036:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__PortsAssignment_3"
    // InternalCosaDsl.g:5045:1: rule__Component__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5049:1: ( ( rulePort ) )
            // InternalCosaDsl.g:5050:2: ( rulePort )
            {
            // InternalCosaDsl.g:5050:2: ( rulePort )
            // InternalCosaDsl.g:5051:3: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PortsAssignment_3"


    // $ANTLR start "rule__Component__PortsAssignment_4_1"
    // InternalCosaDsl.g:5060:1: rule__Component__PortsAssignment_4_1 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5064:1: ( ( rulePort ) )
            // InternalCosaDsl.g:5065:2: ( rulePort )
            {
            // InternalCosaDsl.g:5065:2: ( rulePort )
            // InternalCosaDsl.g:5066:3: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PortsAssignment_4_1"


    // $ANTLR start "rule__Component__ServicesAssignment_5"
    // InternalCosaDsl.g:5075:1: rule__Component__ServicesAssignment_5 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5079:1: ( ( ruleService ) )
            // InternalCosaDsl.g:5080:2: ( ruleService )
            {
            // InternalCosaDsl.g:5080:2: ( ruleService )
            // InternalCosaDsl.g:5081:3: ruleService
            {
             before(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ServicesAssignment_5"


    // $ANTLR start "rule__Component__ServicesAssignment_6_1"
    // InternalCosaDsl.g:5090:1: rule__Component__ServicesAssignment_6_1 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5094:1: ( ( ruleService ) )
            // InternalCosaDsl.g:5095:2: ( ruleService )
            {
            // InternalCosaDsl.g:5095:2: ( ruleService )
            // InternalCosaDsl.g:5096:3: ruleService
            {
             before(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ServicesAssignment_6_1"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // InternalCosaDsl.g:5105:1: rule__Connector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5109:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5110:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5110:2: ( ruleEString )
            // InternalCosaDsl.g:5111:3: ruleEString
            {
             before(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Connector__RolesAssignment_3"
    // InternalCosaDsl.g:5120:1: rule__Connector__RolesAssignment_3 : ( ruleRole ) ;
    public final void rule__Connector__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5124:1: ( ( ruleRole ) )
            // InternalCosaDsl.g:5125:2: ( ruleRole )
            {
            // InternalCosaDsl.g:5125:2: ( ruleRole )
            // InternalCosaDsl.g:5126:3: ruleRole
            {
             before(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__RolesAssignment_3"


    // $ANTLR start "rule__Connector__RolesAssignment_4_1"
    // InternalCosaDsl.g:5135:1: rule__Connector__RolesAssignment_4_1 : ( ruleRole ) ;
    public final void rule__Connector__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5139:1: ( ( ruleRole ) )
            // InternalCosaDsl.g:5140:2: ( ruleRole )
            {
            // InternalCosaDsl.g:5140:2: ( ruleRole )
            // InternalCosaDsl.g:5141:3: ruleRole
            {
             before(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__RolesAssignment_4_1"


    // $ANTLR start "rule__Connector__GlueAssignment_5_1"
    // InternalCosaDsl.g:5150:1: rule__Connector__GlueAssignment_5_1 : ( ruleGlue ) ;
    public final void rule__Connector__GlueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5154:1: ( ( ruleGlue ) )
            // InternalCosaDsl.g:5155:2: ( ruleGlue )
            {
            // InternalCosaDsl.g:5155:2: ( ruleGlue )
            // InternalCosaDsl.g:5156:3: ruleGlue
            {
             before(grammarAccess.getConnectorAccess().getGlueGlueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGlue();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getGlueGlueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__GlueAssignment_5_1"


    // $ANTLR start "rule__Port_Impl__NameAssignment_2"
    // InternalCosaDsl.g:5165:1: rule__Port_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Port_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5169:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5170:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5170:2: ( ruleEString )
            // InternalCosaDsl.g:5171:3: ruleEString
            {
             before(grammarAccess.getPort_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPort_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_Impl__NameAssignment_2"


    // $ANTLR start "rule__Binding__ConfigurationProviderAssignment_2"
    // InternalCosaDsl.g:5180:1: rule__Binding__ConfigurationProviderAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ConfigurationProviderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5184:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5185:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5185:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5186:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getConfigurationProviderConfigurationCrossReference_2_0()); 
            // InternalCosaDsl.g:5187:3: ( RULE_ID )
            // InternalCosaDsl.g:5188:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getConfigurationProviderConfigurationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getConfigurationProviderConfigurationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getConfigurationProviderConfigurationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ConfigurationProviderAssignment_2"


    // $ANTLR start "rule__Binding__PortProvidedAssignment_4"
    // InternalCosaDsl.g:5199:1: rule__Binding__PortProvidedAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__PortProvidedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5203:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5204:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5204:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5205:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getPortProvidedPortCrossReference_4_0()); 
            // InternalCosaDsl.g:5206:3: ( RULE_ID )
            // InternalCosaDsl.g:5207:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getPortProvidedPortIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getPortProvidedPortIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getPortProvidedPortCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__PortProvidedAssignment_4"


    // $ANTLR start "rule__Binding__ComponentSubscriberAssignment_6"
    // InternalCosaDsl.g:5218:1: rule__Binding__ComponentSubscriberAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ComponentSubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5222:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5223:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5223:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5224:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getComponentSubscriberComponentCrossReference_6_0()); 
            // InternalCosaDsl.g:5225:3: ( RULE_ID )
            // InternalCosaDsl.g:5226:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getComponentSubscriberComponentIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getComponentSubscriberComponentIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getComponentSubscriberComponentCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ComponentSubscriberAssignment_6"


    // $ANTLR start "rule__Binding__PortRequiredAssignment_8"
    // InternalCosaDsl.g:5237:1: rule__Binding__PortRequiredAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__PortRequiredAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5241:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5242:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5242:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5243:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getPortRequiredPortCrossReference_8_0()); 
            // InternalCosaDsl.g:5244:3: ( RULE_ID )
            // InternalCosaDsl.g:5245:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getPortRequiredPortIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getPortRequiredPortIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getPortRequiredPortCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__PortRequiredAssignment_8"


    // $ANTLR start "rule__Attachement__ComponentAssignment_2"
    // InternalCosaDsl.g:5256:1: rule__Attachement__ComponentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attachement__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5260:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5261:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5261:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5262:3: ( RULE_ID )
            {
             before(grammarAccess.getAttachementAccess().getComponentComponentCrossReference_2_0()); 
            // InternalCosaDsl.g:5263:3: ( RULE_ID )
            // InternalCosaDsl.g:5264:4: RULE_ID
            {
             before(grammarAccess.getAttachementAccess().getComponentComponentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getComponentComponentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttachementAccess().getComponentComponentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__ComponentAssignment_2"


    // $ANTLR start "rule__Attachement__PortAssignment_4"
    // InternalCosaDsl.g:5275:1: rule__Attachement__PortAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attachement__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5279:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5280:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5280:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5281:3: ( RULE_ID )
            {
             before(grammarAccess.getAttachementAccess().getPortPortCrossReference_4_0()); 
            // InternalCosaDsl.g:5282:3: ( RULE_ID )
            // InternalCosaDsl.g:5283:4: RULE_ID
            {
             before(grammarAccess.getAttachementAccess().getPortPortIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getPortPortIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttachementAccess().getPortPortCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__PortAssignment_4"


    // $ANTLR start "rule__Attachement__ConnectorAssignment_6"
    // InternalCosaDsl.g:5294:1: rule__Attachement__ConnectorAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Attachement__ConnectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5298:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5299:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5299:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5300:3: ( RULE_ID )
            {
             before(grammarAccess.getAttachementAccess().getConnectorConnectorCrossReference_6_0()); 
            // InternalCosaDsl.g:5301:3: ( RULE_ID )
            // InternalCosaDsl.g:5302:4: RULE_ID
            {
             before(grammarAccess.getAttachementAccess().getConnectorConnectorIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getConnectorConnectorIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAttachementAccess().getConnectorConnectorCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__ConnectorAssignment_6"


    // $ANTLR start "rule__Attachement__RoleAssignment_8"
    // InternalCosaDsl.g:5313:1: rule__Attachement__RoleAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Attachement__RoleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5317:1: ( ( ( RULE_ID ) ) )
            // InternalCosaDsl.g:5318:2: ( ( RULE_ID ) )
            {
            // InternalCosaDsl.g:5318:2: ( ( RULE_ID ) )
            // InternalCosaDsl.g:5319:3: ( RULE_ID )
            {
             before(grammarAccess.getAttachementAccess().getRoleRoleCrossReference_8_0()); 
            // InternalCosaDsl.g:5320:3: ( RULE_ID )
            // InternalCosaDsl.g:5321:4: RULE_ID
            {
             before(grammarAccess.getAttachementAccess().getRoleRoleIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getRoleRoleIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getAttachementAccess().getRoleRoleCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attachement__RoleAssignment_8"


    // $ANTLR start "rule__Configuration_Impl__NameAssignment_1"
    // InternalCosaDsl.g:5332:1: rule__Configuration_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Configuration_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5336:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5337:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5337:2: ( ruleEString )
            // InternalCosaDsl.g:5338:3: ruleEString
            {
             before(grammarAccess.getConfiguration_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__NameAssignment_1"


    // $ANTLR start "rule__Configuration_Impl__ComponentsAssignment_3"
    // InternalCosaDsl.g:5347:1: rule__Configuration_Impl__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Configuration_Impl__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5351:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:5352:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:5352:2: ( ruleComponent )
            // InternalCosaDsl.g:5353:3: ruleComponent
            {
             before(grammarAccess.getConfiguration_ImplAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getComponentsComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__ComponentsAssignment_3"


    // $ANTLR start "rule__Configuration_Impl__ComponentsAssignment_4_1"
    // InternalCosaDsl.g:5362:1: rule__Configuration_Impl__ComponentsAssignment_4_1 : ( ruleComponent ) ;
    public final void rule__Configuration_Impl__ComponentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5366:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:5367:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:5367:2: ( ruleComponent )
            // InternalCosaDsl.g:5368:3: ruleComponent
            {
             before(grammarAccess.getConfiguration_ImplAccess().getComponentsComponentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getComponentsComponentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__ComponentsAssignment_4_1"


    // $ANTLR start "rule__Configuration_Impl__ConnectorsAssignment_5_0"
    // InternalCosaDsl.g:5377:1: rule__Configuration_Impl__ConnectorsAssignment_5_0 : ( ruleConnector ) ;
    public final void rule__Configuration_Impl__ConnectorsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5381:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:5382:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:5382:2: ( ruleConnector )
            // InternalCosaDsl.g:5383:3: ruleConnector
            {
             before(grammarAccess.getConfiguration_ImplAccess().getConnectorsConnectorParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getConnectorsConnectorParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__ConnectorsAssignment_5_0"


    // $ANTLR start "rule__Configuration_Impl__ConnectorsAssignment_5_1_1"
    // InternalCosaDsl.g:5392:1: rule__Configuration_Impl__ConnectorsAssignment_5_1_1 : ( ruleConnector ) ;
    public final void rule__Configuration_Impl__ConnectorsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5396:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:5397:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:5397:2: ( ruleConnector )
            // InternalCosaDsl.g:5398:3: ruleConnector
            {
             before(grammarAccess.getConfiguration_ImplAccess().getConnectorsConnectorParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getConnectorsConnectorParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__ConnectorsAssignment_5_1_1"


    // $ANTLR start "rule__Configuration_Impl__PortsAssignment_6_0"
    // InternalCosaDsl.g:5407:1: rule__Configuration_Impl__PortsAssignment_6_0 : ( rulePort ) ;
    public final void rule__Configuration_Impl__PortsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5411:1: ( ( rulePort ) )
            // InternalCosaDsl.g:5412:2: ( rulePort )
            {
            // InternalCosaDsl.g:5412:2: ( rulePort )
            // InternalCosaDsl.g:5413:3: rulePort
            {
             before(grammarAccess.getConfiguration_ImplAccess().getPortsPortParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getPortsPortParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__PortsAssignment_6_0"


    // $ANTLR start "rule__Configuration_Impl__PortsAssignment_6_1_1"
    // InternalCosaDsl.g:5422:1: rule__Configuration_Impl__PortsAssignment_6_1_1 : ( rulePort ) ;
    public final void rule__Configuration_Impl__PortsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5426:1: ( ( rulePort ) )
            // InternalCosaDsl.g:5427:2: ( rulePort )
            {
            // InternalCosaDsl.g:5427:2: ( rulePort )
            // InternalCosaDsl.g:5428:3: rulePort
            {
             before(grammarAccess.getConfiguration_ImplAccess().getPortsPortParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getPortsPortParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__PortsAssignment_6_1_1"


    // $ANTLR start "rule__Configuration_Impl__BindingsAssignment_7_0"
    // InternalCosaDsl.g:5437:1: rule__Configuration_Impl__BindingsAssignment_7_0 : ( ruleBinding ) ;
    public final void rule__Configuration_Impl__BindingsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5441:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:5442:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:5442:2: ( ruleBinding )
            // InternalCosaDsl.g:5443:3: ruleBinding
            {
             before(grammarAccess.getConfiguration_ImplAccess().getBindingsBindingParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getBindingsBindingParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__BindingsAssignment_7_0"


    // $ANTLR start "rule__Configuration_Impl__BindingsAssignment_7_1_1"
    // InternalCosaDsl.g:5452:1: rule__Configuration_Impl__BindingsAssignment_7_1_1 : ( ruleBinding ) ;
    public final void rule__Configuration_Impl__BindingsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5456:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:5457:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:5457:2: ( ruleBinding )
            // InternalCosaDsl.g:5458:3: ruleBinding
            {
             before(grammarAccess.getConfiguration_ImplAccess().getBindingsBindingParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getConfiguration_ImplAccess().getBindingsBindingParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Impl__BindingsAssignment_7_1_1"


    // $ANTLR start "rule__Service_Impl__NameAssignment_2"
    // InternalCosaDsl.g:5467:1: rule__Service_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5471:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5472:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5472:2: ( ruleEString )
            // InternalCosaDsl.g:5473:3: ruleEString
            {
             before(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getService_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service_Impl__NameAssignment_2"


    // $ANTLR start "rule__RequiredService__NameAssignment_2"
    // InternalCosaDsl.g:5482:1: rule__RequiredService__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequiredService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5486:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5487:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5487:2: ( ruleEString )
            // InternalCosaDsl.g:5488:3: ruleEString
            {
             before(grammarAccess.getRequiredServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredServiceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__NameAssignment_2"


    // $ANTLR start "rule__ProvidedService__NameAssignment_2"
    // InternalCosaDsl.g:5497:1: rule__ProvidedService__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProvidedService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5501:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5502:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5502:2: ( ruleEString )
            // InternalCosaDsl.g:5503:3: ruleEString
            {
             before(grammarAccess.getProvidedServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedServiceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__NameAssignment_2"


    // $ANTLR start "rule__Role_Impl__NameAssignment_2"
    // InternalCosaDsl.g:5512:1: rule__Role_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5516:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5517:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5517:2: ( ruleEString )
            // InternalCosaDsl.g:5518:3: ruleEString
            {
             before(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role_Impl__NameAssignment_2"


    // $ANTLR start "rule__RequiredRole__NameAssignment_2"
    // InternalCosaDsl.g:5527:1: rule__RequiredRole__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5531:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5532:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5532:2: ( ruleEString )
            // InternalCosaDsl.g:5533:3: ruleEString
            {
             before(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredRole__NameAssignment_2"


    // $ANTLR start "rule__ProvidedRole__NameAssignment_2"
    // InternalCosaDsl.g:5542:1: rule__ProvidedRole__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5546:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5547:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5547:2: ( ruleEString )
            // InternalCosaDsl.g:5548:3: ruleEString
            {
             before(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedRole__NameAssignment_2"


    // $ANTLR start "rule__RequiredPort__NameAssignment_2"
    // InternalCosaDsl.g:5557:1: rule__RequiredPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequiredPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5561:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5562:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5562:2: ( ruleEString )
            // InternalCosaDsl.g:5563:3: ruleEString
            {
             before(grammarAccess.getRequiredPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequiredPortAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__NameAssignment_2"


    // $ANTLR start "rule__ProvidedPort__NameAssignment_2"
    // InternalCosaDsl.g:5572:1: rule__ProvidedPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProvidedPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5576:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5577:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5577:2: ( ruleEString )
            // InternalCosaDsl.g:5578:3: ruleEString
            {
             before(grammarAccess.getProvidedPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProvidedPortAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__NameAssignment_2"


    // $ANTLR start "rule__SimpleConfiguration__NameAssignment_1"
    // InternalCosaDsl.g:5587:1: rule__SimpleConfiguration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5591:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:5592:2: ( ruleEString )
            {
            // InternalCosaDsl.g:5592:2: ( ruleEString )
            // InternalCosaDsl.g:5593:3: ruleEString
            {
             before(grammarAccess.getSimpleConfigurationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__NameAssignment_1"


    // $ANTLR start "rule__SimpleConfiguration__ComponentsAssignment_3"
    // InternalCosaDsl.g:5602:1: rule__SimpleConfiguration__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__SimpleConfiguration__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5606:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:5607:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:5607:2: ( ruleComponent )
            // InternalCosaDsl.g:5608:3: ruleComponent
            {
             before(grammarAccess.getSimpleConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__ComponentsAssignment_3"


    // $ANTLR start "rule__SimpleConfiguration__ComponentsAssignment_4_1"
    // InternalCosaDsl.g:5617:1: rule__SimpleConfiguration__ComponentsAssignment_4_1 : ( ruleComponent ) ;
    public final void rule__SimpleConfiguration__ComponentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5621:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:5622:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:5622:2: ( ruleComponent )
            // InternalCosaDsl.g:5623:3: ruleComponent
            {
             before(grammarAccess.getSimpleConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__ComponentsAssignment_4_1"


    // $ANTLR start "rule__SimpleConfiguration__ConnectorsAssignment_5_0"
    // InternalCosaDsl.g:5632:1: rule__SimpleConfiguration__ConnectorsAssignment_5_0 : ( ruleConnector ) ;
    public final void rule__SimpleConfiguration__ConnectorsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5636:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:5637:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:5637:2: ( ruleConnector )
            // InternalCosaDsl.g:5638:3: ruleConnector
            {
             before(grammarAccess.getSimpleConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__ConnectorsAssignment_5_0"


    // $ANTLR start "rule__SimpleConfiguration__ConnectorsAssignment_5_1_1"
    // InternalCosaDsl.g:5647:1: rule__SimpleConfiguration__ConnectorsAssignment_5_1_1 : ( ruleConnector ) ;
    public final void rule__SimpleConfiguration__ConnectorsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5651:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:5652:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:5652:2: ( ruleConnector )
            // InternalCosaDsl.g:5653:3: ruleConnector
            {
             before(grammarAccess.getSimpleConfigurationAccess().getConnectorsConnectorParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getConnectorsConnectorParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__ConnectorsAssignment_5_1_1"


    // $ANTLR start "rule__SimpleConfiguration__PortsAssignment_6_0"
    // InternalCosaDsl.g:5662:1: rule__SimpleConfiguration__PortsAssignment_6_0 : ( rulePort ) ;
    public final void rule__SimpleConfiguration__PortsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5666:1: ( ( rulePort ) )
            // InternalCosaDsl.g:5667:2: ( rulePort )
            {
            // InternalCosaDsl.g:5667:2: ( rulePort )
            // InternalCosaDsl.g:5668:3: rulePort
            {
             before(grammarAccess.getSimpleConfigurationAccess().getPortsPortParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getPortsPortParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__PortsAssignment_6_0"


    // $ANTLR start "rule__SimpleConfiguration__PortsAssignment_6_1_1"
    // InternalCosaDsl.g:5677:1: rule__SimpleConfiguration__PortsAssignment_6_1_1 : ( rulePort ) ;
    public final void rule__SimpleConfiguration__PortsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5681:1: ( ( rulePort ) )
            // InternalCosaDsl.g:5682:2: ( rulePort )
            {
            // InternalCosaDsl.g:5682:2: ( rulePort )
            // InternalCosaDsl.g:5683:3: rulePort
            {
             before(grammarAccess.getSimpleConfigurationAccess().getPortsPortParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getPortsPortParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__PortsAssignment_6_1_1"


    // $ANTLR start "rule__SimpleConfiguration__BindingsAssignment_7_0"
    // InternalCosaDsl.g:5692:1: rule__SimpleConfiguration__BindingsAssignment_7_0 : ( ruleBinding ) ;
    public final void rule__SimpleConfiguration__BindingsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5696:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:5697:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:5697:2: ( ruleBinding )
            // InternalCosaDsl.g:5698:3: ruleBinding
            {
             before(grammarAccess.getSimpleConfigurationAccess().getBindingsBindingParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getBindingsBindingParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__BindingsAssignment_7_0"


    // $ANTLR start "rule__SimpleConfiguration__BindingsAssignment_7_1_1"
    // InternalCosaDsl.g:5707:1: rule__SimpleConfiguration__BindingsAssignment_7_1_1 : ( ruleBinding ) ;
    public final void rule__SimpleConfiguration__BindingsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:5711:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:5712:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:5712:2: ( ruleBinding )
            // InternalCosaDsl.g:5713:3: ruleBinding
            {
             before(grammarAccess.getSimpleConfigurationAccess().getBindingsBindingParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getSimpleConfigurationAccess().getBindingsBindingParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleConfiguration__BindingsAssignment_7_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000E028D2800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000600040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000802000802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000802000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001C004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000006000C2000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000006000D6000L});

}