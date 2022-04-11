package uk.ac.kcl.inf.languages.autoresponder.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.languages.autoresponder.services.AutoResponderGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAutoResponderParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'WaitForInput'", "'var'", "'='", "'Input'", "'('", "')'", "'->'", "'Activity'", "':'", "'on'", "'{'", "'}'", "'Instruct'", "'transferManual'", "'+'", "'-'", "'*'", "'/'", "'.'", "'back'", "'repeat'", "'exit'"
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

        public InternalAutoResponderParser(TokenStream input, AutoResponderGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AutoResponderProgram";
       	}

       	@Override
       	protected AutoResponderGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAutoResponderProgram"
    // InternalAutoResponder.g:65:1: entryRuleAutoResponderProgram returns [EObject current=null] : iv_ruleAutoResponderProgram= ruleAutoResponderProgram EOF ;
    public final EObject entryRuleAutoResponderProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoResponderProgram = null;


        try {
            // InternalAutoResponder.g:65:61: (iv_ruleAutoResponderProgram= ruleAutoResponderProgram EOF )
            // InternalAutoResponder.g:66:2: iv_ruleAutoResponderProgram= ruleAutoResponderProgram EOF
            {
             newCompositeNode(grammarAccess.getAutoResponderProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutoResponderProgram=ruleAutoResponderProgram();

            state._fsp--;

             current =iv_ruleAutoResponderProgram; 
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
    // $ANTLR end "entryRuleAutoResponderProgram"


    // $ANTLR start "ruleAutoResponderProgram"
    // InternalAutoResponder.g:72:1: ruleAutoResponderProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleAutoResponderProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalAutoResponder.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalAutoResponder.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==14||LA1_0==18||(LA1_0>=23 && LA1_0<=24)||(LA1_0>=30 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAutoResponder.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalAutoResponder.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalAutoResponder.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getAutoResponderProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAutoResponderProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleAutoResponderProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalAutoResponder.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalAutoResponder.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalAutoResponder.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalAutoResponder.g:108:1: ruleStatement returns [EObject current=null] : (this_TriggerStatement_0= ruleTriggerStatement | this_ActivityStatement_1= ruleActivityStatement | this_InstructStatement_2= ruleInstructStatement | this_HearStatement_3= ruleHearStatement | this_TerminationStatement_4= ruleTerminationStatement | this_ContactStatement_5= ruleContactStatement | this_VariableDeclaration_6= ruleVariableDeclaration | this_StringVariableDeclaration_7= ruleStringVariableDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_TriggerStatement_0 = null;

        EObject this_ActivityStatement_1 = null;

        EObject this_InstructStatement_2 = null;

        EObject this_HearStatement_3 = null;

        EObject this_TerminationStatement_4 = null;

        EObject this_ContactStatement_5 = null;

        EObject this_VariableDeclaration_6 = null;

        EObject this_StringVariableDeclaration_7 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:114:2: ( (this_TriggerStatement_0= ruleTriggerStatement | this_ActivityStatement_1= ruleActivityStatement | this_InstructStatement_2= ruleInstructStatement | this_HearStatement_3= ruleHearStatement | this_TerminationStatement_4= ruleTerminationStatement | this_ContactStatement_5= ruleContactStatement | this_VariableDeclaration_6= ruleVariableDeclaration | this_StringVariableDeclaration_7= ruleStringVariableDeclaration ) )
            // InternalAutoResponder.g:115:2: (this_TriggerStatement_0= ruleTriggerStatement | this_ActivityStatement_1= ruleActivityStatement | this_InstructStatement_2= ruleInstructStatement | this_HearStatement_3= ruleHearStatement | this_TerminationStatement_4= ruleTerminationStatement | this_ContactStatement_5= ruleContactStatement | this_VariableDeclaration_6= ruleVariableDeclaration | this_StringVariableDeclaration_7= ruleStringVariableDeclaration )
            {
            // InternalAutoResponder.g:115:2: (this_TriggerStatement_0= ruleTriggerStatement | this_ActivityStatement_1= ruleActivityStatement | this_InstructStatement_2= ruleInstructStatement | this_HearStatement_3= ruleHearStatement | this_TerminationStatement_4= ruleTerminationStatement | this_ContactStatement_5= ruleContactStatement | this_VariableDeclaration_6= ruleVariableDeclaration | this_StringVariableDeclaration_7= ruleStringVariableDeclaration )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAutoResponder.g:116:3: this_TriggerStatement_0= ruleTriggerStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTriggerStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerStatement_0=ruleTriggerStatement();

                    state._fsp--;


                    			current = this_TriggerStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:125:3: this_ActivityStatement_1= ruleActivityStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getActivityStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityStatement_1=ruleActivityStatement();

                    state._fsp--;


                    			current = this_ActivityStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAutoResponder.g:134:3: this_InstructStatement_2= ruleInstructStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInstructStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstructStatement_2=ruleInstructStatement();

                    state._fsp--;


                    			current = this_InstructStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAutoResponder.g:143:3: this_HearStatement_3= ruleHearStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getHearStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_HearStatement_3=ruleHearStatement();

                    state._fsp--;


                    			current = this_HearStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAutoResponder.g:152:3: this_TerminationStatement_4= ruleTerminationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTerminationStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminationStatement_4=ruleTerminationStatement();

                    state._fsp--;


                    			current = this_TerminationStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAutoResponder.g:161:3: this_ContactStatement_5= ruleContactStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getContactStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContactStatement_5=ruleContactStatement();

                    state._fsp--;


                    			current = this_ContactStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAutoResponder.g:170:3: this_VariableDeclaration_6= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_6=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAutoResponder.g:179:3: this_StringVariableDeclaration_7= ruleStringVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStringVariableDeclarationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVariableDeclaration_7=ruleStringVariableDeclaration();

                    state._fsp--;


                    			current = this_StringVariableDeclaration_7;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleHearStatement"
    // InternalAutoResponder.g:191:1: entryRuleHearStatement returns [EObject current=null] : iv_ruleHearStatement= ruleHearStatement EOF ;
    public final EObject entryRuleHearStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHearStatement = null;


        try {
            // InternalAutoResponder.g:191:54: (iv_ruleHearStatement= ruleHearStatement EOF )
            // InternalAutoResponder.g:192:2: iv_ruleHearStatement= ruleHearStatement EOF
            {
             newCompositeNode(grammarAccess.getHearStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHearStatement=ruleHearStatement();

            state._fsp--;

             current =iv_ruleHearStatement; 
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
    // $ANTLR end "entryRuleHearStatement"


    // $ANTLR start "ruleHearStatement"
    // InternalAutoResponder.g:198:1: ruleHearStatement returns [EObject current=null] : (otherlv_0= 'WaitForInput' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHearStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:204:2: ( (otherlv_0= 'WaitForInput' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalAutoResponder.g:205:2: (otherlv_0= 'WaitForInput' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalAutoResponder.g:205:2: (otherlv_0= 'WaitForInput' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalAutoResponder.g:206:3: otherlv_0= 'WaitForInput' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHearStatementAccess().getWaitForInputKeyword_0());
            		
            // InternalAutoResponder.g:210:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalAutoResponder.g:211:4: (lv_value_1_0= RULE_INT )
            {
            // InternalAutoResponder.g:211:4: (lv_value_1_0= RULE_INT )
            // InternalAutoResponder.g:212:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getHearStatementAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHearStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleHearStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalAutoResponder.g:232:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalAutoResponder.g:232:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalAutoResponder.g:233:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalAutoResponder.g:239:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:245:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalAutoResponder.g:246:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalAutoResponder.g:246:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalAutoResponder.g:247:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalAutoResponder.g:251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAutoResponder.g:252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAutoResponder.g:252:4: (lv_name_1_0= RULE_ID )
            // InternalAutoResponder.g:253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalAutoResponder.g:273:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalAutoResponder.g:274:4: (lv_value_3_0= RULE_INT )
            {
            // InternalAutoResponder.g:274:4: (lv_value_3_0= RULE_INT )
            // InternalAutoResponder.g:275:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAutoResponder.g:295:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAutoResponder.g:295:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAutoResponder.g:296:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalAutoResponder.g:302:1: ruleStringLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:308:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalAutoResponder.g:309:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalAutoResponder.g:309:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalAutoResponder.g:310:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalAutoResponder.g:310:3: (lv_val_0_0= RULE_STRING )
            // InternalAutoResponder.g:311:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleStringVariableDeclaration"
    // InternalAutoResponder.g:330:1: entryRuleStringVariableDeclaration returns [EObject current=null] : iv_ruleStringVariableDeclaration= ruleStringVariableDeclaration EOF ;
    public final EObject entryRuleStringVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariableDeclaration = null;


        try {
            // InternalAutoResponder.g:330:66: (iv_ruleStringVariableDeclaration= ruleStringVariableDeclaration EOF )
            // InternalAutoResponder.g:331:2: iv_ruleStringVariableDeclaration= ruleStringVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStringVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVariableDeclaration=ruleStringVariableDeclaration();

            state._fsp--;

             current =iv_ruleStringVariableDeclaration; 
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
    // $ANTLR end "entryRuleStringVariableDeclaration"


    // $ANTLR start "ruleStringVariableDeclaration"
    // InternalAutoResponder.g:337:1: ruleStringVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:343:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) ) )
            // InternalAutoResponder.g:344:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // InternalAutoResponder.g:344:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) ) )
            // InternalAutoResponder.g:345:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_string_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStringVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalAutoResponder.g:349:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAutoResponder.g:350:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAutoResponder.g:350:4: (lv_name_1_0= RULE_ID )
            // InternalAutoResponder.g:351:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStringVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalAutoResponder.g:371:3: ( (lv_string_3_0= RULE_STRING ) )
            // InternalAutoResponder.g:372:4: (lv_string_3_0= RULE_STRING )
            {
            // InternalAutoResponder.g:372:4: (lv_string_3_0= RULE_STRING )
            // InternalAutoResponder.g:373:5: lv_string_3_0= RULE_STRING
            {
            lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_string_3_0, grammarAccess.getStringVariableDeclarationAccess().getStringSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStringVariableDeclaration"


    // $ANTLR start "entryRuleStringVarExpression"
    // InternalAutoResponder.g:393:1: entryRuleStringVarExpression returns [EObject current=null] : iv_ruleStringVarExpression= ruleStringVarExpression EOF ;
    public final EObject entryRuleStringVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVarExpression = null;


        try {
            // InternalAutoResponder.g:393:60: (iv_ruleStringVarExpression= ruleStringVarExpression EOF )
            // InternalAutoResponder.g:394:2: iv_ruleStringVarExpression= ruleStringVarExpression EOF
            {
             newCompositeNode(grammarAccess.getStringVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVarExpression=ruleStringVarExpression();

            state._fsp--;

             current =iv_ruleStringVarExpression; 
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
    // $ANTLR end "entryRuleStringVarExpression"


    // $ANTLR start "ruleStringVarExpression"
    // InternalAutoResponder.g:400:1: ruleStringVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStringVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:406:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAutoResponder.g:407:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAutoResponder.g:407:2: ( (otherlv_0= RULE_ID ) )
            // InternalAutoResponder.g:408:3: (otherlv_0= RULE_ID )
            {
            // InternalAutoResponder.g:408:3: (otherlv_0= RULE_ID )
            // InternalAutoResponder.g:409:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getStringVarExpressionAccess().getVarStringVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleStringVarExpression"


    // $ANTLR start "entryRuleStringExpression"
    // InternalAutoResponder.g:423:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalAutoResponder.g:423:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalAutoResponder.g:424:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalAutoResponder.g:430:1: ruleStringExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringVarExpression_1= ruleStringVarExpression ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringVarExpression_1 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:436:2: ( (this_StringLiteral_0= ruleStringLiteral | this_StringVarExpression_1= ruleStringVarExpression ) )
            // InternalAutoResponder.g:437:2: (this_StringLiteral_0= ruleStringLiteral | this_StringVarExpression_1= ruleStringVarExpression )
            {
            // InternalAutoResponder.g:437:2: (this_StringLiteral_0= ruleStringLiteral | this_StringVarExpression_1= ruleStringVarExpression )
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
                    // InternalAutoResponder.g:438:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getStringExpressionAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:447:3: this_StringVarExpression_1= ruleStringVarExpression
                    {

                    			newCompositeNode(grammarAccess.getStringExpressionAccess().getStringVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVarExpression_1=ruleStringVarExpression();

                    state._fsp--;


                    			current = this_StringVarExpression_1;
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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleTriggerStatement"
    // InternalAutoResponder.g:459:1: entryRuleTriggerStatement returns [EObject current=null] : iv_ruleTriggerStatement= ruleTriggerStatement EOF ;
    public final EObject entryRuleTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerStatement = null;


        try {
            // InternalAutoResponder.g:459:57: (iv_ruleTriggerStatement= ruleTriggerStatement EOF )
            // InternalAutoResponder.g:460:2: iv_ruleTriggerStatement= ruleTriggerStatement EOF
            {
             newCompositeNode(grammarAccess.getTriggerStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerStatement=ruleTriggerStatement();

            state._fsp--;

             current =iv_ruleTriggerStatement; 
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
    // $ANTLR end "entryRuleTriggerStatement"


    // $ANTLR start "ruleTriggerStatement"
    // InternalAutoResponder.g:466:1: ruleTriggerStatement returns [EObject current=null] : (otherlv_0= 'Input' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (lv_statement_6_0= ruleActivityStatement ) ) ) ;
    public final EObject ruleTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statement_6_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:472:2: ( (otherlv_0= 'Input' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (lv_statement_6_0= ruleActivityStatement ) ) ) )
            // InternalAutoResponder.g:473:2: (otherlv_0= 'Input' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (lv_statement_6_0= ruleActivityStatement ) ) )
            {
            // InternalAutoResponder.g:473:2: (otherlv_0= 'Input' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (lv_statement_6_0= ruleActivityStatement ) ) )
            // InternalAutoResponder.g:474:3: otherlv_0= 'Input' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (lv_statement_6_0= ruleActivityStatement ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerStatementAccess().getInputKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAutoResponder.g:482:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAutoResponder.g:483:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAutoResponder.g:483:4: (lv_name_2_0= RULE_ID )
            // InternalAutoResponder.g:484:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTriggerStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getTriggerStatementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerStatementAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalAutoResponder.g:508:3: ( (otherlv_5= RULE_ID ) )
            // InternalAutoResponder.g:509:4: (otherlv_5= RULE_ID )
            {
            // InternalAutoResponder.g:509:4: (otherlv_5= RULE_ID )
            // InternalAutoResponder.g:510:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerStatementRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getTriggerStatementAccess().getActivityActivityStatementCrossReference_5_0());
            				

            }


            }

            // InternalAutoResponder.g:521:3: ( (lv_statement_6_0= ruleActivityStatement ) )
            // InternalAutoResponder.g:522:4: (lv_statement_6_0= ruleActivityStatement )
            {
            // InternalAutoResponder.g:522:4: (lv_statement_6_0= ruleActivityStatement )
            // InternalAutoResponder.g:523:5: lv_statement_6_0= ruleActivityStatement
            {

            					newCompositeNode(grammarAccess.getTriggerStatementAccess().getStatementActivityStatementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_6_0=ruleActivityStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerStatementRule());
            					}
            					add(
            						current,
            						"statement",
            						lv_statement_6_0,
            						"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.ActivityStatement");
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
    // $ANTLR end "ruleTriggerStatement"


    // $ANTLR start "entryRuleActivityStatement"
    // InternalAutoResponder.g:544:1: entryRuleActivityStatement returns [EObject current=null] : iv_ruleActivityStatement= ruleActivityStatement EOF ;
    public final EObject entryRuleActivityStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityStatement = null;


        try {
            // InternalAutoResponder.g:544:58: (iv_ruleActivityStatement= ruleActivityStatement EOF )
            // InternalAutoResponder.g:545:2: iv_ruleActivityStatement= ruleActivityStatement EOF
            {
             newCompositeNode(grammarAccess.getActivityStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityStatement=ruleActivityStatement();

            state._fsp--;

             current =iv_ruleActivityStatement; 
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
    // $ANTLR end "entryRuleActivityStatement"


    // $ANTLR start "ruleActivityStatement"
    // InternalAutoResponder.g:551:1: ruleActivityStatement returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on' ( (lv_last_input_4_0= ruleStringExpression ) ) otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleActivityStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_last_input_4_0 = null;

        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:557:2: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on' ( (lv_last_input_4_0= ruleStringExpression ) ) otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // InternalAutoResponder.g:558:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on' ( (lv_last_input_4_0= ruleStringExpression ) ) otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // InternalAutoResponder.g:558:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on' ( (lv_last_input_4_0= ruleStringExpression ) ) otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            // InternalAutoResponder.g:559:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'on' ( (lv_last_input_4_0= ruleStringExpression ) ) otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityStatementAccess().getActivityKeyword_0());
            		
            // InternalAutoResponder.g:563:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAutoResponder.g:564:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAutoResponder.g:564:4: (lv_name_1_0= RULE_ID )
            // InternalAutoResponder.g:565:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActivityStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityStatementAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityStatementAccess().getOnKeyword_3());
            		
            // InternalAutoResponder.g:589:3: ( (lv_last_input_4_0= ruleStringExpression ) )
            // InternalAutoResponder.g:590:4: (lv_last_input_4_0= ruleStringExpression )
            {
            // InternalAutoResponder.g:590:4: (lv_last_input_4_0= ruleStringExpression )
            // InternalAutoResponder.g:591:5: lv_last_input_4_0= ruleStringExpression
            {

            					newCompositeNode(grammarAccess.getActivityStatementAccess().getLast_inputStringExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_last_input_4_0=ruleStringExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityStatementRule());
            					}
            					set(
            						current,
            						"last_input",
            						lv_last_input_4_0,
            						"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.StringExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getActivityStatementAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAutoResponder.g:612:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)||LA4_0==14||LA4_0==18||(LA4_0>=23 && LA4_0<=24)||(LA4_0>=30 && LA4_0<=32)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAutoResponder.g:613:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalAutoResponder.g:613:4: (lv_statements_6_0= ruleStatement )
            	    // InternalAutoResponder.g:614:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getActivityStatementAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getActivityStatementAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleActivityStatement"


    // $ANTLR start "entryRuleInstructStatement"
    // InternalAutoResponder.g:639:1: entryRuleInstructStatement returns [EObject current=null] : iv_ruleInstructStatement= ruleInstructStatement EOF ;
    public final EObject entryRuleInstructStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructStatement = null;


        try {
            // InternalAutoResponder.g:639:58: (iv_ruleInstructStatement= ruleInstructStatement EOF )
            // InternalAutoResponder.g:640:2: iv_ruleInstructStatement= ruleInstructStatement EOF
            {
             newCompositeNode(grammarAccess.getInstructStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructStatement=ruleInstructStatement();

            state._fsp--;

             current =iv_ruleInstructStatement; 
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
    // $ANTLR end "entryRuleInstructStatement"


    // $ANTLR start "ruleInstructStatement"
    // InternalAutoResponder.g:646:1: ruleInstructStatement returns [EObject current=null] : (otherlv_0= 'Instruct' otherlv_1= '->' ( (lv_instruction_2_0= ruleStringExpression ) ) ) ;
    public final EObject ruleInstructStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_instruction_2_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:652:2: ( (otherlv_0= 'Instruct' otherlv_1= '->' ( (lv_instruction_2_0= ruleStringExpression ) ) ) )
            // InternalAutoResponder.g:653:2: (otherlv_0= 'Instruct' otherlv_1= '->' ( (lv_instruction_2_0= ruleStringExpression ) ) )
            {
            // InternalAutoResponder.g:653:2: (otherlv_0= 'Instruct' otherlv_1= '->' ( (lv_instruction_2_0= ruleStringExpression ) ) )
            // InternalAutoResponder.g:654:3: otherlv_0= 'Instruct' otherlv_1= '->' ( (lv_instruction_2_0= ruleStringExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructStatementAccess().getInstructKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalAutoResponder.g:662:3: ( (lv_instruction_2_0= ruleStringExpression ) )
            // InternalAutoResponder.g:663:4: (lv_instruction_2_0= ruleStringExpression )
            {
            // InternalAutoResponder.g:663:4: (lv_instruction_2_0= ruleStringExpression )
            // InternalAutoResponder.g:664:5: lv_instruction_2_0= ruleStringExpression
            {

            					newCompositeNode(grammarAccess.getInstructStatementAccess().getInstructionStringExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_instruction_2_0=ruleStringExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructStatementRule());
            					}
            					set(
            						current,
            						"instruction",
            						lv_instruction_2_0,
            						"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.StringExpression");
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
    // $ANTLR end "ruleInstructStatement"


    // $ANTLR start "entryRuleTerminationStatement"
    // InternalAutoResponder.g:685:1: entryRuleTerminationStatement returns [EObject current=null] : iv_ruleTerminationStatement= ruleTerminationStatement EOF ;
    public final EObject entryRuleTerminationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminationStatement = null;


        try {
            // InternalAutoResponder.g:685:61: (iv_ruleTerminationStatement= ruleTerminationStatement EOF )
            // InternalAutoResponder.g:686:2: iv_ruleTerminationStatement= ruleTerminationStatement EOF
            {
             newCompositeNode(grammarAccess.getTerminationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminationStatement=ruleTerminationStatement();

            state._fsp--;

             current =iv_ruleTerminationStatement; 
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
    // $ANTLR end "entryRuleTerminationStatement"


    // $ANTLR start "ruleTerminationStatement"
    // InternalAutoResponder.g:692:1: ruleTerminationStatement returns [EObject current=null] : ( (lv_state_0_0= ruleActivityState ) ) ;
    public final EObject ruleTerminationStatement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_state_0_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:698:2: ( ( (lv_state_0_0= ruleActivityState ) ) )
            // InternalAutoResponder.g:699:2: ( (lv_state_0_0= ruleActivityState ) )
            {
            // InternalAutoResponder.g:699:2: ( (lv_state_0_0= ruleActivityState ) )
            // InternalAutoResponder.g:700:3: (lv_state_0_0= ruleActivityState )
            {
            // InternalAutoResponder.g:700:3: (lv_state_0_0= ruleActivityState )
            // InternalAutoResponder.g:701:4: lv_state_0_0= ruleActivityState
            {

            				newCompositeNode(grammarAccess.getTerminationStatementAccess().getStateActivityStateEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_state_0_0=ruleActivityState();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTerminationStatementRule());
            				}
            				set(
            					current,
            					"state",
            					lv_state_0_0,
            					"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.ActivityState");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleTerminationStatement"


    // $ANTLR start "entryRuleContactStatement"
    // InternalAutoResponder.g:721:1: entryRuleContactStatement returns [EObject current=null] : iv_ruleContactStatement= ruleContactStatement EOF ;
    public final EObject entryRuleContactStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactStatement = null;


        try {
            // InternalAutoResponder.g:721:57: (iv_ruleContactStatement= ruleContactStatement EOF )
            // InternalAutoResponder.g:722:2: iv_ruleContactStatement= ruleContactStatement EOF
            {
             newCompositeNode(grammarAccess.getContactStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContactStatement=ruleContactStatement();

            state._fsp--;

             current =iv_ruleContactStatement; 
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
    // $ANTLR end "entryRuleContactStatement"


    // $ANTLR start "ruleContactStatement"
    // InternalAutoResponder.g:728:1: ruleContactStatement returns [EObject current=null] : (otherlv_0= 'transferManual' otherlv_1= '->' ( (lv_phoneNumber_2_0= ruleStringExpression ) ) ) ;
    public final EObject ruleContactStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_phoneNumber_2_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:734:2: ( (otherlv_0= 'transferManual' otherlv_1= '->' ( (lv_phoneNumber_2_0= ruleStringExpression ) ) ) )
            // InternalAutoResponder.g:735:2: (otherlv_0= 'transferManual' otherlv_1= '->' ( (lv_phoneNumber_2_0= ruleStringExpression ) ) )
            {
            // InternalAutoResponder.g:735:2: (otherlv_0= 'transferManual' otherlv_1= '->' ( (lv_phoneNumber_2_0= ruleStringExpression ) ) )
            // InternalAutoResponder.g:736:3: otherlv_0= 'transferManual' otherlv_1= '->' ( (lv_phoneNumber_2_0= ruleStringExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getContactStatementAccess().getTransferManualKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContactStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalAutoResponder.g:744:3: ( (lv_phoneNumber_2_0= ruleStringExpression ) )
            // InternalAutoResponder.g:745:4: (lv_phoneNumber_2_0= ruleStringExpression )
            {
            // InternalAutoResponder.g:745:4: (lv_phoneNumber_2_0= ruleStringExpression )
            // InternalAutoResponder.g:746:5: lv_phoneNumber_2_0= ruleStringExpression
            {

            					newCompositeNode(grammarAccess.getContactStatementAccess().getPhoneNumberStringExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_phoneNumber_2_0=ruleStringExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactStatementRule());
            					}
            					set(
            						current,
            						"phoneNumber",
            						lv_phoneNumber_2_0,
            						"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.StringExpression");
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
    // $ANTLR end "ruleContactStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalAutoResponder.g:767:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalAutoResponder.g:767:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalAutoResponder.g:768:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalAutoResponder.g:774:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:780:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalAutoResponder.g:781:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalAutoResponder.g:781:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalAutoResponder.g:782:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAutoResponder.g:790:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAutoResponder.g:791:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalAutoResponder.g:791:4: ()
            	    // InternalAutoResponder.g:792:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAutoResponder.g:798:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalAutoResponder.g:799:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalAutoResponder.g:799:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalAutoResponder.g:800:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalAutoResponder.g:800:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==25) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==26) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalAutoResponder.g:801:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,25,FOLLOW_18); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAutoResponder.g:812:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,26,FOLLOW_18); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAutoResponder.g:825:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalAutoResponder.g:826:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalAutoResponder.g:826:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalAutoResponder.g:827:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.Multiplication");
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalAutoResponder.g:849:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalAutoResponder.g:849:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalAutoResponder.g:850:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalAutoResponder.g:856:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:862:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAutoResponder.g:863:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAutoResponder.g:863:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAutoResponder.g:864:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAutoResponder.g:872:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAutoResponder.g:873:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAutoResponder.g:873:4: ()
            	    // InternalAutoResponder.g:874:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAutoResponder.g:880:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalAutoResponder.g:881:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalAutoResponder.g:881:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalAutoResponder.g:882:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalAutoResponder.g:882:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==27) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==28) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAutoResponder.g:883:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,27,FOLLOW_18); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAutoResponder.g:894:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,28,FOLLOW_18); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAutoResponder.g:907:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAutoResponder.g:908:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAutoResponder.g:908:5: (lv_right_3_0= rulePrimary )
            	    // InternalAutoResponder.g:909:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.Primary");
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalAutoResponder.g:931:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAutoResponder.g:931:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAutoResponder.g:932:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAutoResponder.g:938:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_RealLiteral_2 = null;

        EObject this_Addition_4 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:944:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) )
            // InternalAutoResponder.g:945:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            {
            // InternalAutoResponder.g:945:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==16||(LA9_1>=25 && LA9_1<=28)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==29) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 15:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAutoResponder.g:946:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:955:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAutoResponder.g:964:3: this_RealLiteral_2= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_2=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAutoResponder.g:973:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    {
                    // InternalAutoResponder.g:973:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    // InternalAutoResponder.g:974:4: otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Addition_4=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalAutoResponder.g:995:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalAutoResponder.g:995:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalAutoResponder.g:996:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalAutoResponder.g:1002:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:1008:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalAutoResponder.g:1009:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalAutoResponder.g:1009:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalAutoResponder.g:1010:3: (lv_val_0_0= RULE_INT )
            {
            // InternalAutoResponder.g:1010:3: (lv_val_0_0= RULE_INT )
            // InternalAutoResponder.g:1011:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalAutoResponder.g:1030:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalAutoResponder.g:1030:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalAutoResponder.g:1031:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalAutoResponder.g:1037:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalAutoResponder.g:1043:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalAutoResponder.g:1044:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalAutoResponder.g:1044:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalAutoResponder.g:1045:3: (lv_val_0_0= ruleREAL )
            {
            // InternalAutoResponder.g:1045:3: (lv_val_0_0= ruleREAL )
            // InternalAutoResponder.g:1046:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"uk.ac.kcl.inf.languages.autoresponder.AutoResponder.REAL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalAutoResponder.g:1066:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalAutoResponder.g:1066:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalAutoResponder.g:1067:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalAutoResponder.g:1073:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:1079:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAutoResponder.g:1080:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAutoResponder.g:1080:2: ( (otherlv_0= RULE_ID ) )
            // InternalAutoResponder.g:1081:3: (otherlv_0= RULE_ID )
            {
            // InternalAutoResponder.g:1081:3: (otherlv_0= RULE_ID )
            // InternalAutoResponder.g:1082:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalAutoResponder.g:1096:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAutoResponder.g:1098:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalAutoResponder.g:1099:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalAutoResponder.g:1108:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAutoResponder.g:1115:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalAutoResponder.g:1116:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAutoResponder.g:1116:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalAutoResponder.g:1117:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalAutoResponder.g:1117:3: (this_INT_0= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAutoResponder.g:1118:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleActivityState"
    // InternalAutoResponder.g:1145:1: ruleActivityState returns [Enumerator current=null] : ( (enumLiteral_0= 'back' ) | (enumLiteral_1= 'repeat' ) | (enumLiteral_2= 'exit' ) ) ;
    public final Enumerator ruleActivityState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAutoResponder.g:1151:2: ( ( (enumLiteral_0= 'back' ) | (enumLiteral_1= 'repeat' ) | (enumLiteral_2= 'exit' ) ) )
            // InternalAutoResponder.g:1152:2: ( (enumLiteral_0= 'back' ) | (enumLiteral_1= 'repeat' ) | (enumLiteral_2= 'exit' ) )
            {
            // InternalAutoResponder.g:1152:2: ( (enumLiteral_0= 'back' ) | (enumLiteral_1= 'repeat' ) | (enumLiteral_2= 'exit' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAutoResponder.g:1153:3: (enumLiteral_0= 'back' )
                    {
                    // InternalAutoResponder.g:1153:3: (enumLiteral_0= 'back' )
                    // InternalAutoResponder.g:1154:4: enumLiteral_0= 'back'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActivityStateAccess().getBackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivityStateAccess().getBackEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAutoResponder.g:1161:3: (enumLiteral_1= 'repeat' )
                    {
                    // InternalAutoResponder.g:1161:3: (enumLiteral_1= 'repeat' )
                    // InternalAutoResponder.g:1162:4: enumLiteral_1= 'repeat'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActivityStateAccess().getRepeatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivityStateAccess().getRepeatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAutoResponder.g:1169:3: (enumLiteral_2= 'exit' )
                    {
                    // InternalAutoResponder.g:1169:3: (enumLiteral_2= 'exit' )
                    // InternalAutoResponder.g:1170:4: enumLiteral_2= 'exit'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActivityStateAccess().getExitEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivityStateAccess().getExitEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleActivityState"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\13\6\uffff\1\5\1\15\1\4\2\uffff";
    static final String dfa_3s = "\1\40\6\uffff\1\5\1\15\1\6\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\10\1\7";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\7\1\uffff\1\1\3\uffff\1\2\4\uffff\1\3\1\6\5\uffff\3\5",
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
            return "115:2: (this_TriggerStatement_0= ruleTriggerStatement | this_ActivityStatement_1= ruleActivityStatement | this_InstructStatement_2= ruleInstructStatement | this_HearStatement_3= ruleHearStatement | this_TerminationStatement_4= ruleTerminationStatement | this_ContactStatement_5= ruleContactStatement | this_VariableDeclaration_6= ruleVariableDeclaration | this_StringVariableDeclaration_7= ruleStringVariableDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001C1845802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001C1C45800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020008030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}