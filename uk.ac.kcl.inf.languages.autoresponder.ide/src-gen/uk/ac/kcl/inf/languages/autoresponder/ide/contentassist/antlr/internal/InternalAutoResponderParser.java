package uk.ac.kcl.inf.languages.autoresponder.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.languages.autoresponder.services.AutoResponderGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutoResponderParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'back'", "'repeat'", "'exit'", "'WaitForInput'", "'var'", "'='", "'Input'", "'('", "')'", "'->'", "'Activity'", "':'", "'on'", "'{'", "'}'", "'Instruct'", "'transferManual'", "'.'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=4;
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


        public InternalAutoResponderParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAutoResponderParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAutoResponderParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAutoResponder.g"; }


    	private AutoResponderGrammarAccess grammarAccess;

    	public void setGrammarAccess(AutoResponderGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAutoResponderProgram"
    // InternalAutoResponder.g:53:1: entryRuleAutoResponderProgram : ruleAutoResponderProgram EOF ;
    public final void entryRuleAutoResponderProgram() throws RecognitionException {
        try {
            // InternalAutoResponder.g:54:1: ( ruleAutoResponderProgram EOF )
            // InternalAutoResponder.g:55:1: ruleAutoResponderProgram EOF
            {
             before(grammarAccess.getAutoResponderProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleAutoResponderProgram();

            state._fsp--;

             after(grammarAccess.getAutoResponderProgramRule()); 
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
    // $ANTLR end "entryRuleAutoResponderProgram"


    // $ANTLR start "ruleAutoResponderProgram"
    // InternalAutoResponder.g:62:1: ruleAutoResponderProgram : ( ( rule__AutoResponderProgram__StatementsAssignment )* ) ;
    public final void ruleAutoResponderProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:66:2: ( ( ( rule__AutoResponderProgram__StatementsAssignment )* ) )
            // InternalAutoResponder.g:67:2: ( ( rule__AutoResponderProgram__StatementsAssignment )* )
            {
            // InternalAutoResponder.g:67:2: ( ( rule__AutoResponderProgram__StatementsAssignment )* )
            // InternalAutoResponder.g:68:3: ( rule__AutoResponderProgram__StatementsAssignment )*
            {
             before(grammarAccess.getAutoResponderProgramAccess().getStatementsAssignment()); 
            // InternalAutoResponder.g:69:3: ( rule__AutoResponderProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=19)||LA1_0==21||LA1_0==25||(LA1_0>=30 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAutoResponder.g:69:4: rule__AutoResponderProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AutoResponderProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAutoResponderProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutoResponderProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalAutoResponder.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:79:1: ( ruleStatement EOF )
            // InternalAutoResponder.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalAutoResponder.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalAutoResponder.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalAutoResponder.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalAutoResponder.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalAutoResponder.g:94:3: ( rule__Statement__Alternatives )
            // InternalAutoResponder.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleHearStatement"
    // InternalAutoResponder.g:103:1: entryRuleHearStatement : ruleHearStatement EOF ;
    public final void entryRuleHearStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:104:1: ( ruleHearStatement EOF )
            // InternalAutoResponder.g:105:1: ruleHearStatement EOF
            {
             before(grammarAccess.getHearStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleHearStatement();

            state._fsp--;

             after(grammarAccess.getHearStatementRule()); 
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
    // $ANTLR end "entryRuleHearStatement"


    // $ANTLR start "ruleHearStatement"
    // InternalAutoResponder.g:112:1: ruleHearStatement : ( ( rule__HearStatement__Group__0 ) ) ;
    public final void ruleHearStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:116:2: ( ( ( rule__HearStatement__Group__0 ) ) )
            // InternalAutoResponder.g:117:2: ( ( rule__HearStatement__Group__0 ) )
            {
            // InternalAutoResponder.g:117:2: ( ( rule__HearStatement__Group__0 ) )
            // InternalAutoResponder.g:118:3: ( rule__HearStatement__Group__0 )
            {
             before(grammarAccess.getHearStatementAccess().getGroup()); 
            // InternalAutoResponder.g:119:3: ( rule__HearStatement__Group__0 )
            // InternalAutoResponder.g:119:4: rule__HearStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HearStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHearStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHearStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalAutoResponder.g:128:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalAutoResponder.g:129:1: ( ruleVariableDeclaration EOF )
            // InternalAutoResponder.g:130:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalAutoResponder.g:137:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:141:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalAutoResponder.g:142:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalAutoResponder.g:142:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalAutoResponder.g:143:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalAutoResponder.g:144:3: ( rule__VariableDeclaration__Group__0 )
            // InternalAutoResponder.g:144:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAutoResponder.g:153:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAutoResponder.g:154:1: ( ruleStringLiteral EOF )
            // InternalAutoResponder.g:155:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalAutoResponder.g:162:1: ruleStringLiteral : ( ( rule__StringLiteral__ValAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:166:2: ( ( ( rule__StringLiteral__ValAssignment ) ) )
            // InternalAutoResponder.g:167:2: ( ( rule__StringLiteral__ValAssignment ) )
            {
            // InternalAutoResponder.g:167:2: ( ( rule__StringLiteral__ValAssignment ) )
            // InternalAutoResponder.g:168:3: ( rule__StringLiteral__ValAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValAssignment()); 
            // InternalAutoResponder.g:169:3: ( rule__StringLiteral__ValAssignment )
            // InternalAutoResponder.g:169:4: rule__StringLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleStringVariableDeclaration"
    // InternalAutoResponder.g:178:1: entryRuleStringVariableDeclaration : ruleStringVariableDeclaration EOF ;
    public final void entryRuleStringVariableDeclaration() throws RecognitionException {
        try {
            // InternalAutoResponder.g:179:1: ( ruleStringVariableDeclaration EOF )
            // InternalAutoResponder.g:180:1: ruleStringVariableDeclaration EOF
            {
             before(grammarAccess.getStringVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getStringVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleStringVariableDeclaration"


    // $ANTLR start "ruleStringVariableDeclaration"
    // InternalAutoResponder.g:187:1: ruleStringVariableDeclaration : ( ( rule__StringVariableDeclaration__Group__0 ) ) ;
    public final void ruleStringVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:191:2: ( ( ( rule__StringVariableDeclaration__Group__0 ) ) )
            // InternalAutoResponder.g:192:2: ( ( rule__StringVariableDeclaration__Group__0 ) )
            {
            // InternalAutoResponder.g:192:2: ( ( rule__StringVariableDeclaration__Group__0 ) )
            // InternalAutoResponder.g:193:3: ( rule__StringVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getGroup()); 
            // InternalAutoResponder.g:194:3: ( rule__StringVariableDeclaration__Group__0 )
            // InternalAutoResponder.g:194:4: rule__StringVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringVariableDeclaration"


    // $ANTLR start "entryRuleStringVarExpression"
    // InternalAutoResponder.g:203:1: entryRuleStringVarExpression : ruleStringVarExpression EOF ;
    public final void entryRuleStringVarExpression() throws RecognitionException {
        try {
            // InternalAutoResponder.g:204:1: ( ruleStringVarExpression EOF )
            // InternalAutoResponder.g:205:1: ruleStringVarExpression EOF
            {
             before(grammarAccess.getStringVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringVarExpression();

            state._fsp--;

             after(grammarAccess.getStringVarExpressionRule()); 
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
    // $ANTLR end "entryRuleStringVarExpression"


    // $ANTLR start "ruleStringVarExpression"
    // InternalAutoResponder.g:212:1: ruleStringVarExpression : ( ( rule__StringVarExpression__VarAssignment ) ) ;
    public final void ruleStringVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:216:2: ( ( ( rule__StringVarExpression__VarAssignment ) ) )
            // InternalAutoResponder.g:217:2: ( ( rule__StringVarExpression__VarAssignment ) )
            {
            // InternalAutoResponder.g:217:2: ( ( rule__StringVarExpression__VarAssignment ) )
            // InternalAutoResponder.g:218:3: ( rule__StringVarExpression__VarAssignment )
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarAssignment()); 
            // InternalAutoResponder.g:219:3: ( rule__StringVarExpression__VarAssignment )
            // InternalAutoResponder.g:219:4: rule__StringVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringVarExpression"


    // $ANTLR start "entryRuleStringExpression"
    // InternalAutoResponder.g:228:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalAutoResponder.g:229:1: ( ruleStringExpression EOF )
            // InternalAutoResponder.g:230:1: ruleStringExpression EOF
            {
             before(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getStringExpressionRule()); 
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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalAutoResponder.g:237:1: ruleStringExpression : ( ( rule__StringExpression__Alternatives ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:241:2: ( ( ( rule__StringExpression__Alternatives ) ) )
            // InternalAutoResponder.g:242:2: ( ( rule__StringExpression__Alternatives ) )
            {
            // InternalAutoResponder.g:242:2: ( ( rule__StringExpression__Alternatives ) )
            // InternalAutoResponder.g:243:3: ( rule__StringExpression__Alternatives )
            {
             before(grammarAccess.getStringExpressionAccess().getAlternatives()); 
            // InternalAutoResponder.g:244:3: ( rule__StringExpression__Alternatives )
            // InternalAutoResponder.g:244:4: rule__StringExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleTriggerStatement"
    // InternalAutoResponder.g:253:1: entryRuleTriggerStatement : ruleTriggerStatement EOF ;
    public final void entryRuleTriggerStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:254:1: ( ruleTriggerStatement EOF )
            // InternalAutoResponder.g:255:1: ruleTriggerStatement EOF
            {
             before(grammarAccess.getTriggerStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTriggerStatement();

            state._fsp--;

             after(grammarAccess.getTriggerStatementRule()); 
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
    // $ANTLR end "entryRuleTriggerStatement"


    // $ANTLR start "ruleTriggerStatement"
    // InternalAutoResponder.g:262:1: ruleTriggerStatement : ( ( rule__TriggerStatement__Group__0 ) ) ;
    public final void ruleTriggerStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:266:2: ( ( ( rule__TriggerStatement__Group__0 ) ) )
            // InternalAutoResponder.g:267:2: ( ( rule__TriggerStatement__Group__0 ) )
            {
            // InternalAutoResponder.g:267:2: ( ( rule__TriggerStatement__Group__0 ) )
            // InternalAutoResponder.g:268:3: ( rule__TriggerStatement__Group__0 )
            {
             before(grammarAccess.getTriggerStatementAccess().getGroup()); 
            // InternalAutoResponder.g:269:3: ( rule__TriggerStatement__Group__0 )
            // InternalAutoResponder.g:269:4: rule__TriggerStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriggerStatement"


    // $ANTLR start "entryRuleActivityStatement"
    // InternalAutoResponder.g:278:1: entryRuleActivityStatement : ruleActivityStatement EOF ;
    public final void entryRuleActivityStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:279:1: ( ruleActivityStatement EOF )
            // InternalAutoResponder.g:280:1: ruleActivityStatement EOF
            {
             before(grammarAccess.getActivityStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityStatement();

            state._fsp--;

             after(grammarAccess.getActivityStatementRule()); 
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
    // $ANTLR end "entryRuleActivityStatement"


    // $ANTLR start "ruleActivityStatement"
    // InternalAutoResponder.g:287:1: ruleActivityStatement : ( ( rule__ActivityStatement__Group__0 ) ) ;
    public final void ruleActivityStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:291:2: ( ( ( rule__ActivityStatement__Group__0 ) ) )
            // InternalAutoResponder.g:292:2: ( ( rule__ActivityStatement__Group__0 ) )
            {
            // InternalAutoResponder.g:292:2: ( ( rule__ActivityStatement__Group__0 ) )
            // InternalAutoResponder.g:293:3: ( rule__ActivityStatement__Group__0 )
            {
             before(grammarAccess.getActivityStatementAccess().getGroup()); 
            // InternalAutoResponder.g:294:3: ( rule__ActivityStatement__Group__0 )
            // InternalAutoResponder.g:294:4: rule__ActivityStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityStatement"


    // $ANTLR start "entryRuleInstructStatement"
    // InternalAutoResponder.g:303:1: entryRuleInstructStatement : ruleInstructStatement EOF ;
    public final void entryRuleInstructStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:304:1: ( ruleInstructStatement EOF )
            // InternalAutoResponder.g:305:1: ruleInstructStatement EOF
            {
             before(grammarAccess.getInstructStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructStatement();

            state._fsp--;

             after(grammarAccess.getInstructStatementRule()); 
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
    // $ANTLR end "entryRuleInstructStatement"


    // $ANTLR start "ruleInstructStatement"
    // InternalAutoResponder.g:312:1: ruleInstructStatement : ( ( rule__InstructStatement__Group__0 ) ) ;
    public final void ruleInstructStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:316:2: ( ( ( rule__InstructStatement__Group__0 ) ) )
            // InternalAutoResponder.g:317:2: ( ( rule__InstructStatement__Group__0 ) )
            {
            // InternalAutoResponder.g:317:2: ( ( rule__InstructStatement__Group__0 ) )
            // InternalAutoResponder.g:318:3: ( rule__InstructStatement__Group__0 )
            {
             before(grammarAccess.getInstructStatementAccess().getGroup()); 
            // InternalAutoResponder.g:319:3: ( rule__InstructStatement__Group__0 )
            // InternalAutoResponder.g:319:4: rule__InstructStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstructStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructStatement"


    // $ANTLR start "entryRuleTerminationStatement"
    // InternalAutoResponder.g:328:1: entryRuleTerminationStatement : ruleTerminationStatement EOF ;
    public final void entryRuleTerminationStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:329:1: ( ruleTerminationStatement EOF )
            // InternalAutoResponder.g:330:1: ruleTerminationStatement EOF
            {
             before(grammarAccess.getTerminationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminationStatement();

            state._fsp--;

             after(grammarAccess.getTerminationStatementRule()); 
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
    // $ANTLR end "entryRuleTerminationStatement"


    // $ANTLR start "ruleTerminationStatement"
    // InternalAutoResponder.g:337:1: ruleTerminationStatement : ( ( rule__TerminationStatement__StateAssignment ) ) ;
    public final void ruleTerminationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:341:2: ( ( ( rule__TerminationStatement__StateAssignment ) ) )
            // InternalAutoResponder.g:342:2: ( ( rule__TerminationStatement__StateAssignment ) )
            {
            // InternalAutoResponder.g:342:2: ( ( rule__TerminationStatement__StateAssignment ) )
            // InternalAutoResponder.g:343:3: ( rule__TerminationStatement__StateAssignment )
            {
             before(grammarAccess.getTerminationStatementAccess().getStateAssignment()); 
            // InternalAutoResponder.g:344:3: ( rule__TerminationStatement__StateAssignment )
            // InternalAutoResponder.g:344:4: rule__TerminationStatement__StateAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TerminationStatement__StateAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTerminationStatementAccess().getStateAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminationStatement"


    // $ANTLR start "entryRuleContactStatement"
    // InternalAutoResponder.g:353:1: entryRuleContactStatement : ruleContactStatement EOF ;
    public final void entryRuleContactStatement() throws RecognitionException {
        try {
            // InternalAutoResponder.g:354:1: ( ruleContactStatement EOF )
            // InternalAutoResponder.g:355:1: ruleContactStatement EOF
            {
             before(grammarAccess.getContactStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleContactStatement();

            state._fsp--;

             after(grammarAccess.getContactStatementRule()); 
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
    // $ANTLR end "entryRuleContactStatement"


    // $ANTLR start "ruleContactStatement"
    // InternalAutoResponder.g:362:1: ruleContactStatement : ( ( rule__ContactStatement__Group__0 ) ) ;
    public final void ruleContactStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:366:2: ( ( ( rule__ContactStatement__Group__0 ) ) )
            // InternalAutoResponder.g:367:2: ( ( rule__ContactStatement__Group__0 ) )
            {
            // InternalAutoResponder.g:367:2: ( ( rule__ContactStatement__Group__0 ) )
            // InternalAutoResponder.g:368:3: ( rule__ContactStatement__Group__0 )
            {
             before(grammarAccess.getContactStatementAccess().getGroup()); 
            // InternalAutoResponder.g:369:3: ( rule__ContactStatement__Group__0 )
            // InternalAutoResponder.g:369:4: rule__ContactStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContactStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContactStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalAutoResponder.g:378:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalAutoResponder.g:379:1: ( ruleAddition EOF )
            // InternalAutoResponder.g:380:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalAutoResponder.g:387:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:391:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalAutoResponder.g:392:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalAutoResponder.g:392:2: ( ( rule__Addition__Group__0 ) )
            // InternalAutoResponder.g:393:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalAutoResponder.g:394:3: ( rule__Addition__Group__0 )
            // InternalAutoResponder.g:394:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalAutoResponder.g:403:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalAutoResponder.g:404:1: ( ruleMultiplication EOF )
            // InternalAutoResponder.g:405:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalAutoResponder.g:412:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:416:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalAutoResponder.g:417:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalAutoResponder.g:417:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalAutoResponder.g:418:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalAutoResponder.g:419:3: ( rule__Multiplication__Group__0 )
            // InternalAutoResponder.g:419:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalAutoResponder.g:428:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAutoResponder.g:429:1: ( rulePrimary EOF )
            // InternalAutoResponder.g:430:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAutoResponder.g:437:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:441:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAutoResponder.g:442:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAutoResponder.g:442:2: ( ( rule__Primary__Alternatives ) )
            // InternalAutoResponder.g:443:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAutoResponder.g:444:3: ( rule__Primary__Alternatives )
            // InternalAutoResponder.g:444:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalAutoResponder.g:453:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalAutoResponder.g:454:1: ( ruleIntLiteral EOF )
            // InternalAutoResponder.g:455:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalAutoResponder.g:462:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:466:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalAutoResponder.g:467:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalAutoResponder.g:467:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalAutoResponder.g:468:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalAutoResponder.g:469:3: ( rule__IntLiteral__ValAssignment )
            // InternalAutoResponder.g:469:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalAutoResponder.g:478:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalAutoResponder.g:479:1: ( ruleRealLiteral EOF )
            // InternalAutoResponder.g:480:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalAutoResponder.g:487:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:491:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalAutoResponder.g:492:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalAutoResponder.g:492:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalAutoResponder.g:493:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalAutoResponder.g:494:3: ( rule__RealLiteral__ValAssignment )
            // InternalAutoResponder.g:494:4: rule__RealLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalAutoResponder.g:503:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalAutoResponder.g:504:1: ( ruleIntVarExpression EOF )
            // InternalAutoResponder.g:505:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalAutoResponder.g:512:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:516:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalAutoResponder.g:517:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalAutoResponder.g:517:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalAutoResponder.g:518:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalAutoResponder.g:519:3: ( rule__IntVarExpression__VarAssignment )
            // InternalAutoResponder.g:519:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalAutoResponder.g:528:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAutoResponder.g:532:1: ( ruleREAL EOF )
            // InternalAutoResponder.g:533:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalAutoResponder.g:543:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:548:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalAutoResponder.g:549:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalAutoResponder.g:549:2: ( ( rule__REAL__Group__0 ) )
            // InternalAutoResponder.g:550:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalAutoResponder.g:551:3: ( rule__REAL__Group__0 )
            // InternalAutoResponder.g:551:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleActivityState"
    // InternalAutoResponder.g:561:1: ruleActivityState : ( ( rule__ActivityState__Alternatives ) ) ;
    public final void ruleActivityState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:565:1: ( ( ( rule__ActivityState__Alternatives ) ) )
            // InternalAutoResponder.g:566:2: ( ( rule__ActivityState__Alternatives ) )
            {
            // InternalAutoResponder.g:566:2: ( ( rule__ActivityState__Alternatives ) )
            // InternalAutoResponder.g:567:3: ( rule__ActivityState__Alternatives )
            {
             before(grammarAccess.getActivityStateAccess().getAlternatives()); 
            // InternalAutoResponder.g:568:3: ( rule__ActivityState__Alternatives )
            // InternalAutoResponder.g:568:4: rule__ActivityState__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActivityState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityState"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalAutoResponder.g:576:1: rule__Statement__Alternatives : ( ( ruleTriggerStatement ) | ( ruleActivityStatement ) | ( ruleInstructStatement ) | ( ruleHearStatement ) | ( ruleTerminationStatement ) | ( ruleContactStatement ) | ( ruleVariableDeclaration ) | ( ruleStringVariableDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:580:1: ( ( ruleTriggerStatement ) | ( ruleActivityStatement ) | ( ruleInstructStatement ) | ( ruleHearStatement ) | ( ruleTerminationStatement ) | ( ruleContactStatement ) | ( ruleVariableDeclaration ) | ( ruleStringVariableDeclaration ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAutoResponder.g:581:2: ( ruleTriggerStatement )
                    {
                    // InternalAutoResponder.g:581:2: ( ruleTriggerStatement )
                    // InternalAutoResponder.g:582:3: ruleTriggerStatement
                    {
                     before(grammarAccess.getStatementAccess().getTriggerStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTriggerStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTriggerStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:587:2: ( ruleActivityStatement )
                    {
                    // InternalAutoResponder.g:587:2: ( ruleActivityStatement )
                    // InternalAutoResponder.g:588:3: ruleActivityStatement
                    {
                     before(grammarAccess.getStatementAccess().getActivityStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActivityStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getActivityStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutoResponder.g:593:2: ( ruleInstructStatement )
                    {
                    // InternalAutoResponder.g:593:2: ( ruleInstructStatement )
                    // InternalAutoResponder.g:594:3: ruleInstructStatement
                    {
                     before(grammarAccess.getStatementAccess().getInstructStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInstructStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInstructStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutoResponder.g:599:2: ( ruleHearStatement )
                    {
                    // InternalAutoResponder.g:599:2: ( ruleHearStatement )
                    // InternalAutoResponder.g:600:3: ruleHearStatement
                    {
                     before(grammarAccess.getStatementAccess().getHearStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHearStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getHearStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAutoResponder.g:605:2: ( ruleTerminationStatement )
                    {
                    // InternalAutoResponder.g:605:2: ( ruleTerminationStatement )
                    // InternalAutoResponder.g:606:3: ruleTerminationStatement
                    {
                     before(grammarAccess.getStatementAccess().getTerminationStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTerminationStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAutoResponder.g:611:2: ( ruleContactStatement )
                    {
                    // InternalAutoResponder.g:611:2: ( ruleContactStatement )
                    // InternalAutoResponder.g:612:3: ruleContactStatement
                    {
                     before(grammarAccess.getStatementAccess().getContactStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleContactStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getContactStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAutoResponder.g:617:2: ( ruleVariableDeclaration )
                    {
                    // InternalAutoResponder.g:617:2: ( ruleVariableDeclaration )
                    // InternalAutoResponder.g:618:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAutoResponder.g:623:2: ( ruleStringVariableDeclaration )
                    {
                    // InternalAutoResponder.g:623:2: ( ruleStringVariableDeclaration )
                    // InternalAutoResponder.g:624:3: ruleStringVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getStringVariableDeclarationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleStringVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringVariableDeclarationParserRuleCall_7()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__StringExpression__Alternatives"
    // InternalAutoResponder.g:633:1: rule__StringExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringVarExpression ) );
    public final void rule__StringExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:637:1: ( ( ruleStringLiteral ) | ( ruleStringVarExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAutoResponder.g:638:2: ( ruleStringLiteral )
                    {
                    // InternalAutoResponder.g:638:2: ( ruleStringLiteral )
                    // InternalAutoResponder.g:639:3: ruleStringLiteral
                    {
                     before(grammarAccess.getStringExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getStringExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:644:2: ( ruleStringVarExpression )
                    {
                    // InternalAutoResponder.g:644:2: ( ruleStringVarExpression )
                    // InternalAutoResponder.g:645:3: ruleStringVarExpression
                    {
                     before(grammarAccess.getStringExpressionAccess().getStringVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringVarExpression();

                    state._fsp--;

                     after(grammarAccess.getStringExpressionAccess().getStringVarExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__StringExpression__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalAutoResponder.g:654:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:658:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAutoResponder.g:659:2: ( '+' )
                    {
                    // InternalAutoResponder.g:659:2: ( '+' )
                    // InternalAutoResponder.g:660:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:665:2: ( '-' )
                    {
                    // InternalAutoResponder.g:665:2: ( '-' )
                    // InternalAutoResponder.g:666:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalAutoResponder.g:675:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:679:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAutoResponder.g:680:2: ( '*' )
                    {
                    // InternalAutoResponder.g:680:2: ( '*' )
                    // InternalAutoResponder.g:681:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:686:2: ( '/' )
                    {
                    // InternalAutoResponder.g:686:2: ( '/' )
                    // InternalAutoResponder.g:687:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAutoResponder.g:696:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:700:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==32) ) {
                    alt6=3;
                }
                else if ( (LA6_1==EOF||(LA6_1>=11 && LA6_1<=14)||LA6_1==23) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAutoResponder.g:701:2: ( ruleIntLiteral )
                    {
                    // InternalAutoResponder.g:701:2: ( ruleIntLiteral )
                    // InternalAutoResponder.g:702:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:707:2: ( ruleIntVarExpression )
                    {
                    // InternalAutoResponder.g:707:2: ( ruleIntVarExpression )
                    // InternalAutoResponder.g:708:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutoResponder.g:713:2: ( ruleRealLiteral )
                    {
                    // InternalAutoResponder.g:713:2: ( ruleRealLiteral )
                    // InternalAutoResponder.g:714:3: ruleRealLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAutoResponder.g:719:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalAutoResponder.g:719:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalAutoResponder.g:720:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalAutoResponder.g:721:3: ( rule__Primary__Group_3__0 )
                    // InternalAutoResponder.g:721:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__ActivityState__Alternatives"
    // InternalAutoResponder.g:729:1: rule__ActivityState__Alternatives : ( ( ( 'back' ) ) | ( ( 'repeat' ) ) | ( ( 'exit' ) ) );
    public final void rule__ActivityState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:733:1: ( ( ( 'back' ) ) | ( ( 'repeat' ) ) | ( ( 'exit' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAutoResponder.g:734:2: ( ( 'back' ) )
                    {
                    // InternalAutoResponder.g:734:2: ( ( 'back' ) )
                    // InternalAutoResponder.g:735:3: ( 'back' )
                    {
                     before(grammarAccess.getActivityStateAccess().getBackEnumLiteralDeclaration_0()); 
                    // InternalAutoResponder.g:736:3: ( 'back' )
                    // InternalAutoResponder.g:736:4: 'back'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityStateAccess().getBackEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:740:2: ( ( 'repeat' ) )
                    {
                    // InternalAutoResponder.g:740:2: ( ( 'repeat' ) )
                    // InternalAutoResponder.g:741:3: ( 'repeat' )
                    {
                     before(grammarAccess.getActivityStateAccess().getRepeatEnumLiteralDeclaration_1()); 
                    // InternalAutoResponder.g:742:3: ( 'repeat' )
                    // InternalAutoResponder.g:742:4: 'repeat'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityStateAccess().getRepeatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAutoResponder.g:746:2: ( ( 'exit' ) )
                    {
                    // InternalAutoResponder.g:746:2: ( ( 'exit' ) )
                    // InternalAutoResponder.g:747:3: ( 'exit' )
                    {
                     before(grammarAccess.getActivityStateAccess().getExitEnumLiteralDeclaration_2()); 
                    // InternalAutoResponder.g:748:3: ( 'exit' )
                    // InternalAutoResponder.g:748:4: 'exit'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityStateAccess().getExitEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ActivityState__Alternatives"


    // $ANTLR start "rule__HearStatement__Group__0"
    // InternalAutoResponder.g:756:1: rule__HearStatement__Group__0 : rule__HearStatement__Group__0__Impl rule__HearStatement__Group__1 ;
    public final void rule__HearStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:760:1: ( rule__HearStatement__Group__0__Impl rule__HearStatement__Group__1 )
            // InternalAutoResponder.g:761:2: rule__HearStatement__Group__0__Impl rule__HearStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__HearStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HearStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HearStatement__Group__0"


    // $ANTLR start "rule__HearStatement__Group__0__Impl"
    // InternalAutoResponder.g:768:1: rule__HearStatement__Group__0__Impl : ( 'WaitForInput' ) ;
    public final void rule__HearStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:772:1: ( ( 'WaitForInput' ) )
            // InternalAutoResponder.g:773:1: ( 'WaitForInput' )
            {
            // InternalAutoResponder.g:773:1: ( 'WaitForInput' )
            // InternalAutoResponder.g:774:2: 'WaitForInput'
            {
             before(grammarAccess.getHearStatementAccess().getWaitForInputKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHearStatementAccess().getWaitForInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HearStatement__Group__0__Impl"


    // $ANTLR start "rule__HearStatement__Group__1"
    // InternalAutoResponder.g:783:1: rule__HearStatement__Group__1 : rule__HearStatement__Group__1__Impl ;
    public final void rule__HearStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:787:1: ( rule__HearStatement__Group__1__Impl )
            // InternalAutoResponder.g:788:2: rule__HearStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HearStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HearStatement__Group__1"


    // $ANTLR start "rule__HearStatement__Group__1__Impl"
    // InternalAutoResponder.g:794:1: rule__HearStatement__Group__1__Impl : ( ( rule__HearStatement__ValueAssignment_1 ) ) ;
    public final void rule__HearStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:798:1: ( ( ( rule__HearStatement__ValueAssignment_1 ) ) )
            // InternalAutoResponder.g:799:1: ( ( rule__HearStatement__ValueAssignment_1 ) )
            {
            // InternalAutoResponder.g:799:1: ( ( rule__HearStatement__ValueAssignment_1 ) )
            // InternalAutoResponder.g:800:2: ( rule__HearStatement__ValueAssignment_1 )
            {
             before(grammarAccess.getHearStatementAccess().getValueAssignment_1()); 
            // InternalAutoResponder.g:801:2: ( rule__HearStatement__ValueAssignment_1 )
            // InternalAutoResponder.g:801:3: rule__HearStatement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HearStatement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHearStatementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HearStatement__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalAutoResponder.g:810:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:814:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalAutoResponder.g:815:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalAutoResponder.g:822:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:826:1: ( ( 'var' ) )
            // InternalAutoResponder.g:827:1: ( 'var' )
            {
            // InternalAutoResponder.g:827:1: ( 'var' )
            // InternalAutoResponder.g:828:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalAutoResponder.g:837:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:841:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalAutoResponder.g:842:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalAutoResponder.g:849:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:853:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalAutoResponder.g:854:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalAutoResponder.g:854:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalAutoResponder.g:855:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalAutoResponder.g:856:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalAutoResponder.g:856:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalAutoResponder.g:864:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:868:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalAutoResponder.g:869:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalAutoResponder.g:876:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:880:1: ( ( '=' ) )
            // InternalAutoResponder.g:881:1: ( '=' )
            {
            // InternalAutoResponder.g:881:1: ( '=' )
            // InternalAutoResponder.g:882:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalAutoResponder.g:891:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:895:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalAutoResponder.g:896:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalAutoResponder.g:902:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:906:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalAutoResponder.g:907:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalAutoResponder.g:907:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalAutoResponder.g:908:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalAutoResponder.g:909:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalAutoResponder.g:909:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__0"
    // InternalAutoResponder.g:918:1: rule__StringVariableDeclaration__Group__0 : rule__StringVariableDeclaration__Group__0__Impl rule__StringVariableDeclaration__Group__1 ;
    public final void rule__StringVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:922:1: ( rule__StringVariableDeclaration__Group__0__Impl rule__StringVariableDeclaration__Group__1 )
            // InternalAutoResponder.g:923:2: rule__StringVariableDeclaration__Group__0__Impl rule__StringVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StringVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__0"


    // $ANTLR start "rule__StringVariableDeclaration__Group__0__Impl"
    // InternalAutoResponder.g:930:1: rule__StringVariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__StringVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:934:1: ( ( 'var' ) )
            // InternalAutoResponder.g:935:1: ( 'var' )
            {
            // InternalAutoResponder.g:935:1: ( 'var' )
            // InternalAutoResponder.g:936:2: 'var'
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__1"
    // InternalAutoResponder.g:945:1: rule__StringVariableDeclaration__Group__1 : rule__StringVariableDeclaration__Group__1__Impl rule__StringVariableDeclaration__Group__2 ;
    public final void rule__StringVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:949:1: ( rule__StringVariableDeclaration__Group__1__Impl rule__StringVariableDeclaration__Group__2 )
            // InternalAutoResponder.g:950:2: rule__StringVariableDeclaration__Group__1__Impl rule__StringVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StringVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__1"


    // $ANTLR start "rule__StringVariableDeclaration__Group__1__Impl"
    // InternalAutoResponder.g:957:1: rule__StringVariableDeclaration__Group__1__Impl : ( ( rule__StringVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__StringVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:961:1: ( ( ( rule__StringVariableDeclaration__NameAssignment_1 ) ) )
            // InternalAutoResponder.g:962:1: ( ( rule__StringVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalAutoResponder.g:962:1: ( ( rule__StringVariableDeclaration__NameAssignment_1 ) )
            // InternalAutoResponder.g:963:2: ( rule__StringVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalAutoResponder.g:964:2: ( rule__StringVariableDeclaration__NameAssignment_1 )
            // InternalAutoResponder.g:964:3: rule__StringVariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__2"
    // InternalAutoResponder.g:972:1: rule__StringVariableDeclaration__Group__2 : rule__StringVariableDeclaration__Group__2__Impl rule__StringVariableDeclaration__Group__3 ;
    public final void rule__StringVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:976:1: ( rule__StringVariableDeclaration__Group__2__Impl rule__StringVariableDeclaration__Group__3 )
            // InternalAutoResponder.g:977:2: rule__StringVariableDeclaration__Group__2__Impl rule__StringVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__StringVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__2"


    // $ANTLR start "rule__StringVariableDeclaration__Group__2__Impl"
    // InternalAutoResponder.g:984:1: rule__StringVariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__StringVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:988:1: ( ( '=' ) )
            // InternalAutoResponder.g:989:1: ( '=' )
            {
            // InternalAutoResponder.g:989:1: ( '=' )
            // InternalAutoResponder.g:990:2: '='
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StringVariableDeclaration__Group__3"
    // InternalAutoResponder.g:999:1: rule__StringVariableDeclaration__Group__3 : rule__StringVariableDeclaration__Group__3__Impl ;
    public final void rule__StringVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1003:1: ( rule__StringVariableDeclaration__Group__3__Impl )
            // InternalAutoResponder.g:1004:2: rule__StringVariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__3"


    // $ANTLR start "rule__StringVariableDeclaration__Group__3__Impl"
    // InternalAutoResponder.g:1010:1: rule__StringVariableDeclaration__Group__3__Impl : ( ( rule__StringVariableDeclaration__StringAssignment_3 ) ) ;
    public final void rule__StringVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1014:1: ( ( ( rule__StringVariableDeclaration__StringAssignment_3 ) ) )
            // InternalAutoResponder.g:1015:1: ( ( rule__StringVariableDeclaration__StringAssignment_3 ) )
            {
            // InternalAutoResponder.g:1015:1: ( ( rule__StringVariableDeclaration__StringAssignment_3 ) )
            // InternalAutoResponder.g:1016:2: ( rule__StringVariableDeclaration__StringAssignment_3 )
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getStringAssignment_3()); 
            // InternalAutoResponder.g:1017:2: ( rule__StringVariableDeclaration__StringAssignment_3 )
            // InternalAutoResponder.g:1017:3: rule__StringVariableDeclaration__StringAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringVariableDeclaration__StringAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableDeclarationAccess().getStringAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__0"
    // InternalAutoResponder.g:1026:1: rule__TriggerStatement__Group__0 : rule__TriggerStatement__Group__0__Impl rule__TriggerStatement__Group__1 ;
    public final void rule__TriggerStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1030:1: ( rule__TriggerStatement__Group__0__Impl rule__TriggerStatement__Group__1 )
            // InternalAutoResponder.g:1031:2: rule__TriggerStatement__Group__0__Impl rule__TriggerStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TriggerStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__0"


    // $ANTLR start "rule__TriggerStatement__Group__0__Impl"
    // InternalAutoResponder.g:1038:1: rule__TriggerStatement__Group__0__Impl : ( 'Input' ) ;
    public final void rule__TriggerStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1042:1: ( ( 'Input' ) )
            // InternalAutoResponder.g:1043:1: ( 'Input' )
            {
            // InternalAutoResponder.g:1043:1: ( 'Input' )
            // InternalAutoResponder.g:1044:2: 'Input'
            {
             before(grammarAccess.getTriggerStatementAccess().getInputKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTriggerStatementAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__0__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__1"
    // InternalAutoResponder.g:1053:1: rule__TriggerStatement__Group__1 : rule__TriggerStatement__Group__1__Impl rule__TriggerStatement__Group__2 ;
    public final void rule__TriggerStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1057:1: ( rule__TriggerStatement__Group__1__Impl rule__TriggerStatement__Group__2 )
            // InternalAutoResponder.g:1058:2: rule__TriggerStatement__Group__1__Impl rule__TriggerStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TriggerStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__1"


    // $ANTLR start "rule__TriggerStatement__Group__1__Impl"
    // InternalAutoResponder.g:1065:1: rule__TriggerStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__TriggerStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1069:1: ( ( '(' ) )
            // InternalAutoResponder.g:1070:1: ( '(' )
            {
            // InternalAutoResponder.g:1070:1: ( '(' )
            // InternalAutoResponder.g:1071:2: '('
            {
             before(grammarAccess.getTriggerStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTriggerStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__1__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__2"
    // InternalAutoResponder.g:1080:1: rule__TriggerStatement__Group__2 : rule__TriggerStatement__Group__2__Impl rule__TriggerStatement__Group__3 ;
    public final void rule__TriggerStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1084:1: ( rule__TriggerStatement__Group__2__Impl rule__TriggerStatement__Group__3 )
            // InternalAutoResponder.g:1085:2: rule__TriggerStatement__Group__2__Impl rule__TriggerStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__TriggerStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__2"


    // $ANTLR start "rule__TriggerStatement__Group__2__Impl"
    // InternalAutoResponder.g:1092:1: rule__TriggerStatement__Group__2__Impl : ( ( rule__TriggerStatement__NameAssignment_2 ) ) ;
    public final void rule__TriggerStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1096:1: ( ( ( rule__TriggerStatement__NameAssignment_2 ) ) )
            // InternalAutoResponder.g:1097:1: ( ( rule__TriggerStatement__NameAssignment_2 ) )
            {
            // InternalAutoResponder.g:1097:1: ( ( rule__TriggerStatement__NameAssignment_2 ) )
            // InternalAutoResponder.g:1098:2: ( rule__TriggerStatement__NameAssignment_2 )
            {
             before(grammarAccess.getTriggerStatementAccess().getNameAssignment_2()); 
            // InternalAutoResponder.g:1099:2: ( rule__TriggerStatement__NameAssignment_2 )
            // InternalAutoResponder.g:1099:3: rule__TriggerStatement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TriggerStatement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerStatementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__2__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__3"
    // InternalAutoResponder.g:1107:1: rule__TriggerStatement__Group__3 : rule__TriggerStatement__Group__3__Impl rule__TriggerStatement__Group__4 ;
    public final void rule__TriggerStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1111:1: ( rule__TriggerStatement__Group__3__Impl rule__TriggerStatement__Group__4 )
            // InternalAutoResponder.g:1112:2: rule__TriggerStatement__Group__3__Impl rule__TriggerStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__TriggerStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__3"


    // $ANTLR start "rule__TriggerStatement__Group__3__Impl"
    // InternalAutoResponder.g:1119:1: rule__TriggerStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__TriggerStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1123:1: ( ( ')' ) )
            // InternalAutoResponder.g:1124:1: ( ')' )
            {
            // InternalAutoResponder.g:1124:1: ( ')' )
            // InternalAutoResponder.g:1125:2: ')'
            {
             before(grammarAccess.getTriggerStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTriggerStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__3__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__4"
    // InternalAutoResponder.g:1134:1: rule__TriggerStatement__Group__4 : rule__TriggerStatement__Group__4__Impl rule__TriggerStatement__Group__5 ;
    public final void rule__TriggerStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1138:1: ( rule__TriggerStatement__Group__4__Impl rule__TriggerStatement__Group__5 )
            // InternalAutoResponder.g:1139:2: rule__TriggerStatement__Group__4__Impl rule__TriggerStatement__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__TriggerStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__4"


    // $ANTLR start "rule__TriggerStatement__Group__4__Impl"
    // InternalAutoResponder.g:1146:1: rule__TriggerStatement__Group__4__Impl : ( '->' ) ;
    public final void rule__TriggerStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1150:1: ( ( '->' ) )
            // InternalAutoResponder.g:1151:1: ( '->' )
            {
            // InternalAutoResponder.g:1151:1: ( '->' )
            // InternalAutoResponder.g:1152:2: '->'
            {
             before(grammarAccess.getTriggerStatementAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTriggerStatementAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__4__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__5"
    // InternalAutoResponder.g:1161:1: rule__TriggerStatement__Group__5 : rule__TriggerStatement__Group__5__Impl rule__TriggerStatement__Group__6 ;
    public final void rule__TriggerStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1165:1: ( rule__TriggerStatement__Group__5__Impl rule__TriggerStatement__Group__6 )
            // InternalAutoResponder.g:1166:2: rule__TriggerStatement__Group__5__Impl rule__TriggerStatement__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__TriggerStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__5"


    // $ANTLR start "rule__TriggerStatement__Group__5__Impl"
    // InternalAutoResponder.g:1173:1: rule__TriggerStatement__Group__5__Impl : ( ( rule__TriggerStatement__ActivityAssignment_5 ) ) ;
    public final void rule__TriggerStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1177:1: ( ( ( rule__TriggerStatement__ActivityAssignment_5 ) ) )
            // InternalAutoResponder.g:1178:1: ( ( rule__TriggerStatement__ActivityAssignment_5 ) )
            {
            // InternalAutoResponder.g:1178:1: ( ( rule__TriggerStatement__ActivityAssignment_5 ) )
            // InternalAutoResponder.g:1179:2: ( rule__TriggerStatement__ActivityAssignment_5 )
            {
             before(grammarAccess.getTriggerStatementAccess().getActivityAssignment_5()); 
            // InternalAutoResponder.g:1180:2: ( rule__TriggerStatement__ActivityAssignment_5 )
            // InternalAutoResponder.g:1180:3: rule__TriggerStatement__ActivityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TriggerStatement__ActivityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTriggerStatementAccess().getActivityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__5__Impl"


    // $ANTLR start "rule__TriggerStatement__Group__6"
    // InternalAutoResponder.g:1188:1: rule__TriggerStatement__Group__6 : rule__TriggerStatement__Group__6__Impl ;
    public final void rule__TriggerStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1192:1: ( rule__TriggerStatement__Group__6__Impl )
            // InternalAutoResponder.g:1193:2: rule__TriggerStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriggerStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__6"


    // $ANTLR start "rule__TriggerStatement__Group__6__Impl"
    // InternalAutoResponder.g:1199:1: rule__TriggerStatement__Group__6__Impl : ( ( rule__TriggerStatement__StatementAssignment_6 ) ) ;
    public final void rule__TriggerStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1203:1: ( ( ( rule__TriggerStatement__StatementAssignment_6 ) ) )
            // InternalAutoResponder.g:1204:1: ( ( rule__TriggerStatement__StatementAssignment_6 ) )
            {
            // InternalAutoResponder.g:1204:1: ( ( rule__TriggerStatement__StatementAssignment_6 ) )
            // InternalAutoResponder.g:1205:2: ( rule__TriggerStatement__StatementAssignment_6 )
            {
             before(grammarAccess.getTriggerStatementAccess().getStatementAssignment_6()); 
            // InternalAutoResponder.g:1206:2: ( rule__TriggerStatement__StatementAssignment_6 )
            // InternalAutoResponder.g:1206:3: rule__TriggerStatement__StatementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TriggerStatement__StatementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTriggerStatementAccess().getStatementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__Group__6__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__0"
    // InternalAutoResponder.g:1215:1: rule__ActivityStatement__Group__0 : rule__ActivityStatement__Group__0__Impl rule__ActivityStatement__Group__1 ;
    public final void rule__ActivityStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1219:1: ( rule__ActivityStatement__Group__0__Impl rule__ActivityStatement__Group__1 )
            // InternalAutoResponder.g:1220:2: rule__ActivityStatement__Group__0__Impl rule__ActivityStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__0"


    // $ANTLR start "rule__ActivityStatement__Group__0__Impl"
    // InternalAutoResponder.g:1227:1: rule__ActivityStatement__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__ActivityStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1231:1: ( ( 'Activity' ) )
            // InternalAutoResponder.g:1232:1: ( 'Activity' )
            {
            // InternalAutoResponder.g:1232:1: ( 'Activity' )
            // InternalAutoResponder.g:1233:2: 'Activity'
            {
             before(grammarAccess.getActivityStatementAccess().getActivityKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActivityStatementAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__0__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__1"
    // InternalAutoResponder.g:1242:1: rule__ActivityStatement__Group__1 : rule__ActivityStatement__Group__1__Impl rule__ActivityStatement__Group__2 ;
    public final void rule__ActivityStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1246:1: ( rule__ActivityStatement__Group__1__Impl rule__ActivityStatement__Group__2 )
            // InternalAutoResponder.g:1247:2: rule__ActivityStatement__Group__1__Impl rule__ActivityStatement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ActivityStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__1"


    // $ANTLR start "rule__ActivityStatement__Group__1__Impl"
    // InternalAutoResponder.g:1254:1: rule__ActivityStatement__Group__1__Impl : ( ( rule__ActivityStatement__NameAssignment_1 ) ) ;
    public final void rule__ActivityStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1258:1: ( ( ( rule__ActivityStatement__NameAssignment_1 ) ) )
            // InternalAutoResponder.g:1259:1: ( ( rule__ActivityStatement__NameAssignment_1 ) )
            {
            // InternalAutoResponder.g:1259:1: ( ( rule__ActivityStatement__NameAssignment_1 ) )
            // InternalAutoResponder.g:1260:2: ( rule__ActivityStatement__NameAssignment_1 )
            {
             before(grammarAccess.getActivityStatementAccess().getNameAssignment_1()); 
            // InternalAutoResponder.g:1261:2: ( rule__ActivityStatement__NameAssignment_1 )
            // InternalAutoResponder.g:1261:3: rule__ActivityStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__1__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__2"
    // InternalAutoResponder.g:1269:1: rule__ActivityStatement__Group__2 : rule__ActivityStatement__Group__2__Impl rule__ActivityStatement__Group__3 ;
    public final void rule__ActivityStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1273:1: ( rule__ActivityStatement__Group__2__Impl rule__ActivityStatement__Group__3 )
            // InternalAutoResponder.g:1274:2: rule__ActivityStatement__Group__2__Impl rule__ActivityStatement__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ActivityStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__2"


    // $ANTLR start "rule__ActivityStatement__Group__2__Impl"
    // InternalAutoResponder.g:1281:1: rule__ActivityStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__ActivityStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1285:1: ( ( ':' ) )
            // InternalAutoResponder.g:1286:1: ( ':' )
            {
            // InternalAutoResponder.g:1286:1: ( ':' )
            // InternalAutoResponder.g:1287:2: ':'
            {
             before(grammarAccess.getActivityStatementAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActivityStatementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__2__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__3"
    // InternalAutoResponder.g:1296:1: rule__ActivityStatement__Group__3 : rule__ActivityStatement__Group__3__Impl rule__ActivityStatement__Group__4 ;
    public final void rule__ActivityStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1300:1: ( rule__ActivityStatement__Group__3__Impl rule__ActivityStatement__Group__4 )
            // InternalAutoResponder.g:1301:2: rule__ActivityStatement__Group__3__Impl rule__ActivityStatement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ActivityStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__3"


    // $ANTLR start "rule__ActivityStatement__Group__3__Impl"
    // InternalAutoResponder.g:1308:1: rule__ActivityStatement__Group__3__Impl : ( 'on' ) ;
    public final void rule__ActivityStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1312:1: ( ( 'on' ) )
            // InternalAutoResponder.g:1313:1: ( 'on' )
            {
            // InternalAutoResponder.g:1313:1: ( 'on' )
            // InternalAutoResponder.g:1314:2: 'on'
            {
             before(grammarAccess.getActivityStatementAccess().getOnKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActivityStatementAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__3__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__4"
    // InternalAutoResponder.g:1323:1: rule__ActivityStatement__Group__4 : rule__ActivityStatement__Group__4__Impl rule__ActivityStatement__Group__5 ;
    public final void rule__ActivityStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1327:1: ( rule__ActivityStatement__Group__4__Impl rule__ActivityStatement__Group__5 )
            // InternalAutoResponder.g:1328:2: rule__ActivityStatement__Group__4__Impl rule__ActivityStatement__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ActivityStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__4"


    // $ANTLR start "rule__ActivityStatement__Group__4__Impl"
    // InternalAutoResponder.g:1335:1: rule__ActivityStatement__Group__4__Impl : ( ( rule__ActivityStatement__Last_inputAssignment_4 ) ) ;
    public final void rule__ActivityStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1339:1: ( ( ( rule__ActivityStatement__Last_inputAssignment_4 ) ) )
            // InternalAutoResponder.g:1340:1: ( ( rule__ActivityStatement__Last_inputAssignment_4 ) )
            {
            // InternalAutoResponder.g:1340:1: ( ( rule__ActivityStatement__Last_inputAssignment_4 ) )
            // InternalAutoResponder.g:1341:2: ( rule__ActivityStatement__Last_inputAssignment_4 )
            {
             before(grammarAccess.getActivityStatementAccess().getLast_inputAssignment_4()); 
            // InternalAutoResponder.g:1342:2: ( rule__ActivityStatement__Last_inputAssignment_4 )
            // InternalAutoResponder.g:1342:3: rule__ActivityStatement__Last_inputAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Last_inputAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActivityStatementAccess().getLast_inputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__4__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__5"
    // InternalAutoResponder.g:1350:1: rule__ActivityStatement__Group__5 : rule__ActivityStatement__Group__5__Impl rule__ActivityStatement__Group__6 ;
    public final void rule__ActivityStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1354:1: ( rule__ActivityStatement__Group__5__Impl rule__ActivityStatement__Group__6 )
            // InternalAutoResponder.g:1355:2: rule__ActivityStatement__Group__5__Impl rule__ActivityStatement__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ActivityStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__5"


    // $ANTLR start "rule__ActivityStatement__Group__5__Impl"
    // InternalAutoResponder.g:1362:1: rule__ActivityStatement__Group__5__Impl : ( '{' ) ;
    public final void rule__ActivityStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1366:1: ( ( '{' ) )
            // InternalAutoResponder.g:1367:1: ( '{' )
            {
            // InternalAutoResponder.g:1367:1: ( '{' )
            // InternalAutoResponder.g:1368:2: '{'
            {
             before(grammarAccess.getActivityStatementAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActivityStatementAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__5__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__6"
    // InternalAutoResponder.g:1377:1: rule__ActivityStatement__Group__6 : rule__ActivityStatement__Group__6__Impl rule__ActivityStatement__Group__7 ;
    public final void rule__ActivityStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1381:1: ( rule__ActivityStatement__Group__6__Impl rule__ActivityStatement__Group__7 )
            // InternalAutoResponder.g:1382:2: rule__ActivityStatement__Group__6__Impl rule__ActivityStatement__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ActivityStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__6"


    // $ANTLR start "rule__ActivityStatement__Group__6__Impl"
    // InternalAutoResponder.g:1389:1: rule__ActivityStatement__Group__6__Impl : ( ( rule__ActivityStatement__StatementsAssignment_6 )* ) ;
    public final void rule__ActivityStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1393:1: ( ( ( rule__ActivityStatement__StatementsAssignment_6 )* ) )
            // InternalAutoResponder.g:1394:1: ( ( rule__ActivityStatement__StatementsAssignment_6 )* )
            {
            // InternalAutoResponder.g:1394:1: ( ( rule__ActivityStatement__StatementsAssignment_6 )* )
            // InternalAutoResponder.g:1395:2: ( rule__ActivityStatement__StatementsAssignment_6 )*
            {
             before(grammarAccess.getActivityStatementAccess().getStatementsAssignment_6()); 
            // InternalAutoResponder.g:1396:2: ( rule__ActivityStatement__StatementsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=19)||LA8_0==21||LA8_0==25||(LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAutoResponder.g:1396:3: rule__ActivityStatement__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ActivityStatement__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getActivityStatementAccess().getStatementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__6__Impl"


    // $ANTLR start "rule__ActivityStatement__Group__7"
    // InternalAutoResponder.g:1404:1: rule__ActivityStatement__Group__7 : rule__ActivityStatement__Group__7__Impl ;
    public final void rule__ActivityStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1408:1: ( rule__ActivityStatement__Group__7__Impl )
            // InternalAutoResponder.g:1409:2: rule__ActivityStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityStatement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__7"


    // $ANTLR start "rule__ActivityStatement__Group__7__Impl"
    // InternalAutoResponder.g:1415:1: rule__ActivityStatement__Group__7__Impl : ( '}' ) ;
    public final void rule__ActivityStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1419:1: ( ( '}' ) )
            // InternalAutoResponder.g:1420:1: ( '}' )
            {
            // InternalAutoResponder.g:1420:1: ( '}' )
            // InternalAutoResponder.g:1421:2: '}'
            {
             before(grammarAccess.getActivityStatementAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActivityStatementAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Group__7__Impl"


    // $ANTLR start "rule__InstructStatement__Group__0"
    // InternalAutoResponder.g:1431:1: rule__InstructStatement__Group__0 : rule__InstructStatement__Group__0__Impl rule__InstructStatement__Group__1 ;
    public final void rule__InstructStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1435:1: ( rule__InstructStatement__Group__0__Impl rule__InstructStatement__Group__1 )
            // InternalAutoResponder.g:1436:2: rule__InstructStatement__Group__0__Impl rule__InstructStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InstructStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__Group__0"


    // $ANTLR start "rule__InstructStatement__Group__0__Impl"
    // InternalAutoResponder.g:1443:1: rule__InstructStatement__Group__0__Impl : ( 'Instruct' ) ;
    public final void rule__InstructStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1447:1: ( ( 'Instruct' ) )
            // InternalAutoResponder.g:1448:1: ( 'Instruct' )
            {
            // InternalAutoResponder.g:1448:1: ( 'Instruct' )
            // InternalAutoResponder.g:1449:2: 'Instruct'
            {
             before(grammarAccess.getInstructStatementAccess().getInstructKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInstructStatementAccess().getInstructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__Group__0__Impl"


    // $ANTLR start "rule__InstructStatement__Group__1"
    // InternalAutoResponder.g:1458:1: rule__InstructStatement__Group__1 : rule__InstructStatement__Group__1__Impl rule__InstructStatement__Group__2 ;
    public final void rule__InstructStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1462:1: ( rule__InstructStatement__Group__1__Impl rule__InstructStatement__Group__2 )
            // InternalAutoResponder.g:1463:2: rule__InstructStatement__Group__1__Impl rule__InstructStatement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__InstructStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__Group__1"


    // $ANTLR start "rule__InstructStatement__Group__1__Impl"
    // InternalAutoResponder.g:1470:1: rule__InstructStatement__Group__1__Impl : ( '->' ) ;
    public final void rule__InstructStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1474:1: ( ( '->' ) )
            // InternalAutoResponder.g:1475:1: ( '->' )
            {
            // InternalAutoResponder.g:1475:1: ( '->' )
            // InternalAutoResponder.g:1476:2: '->'
            {
             before(grammarAccess.getInstructStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstructStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__Group__1__Impl"


    // $ANTLR start "rule__InstructStatement__Group__2"
    // InternalAutoResponder.g:1485:1: rule__InstructStatement__Group__2 : rule__InstructStatement__Group__2__Impl ;
    public final void rule__InstructStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1489:1: ( rule__InstructStatement__Group__2__Impl )
            // InternalAutoResponder.g:1490:2: rule__InstructStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstructStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__Group__2"


    // $ANTLR start "rule__InstructStatement__Group__2__Impl"
    // InternalAutoResponder.g:1496:1: rule__InstructStatement__Group__2__Impl : ( ( rule__InstructStatement__InstructionAssignment_2 ) ) ;
    public final void rule__InstructStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1500:1: ( ( ( rule__InstructStatement__InstructionAssignment_2 ) ) )
            // InternalAutoResponder.g:1501:1: ( ( rule__InstructStatement__InstructionAssignment_2 ) )
            {
            // InternalAutoResponder.g:1501:1: ( ( rule__InstructStatement__InstructionAssignment_2 ) )
            // InternalAutoResponder.g:1502:2: ( rule__InstructStatement__InstructionAssignment_2 )
            {
             before(grammarAccess.getInstructStatementAccess().getInstructionAssignment_2()); 
            // InternalAutoResponder.g:1503:2: ( rule__InstructStatement__InstructionAssignment_2 )
            // InternalAutoResponder.g:1503:3: rule__InstructStatement__InstructionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InstructStatement__InstructionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstructStatementAccess().getInstructionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__Group__2__Impl"


    // $ANTLR start "rule__ContactStatement__Group__0"
    // InternalAutoResponder.g:1512:1: rule__ContactStatement__Group__0 : rule__ContactStatement__Group__0__Impl rule__ContactStatement__Group__1 ;
    public final void rule__ContactStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1516:1: ( rule__ContactStatement__Group__0__Impl rule__ContactStatement__Group__1 )
            // InternalAutoResponder.g:1517:2: rule__ContactStatement__Group__0__Impl rule__ContactStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ContactStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__Group__0"


    // $ANTLR start "rule__ContactStatement__Group__0__Impl"
    // InternalAutoResponder.g:1524:1: rule__ContactStatement__Group__0__Impl : ( 'transferManual' ) ;
    public final void rule__ContactStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1528:1: ( ( 'transferManual' ) )
            // InternalAutoResponder.g:1529:1: ( 'transferManual' )
            {
            // InternalAutoResponder.g:1529:1: ( 'transferManual' )
            // InternalAutoResponder.g:1530:2: 'transferManual'
            {
             before(grammarAccess.getContactStatementAccess().getTransferManualKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContactStatementAccess().getTransferManualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__Group__0__Impl"


    // $ANTLR start "rule__ContactStatement__Group__1"
    // InternalAutoResponder.g:1539:1: rule__ContactStatement__Group__1 : rule__ContactStatement__Group__1__Impl rule__ContactStatement__Group__2 ;
    public final void rule__ContactStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1543:1: ( rule__ContactStatement__Group__1__Impl rule__ContactStatement__Group__2 )
            // InternalAutoResponder.g:1544:2: rule__ContactStatement__Group__1__Impl rule__ContactStatement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ContactStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__Group__1"


    // $ANTLR start "rule__ContactStatement__Group__1__Impl"
    // InternalAutoResponder.g:1551:1: rule__ContactStatement__Group__1__Impl : ( '->' ) ;
    public final void rule__ContactStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1555:1: ( ( '->' ) )
            // InternalAutoResponder.g:1556:1: ( '->' )
            {
            // InternalAutoResponder.g:1556:1: ( '->' )
            // InternalAutoResponder.g:1557:2: '->'
            {
             before(grammarAccess.getContactStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContactStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__Group__1__Impl"


    // $ANTLR start "rule__ContactStatement__Group__2"
    // InternalAutoResponder.g:1566:1: rule__ContactStatement__Group__2 : rule__ContactStatement__Group__2__Impl ;
    public final void rule__ContactStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1570:1: ( rule__ContactStatement__Group__2__Impl )
            // InternalAutoResponder.g:1571:2: rule__ContactStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContactStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__Group__2"


    // $ANTLR start "rule__ContactStatement__Group__2__Impl"
    // InternalAutoResponder.g:1577:1: rule__ContactStatement__Group__2__Impl : ( ( rule__ContactStatement__PhoneNumberAssignment_2 ) ) ;
    public final void rule__ContactStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1581:1: ( ( ( rule__ContactStatement__PhoneNumberAssignment_2 ) ) )
            // InternalAutoResponder.g:1582:1: ( ( rule__ContactStatement__PhoneNumberAssignment_2 ) )
            {
            // InternalAutoResponder.g:1582:1: ( ( rule__ContactStatement__PhoneNumberAssignment_2 ) )
            // InternalAutoResponder.g:1583:2: ( rule__ContactStatement__PhoneNumberAssignment_2 )
            {
             before(grammarAccess.getContactStatementAccess().getPhoneNumberAssignment_2()); 
            // InternalAutoResponder.g:1584:2: ( rule__ContactStatement__PhoneNumberAssignment_2 )
            // InternalAutoResponder.g:1584:3: rule__ContactStatement__PhoneNumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContactStatement__PhoneNumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContactStatementAccess().getPhoneNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalAutoResponder.g:1593:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1597:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalAutoResponder.g:1598:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalAutoResponder.g:1605:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1609:1: ( ( ruleMultiplication ) )
            // InternalAutoResponder.g:1610:1: ( ruleMultiplication )
            {
            // InternalAutoResponder.g:1610:1: ( ruleMultiplication )
            // InternalAutoResponder.g:1611:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalAutoResponder.g:1620:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1624:1: ( rule__Addition__Group__1__Impl )
            // InternalAutoResponder.g:1625:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalAutoResponder.g:1631:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1635:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalAutoResponder.g:1636:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalAutoResponder.g:1636:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalAutoResponder.g:1637:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalAutoResponder.g:1638:2: ( rule__Addition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAutoResponder.g:1638:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalAutoResponder.g:1647:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1651:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalAutoResponder.g:1652:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalAutoResponder.g:1659:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1663:1: ( ( () ) )
            // InternalAutoResponder.g:1664:1: ( () )
            {
            // InternalAutoResponder.g:1664:1: ( () )
            // InternalAutoResponder.g:1665:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalAutoResponder.g:1666:2: ()
            // InternalAutoResponder.g:1666:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalAutoResponder.g:1674:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1678:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalAutoResponder.g:1679:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalAutoResponder.g:1686:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1690:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalAutoResponder.g:1691:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalAutoResponder.g:1691:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalAutoResponder.g:1692:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalAutoResponder.g:1693:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalAutoResponder.g:1693:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalAutoResponder.g:1701:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1705:1: ( rule__Addition__Group_1__2__Impl )
            // InternalAutoResponder.g:1706:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalAutoResponder.g:1712:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1716:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalAutoResponder.g:1717:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalAutoResponder.g:1717:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalAutoResponder.g:1718:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalAutoResponder.g:1719:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalAutoResponder.g:1719:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalAutoResponder.g:1728:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1732:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalAutoResponder.g:1733:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalAutoResponder.g:1740:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1744:1: ( ( rulePrimary ) )
            // InternalAutoResponder.g:1745:1: ( rulePrimary )
            {
            // InternalAutoResponder.g:1745:1: ( rulePrimary )
            // InternalAutoResponder.g:1746:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalAutoResponder.g:1755:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1759:1: ( rule__Multiplication__Group__1__Impl )
            // InternalAutoResponder.g:1760:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalAutoResponder.g:1766:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1770:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalAutoResponder.g:1771:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalAutoResponder.g:1771:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalAutoResponder.g:1772:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalAutoResponder.g:1773:2: ( rule__Multiplication__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAutoResponder.g:1773:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalAutoResponder.g:1782:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1786:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalAutoResponder.g:1787:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalAutoResponder.g:1794:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1798:1: ( ( () ) )
            // InternalAutoResponder.g:1799:1: ( () )
            {
            // InternalAutoResponder.g:1799:1: ( () )
            // InternalAutoResponder.g:1800:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalAutoResponder.g:1801:2: ()
            // InternalAutoResponder.g:1801:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalAutoResponder.g:1809:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1813:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalAutoResponder.g:1814:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalAutoResponder.g:1821:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1825:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalAutoResponder.g:1826:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalAutoResponder.g:1826:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalAutoResponder.g:1827:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalAutoResponder.g:1828:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalAutoResponder.g:1828:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalAutoResponder.g:1836:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1840:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalAutoResponder.g:1841:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalAutoResponder.g:1847:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1851:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalAutoResponder.g:1852:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalAutoResponder.g:1852:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalAutoResponder.g:1853:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalAutoResponder.g:1854:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalAutoResponder.g:1854:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalAutoResponder.g:1863:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1867:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalAutoResponder.g:1868:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalAutoResponder.g:1875:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1879:1: ( ( '(' ) )
            // InternalAutoResponder.g:1880:1: ( '(' )
            {
            // InternalAutoResponder.g:1880:1: ( '(' )
            // InternalAutoResponder.g:1881:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalAutoResponder.g:1890:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1894:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalAutoResponder.g:1895:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalAutoResponder.g:1902:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1906:1: ( ( ruleAddition ) )
            // InternalAutoResponder.g:1907:1: ( ruleAddition )
            {
            // InternalAutoResponder.g:1907:1: ( ruleAddition )
            // InternalAutoResponder.g:1908:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalAutoResponder.g:1917:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1921:1: ( rule__Primary__Group_3__2__Impl )
            // InternalAutoResponder.g:1922:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalAutoResponder.g:1928:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1932:1: ( ( ')' ) )
            // InternalAutoResponder.g:1933:1: ( ')' )
            {
            // InternalAutoResponder.g:1933:1: ( ')' )
            // InternalAutoResponder.g:1934:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalAutoResponder.g:1944:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1948:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalAutoResponder.g:1949:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalAutoResponder.g:1956:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1960:1: ( ( ( RULE_INT )? ) )
            // InternalAutoResponder.g:1961:1: ( ( RULE_INT )? )
            {
            // InternalAutoResponder.g:1961:1: ( ( RULE_INT )? )
            // InternalAutoResponder.g:1962:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalAutoResponder.g:1963:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAutoResponder.g:1963:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalAutoResponder.g:1971:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1975:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalAutoResponder.g:1976:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalAutoResponder.g:1983:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:1987:1: ( ( '.' ) )
            // InternalAutoResponder.g:1988:1: ( '.' )
            {
            // InternalAutoResponder.g:1988:1: ( '.' )
            // InternalAutoResponder.g:1989:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalAutoResponder.g:1998:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2002:1: ( rule__REAL__Group__2__Impl )
            // InternalAutoResponder.g:2003:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalAutoResponder.g:2009:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2013:1: ( ( RULE_INT ) )
            // InternalAutoResponder.g:2014:1: ( RULE_INT )
            {
            // InternalAutoResponder.g:2014:1: ( RULE_INT )
            // InternalAutoResponder.g:2015:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__AutoResponderProgram__StatementsAssignment"
    // InternalAutoResponder.g:2025:1: rule__AutoResponderProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__AutoResponderProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2029:1: ( ( ruleStatement ) )
            // InternalAutoResponder.g:2030:2: ( ruleStatement )
            {
            // InternalAutoResponder.g:2030:2: ( ruleStatement )
            // InternalAutoResponder.g:2031:3: ruleStatement
            {
             before(grammarAccess.getAutoResponderProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getAutoResponderProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoResponderProgram__StatementsAssignment"


    // $ANTLR start "rule__HearStatement__ValueAssignment_1"
    // InternalAutoResponder.g:2040:1: rule__HearStatement__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__HearStatement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2044:1: ( ( RULE_INT ) )
            // InternalAutoResponder.g:2045:2: ( RULE_INT )
            {
            // InternalAutoResponder.g:2045:2: ( RULE_INT )
            // InternalAutoResponder.g:2046:3: RULE_INT
            {
             before(grammarAccess.getHearStatementAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHearStatementAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HearStatement__ValueAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalAutoResponder.g:2055:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2059:1: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2060:2: ( RULE_ID )
            {
            // InternalAutoResponder.g:2060:2: ( RULE_ID )
            // InternalAutoResponder.g:2061:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalAutoResponder.g:2070:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2074:1: ( ( RULE_INT ) )
            // InternalAutoResponder.g:2075:2: ( RULE_INT )
            {
            // InternalAutoResponder.g:2075:2: ( RULE_INT )
            // InternalAutoResponder.g:2076:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__StringLiteral__ValAssignment"
    // InternalAutoResponder.g:2085:1: rule__StringLiteral__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2089:1: ( ( RULE_STRING ) )
            // InternalAutoResponder.g:2090:2: ( RULE_STRING )
            {
            // InternalAutoResponder.g:2090:2: ( RULE_STRING )
            // InternalAutoResponder.g:2091:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValAssignment"


    // $ANTLR start "rule__StringVariableDeclaration__NameAssignment_1"
    // InternalAutoResponder.g:2100:1: rule__StringVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2104:1: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2105:2: ( RULE_ID )
            {
            // InternalAutoResponder.g:2105:2: ( RULE_ID )
            // InternalAutoResponder.g:2106:3: RULE_ID
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StringVariableDeclaration__StringAssignment_3"
    // InternalAutoResponder.g:2115:1: rule__StringVariableDeclaration__StringAssignment_3 : ( RULE_STRING ) ;
    public final void rule__StringVariableDeclaration__StringAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2119:1: ( ( RULE_STRING ) )
            // InternalAutoResponder.g:2120:2: ( RULE_STRING )
            {
            // InternalAutoResponder.g:2120:2: ( RULE_STRING )
            // InternalAutoResponder.g:2121:3: RULE_STRING
            {
             before(grammarAccess.getStringVariableDeclarationAccess().getStringSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringVariableDeclarationAccess().getStringSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVariableDeclaration__StringAssignment_3"


    // $ANTLR start "rule__StringVarExpression__VarAssignment"
    // InternalAutoResponder.g:2130:1: rule__StringVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StringVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2134:1: ( ( ( RULE_ID ) ) )
            // InternalAutoResponder.g:2135:2: ( ( RULE_ID ) )
            {
            // InternalAutoResponder.g:2135:2: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2136:3: ( RULE_ID )
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarStringVariableDeclarationCrossReference_0()); 
            // InternalAutoResponder.g:2137:3: ( RULE_ID )
            // InternalAutoResponder.g:2138:4: RULE_ID
            {
             before(grammarAccess.getStringVarExpressionAccess().getVarStringVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringVarExpressionAccess().getVarStringVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStringVarExpressionAccess().getVarStringVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVarExpression__VarAssignment"


    // $ANTLR start "rule__TriggerStatement__NameAssignment_2"
    // InternalAutoResponder.g:2149:1: rule__TriggerStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TriggerStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2153:1: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2154:2: ( RULE_ID )
            {
            // InternalAutoResponder.g:2154:2: ( RULE_ID )
            // InternalAutoResponder.g:2155:3: RULE_ID
            {
             before(grammarAccess.getTriggerStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerStatementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__NameAssignment_2"


    // $ANTLR start "rule__TriggerStatement__ActivityAssignment_5"
    // InternalAutoResponder.g:2164:1: rule__TriggerStatement__ActivityAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerStatement__ActivityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2168:1: ( ( ( RULE_ID ) ) )
            // InternalAutoResponder.g:2169:2: ( ( RULE_ID ) )
            {
            // InternalAutoResponder.g:2169:2: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2170:3: ( RULE_ID )
            {
             before(grammarAccess.getTriggerStatementAccess().getActivityActivityStatementCrossReference_5_0()); 
            // InternalAutoResponder.g:2171:3: ( RULE_ID )
            // InternalAutoResponder.g:2172:4: RULE_ID
            {
             before(grammarAccess.getTriggerStatementAccess().getActivityActivityStatementIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerStatementAccess().getActivityActivityStatementIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTriggerStatementAccess().getActivityActivityStatementCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__ActivityAssignment_5"


    // $ANTLR start "rule__TriggerStatement__StatementAssignment_6"
    // InternalAutoResponder.g:2183:1: rule__TriggerStatement__StatementAssignment_6 : ( ruleActivityStatement ) ;
    public final void rule__TriggerStatement__StatementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2187:1: ( ( ruleActivityStatement ) )
            // InternalAutoResponder.g:2188:2: ( ruleActivityStatement )
            {
            // InternalAutoResponder.g:2188:2: ( ruleActivityStatement )
            // InternalAutoResponder.g:2189:3: ruleActivityStatement
            {
             before(grammarAccess.getTriggerStatementAccess().getStatementActivityStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityStatement();

            state._fsp--;

             after(grammarAccess.getTriggerStatementAccess().getStatementActivityStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerStatement__StatementAssignment_6"


    // $ANTLR start "rule__ActivityStatement__NameAssignment_1"
    // InternalAutoResponder.g:2198:1: rule__ActivityStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActivityStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2202:1: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2203:2: ( RULE_ID )
            {
            // InternalAutoResponder.g:2203:2: ( RULE_ID )
            // InternalAutoResponder.g:2204:3: RULE_ID
            {
             before(grammarAccess.getActivityStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__NameAssignment_1"


    // $ANTLR start "rule__ActivityStatement__Last_inputAssignment_4"
    // InternalAutoResponder.g:2213:1: rule__ActivityStatement__Last_inputAssignment_4 : ( ruleStringExpression ) ;
    public final void rule__ActivityStatement__Last_inputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2217:1: ( ( ruleStringExpression ) )
            // InternalAutoResponder.g:2218:2: ( ruleStringExpression )
            {
            // InternalAutoResponder.g:2218:2: ( ruleStringExpression )
            // InternalAutoResponder.g:2219:3: ruleStringExpression
            {
             before(grammarAccess.getActivityStatementAccess().getLast_inputStringExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getActivityStatementAccess().getLast_inputStringExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__Last_inputAssignment_4"


    // $ANTLR start "rule__ActivityStatement__StatementsAssignment_6"
    // InternalAutoResponder.g:2228:1: rule__ActivityStatement__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__ActivityStatement__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2232:1: ( ( ruleStatement ) )
            // InternalAutoResponder.g:2233:2: ( ruleStatement )
            {
            // InternalAutoResponder.g:2233:2: ( ruleStatement )
            // InternalAutoResponder.g:2234:3: ruleStatement
            {
             before(grammarAccess.getActivityStatementAccess().getStatementsStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getActivityStatementAccess().getStatementsStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityStatement__StatementsAssignment_6"


    // $ANTLR start "rule__InstructStatement__InstructionAssignment_2"
    // InternalAutoResponder.g:2243:1: rule__InstructStatement__InstructionAssignment_2 : ( ruleStringExpression ) ;
    public final void rule__InstructStatement__InstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2247:1: ( ( ruleStringExpression ) )
            // InternalAutoResponder.g:2248:2: ( ruleStringExpression )
            {
            // InternalAutoResponder.g:2248:2: ( ruleStringExpression )
            // InternalAutoResponder.g:2249:3: ruleStringExpression
            {
             before(grammarAccess.getInstructStatementAccess().getInstructionStringExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getInstructStatementAccess().getInstructionStringExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructStatement__InstructionAssignment_2"


    // $ANTLR start "rule__TerminationStatement__StateAssignment"
    // InternalAutoResponder.g:2258:1: rule__TerminationStatement__StateAssignment : ( ruleActivityState ) ;
    public final void rule__TerminationStatement__StateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2262:1: ( ( ruleActivityState ) )
            // InternalAutoResponder.g:2263:2: ( ruleActivityState )
            {
            // InternalAutoResponder.g:2263:2: ( ruleActivityState )
            // InternalAutoResponder.g:2264:3: ruleActivityState
            {
             before(grammarAccess.getTerminationStatementAccess().getStateActivityStateEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityState();

            state._fsp--;

             after(grammarAccess.getTerminationStatementAccess().getStateActivityStateEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminationStatement__StateAssignment"


    // $ANTLR start "rule__ContactStatement__PhoneNumberAssignment_2"
    // InternalAutoResponder.g:2273:1: rule__ContactStatement__PhoneNumberAssignment_2 : ( ruleStringExpression ) ;
    public final void rule__ContactStatement__PhoneNumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2277:1: ( ( ruleStringExpression ) )
            // InternalAutoResponder.g:2278:2: ( ruleStringExpression )
            {
            // InternalAutoResponder.g:2278:2: ( ruleStringExpression )
            // InternalAutoResponder.g:2279:3: ruleStringExpression
            {
             before(grammarAccess.getContactStatementAccess().getPhoneNumberStringExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getContactStatementAccess().getPhoneNumberStringExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactStatement__PhoneNumberAssignment_2"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalAutoResponder.g:2288:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2292:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalAutoResponder.g:2293:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalAutoResponder.g:2293:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalAutoResponder.g:2294:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalAutoResponder.g:2295:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalAutoResponder.g:2295:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalAutoResponder.g:2303:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2307:1: ( ( ruleMultiplication ) )
            // InternalAutoResponder.g:2308:2: ( ruleMultiplication )
            {
            // InternalAutoResponder.g:2308:2: ( ruleMultiplication )
            // InternalAutoResponder.g:2309:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalAutoResponder.g:2318:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2322:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalAutoResponder.g:2323:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalAutoResponder.g:2323:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalAutoResponder.g:2324:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalAutoResponder.g:2325:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalAutoResponder.g:2325:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalAutoResponder.g:2333:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2337:1: ( ( rulePrimary ) )
            // InternalAutoResponder.g:2338:2: ( rulePrimary )
            {
            // InternalAutoResponder.g:2338:2: ( rulePrimary )
            // InternalAutoResponder.g:2339:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalAutoResponder.g:2348:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2352:1: ( ( RULE_INT ) )
            // InternalAutoResponder.g:2353:2: ( RULE_INT )
            {
            // InternalAutoResponder.g:2353:2: ( RULE_INT )
            // InternalAutoResponder.g:2354:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__RealLiteral__ValAssignment"
    // InternalAutoResponder.g:2363:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2367:1: ( ( ruleREAL ) )
            // InternalAutoResponder.g:2368:2: ( ruleREAL )
            {
            // InternalAutoResponder.g:2368:2: ( ruleREAL )
            // InternalAutoResponder.g:2369:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__ValAssignment"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalAutoResponder.g:2378:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAutoResponder.g:2382:1: ( ( ( RULE_ID ) ) )
            // InternalAutoResponder.g:2383:2: ( ( RULE_ID ) )
            {
            // InternalAutoResponder.g:2383:2: ( ( RULE_ID ) )
            // InternalAutoResponder.g:2384:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalAutoResponder.g:2385:3: ( RULE_ID )
            // InternalAutoResponder.g:2386:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVarExpression__VarAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\17\6\uffff\1\5\1\24\1\4\2\uffff";
    static final String dfa_3s = "\1\37\6\uffff\1\5\1\24\1\6\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\10\1\7";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\3\5\1\4\1\7\1\uffff\1\1\3\uffff\1\2\4\uffff\1\3\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\13\1\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "576:1: rule__Statement__Alternatives : ( ( ruleTriggerStatement ) | ( ruleActivityStatement ) | ( ruleInstructStatement ) | ( ruleHearStatement ) | ( ruleTerminationStatement ) | ( ruleContactStatement ) | ( ruleVariableDeclaration ) | ( ruleStringVariableDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C22F8002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000E22F8000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100400030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000010L});

}