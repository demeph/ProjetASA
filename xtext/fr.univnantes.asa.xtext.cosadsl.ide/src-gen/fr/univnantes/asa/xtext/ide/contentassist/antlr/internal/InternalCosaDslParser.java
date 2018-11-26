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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CompositeConfiguration'", "'={'", "'}'", "','", "'Configuration'", "'Component'", "'Connector'", "'Roles{'", "'Port'", "'Binding'", "'{'", "'Attachement'", "':{'", "'to'", "'Service'", "'RequiredService'", "'ProvidedService'", "'Role'", "'RequiredRole'", "'ProvidedRole'", "'RequiredPort'", "'ProvidedPort'"
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



    // $ANTLR start "entryRuleCompositeConfiguration"
    // InternalCosaDsl.g:53:1: entryRuleCompositeConfiguration : ruleCompositeConfiguration EOF ;
    public final void entryRuleCompositeConfiguration() throws RecognitionException {
        try {
            // InternalCosaDsl.g:54:1: ( ruleCompositeConfiguration EOF )
            // InternalCosaDsl.g:55:1: ruleCompositeConfiguration EOF
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
    // InternalCosaDsl.g:62:1: ruleCompositeConfiguration : ( ( rule__CompositeConfiguration__Group__0 ) ) ;
    public final void ruleCompositeConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:66:2: ( ( ( rule__CompositeConfiguration__Group__0 ) ) )
            // InternalCosaDsl.g:67:2: ( ( rule__CompositeConfiguration__Group__0 ) )
            {
            // InternalCosaDsl.g:67:2: ( ( rule__CompositeConfiguration__Group__0 ) )
            // InternalCosaDsl.g:68:3: ( rule__CompositeConfiguration__Group__0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup()); 
            // InternalCosaDsl.g:69:3: ( rule__CompositeConfiguration__Group__0 )
            // InternalCosaDsl.g:69:4: rule__CompositeConfiguration__Group__0
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


    // $ANTLR start "entryRuleConfiguration"
    // InternalCosaDsl.g:78:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalCosaDsl.g:79:1: ( ruleConfiguration EOF )
            // InternalCosaDsl.g:80:1: ruleConfiguration EOF
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
    // InternalCosaDsl.g:87:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:91:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalCosaDsl.g:92:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalCosaDsl.g:92:2: ( ( rule__Configuration__Group__0 ) )
            // InternalCosaDsl.g:93:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalCosaDsl.g:94:3: ( rule__Configuration__Group__0 )
            // InternalCosaDsl.g:94:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

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


    // $ANTLR start "entryRuleComponent"
    // InternalCosaDsl.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalCosaDsl.g:104:1: ( ruleComponent EOF )
            // InternalCosaDsl.g:105:1: ruleComponent EOF
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
    // InternalCosaDsl.g:112:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:116:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalCosaDsl.g:117:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalCosaDsl.g:117:2: ( ( rule__Component__Group__0 ) )
            // InternalCosaDsl.g:118:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalCosaDsl.g:119:3: ( rule__Component__Group__0 )
            // InternalCosaDsl.g:119:4: rule__Component__Group__0
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
    // InternalCosaDsl.g:128:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCosaDsl.g:129:1: ( ruleConnector EOF )
            // InternalCosaDsl.g:130:1: ruleConnector EOF
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
    // InternalCosaDsl.g:137:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:141:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalCosaDsl.g:142:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalCosaDsl.g:142:2: ( ( rule__Connector__Group__0 ) )
            // InternalCosaDsl.g:143:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalCosaDsl.g:144:3: ( rule__Connector__Group__0 )
            // InternalCosaDsl.g:144:4: rule__Connector__Group__0
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


    // $ANTLR start "entryRulePort"
    // InternalCosaDsl.g:153:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalCosaDsl.g:154:1: ( rulePort EOF )
            // InternalCosaDsl.g:155:1: rulePort EOF
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
    // InternalCosaDsl.g:162:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:166:2: ( ( ( rule__Port__Alternatives ) ) )
            // InternalCosaDsl.g:167:2: ( ( rule__Port__Alternatives ) )
            {
            // InternalCosaDsl.g:167:2: ( ( rule__Port__Alternatives ) )
            // InternalCosaDsl.g:168:3: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // InternalCosaDsl.g:169:3: ( rule__Port__Alternatives )
            // InternalCosaDsl.g:169:4: rule__Port__Alternatives
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
    // InternalCosaDsl.g:178:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalCosaDsl.g:179:1: ( ruleService EOF )
            // InternalCosaDsl.g:180:1: ruleService EOF
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
    // InternalCosaDsl.g:187:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:191:2: ( ( ( rule__Service__Alternatives ) ) )
            // InternalCosaDsl.g:192:2: ( ( rule__Service__Alternatives ) )
            {
            // InternalCosaDsl.g:192:2: ( ( rule__Service__Alternatives ) )
            // InternalCosaDsl.g:193:3: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // InternalCosaDsl.g:194:3: ( rule__Service__Alternatives )
            // InternalCosaDsl.g:194:4: rule__Service__Alternatives
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
    // InternalCosaDsl.g:203:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalCosaDsl.g:204:1: ( ruleRole EOF )
            // InternalCosaDsl.g:205:1: ruleRole EOF
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
    // InternalCosaDsl.g:212:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:216:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalCosaDsl.g:217:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalCosaDsl.g:217:2: ( ( rule__Role__Alternatives ) )
            // InternalCosaDsl.g:218:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalCosaDsl.g:219:3: ( rule__Role__Alternatives )
            // InternalCosaDsl.g:219:4: rule__Role__Alternatives
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


    // $ANTLR start "entryRuleEString"
    // InternalCosaDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCosaDsl.g:229:1: ( ruleEString EOF )
            // InternalCosaDsl.g:230:1: ruleEString EOF
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
    // InternalCosaDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCosaDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCosaDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalCosaDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCosaDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalCosaDsl.g:244:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleService_Impl"
    // InternalCosaDsl.g:328:1: entryRuleService_Impl : ruleService_Impl EOF ;
    public final void entryRuleService_Impl() throws RecognitionException {
        try {
            // InternalCosaDsl.g:329:1: ( ruleService_Impl EOF )
            // InternalCosaDsl.g:330:1: ruleService_Impl EOF
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
    // InternalCosaDsl.g:337:1: ruleService_Impl : ( ( rule__Service_Impl__Group__0 ) ) ;
    public final void ruleService_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:341:2: ( ( ( rule__Service_Impl__Group__0 ) ) )
            // InternalCosaDsl.g:342:2: ( ( rule__Service_Impl__Group__0 ) )
            {
            // InternalCosaDsl.g:342:2: ( ( rule__Service_Impl__Group__0 ) )
            // InternalCosaDsl.g:343:3: ( rule__Service_Impl__Group__0 )
            {
             before(grammarAccess.getService_ImplAccess().getGroup()); 
            // InternalCosaDsl.g:344:3: ( rule__Service_Impl__Group__0 )
            // InternalCosaDsl.g:344:4: rule__Service_Impl__Group__0
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
    // InternalCosaDsl.g:353:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalCosaDsl.g:354:1: ( ruleRequiredService EOF )
            // InternalCosaDsl.g:355:1: ruleRequiredService EOF
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
    // InternalCosaDsl.g:362:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:366:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalCosaDsl.g:367:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalCosaDsl.g:367:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalCosaDsl.g:368:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalCosaDsl.g:369:3: ( rule__RequiredService__Group__0 )
            // InternalCosaDsl.g:369:4: rule__RequiredService__Group__0
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
    // InternalCosaDsl.g:378:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalCosaDsl.g:379:1: ( ruleProvidedService EOF )
            // InternalCosaDsl.g:380:1: ruleProvidedService EOF
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
    // InternalCosaDsl.g:387:1: ruleProvidedService : ( ( rule__ProvidedService__Group__0 ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:391:2: ( ( ( rule__ProvidedService__Group__0 ) ) )
            // InternalCosaDsl.g:392:2: ( ( rule__ProvidedService__Group__0 ) )
            {
            // InternalCosaDsl.g:392:2: ( ( rule__ProvidedService__Group__0 ) )
            // InternalCosaDsl.g:393:3: ( rule__ProvidedService__Group__0 )
            {
             before(grammarAccess.getProvidedServiceAccess().getGroup()); 
            // InternalCosaDsl.g:394:3: ( rule__ProvidedService__Group__0 )
            // InternalCosaDsl.g:394:4: rule__ProvidedService__Group__0
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
    // InternalCosaDsl.g:403:1: entryRuleRole_Impl : ruleRole_Impl EOF ;
    public final void entryRuleRole_Impl() throws RecognitionException {
        try {
            // InternalCosaDsl.g:404:1: ( ruleRole_Impl EOF )
            // InternalCosaDsl.g:405:1: ruleRole_Impl EOF
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
    // InternalCosaDsl.g:412:1: ruleRole_Impl : ( ( rule__Role_Impl__Group__0 ) ) ;
    public final void ruleRole_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:416:2: ( ( ( rule__Role_Impl__Group__0 ) ) )
            // InternalCosaDsl.g:417:2: ( ( rule__Role_Impl__Group__0 ) )
            {
            // InternalCosaDsl.g:417:2: ( ( rule__Role_Impl__Group__0 ) )
            // InternalCosaDsl.g:418:3: ( rule__Role_Impl__Group__0 )
            {
             before(grammarAccess.getRole_ImplAccess().getGroup()); 
            // InternalCosaDsl.g:419:3: ( rule__Role_Impl__Group__0 )
            // InternalCosaDsl.g:419:4: rule__Role_Impl__Group__0
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
    // InternalCosaDsl.g:428:1: entryRuleRequiredRole : ruleRequiredRole EOF ;
    public final void entryRuleRequiredRole() throws RecognitionException {
        try {
            // InternalCosaDsl.g:429:1: ( ruleRequiredRole EOF )
            // InternalCosaDsl.g:430:1: ruleRequiredRole EOF
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
    // InternalCosaDsl.g:437:1: ruleRequiredRole : ( ( rule__RequiredRole__Group__0 ) ) ;
    public final void ruleRequiredRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:441:2: ( ( ( rule__RequiredRole__Group__0 ) ) )
            // InternalCosaDsl.g:442:2: ( ( rule__RequiredRole__Group__0 ) )
            {
            // InternalCosaDsl.g:442:2: ( ( rule__RequiredRole__Group__0 ) )
            // InternalCosaDsl.g:443:3: ( rule__RequiredRole__Group__0 )
            {
             before(grammarAccess.getRequiredRoleAccess().getGroup()); 
            // InternalCosaDsl.g:444:3: ( rule__RequiredRole__Group__0 )
            // InternalCosaDsl.g:444:4: rule__RequiredRole__Group__0
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
    // InternalCosaDsl.g:453:1: entryRuleProvidedRole : ruleProvidedRole EOF ;
    public final void entryRuleProvidedRole() throws RecognitionException {
        try {
            // InternalCosaDsl.g:454:1: ( ruleProvidedRole EOF )
            // InternalCosaDsl.g:455:1: ruleProvidedRole EOF
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
    // InternalCosaDsl.g:462:1: ruleProvidedRole : ( ( rule__ProvidedRole__Group__0 ) ) ;
    public final void ruleProvidedRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:466:2: ( ( ( rule__ProvidedRole__Group__0 ) ) )
            // InternalCosaDsl.g:467:2: ( ( rule__ProvidedRole__Group__0 ) )
            {
            // InternalCosaDsl.g:467:2: ( ( rule__ProvidedRole__Group__0 ) )
            // InternalCosaDsl.g:468:3: ( rule__ProvidedRole__Group__0 )
            {
             before(grammarAccess.getProvidedRoleAccess().getGroup()); 
            // InternalCosaDsl.g:469:3: ( rule__ProvidedRole__Group__0 )
            // InternalCosaDsl.g:469:4: rule__ProvidedRole__Group__0
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


    // $ANTLR start "entryRuleRequiredPort"
    // InternalCosaDsl.g:478:1: entryRuleRequiredPort : ruleRequiredPort EOF ;
    public final void entryRuleRequiredPort() throws RecognitionException {
        try {
            // InternalCosaDsl.g:479:1: ( ruleRequiredPort EOF )
            // InternalCosaDsl.g:480:1: ruleRequiredPort EOF
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
    // InternalCosaDsl.g:487:1: ruleRequiredPort : ( ( rule__RequiredPort__Group__0 ) ) ;
    public final void ruleRequiredPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:491:2: ( ( ( rule__RequiredPort__Group__0 ) ) )
            // InternalCosaDsl.g:492:2: ( ( rule__RequiredPort__Group__0 ) )
            {
            // InternalCosaDsl.g:492:2: ( ( rule__RequiredPort__Group__0 ) )
            // InternalCosaDsl.g:493:3: ( rule__RequiredPort__Group__0 )
            {
             before(grammarAccess.getRequiredPortAccess().getGroup()); 
            // InternalCosaDsl.g:494:3: ( rule__RequiredPort__Group__0 )
            // InternalCosaDsl.g:494:4: rule__RequiredPort__Group__0
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
    // InternalCosaDsl.g:503:1: entryRuleProvidedPort : ruleProvidedPort EOF ;
    public final void entryRuleProvidedPort() throws RecognitionException {
        try {
            // InternalCosaDsl.g:504:1: ( ruleProvidedPort EOF )
            // InternalCosaDsl.g:505:1: ruleProvidedPort EOF
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
    // InternalCosaDsl.g:512:1: ruleProvidedPort : ( ( rule__ProvidedPort__Group__0 ) ) ;
    public final void ruleProvidedPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:516:2: ( ( ( rule__ProvidedPort__Group__0 ) ) )
            // InternalCosaDsl.g:517:2: ( ( rule__ProvidedPort__Group__0 ) )
            {
            // InternalCosaDsl.g:517:2: ( ( rule__ProvidedPort__Group__0 ) )
            // InternalCosaDsl.g:518:3: ( rule__ProvidedPort__Group__0 )
            {
             before(grammarAccess.getProvidedPortAccess().getGroup()); 
            // InternalCosaDsl.g:519:3: ( rule__ProvidedPort__Group__0 )
            // InternalCosaDsl.g:519:4: rule__ProvidedPort__Group__0
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


    // $ANTLR start "rule__Port__Alternatives"
    // InternalCosaDsl.g:527:1: rule__Port__Alternatives : ( ( rulePort_Impl ) | ( ruleRequiredPort ) | ( ruleProvidedPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:531:1: ( ( rulePort_Impl ) | ( ruleRequiredPort ) | ( ruleProvidedPort ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
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
                    // InternalCosaDsl.g:532:2: ( rulePort_Impl )
                    {
                    // InternalCosaDsl.g:532:2: ( rulePort_Impl )
                    // InternalCosaDsl.g:533:3: rulePort_Impl
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
                    // InternalCosaDsl.g:538:2: ( ruleRequiredPort )
                    {
                    // InternalCosaDsl.g:538:2: ( ruleRequiredPort )
                    // InternalCosaDsl.g:539:3: ruleRequiredPort
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
                    // InternalCosaDsl.g:544:2: ( ruleProvidedPort )
                    {
                    // InternalCosaDsl.g:544:2: ( ruleProvidedPort )
                    // InternalCosaDsl.g:545:3: ruleProvidedPort
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
    // InternalCosaDsl.g:554:1: rule__Service__Alternatives : ( ( ruleService_Impl ) | ( ruleRequiredService ) | ( ruleProvidedService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:558:1: ( ( ruleService_Impl ) | ( ruleRequiredService ) | ( ruleProvidedService ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
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
                    // InternalCosaDsl.g:559:2: ( ruleService_Impl )
                    {
                    // InternalCosaDsl.g:559:2: ( ruleService_Impl )
                    // InternalCosaDsl.g:560:3: ruleService_Impl
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
                    // InternalCosaDsl.g:565:2: ( ruleRequiredService )
                    {
                    // InternalCosaDsl.g:565:2: ( ruleRequiredService )
                    // InternalCosaDsl.g:566:3: ruleRequiredService
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
                    // InternalCosaDsl.g:571:2: ( ruleProvidedService )
                    {
                    // InternalCosaDsl.g:571:2: ( ruleProvidedService )
                    // InternalCosaDsl.g:572:3: ruleProvidedService
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
    // InternalCosaDsl.g:581:1: rule__Role__Alternatives : ( ( ruleRole_Impl ) | ( ruleRequiredRole ) | ( ruleProvidedRole ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:585:1: ( ( ruleRole_Impl ) | ( ruleRequiredRole ) | ( ruleProvidedRole ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
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
                    // InternalCosaDsl.g:586:2: ( ruleRole_Impl )
                    {
                    // InternalCosaDsl.g:586:2: ( ruleRole_Impl )
                    // InternalCosaDsl.g:587:3: ruleRole_Impl
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
                    // InternalCosaDsl.g:592:2: ( ruleRequiredRole )
                    {
                    // InternalCosaDsl.g:592:2: ( ruleRequiredRole )
                    // InternalCosaDsl.g:593:3: ruleRequiredRole
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
                    // InternalCosaDsl.g:598:2: ( ruleProvidedRole )
                    {
                    // InternalCosaDsl.g:598:2: ( ruleProvidedRole )
                    // InternalCosaDsl.g:599:3: ruleProvidedRole
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
    // InternalCosaDsl.g:608:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:612:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCosaDsl.g:613:2: ( RULE_STRING )
                    {
                    // InternalCosaDsl.g:613:2: ( RULE_STRING )
                    // InternalCosaDsl.g:614:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCosaDsl.g:619:2: ( RULE_ID )
                    {
                    // InternalCosaDsl.g:619:2: ( RULE_ID )
                    // InternalCosaDsl.g:620:3: RULE_ID
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
    // InternalCosaDsl.g:629:1: rule__CompositeConfiguration__Group__0 : rule__CompositeConfiguration__Group__0__Impl rule__CompositeConfiguration__Group__1 ;
    public final void rule__CompositeConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:633:1: ( rule__CompositeConfiguration__Group__0__Impl rule__CompositeConfiguration__Group__1 )
            // InternalCosaDsl.g:634:2: rule__CompositeConfiguration__Group__0__Impl rule__CompositeConfiguration__Group__1
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
    // InternalCosaDsl.g:641:1: rule__CompositeConfiguration__Group__0__Impl : ( 'CompositeConfiguration' ) ;
    public final void rule__CompositeConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:645:1: ( ( 'CompositeConfiguration' ) )
            // InternalCosaDsl.g:646:1: ( 'CompositeConfiguration' )
            {
            // InternalCosaDsl.g:646:1: ( 'CompositeConfiguration' )
            // InternalCosaDsl.g:647:2: 'CompositeConfiguration'
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
    // InternalCosaDsl.g:656:1: rule__CompositeConfiguration__Group__1 : rule__CompositeConfiguration__Group__1__Impl rule__CompositeConfiguration__Group__2 ;
    public final void rule__CompositeConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:660:1: ( rule__CompositeConfiguration__Group__1__Impl rule__CompositeConfiguration__Group__2 )
            // InternalCosaDsl.g:661:2: rule__CompositeConfiguration__Group__1__Impl rule__CompositeConfiguration__Group__2
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
    // InternalCosaDsl.g:668:1: rule__CompositeConfiguration__Group__1__Impl : ( ( rule__CompositeConfiguration__NameAssignment_1 ) ) ;
    public final void rule__CompositeConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:672:1: ( ( ( rule__CompositeConfiguration__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:673:1: ( ( rule__CompositeConfiguration__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:673:1: ( ( rule__CompositeConfiguration__NameAssignment_1 ) )
            // InternalCosaDsl.g:674:2: ( rule__CompositeConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:675:2: ( rule__CompositeConfiguration__NameAssignment_1 )
            // InternalCosaDsl.g:675:3: rule__CompositeConfiguration__NameAssignment_1
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
    // InternalCosaDsl.g:683:1: rule__CompositeConfiguration__Group__2 : rule__CompositeConfiguration__Group__2__Impl rule__CompositeConfiguration__Group__3 ;
    public final void rule__CompositeConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:687:1: ( rule__CompositeConfiguration__Group__2__Impl rule__CompositeConfiguration__Group__3 )
            // InternalCosaDsl.g:688:2: rule__CompositeConfiguration__Group__2__Impl rule__CompositeConfiguration__Group__3
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
    // InternalCosaDsl.g:695:1: rule__CompositeConfiguration__Group__2__Impl : ( '={' ) ;
    public final void rule__CompositeConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:699:1: ( ( '={' ) )
            // InternalCosaDsl.g:700:1: ( '={' )
            {
            // InternalCosaDsl.g:700:1: ( '={' )
            // InternalCosaDsl.g:701:2: '={'
            {
             before(grammarAccess.getCompositeConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 

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
    // InternalCosaDsl.g:710:1: rule__CompositeConfiguration__Group__3 : rule__CompositeConfiguration__Group__3__Impl rule__CompositeConfiguration__Group__4 ;
    public final void rule__CompositeConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:714:1: ( rule__CompositeConfiguration__Group__3__Impl rule__CompositeConfiguration__Group__4 )
            // InternalCosaDsl.g:715:2: rule__CompositeConfiguration__Group__3__Impl rule__CompositeConfiguration__Group__4
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
    // InternalCosaDsl.g:722:1: rule__CompositeConfiguration__Group__3__Impl : ( ( rule__CompositeConfiguration__ComponentsAssignment_3 ) ) ;
    public final void rule__CompositeConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:726:1: ( ( ( rule__CompositeConfiguration__ComponentsAssignment_3 ) ) )
            // InternalCosaDsl.g:727:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_3 ) )
            {
            // InternalCosaDsl.g:727:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_3 ) )
            // InternalCosaDsl.g:728:2: ( rule__CompositeConfiguration__ComponentsAssignment_3 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3()); 
            // InternalCosaDsl.g:729:2: ( rule__CompositeConfiguration__ComponentsAssignment_3 )
            // InternalCosaDsl.g:729:3: rule__CompositeConfiguration__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_3()); 

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
    // InternalCosaDsl.g:737:1: rule__CompositeConfiguration__Group__4 : rule__CompositeConfiguration__Group__4__Impl rule__CompositeConfiguration__Group__5 ;
    public final void rule__CompositeConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:741:1: ( rule__CompositeConfiguration__Group__4__Impl rule__CompositeConfiguration__Group__5 )
            // InternalCosaDsl.g:742:2: rule__CompositeConfiguration__Group__4__Impl rule__CompositeConfiguration__Group__5
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
    // InternalCosaDsl.g:749:1: rule__CompositeConfiguration__Group__4__Impl : ( ( rule__CompositeConfiguration__Group_4__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:753:1: ( ( ( rule__CompositeConfiguration__Group_4__0 )* ) )
            // InternalCosaDsl.g:754:1: ( ( rule__CompositeConfiguration__Group_4__0 )* )
            {
            // InternalCosaDsl.g:754:1: ( ( rule__CompositeConfiguration__Group_4__0 )* )
            // InternalCosaDsl.g:755:2: ( rule__CompositeConfiguration__Group_4__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_4()); 
            // InternalCosaDsl.g:756:2: ( rule__CompositeConfiguration__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCosaDsl.g:756:3: rule__CompositeConfiguration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalCosaDsl.g:764:1: rule__CompositeConfiguration__Group__5 : rule__CompositeConfiguration__Group__5__Impl rule__CompositeConfiguration__Group__6 ;
    public final void rule__CompositeConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:768:1: ( rule__CompositeConfiguration__Group__5__Impl rule__CompositeConfiguration__Group__6 )
            // InternalCosaDsl.g:769:2: rule__CompositeConfiguration__Group__5__Impl rule__CompositeConfiguration__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:776:1: rule__CompositeConfiguration__Group__5__Impl : ( ( rule__CompositeConfiguration__ConnectorsAssignment_5 ) ) ;
    public final void rule__CompositeConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:780:1: ( ( ( rule__CompositeConfiguration__ConnectorsAssignment_5 ) ) )
            // InternalCosaDsl.g:781:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_5 ) )
            {
            // InternalCosaDsl.g:781:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_5 ) )
            // InternalCosaDsl.g:782:2: ( rule__CompositeConfiguration__ConnectorsAssignment_5 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_5()); 
            // InternalCosaDsl.g:783:2: ( rule__CompositeConfiguration__ConnectorsAssignment_5 )
            // InternalCosaDsl.g:783:3: rule__CompositeConfiguration__ConnectorsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConnectorsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_5()); 

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
    // InternalCosaDsl.g:791:1: rule__CompositeConfiguration__Group__6 : rule__CompositeConfiguration__Group__6__Impl rule__CompositeConfiguration__Group__7 ;
    public final void rule__CompositeConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:795:1: ( rule__CompositeConfiguration__Group__6__Impl rule__CompositeConfiguration__Group__7 )
            // InternalCosaDsl.g:796:2: rule__CompositeConfiguration__Group__6__Impl rule__CompositeConfiguration__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:803:1: rule__CompositeConfiguration__Group__6__Impl : ( ( rule__CompositeConfiguration__Group_6__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:807:1: ( ( ( rule__CompositeConfiguration__Group_6__0 )* ) )
            // InternalCosaDsl.g:808:1: ( ( rule__CompositeConfiguration__Group_6__0 )* )
            {
            // InternalCosaDsl.g:808:1: ( ( rule__CompositeConfiguration__Group_6__0 )* )
            // InternalCosaDsl.g:809:2: ( rule__CompositeConfiguration__Group_6__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_6()); 
            // InternalCosaDsl.g:810:2: ( rule__CompositeConfiguration__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCosaDsl.g:810:3: rule__CompositeConfiguration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalCosaDsl.g:818:1: rule__CompositeConfiguration__Group__7 : rule__CompositeConfiguration__Group__7__Impl rule__CompositeConfiguration__Group__8 ;
    public final void rule__CompositeConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:822:1: ( rule__CompositeConfiguration__Group__7__Impl rule__CompositeConfiguration__Group__8 )
            // InternalCosaDsl.g:823:2: rule__CompositeConfiguration__Group__7__Impl rule__CompositeConfiguration__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalCosaDsl.g:830:1: rule__CompositeConfiguration__Group__7__Impl : ( ( rule__CompositeConfiguration__PortsAssignment_7 ) ) ;
    public final void rule__CompositeConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:834:1: ( ( ( rule__CompositeConfiguration__PortsAssignment_7 ) ) )
            // InternalCosaDsl.g:835:1: ( ( rule__CompositeConfiguration__PortsAssignment_7 ) )
            {
            // InternalCosaDsl.g:835:1: ( ( rule__CompositeConfiguration__PortsAssignment_7 ) )
            // InternalCosaDsl.g:836:2: ( rule__CompositeConfiguration__PortsAssignment_7 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_7()); 
            // InternalCosaDsl.g:837:2: ( rule__CompositeConfiguration__PortsAssignment_7 )
            // InternalCosaDsl.g:837:3: rule__CompositeConfiguration__PortsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__PortsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_7()); 

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
    // InternalCosaDsl.g:845:1: rule__CompositeConfiguration__Group__8 : rule__CompositeConfiguration__Group__8__Impl rule__CompositeConfiguration__Group__9 ;
    public final void rule__CompositeConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:849:1: ( rule__CompositeConfiguration__Group__8__Impl rule__CompositeConfiguration__Group__9 )
            // InternalCosaDsl.g:850:2: rule__CompositeConfiguration__Group__8__Impl rule__CompositeConfiguration__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalCosaDsl.g:857:1: rule__CompositeConfiguration__Group__8__Impl : ( ( rule__CompositeConfiguration__Group_8__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:861:1: ( ( ( rule__CompositeConfiguration__Group_8__0 )* ) )
            // InternalCosaDsl.g:862:1: ( ( rule__CompositeConfiguration__Group_8__0 )* )
            {
            // InternalCosaDsl.g:862:1: ( ( rule__CompositeConfiguration__Group_8__0 )* )
            // InternalCosaDsl.g:863:2: ( rule__CompositeConfiguration__Group_8__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_8()); 
            // InternalCosaDsl.g:864:2: ( rule__CompositeConfiguration__Group_8__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCosaDsl.g:864:3: rule__CompositeConfiguration__Group_8__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalCosaDsl.g:872:1: rule__CompositeConfiguration__Group__9 : rule__CompositeConfiguration__Group__9__Impl rule__CompositeConfiguration__Group__10 ;
    public final void rule__CompositeConfiguration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:876:1: ( rule__CompositeConfiguration__Group__9__Impl rule__CompositeConfiguration__Group__10 )
            // InternalCosaDsl.g:877:2: rule__CompositeConfiguration__Group__9__Impl rule__CompositeConfiguration__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__CompositeConfiguration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__10();

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
    // InternalCosaDsl.g:884:1: rule__CompositeConfiguration__Group__9__Impl : ( ( rule__CompositeConfiguration__Group_9__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:888:1: ( ( ( rule__CompositeConfiguration__Group_9__0 )* ) )
            // InternalCosaDsl.g:889:1: ( ( rule__CompositeConfiguration__Group_9__0 )* )
            {
            // InternalCosaDsl.g:889:1: ( ( rule__CompositeConfiguration__Group_9__0 )* )
            // InternalCosaDsl.g:890:2: ( rule__CompositeConfiguration__Group_9__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_9()); 
            // InternalCosaDsl.g:891:2: ( rule__CompositeConfiguration__Group_9__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCosaDsl.g:891:3: rule__CompositeConfiguration__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeConfiguration__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_9()); 

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


    // $ANTLR start "rule__CompositeConfiguration__Group__10"
    // InternalCosaDsl.g:899:1: rule__CompositeConfiguration__Group__10 : rule__CompositeConfiguration__Group__10__Impl rule__CompositeConfiguration__Group__11 ;
    public final void rule__CompositeConfiguration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:903:1: ( rule__CompositeConfiguration__Group__10__Impl rule__CompositeConfiguration__Group__11 )
            // InternalCosaDsl.g:904:2: rule__CompositeConfiguration__Group__10__Impl rule__CompositeConfiguration__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__CompositeConfiguration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__11();

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
    // $ANTLR end "rule__CompositeConfiguration__Group__10"


    // $ANTLR start "rule__CompositeConfiguration__Group__10__Impl"
    // InternalCosaDsl.g:911:1: rule__CompositeConfiguration__Group__10__Impl : ( ( rule__CompositeConfiguration__AttachementsAssignment_10 ) ) ;
    public final void rule__CompositeConfiguration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:915:1: ( ( ( rule__CompositeConfiguration__AttachementsAssignment_10 ) ) )
            // InternalCosaDsl.g:916:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_10 ) )
            {
            // InternalCosaDsl.g:916:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_10 ) )
            // InternalCosaDsl.g:917:2: ( rule__CompositeConfiguration__AttachementsAssignment_10 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_10()); 
            // InternalCosaDsl.g:918:2: ( rule__CompositeConfiguration__AttachementsAssignment_10 )
            // InternalCosaDsl.g:918:3: rule__CompositeConfiguration__AttachementsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__AttachementsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_10()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group__10__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__11"
    // InternalCosaDsl.g:926:1: rule__CompositeConfiguration__Group__11 : rule__CompositeConfiguration__Group__11__Impl rule__CompositeConfiguration__Group__12 ;
    public final void rule__CompositeConfiguration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:930:1: ( rule__CompositeConfiguration__Group__11__Impl rule__CompositeConfiguration__Group__12 )
            // InternalCosaDsl.g:931:2: rule__CompositeConfiguration__Group__11__Impl rule__CompositeConfiguration__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__CompositeConfiguration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__12();

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
    // $ANTLR end "rule__CompositeConfiguration__Group__11"


    // $ANTLR start "rule__CompositeConfiguration__Group__11__Impl"
    // InternalCosaDsl.g:938:1: rule__CompositeConfiguration__Group__11__Impl : ( ( rule__CompositeConfiguration__Group_11__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:942:1: ( ( ( rule__CompositeConfiguration__Group_11__0 )* ) )
            // InternalCosaDsl.g:943:1: ( ( rule__CompositeConfiguration__Group_11__0 )* )
            {
            // InternalCosaDsl.g:943:1: ( ( rule__CompositeConfiguration__Group_11__0 )* )
            // InternalCosaDsl.g:944:2: ( rule__CompositeConfiguration__Group_11__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_11()); 
            // InternalCosaDsl.g:945:2: ( rule__CompositeConfiguration__Group_11__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCosaDsl.g:945:3: rule__CompositeConfiguration__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_11()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group__11__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__12"
    // InternalCosaDsl.g:953:1: rule__CompositeConfiguration__Group__12 : rule__CompositeConfiguration__Group__12__Impl rule__CompositeConfiguration__Group__13 ;
    public final void rule__CompositeConfiguration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:957:1: ( rule__CompositeConfiguration__Group__12__Impl rule__CompositeConfiguration__Group__13 )
            // InternalCosaDsl.g:958:2: rule__CompositeConfiguration__Group__12__Impl rule__CompositeConfiguration__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__CompositeConfiguration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__13();

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
    // $ANTLR end "rule__CompositeConfiguration__Group__12"


    // $ANTLR start "rule__CompositeConfiguration__Group__12__Impl"
    // InternalCosaDsl.g:965:1: rule__CompositeConfiguration__Group__12__Impl : ( ( rule__CompositeConfiguration__Group_12__0 )* ) ;
    public final void rule__CompositeConfiguration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:969:1: ( ( ( rule__CompositeConfiguration__Group_12__0 )* ) )
            // InternalCosaDsl.g:970:1: ( ( rule__CompositeConfiguration__Group_12__0 )* )
            {
            // InternalCosaDsl.g:970:1: ( ( rule__CompositeConfiguration__Group_12__0 )* )
            // InternalCosaDsl.g:971:2: ( rule__CompositeConfiguration__Group_12__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_12()); 
            // InternalCosaDsl.g:972:2: ( rule__CompositeConfiguration__Group_12__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCosaDsl.g:972:3: rule__CompositeConfiguration__Group_12__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CompositeConfiguration__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_12()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group__12__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group__13"
    // InternalCosaDsl.g:980:1: rule__CompositeConfiguration__Group__13 : rule__CompositeConfiguration__Group__13__Impl ;
    public final void rule__CompositeConfiguration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:984:1: ( rule__CompositeConfiguration__Group__13__Impl )
            // InternalCosaDsl.g:985:2: rule__CompositeConfiguration__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group__13__Impl();

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
    // $ANTLR end "rule__CompositeConfiguration__Group__13"


    // $ANTLR start "rule__CompositeConfiguration__Group__13__Impl"
    // InternalCosaDsl.g:991:1: rule__CompositeConfiguration__Group__13__Impl : ( '}' ) ;
    public final void rule__CompositeConfiguration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:995:1: ( ( '}' ) )
            // InternalCosaDsl.g:996:1: ( '}' )
            {
            // InternalCosaDsl.g:996:1: ( '}' )
            // InternalCosaDsl.g:997:2: '}'
            {
             before(grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group__13__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_4__0"
    // InternalCosaDsl.g:1007:1: rule__CompositeConfiguration__Group_4__0 : rule__CompositeConfiguration__Group_4__0__Impl rule__CompositeConfiguration__Group_4__1 ;
    public final void rule__CompositeConfiguration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1011:1: ( rule__CompositeConfiguration__Group_4__0__Impl rule__CompositeConfiguration__Group_4__1 )
            // InternalCosaDsl.g:1012:2: rule__CompositeConfiguration__Group_4__0__Impl rule__CompositeConfiguration__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCosaDsl.g:1019:1: rule__CompositeConfiguration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1023:1: ( ( ',' ) )
            // InternalCosaDsl.g:1024:1: ( ',' )
            {
            // InternalCosaDsl.g:1024:1: ( ',' )
            // InternalCosaDsl.g:1025:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_4_0()); 

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
    // InternalCosaDsl.g:1034:1: rule__CompositeConfiguration__Group_4__1 : rule__CompositeConfiguration__Group_4__1__Impl ;
    public final void rule__CompositeConfiguration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1038:1: ( rule__CompositeConfiguration__Group_4__1__Impl )
            // InternalCosaDsl.g:1039:2: rule__CompositeConfiguration__Group_4__1__Impl
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
    // InternalCosaDsl.g:1045:1: rule__CompositeConfiguration__Group_4__1__Impl : ( ( rule__CompositeConfiguration__ComponentsAssignment_4_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1049:1: ( ( ( rule__CompositeConfiguration__ComponentsAssignment_4_1 ) ) )
            // InternalCosaDsl.g:1050:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:1050:1: ( ( rule__CompositeConfiguration__ComponentsAssignment_4_1 ) )
            // InternalCosaDsl.g:1051:2: ( rule__CompositeConfiguration__ComponentsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_4_1()); 
            // InternalCosaDsl.g:1052:2: ( rule__CompositeConfiguration__ComponentsAssignment_4_1 )
            // InternalCosaDsl.g:1052:3: rule__CompositeConfiguration__ComponentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ComponentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsAssignment_4_1()); 

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


    // $ANTLR start "rule__CompositeConfiguration__Group_6__0"
    // InternalCosaDsl.g:1061:1: rule__CompositeConfiguration__Group_6__0 : rule__CompositeConfiguration__Group_6__0__Impl rule__CompositeConfiguration__Group_6__1 ;
    public final void rule__CompositeConfiguration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1065:1: ( rule__CompositeConfiguration__Group_6__0__Impl rule__CompositeConfiguration__Group_6__1 )
            // InternalCosaDsl.g:1066:2: rule__CompositeConfiguration__Group_6__0__Impl rule__CompositeConfiguration__Group_6__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCosaDsl.g:1073:1: rule__CompositeConfiguration__Group_6__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1077:1: ( ( ',' ) )
            // InternalCosaDsl.g:1078:1: ( ',' )
            {
            // InternalCosaDsl.g:1078:1: ( ',' )
            // InternalCosaDsl.g:1079:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_6_0()); 

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
    // InternalCosaDsl.g:1088:1: rule__CompositeConfiguration__Group_6__1 : rule__CompositeConfiguration__Group_6__1__Impl ;
    public final void rule__CompositeConfiguration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1092:1: ( rule__CompositeConfiguration__Group_6__1__Impl )
            // InternalCosaDsl.g:1093:2: rule__CompositeConfiguration__Group_6__1__Impl
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
    // InternalCosaDsl.g:1099:1: rule__CompositeConfiguration__Group_6__1__Impl : ( ( rule__CompositeConfiguration__ConnectorsAssignment_6_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1103:1: ( ( ( rule__CompositeConfiguration__ConnectorsAssignment_6_1 ) ) )
            // InternalCosaDsl.g:1104:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_6_1 ) )
            {
            // InternalCosaDsl.g:1104:1: ( ( rule__CompositeConfiguration__ConnectorsAssignment_6_1 ) )
            // InternalCosaDsl.g:1105:2: ( rule__CompositeConfiguration__ConnectorsAssignment_6_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_6_1()); 
            // InternalCosaDsl.g:1106:2: ( rule__CompositeConfiguration__ConnectorsAssignment_6_1 )
            // InternalCosaDsl.g:1106:3: rule__CompositeConfiguration__ConnectorsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConnectorsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsAssignment_6_1()); 

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


    // $ANTLR start "rule__CompositeConfiguration__Group_8__0"
    // InternalCosaDsl.g:1115:1: rule__CompositeConfiguration__Group_8__0 : rule__CompositeConfiguration__Group_8__0__Impl rule__CompositeConfiguration__Group_8__1 ;
    public final void rule__CompositeConfiguration__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1119:1: ( rule__CompositeConfiguration__Group_8__0__Impl rule__CompositeConfiguration__Group_8__1 )
            // InternalCosaDsl.g:1120:2: rule__CompositeConfiguration__Group_8__0__Impl rule__CompositeConfiguration__Group_8__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:1127:1: rule__CompositeConfiguration__Group_8__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1131:1: ( ( ',' ) )
            // InternalCosaDsl.g:1132:1: ( ',' )
            {
            // InternalCosaDsl.g:1132:1: ( ',' )
            // InternalCosaDsl.g:1133:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_8_0()); 

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
    // InternalCosaDsl.g:1142:1: rule__CompositeConfiguration__Group_8__1 : rule__CompositeConfiguration__Group_8__1__Impl ;
    public final void rule__CompositeConfiguration__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1146:1: ( rule__CompositeConfiguration__Group_8__1__Impl )
            // InternalCosaDsl.g:1147:2: rule__CompositeConfiguration__Group_8__1__Impl
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
    // InternalCosaDsl.g:1153:1: rule__CompositeConfiguration__Group_8__1__Impl : ( ( rule__CompositeConfiguration__PortsAssignment_8_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1157:1: ( ( ( rule__CompositeConfiguration__PortsAssignment_8_1 ) ) )
            // InternalCosaDsl.g:1158:1: ( ( rule__CompositeConfiguration__PortsAssignment_8_1 ) )
            {
            // InternalCosaDsl.g:1158:1: ( ( rule__CompositeConfiguration__PortsAssignment_8_1 ) )
            // InternalCosaDsl.g:1159:2: ( rule__CompositeConfiguration__PortsAssignment_8_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_8_1()); 
            // InternalCosaDsl.g:1160:2: ( rule__CompositeConfiguration__PortsAssignment_8_1 )
            // InternalCosaDsl.g:1160:3: rule__CompositeConfiguration__PortsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__PortsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getPortsAssignment_8_1()); 

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


    // $ANTLR start "rule__CompositeConfiguration__Group_9__0"
    // InternalCosaDsl.g:1169:1: rule__CompositeConfiguration__Group_9__0 : rule__CompositeConfiguration__Group_9__0__Impl rule__CompositeConfiguration__Group_9__1 ;
    public final void rule__CompositeConfiguration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1173:1: ( rule__CompositeConfiguration__Group_9__0__Impl rule__CompositeConfiguration__Group_9__1 )
            // InternalCosaDsl.g:1174:2: rule__CompositeConfiguration__Group_9__0__Impl rule__CompositeConfiguration__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__CompositeConfiguration__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_9__1();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_9__0__Impl"
    // InternalCosaDsl.g:1181:1: rule__CompositeConfiguration__Group_9__0__Impl : ( ( rule__CompositeConfiguration__BindingsAssignment_9_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1185:1: ( ( ( rule__CompositeConfiguration__BindingsAssignment_9_0 ) ) )
            // InternalCosaDsl.g:1186:1: ( ( rule__CompositeConfiguration__BindingsAssignment_9_0 ) )
            {
            // InternalCosaDsl.g:1186:1: ( ( rule__CompositeConfiguration__BindingsAssignment_9_0 ) )
            // InternalCosaDsl.g:1187:2: ( rule__CompositeConfiguration__BindingsAssignment_9_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_9_0()); 
            // InternalCosaDsl.g:1188:2: ( rule__CompositeConfiguration__BindingsAssignment_9_0 )
            // InternalCosaDsl.g:1188:3: rule__CompositeConfiguration__BindingsAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__BindingsAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_9_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_9__1"
    // InternalCosaDsl.g:1196:1: rule__CompositeConfiguration__Group_9__1 : rule__CompositeConfiguration__Group_9__1__Impl ;
    public final void rule__CompositeConfiguration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1200:1: ( rule__CompositeConfiguration__Group_9__1__Impl )
            // InternalCosaDsl.g:1201:2: rule__CompositeConfiguration__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_9__1__Impl();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_9__1__Impl"
    // InternalCosaDsl.g:1207:1: rule__CompositeConfiguration__Group_9__1__Impl : ( ( rule__CompositeConfiguration__Group_9_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1211:1: ( ( ( rule__CompositeConfiguration__Group_9_1__0 )* ) )
            // InternalCosaDsl.g:1212:1: ( ( rule__CompositeConfiguration__Group_9_1__0 )* )
            {
            // InternalCosaDsl.g:1212:1: ( ( rule__CompositeConfiguration__Group_9_1__0 )* )
            // InternalCosaDsl.g:1213:2: ( rule__CompositeConfiguration__Group_9_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_9_1()); 
            // InternalCosaDsl.g:1214:2: ( rule__CompositeConfiguration__Group_9_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCosaDsl.g:1214:3: rule__CompositeConfiguration__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_9_1()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_9_1__0"
    // InternalCosaDsl.g:1223:1: rule__CompositeConfiguration__Group_9_1__0 : rule__CompositeConfiguration__Group_9_1__0__Impl rule__CompositeConfiguration__Group_9_1__1 ;
    public final void rule__CompositeConfiguration__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1227:1: ( rule__CompositeConfiguration__Group_9_1__0__Impl rule__CompositeConfiguration__Group_9_1__1 )
            // InternalCosaDsl.g:1228:2: rule__CompositeConfiguration__Group_9_1__0__Impl rule__CompositeConfiguration__Group_9_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeConfiguration__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_9_1__1();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_9_1__0__Impl"
    // InternalCosaDsl.g:1235:1: rule__CompositeConfiguration__Group_9_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1239:1: ( ( ',' ) )
            // InternalCosaDsl.g:1240:1: ( ',' )
            {
            // InternalCosaDsl.g:1240:1: ( ',' )
            // InternalCosaDsl.g:1241:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_9_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_9_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_9_1__1"
    // InternalCosaDsl.g:1250:1: rule__CompositeConfiguration__Group_9_1__1 : rule__CompositeConfiguration__Group_9_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1254:1: ( rule__CompositeConfiguration__Group_9_1__1__Impl )
            // InternalCosaDsl.g:1255:2: rule__CompositeConfiguration__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_9_1__1__Impl();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_9_1__1__Impl"
    // InternalCosaDsl.g:1261:1: rule__CompositeConfiguration__Group_9_1__1__Impl : ( ( rule__CompositeConfiguration__BindingsAssignment_9_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1265:1: ( ( ( rule__CompositeConfiguration__BindingsAssignment_9_1_1 ) ) )
            // InternalCosaDsl.g:1266:1: ( ( rule__CompositeConfiguration__BindingsAssignment_9_1_1 ) )
            {
            // InternalCosaDsl.g:1266:1: ( ( rule__CompositeConfiguration__BindingsAssignment_9_1_1 ) )
            // InternalCosaDsl.g:1267:2: ( rule__CompositeConfiguration__BindingsAssignment_9_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_9_1_1()); 
            // InternalCosaDsl.g:1268:2: ( rule__CompositeConfiguration__BindingsAssignment_9_1_1 )
            // InternalCosaDsl.g:1268:3: rule__CompositeConfiguration__BindingsAssignment_9_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__BindingsAssignment_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsAssignment_9_1_1()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_9_1__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_11__0"
    // InternalCosaDsl.g:1277:1: rule__CompositeConfiguration__Group_11__0 : rule__CompositeConfiguration__Group_11__0__Impl rule__CompositeConfiguration__Group_11__1 ;
    public final void rule__CompositeConfiguration__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1281:1: ( rule__CompositeConfiguration__Group_11__0__Impl rule__CompositeConfiguration__Group_11__1 )
            // InternalCosaDsl.g:1282:2: rule__CompositeConfiguration__Group_11__0__Impl rule__CompositeConfiguration__Group_11__1
            {
            pushFollow(FOLLOW_9);
            rule__CompositeConfiguration__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_11__1();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_11__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_11__0__Impl"
    // InternalCosaDsl.g:1289:1: rule__CompositeConfiguration__Group_11__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1293:1: ( ( ',' ) )
            // InternalCosaDsl.g:1294:1: ( ',' )
            {
            // InternalCosaDsl.g:1294:1: ( ',' )
            // InternalCosaDsl.g:1295:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_11_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_11__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_11__1"
    // InternalCosaDsl.g:1304:1: rule__CompositeConfiguration__Group_11__1 : rule__CompositeConfiguration__Group_11__1__Impl ;
    public final void rule__CompositeConfiguration__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1308:1: ( rule__CompositeConfiguration__Group_11__1__Impl )
            // InternalCosaDsl.g:1309:2: rule__CompositeConfiguration__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_11__1__Impl();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_11__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_11__1__Impl"
    // InternalCosaDsl.g:1315:1: rule__CompositeConfiguration__Group_11__1__Impl : ( ( rule__CompositeConfiguration__AttachementsAssignment_11_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1319:1: ( ( ( rule__CompositeConfiguration__AttachementsAssignment_11_1 ) ) )
            // InternalCosaDsl.g:1320:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_11_1 ) )
            {
            // InternalCosaDsl.g:1320:1: ( ( rule__CompositeConfiguration__AttachementsAssignment_11_1 ) )
            // InternalCosaDsl.g:1321:2: ( rule__CompositeConfiguration__AttachementsAssignment_11_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_11_1()); 
            // InternalCosaDsl.g:1322:2: ( rule__CompositeConfiguration__AttachementsAssignment_11_1 )
            // InternalCosaDsl.g:1322:3: rule__CompositeConfiguration__AttachementsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__AttachementsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAssignment_11_1()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_11__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_12__0"
    // InternalCosaDsl.g:1331:1: rule__CompositeConfiguration__Group_12__0 : rule__CompositeConfiguration__Group_12__0__Impl rule__CompositeConfiguration__Group_12__1 ;
    public final void rule__CompositeConfiguration__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1335:1: ( rule__CompositeConfiguration__Group_12__0__Impl rule__CompositeConfiguration__Group_12__1 )
            // InternalCosaDsl.g:1336:2: rule__CompositeConfiguration__Group_12__0__Impl rule__CompositeConfiguration__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__CompositeConfiguration__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_12__1();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_12__0__Impl"
    // InternalCosaDsl.g:1343:1: rule__CompositeConfiguration__Group_12__0__Impl : ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_0 ) ) ;
    public final void rule__CompositeConfiguration__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1347:1: ( ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_0 ) ) )
            // InternalCosaDsl.g:1348:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_0 ) )
            {
            // InternalCosaDsl.g:1348:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_0 ) )
            // InternalCosaDsl.g:1349:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_12_0 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_12_0()); 
            // InternalCosaDsl.g:1350:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_12_0 )
            // InternalCosaDsl.g:1350:3: rule__CompositeConfiguration__ConfigurationsAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConfigurationsAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_12_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_12__1"
    // InternalCosaDsl.g:1358:1: rule__CompositeConfiguration__Group_12__1 : rule__CompositeConfiguration__Group_12__1__Impl ;
    public final void rule__CompositeConfiguration__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1362:1: ( rule__CompositeConfiguration__Group_12__1__Impl )
            // InternalCosaDsl.g:1363:2: rule__CompositeConfiguration__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_12__1__Impl();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_12__1__Impl"
    // InternalCosaDsl.g:1369:1: rule__CompositeConfiguration__Group_12__1__Impl : ( ( rule__CompositeConfiguration__Group_12_1__0 )* ) ;
    public final void rule__CompositeConfiguration__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1373:1: ( ( ( rule__CompositeConfiguration__Group_12_1__0 )* ) )
            // InternalCosaDsl.g:1374:1: ( ( rule__CompositeConfiguration__Group_12_1__0 )* )
            {
            // InternalCosaDsl.g:1374:1: ( ( rule__CompositeConfiguration__Group_12_1__0 )* )
            // InternalCosaDsl.g:1375:2: ( rule__CompositeConfiguration__Group_12_1__0 )*
            {
             before(grammarAccess.getCompositeConfigurationAccess().getGroup_12_1()); 
            // InternalCosaDsl.g:1376:2: ( rule__CompositeConfiguration__Group_12_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCosaDsl.g:1376:3: rule__CompositeConfiguration__Group_12_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__CompositeConfiguration__Group_12_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompositeConfigurationAccess().getGroup_12_1()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12__1__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_12_1__0"
    // InternalCosaDsl.g:1385:1: rule__CompositeConfiguration__Group_12_1__0 : rule__CompositeConfiguration__Group_12_1__0__Impl rule__CompositeConfiguration__Group_12_1__1 ;
    public final void rule__CompositeConfiguration__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1389:1: ( rule__CompositeConfiguration__Group_12_1__0__Impl rule__CompositeConfiguration__Group_12_1__1 )
            // InternalCosaDsl.g:1390:2: rule__CompositeConfiguration__Group_12_1__0__Impl rule__CompositeConfiguration__Group_12_1__1
            {
            pushFollow(FOLLOW_15);
            rule__CompositeConfiguration__Group_12_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_12_1__1();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12_1__0"


    // $ANTLR start "rule__CompositeConfiguration__Group_12_1__0__Impl"
    // InternalCosaDsl.g:1397:1: rule__CompositeConfiguration__Group_12_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeConfiguration__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1401:1: ( ( ',' ) )
            // InternalCosaDsl.g:1402:1: ( ',' )
            {
            // InternalCosaDsl.g:1402:1: ( ',' )
            // InternalCosaDsl.g:1403:2: ','
            {
             before(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_12_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeConfigurationAccess().getCommaKeyword_12_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12_1__0__Impl"


    // $ANTLR start "rule__CompositeConfiguration__Group_12_1__1"
    // InternalCosaDsl.g:1412:1: rule__CompositeConfiguration__Group_12_1__1 : rule__CompositeConfiguration__Group_12_1__1__Impl ;
    public final void rule__CompositeConfiguration__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1416:1: ( rule__CompositeConfiguration__Group_12_1__1__Impl )
            // InternalCosaDsl.g:1417:2: rule__CompositeConfiguration__Group_12_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__Group_12_1__1__Impl();

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12_1__1"


    // $ANTLR start "rule__CompositeConfiguration__Group_12_1__1__Impl"
    // InternalCosaDsl.g:1423:1: rule__CompositeConfiguration__Group_12_1__1__Impl : ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 ) ) ;
    public final void rule__CompositeConfiguration__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1427:1: ( ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 ) ) )
            // InternalCosaDsl.g:1428:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 ) )
            {
            // InternalCosaDsl.g:1428:1: ( ( rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 ) )
            // InternalCosaDsl.g:1429:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 )
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_12_1_1()); 
            // InternalCosaDsl.g:1430:2: ( rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 )
            // InternalCosaDsl.g:1430:3: rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsAssignment_12_1_1()); 

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
    // $ANTLR end "rule__CompositeConfiguration__Group_12_1__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalCosaDsl.g:1439:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1443:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalCosaDsl.g:1444:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

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
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalCosaDsl.g:1451:1: rule__Configuration__Group__0__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1455:1: ( ( 'Configuration' ) )
            // InternalCosaDsl.g:1456:1: ( 'Configuration' )
            {
            // InternalCosaDsl.g:1456:1: ( 'Configuration' )
            // InternalCosaDsl.g:1457:2: 'Configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 

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
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalCosaDsl.g:1466:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1470:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalCosaDsl.g:1471:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

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
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalCosaDsl.g:1478:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1482:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:1483:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:1483:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalCosaDsl.g:1484:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:1485:2: ( rule__Configuration__NameAssignment_1 )
            // InternalCosaDsl.g:1485:3: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalCosaDsl.g:1493:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1497:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // InternalCosaDsl.g:1498:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__3();

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
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalCosaDsl.g:1505:1: rule__Configuration__Group__2__Impl : ( '={' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1509:1: ( ( '={' ) )
            // InternalCosaDsl.g:1510:1: ( '={' )
            {
            // InternalCosaDsl.g:1510:1: ( '={' )
            // InternalCosaDsl.g:1511:2: '={'
            {
             before(grammarAccess.getConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // InternalCosaDsl.g:1520:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1524:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // InternalCosaDsl.g:1525:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__4();

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
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // InternalCosaDsl.g:1532:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__ComponentsAssignment_3 ) ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1536:1: ( ( ( rule__Configuration__ComponentsAssignment_3 ) ) )
            // InternalCosaDsl.g:1537:1: ( ( rule__Configuration__ComponentsAssignment_3 ) )
            {
            // InternalCosaDsl.g:1537:1: ( ( rule__Configuration__ComponentsAssignment_3 ) )
            // InternalCosaDsl.g:1538:2: ( rule__Configuration__ComponentsAssignment_3 )
            {
             before(grammarAccess.getConfigurationAccess().getComponentsAssignment_3()); 
            // InternalCosaDsl.g:1539:2: ( rule__Configuration__ComponentsAssignment_3 )
            // InternalCosaDsl.g:1539:3: rule__Configuration__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // InternalCosaDsl.g:1547:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1551:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // InternalCosaDsl.g:1552:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__5();

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
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // InternalCosaDsl.g:1559:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__Group_4__0 )* ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1563:1: ( ( ( rule__Configuration__Group_4__0 )* ) )
            // InternalCosaDsl.g:1564:1: ( ( rule__Configuration__Group_4__0 )* )
            {
            // InternalCosaDsl.g:1564:1: ( ( rule__Configuration__Group_4__0 )* )
            // InternalCosaDsl.g:1565:2: ( rule__Configuration__Group_4__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_4()); 
            // InternalCosaDsl.g:1566:2: ( rule__Configuration__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCosaDsl.g:1566:3: rule__Configuration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Configuration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group__5"
    // InternalCosaDsl.g:1574:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1578:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // InternalCosaDsl.g:1579:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__6();

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
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // InternalCosaDsl.g:1586:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConnectorsAssignment_5 ) ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1590:1: ( ( ( rule__Configuration__ConnectorsAssignment_5 ) ) )
            // InternalCosaDsl.g:1591:1: ( ( rule__Configuration__ConnectorsAssignment_5 ) )
            {
            // InternalCosaDsl.g:1591:1: ( ( rule__Configuration__ConnectorsAssignment_5 ) )
            // InternalCosaDsl.g:1592:2: ( rule__Configuration__ConnectorsAssignment_5 )
            {
             before(grammarAccess.getConfigurationAccess().getConnectorsAssignment_5()); 
            // InternalCosaDsl.g:1593:2: ( rule__Configuration__ConnectorsAssignment_5 )
            // InternalCosaDsl.g:1593:3: rule__Configuration__ConnectorsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ConnectorsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getConnectorsAssignment_5()); 

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
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__Configuration__Group__6"
    // InternalCosaDsl.g:1601:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl rule__Configuration__Group__7 ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1605:1: ( rule__Configuration__Group__6__Impl rule__Configuration__Group__7 )
            // InternalCosaDsl.g:1606:2: rule__Configuration__Group__6__Impl rule__Configuration__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__7();

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
    // $ANTLR end "rule__Configuration__Group__6"


    // $ANTLR start "rule__Configuration__Group__6__Impl"
    // InternalCosaDsl.g:1613:1: rule__Configuration__Group__6__Impl : ( ( rule__Configuration__Group_6__0 )* ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1617:1: ( ( ( rule__Configuration__Group_6__0 )* ) )
            // InternalCosaDsl.g:1618:1: ( ( rule__Configuration__Group_6__0 )* )
            {
            // InternalCosaDsl.g:1618:1: ( ( rule__Configuration__Group_6__0 )* )
            // InternalCosaDsl.g:1619:2: ( rule__Configuration__Group_6__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_6()); 
            // InternalCosaDsl.g:1620:2: ( rule__Configuration__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCosaDsl.g:1620:3: rule__Configuration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Configuration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Configuration__Group__6__Impl"


    // $ANTLR start "rule__Configuration__Group__7"
    // InternalCosaDsl.g:1628:1: rule__Configuration__Group__7 : rule__Configuration__Group__7__Impl rule__Configuration__Group__8 ;
    public final void rule__Configuration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1632:1: ( rule__Configuration__Group__7__Impl rule__Configuration__Group__8 )
            // InternalCosaDsl.g:1633:2: rule__Configuration__Group__7__Impl rule__Configuration__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Configuration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__8();

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
    // $ANTLR end "rule__Configuration__Group__7"


    // $ANTLR start "rule__Configuration__Group__7__Impl"
    // InternalCosaDsl.g:1640:1: rule__Configuration__Group__7__Impl : ( ( rule__Configuration__PortsAssignment_7 ) ) ;
    public final void rule__Configuration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1644:1: ( ( ( rule__Configuration__PortsAssignment_7 ) ) )
            // InternalCosaDsl.g:1645:1: ( ( rule__Configuration__PortsAssignment_7 ) )
            {
            // InternalCosaDsl.g:1645:1: ( ( rule__Configuration__PortsAssignment_7 ) )
            // InternalCosaDsl.g:1646:2: ( rule__Configuration__PortsAssignment_7 )
            {
             before(grammarAccess.getConfigurationAccess().getPortsAssignment_7()); 
            // InternalCosaDsl.g:1647:2: ( rule__Configuration__PortsAssignment_7 )
            // InternalCosaDsl.g:1647:3: rule__Configuration__PortsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__PortsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getPortsAssignment_7()); 

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
    // $ANTLR end "rule__Configuration__Group__7__Impl"


    // $ANTLR start "rule__Configuration__Group__8"
    // InternalCosaDsl.g:1655:1: rule__Configuration__Group__8 : rule__Configuration__Group__8__Impl rule__Configuration__Group__9 ;
    public final void rule__Configuration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1659:1: ( rule__Configuration__Group__8__Impl rule__Configuration__Group__9 )
            // InternalCosaDsl.g:1660:2: rule__Configuration__Group__8__Impl rule__Configuration__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Configuration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__9();

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
    // $ANTLR end "rule__Configuration__Group__8"


    // $ANTLR start "rule__Configuration__Group__8__Impl"
    // InternalCosaDsl.g:1667:1: rule__Configuration__Group__8__Impl : ( ( rule__Configuration__Group_8__0 )* ) ;
    public final void rule__Configuration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1671:1: ( ( ( rule__Configuration__Group_8__0 )* ) )
            // InternalCosaDsl.g:1672:1: ( ( rule__Configuration__Group_8__0 )* )
            {
            // InternalCosaDsl.g:1672:1: ( ( rule__Configuration__Group_8__0 )* )
            // InternalCosaDsl.g:1673:2: ( rule__Configuration__Group_8__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_8()); 
            // InternalCosaDsl.g:1674:2: ( rule__Configuration__Group_8__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCosaDsl.g:1674:3: rule__Configuration__Group_8__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Configuration__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Configuration__Group__8__Impl"


    // $ANTLR start "rule__Configuration__Group__9"
    // InternalCosaDsl.g:1682:1: rule__Configuration__Group__9 : rule__Configuration__Group__9__Impl rule__Configuration__Group__10 ;
    public final void rule__Configuration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1686:1: ( rule__Configuration__Group__9__Impl rule__Configuration__Group__10 )
            // InternalCosaDsl.g:1687:2: rule__Configuration__Group__9__Impl rule__Configuration__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Configuration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__10();

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
    // $ANTLR end "rule__Configuration__Group__9"


    // $ANTLR start "rule__Configuration__Group__9__Impl"
    // InternalCosaDsl.g:1694:1: rule__Configuration__Group__9__Impl : ( ( rule__Configuration__Group_9__0 )* ) ;
    public final void rule__Configuration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1698:1: ( ( ( rule__Configuration__Group_9__0 )* ) )
            // InternalCosaDsl.g:1699:1: ( ( rule__Configuration__Group_9__0 )* )
            {
            // InternalCosaDsl.g:1699:1: ( ( rule__Configuration__Group_9__0 )* )
            // InternalCosaDsl.g:1700:2: ( rule__Configuration__Group_9__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_9()); 
            // InternalCosaDsl.g:1701:2: ( rule__Configuration__Group_9__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCosaDsl.g:1701:3: rule__Configuration__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Configuration__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Configuration__Group__9__Impl"


    // $ANTLR start "rule__Configuration__Group__10"
    // InternalCosaDsl.g:1709:1: rule__Configuration__Group__10 : rule__Configuration__Group__10__Impl rule__Configuration__Group__11 ;
    public final void rule__Configuration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1713:1: ( rule__Configuration__Group__10__Impl rule__Configuration__Group__11 )
            // InternalCosaDsl.g:1714:2: rule__Configuration__Group__10__Impl rule__Configuration__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Configuration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__11();

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
    // $ANTLR end "rule__Configuration__Group__10"


    // $ANTLR start "rule__Configuration__Group__10__Impl"
    // InternalCosaDsl.g:1721:1: rule__Configuration__Group__10__Impl : ( ( rule__Configuration__AttachementsAssignment_10 ) ) ;
    public final void rule__Configuration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1725:1: ( ( ( rule__Configuration__AttachementsAssignment_10 ) ) )
            // InternalCosaDsl.g:1726:1: ( ( rule__Configuration__AttachementsAssignment_10 ) )
            {
            // InternalCosaDsl.g:1726:1: ( ( rule__Configuration__AttachementsAssignment_10 ) )
            // InternalCosaDsl.g:1727:2: ( rule__Configuration__AttachementsAssignment_10 )
            {
             before(grammarAccess.getConfigurationAccess().getAttachementsAssignment_10()); 
            // InternalCosaDsl.g:1728:2: ( rule__Configuration__AttachementsAssignment_10 )
            // InternalCosaDsl.g:1728:3: rule__Configuration__AttachementsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__AttachementsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAttachementsAssignment_10()); 

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
    // $ANTLR end "rule__Configuration__Group__10__Impl"


    // $ANTLR start "rule__Configuration__Group__11"
    // InternalCosaDsl.g:1736:1: rule__Configuration__Group__11 : rule__Configuration__Group__11__Impl rule__Configuration__Group__12 ;
    public final void rule__Configuration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1740:1: ( rule__Configuration__Group__11__Impl rule__Configuration__Group__12 )
            // InternalCosaDsl.g:1741:2: rule__Configuration__Group__11__Impl rule__Configuration__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Configuration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__12();

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
    // $ANTLR end "rule__Configuration__Group__11"


    // $ANTLR start "rule__Configuration__Group__11__Impl"
    // InternalCosaDsl.g:1748:1: rule__Configuration__Group__11__Impl : ( ( rule__Configuration__Group_11__0 )* ) ;
    public final void rule__Configuration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1752:1: ( ( ( rule__Configuration__Group_11__0 )* ) )
            // InternalCosaDsl.g:1753:1: ( ( rule__Configuration__Group_11__0 )* )
            {
            // InternalCosaDsl.g:1753:1: ( ( rule__Configuration__Group_11__0 )* )
            // InternalCosaDsl.g:1754:2: ( rule__Configuration__Group_11__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_11()); 
            // InternalCosaDsl.g:1755:2: ( rule__Configuration__Group_11__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCosaDsl.g:1755:3: rule__Configuration__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Configuration__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Configuration__Group__11__Impl"


    // $ANTLR start "rule__Configuration__Group__12"
    // InternalCosaDsl.g:1763:1: rule__Configuration__Group__12 : rule__Configuration__Group__12__Impl ;
    public final void rule__Configuration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1767:1: ( rule__Configuration__Group__12__Impl )
            // InternalCosaDsl.g:1768:2: rule__Configuration__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__12__Impl();

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
    // $ANTLR end "rule__Configuration__Group__12"


    // $ANTLR start "rule__Configuration__Group__12__Impl"
    // InternalCosaDsl.g:1774:1: rule__Configuration__Group__12__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1778:1: ( ( '}' ) )
            // InternalCosaDsl.g:1779:1: ( '}' )
            {
            // InternalCosaDsl.g:1779:1: ( '}' )
            // InternalCosaDsl.g:1780:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Configuration__Group__12__Impl"


    // $ANTLR start "rule__Configuration__Group_4__0"
    // InternalCosaDsl.g:1790:1: rule__Configuration__Group_4__0 : rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 ;
    public final void rule__Configuration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1794:1: ( rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 )
            // InternalCosaDsl.g:1795:2: rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Configuration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_4__1();

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
    // $ANTLR end "rule__Configuration__Group_4__0"


    // $ANTLR start "rule__Configuration__Group_4__0__Impl"
    // InternalCosaDsl.g:1802:1: rule__Configuration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1806:1: ( ( ',' ) )
            // InternalCosaDsl.g:1807:1: ( ',' )
            {
            // InternalCosaDsl.g:1807:1: ( ',' )
            // InternalCosaDsl.g:1808:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Configuration__Group_4__0__Impl"


    // $ANTLR start "rule__Configuration__Group_4__1"
    // InternalCosaDsl.g:1817:1: rule__Configuration__Group_4__1 : rule__Configuration__Group_4__1__Impl ;
    public final void rule__Configuration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1821:1: ( rule__Configuration__Group_4__1__Impl )
            // InternalCosaDsl.g:1822:2: rule__Configuration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_4__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_4__1"


    // $ANTLR start "rule__Configuration__Group_4__1__Impl"
    // InternalCosaDsl.g:1828:1: rule__Configuration__Group_4__1__Impl : ( ( rule__Configuration__ComponentsAssignment_4_1 ) ) ;
    public final void rule__Configuration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1832:1: ( ( ( rule__Configuration__ComponentsAssignment_4_1 ) ) )
            // InternalCosaDsl.g:1833:1: ( ( rule__Configuration__ComponentsAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:1833:1: ( ( rule__Configuration__ComponentsAssignment_4_1 ) )
            // InternalCosaDsl.g:1834:2: ( rule__Configuration__ComponentsAssignment_4_1 )
            {
             before(grammarAccess.getConfigurationAccess().getComponentsAssignment_4_1()); 
            // InternalCosaDsl.g:1835:2: ( rule__Configuration__ComponentsAssignment_4_1 )
            // InternalCosaDsl.g:1835:3: rule__Configuration__ComponentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ComponentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getComponentsAssignment_4_1()); 

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
    // $ANTLR end "rule__Configuration__Group_4__1__Impl"


    // $ANTLR start "rule__Configuration__Group_6__0"
    // InternalCosaDsl.g:1844:1: rule__Configuration__Group_6__0 : rule__Configuration__Group_6__0__Impl rule__Configuration__Group_6__1 ;
    public final void rule__Configuration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1848:1: ( rule__Configuration__Group_6__0__Impl rule__Configuration__Group_6__1 )
            // InternalCosaDsl.g:1849:2: rule__Configuration__Group_6__0__Impl rule__Configuration__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_6__1();

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
    // $ANTLR end "rule__Configuration__Group_6__0"


    // $ANTLR start "rule__Configuration__Group_6__0__Impl"
    // InternalCosaDsl.g:1856:1: rule__Configuration__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1860:1: ( ( ',' ) )
            // InternalCosaDsl.g:1861:1: ( ',' )
            {
            // InternalCosaDsl.g:1861:1: ( ',' )
            // InternalCosaDsl.g:1862:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Configuration__Group_6__0__Impl"


    // $ANTLR start "rule__Configuration__Group_6__1"
    // InternalCosaDsl.g:1871:1: rule__Configuration__Group_6__1 : rule__Configuration__Group_6__1__Impl ;
    public final void rule__Configuration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1875:1: ( rule__Configuration__Group_6__1__Impl )
            // InternalCosaDsl.g:1876:2: rule__Configuration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_6__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_6__1"


    // $ANTLR start "rule__Configuration__Group_6__1__Impl"
    // InternalCosaDsl.g:1882:1: rule__Configuration__Group_6__1__Impl : ( ( rule__Configuration__ConnectorsAssignment_6_1 ) ) ;
    public final void rule__Configuration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1886:1: ( ( ( rule__Configuration__ConnectorsAssignment_6_1 ) ) )
            // InternalCosaDsl.g:1887:1: ( ( rule__Configuration__ConnectorsAssignment_6_1 ) )
            {
            // InternalCosaDsl.g:1887:1: ( ( rule__Configuration__ConnectorsAssignment_6_1 ) )
            // InternalCosaDsl.g:1888:2: ( rule__Configuration__ConnectorsAssignment_6_1 )
            {
             before(grammarAccess.getConfigurationAccess().getConnectorsAssignment_6_1()); 
            // InternalCosaDsl.g:1889:2: ( rule__Configuration__ConnectorsAssignment_6_1 )
            // InternalCosaDsl.g:1889:3: rule__Configuration__ConnectorsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ConnectorsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getConnectorsAssignment_6_1()); 

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
    // $ANTLR end "rule__Configuration__Group_6__1__Impl"


    // $ANTLR start "rule__Configuration__Group_8__0"
    // InternalCosaDsl.g:1898:1: rule__Configuration__Group_8__0 : rule__Configuration__Group_8__0__Impl rule__Configuration__Group_8__1 ;
    public final void rule__Configuration__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1902:1: ( rule__Configuration__Group_8__0__Impl rule__Configuration__Group_8__1 )
            // InternalCosaDsl.g:1903:2: rule__Configuration__Group_8__0__Impl rule__Configuration__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Configuration__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_8__1();

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
    // $ANTLR end "rule__Configuration__Group_8__0"


    // $ANTLR start "rule__Configuration__Group_8__0__Impl"
    // InternalCosaDsl.g:1910:1: rule__Configuration__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1914:1: ( ( ',' ) )
            // InternalCosaDsl.g:1915:1: ( ',' )
            {
            // InternalCosaDsl.g:1915:1: ( ',' )
            // InternalCosaDsl.g:1916:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_8_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__Configuration__Group_8__0__Impl"


    // $ANTLR start "rule__Configuration__Group_8__1"
    // InternalCosaDsl.g:1925:1: rule__Configuration__Group_8__1 : rule__Configuration__Group_8__1__Impl ;
    public final void rule__Configuration__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1929:1: ( rule__Configuration__Group_8__1__Impl )
            // InternalCosaDsl.g:1930:2: rule__Configuration__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_8__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_8__1"


    // $ANTLR start "rule__Configuration__Group_8__1__Impl"
    // InternalCosaDsl.g:1936:1: rule__Configuration__Group_8__1__Impl : ( ( rule__Configuration__PortsAssignment_8_1 ) ) ;
    public final void rule__Configuration__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1940:1: ( ( ( rule__Configuration__PortsAssignment_8_1 ) ) )
            // InternalCosaDsl.g:1941:1: ( ( rule__Configuration__PortsAssignment_8_1 ) )
            {
            // InternalCosaDsl.g:1941:1: ( ( rule__Configuration__PortsAssignment_8_1 ) )
            // InternalCosaDsl.g:1942:2: ( rule__Configuration__PortsAssignment_8_1 )
            {
             before(grammarAccess.getConfigurationAccess().getPortsAssignment_8_1()); 
            // InternalCosaDsl.g:1943:2: ( rule__Configuration__PortsAssignment_8_1 )
            // InternalCosaDsl.g:1943:3: rule__Configuration__PortsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__PortsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getPortsAssignment_8_1()); 

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
    // $ANTLR end "rule__Configuration__Group_8__1__Impl"


    // $ANTLR start "rule__Configuration__Group_9__0"
    // InternalCosaDsl.g:1952:1: rule__Configuration__Group_9__0 : rule__Configuration__Group_9__0__Impl rule__Configuration__Group_9__1 ;
    public final void rule__Configuration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1956:1: ( rule__Configuration__Group_9__0__Impl rule__Configuration__Group_9__1 )
            // InternalCosaDsl.g:1957:2: rule__Configuration__Group_9__0__Impl rule__Configuration__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Configuration__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_9__1();

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
    // $ANTLR end "rule__Configuration__Group_9__0"


    // $ANTLR start "rule__Configuration__Group_9__0__Impl"
    // InternalCosaDsl.g:1964:1: rule__Configuration__Group_9__0__Impl : ( ( rule__Configuration__BindingsAssignment_9_0 ) ) ;
    public final void rule__Configuration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1968:1: ( ( ( rule__Configuration__BindingsAssignment_9_0 ) ) )
            // InternalCosaDsl.g:1969:1: ( ( rule__Configuration__BindingsAssignment_9_0 ) )
            {
            // InternalCosaDsl.g:1969:1: ( ( rule__Configuration__BindingsAssignment_9_0 ) )
            // InternalCosaDsl.g:1970:2: ( rule__Configuration__BindingsAssignment_9_0 )
            {
             before(grammarAccess.getConfigurationAccess().getBindingsAssignment_9_0()); 
            // InternalCosaDsl.g:1971:2: ( rule__Configuration__BindingsAssignment_9_0 )
            // InternalCosaDsl.g:1971:3: rule__Configuration__BindingsAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__BindingsAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getBindingsAssignment_9_0()); 

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
    // $ANTLR end "rule__Configuration__Group_9__0__Impl"


    // $ANTLR start "rule__Configuration__Group_9__1"
    // InternalCosaDsl.g:1979:1: rule__Configuration__Group_9__1 : rule__Configuration__Group_9__1__Impl ;
    public final void rule__Configuration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1983:1: ( rule__Configuration__Group_9__1__Impl )
            // InternalCosaDsl.g:1984:2: rule__Configuration__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_9__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_9__1"


    // $ANTLR start "rule__Configuration__Group_9__1__Impl"
    // InternalCosaDsl.g:1990:1: rule__Configuration__Group_9__1__Impl : ( ( rule__Configuration__Group_9_1__0 )* ) ;
    public final void rule__Configuration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:1994:1: ( ( ( rule__Configuration__Group_9_1__0 )* ) )
            // InternalCosaDsl.g:1995:1: ( ( rule__Configuration__Group_9_1__0 )* )
            {
            // InternalCosaDsl.g:1995:1: ( ( rule__Configuration__Group_9_1__0 )* )
            // InternalCosaDsl.g:1996:2: ( rule__Configuration__Group_9_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_9_1()); 
            // InternalCosaDsl.g:1997:2: ( rule__Configuration__Group_9_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCosaDsl.g:1997:3: rule__Configuration__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Configuration__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_9_1()); 

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
    // $ANTLR end "rule__Configuration__Group_9__1__Impl"


    // $ANTLR start "rule__Configuration__Group_9_1__0"
    // InternalCosaDsl.g:2006:1: rule__Configuration__Group_9_1__0 : rule__Configuration__Group_9_1__0__Impl rule__Configuration__Group_9_1__1 ;
    public final void rule__Configuration__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2010:1: ( rule__Configuration__Group_9_1__0__Impl rule__Configuration__Group_9_1__1 )
            // InternalCosaDsl.g:2011:2: rule__Configuration__Group_9_1__0__Impl rule__Configuration__Group_9_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Configuration__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_9_1__1();

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
    // $ANTLR end "rule__Configuration__Group_9_1__0"


    // $ANTLR start "rule__Configuration__Group_9_1__0__Impl"
    // InternalCosaDsl.g:2018:1: rule__Configuration__Group_9_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2022:1: ( ( ',' ) )
            // InternalCosaDsl.g:2023:1: ( ',' )
            {
            // InternalCosaDsl.g:2023:1: ( ',' )
            // InternalCosaDsl.g:2024:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_9_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_9_1_0()); 

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
    // $ANTLR end "rule__Configuration__Group_9_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_9_1__1"
    // InternalCosaDsl.g:2033:1: rule__Configuration__Group_9_1__1 : rule__Configuration__Group_9_1__1__Impl ;
    public final void rule__Configuration__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2037:1: ( rule__Configuration__Group_9_1__1__Impl )
            // InternalCosaDsl.g:2038:2: rule__Configuration__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_9_1__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_9_1__1"


    // $ANTLR start "rule__Configuration__Group_9_1__1__Impl"
    // InternalCosaDsl.g:2044:1: rule__Configuration__Group_9_1__1__Impl : ( ( rule__Configuration__BindingsAssignment_9_1_1 ) ) ;
    public final void rule__Configuration__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2048:1: ( ( ( rule__Configuration__BindingsAssignment_9_1_1 ) ) )
            // InternalCosaDsl.g:2049:1: ( ( rule__Configuration__BindingsAssignment_9_1_1 ) )
            {
            // InternalCosaDsl.g:2049:1: ( ( rule__Configuration__BindingsAssignment_9_1_1 ) )
            // InternalCosaDsl.g:2050:2: ( rule__Configuration__BindingsAssignment_9_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getBindingsAssignment_9_1_1()); 
            // InternalCosaDsl.g:2051:2: ( rule__Configuration__BindingsAssignment_9_1_1 )
            // InternalCosaDsl.g:2051:3: rule__Configuration__BindingsAssignment_9_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__BindingsAssignment_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getBindingsAssignment_9_1_1()); 

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
    // $ANTLR end "rule__Configuration__Group_9_1__1__Impl"


    // $ANTLR start "rule__Configuration__Group_11__0"
    // InternalCosaDsl.g:2060:1: rule__Configuration__Group_11__0 : rule__Configuration__Group_11__0__Impl rule__Configuration__Group_11__1 ;
    public final void rule__Configuration__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2064:1: ( rule__Configuration__Group_11__0__Impl rule__Configuration__Group_11__1 )
            // InternalCosaDsl.g:2065:2: rule__Configuration__Group_11__0__Impl rule__Configuration__Group_11__1
            {
            pushFollow(FOLLOW_9);
            rule__Configuration__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_11__1();

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
    // $ANTLR end "rule__Configuration__Group_11__0"


    // $ANTLR start "rule__Configuration__Group_11__0__Impl"
    // InternalCosaDsl.g:2072:1: rule__Configuration__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2076:1: ( ( ',' ) )
            // InternalCosaDsl.g:2077:1: ( ',' )
            {
            // InternalCosaDsl.g:2077:1: ( ',' )
            // InternalCosaDsl.g:2078:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_11_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__Configuration__Group_11__0__Impl"


    // $ANTLR start "rule__Configuration__Group_11__1"
    // InternalCosaDsl.g:2087:1: rule__Configuration__Group_11__1 : rule__Configuration__Group_11__1__Impl ;
    public final void rule__Configuration__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2091:1: ( rule__Configuration__Group_11__1__Impl )
            // InternalCosaDsl.g:2092:2: rule__Configuration__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_11__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_11__1"


    // $ANTLR start "rule__Configuration__Group_11__1__Impl"
    // InternalCosaDsl.g:2098:1: rule__Configuration__Group_11__1__Impl : ( ( rule__Configuration__AttachementsAssignment_11_1 ) ) ;
    public final void rule__Configuration__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2102:1: ( ( ( rule__Configuration__AttachementsAssignment_11_1 ) ) )
            // InternalCosaDsl.g:2103:1: ( ( rule__Configuration__AttachementsAssignment_11_1 ) )
            {
            // InternalCosaDsl.g:2103:1: ( ( rule__Configuration__AttachementsAssignment_11_1 ) )
            // InternalCosaDsl.g:2104:2: ( rule__Configuration__AttachementsAssignment_11_1 )
            {
             before(grammarAccess.getConfigurationAccess().getAttachementsAssignment_11_1()); 
            // InternalCosaDsl.g:2105:2: ( rule__Configuration__AttachementsAssignment_11_1 )
            // InternalCosaDsl.g:2105:3: rule__Configuration__AttachementsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__AttachementsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAttachementsAssignment_11_1()); 

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
    // $ANTLR end "rule__Configuration__Group_11__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalCosaDsl.g:2114:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2118:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalCosaDsl.g:2119:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalCosaDsl.g:2126:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2130:1: ( ( 'Component' ) )
            // InternalCosaDsl.g:2131:1: ( 'Component' )
            {
            // InternalCosaDsl.g:2131:1: ( 'Component' )
            // InternalCosaDsl.g:2132:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCosaDsl.g:2141:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2145:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalCosaDsl.g:2146:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalCosaDsl.g:2153:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2157:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:2158:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:2158:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalCosaDsl.g:2159:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:2160:2: ( rule__Component__NameAssignment_1 )
            // InternalCosaDsl.g:2160:3: rule__Component__NameAssignment_1
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
    // InternalCosaDsl.g:2168:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2172:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalCosaDsl.g:2173:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:2180:1: rule__Component__Group__2__Impl : ( '={' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2184:1: ( ( '={' ) )
            // InternalCosaDsl.g:2185:1: ( '={' )
            {
            // InternalCosaDsl.g:2185:1: ( '={' )
            // InternalCosaDsl.g:2186:2: '={'
            {
             before(grammarAccess.getComponentAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 

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
    // InternalCosaDsl.g:2195:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2199:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalCosaDsl.g:2200:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCosaDsl.g:2207:1: rule__Component__Group__3__Impl : ( ( rule__Component__PortsAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2211:1: ( ( ( rule__Component__PortsAssignment_3 ) ) )
            // InternalCosaDsl.g:2212:1: ( ( rule__Component__PortsAssignment_3 ) )
            {
            // InternalCosaDsl.g:2212:1: ( ( rule__Component__PortsAssignment_3 ) )
            // InternalCosaDsl.g:2213:2: ( rule__Component__PortsAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_3()); 
            // InternalCosaDsl.g:2214:2: ( rule__Component__PortsAssignment_3 )
            // InternalCosaDsl.g:2214:3: rule__Component__PortsAssignment_3
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
    // InternalCosaDsl.g:2222:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2226:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalCosaDsl.g:2227:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalCosaDsl.g:2234:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2238:1: ( ( ( rule__Component__Group_4__0 )* ) )
            // InternalCosaDsl.g:2239:1: ( ( rule__Component__Group_4__0 )* )
            {
            // InternalCosaDsl.g:2239:1: ( ( rule__Component__Group_4__0 )* )
            // InternalCosaDsl.g:2240:2: ( rule__Component__Group_4__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // InternalCosaDsl.g:2241:2: ( rule__Component__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCosaDsl.g:2241:3: rule__Component__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalCosaDsl.g:2249:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2253:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalCosaDsl.g:2254:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalCosaDsl.g:2261:1: rule__Component__Group__5__Impl : ( ( rule__Component__ServicesAssignment_5 ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2265:1: ( ( ( rule__Component__ServicesAssignment_5 ) ) )
            // InternalCosaDsl.g:2266:1: ( ( rule__Component__ServicesAssignment_5 ) )
            {
            // InternalCosaDsl.g:2266:1: ( ( rule__Component__ServicesAssignment_5 ) )
            // InternalCosaDsl.g:2267:2: ( rule__Component__ServicesAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getServicesAssignment_5()); 
            // InternalCosaDsl.g:2268:2: ( rule__Component__ServicesAssignment_5 )
            // InternalCosaDsl.g:2268:3: rule__Component__ServicesAssignment_5
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
    // InternalCosaDsl.g:2276:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2280:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalCosaDsl.g:2281:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalCosaDsl.g:2288:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2292:1: ( ( ( rule__Component__Group_6__0 )* ) )
            // InternalCosaDsl.g:2293:1: ( ( rule__Component__Group_6__0 )* )
            {
            // InternalCosaDsl.g:2293:1: ( ( rule__Component__Group_6__0 )* )
            // InternalCosaDsl.g:2294:2: ( rule__Component__Group_6__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_6()); 
            // InternalCosaDsl.g:2295:2: ( rule__Component__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCosaDsl.g:2295:3: rule__Component__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Component__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalCosaDsl.g:2303:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2307:1: ( rule__Component__Group__7__Impl )
            // InternalCosaDsl.g:2308:2: rule__Component__Group__7__Impl
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
    // InternalCosaDsl.g:2314:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2318:1: ( ( '}' ) )
            // InternalCosaDsl.g:2319:1: ( '}' )
            {
            // InternalCosaDsl.g:2319:1: ( '}' )
            // InternalCosaDsl.g:2320:2: '}'
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
    // InternalCosaDsl.g:2330:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2334:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // InternalCosaDsl.g:2335:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:2342:1: rule__Component__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2346:1: ( ( ',' ) )
            // InternalCosaDsl.g:2347:1: ( ',' )
            {
            // InternalCosaDsl.g:2347:1: ( ',' )
            // InternalCosaDsl.g:2348:2: ','
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
    // InternalCosaDsl.g:2357:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2361:1: ( rule__Component__Group_4__1__Impl )
            // InternalCosaDsl.g:2362:2: rule__Component__Group_4__1__Impl
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
    // InternalCosaDsl.g:2368:1: rule__Component__Group_4__1__Impl : ( ( rule__Component__PortsAssignment_4_1 ) ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2372:1: ( ( ( rule__Component__PortsAssignment_4_1 ) ) )
            // InternalCosaDsl.g:2373:1: ( ( rule__Component__PortsAssignment_4_1 ) )
            {
            // InternalCosaDsl.g:2373:1: ( ( rule__Component__PortsAssignment_4_1 ) )
            // InternalCosaDsl.g:2374:2: ( rule__Component__PortsAssignment_4_1 )
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_4_1()); 
            // InternalCosaDsl.g:2375:2: ( rule__Component__PortsAssignment_4_1 )
            // InternalCosaDsl.g:2375:3: rule__Component__PortsAssignment_4_1
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
    // InternalCosaDsl.g:2384:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2388:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // InternalCosaDsl.g:2389:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCosaDsl.g:2396:1: rule__Component__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2400:1: ( ( ',' ) )
            // InternalCosaDsl.g:2401:1: ( ',' )
            {
            // InternalCosaDsl.g:2401:1: ( ',' )
            // InternalCosaDsl.g:2402:2: ','
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
    // InternalCosaDsl.g:2411:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2415:1: ( rule__Component__Group_6__1__Impl )
            // InternalCosaDsl.g:2416:2: rule__Component__Group_6__1__Impl
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
    // InternalCosaDsl.g:2422:1: rule__Component__Group_6__1__Impl : ( ( rule__Component__ServicesAssignment_6_1 ) ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2426:1: ( ( ( rule__Component__ServicesAssignment_6_1 ) ) )
            // InternalCosaDsl.g:2427:1: ( ( rule__Component__ServicesAssignment_6_1 ) )
            {
            // InternalCosaDsl.g:2427:1: ( ( rule__Component__ServicesAssignment_6_1 ) )
            // InternalCosaDsl.g:2428:2: ( rule__Component__ServicesAssignment_6_1 )
            {
             before(grammarAccess.getComponentAccess().getServicesAssignment_6_1()); 
            // InternalCosaDsl.g:2429:2: ( rule__Component__ServicesAssignment_6_1 )
            // InternalCosaDsl.g:2429:3: rule__Component__ServicesAssignment_6_1
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
    // InternalCosaDsl.g:2438:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2442:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCosaDsl.g:2443:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
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
    // InternalCosaDsl.g:2450:1: rule__Connector__Group__0__Impl : ( 'Connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2454:1: ( ( 'Connector' ) )
            // InternalCosaDsl.g:2455:1: ( 'Connector' )
            {
            // InternalCosaDsl.g:2455:1: ( 'Connector' )
            // InternalCosaDsl.g:2456:2: 'Connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCosaDsl.g:2465:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2469:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalCosaDsl.g:2470:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
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
    // InternalCosaDsl.g:2477:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2481:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalCosaDsl.g:2482:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalCosaDsl.g:2482:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalCosaDsl.g:2483:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalCosaDsl.g:2484:2: ( rule__Connector__NameAssignment_1 )
            // InternalCosaDsl.g:2484:3: rule__Connector__NameAssignment_1
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
    // InternalCosaDsl.g:2492:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2496:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalCosaDsl.g:2497:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCosaDsl.g:2504:1: rule__Connector__Group__2__Impl : ( '={' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2508:1: ( ( '={' ) )
            // InternalCosaDsl.g:2509:1: ( '={' )
            {
            // InternalCosaDsl.g:2509:1: ( '={' )
            // InternalCosaDsl.g:2510:2: '={'
            {
             before(grammarAccess.getConnectorAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getEqualsSignLeftCurlyBracketKeyword_2()); 

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
    // InternalCosaDsl.g:2519:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2523:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalCosaDsl.g:2524:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCosaDsl.g:2531:1: rule__Connector__Group__3__Impl : ( 'Roles{' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2535:1: ( ( 'Roles{' ) )
            // InternalCosaDsl.g:2536:1: ( 'Roles{' )
            {
            // InternalCosaDsl.g:2536:1: ( 'Roles{' )
            // InternalCosaDsl.g:2537:2: 'Roles{'
            {
             before(grammarAccess.getConnectorAccess().getRolesKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRolesKeyword_3()); 

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
    // InternalCosaDsl.g:2546:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2550:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalCosaDsl.g:2551:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalCosaDsl.g:2558:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__RolesAssignment_4 ) ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2562:1: ( ( ( rule__Connector__RolesAssignment_4 ) ) )
            // InternalCosaDsl.g:2563:1: ( ( rule__Connector__RolesAssignment_4 ) )
            {
            // InternalCosaDsl.g:2563:1: ( ( rule__Connector__RolesAssignment_4 ) )
            // InternalCosaDsl.g:2564:2: ( rule__Connector__RolesAssignment_4 )
            {
             before(grammarAccess.getConnectorAccess().getRolesAssignment_4()); 
            // InternalCosaDsl.g:2565:2: ( rule__Connector__RolesAssignment_4 )
            // InternalCosaDsl.g:2565:3: rule__Connector__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRolesAssignment_4()); 

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
    // InternalCosaDsl.g:2573:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2577:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalCosaDsl.g:2578:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalCosaDsl.g:2585:1: rule__Connector__Group__5__Impl : ( ',' ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2589:1: ( ( ',' ) )
            // InternalCosaDsl.g:2590:1: ( ',' )
            {
            // InternalCosaDsl.g:2590:1: ( ',' )
            // InternalCosaDsl.g:2591:2: ','
            {
             before(grammarAccess.getConnectorAccess().getCommaKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getCommaKeyword_5()); 

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
    // InternalCosaDsl.g:2600:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl rule__Connector__Group__7 ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2604:1: ( rule__Connector__Group__6__Impl rule__Connector__Group__7 )
            // InternalCosaDsl.g:2605:2: rule__Connector__Group__6__Impl rule__Connector__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Connector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__7();

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
    // InternalCosaDsl.g:2612:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__RolesAssignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2616:1: ( ( ( rule__Connector__RolesAssignment_6 ) ) )
            // InternalCosaDsl.g:2617:1: ( ( rule__Connector__RolesAssignment_6 ) )
            {
            // InternalCosaDsl.g:2617:1: ( ( rule__Connector__RolesAssignment_6 ) )
            // InternalCosaDsl.g:2618:2: ( rule__Connector__RolesAssignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getRolesAssignment_6()); 
            // InternalCosaDsl.g:2619:2: ( rule__Connector__RolesAssignment_6 )
            // InternalCosaDsl.g:2619:3: rule__Connector__RolesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RolesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRolesAssignment_6()); 

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


    // $ANTLR start "rule__Connector__Group__7"
    // InternalCosaDsl.g:2627:1: rule__Connector__Group__7 : rule__Connector__Group__7__Impl rule__Connector__Group__8 ;
    public final void rule__Connector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2631:1: ( rule__Connector__Group__7__Impl rule__Connector__Group__8 )
            // InternalCosaDsl.g:2632:2: rule__Connector__Group__7__Impl rule__Connector__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Connector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__8();

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
    // $ANTLR end "rule__Connector__Group__7"


    // $ANTLR start "rule__Connector__Group__7__Impl"
    // InternalCosaDsl.g:2639:1: rule__Connector__Group__7__Impl : ( '}' ) ;
    public final void rule__Connector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2643:1: ( ( '}' ) )
            // InternalCosaDsl.g:2644:1: ( '}' )
            {
            // InternalCosaDsl.g:2644:1: ( '}' )
            // InternalCosaDsl.g:2645:2: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Connector__Group__7__Impl"


    // $ANTLR start "rule__Connector__Group__8"
    // InternalCosaDsl.g:2654:1: rule__Connector__Group__8 : rule__Connector__Group__8__Impl ;
    public final void rule__Connector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2658:1: ( rule__Connector__Group__8__Impl )
            // InternalCosaDsl.g:2659:2: rule__Connector__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__8__Impl();

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
    // $ANTLR end "rule__Connector__Group__8"


    // $ANTLR start "rule__Connector__Group__8__Impl"
    // InternalCosaDsl.g:2665:1: rule__Connector__Group__8__Impl : ( '}' ) ;
    public final void rule__Connector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2669:1: ( ( '}' ) )
            // InternalCosaDsl.g:2670:1: ( '}' )
            {
            // InternalCosaDsl.g:2670:1: ( '}' )
            // InternalCosaDsl.g:2671:2: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Connector__Group__8__Impl"


    // $ANTLR start "rule__Port_Impl__Group__0"
    // InternalCosaDsl.g:2681:1: rule__Port_Impl__Group__0 : rule__Port_Impl__Group__0__Impl rule__Port_Impl__Group__1 ;
    public final void rule__Port_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2685:1: ( rule__Port_Impl__Group__0__Impl rule__Port_Impl__Group__1 )
            // InternalCosaDsl.g:2686:2: rule__Port_Impl__Group__0__Impl rule__Port_Impl__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCosaDsl.g:2693:1: rule__Port_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Port_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2697:1: ( ( () ) )
            // InternalCosaDsl.g:2698:1: ( () )
            {
            // InternalCosaDsl.g:2698:1: ( () )
            // InternalCosaDsl.g:2699:2: ()
            {
             before(grammarAccess.getPort_ImplAccess().getPortAction_0()); 
            // InternalCosaDsl.g:2700:2: ()
            // InternalCosaDsl.g:2700:3: 
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
    // InternalCosaDsl.g:2708:1: rule__Port_Impl__Group__1 : rule__Port_Impl__Group__1__Impl rule__Port_Impl__Group__2 ;
    public final void rule__Port_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2712:1: ( rule__Port_Impl__Group__1__Impl rule__Port_Impl__Group__2 )
            // InternalCosaDsl.g:2713:2: rule__Port_Impl__Group__1__Impl rule__Port_Impl__Group__2
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
    // InternalCosaDsl.g:2720:1: rule__Port_Impl__Group__1__Impl : ( 'Port' ) ;
    public final void rule__Port_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2724:1: ( ( 'Port' ) )
            // InternalCosaDsl.g:2725:1: ( 'Port' )
            {
            // InternalCosaDsl.g:2725:1: ( 'Port' )
            // InternalCosaDsl.g:2726:2: 'Port'
            {
             before(grammarAccess.getPort_ImplAccess().getPortKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCosaDsl.g:2735:1: rule__Port_Impl__Group__2 : rule__Port_Impl__Group__2__Impl ;
    public final void rule__Port_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2739:1: ( rule__Port_Impl__Group__2__Impl )
            // InternalCosaDsl.g:2740:2: rule__Port_Impl__Group__2__Impl
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
    // InternalCosaDsl.g:2746:1: rule__Port_Impl__Group__2__Impl : ( ( rule__Port_Impl__NameAssignment_2 ) ) ;
    public final void rule__Port_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2750:1: ( ( ( rule__Port_Impl__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:2751:1: ( ( rule__Port_Impl__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:2751:1: ( ( rule__Port_Impl__NameAssignment_2 ) )
            // InternalCosaDsl.g:2752:2: ( rule__Port_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getPort_ImplAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:2753:2: ( rule__Port_Impl__NameAssignment_2 )
            // InternalCosaDsl.g:2753:3: rule__Port_Impl__NameAssignment_2
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
    // InternalCosaDsl.g:2762:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2766:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalCosaDsl.g:2767:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCosaDsl.g:2774:1: rule__Binding__Group__0__Impl : ( 'Binding' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2778:1: ( ( 'Binding' ) )
            // InternalCosaDsl.g:2779:1: ( 'Binding' )
            {
            // InternalCosaDsl.g:2779:1: ( 'Binding' )
            // InternalCosaDsl.g:2780:2: 'Binding'
            {
             before(grammarAccess.getBindingAccess().getBindingKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCosaDsl.g:2789:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2793:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalCosaDsl.g:2794:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:2801:1: rule__Binding__Group__1__Impl : ( '{' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2805:1: ( ( '{' ) )
            // InternalCosaDsl.g:2806:1: ( '{' )
            {
            // InternalCosaDsl.g:2806:1: ( '{' )
            // InternalCosaDsl.g:2807:2: '{'
            {
             before(grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalCosaDsl.g:2816:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2820:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalCosaDsl.g:2821:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:2828:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__PortProvidedAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2832:1: ( ( ( rule__Binding__PortProvidedAssignment_2 ) ) )
            // InternalCosaDsl.g:2833:1: ( ( rule__Binding__PortProvidedAssignment_2 ) )
            {
            // InternalCosaDsl.g:2833:1: ( ( rule__Binding__PortProvidedAssignment_2 ) )
            // InternalCosaDsl.g:2834:2: ( rule__Binding__PortProvidedAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getPortProvidedAssignment_2()); 
            // InternalCosaDsl.g:2835:2: ( rule__Binding__PortProvidedAssignment_2 )
            // InternalCosaDsl.g:2835:3: rule__Binding__PortProvidedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__PortProvidedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getPortProvidedAssignment_2()); 

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
    // InternalCosaDsl.g:2843:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2847:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalCosaDsl.g:2848:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalCosaDsl.g:2855:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__PortRequiredAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2859:1: ( ( ( rule__Binding__PortRequiredAssignment_3 ) ) )
            // InternalCosaDsl.g:2860:1: ( ( rule__Binding__PortRequiredAssignment_3 ) )
            {
            // InternalCosaDsl.g:2860:1: ( ( rule__Binding__PortRequiredAssignment_3 ) )
            // InternalCosaDsl.g:2861:2: ( rule__Binding__PortRequiredAssignment_3 )
            {
             before(grammarAccess.getBindingAccess().getPortRequiredAssignment_3()); 
            // InternalCosaDsl.g:2862:2: ( rule__Binding__PortRequiredAssignment_3 )
            // InternalCosaDsl.g:2862:3: rule__Binding__PortRequiredAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binding__PortRequiredAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getPortRequiredAssignment_3()); 

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
    // InternalCosaDsl.g:2870:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2874:1: ( rule__Binding__Group__4__Impl )
            // InternalCosaDsl.g:2875:2: rule__Binding__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__4__Impl();

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
    // InternalCosaDsl.g:2881:1: rule__Binding__Group__4__Impl : ( '}' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2885:1: ( ( '}' ) )
            // InternalCosaDsl.g:2886:1: ( '}' )
            {
            // InternalCosaDsl.g:2886:1: ( '}' )
            // InternalCosaDsl.g:2887:2: '}'
            {
             before(grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Attachement__Group__0"
    // InternalCosaDsl.g:2897:1: rule__Attachement__Group__0 : rule__Attachement__Group__0__Impl rule__Attachement__Group__1 ;
    public final void rule__Attachement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2901:1: ( rule__Attachement__Group__0__Impl rule__Attachement__Group__1 )
            // InternalCosaDsl.g:2902:2: rule__Attachement__Group__0__Impl rule__Attachement__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCosaDsl.g:2909:1: rule__Attachement__Group__0__Impl : ( 'Attachement' ) ;
    public final void rule__Attachement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2913:1: ( ( 'Attachement' ) )
            // InternalCosaDsl.g:2914:1: ( 'Attachement' )
            {
            // InternalCosaDsl.g:2914:1: ( 'Attachement' )
            // InternalCosaDsl.g:2915:2: 'Attachement'
            {
             before(grammarAccess.getAttachementAccess().getAttachementKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCosaDsl.g:2924:1: rule__Attachement__Group__1 : rule__Attachement__Group__1__Impl rule__Attachement__Group__2 ;
    public final void rule__Attachement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2928:1: ( rule__Attachement__Group__1__Impl rule__Attachement__Group__2 )
            // InternalCosaDsl.g:2929:2: rule__Attachement__Group__1__Impl rule__Attachement__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalCosaDsl.g:2936:1: rule__Attachement__Group__1__Impl : ( ':{' ) ;
    public final void rule__Attachement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2940:1: ( ( ':{' ) )
            // InternalCosaDsl.g:2941:1: ( ':{' )
            {
            // InternalCosaDsl.g:2941:1: ( ':{' )
            // InternalCosaDsl.g:2942:2: ':{'
            {
             before(grammarAccess.getAttachementAccess().getColonLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getColonLeftCurlyBracketKeyword_1()); 

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
    // InternalCosaDsl.g:2951:1: rule__Attachement__Group__2 : rule__Attachement__Group__2__Impl rule__Attachement__Group__3 ;
    public final void rule__Attachement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2955:1: ( rule__Attachement__Group__2__Impl rule__Attachement__Group__3 )
            // InternalCosaDsl.g:2956:2: rule__Attachement__Group__2__Impl rule__Attachement__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCosaDsl.g:2963:1: rule__Attachement__Group__2__Impl : ( ( rule__Attachement__RoleAssignment_2 ) ) ;
    public final void rule__Attachement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2967:1: ( ( ( rule__Attachement__RoleAssignment_2 ) ) )
            // InternalCosaDsl.g:2968:1: ( ( rule__Attachement__RoleAssignment_2 ) )
            {
            // InternalCosaDsl.g:2968:1: ( ( rule__Attachement__RoleAssignment_2 ) )
            // InternalCosaDsl.g:2969:2: ( rule__Attachement__RoleAssignment_2 )
            {
             before(grammarAccess.getAttachementAccess().getRoleAssignment_2()); 
            // InternalCosaDsl.g:2970:2: ( rule__Attachement__RoleAssignment_2 )
            // InternalCosaDsl.g:2970:3: rule__Attachement__RoleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__RoleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttachementAccess().getRoleAssignment_2()); 

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
    // InternalCosaDsl.g:2978:1: rule__Attachement__Group__3 : rule__Attachement__Group__3__Impl rule__Attachement__Group__4 ;
    public final void rule__Attachement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2982:1: ( rule__Attachement__Group__3__Impl rule__Attachement__Group__4 )
            // InternalCosaDsl.g:2983:2: rule__Attachement__Group__3__Impl rule__Attachement__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:2990:1: rule__Attachement__Group__3__Impl : ( 'to' ) ;
    public final void rule__Attachement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:2994:1: ( ( 'to' ) )
            // InternalCosaDsl.g:2995:1: ( 'to' )
            {
            // InternalCosaDsl.g:2995:1: ( 'to' )
            // InternalCosaDsl.g:2996:2: 'to'
            {
             before(grammarAccess.getAttachementAccess().getToKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getToKeyword_3()); 

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
    // InternalCosaDsl.g:3005:1: rule__Attachement__Group__4 : rule__Attachement__Group__4__Impl rule__Attachement__Group__5 ;
    public final void rule__Attachement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3009:1: ( rule__Attachement__Group__4__Impl rule__Attachement__Group__5 )
            // InternalCosaDsl.g:3010:2: rule__Attachement__Group__4__Impl rule__Attachement__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalCosaDsl.g:3017:1: rule__Attachement__Group__4__Impl : ( ( rule__Attachement__PortAssignment_4 ) ) ;
    public final void rule__Attachement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3021:1: ( ( ( rule__Attachement__PortAssignment_4 ) ) )
            // InternalCosaDsl.g:3022:1: ( ( rule__Attachement__PortAssignment_4 ) )
            {
            // InternalCosaDsl.g:3022:1: ( ( rule__Attachement__PortAssignment_4 ) )
            // InternalCosaDsl.g:3023:2: ( rule__Attachement__PortAssignment_4 )
            {
             before(grammarAccess.getAttachementAccess().getPortAssignment_4()); 
            // InternalCosaDsl.g:3024:2: ( rule__Attachement__PortAssignment_4 )
            // InternalCosaDsl.g:3024:3: rule__Attachement__PortAssignment_4
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
    // InternalCosaDsl.g:3032:1: rule__Attachement__Group__5 : rule__Attachement__Group__5__Impl ;
    public final void rule__Attachement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3036:1: ( rule__Attachement__Group__5__Impl )
            // InternalCosaDsl.g:3037:2: rule__Attachement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attachement__Group__5__Impl();

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
    // InternalCosaDsl.g:3043:1: rule__Attachement__Group__5__Impl : ( '}' ) ;
    public final void rule__Attachement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3047:1: ( ( '}' ) )
            // InternalCosaDsl.g:3048:1: ( '}' )
            {
            // InternalCosaDsl.g:3048:1: ( '}' )
            // InternalCosaDsl.g:3049:2: '}'
            {
             before(grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttachementAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Service_Impl__Group__0"
    // InternalCosaDsl.g:3059:1: rule__Service_Impl__Group__0 : rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1 ;
    public final void rule__Service_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3063:1: ( rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1 )
            // InternalCosaDsl.g:3064:2: rule__Service_Impl__Group__0__Impl rule__Service_Impl__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCosaDsl.g:3071:1: rule__Service_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Service_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3075:1: ( ( () ) )
            // InternalCosaDsl.g:3076:1: ( () )
            {
            // InternalCosaDsl.g:3076:1: ( () )
            // InternalCosaDsl.g:3077:2: ()
            {
             before(grammarAccess.getService_ImplAccess().getServiceAction_0()); 
            // InternalCosaDsl.g:3078:2: ()
            // InternalCosaDsl.g:3078:3: 
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
    // InternalCosaDsl.g:3086:1: rule__Service_Impl__Group__1 : rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2 ;
    public final void rule__Service_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3090:1: ( rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2 )
            // InternalCosaDsl.g:3091:2: rule__Service_Impl__Group__1__Impl rule__Service_Impl__Group__2
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
    // InternalCosaDsl.g:3098:1: rule__Service_Impl__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3102:1: ( ( 'Service' ) )
            // InternalCosaDsl.g:3103:1: ( 'Service' )
            {
            // InternalCosaDsl.g:3103:1: ( 'Service' )
            // InternalCosaDsl.g:3104:2: 'Service'
            {
             before(grammarAccess.getService_ImplAccess().getServiceKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCosaDsl.g:3113:1: rule__Service_Impl__Group__2 : rule__Service_Impl__Group__2__Impl ;
    public final void rule__Service_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3117:1: ( rule__Service_Impl__Group__2__Impl )
            // InternalCosaDsl.g:3118:2: rule__Service_Impl__Group__2__Impl
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
    // InternalCosaDsl.g:3124:1: rule__Service_Impl__Group__2__Impl : ( ( rule__Service_Impl__NameAssignment_2 ) ) ;
    public final void rule__Service_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3128:1: ( ( ( rule__Service_Impl__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3129:1: ( ( rule__Service_Impl__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3129:1: ( ( rule__Service_Impl__NameAssignment_2 ) )
            // InternalCosaDsl.g:3130:2: ( rule__Service_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getService_ImplAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3131:2: ( rule__Service_Impl__NameAssignment_2 )
            // InternalCosaDsl.g:3131:3: rule__Service_Impl__NameAssignment_2
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
    // InternalCosaDsl.g:3140:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3144:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalCosaDsl.g:3145:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCosaDsl.g:3152:1: rule__RequiredService__Group__0__Impl : ( () ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3156:1: ( ( () ) )
            // InternalCosaDsl.g:3157:1: ( () )
            {
            // InternalCosaDsl.g:3157:1: ( () )
            // InternalCosaDsl.g:3158:2: ()
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceAction_0()); 
            // InternalCosaDsl.g:3159:2: ()
            // InternalCosaDsl.g:3159:3: 
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
    // InternalCosaDsl.g:3167:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3171:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalCosaDsl.g:3172:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
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
    // InternalCosaDsl.g:3179:1: rule__RequiredService__Group__1__Impl : ( 'RequiredService' ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3183:1: ( ( 'RequiredService' ) )
            // InternalCosaDsl.g:3184:1: ( 'RequiredService' )
            {
            // InternalCosaDsl.g:3184:1: ( 'RequiredService' )
            // InternalCosaDsl.g:3185:2: 'RequiredService'
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCosaDsl.g:3194:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3198:1: ( rule__RequiredService__Group__2__Impl )
            // InternalCosaDsl.g:3199:2: rule__RequiredService__Group__2__Impl
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
    // InternalCosaDsl.g:3205:1: rule__RequiredService__Group__2__Impl : ( ( rule__RequiredService__NameAssignment_2 ) ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3209:1: ( ( ( rule__RequiredService__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3210:1: ( ( rule__RequiredService__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3210:1: ( ( rule__RequiredService__NameAssignment_2 ) )
            // InternalCosaDsl.g:3211:2: ( rule__RequiredService__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3212:2: ( rule__RequiredService__NameAssignment_2 )
            // InternalCosaDsl.g:3212:3: rule__RequiredService__NameAssignment_2
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
    // InternalCosaDsl.g:3221:1: rule__ProvidedService__Group__0 : rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 ;
    public final void rule__ProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3225:1: ( rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 )
            // InternalCosaDsl.g:3226:2: rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCosaDsl.g:3233:1: rule__ProvidedService__Group__0__Impl : ( () ) ;
    public final void rule__ProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3237:1: ( ( () ) )
            // InternalCosaDsl.g:3238:1: ( () )
            {
            // InternalCosaDsl.g:3238:1: ( () )
            // InternalCosaDsl.g:3239:2: ()
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceAction_0()); 
            // InternalCosaDsl.g:3240:2: ()
            // InternalCosaDsl.g:3240:3: 
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
    // InternalCosaDsl.g:3248:1: rule__ProvidedService__Group__1 : rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 ;
    public final void rule__ProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3252:1: ( rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 )
            // InternalCosaDsl.g:3253:2: rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2
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
    // InternalCosaDsl.g:3260:1: rule__ProvidedService__Group__1__Impl : ( 'ProvidedService' ) ;
    public final void rule__ProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3264:1: ( ( 'ProvidedService' ) )
            // InternalCosaDsl.g:3265:1: ( 'ProvidedService' )
            {
            // InternalCosaDsl.g:3265:1: ( 'ProvidedService' )
            // InternalCosaDsl.g:3266:2: 'ProvidedService'
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCosaDsl.g:3275:1: rule__ProvidedService__Group__2 : rule__ProvidedService__Group__2__Impl ;
    public final void rule__ProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3279:1: ( rule__ProvidedService__Group__2__Impl )
            // InternalCosaDsl.g:3280:2: rule__ProvidedService__Group__2__Impl
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
    // InternalCosaDsl.g:3286:1: rule__ProvidedService__Group__2__Impl : ( ( rule__ProvidedService__NameAssignment_2 ) ) ;
    public final void rule__ProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3290:1: ( ( ( rule__ProvidedService__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3291:1: ( ( rule__ProvidedService__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3291:1: ( ( rule__ProvidedService__NameAssignment_2 ) )
            // InternalCosaDsl.g:3292:2: ( rule__ProvidedService__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedServiceAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3293:2: ( rule__ProvidedService__NameAssignment_2 )
            // InternalCosaDsl.g:3293:3: rule__ProvidedService__NameAssignment_2
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
    // InternalCosaDsl.g:3302:1: rule__Role_Impl__Group__0 : rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 ;
    public final void rule__Role_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3306:1: ( rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1 )
            // InternalCosaDsl.g:3307:2: rule__Role_Impl__Group__0__Impl rule__Role_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCosaDsl.g:3314:1: rule__Role_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Role_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3318:1: ( ( () ) )
            // InternalCosaDsl.g:3319:1: ( () )
            {
            // InternalCosaDsl.g:3319:1: ( () )
            // InternalCosaDsl.g:3320:2: ()
            {
             before(grammarAccess.getRole_ImplAccess().getRoleAction_0()); 
            // InternalCosaDsl.g:3321:2: ()
            // InternalCosaDsl.g:3321:3: 
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
    // InternalCosaDsl.g:3329:1: rule__Role_Impl__Group__1 : rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 ;
    public final void rule__Role_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3333:1: ( rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2 )
            // InternalCosaDsl.g:3334:2: rule__Role_Impl__Group__1__Impl rule__Role_Impl__Group__2
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
    // InternalCosaDsl.g:3341:1: rule__Role_Impl__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3345:1: ( ( 'Role' ) )
            // InternalCosaDsl.g:3346:1: ( 'Role' )
            {
            // InternalCosaDsl.g:3346:1: ( 'Role' )
            // InternalCosaDsl.g:3347:2: 'Role'
            {
             before(grammarAccess.getRole_ImplAccess().getRoleKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCosaDsl.g:3356:1: rule__Role_Impl__Group__2 : rule__Role_Impl__Group__2__Impl ;
    public final void rule__Role_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3360:1: ( rule__Role_Impl__Group__2__Impl )
            // InternalCosaDsl.g:3361:2: rule__Role_Impl__Group__2__Impl
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
    // InternalCosaDsl.g:3367:1: rule__Role_Impl__Group__2__Impl : ( ( rule__Role_Impl__NameAssignment_2 ) ) ;
    public final void rule__Role_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3371:1: ( ( ( rule__Role_Impl__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3372:1: ( ( rule__Role_Impl__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3372:1: ( ( rule__Role_Impl__NameAssignment_2 ) )
            // InternalCosaDsl.g:3373:2: ( rule__Role_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getRole_ImplAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3374:2: ( rule__Role_Impl__NameAssignment_2 )
            // InternalCosaDsl.g:3374:3: rule__Role_Impl__NameAssignment_2
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
    // InternalCosaDsl.g:3383:1: rule__RequiredRole__Group__0 : rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 ;
    public final void rule__RequiredRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3387:1: ( rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1 )
            // InternalCosaDsl.g:3388:2: rule__RequiredRole__Group__0__Impl rule__RequiredRole__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCosaDsl.g:3395:1: rule__RequiredRole__Group__0__Impl : ( () ) ;
    public final void rule__RequiredRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3399:1: ( ( () ) )
            // InternalCosaDsl.g:3400:1: ( () )
            {
            // InternalCosaDsl.g:3400:1: ( () )
            // InternalCosaDsl.g:3401:2: ()
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleAction_0()); 
            // InternalCosaDsl.g:3402:2: ()
            // InternalCosaDsl.g:3402:3: 
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
    // InternalCosaDsl.g:3410:1: rule__RequiredRole__Group__1 : rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 ;
    public final void rule__RequiredRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3414:1: ( rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2 )
            // InternalCosaDsl.g:3415:2: rule__RequiredRole__Group__1__Impl rule__RequiredRole__Group__2
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
    // InternalCosaDsl.g:3422:1: rule__RequiredRole__Group__1__Impl : ( 'RequiredRole' ) ;
    public final void rule__RequiredRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3426:1: ( ( 'RequiredRole' ) )
            // InternalCosaDsl.g:3427:1: ( 'RequiredRole' )
            {
            // InternalCosaDsl.g:3427:1: ( 'RequiredRole' )
            // InternalCosaDsl.g:3428:2: 'RequiredRole'
            {
             before(grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCosaDsl.g:3437:1: rule__RequiredRole__Group__2 : rule__RequiredRole__Group__2__Impl ;
    public final void rule__RequiredRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3441:1: ( rule__RequiredRole__Group__2__Impl )
            // InternalCosaDsl.g:3442:2: rule__RequiredRole__Group__2__Impl
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
    // InternalCosaDsl.g:3448:1: rule__RequiredRole__Group__2__Impl : ( ( rule__RequiredRole__NameAssignment_2 ) ) ;
    public final void rule__RequiredRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3452:1: ( ( ( rule__RequiredRole__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3453:1: ( ( rule__RequiredRole__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3453:1: ( ( rule__RequiredRole__NameAssignment_2 ) )
            // InternalCosaDsl.g:3454:2: ( rule__RequiredRole__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredRoleAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3455:2: ( rule__RequiredRole__NameAssignment_2 )
            // InternalCosaDsl.g:3455:3: rule__RequiredRole__NameAssignment_2
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
    // InternalCosaDsl.g:3464:1: rule__ProvidedRole__Group__0 : rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 ;
    public final void rule__ProvidedRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3468:1: ( rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1 )
            // InternalCosaDsl.g:3469:2: rule__ProvidedRole__Group__0__Impl rule__ProvidedRole__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCosaDsl.g:3476:1: rule__ProvidedRole__Group__0__Impl : ( () ) ;
    public final void rule__ProvidedRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3480:1: ( ( () ) )
            // InternalCosaDsl.g:3481:1: ( () )
            {
            // InternalCosaDsl.g:3481:1: ( () )
            // InternalCosaDsl.g:3482:2: ()
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleAction_0()); 
            // InternalCosaDsl.g:3483:2: ()
            // InternalCosaDsl.g:3483:3: 
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
    // InternalCosaDsl.g:3491:1: rule__ProvidedRole__Group__1 : rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 ;
    public final void rule__ProvidedRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3495:1: ( rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2 )
            // InternalCosaDsl.g:3496:2: rule__ProvidedRole__Group__1__Impl rule__ProvidedRole__Group__2
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
    // InternalCosaDsl.g:3503:1: rule__ProvidedRole__Group__1__Impl : ( 'ProvidedRole' ) ;
    public final void rule__ProvidedRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3507:1: ( ( 'ProvidedRole' ) )
            // InternalCosaDsl.g:3508:1: ( 'ProvidedRole' )
            {
            // InternalCosaDsl.g:3508:1: ( 'ProvidedRole' )
            // InternalCosaDsl.g:3509:2: 'ProvidedRole'
            {
             before(grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCosaDsl.g:3518:1: rule__ProvidedRole__Group__2 : rule__ProvidedRole__Group__2__Impl ;
    public final void rule__ProvidedRole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3522:1: ( rule__ProvidedRole__Group__2__Impl )
            // InternalCosaDsl.g:3523:2: rule__ProvidedRole__Group__2__Impl
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
    // InternalCosaDsl.g:3529:1: rule__ProvidedRole__Group__2__Impl : ( ( rule__ProvidedRole__NameAssignment_2 ) ) ;
    public final void rule__ProvidedRole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3533:1: ( ( ( rule__ProvidedRole__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3534:1: ( ( rule__ProvidedRole__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3534:1: ( ( rule__ProvidedRole__NameAssignment_2 ) )
            // InternalCosaDsl.g:3535:2: ( rule__ProvidedRole__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedRoleAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3536:2: ( rule__ProvidedRole__NameAssignment_2 )
            // InternalCosaDsl.g:3536:3: rule__ProvidedRole__NameAssignment_2
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


    // $ANTLR start "rule__RequiredPort__Group__0"
    // InternalCosaDsl.g:3545:1: rule__RequiredPort__Group__0 : rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1 ;
    public final void rule__RequiredPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3549:1: ( rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1 )
            // InternalCosaDsl.g:3550:2: rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalCosaDsl.g:3557:1: rule__RequiredPort__Group__0__Impl : ( () ) ;
    public final void rule__RequiredPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3561:1: ( ( () ) )
            // InternalCosaDsl.g:3562:1: ( () )
            {
            // InternalCosaDsl.g:3562:1: ( () )
            // InternalCosaDsl.g:3563:2: ()
            {
             before(grammarAccess.getRequiredPortAccess().getRequiredPortAction_0()); 
            // InternalCosaDsl.g:3564:2: ()
            // InternalCosaDsl.g:3564:3: 
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
    // InternalCosaDsl.g:3572:1: rule__RequiredPort__Group__1 : rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2 ;
    public final void rule__RequiredPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3576:1: ( rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2 )
            // InternalCosaDsl.g:3577:2: rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2
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
    // InternalCosaDsl.g:3584:1: rule__RequiredPort__Group__1__Impl : ( 'RequiredPort' ) ;
    public final void rule__RequiredPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3588:1: ( ( 'RequiredPort' ) )
            // InternalCosaDsl.g:3589:1: ( 'RequiredPort' )
            {
            // InternalCosaDsl.g:3589:1: ( 'RequiredPort' )
            // InternalCosaDsl.g:3590:2: 'RequiredPort'
            {
             before(grammarAccess.getRequiredPortAccess().getRequiredPortKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCosaDsl.g:3599:1: rule__RequiredPort__Group__2 : rule__RequiredPort__Group__2__Impl ;
    public final void rule__RequiredPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3603:1: ( rule__RequiredPort__Group__2__Impl )
            // InternalCosaDsl.g:3604:2: rule__RequiredPort__Group__2__Impl
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
    // InternalCosaDsl.g:3610:1: rule__RequiredPort__Group__2__Impl : ( ( rule__RequiredPort__NameAssignment_2 ) ) ;
    public final void rule__RequiredPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3614:1: ( ( ( rule__RequiredPort__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3615:1: ( ( rule__RequiredPort__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3615:1: ( ( rule__RequiredPort__NameAssignment_2 ) )
            // InternalCosaDsl.g:3616:2: ( rule__RequiredPort__NameAssignment_2 )
            {
             before(grammarAccess.getRequiredPortAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3617:2: ( rule__RequiredPort__NameAssignment_2 )
            // InternalCosaDsl.g:3617:3: rule__RequiredPort__NameAssignment_2
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
    // InternalCosaDsl.g:3626:1: rule__ProvidedPort__Group__0 : rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1 ;
    public final void rule__ProvidedPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3630:1: ( rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1 )
            // InternalCosaDsl.g:3631:2: rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCosaDsl.g:3638:1: rule__ProvidedPort__Group__0__Impl : ( () ) ;
    public final void rule__ProvidedPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3642:1: ( ( () ) )
            // InternalCosaDsl.g:3643:1: ( () )
            {
            // InternalCosaDsl.g:3643:1: ( () )
            // InternalCosaDsl.g:3644:2: ()
            {
             before(grammarAccess.getProvidedPortAccess().getProvidedPortAction_0()); 
            // InternalCosaDsl.g:3645:2: ()
            // InternalCosaDsl.g:3645:3: 
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
    // InternalCosaDsl.g:3653:1: rule__ProvidedPort__Group__1 : rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2 ;
    public final void rule__ProvidedPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3657:1: ( rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2 )
            // InternalCosaDsl.g:3658:2: rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2
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
    // InternalCosaDsl.g:3665:1: rule__ProvidedPort__Group__1__Impl : ( 'ProvidedPort' ) ;
    public final void rule__ProvidedPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3669:1: ( ( 'ProvidedPort' ) )
            // InternalCosaDsl.g:3670:1: ( 'ProvidedPort' )
            {
            // InternalCosaDsl.g:3670:1: ( 'ProvidedPort' )
            // InternalCosaDsl.g:3671:2: 'ProvidedPort'
            {
             before(grammarAccess.getProvidedPortAccess().getProvidedPortKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCosaDsl.g:3680:1: rule__ProvidedPort__Group__2 : rule__ProvidedPort__Group__2__Impl ;
    public final void rule__ProvidedPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3684:1: ( rule__ProvidedPort__Group__2__Impl )
            // InternalCosaDsl.g:3685:2: rule__ProvidedPort__Group__2__Impl
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
    // InternalCosaDsl.g:3691:1: rule__ProvidedPort__Group__2__Impl : ( ( rule__ProvidedPort__NameAssignment_2 ) ) ;
    public final void rule__ProvidedPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3695:1: ( ( ( rule__ProvidedPort__NameAssignment_2 ) ) )
            // InternalCosaDsl.g:3696:1: ( ( rule__ProvidedPort__NameAssignment_2 ) )
            {
            // InternalCosaDsl.g:3696:1: ( ( rule__ProvidedPort__NameAssignment_2 ) )
            // InternalCosaDsl.g:3697:2: ( rule__ProvidedPort__NameAssignment_2 )
            {
             before(grammarAccess.getProvidedPortAccess().getNameAssignment_2()); 
            // InternalCosaDsl.g:3698:2: ( rule__ProvidedPort__NameAssignment_2 )
            // InternalCosaDsl.g:3698:3: rule__ProvidedPort__NameAssignment_2
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


    // $ANTLR start "rule__CompositeConfiguration__NameAssignment_1"
    // InternalCosaDsl.g:3707:1: rule__CompositeConfiguration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3711:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:3712:2: ( ruleEString )
            {
            // InternalCosaDsl.g:3712:2: ( ruleEString )
            // InternalCosaDsl.g:3713:3: ruleEString
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


    // $ANTLR start "rule__CompositeConfiguration__ComponentsAssignment_3"
    // InternalCosaDsl.g:3722:1: rule__CompositeConfiguration__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__CompositeConfiguration__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3726:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:3727:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:3727:2: ( ruleComponent )
            // InternalCosaDsl.g:3728:3: ruleComponent
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__ComponentsAssignment_3"


    // $ANTLR start "rule__CompositeConfiguration__ComponentsAssignment_4_1"
    // InternalCosaDsl.g:3737:1: rule__CompositeConfiguration__ComponentsAssignment_4_1 : ( ruleComponent ) ;
    public final void rule__CompositeConfiguration__ComponentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3741:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:3742:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:3742:2: ( ruleComponent )
            // InternalCosaDsl.g:3743:3: ruleComponent
            {
             before(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__ComponentsAssignment_4_1"


    // $ANTLR start "rule__CompositeConfiguration__ConnectorsAssignment_5"
    // InternalCosaDsl.g:3752:1: rule__CompositeConfiguration__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__CompositeConfiguration__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3756:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:3757:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:3757:2: ( ruleConnector )
            // InternalCosaDsl.g:3758:3: ruleConnector
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__ConnectorsAssignment_5"


    // $ANTLR start "rule__CompositeConfiguration__ConnectorsAssignment_6_1"
    // InternalCosaDsl.g:3767:1: rule__CompositeConfiguration__ConnectorsAssignment_6_1 : ( ruleConnector ) ;
    public final void rule__CompositeConfiguration__ConnectorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3771:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:3772:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:3772:2: ( ruleConnector )
            // InternalCosaDsl.g:3773:3: ruleConnector
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__ConnectorsAssignment_6_1"


    // $ANTLR start "rule__CompositeConfiguration__PortsAssignment_7"
    // InternalCosaDsl.g:3782:1: rule__CompositeConfiguration__PortsAssignment_7 : ( rulePort ) ;
    public final void rule__CompositeConfiguration__PortsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3786:1: ( ( rulePort ) )
            // InternalCosaDsl.g:3787:2: ( rulePort )
            {
            // InternalCosaDsl.g:3787:2: ( rulePort )
            // InternalCosaDsl.g:3788:3: rulePort
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__PortsAssignment_7"


    // $ANTLR start "rule__CompositeConfiguration__PortsAssignment_8_1"
    // InternalCosaDsl.g:3797:1: rule__CompositeConfiguration__PortsAssignment_8_1 : ( rulePort ) ;
    public final void rule__CompositeConfiguration__PortsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3801:1: ( ( rulePort ) )
            // InternalCosaDsl.g:3802:2: ( rulePort )
            {
            // InternalCosaDsl.g:3802:2: ( rulePort )
            // InternalCosaDsl.g:3803:3: rulePort
            {
             before(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getPortsPortParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__PortsAssignment_8_1"


    // $ANTLR start "rule__CompositeConfiguration__BindingsAssignment_9_0"
    // InternalCosaDsl.g:3812:1: rule__CompositeConfiguration__BindingsAssignment_9_0 : ( ruleBinding ) ;
    public final void rule__CompositeConfiguration__BindingsAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3816:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:3817:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:3817:2: ( ruleBinding )
            // InternalCosaDsl.g:3818:3: ruleBinding
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__BindingsAssignment_9_0"


    // $ANTLR start "rule__CompositeConfiguration__BindingsAssignment_9_1_1"
    // InternalCosaDsl.g:3827:1: rule__CompositeConfiguration__BindingsAssignment_9_1_1 : ( ruleBinding ) ;
    public final void rule__CompositeConfiguration__BindingsAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3831:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:3832:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:3832:2: ( ruleBinding )
            // InternalCosaDsl.g:3833:3: ruleBinding
            {
             before(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__BindingsAssignment_9_1_1"


    // $ANTLR start "rule__CompositeConfiguration__AttachementsAssignment_10"
    // InternalCosaDsl.g:3842:1: rule__CompositeConfiguration__AttachementsAssignment_10 : ( ruleAttachement ) ;
    public final void rule__CompositeConfiguration__AttachementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3846:1: ( ( ruleAttachement ) )
            // InternalCosaDsl.g:3847:2: ( ruleAttachement )
            {
            // InternalCosaDsl.g:3847:2: ( ruleAttachement )
            // InternalCosaDsl.g:3848:3: ruleAttachement
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__AttachementsAssignment_10"


    // $ANTLR start "rule__CompositeConfiguration__AttachementsAssignment_11_1"
    // InternalCosaDsl.g:3857:1: rule__CompositeConfiguration__AttachementsAssignment_11_1 : ( ruleAttachement ) ;
    public final void rule__CompositeConfiguration__AttachementsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3861:1: ( ( ruleAttachement ) )
            // InternalCosaDsl.g:3862:2: ( ruleAttachement )
            {
            // InternalCosaDsl.g:3862:2: ( ruleAttachement )
            // InternalCosaDsl.g:3863:3: ruleAttachement
            {
             before(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__AttachementsAssignment_11_1"


    // $ANTLR start "rule__CompositeConfiguration__ConfigurationsAssignment_12_0"
    // InternalCosaDsl.g:3872:1: rule__CompositeConfiguration__ConfigurationsAssignment_12_0 : ( ruleConfiguration ) ;
    public final void rule__CompositeConfiguration__ConfigurationsAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3876:1: ( ( ruleConfiguration ) )
            // InternalCosaDsl.g:3877:2: ( ruleConfiguration )
            {
            // InternalCosaDsl.g:3877:2: ( ruleConfiguration )
            // InternalCosaDsl.g:3878:3: ruleConfiguration
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_0_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__ConfigurationsAssignment_12_0"


    // $ANTLR start "rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1"
    // InternalCosaDsl.g:3887:1: rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1 : ( ruleConfiguration ) ;
    public final void rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3891:1: ( ( ruleConfiguration ) )
            // InternalCosaDsl.g:3892:2: ( ruleConfiguration )
            {
            // InternalCosaDsl.g:3892:2: ( ruleConfiguration )
            // InternalCosaDsl.g:3893:3: ruleConfiguration
            {
             before(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getCompositeConfigurationAccess().getConfigurationsConfigurationParserRuleCall_12_1_1_0()); 

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
    // $ANTLR end "rule__CompositeConfiguration__ConfigurationsAssignment_12_1_1"


    // $ANTLR start "rule__Configuration__NameAssignment_1"
    // InternalCosaDsl.g:3902:1: rule__Configuration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3906:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:3907:2: ( ruleEString )
            {
            // InternalCosaDsl.g:3907:2: ( ruleEString )
            // InternalCosaDsl.g:3908:3: ruleEString
            {
             before(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Configuration__NameAssignment_1"


    // $ANTLR start "rule__Configuration__ComponentsAssignment_3"
    // InternalCosaDsl.g:3917:1: rule__Configuration__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Configuration__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3921:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:3922:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:3922:2: ( ruleComponent )
            // InternalCosaDsl.g:3923:3: ruleComponent
            {
             before(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Configuration__ComponentsAssignment_3"


    // $ANTLR start "rule__Configuration__ComponentsAssignment_4_1"
    // InternalCosaDsl.g:3932:1: rule__Configuration__ComponentsAssignment_4_1 : ( ruleComponent ) ;
    public final void rule__Configuration__ComponentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3936:1: ( ( ruleComponent ) )
            // InternalCosaDsl.g:3937:2: ( ruleComponent )
            {
            // InternalCosaDsl.g:3937:2: ( ruleComponent )
            // InternalCosaDsl.g:3938:3: ruleComponent
            {
             before(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getComponentsComponentParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Configuration__ComponentsAssignment_4_1"


    // $ANTLR start "rule__Configuration__ConnectorsAssignment_5"
    // InternalCosaDsl.g:3947:1: rule__Configuration__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__Configuration__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3951:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:3952:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:3952:2: ( ruleConnector )
            // InternalCosaDsl.g:3953:3: ruleConnector
            {
             before(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Configuration__ConnectorsAssignment_5"


    // $ANTLR start "rule__Configuration__ConnectorsAssignment_6_1"
    // InternalCosaDsl.g:3962:1: rule__Configuration__ConnectorsAssignment_6_1 : ( ruleConnector ) ;
    public final void rule__Configuration__ConnectorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3966:1: ( ( ruleConnector ) )
            // InternalCosaDsl.g:3967:2: ( ruleConnector )
            {
            // InternalCosaDsl.g:3967:2: ( ruleConnector )
            // InternalCosaDsl.g:3968:3: ruleConnector
            {
             before(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConnectorsConnectorParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Configuration__ConnectorsAssignment_6_1"


    // $ANTLR start "rule__Configuration__PortsAssignment_7"
    // InternalCosaDsl.g:3977:1: rule__Configuration__PortsAssignment_7 : ( rulePort ) ;
    public final void rule__Configuration__PortsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3981:1: ( ( rulePort ) )
            // InternalCosaDsl.g:3982:2: ( rulePort )
            {
            // InternalCosaDsl.g:3982:2: ( rulePort )
            // InternalCosaDsl.g:3983:3: rulePort
            {
             before(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Configuration__PortsAssignment_7"


    // $ANTLR start "rule__Configuration__PortsAssignment_8_1"
    // InternalCosaDsl.g:3992:1: rule__Configuration__PortsAssignment_8_1 : ( rulePort ) ;
    public final void rule__Configuration__PortsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:3996:1: ( ( rulePort ) )
            // InternalCosaDsl.g:3997:2: ( rulePort )
            {
            // InternalCosaDsl.g:3997:2: ( rulePort )
            // InternalCosaDsl.g:3998:3: rulePort
            {
             before(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getPortsPortParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Configuration__PortsAssignment_8_1"


    // $ANTLR start "rule__Configuration__BindingsAssignment_9_0"
    // InternalCosaDsl.g:4007:1: rule__Configuration__BindingsAssignment_9_0 : ( ruleBinding ) ;
    public final void rule__Configuration__BindingsAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4011:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:4012:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:4012:2: ( ruleBinding )
            // InternalCosaDsl.g:4013:3: ruleBinding
            {
             before(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__Configuration__BindingsAssignment_9_0"


    // $ANTLR start "rule__Configuration__BindingsAssignment_9_1_1"
    // InternalCosaDsl.g:4022:1: rule__Configuration__BindingsAssignment_9_1_1 : ( ruleBinding ) ;
    public final void rule__Configuration__BindingsAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4026:1: ( ( ruleBinding ) )
            // InternalCosaDsl.g:4027:2: ( ruleBinding )
            {
            // InternalCosaDsl.g:4027:2: ( ruleBinding )
            // InternalCosaDsl.g:4028:3: ruleBinding
            {
             before(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getBindingsBindingParserRuleCall_9_1_1_0()); 

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
    // $ANTLR end "rule__Configuration__BindingsAssignment_9_1_1"


    // $ANTLR start "rule__Configuration__AttachementsAssignment_10"
    // InternalCosaDsl.g:4037:1: rule__Configuration__AttachementsAssignment_10 : ( ruleAttachement ) ;
    public final void rule__Configuration__AttachementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4041:1: ( ( ruleAttachement ) )
            // InternalCosaDsl.g:4042:2: ( ruleAttachement )
            {
            // InternalCosaDsl.g:4042:2: ( ruleAttachement )
            // InternalCosaDsl.g:4043:3: ruleAttachement
            {
             before(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Configuration__AttachementsAssignment_10"


    // $ANTLR start "rule__Configuration__AttachementsAssignment_11_1"
    // InternalCosaDsl.g:4052:1: rule__Configuration__AttachementsAssignment_11_1 : ( ruleAttachement ) ;
    public final void rule__Configuration__AttachementsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4056:1: ( ( ruleAttachement ) )
            // InternalCosaDsl.g:4057:2: ( ruleAttachement )
            {
            // InternalCosaDsl.g:4057:2: ( ruleAttachement )
            // InternalCosaDsl.g:4058:3: ruleAttachement
            {
             before(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttachement();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getAttachementsAttachementParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Configuration__AttachementsAssignment_11_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalCosaDsl.g:4067:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4071:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4072:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4072:2: ( ruleEString )
            // InternalCosaDsl.g:4073:3: ruleEString
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
    // InternalCosaDsl.g:4082:1: rule__Component__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4086:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4087:2: ( rulePort )
            {
            // InternalCosaDsl.g:4087:2: ( rulePort )
            // InternalCosaDsl.g:4088:3: rulePort
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
    // InternalCosaDsl.g:4097:1: rule__Component__PortsAssignment_4_1 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4101:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4102:2: ( rulePort )
            {
            // InternalCosaDsl.g:4102:2: ( rulePort )
            // InternalCosaDsl.g:4103:3: rulePort
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
    // InternalCosaDsl.g:4112:1: rule__Component__ServicesAssignment_5 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4116:1: ( ( ruleService ) )
            // InternalCosaDsl.g:4117:2: ( ruleService )
            {
            // InternalCosaDsl.g:4117:2: ( ruleService )
            // InternalCosaDsl.g:4118:3: ruleService
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
    // InternalCosaDsl.g:4127:1: rule__Component__ServicesAssignment_6_1 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4131:1: ( ( ruleService ) )
            // InternalCosaDsl.g:4132:2: ( ruleService )
            {
            // InternalCosaDsl.g:4132:2: ( ruleService )
            // InternalCosaDsl.g:4133:3: ruleService
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
    // InternalCosaDsl.g:4142:1: rule__Connector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4146:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4147:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4147:2: ( ruleEString )
            // InternalCosaDsl.g:4148:3: ruleEString
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


    // $ANTLR start "rule__Connector__RolesAssignment_4"
    // InternalCosaDsl.g:4157:1: rule__Connector__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Connector__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4161:1: ( ( ruleRole ) )
            // InternalCosaDsl.g:4162:2: ( ruleRole )
            {
            // InternalCosaDsl.g:4162:2: ( ruleRole )
            // InternalCosaDsl.g:4163:3: ruleRole
            {
             before(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Connector__RolesAssignment_4"


    // $ANTLR start "rule__Connector__RolesAssignment_6"
    // InternalCosaDsl.g:4172:1: rule__Connector__RolesAssignment_6 : ( ruleRole ) ;
    public final void rule__Connector__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4176:1: ( ( ruleRole ) )
            // InternalCosaDsl.g:4177:2: ( ruleRole )
            {
            // InternalCosaDsl.g:4177:2: ( ruleRole )
            // InternalCosaDsl.g:4178:3: ruleRole
            {
             before(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getRolesRoleParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Connector__RolesAssignment_6"


    // $ANTLR start "rule__Port_Impl__NameAssignment_2"
    // InternalCosaDsl.g:4187:1: rule__Port_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Port_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4191:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4192:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4192:2: ( ruleEString )
            // InternalCosaDsl.g:4193:3: ruleEString
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


    // $ANTLR start "rule__Binding__PortProvidedAssignment_2"
    // InternalCosaDsl.g:4202:1: rule__Binding__PortProvidedAssignment_2 : ( rulePort ) ;
    public final void rule__Binding__PortProvidedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4206:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4207:2: ( rulePort )
            {
            // InternalCosaDsl.g:4207:2: ( rulePort )
            // InternalCosaDsl.g:4208:3: rulePort
            {
             before(grammarAccess.getBindingAccess().getPortProvidedPortParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getPortProvidedPortParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__PortProvidedAssignment_2"


    // $ANTLR start "rule__Binding__PortRequiredAssignment_3"
    // InternalCosaDsl.g:4217:1: rule__Binding__PortRequiredAssignment_3 : ( rulePort ) ;
    public final void rule__Binding__PortRequiredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4221:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4222:2: ( rulePort )
            {
            // InternalCosaDsl.g:4222:2: ( rulePort )
            // InternalCosaDsl.g:4223:3: rulePort
            {
             before(grammarAccess.getBindingAccess().getPortRequiredPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getPortRequiredPortParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Binding__PortRequiredAssignment_3"


    // $ANTLR start "rule__Attachement__RoleAssignment_2"
    // InternalCosaDsl.g:4232:1: rule__Attachement__RoleAssignment_2 : ( ruleRole ) ;
    public final void rule__Attachement__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4236:1: ( ( ruleRole ) )
            // InternalCosaDsl.g:4237:2: ( ruleRole )
            {
            // InternalCosaDsl.g:4237:2: ( ruleRole )
            // InternalCosaDsl.g:4238:3: ruleRole
            {
             before(grammarAccess.getAttachementAccess().getRoleRoleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAttachementAccess().getRoleRoleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attachement__RoleAssignment_2"


    // $ANTLR start "rule__Attachement__PortAssignment_4"
    // InternalCosaDsl.g:4247:1: rule__Attachement__PortAssignment_4 : ( rulePort ) ;
    public final void rule__Attachement__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4251:1: ( ( rulePort ) )
            // InternalCosaDsl.g:4252:2: ( rulePort )
            {
            // InternalCosaDsl.g:4252:2: ( rulePort )
            // InternalCosaDsl.g:4253:3: rulePort
            {
             before(grammarAccess.getAttachementAccess().getPortPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getAttachementAccess().getPortPortParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__Service_Impl__NameAssignment_2"
    // InternalCosaDsl.g:4262:1: rule__Service_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4266:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4267:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4267:2: ( ruleEString )
            // InternalCosaDsl.g:4268:3: ruleEString
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
    // InternalCosaDsl.g:4277:1: rule__RequiredService__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequiredService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4281:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4282:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4282:2: ( ruleEString )
            // InternalCosaDsl.g:4283:3: ruleEString
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
    // InternalCosaDsl.g:4292:1: rule__ProvidedService__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProvidedService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4296:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4297:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4297:2: ( ruleEString )
            // InternalCosaDsl.g:4298:3: ruleEString
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
    // InternalCosaDsl.g:4307:1: rule__Role_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Role_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4311:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4312:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4312:2: ( ruleEString )
            // InternalCosaDsl.g:4313:3: ruleEString
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
    // InternalCosaDsl.g:4322:1: rule__RequiredRole__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequiredRole__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4326:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4327:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4327:2: ( ruleEString )
            // InternalCosaDsl.g:4328:3: ruleEString
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
    // InternalCosaDsl.g:4337:1: rule__ProvidedRole__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProvidedRole__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4341:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4342:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4342:2: ( ruleEString )
            // InternalCosaDsl.g:4343:3: ruleEString
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
    // InternalCosaDsl.g:4352:1: rule__RequiredPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RequiredPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4356:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4357:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4357:2: ( ruleEString )
            // InternalCosaDsl.g:4358:3: ruleEString
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
    // InternalCosaDsl.g:4367:1: rule__ProvidedPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProvidedPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCosaDsl.g:4371:1: ( ( ruleEString ) )
            // InternalCosaDsl.g:4372:2: ( ruleEString )
            {
            // InternalCosaDsl.g:4372:2: ( ruleEString )
            // InternalCosaDsl.g:4373:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000180084000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000504000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});

}