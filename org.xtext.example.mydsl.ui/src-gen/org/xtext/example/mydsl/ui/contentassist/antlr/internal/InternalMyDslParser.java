package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HALF_DAILY'", "'DAILY'", "'WEEKLY'", "'MONTHLY'", "'LABOUR'", "'SEMIS'", "'IRRIGATION'", "'FERTILISATION'", "'RECOLTE'", "'ALIMENTATION'", "'TRAITE'", "'SURVEILLANCE_AGNELAGE'", "'SURVEILLANCE_VELAGE'", "'JANUARY'", "'FEBRARY'", "'MARCH'", "'APRIL'", "'MAY'", "'JUNE'", "'JULY'", "'AUGUST'", "'SEPTEMBER'", "'OCTOBER'", "'NOVEMBER'", "'DECEMBER'", "'OVIN'", "'BOVIN'", "'CORN'", "'WHEAT'", "'SORGHUM'", "'Activity'", "'{'", "'fin'", "'debut'", "'}'", "'periodicite'", "'activites'", "'atelier'", "'('", "')'", "','", "'res_alloc'", "'rule'", "'Res_Alloc'", "'duration'", "'res_type'", "'Rule'", "'predicat'", "'Date'", "'day'", "'month'", "'-'", "'ResourceType'", "'resource'", "'Elevage'", "'animals'", "'activity'", "'Culture'", "'cereals'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleActivity"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleActivity EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity61);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity68); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Activity__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Activity__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Activity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity94);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleRes_Alloc"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: entryRuleRes_Alloc : ruleRes_Alloc EOF ;
    public final void entryRuleRes_Alloc() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: ( ruleRes_Alloc EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: ruleRes_Alloc EOF
            {
             before(grammarAccess.getRes_AllocRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc123);
            ruleRes_Alloc();

            state._fsp--;

             after(grammarAccess.getRes_AllocRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRes_Alloc130); 

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
    // $ANTLR end "entryRuleRes_Alloc"


    // $ANTLR start "ruleRes_Alloc"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:99:1: ruleRes_Alloc : ( ( rule__Res_Alloc__Group__0 ) ) ;
    public final void ruleRes_Alloc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:2: ( ( ( rule__Res_Alloc__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__Res_Alloc__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__Res_Alloc__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( rule__Res_Alloc__Group__0 )
            {
             before(grammarAccess.getRes_AllocAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( rule__Res_Alloc__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:2: rule__Res_Alloc__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__0_in_ruleRes_Alloc156);
            rule__Res_Alloc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRes_AllocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRes_Alloc"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ( ruleRule EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule183);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule190); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:127:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rule__Rule__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule216);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( ruleDate EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate243);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate250); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__Date__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate276);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleEIntegerObject EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject303);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject310); 

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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__EIntegerObject__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__EIntegerObject__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:2: rule__EIntegerObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject336);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleResourceType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: entryRuleResourceType : ruleResourceType EOF ;
    public final void entryRuleResourceType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ruleResourceType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ruleResourceType EOF
            {
             before(grammarAccess.getResourceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_entryRuleResourceType363);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getResourceTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceType370); 

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
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleResourceType : ( ( rule__ResourceType__Group__0 ) ) ;
    public final void ruleResourceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:2: ( ( ( rule__ResourceType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__ResourceType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__ResourceType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__ResourceType__Group__0 )
            {
             before(grammarAccess.getResourceTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__ResourceType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:2: rule__ResourceType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__0_in_ruleResourceType396);
            rule__ResourceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString423);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString430); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString456);
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


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: entryRuleElevage : ruleElevage EOF ;
    public final void entryRuleElevage() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( ruleElevage EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ruleElevage EOF
            {
             before(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage487);
            ruleElevage();

            state._fsp--;

             after(grammarAccess.getElevageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage494); 

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
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ruleElevage : ( ( rule__Elevage__Group__0 ) ) ;
    public final void ruleElevage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:2: ( ( ( rule__Elevage__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( ( rule__Elevage__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( ( rule__Elevage__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:277:1: ( rule__Elevage__Group__0 )
            {
             before(grammarAccess.getElevageAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:278:1: ( rule__Elevage__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:278:2: rule__Elevage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0_in_ruleElevage520);
            rule__Elevage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:291:1: ( ruleCulture EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture547);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture554); 

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
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( rule__Culture__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( rule__Culture__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:306:2: rule__Culture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0_in_ruleCulture580);
            rule__Culture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCulture"


    // $ANTLR start "rulePeriodicite"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: rulePeriodicite : ( ( rule__Periodicite__Alternatives ) ) ;
    public final void rulePeriodicite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( ( ( rule__Periodicite__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ( ( rule__Periodicite__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ( ( rule__Periodicite__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( rule__Periodicite__Alternatives )
            {
             before(grammarAccess.getPeriodiciteAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( rule__Periodicite__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:2: rule__Periodicite__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Periodicite__Alternatives_in_rulePeriodicite617);
            rule__Periodicite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPeriodiciteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePeriodicite"


    // $ANTLR start "ruleActivites"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:338:1: ruleActivites : ( ( rule__Activites__Alternatives ) ) ;
    public final void ruleActivites() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( ( ( rule__Activites__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( ( rule__Activites__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( ( rule__Activites__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( rule__Activites__Alternatives )
            {
             before(grammarAccess.getActivitesAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( rule__Activites__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:2: rule__Activites__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activites__Alternatives_in_ruleActivites653);
            rule__Activites__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivitesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivites"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: ( ( rule__Month__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( rule__Month__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:364:2: rule__Month__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Month__Alternatives_in_ruleMonth689);
            rule__Month__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleAnimals"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ruleAnimals : ( ( rule__Animals__Alternatives ) ) ;
    public final void ruleAnimals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:380:1: ( ( ( rule__Animals__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:1: ( ( rule__Animals__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:1: ( ( rule__Animals__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( rule__Animals__Alternatives )
            {
             before(grammarAccess.getAnimalsAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__Animals__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:2: rule__Animals__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animals__Alternatives_in_ruleAnimals725);
            rule__Animals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimalsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimals"


    // $ANTLR start "ruleCereal"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: ruleCereal : ( ( rule__Cereal__Alternatives ) ) ;
    public final void ruleCereal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ( ( ( rule__Cereal__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ( rule__Cereal__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ( rule__Cereal__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( rule__Cereal__Alternatives )
            {
             before(grammarAccess.getCerealAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( rule__Cereal__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:2: rule__Cereal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Cereal__Alternatives_in_ruleCereal761);
            rule__Cereal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCerealAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCereal"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives797); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives814); 
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


    // $ANTLR start "rule__Periodicite__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: rule__Periodicite__Alternatives : ( ( ( 'HALF_DAILY' ) ) | ( ( 'DAILY' ) ) | ( ( 'WEEKLY' ) ) | ( ( 'MONTHLY' ) ) );
    public final void rule__Periodicite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( ( ( 'HALF_DAILY' ) ) | ( ( 'DAILY' ) ) | ( ( 'WEEKLY' ) ) | ( ( 'MONTHLY' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( 'HALF_DAILY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( 'HALF_DAILY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( 'HALF_DAILY' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getHALF_DAILYEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( 'HALF_DAILY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:3: 'HALF_DAILY'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Periodicite__Alternatives847); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getHALF_DAILYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:6: ( ( 'DAILY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:6: ( ( 'DAILY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( 'DAILY' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getDAILYEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( 'DAILY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:450:3: 'DAILY'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Periodicite__Alternatives868); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getDAILYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:6: ( ( 'WEEKLY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:6: ( ( 'WEEKLY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( 'WEEKLY' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getWEEKLYEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( 'WEEKLY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:3: 'WEEKLY'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Periodicite__Alternatives889); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getWEEKLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:6: ( ( 'MONTHLY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:6: ( ( 'MONTHLY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: ( 'MONTHLY' )
                    {
                     before(grammarAccess.getPeriodiciteAccess().getMONTHLYEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( 'MONTHLY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:3: 'MONTHLY'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Periodicite__Alternatives910); 

                    }

                     after(grammarAccess.getPeriodiciteAccess().getMONTHLYEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Periodicite__Alternatives"


    // $ANTLR start "rule__Activites__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: rule__Activites__Alternatives : ( ( ( 'LABOUR' ) ) | ( ( 'SEMIS' ) ) | ( ( 'IRRIGATION' ) ) | ( ( 'FERTILISATION' ) ) | ( ( 'RECOLTE' ) ) | ( ( 'ALIMENTATION' ) ) | ( ( 'TRAITE' ) ) | ( ( 'SURVEILLANCE_AGNELAGE' ) ) | ( ( 'SURVEILLANCE_VELAGE' ) ) );
    public final void rule__Activites__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( ( ( 'LABOUR' ) ) | ( ( 'SEMIS' ) ) | ( ( 'IRRIGATION' ) ) | ( ( 'FERTILISATION' ) ) | ( ( 'RECOLTE' ) ) | ( ( 'ALIMENTATION' ) ) | ( ( 'TRAITE' ) ) | ( ( 'SURVEILLANCE_AGNELAGE' ) ) | ( ( 'SURVEILLANCE_VELAGE' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            case 22:
                {
                alt3=8;
                }
                break;
            case 23:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( ( 'LABOUR' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( ( 'LABOUR' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: ( 'LABOUR' )
                    {
                     before(grammarAccess.getActivitesAccess().getLABOUREnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( 'LABOUR' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:3: 'LABOUR'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Activites__Alternatives946); 

                    }

                     after(grammarAccess.getActivitesAccess().getLABOUREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:6: ( ( 'SEMIS' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:486:6: ( ( 'SEMIS' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: ( 'SEMIS' )
                    {
                     before(grammarAccess.getActivitesAccess().getSEMISEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( 'SEMIS' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:488:3: 'SEMIS'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Activites__Alternatives967); 

                    }

                     after(grammarAccess.getActivitesAccess().getSEMISEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:6: ( ( 'IRRIGATION' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:6: ( ( 'IRRIGATION' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( 'IRRIGATION' )
                    {
                     before(grammarAccess.getActivitesAccess().getIRRIGATIONEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( 'IRRIGATION' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:3: 'IRRIGATION'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Activites__Alternatives988); 

                    }

                     after(grammarAccess.getActivitesAccess().getIRRIGATIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:6: ( ( 'FERTILISATION' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:6: ( ( 'FERTILISATION' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( 'FERTILISATION' )
                    {
                     before(grammarAccess.getActivitesAccess().getFERTILISATIONEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: ( 'FERTILISATION' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:3: 'FERTILISATION'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Activites__Alternatives1009); 

                    }

                     after(grammarAccess.getActivitesAccess().getFERTILISATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:507:6: ( ( 'RECOLTE' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:507:6: ( ( 'RECOLTE' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: ( 'RECOLTE' )
                    {
                     before(grammarAccess.getActivitesAccess().getRECOLTEEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( 'RECOLTE' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:3: 'RECOLTE'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Activites__Alternatives1030); 

                    }

                     after(grammarAccess.getActivitesAccess().getRECOLTEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:6: ( ( 'ALIMENTATION' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:6: ( ( 'ALIMENTATION' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( 'ALIMENTATION' )
                    {
                     before(grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( 'ALIMENTATION' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:3: 'ALIMENTATION'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Activites__Alternatives1051); 

                    }

                     after(grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:6: ( ( 'TRAITE' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:6: ( ( 'TRAITE' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( 'TRAITE' )
                    {
                     before(grammarAccess.getActivitesAccess().getTRAITEEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( 'TRAITE' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:3: 'TRAITE'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Activites__Alternatives1072); 

                    }

                     after(grammarAccess.getActivitesAccess().getTRAITEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:6: ( ( 'SURVEILLANCE_AGNELAGE' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:6: ( ( 'SURVEILLANCE_AGNELAGE' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( 'SURVEILLANCE_AGNELAGE' )
                    {
                     before(grammarAccess.getActivitesAccess().getSURVEILLANCE_AGNELAGEEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: ( 'SURVEILLANCE_AGNELAGE' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:3: 'SURVEILLANCE_AGNELAGE'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Activites__Alternatives1093); 

                    }

                     after(grammarAccess.getActivitesAccess().getSURVEILLANCE_AGNELAGEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:6: ( ( 'SURVEILLANCE_VELAGE' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:6: ( ( 'SURVEILLANCE_VELAGE' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( 'SURVEILLANCE_VELAGE' )
                    {
                     before(grammarAccess.getActivitesAccess().getSURVEILLANCE_VELAGEEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( 'SURVEILLANCE_VELAGE' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:3: 'SURVEILLANCE_VELAGE'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Activites__Alternatives1114); 

                    }

                     after(grammarAccess.getActivitesAccess().getSURVEILLANCE_VELAGEEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__Activites__Alternatives"


    // $ANTLR start "rule__Month__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: rule__Month__Alternatives : ( ( ( 'JANUARY' ) ) | ( ( 'FEBRARY' ) ) | ( ( 'MARCH' ) ) | ( ( 'APRIL' ) ) | ( ( 'MAY' ) ) | ( ( 'JUNE' ) ) | ( ( 'JULY' ) ) | ( ( 'AUGUST' ) ) | ( ( 'SEPTEMBER' ) ) | ( ( 'OCTOBER' ) ) | ( ( 'NOVEMBER' ) ) | ( ( 'DECEMBER' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( ( 'JANUARY' ) ) | ( ( 'FEBRARY' ) ) | ( ( 'MARCH' ) ) | ( ( 'APRIL' ) ) | ( ( 'MAY' ) ) | ( ( 'JUNE' ) ) | ( ( 'JULY' ) ) | ( ( 'AUGUST' ) ) | ( ( 'SEPTEMBER' ) ) | ( ( 'OCTOBER' ) ) | ( ( 'NOVEMBER' ) ) | ( ( 'DECEMBER' ) ) )
            int alt4=12;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            case 29:
                {
                alt4=6;
                }
                break;
            case 30:
                {
                alt4=7;
                }
                break;
            case 31:
                {
                alt4=8;
                }
                break;
            case 32:
                {
                alt4=9;
                }
                break;
            case 33:
                {
                alt4=10;
                }
                break;
            case 34:
                {
                alt4=11;
                }
                break;
            case 35:
                {
                alt4=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( 'JANUARY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( 'JANUARY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( 'JANUARY' )
                    {
                     before(grammarAccess.getMonthAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( 'JANUARY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:3: 'JANUARY'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Month__Alternatives1150); 

                    }

                     after(grammarAccess.getMonthAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:6: ( ( 'FEBRARY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:6: ( ( 'FEBRARY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( 'FEBRARY' )
                    {
                     before(grammarAccess.getMonthAccess().getFEBRARYEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ( 'FEBRARY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:3: 'FEBRARY'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Month__Alternatives1171); 

                    }

                     after(grammarAccess.getMonthAccess().getFEBRARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:6: ( ( 'MARCH' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:6: ( ( 'MARCH' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( 'MARCH' )
                    {
                     before(grammarAccess.getMonthAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( 'MARCH' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:3: 'MARCH'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Month__Alternatives1192); 

                    }

                     after(grammarAccess.getMonthAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:6: ( ( 'APRIL' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:6: ( ( 'APRIL' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ( 'APRIL' )
                    {
                     before(grammarAccess.getMonthAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( 'APRIL' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:3: 'APRIL'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Month__Alternatives1213); 

                    }

                     after(grammarAccess.getMonthAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:6: ( ( 'MAY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:6: ( ( 'MAY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( 'MAY' )
                    {
                     before(grammarAccess.getMonthAccess().getMAYEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( 'MAY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:3: 'MAY'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Month__Alternatives1234); 

                    }

                     after(grammarAccess.getMonthAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:587:6: ( ( 'JUNE' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:587:6: ( ( 'JUNE' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( 'JUNE' )
                    {
                     before(grammarAccess.getMonthAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( 'JUNE' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:3: 'JUNE'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Month__Alternatives1255); 

                    }

                     after(grammarAccess.getMonthAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:6: ( ( 'JULY' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:6: ( ( 'JULY' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( 'JULY' )
                    {
                     before(grammarAccess.getMonthAccess().getJULYEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( 'JULY' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:3: 'JULY'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Month__Alternatives1276); 

                    }

                     after(grammarAccess.getMonthAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:6: ( ( 'AUGUST' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:6: ( ( 'AUGUST' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ( 'AUGUST' )
                    {
                     before(grammarAccess.getMonthAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ( 'AUGUST' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:3: 'AUGUST'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Month__Alternatives1297); 

                    }

                     after(grammarAccess.getMonthAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:6: ( ( 'SEPTEMBER' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:6: ( ( 'SEPTEMBER' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( 'SEPTEMBER' )
                    {
                     before(grammarAccess.getMonthAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( 'SEPTEMBER' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:3: 'SEPTEMBER'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Month__Alternatives1318); 

                    }

                     after(grammarAccess.getMonthAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:615:6: ( ( 'OCTOBER' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:615:6: ( ( 'OCTOBER' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: ( 'OCTOBER' )
                    {
                     before(grammarAccess.getMonthAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( 'OCTOBER' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:3: 'OCTOBER'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Month__Alternatives1339); 

                    }

                     after(grammarAccess.getMonthAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:6: ( ( 'NOVEMBER' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:6: ( ( 'NOVEMBER' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( 'NOVEMBER' )
                    {
                     before(grammarAccess.getMonthAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( 'NOVEMBER' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:3: 'NOVEMBER'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Month__Alternatives1360); 

                    }

                     after(grammarAccess.getMonthAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ( 'DECEMBER' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ( 'DECEMBER' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( 'DECEMBER' )
                    {
                     before(grammarAccess.getMonthAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( 'DECEMBER' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:3: 'DECEMBER'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Month__Alternatives1381); 

                    }

                     after(grammarAccess.getMonthAccess().getDECEMBEREnumLiteralDeclaration_11()); 

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
    // $ANTLR end "rule__Month__Alternatives"


    // $ANTLR start "rule__Animals__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: rule__Animals__Alternatives : ( ( ( 'OVIN' ) ) | ( ( 'BOVIN' ) ) );
    public final void rule__Animals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( ( ( 'OVIN' ) ) | ( ( 'BOVIN' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( 'OVIN' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( 'OVIN' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( 'OVIN' )
                    {
                     before(grammarAccess.getAnimalsAccess().getOVINEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( 'OVIN' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:3: 'OVIN'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Animals__Alternatives1417); 

                    }

                     after(grammarAccess.getAnimalsAccess().getOVINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:6: ( ( 'BOVIN' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:6: ( ( 'BOVIN' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ( 'BOVIN' )
                    {
                     before(grammarAccess.getAnimalsAccess().getBOVINEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( 'BOVIN' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:655:3: 'BOVIN'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__Animals__Alternatives1438); 

                    }

                     after(grammarAccess.getAnimalsAccess().getBOVINEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Animals__Alternatives"


    // $ANTLR start "rule__Cereal__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: rule__Cereal__Alternatives : ( ( ( 'CORN' ) ) | ( ( 'WHEAT' ) ) | ( ( 'SORGHUM' ) ) );
    public final void rule__Cereal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( ( ( 'CORN' ) ) | ( ( 'WHEAT' ) ) | ( ( 'SORGHUM' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( ( 'CORN' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( ( 'CORN' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( 'CORN' )
                    {
                     before(grammarAccess.getCerealAccess().getCORNEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( 'CORN' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:3: 'CORN'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__Cereal__Alternatives1474); 

                    }

                     after(grammarAccess.getCerealAccess().getCORNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:6: ( ( 'WHEAT' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:6: ( ( 'WHEAT' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( 'WHEAT' )
                    {
                     before(grammarAccess.getCerealAccess().getWHEATEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( 'WHEAT' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:3: 'WHEAT'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_rule__Cereal__Alternatives1495); 

                    }

                     after(grammarAccess.getCerealAccess().getWHEATEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:684:6: ( ( 'SORGHUM' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:684:6: ( ( 'SORGHUM' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( 'SORGHUM' )
                    {
                     before(grammarAccess.getCerealAccess().getSORGHUMEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( 'SORGHUM' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:3: 'SORGHUM'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__Cereal__Alternatives1516); 

                    }

                     after(grammarAccess.getCerealAccess().getSORGHUMEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Cereal__Alternatives"


    // $ANTLR start "rule__Activity__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:703:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01549);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__01552);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( ( 'Activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( 'Activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( 'Activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Activity__Group__0__Impl1580); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__11611);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__11614);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: rule__Activity__Group__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Activity__Group__1__Impl1642); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21673);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21676);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__Group_2__0 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( ( ( rule__Activity__Group_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( ( rule__Activity__Group_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( ( rule__Activity__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( rule__Activity__Group_2__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( rule__Activity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==46) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:2: rule__Activity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__0_in_rule__Activity__Group__2__Impl1703);
                    rule__Activity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31734);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31737);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 )? ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( ( ( rule__Activity__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( ( rule__Activity__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( ( rule__Activity__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( rule__Activity__Group_3__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: ( rule__Activity__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:808:2: rule__Activity__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl1764);
                    rule__Activity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:823:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41795);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__41798);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( rule__Activity__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl1825);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__51856);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__51859);
            rule__Activity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( ( rule__Activity__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ( rule__Activity__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==52) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl1886);
                    rule__Activity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__61917);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__61920);
            rule__Activity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( ( rule__Activity__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( rule__Activity__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl1947);
                    rule__Activity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__71978);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__71981);
            rule__Activity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: rule__Activity__Group__7__Impl : ( 'fin' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( ( 'fin' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( 'fin' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( 'fin' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: 'fin'
            {
             before(grammarAccess.getActivityAccess().getFinKeyword_7()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Activity__Group__7__Impl2009); 
             after(grammarAccess.getActivityAccess().getFinKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__82040);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__82043);
            rule__Activity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__FinAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( ( rule__Activity__FinAssignment_8 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( rule__Activity__FinAssignment_8 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( rule__Activity__FinAssignment_8 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__Activity__FinAssignment_8 )
            {
             before(grammarAccess.getActivityAccess().getFinAssignment_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__Activity__FinAssignment_8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__Activity__FinAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__FinAssignment_8_in_rule__Activity__Group__8__Impl2070);
            rule__Activity__FinAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getFinAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__92100);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__92103);
            rule__Activity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9"


    // $ANTLR start "rule__Activity__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: rule__Activity__Group__9__Impl : ( 'debut' ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ( 'debut' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( 'debut' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( 'debut' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: 'debut'
            {
             before(grammarAccess.getActivityAccess().getDebutKeyword_9()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Activity__Group__9__Impl2131); 
             after(grammarAccess.getActivityAccess().getDebutKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9__Impl"


    // $ANTLR start "rule__Activity__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__102162);
            rule__Activity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__102165);
            rule__Activity__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10"


    // $ANTLR start "rule__Activity__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__DebutAssignment_10 ) ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ( ( rule__Activity__DebutAssignment_10 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ( rule__Activity__DebutAssignment_10 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ( rule__Activity__DebutAssignment_10 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( rule__Activity__DebutAssignment_10 )
            {
             before(grammarAccess.getActivityAccess().getDebutAssignment_10()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( rule__Activity__DebutAssignment_10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:2: rule__Activity__DebutAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__DebutAssignment_10_in_rule__Activity__Group__10__Impl2192);
            rule__Activity__DebutAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDebutAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10__Impl"


    // $ANTLR start "rule__Activity__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( rule__Activity__Group__11__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:2: rule__Activity__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__112222);
            rule__Activity__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11"


    // $ANTLR start "rule__Activity__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: rule__Activity__Group__11__Impl : ( '}' ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Activity__Group__11__Impl2250); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11__Impl"


    // $ANTLR start "rule__Activity__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: rule__Activity__Group_2__0 : rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 ;
    public final void rule__Activity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:2: rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__0__Impl_in_rule__Activity__Group_2__02305);
            rule__Activity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__1_in_rule__Activity__Group_2__02308);
            rule__Activity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__0"


    // $ANTLR start "rule__Activity__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: rule__Activity__Group_2__0__Impl : ( 'periodicite' ) ;
    public final void rule__Activity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( ( 'periodicite' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( 'periodicite' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( 'periodicite' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: 'periodicite'
            {
             before(grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Activity__Group_2__0__Impl2336); 
             after(grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: rule__Activity__Group_2__1 : rule__Activity__Group_2__1__Impl ;
    public final void rule__Activity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( rule__Activity__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:2: rule__Activity__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__1__Impl_in_rule__Activity__Group_2__12367);
            rule__Activity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__1"


    // $ANTLR start "rule__Activity__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: rule__Activity__Group_2__1__Impl : ( ( rule__Activity__PeriodiciteAssignment_2_1 ) ) ;
    public final void rule__Activity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( ( ( rule__Activity__PeriodiciteAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( ( rule__Activity__PeriodiciteAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( ( rule__Activity__PeriodiciteAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( rule__Activity__PeriodiciteAssignment_2_1 )
            {
             before(grammarAccess.getActivityAccess().getPeriodiciteAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__Activity__PeriodiciteAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:2: rule__Activity__PeriodiciteAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PeriodiciteAssignment_2_1_in_rule__Activity__Group_2__1__Impl2394);
            rule__Activity__PeriodiciteAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getPeriodiciteAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02428);
            rule__Activity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02431);
            rule__Activity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__0"


    // $ANTLR start "rule__Activity__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: rule__Activity__Group_3__0__Impl : ( 'activites' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( ( 'activites' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( 'activites' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( 'activites' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: 'activites'
            {
             before(grammarAccess.getActivityAccess().getActivitesKeyword_3_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Activity__Group_3__0__Impl2459); 
             after(grammarAccess.getActivityAccess().getActivitesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( rule__Activity__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:2: rule__Activity__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12490);
            rule__Activity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__1"


    // $ANTLR start "rule__Activity__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__Activity__Group_3__1__Impl : ( ( rule__Activity__ActivitesAssignment_3_1 ) ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( ( ( rule__Activity__ActivitesAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( ( rule__Activity__ActivitesAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( ( rule__Activity__ActivitesAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( rule__Activity__ActivitesAssignment_3_1 )
            {
             before(grammarAccess.getActivityAccess().getActivitesAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__Activity__ActivitesAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:2: rule__Activity__ActivitesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__ActivitesAssignment_3_1_in_rule__Activity__Group_3__1__Impl2517);
            rule__Activity__ActivitesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getActivitesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__02551);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__02554);
            rule__Activity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: rule__Activity__Group_4__0__Impl : ( 'atelier' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( ( 'atelier' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( 'atelier' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( 'atelier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: 'atelier'
            {
             before(grammarAccess.getActivityAccess().getAtelierKeyword_4_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Activity__Group_4__0__Impl2582); 
             after(grammarAccess.getActivityAccess().getAtelierKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__12613);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__12616);
            rule__Activity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: rule__Activity__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: '('
            {
             before(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Activity__Group_4__1__Impl2644); 
             after(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:2: rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__22675);
            rule__Activity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__3_in_rule__Activity__Group_4__22678);
            rule__Activity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__2"


    // $ANTLR start "rule__Activity__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:1: rule__Activity__Group_4__2__Impl : ( ( rule__Activity__AtelierAssignment_4_2 ) ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: ( ( ( rule__Activity__AtelierAssignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( rule__Activity__AtelierAssignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( rule__Activity__AtelierAssignment_4_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( rule__Activity__AtelierAssignment_4_2 )
            {
             before(grammarAccess.getActivityAccess().getAtelierAssignment_4_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( rule__Activity__AtelierAssignment_4_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:2: rule__Activity__AtelierAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__AtelierAssignment_4_2_in_rule__Activity__Group_4__2__Impl2705);
            rule__Activity__AtelierAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAtelierAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__2__Impl"


    // $ANTLR start "rule__Activity__Group_4__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: rule__Activity__Group_4__3 : rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4 ;
    public final void rule__Activity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:2: rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__3__Impl_in_rule__Activity__Group_4__32735);
            rule__Activity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__4_in_rule__Activity__Group_4__32738);
            rule__Activity__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__3"


    // $ANTLR start "rule__Activity__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: rule__Activity__Group_4__3__Impl : ( ( rule__Activity__Group_4_3__0 )* ) ;
    public final void rule__Activity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ( ( ( rule__Activity__Group_4_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: ( ( rule__Activity__Group_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: ( ( rule__Activity__Group_4_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: ( rule__Activity__Group_4_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( rule__Activity__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==51) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:2: rule__Activity__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__0_in_rule__Activity__Group_4__3__Impl2765);
            	    rule__Activity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__3__Impl"


    // $ANTLR start "rule__Activity__Group_4__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__Activity__Group_4__4 : rule__Activity__Group_4__4__Impl ;
    public final void rule__Activity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( rule__Activity__Group_4__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:2: rule__Activity__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4__4__Impl_in_rule__Activity__Group_4__42796);
            rule__Activity__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__4"


    // $ANTLR start "rule__Activity__Group_4__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: rule__Activity__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Activity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ')'
            {
             before(grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Activity__Group_4__4__Impl2824); 
             after(grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4__4__Impl"


    // $ANTLR start "rule__Activity__Group_4_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: rule__Activity__Group_4_3__0 : rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1 ;
    public final void rule__Activity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:2: rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__0__Impl_in_rule__Activity__Group_4_3__02865);
            rule__Activity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__1_in_rule__Activity__Group_4_3__02868);
            rule__Activity__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__0"


    // $ANTLR start "rule__Activity__Group_4_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: rule__Activity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_3_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Activity__Group_4_3__0__Impl2896); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_4_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: rule__Activity__Group_4_3__1 : rule__Activity__Group_4_3__1__Impl ;
    public final void rule__Activity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( rule__Activity__Group_4_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:2: rule__Activity__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_4_3__1__Impl_in_rule__Activity__Group_4_3__12927);
            rule__Activity__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__1"


    // $ANTLR start "rule__Activity__Group_4_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__Activity__Group_4_3__1__Impl : ( ( rule__Activity__AtelierAssignment_4_3_1 ) ) ;
    public final void rule__Activity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( ( ( rule__Activity__AtelierAssignment_4_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( ( rule__Activity__AtelierAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( ( rule__Activity__AtelierAssignment_4_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: ( rule__Activity__AtelierAssignment_4_3_1 )
            {
             before(grammarAccess.getActivityAccess().getAtelierAssignment_4_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ( rule__Activity__AtelierAssignment_4_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:2: rule__Activity__AtelierAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__AtelierAssignment_4_3_1_in_rule__Activity__Group_4_3__1__Impl2954);
            rule__Activity__AtelierAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAtelierAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__02988);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__02991);
            rule__Activity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: rule__Activity__Group_5__0__Impl : ( 'res_alloc' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: ( ( 'res_alloc' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( 'res_alloc' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( 'res_alloc' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: 'res_alloc'
            {
             before(grammarAccess.getActivityAccess().getRes_allocKeyword_5_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Activity__Group_5__0__Impl3019); 
             after(grammarAccess.getActivityAccess().getRes_allocKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13050);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13053);
            rule__Activity__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: rule__Activity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Activity__Group_5__1__Impl3081); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:2: rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23112);
            rule__Activity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__23115);
            rule__Activity__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2"


    // $ANTLR start "rule__Activity__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__Res_allocAssignment_5_2 ) ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( ( ( rule__Activity__Res_allocAssignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( ( rule__Activity__Res_allocAssignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( ( rule__Activity__Res_allocAssignment_5_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: ( rule__Activity__Res_allocAssignment_5_2 )
            {
             before(grammarAccess.getActivityAccess().getRes_allocAssignment_5_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( rule__Activity__Res_allocAssignment_5_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:2: rule__Activity__Res_allocAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Res_allocAssignment_5_2_in_rule__Activity__Group_5__2__Impl3142);
            rule__Activity__Res_allocAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRes_allocAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: rule__Activity__Group_5__3 : rule__Activity__Group_5__3__Impl rule__Activity__Group_5__4 ;
    public final void rule__Activity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( rule__Activity__Group_5__3__Impl rule__Activity__Group_5__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:2: rule__Activity__Group_5__3__Impl rule__Activity__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__33172);
            rule__Activity__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__4_in_rule__Activity__Group_5__33175);
            rule__Activity__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__3"


    // $ANTLR start "rule__Activity__Group_5__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: rule__Activity__Group_5__3__Impl : ( ( rule__Activity__Group_5_3__0 )* ) ;
    public final void rule__Activity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( ( ( rule__Activity__Group_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( ( rule__Activity__Group_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( ( rule__Activity__Group_5_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( rule__Activity__Group_5_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_5_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: ( rule__Activity__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:2: rule__Activity__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__0_in_rule__Activity__Group_5__3__Impl3202);
            	    rule__Activity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__3__Impl"


    // $ANTLR start "rule__Activity__Group_5__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: rule__Activity__Group_5__4 : rule__Activity__Group_5__4__Impl ;
    public final void rule__Activity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: ( rule__Activity__Group_5__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:2: rule__Activity__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5__4__Impl_in_rule__Activity__Group_5__43233);
            rule__Activity__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__4"


    // $ANTLR start "rule__Activity__Group_5__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: rule__Activity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Activity__Group_5__4__Impl3261); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5__4__Impl"


    // $ANTLR start "rule__Activity__Group_5_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: rule__Activity__Group_5_3__0 : rule__Activity__Group_5_3__0__Impl rule__Activity__Group_5_3__1 ;
    public final void rule__Activity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( rule__Activity__Group_5_3__0__Impl rule__Activity__Group_5_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:2: rule__Activity__Group_5_3__0__Impl rule__Activity__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__0__Impl_in_rule__Activity__Group_5_3__03302);
            rule__Activity__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__1_in_rule__Activity__Group_5_3__03305);
            rule__Activity__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__0"


    // $ANTLR start "rule__Activity__Group_5_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: rule__Activity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_5_3_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Activity__Group_5_3__0__Impl3333); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: rule__Activity__Group_5_3__1 : rule__Activity__Group_5_3__1__Impl ;
    public final void rule__Activity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( rule__Activity__Group_5_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:2: rule__Activity__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_5_3__1__Impl_in_rule__Activity__Group_5_3__13364);
            rule__Activity__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__1"


    // $ANTLR start "rule__Activity__Group_5_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: rule__Activity__Group_5_3__1__Impl : ( ( rule__Activity__Res_allocAssignment_5_3_1 ) ) ;
    public final void rule__Activity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( ( ( rule__Activity__Res_allocAssignment_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( ( rule__Activity__Res_allocAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( ( rule__Activity__Res_allocAssignment_5_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( rule__Activity__Res_allocAssignment_5_3_1 )
            {
             before(grammarAccess.getActivityAccess().getRes_allocAssignment_5_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ( rule__Activity__Res_allocAssignment_5_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:2: rule__Activity__Res_allocAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Res_allocAssignment_5_3_1_in_rule__Activity__Group_5_3__1__Impl3391);
            rule__Activity__Res_allocAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRes_allocAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_5_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03425);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03428);
            rule__Activity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0"


    // $ANTLR start "rule__Activity__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: rule__Activity__Group_6__0__Impl : ( 'rule' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: ( ( 'rule' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: ( 'rule' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: ( 'rule' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: 'rule'
            {
             before(grammarAccess.getActivityAccess().getRuleKeyword_6_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Activity__Group_6__0__Impl3456); 
             after(grammarAccess.getActivityAccess().getRuleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__0__Impl"


    // $ANTLR start "rule__Activity__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__13487);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__13490);
            rule__Activity__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1"


    // $ANTLR start "rule__Activity__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: rule__Activity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Activity__Group_6__1__Impl3518); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl rule__Activity__Group_6__3 ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( rule__Activity__Group_6__2__Impl rule__Activity__Group_6__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:2: rule__Activity__Group_6__2__Impl rule__Activity__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__23549);
            rule__Activity__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__3_in_rule__Activity__Group_6__23552);
            rule__Activity__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__2"


    // $ANTLR start "rule__Activity__Group_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: rule__Activity__Group_6__2__Impl : ( ( rule__Activity__RuleAssignment_6_2 ) ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( ( ( rule__Activity__RuleAssignment_6_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( ( rule__Activity__RuleAssignment_6_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( ( rule__Activity__RuleAssignment_6_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: ( rule__Activity__RuleAssignment_6_2 )
            {
             before(grammarAccess.getActivityAccess().getRuleAssignment_6_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: ( rule__Activity__RuleAssignment_6_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:2: rule__Activity__RuleAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__RuleAssignment_6_2_in_rule__Activity__Group_6__2__Impl3579);
            rule__Activity__RuleAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRuleAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__2__Impl"


    // $ANTLR start "rule__Activity__Group_6__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: rule__Activity__Group_6__3 : rule__Activity__Group_6__3__Impl rule__Activity__Group_6__4 ;
    public final void rule__Activity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( rule__Activity__Group_6__3__Impl rule__Activity__Group_6__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:2: rule__Activity__Group_6__3__Impl rule__Activity__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__3__Impl_in_rule__Activity__Group_6__33609);
            rule__Activity__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__4_in_rule__Activity__Group_6__33612);
            rule__Activity__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__3"


    // $ANTLR start "rule__Activity__Group_6__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: rule__Activity__Group_6__3__Impl : ( ( rule__Activity__Group_6_3__0 )* ) ;
    public final void rule__Activity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:1: ( ( ( rule__Activity__Group_6_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: ( ( rule__Activity__Group_6_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: ( ( rule__Activity__Group_6_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: ( rule__Activity__Group_6_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_6_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( rule__Activity__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==51) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:2: rule__Activity__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__0_in_rule__Activity__Group_6__3__Impl3639);
            	    rule__Activity__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__3__Impl"


    // $ANTLR start "rule__Activity__Group_6__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: rule__Activity__Group_6__4 : rule__Activity__Group_6__4__Impl ;
    public final void rule__Activity__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: ( rule__Activity__Group_6__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:2: rule__Activity__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6__4__Impl_in_rule__Activity__Group_6__43670);
            rule__Activity__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__4"


    // $ANTLR start "rule__Activity__Group_6__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: rule__Activity__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Activity__Group_6__4__Impl3698); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6__4__Impl"


    // $ANTLR start "rule__Activity__Group_6_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: rule__Activity__Group_6_3__0 : rule__Activity__Group_6_3__0__Impl rule__Activity__Group_6_3__1 ;
    public final void rule__Activity__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( rule__Activity__Group_6_3__0__Impl rule__Activity__Group_6_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:2: rule__Activity__Group_6_3__0__Impl rule__Activity__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__0__Impl_in_rule__Activity__Group_6_3__03739);
            rule__Activity__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__1_in_rule__Activity__Group_6_3__03742);
            rule__Activity__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__0"


    // $ANTLR start "rule__Activity__Group_6_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: rule__Activity__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_6_3_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Activity__Group_6_3__0__Impl3770); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: rule__Activity__Group_6_3__1 : rule__Activity__Group_6_3__1__Impl ;
    public final void rule__Activity__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( rule__Activity__Group_6_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:2: rule__Activity__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_6_3__1__Impl_in_rule__Activity__Group_6_3__13801);
            rule__Activity__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__1"


    // $ANTLR start "rule__Activity__Group_6_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: rule__Activity__Group_6_3__1__Impl : ( ( rule__Activity__RuleAssignment_6_3_1 ) ) ;
    public final void rule__Activity__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ( ( rule__Activity__RuleAssignment_6_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( rule__Activity__RuleAssignment_6_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( rule__Activity__RuleAssignment_6_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( rule__Activity__RuleAssignment_6_3_1 )
            {
             before(grammarAccess.getActivityAccess().getRuleAssignment_6_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Activity__RuleAssignment_6_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:2: rule__Activity__RuleAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__RuleAssignment_6_3_1_in_rule__Activity__Group_6_3__1__Impl3828);
            rule__Activity__RuleAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getRuleAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_6_3__1__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: rule__Res_Alloc__Group__0 : rule__Res_Alloc__Group__0__Impl rule__Res_Alloc__Group__1 ;
    public final void rule__Res_Alloc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( rule__Res_Alloc__Group__0__Impl rule__Res_Alloc__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:2: rule__Res_Alloc__Group__0__Impl rule__Res_Alloc__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__0__Impl_in_rule__Res_Alloc__Group__03862);
            rule__Res_Alloc__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__1_in_rule__Res_Alloc__Group__03865);
            rule__Res_Alloc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__0"


    // $ANTLR start "rule__Res_Alloc__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: rule__Res_Alloc__Group__0__Impl : ( () ) ;
    public final void rule__Res_Alloc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ()
            {
             before(grammarAccess.getRes_AllocAccess().getRes_AllocAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: 
            {
            }

             after(grammarAccess.getRes_AllocAccess().getRes_AllocAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__0__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: rule__Res_Alloc__Group__1 : rule__Res_Alloc__Group__1__Impl rule__Res_Alloc__Group__2 ;
    public final void rule__Res_Alloc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( rule__Res_Alloc__Group__1__Impl rule__Res_Alloc__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:2: rule__Res_Alloc__Group__1__Impl rule__Res_Alloc__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__1__Impl_in_rule__Res_Alloc__Group__13923);
            rule__Res_Alloc__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__2_in_rule__Res_Alloc__Group__13926);
            rule__Res_Alloc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__1"


    // $ANTLR start "rule__Res_Alloc__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Res_Alloc__Group__1__Impl : ( 'Res_Alloc' ) ;
    public final void rule__Res_Alloc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( 'Res_Alloc' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( 'Res_Alloc' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( 'Res_Alloc' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: 'Res_Alloc'
            {
             before(grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Res_Alloc__Group__1__Impl3954); 
             after(grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__1__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Res_Alloc__Group__2 : rule__Res_Alloc__Group__2__Impl rule__Res_Alloc__Group__3 ;
    public final void rule__Res_Alloc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Res_Alloc__Group__2__Impl rule__Res_Alloc__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: rule__Res_Alloc__Group__2__Impl rule__Res_Alloc__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__2__Impl_in_rule__Res_Alloc__Group__23985);
            rule__Res_Alloc__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__3_in_rule__Res_Alloc__Group__23988);
            rule__Res_Alloc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__2"


    // $ANTLR start "rule__Res_Alloc__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__Res_Alloc__Group__2__Impl : ( '{' ) ;
    public final void rule__Res_Alloc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: '{'
            {
             before(grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Res_Alloc__Group__2__Impl4016); 
             after(grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__2__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Res_Alloc__Group__3 : rule__Res_Alloc__Group__3__Impl rule__Res_Alloc__Group__4 ;
    public final void rule__Res_Alloc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Res_Alloc__Group__3__Impl rule__Res_Alloc__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: rule__Res_Alloc__Group__3__Impl rule__Res_Alloc__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__3__Impl_in_rule__Res_Alloc__Group__34047);
            rule__Res_Alloc__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__4_in_rule__Res_Alloc__Group__34050);
            rule__Res_Alloc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__3"


    // $ANTLR start "rule__Res_Alloc__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: rule__Res_Alloc__Group__3__Impl : ( ( rule__Res_Alloc__Group_3__0 )? ) ;
    public final void rule__Res_Alloc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( ( rule__Res_Alloc__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( rule__Res_Alloc__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( rule__Res_Alloc__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( rule__Res_Alloc__Group_3__0 )?
            {
             before(grammarAccess.getRes_AllocAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__Res_Alloc__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:2: rule__Res_Alloc__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__0_in_rule__Res_Alloc__Group__3__Impl4077);
                    rule__Res_Alloc__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRes_AllocAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__3__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: rule__Res_Alloc__Group__4 : rule__Res_Alloc__Group__4__Impl rule__Res_Alloc__Group__5 ;
    public final void rule__Res_Alloc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rule__Res_Alloc__Group__4__Impl rule__Res_Alloc__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:2: rule__Res_Alloc__Group__4__Impl rule__Res_Alloc__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__4__Impl_in_rule__Res_Alloc__Group__44108);
            rule__Res_Alloc__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__5_in_rule__Res_Alloc__Group__44111);
            rule__Res_Alloc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__4"


    // $ANTLR start "rule__Res_Alloc__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: rule__Res_Alloc__Group__4__Impl : ( ( rule__Res_Alloc__Group_4__0 )? ) ;
    public final void rule__Res_Alloc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ( ( rule__Res_Alloc__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ( rule__Res_Alloc__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( ( rule__Res_Alloc__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ( rule__Res_Alloc__Group_4__0 )?
            {
             before(grammarAccess.getRes_AllocAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( rule__Res_Alloc__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==56) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:2: rule__Res_Alloc__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__0_in_rule__Res_Alloc__Group__4__Impl4138);
                    rule__Res_Alloc__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRes_AllocAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__4__Impl"


    // $ANTLR start "rule__Res_Alloc__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: rule__Res_Alloc__Group__5 : rule__Res_Alloc__Group__5__Impl ;
    public final void rule__Res_Alloc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( rule__Res_Alloc__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:2: rule__Res_Alloc__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group__5__Impl_in_rule__Res_Alloc__Group__54169);
            rule__Res_Alloc__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__5"


    // $ANTLR start "rule__Res_Alloc__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: rule__Res_Alloc__Group__5__Impl : ( '}' ) ;
    public final void rule__Res_Alloc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: '}'
            {
             before(grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Res_Alloc__Group__5__Impl4197); 
             after(grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group__5__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: rule__Res_Alloc__Group_3__0 : rule__Res_Alloc__Group_3__0__Impl rule__Res_Alloc__Group_3__1 ;
    public final void rule__Res_Alloc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( rule__Res_Alloc__Group_3__0__Impl rule__Res_Alloc__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:2: rule__Res_Alloc__Group_3__0__Impl rule__Res_Alloc__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__0__Impl_in_rule__Res_Alloc__Group_3__04240);
            rule__Res_Alloc__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__1_in_rule__Res_Alloc__Group_3__04243);
            rule__Res_Alloc__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__0"


    // $ANTLR start "rule__Res_Alloc__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: rule__Res_Alloc__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Res_Alloc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: ( ( 'duration' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: ( 'duration' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: ( 'duration' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: 'duration'
            {
             before(grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Res_Alloc__Group_3__0__Impl4271); 
             after(grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__0__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: rule__Res_Alloc__Group_3__1 : rule__Res_Alloc__Group_3__1__Impl ;
    public final void rule__Res_Alloc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( rule__Res_Alloc__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:2: rule__Res_Alloc__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_3__1__Impl_in_rule__Res_Alloc__Group_3__14302);
            rule__Res_Alloc__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__1"


    // $ANTLR start "rule__Res_Alloc__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: rule__Res_Alloc__Group_3__1__Impl : ( ( rule__Res_Alloc__DurationAssignment_3_1 ) ) ;
    public final void rule__Res_Alloc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: ( ( ( rule__Res_Alloc__DurationAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: ( ( rule__Res_Alloc__DurationAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: ( ( rule__Res_Alloc__DurationAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( rule__Res_Alloc__DurationAssignment_3_1 )
            {
             before(grammarAccess.getRes_AllocAccess().getDurationAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( rule__Res_Alloc__DurationAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:2: rule__Res_Alloc__DurationAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__DurationAssignment_3_1_in_rule__Res_Alloc__Group_3__1__Impl4329);
            rule__Res_Alloc__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRes_AllocAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_3__1__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: rule__Res_Alloc__Group_4__0 : rule__Res_Alloc__Group_4__0__Impl rule__Res_Alloc__Group_4__1 ;
    public final void rule__Res_Alloc__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( rule__Res_Alloc__Group_4__0__Impl rule__Res_Alloc__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:2: rule__Res_Alloc__Group_4__0__Impl rule__Res_Alloc__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__0__Impl_in_rule__Res_Alloc__Group_4__04363);
            rule__Res_Alloc__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__1_in_rule__Res_Alloc__Group_4__04366);
            rule__Res_Alloc__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__0"


    // $ANTLR start "rule__Res_Alloc__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: rule__Res_Alloc__Group_4__0__Impl : ( 'res_type' ) ;
    public final void rule__Res_Alloc__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( ( 'res_type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( 'res_type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( 'res_type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: 'res_type'
            {
             before(grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Res_Alloc__Group_4__0__Impl4394); 
             after(grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__0__Impl"


    // $ANTLR start "rule__Res_Alloc__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: rule__Res_Alloc__Group_4__1 : rule__Res_Alloc__Group_4__1__Impl ;
    public final void rule__Res_Alloc__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( rule__Res_Alloc__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:2: rule__Res_Alloc__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Group_4__1__Impl_in_rule__Res_Alloc__Group_4__14425);
            rule__Res_Alloc__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__1"


    // $ANTLR start "rule__Res_Alloc__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: rule__Res_Alloc__Group_4__1__Impl : ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) ) ;
    public final void rule__Res_Alloc__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: ( ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: ( ( rule__Res_Alloc__Res_typeAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:1: ( rule__Res_Alloc__Res_typeAssignment_4_1 )
            {
             before(grammarAccess.getRes_AllocAccess().getRes_typeAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( rule__Res_Alloc__Res_typeAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:2: rule__Res_Alloc__Res_typeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Res_Alloc__Res_typeAssignment_4_1_in_rule__Res_Alloc__Group_4__1__Impl4452);
            rule__Res_Alloc__Res_typeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRes_AllocAccess().getRes_typeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04486);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04489);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: 
            {
            }

             after(grammarAccess.getRuleAccess().getRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14547);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__14550);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__Rule__Group__1__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( ( 'Rule' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( 'Rule' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( 'Rule' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_1()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Rule__Group__1__Impl4578); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__24609);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__24612);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Rule__Group__2__Impl4640); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__34671);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__34674);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( ( ( rule__Rule__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ( rule__Rule__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ( rule__Rule__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ( rule__Rule__Group_3__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: ( rule__Rule__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==58) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:2: rule__Rule__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl4701);
                    rule__Rule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( rule__Rule__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__44732);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Rule__Group__4__Impl4760); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__04801);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__04804);
            rule__Rule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: rule__Rule__Group_3__0__Impl : ( 'predicat' ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( ( 'predicat' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( 'predicat' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( 'predicat' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: 'predicat'
            {
             before(grammarAccess.getRuleAccess().getPredicatKeyword_3_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Rule__Group_3__0__Impl4832); 
             after(grammarAccess.getRuleAccess().getPredicatKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2 ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:2: rule__Rule__Group_3__1__Impl rule__Rule__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__14863);
            rule__Rule__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__2_in_rule__Rule__Group_3__14866);
            rule__Rule__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: rule__Rule__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Rule__Group_3__1__Impl4894); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Rule__Group_3__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: rule__Rule__Group_3__2 : rule__Rule__Group_3__2__Impl rule__Rule__Group_3__3 ;
    public final void rule__Rule__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( rule__Rule__Group_3__2__Impl rule__Rule__Group_3__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:2: rule__Rule__Group_3__2__Impl rule__Rule__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__2__Impl_in_rule__Rule__Group_3__24925);
            rule__Rule__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__3_in_rule__Rule__Group_3__24928);
            rule__Rule__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__2"


    // $ANTLR start "rule__Rule__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__Rule__Group_3__2__Impl : ( ( rule__Rule__PredicatAssignment_3_2 ) ) ;
    public final void rule__Rule__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( ( rule__Rule__PredicatAssignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( ( rule__Rule__PredicatAssignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( ( rule__Rule__PredicatAssignment_3_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( rule__Rule__PredicatAssignment_3_2 )
            {
             before(grammarAccess.getRuleAccess().getPredicatAssignment_3_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( rule__Rule__PredicatAssignment_3_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:2: rule__Rule__PredicatAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PredicatAssignment_3_2_in_rule__Rule__Group_3__2__Impl4955);
            rule__Rule__PredicatAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__2__Impl"


    // $ANTLR start "rule__Rule__Group_3__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: rule__Rule__Group_3__3 : rule__Rule__Group_3__3__Impl rule__Rule__Group_3__4 ;
    public final void rule__Rule__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( rule__Rule__Group_3__3__Impl rule__Rule__Group_3__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:2: rule__Rule__Group_3__3__Impl rule__Rule__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__3__Impl_in_rule__Rule__Group_3__34985);
            rule__Rule__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__4_in_rule__Rule__Group_3__34988);
            rule__Rule__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__3"


    // $ANTLR start "rule__Rule__Group_3__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: rule__Rule__Group_3__3__Impl : ( ( rule__Rule__Group_3_3__0 )* ) ;
    public final void rule__Rule__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( ( ( rule__Rule__Group_3_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ( rule__Rule__Group_3_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ( rule__Rule__Group_3_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( rule__Rule__Group_3_3__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_3_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( rule__Rule__Group_3_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==51) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:2: rule__Rule__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__0_in_rule__Rule__Group_3__3__Impl5015);
            	    rule__Rule__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__3__Impl"


    // $ANTLR start "rule__Rule__Group_3__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: rule__Rule__Group_3__4 : rule__Rule__Group_3__4__Impl ;
    public final void rule__Rule__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ( rule__Rule__Group_3__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:2: rule__Rule__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3__4__Impl_in_rule__Rule__Group_3__45046);
            rule__Rule__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__4"


    // $ANTLR start "rule__Rule__Group_3__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: rule__Rule__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:1: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Rule__Group_3__4__Impl5074); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__4__Impl"


    // $ANTLR start "rule__Rule__Group_3_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: rule__Rule__Group_3_3__0 : rule__Rule__Group_3_3__0__Impl rule__Rule__Group_3_3__1 ;
    public final void rule__Rule__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( rule__Rule__Group_3_3__0__Impl rule__Rule__Group_3_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:2: rule__Rule__Group_3_3__0__Impl rule__Rule__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__0__Impl_in_rule__Rule__Group_3_3__05115);
            rule__Rule__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__1_in_rule__Rule__Group_3_3__05118);
            rule__Rule__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__0"


    // $ANTLR start "rule__Rule__Group_3_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:1: rule__Rule__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_3_3_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Rule__Group_3_3__0__Impl5146); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: rule__Rule__Group_3_3__1 : rule__Rule__Group_3_3__1__Impl ;
    public final void rule__Rule__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ( rule__Rule__Group_3_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:2: rule__Rule__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_3_3__1__Impl_in_rule__Rule__Group_3_3__15177);
            rule__Rule__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__1"


    // $ANTLR start "rule__Rule__Group_3_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: rule__Rule__Group_3_3__1__Impl : ( ( rule__Rule__PredicatAssignment_3_3_1 ) ) ;
    public final void rule__Rule__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ( ( rule__Rule__PredicatAssignment_3_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( rule__Rule__PredicatAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( rule__Rule__PredicatAssignment_3_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( rule__Rule__PredicatAssignment_3_3_1 )
            {
             before(grammarAccess.getRuleAccess().getPredicatAssignment_3_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( rule__Rule__PredicatAssignment_3_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:2: rule__Rule__PredicatAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PredicatAssignment_3_3_1_in_rule__Rule__Group_3_3__1__Impl5204);
            rule__Rule__PredicatAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPredicatAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_3__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05238);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05241);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: 
            {
            }

             after(grammarAccess.getDateAccess().getDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15299);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15302);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: rule__Date__Group__1__Impl : ( 'Date' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ( ( 'Date' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: ( 'Date' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: ( 'Date' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Date__Group__1__Impl5330); 
             after(grammarAccess.getDateAccess().getDateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25361);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25364);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: rule__Date__Group__2__Impl : ( '{' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Date__Group__2__Impl5392); 
             after(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35423);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35426);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: rule__Date__Group__3__Impl : ( ( rule__Date__Group_3__0 )? ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: ( ( ( rule__Date__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( ( rule__Date__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( ( rule__Date__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: ( rule__Date__Group_3__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( rule__Date__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:2: rule__Date__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__0_in_rule__Date__Group__3__Impl5453);
                    rule__Date__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45484);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45487);
            rule__Date__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: rule__Date__Group__4__Impl : ( ( rule__Date__Group_4__0 )? ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: ( ( ( rule__Date__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( rule__Date__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( rule__Date__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( rule__Date__Group_4__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( rule__Date__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==61) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:2: rule__Date__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__0_in_rule__Date__Group__4__Impl5514);
                    rule__Date__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Date__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: rule__Date__Group__5 : rule__Date__Group__5__Impl ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( rule__Date__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:2: rule__Date__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55545);
            rule__Date__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5"


    // $ANTLR start "rule__Date__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: rule__Date__Group__5__Impl : ( '}' ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Date__Group__5__Impl5573); 
             after(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5__Impl"


    // $ANTLR start "rule__Date__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__Date__Group_3__0 : rule__Date__Group_3__0__Impl rule__Date__Group_3__1 ;
    public final void rule__Date__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( rule__Date__Group_3__0__Impl rule__Date__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:2: rule__Date__Group_3__0__Impl rule__Date__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__0__Impl_in_rule__Date__Group_3__05616);
            rule__Date__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__1_in_rule__Date__Group_3__05619);
            rule__Date__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__0"


    // $ANTLR start "rule__Date__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__Date__Group_3__0__Impl : ( 'day' ) ;
    public final void rule__Date__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( ( 'day' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( 'day' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( 'day' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: 'day'
            {
             before(grammarAccess.getDateAccess().getDayKeyword_3_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Date__Group_3__0__Impl5647); 
             after(grammarAccess.getDateAccess().getDayKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__0__Impl"


    // $ANTLR start "rule__Date__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: rule__Date__Group_3__1 : rule__Date__Group_3__1__Impl ;
    public final void rule__Date__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( rule__Date__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:2: rule__Date__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_3__1__Impl_in_rule__Date__Group_3__15678);
            rule__Date__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__1"


    // $ANTLR start "rule__Date__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: rule__Date__Group_3__1__Impl : ( ( rule__Date__DayAssignment_3_1 ) ) ;
    public final void rule__Date__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( ( rule__Date__DayAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( rule__Date__DayAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( rule__Date__DayAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( rule__Date__DayAssignment_3_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( rule__Date__DayAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:2: rule__Date__DayAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_3_1_in_rule__Date__Group_3__1__Impl5705);
            rule__Date__DayAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_3__1__Impl"


    // $ANTLR start "rule__Date__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: rule__Date__Group_4__0 : rule__Date__Group_4__0__Impl rule__Date__Group_4__1 ;
    public final void rule__Date__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: ( rule__Date__Group_4__0__Impl rule__Date__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:2: rule__Date__Group_4__0__Impl rule__Date__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__0__Impl_in_rule__Date__Group_4__05739);
            rule__Date__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__1_in_rule__Date__Group_4__05742);
            rule__Date__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__0"


    // $ANTLR start "rule__Date__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: rule__Date__Group_4__0__Impl : ( 'month' ) ;
    public final void rule__Date__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( ( 'month' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( 'month' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( 'month' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: 'month'
            {
             before(grammarAccess.getDateAccess().getMonthKeyword_4_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Date__Group_4__0__Impl5770); 
             after(grammarAccess.getDateAccess().getMonthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__0__Impl"


    // $ANTLR start "rule__Date__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: rule__Date__Group_4__1 : rule__Date__Group_4__1__Impl ;
    public final void rule__Date__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( rule__Date__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:2: rule__Date__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group_4__1__Impl_in_rule__Date__Group_4__15801);
            rule__Date__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__1"


    // $ANTLR start "rule__Date__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: rule__Date__Group_4__1__Impl : ( ( rule__Date__MonthAssignment_4_1 ) ) ;
    public final void rule__Date__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( ( ( rule__Date__MonthAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( rule__Date__MonthAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( rule__Date__MonthAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( rule__Date__MonthAssignment_4_1 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( rule__Date__MonthAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:2: rule__Date__MonthAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__MonthAssignment_4_1_in_rule__Date__Group_4__1__Impl5828);
            rule__Date__MonthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__1__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__05862);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__05865);
            rule__EIntegerObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:2: '-'
                    {
                    match(input,62,FollowSets000.FOLLOW_62_in_rule__EIntegerObject__Group__0__Impl5894); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2932:1: ( rule__EIntegerObject__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__15927);
            rule__EIntegerObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl5954); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__ResourceType__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: rule__ResourceType__Group__0 : rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 ;
    public final void rule__ResourceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:2: rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__0__Impl_in_rule__ResourceType__Group__05987);
            rule__ResourceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__1_in_rule__ResourceType__Group__05990);
            rule__ResourceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__0"


    // $ANTLR start "rule__ResourceType__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: rule__ResourceType__Group__0__Impl : ( () ) ;
    public final void rule__ResourceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ()
            {
             before(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2981:1: 
            {
            }

             after(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__0__Impl"


    // $ANTLR start "rule__ResourceType__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:1: rule__ResourceType__Group__1 : rule__ResourceType__Group__1__Impl rule__ResourceType__Group__2 ;
    public final void rule__ResourceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ( rule__ResourceType__Group__1__Impl rule__ResourceType__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:2: rule__ResourceType__Group__1__Impl rule__ResourceType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__1__Impl_in_rule__ResourceType__Group__16048);
            rule__ResourceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__2_in_rule__ResourceType__Group__16051);
            rule__ResourceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__1"


    // $ANTLR start "rule__ResourceType__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: rule__ResourceType__Group__1__Impl : ( 'ResourceType' ) ;
    public final void rule__ResourceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( ( 'ResourceType' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( 'ResourceType' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( 'ResourceType' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: 'ResourceType'
            {
             before(grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__ResourceType__Group__1__Impl6079); 
             after(grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__1__Impl"


    // $ANTLR start "rule__ResourceType__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: rule__ResourceType__Group__2 : rule__ResourceType__Group__2__Impl rule__ResourceType__Group__3 ;
    public final void rule__ResourceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: ( rule__ResourceType__Group__2__Impl rule__ResourceType__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:2: rule__ResourceType__Group__2__Impl rule__ResourceType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__2__Impl_in_rule__ResourceType__Group__26110);
            rule__ResourceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__3_in_rule__ResourceType__Group__26113);
            rule__ResourceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__2"


    // $ANTLR start "rule__ResourceType__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__ResourceType__Group__2__Impl : ( ( rule__ResourceType__NameAssignment_2 ) ) ;
    public final void rule__ResourceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( ( rule__ResourceType__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ( rule__ResourceType__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ( rule__ResourceType__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( rule__ResourceType__NameAssignment_2 )
            {
             before(grammarAccess.getResourceTypeAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( rule__ResourceType__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:2: rule__ResourceType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__NameAssignment_2_in_rule__ResourceType__Group__2__Impl6140);
            rule__ResourceType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__2__Impl"


    // $ANTLR start "rule__ResourceType__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: rule__ResourceType__Group__3 : rule__ResourceType__Group__3__Impl rule__ResourceType__Group__4 ;
    public final void rule__ResourceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( rule__ResourceType__Group__3__Impl rule__ResourceType__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:2: rule__ResourceType__Group__3__Impl rule__ResourceType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__3__Impl_in_rule__ResourceType__Group__36170);
            rule__ResourceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__4_in_rule__ResourceType__Group__36173);
            rule__ResourceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__3"


    // $ANTLR start "rule__ResourceType__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__ResourceType__Group__3__Impl : ( '{' ) ;
    public final void rule__ResourceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: '{'
            {
             before(grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ResourceType__Group__3__Impl6201); 
             after(grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__3__Impl"


    // $ANTLR start "rule__ResourceType__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: rule__ResourceType__Group__4 : rule__ResourceType__Group__4__Impl rule__ResourceType__Group__5 ;
    public final void rule__ResourceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( rule__ResourceType__Group__4__Impl rule__ResourceType__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:2: rule__ResourceType__Group__4__Impl rule__ResourceType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__4__Impl_in_rule__ResourceType__Group__46232);
            rule__ResourceType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__5_in_rule__ResourceType__Group__46235);
            rule__ResourceType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__4"


    // $ANTLR start "rule__ResourceType__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: rule__ResourceType__Group__4__Impl : ( ( rule__ResourceType__Group_4__0 )? ) ;
    public final void rule__ResourceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( ( ( rule__ResourceType__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( rule__ResourceType__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( rule__ResourceType__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( rule__ResourceType__Group_4__0 )?
            {
             before(grammarAccess.getResourceTypeAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( rule__ResourceType__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==64) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:2: rule__ResourceType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__0_in_rule__ResourceType__Group__4__Impl6262);
                    rule__ResourceType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__4__Impl"


    // $ANTLR start "rule__ResourceType__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:1: rule__ResourceType__Group__5 : rule__ResourceType__Group__5__Impl ;
    public final void rule__ResourceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( rule__ResourceType__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:2: rule__ResourceType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group__5__Impl_in_rule__ResourceType__Group__56293);
            rule__ResourceType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__5"


    // $ANTLR start "rule__ResourceType__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: rule__ResourceType__Group__5__Impl : ( '}' ) ;
    public final void rule__ResourceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: '}'
            {
             before(grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__ResourceType__Group__5__Impl6321); 
             after(grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__5__Impl"


    // $ANTLR start "rule__ResourceType__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3153:1: rule__ResourceType__Group_4__0 : rule__ResourceType__Group_4__0__Impl rule__ResourceType__Group_4__1 ;
    public final void rule__ResourceType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( rule__ResourceType__Group_4__0__Impl rule__ResourceType__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:2: rule__ResourceType__Group_4__0__Impl rule__ResourceType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__0__Impl_in_rule__ResourceType__Group_4__06364);
            rule__ResourceType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__1_in_rule__ResourceType__Group_4__06367);
            rule__ResourceType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__0"


    // $ANTLR start "rule__ResourceType__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: rule__ResourceType__Group_4__0__Impl : ( 'resource' ) ;
    public final void rule__ResourceType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( ( 'resource' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( 'resource' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( 'resource' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: 'resource'
            {
             before(grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__ResourceType__Group_4__0__Impl6395); 
             after(grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__0__Impl"


    // $ANTLR start "rule__ResourceType__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: rule__ResourceType__Group_4__1 : rule__ResourceType__Group_4__1__Impl ;
    public final void rule__ResourceType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:1: ( rule__ResourceType__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:2: rule__ResourceType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__Group_4__1__Impl_in_rule__ResourceType__Group_4__16426);
            rule__ResourceType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__1"


    // $ANTLR start "rule__ResourceType__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: rule__ResourceType__Group_4__1__Impl : ( ( rule__ResourceType__ResourceAssignment_4_1 ) ) ;
    public final void rule__ResourceType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ( ( rule__ResourceType__ResourceAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( ( rule__ResourceType__ResourceAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( ( rule__ResourceType__ResourceAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: ( rule__ResourceType__ResourceAssignment_4_1 )
            {
             before(grammarAccess.getResourceTypeAccess().getResourceAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: ( rule__ResourceType__ResourceAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:2: rule__ResourceType__ResourceAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceType__ResourceAssignment_4_1_in_rule__ResourceType__Group_4__1__Impl6453);
            rule__ResourceType__ResourceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getResourceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group_4__1__Impl"


    // $ANTLR start "rule__Elevage__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: rule__Elevage__Group__0 : rule__Elevage__Group__0__Impl rule__Elevage__Group__1 ;
    public final void rule__Elevage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( rule__Elevage__Group__0__Impl rule__Elevage__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:2: rule__Elevage__Group__0__Impl rule__Elevage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__06490);
            rule__Elevage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__06493);
            rule__Elevage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__0"


    // $ANTLR start "rule__Elevage__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: rule__Elevage__Group__0__Impl : ( () ) ;
    public final void rule__Elevage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ()
            {
             before(grammarAccess.getElevageAccess().getElevageAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: 
            {
            }

             after(grammarAccess.getElevageAccess().getElevageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__0__Impl"


    // $ANTLR start "rule__Elevage__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: rule__Elevage__Group__1 : rule__Elevage__Group__1__Impl rule__Elevage__Group__2 ;
    public final void rule__Elevage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( rule__Elevage__Group__1__Impl rule__Elevage__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:2: rule__Elevage__Group__1__Impl rule__Elevage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__16551);
            rule__Elevage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__16554);
            rule__Elevage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__1"


    // $ANTLR start "rule__Elevage__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: rule__Elevage__Group__1__Impl : ( 'Elevage' ) ;
    public final void rule__Elevage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: ( ( 'Elevage' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:1: ( 'Elevage' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:1: ( 'Elevage' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: 'Elevage'
            {
             before(grammarAccess.getElevageAccess().getElevageKeyword_1()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Elevage__Group__1__Impl6582); 
             after(grammarAccess.getElevageAccess().getElevageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__1__Impl"


    // $ANTLR start "rule__Elevage__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: rule__Elevage__Group__2 : rule__Elevage__Group__2__Impl rule__Elevage__Group__3 ;
    public final void rule__Elevage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( rule__Elevage__Group__2__Impl rule__Elevage__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:2: rule__Elevage__Group__2__Impl rule__Elevage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__26613);
            rule__Elevage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__26616);
            rule__Elevage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__2"


    // $ANTLR start "rule__Elevage__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: rule__Elevage__Group__2__Impl : ( '{' ) ;
    public final void rule__Elevage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: '{'
            {
             before(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Elevage__Group__2__Impl6644); 
             after(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__2__Impl"


    // $ANTLR start "rule__Elevage__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: rule__Elevage__Group__3 : rule__Elevage__Group__3__Impl rule__Elevage__Group__4 ;
    public final void rule__Elevage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: ( rule__Elevage__Group__3__Impl rule__Elevage__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:2: rule__Elevage__Group__3__Impl rule__Elevage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__36675);
            rule__Elevage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__36678);
            rule__Elevage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__3"


    // $ANTLR start "rule__Elevage__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: rule__Elevage__Group__3__Impl : ( ( rule__Elevage__Group_3__0 )? ) ;
    public final void rule__Elevage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( ( ( rule__Elevage__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: ( ( rule__Elevage__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: ( ( rule__Elevage__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: ( rule__Elevage__Group_3__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: ( rule__Elevage__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:2: rule__Elevage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl6705);
                    rule__Elevage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElevageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__3__Impl"


    // $ANTLR start "rule__Elevage__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: rule__Elevage__Group__4 : rule__Elevage__Group__4__Impl rule__Elevage__Group__5 ;
    public final void rule__Elevage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__Elevage__Group__4__Impl rule__Elevage__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:2: rule__Elevage__Group__4__Impl rule__Elevage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__46736);
            rule__Elevage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__5_in_rule__Elevage__Group__46739);
            rule__Elevage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__4"


    // $ANTLR start "rule__Elevage__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:1: rule__Elevage__Group__4__Impl : ( ( rule__Elevage__Group_4__0 )? ) ;
    public final void rule__Elevage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( ( ( rule__Elevage__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( rule__Elevage__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( rule__Elevage__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( rule__Elevage__Group_4__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: ( rule__Elevage__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==67) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:2: rule__Elevage__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__0_in_rule__Elevage__Group__4__Impl6766);
                    rule__Elevage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElevageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__4__Impl"


    // $ANTLR start "rule__Elevage__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: rule__Elevage__Group__5 : rule__Elevage__Group__5__Impl ;
    public final void rule__Elevage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ( rule__Elevage__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:2: rule__Elevage__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__5__Impl_in_rule__Elevage__Group__56797);
            rule__Elevage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__5"


    // $ANTLR start "rule__Elevage__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:1: rule__Elevage__Group__5__Impl : ( '}' ) ;
    public final void rule__Elevage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: '}'
            {
             before(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Elevage__Group__5__Impl6825); 
             after(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__5__Impl"


    // $ANTLR start "rule__Elevage__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: rule__Elevage__Group_3__0 : rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 ;
    public final void rule__Elevage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:2: rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__06868);
            rule__Elevage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__06871);
            rule__Elevage__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__0"


    // $ANTLR start "rule__Elevage__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: rule__Elevage__Group_3__0__Impl : ( 'animals' ) ;
    public final void rule__Elevage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( ( 'animals' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( 'animals' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( 'animals' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: 'animals'
            {
             before(grammarAccess.getElevageAccess().getAnimalsKeyword_3_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__Elevage__Group_3__0__Impl6899); 
             after(grammarAccess.getElevageAccess().getAnimalsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__0__Impl"


    // $ANTLR start "rule__Elevage__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: rule__Elevage__Group_3__1 : rule__Elevage__Group_3__1__Impl ;
    public final void rule__Elevage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( rule__Elevage__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:2: rule__Elevage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__16930);
            rule__Elevage__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__1"


    // $ANTLR start "rule__Elevage__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: rule__Elevage__Group_3__1__Impl : ( ( rule__Elevage__AnimalsAssignment_3_1 ) ) ;
    public final void rule__Elevage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:1: ( ( ( rule__Elevage__AnimalsAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( ( rule__Elevage__AnimalsAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( ( rule__Elevage__AnimalsAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( rule__Elevage__AnimalsAssignment_3_1 )
            {
             before(grammarAccess.getElevageAccess().getAnimalsAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( rule__Elevage__AnimalsAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:2: rule__Elevage__AnimalsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__AnimalsAssignment_3_1_in_rule__Elevage__Group_3__1__Impl6957);
            rule__Elevage__AnimalsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getAnimalsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_3__1__Impl"


    // $ANTLR start "rule__Elevage__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: rule__Elevage__Group_4__0 : rule__Elevage__Group_4__0__Impl rule__Elevage__Group_4__1 ;
    public final void rule__Elevage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: ( rule__Elevage__Group_4__0__Impl rule__Elevage__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:2: rule__Elevage__Group_4__0__Impl rule__Elevage__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__0__Impl_in_rule__Elevage__Group_4__06991);
            rule__Elevage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__1_in_rule__Elevage__Group_4__06994);
            rule__Elevage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__0"


    // $ANTLR start "rule__Elevage__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3487:1: rule__Elevage__Group_4__0__Impl : ( 'activity' ) ;
    public final void rule__Elevage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:1: ( ( 'activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:1: ( 'activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:1: ( 'activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: 'activity'
            {
             before(grammarAccess.getElevageAccess().getActivityKeyword_4_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__Elevage__Group_4__0__Impl7022); 
             after(grammarAccess.getElevageAccess().getActivityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__0__Impl"


    // $ANTLR start "rule__Elevage__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Elevage__Group_4__1 : rule__Elevage__Group_4__1__Impl ;
    public final void rule__Elevage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( rule__Elevage__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:2: rule__Elevage__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_4__1__Impl_in_rule__Elevage__Group_4__17053);
            rule__Elevage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__1"


    // $ANTLR start "rule__Elevage__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: rule__Elevage__Group_4__1__Impl : ( ( rule__Elevage__ActivityAssignment_4_1 ) ) ;
    public final void rule__Elevage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: ( ( ( rule__Elevage__ActivityAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( ( rule__Elevage__ActivityAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( ( rule__Elevage__ActivityAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( rule__Elevage__ActivityAssignment_4_1 )
            {
             before(grammarAccess.getElevageAccess().getActivityAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: ( rule__Elevage__ActivityAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:2: rule__Elevage__ActivityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__ActivityAssignment_4_1_in_rule__Elevage__Group_4__1__Impl7080);
            rule__Elevage__ActivityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getActivityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group_4__1__Impl"


    // $ANTLR start "rule__Culture__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__07114);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__07117);
            rule__Culture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0"


    // $ANTLR start "rule__Culture__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: rule__Culture__Group__0__Impl : ( () ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ()
            {
             before(grammarAccess.getCultureAccess().getCultureAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: 
            {
            }

             after(grammarAccess.getCultureAccess().getCultureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0__Impl"


    // $ANTLR start "rule__Culture__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__17175);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__17178);
            rule__Culture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1"


    // $ANTLR start "rule__Culture__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__Culture__Group__1__Impl : ( 'Culture' ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( ( 'Culture' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( 'Culture' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( 'Culture' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: 'Culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_1()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__Culture__Group__1__Impl7206); 
             after(grammarAccess.getCultureAccess().getCultureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3605:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__27237);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__27240);
            rule__Culture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2"


    // $ANTLR start "rule__Culture__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Culture__Group__2__Impl7268); 
             after(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2__Impl"


    // $ANTLR start "rule__Culture__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__37299);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__37302);
            rule__Culture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3"


    // $ANTLR start "rule__Culture__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__Group_3__0 )? ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ( ( rule__Culture__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( ( rule__Culture__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( ( rule__Culture__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( rule__Culture__Group_3__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:1: ( rule__Culture__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==69) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:2: rule__Culture__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl7329);
                    rule__Culture__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCultureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3__Impl"


    // $ANTLR start "rule__Culture__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl rule__Culture__Group__5 ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( rule__Culture__Group__4__Impl rule__Culture__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:2: rule__Culture__Group__4__Impl rule__Culture__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__47360);
            rule__Culture__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__5_in_rule__Culture__Group__47363);
            rule__Culture__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4"


    // $ANTLR start "rule__Culture__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: rule__Culture__Group__4__Impl : ( ( rule__Culture__Group_4__0 )? ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( ( rule__Culture__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ( rule__Culture__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ( rule__Culture__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( rule__Culture__Group_4__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( rule__Culture__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:2: rule__Culture__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__0_in_rule__Culture__Group__4__Impl7390);
                    rule__Culture__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCultureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4__Impl"


    // $ANTLR start "rule__Culture__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: rule__Culture__Group__5 : rule__Culture__Group__5__Impl ;
    public final void rule__Culture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( rule__Culture__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:2: rule__Culture__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__5__Impl_in_rule__Culture__Group__57421);
            rule__Culture__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__5"


    // $ANTLR start "rule__Culture__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: rule__Culture__Group__5__Impl : ( '}' ) ;
    public final void rule__Culture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Culture__Group__5__Impl7449); 
             after(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__5__Impl"


    // $ANTLR start "rule__Culture__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: rule__Culture__Group_3__0 : rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 ;
    public final void rule__Culture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: ( rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:2: rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__07492);
            rule__Culture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__07495);
            rule__Culture__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__0"


    // $ANTLR start "rule__Culture__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:1: rule__Culture__Group_3__0__Impl : ( 'cereals' ) ;
    public final void rule__Culture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( ( 'cereals' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( 'cereals' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( 'cereals' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: 'cereals'
            {
             before(grammarAccess.getCultureAccess().getCerealsKeyword_3_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__Culture__Group_3__0__Impl7523); 
             after(grammarAccess.getCultureAccess().getCerealsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__0__Impl"


    // $ANTLR start "rule__Culture__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: rule__Culture__Group_3__1 : rule__Culture__Group_3__1__Impl ;
    public final void rule__Culture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( rule__Culture__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:2: rule__Culture__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__17554);
            rule__Culture__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__1"


    // $ANTLR start "rule__Culture__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: rule__Culture__Group_3__1__Impl : ( ( rule__Culture__CerealsAssignment_3_1 ) ) ;
    public final void rule__Culture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:1: ( ( ( rule__Culture__CerealsAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( rule__Culture__CerealsAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( rule__Culture__CerealsAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: ( rule__Culture__CerealsAssignment_3_1 )
            {
             before(grammarAccess.getCultureAccess().getCerealsAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: ( rule__Culture__CerealsAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:2: rule__Culture__CerealsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__CerealsAssignment_3_1_in_rule__Culture__Group_3__1__Impl7581);
            rule__Culture__CerealsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getCerealsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_3__1__Impl"


    // $ANTLR start "rule__Culture__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: rule__Culture__Group_4__0 : rule__Culture__Group_4__0__Impl rule__Culture__Group_4__1 ;
    public final void rule__Culture__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( rule__Culture__Group_4__0__Impl rule__Culture__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:2: rule__Culture__Group_4__0__Impl rule__Culture__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__0__Impl_in_rule__Culture__Group_4__07615);
            rule__Culture__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__1_in_rule__Culture__Group_4__07618);
            rule__Culture__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__0"


    // $ANTLR start "rule__Culture__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: rule__Culture__Group_4__0__Impl : ( 'activity' ) ;
    public final void rule__Culture__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: ( ( 'activity' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: ( 'activity' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: ( 'activity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3812:1: 'activity'
            {
             before(grammarAccess.getCultureAccess().getActivityKeyword_4_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__Culture__Group_4__0__Impl7646); 
             after(grammarAccess.getCultureAccess().getActivityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__0__Impl"


    // $ANTLR start "rule__Culture__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: rule__Culture__Group_4__1 : rule__Culture__Group_4__1__Impl ;
    public final void rule__Culture__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ( rule__Culture__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:2: rule__Culture__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_4__1__Impl_in_rule__Culture__Group_4__17677);
            rule__Culture__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__1"


    // $ANTLR start "rule__Culture__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: rule__Culture__Group_4__1__Impl : ( ( rule__Culture__ActivityAssignment_4_1 ) ) ;
    public final void rule__Culture__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: ( ( ( rule__Culture__ActivityAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: ( ( rule__Culture__ActivityAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: ( ( rule__Culture__ActivityAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: ( rule__Culture__ActivityAssignment_4_1 )
            {
             before(grammarAccess.getCultureAccess().getActivityAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( rule__Culture__ActivityAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:2: rule__Culture__ActivityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__ActivityAssignment_4_1_in_rule__Culture__Group_4__1__Impl7704);
            rule__Culture__ActivityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getActivityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__PeriodiciteAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: rule__Activity__PeriodiciteAssignment_2_1 : ( rulePeriodicite ) ;
    public final void rule__Activity__PeriodiciteAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( rulePeriodicite ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( rulePeriodicite )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( rulePeriodicite )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: rulePeriodicite
            {
             before(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicite_in_rule__Activity__PeriodiciteAssignment_2_17743);
            rulePeriodicite();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__PeriodiciteAssignment_2_1"


    // $ANTLR start "rule__Activity__ActivitesAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: rule__Activity__ActivitesAssignment_3_1 : ( ruleActivites ) ;
    public final void rule__Activity__ActivitesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: ( ( ruleActivites ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( ruleActivites )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( ruleActivites )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ruleActivites
            {
             before(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivites_in_rule__Activity__ActivitesAssignment_3_17774);
            ruleActivites();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivitesAssignment_3_1"


    // $ANTLR start "rule__Activity__AtelierAssignment_4_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: rule__Activity__AtelierAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Activity__AtelierAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_27809);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AtelierAssignment_4_2"


    // $ANTLR start "rule__Activity__AtelierAssignment_4_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3907:1: rule__Activity__AtelierAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Activity__AtelierAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3915:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_3_17848);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAtelierAtelierEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__AtelierAssignment_4_3_1"


    // $ANTLR start "rule__Activity__Res_allocAssignment_5_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3926:1: rule__Activity__Res_allocAssignment_5_2 : ( ruleRes_Alloc ) ;
    public final void rule__Activity__Res_allocAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( ( ruleRes_Alloc ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( ruleRes_Alloc )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( ruleRes_Alloc )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ruleRes_Alloc
            {
             before(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_27883);
            ruleRes_Alloc();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Res_allocAssignment_5_2"


    // $ANTLR start "rule__Activity__Res_allocAssignment_5_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: rule__Activity__Res_allocAssignment_5_3_1 : ( ruleRes_Alloc ) ;
    public final void rule__Activity__Res_allocAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: ( ( ruleRes_Alloc ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( ruleRes_Alloc )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( ruleRes_Alloc )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:1: ruleRes_Alloc
            {
             before(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_3_17914);
            ruleRes_Alloc();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Res_allocAssignment_5_3_1"


    // $ANTLR start "rule__Activity__RuleAssignment_6_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: rule__Activity__RuleAssignment_6_2 : ( ruleRule ) ;
    public final void rule__Activity__RuleAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: ( ( ruleRule ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:1: ( ruleRule )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:1: ( ruleRule )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3962:1: ruleRule
            {
             before(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_27945);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__RuleAssignment_6_2"


    // $ANTLR start "rule__Activity__RuleAssignment_6_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: rule__Activity__RuleAssignment_6_3_1 : ( ruleRule ) ;
    public final void rule__Activity__RuleAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( ( ruleRule ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:1: ( ruleRule )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:1: ( ruleRule )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ruleRule
            {
             before(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_3_17976);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__RuleAssignment_6_3_1"


    // $ANTLR start "rule__Activity__FinAssignment_8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: rule__Activity__FinAssignment_8 : ( ruleDate ) ;
    public final void rule__Activity__FinAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( ruleDate ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( ruleDate )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( ruleDate )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ruleDate
            {
             before(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__Activity__FinAssignment_88007);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__FinAssignment_8"


    // $ANTLR start "rule__Activity__DebutAssignment_10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: rule__Activity__DebutAssignment_10 : ( ruleDate ) ;
    public final void rule__Activity__DebutAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( ( ruleDate ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( ruleDate )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( ruleDate )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: ruleDate
            {
             before(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__Activity__DebutAssignment_108038);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__DebutAssignment_10"


    // $ANTLR start "rule__Res_Alloc__DurationAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:1: rule__Res_Alloc__DurationAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__Res_Alloc__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( ( ruleEIntegerObject ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( ruleEIntegerObject )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( ruleEIntegerObject )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ruleEIntegerObject
            {
             before(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_rule__Res_Alloc__DurationAssignment_3_18069);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__DurationAssignment_3_1"


    // $ANTLR start "rule__Res_Alloc__Res_typeAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: rule__Res_Alloc__Res_typeAssignment_4_1 : ( ruleResourceType ) ;
    public final void rule__Res_Alloc__Res_typeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:1: ( ( ruleResourceType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( ruleResourceType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( ruleResourceType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ruleResourceType
            {
             before(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_rule__Res_Alloc__Res_typeAssignment_4_18100);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Res_Alloc__Res_typeAssignment_4_1"


    // $ANTLR start "rule__Rule__PredicatAssignment_3_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: rule__Rule__PredicatAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Rule__PredicatAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:1: ruleEString
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_28135);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicatAssignment_3_2"


    // $ANTLR start "rule__Rule__PredicatAssignment_3_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: rule__Rule__PredicatAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__PredicatAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: ruleEString
            {
             before(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_3_18174);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPredicatPredicatEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PredicatAssignment_3_3_1"


    // $ANTLR start "rule__Date__DayAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: rule__Date__DayAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__Date__DayAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4088:1: ( ( ruleEIntegerObject ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( ruleEIntegerObject )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( ruleEIntegerObject )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ruleEIntegerObject
            {
             before(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_rule__Date__DayAssignment_3_18209);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_3_1"


    // $ANTLR start "rule__Date__MonthAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: rule__Date__MonthAssignment_4_1 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: ( ( ruleMonth ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: ( ruleMonth )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: ( ruleMonth )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4105:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_4_18240);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_4_1"


    // $ANTLR start "rule__ResourceType__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: rule__ResourceType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ResourceType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ruleEString
            {
             before(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResourceType__NameAssignment_28271);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__NameAssignment_2"


    // $ANTLR start "rule__ResourceType__ResourceAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: rule__ResourceType__ResourceAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ResourceType__ResourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: ( ruleEString )
            {
             before(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ruleEString
            {
             before(grammarAccess.getResourceTypeAccess().getResourceRessourceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResourceType__ResourceAssignment_4_18306);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceTypeAccess().getResourceRessourceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__ResourceAssignment_4_1"


    // $ANTLR start "rule__Elevage__AnimalsAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: rule__Elevage__AnimalsAssignment_3_1 : ( ruleAnimals ) ;
    public final void rule__Elevage__AnimalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ( ( ruleAnimals ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: ( ruleAnimals )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: ( ruleAnimals )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: ruleAnimals
            {
             before(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimals_in_rule__Elevage__AnimalsAssignment_3_18343);
            ruleAnimals();

            state._fsp--;

             after(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__AnimalsAssignment_3_1"


    // $ANTLR start "rule__Elevage__ActivityAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: rule__Elevage__ActivityAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Elevage__ActivityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( ruleEString )
            {
             before(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ruleEString
            {
             before(grammarAccess.getElevageAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_4_18378);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElevageAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__ActivityAssignment_4_1"


    // $ANTLR start "rule__Culture__CerealsAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: rule__Culture__CerealsAssignment_3_1 : ( ruleCereal ) ;
    public final void rule__Culture__CerealsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: ( ( ruleCereal ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: ( ruleCereal )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: ( ruleCereal )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: ruleCereal
            {
             before(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCereal_in_rule__Culture__CerealsAssignment_3_18413);
            ruleCereal();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__CerealsAssignment_3_1"


    // $ANTLR start "rule__Culture__ActivityAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:1: rule__Culture__ActivityAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Culture__ActivityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4203:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( ruleEString )
            {
             before(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ruleEString
            {
             before(grammarAccess.getCultureAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_4_18448);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getActivityActivityEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__ActivityAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRes_Alloc130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__0_in_ruleRes_Alloc156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_entryRuleResourceType363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceType370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__0_in_ruleResourceType396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0_in_ruleElevage520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Periodicite__Alternatives_in_rulePeriodicite617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activites__Alternatives_in_ruleActivites653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animals__Alternatives_in_ruleAnimals725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Cereal__Alternatives_in_ruleCereal761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Periodicite__Alternatives847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Periodicite__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Periodicite__Alternatives889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Periodicite__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Activites__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Activites__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Activites__Alternatives988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Activites__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Activites__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Activites__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activites__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activites__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Activites__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Month__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Month__Alternatives1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Month__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Month__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Month__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Month__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Month__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Month__Alternatives1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Month__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Month__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Month__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Month__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Animals__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Animals__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Cereal__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Cereal__Alternatives1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Cereal__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01549 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__01552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Activity__Group__0__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__11611 = new BitSet(new long[]{0x0031C80000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__11614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Activity__Group__1__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21673 = new BitSet(new long[]{0x0031C80000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__0_in_rule__Activity__Group__2__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31734 = new BitSet(new long[]{0x0031C80000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41795 = new BitSet(new long[]{0x0031C80000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__41798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__51856 = new BitSet(new long[]{0x0031C80000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__51859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__61917 = new BitSet(new long[]{0x0031C80000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__61920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__71978 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__71981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Activity__Group__7__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__82040 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__82043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__FinAssignment_8_in_rule__Activity__Group__8__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__92100 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__92103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Activity__Group__9__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__102162 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__102165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__DebutAssignment_10_in_rule__Activity__Group__10__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__112222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Activity__Group__11__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__0__Impl_in_rule__Activity__Group_2__02305 = new BitSet(new long[]{0x0000000000007800L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__1_in_rule__Activity__Group_2__02308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Activity__Group_2__0__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__1__Impl_in_rule__Activity__Group_2__12367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PeriodiciteAssignment_2_1_in_rule__Activity__Group_2__1__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02428 = new BitSet(new long[]{0x0000000000FF8000L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Activity__Group_3__0__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__ActivitesAssignment_3_1_in_rule__Activity__Group_3__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__02551 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__02554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Activity__Group_4__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__12613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__12616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Activity__Group_4__1__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__22675 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__3_in_rule__Activity__Group_4__22678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__AtelierAssignment_4_2_in_rule__Activity__Group_4__2__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__3__Impl_in_rule__Activity__Group_4__32735 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__4_in_rule__Activity__Group_4__32738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__0_in_rule__Activity__Group_4__3__Impl2765 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4__4__Impl_in_rule__Activity__Group_4__42796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Activity__Group_4__4__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__0__Impl_in_rule__Activity__Group_4_3__02865 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__1_in_rule__Activity__Group_4_3__02868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Activity__Group_4_3__0__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_4_3__1__Impl_in_rule__Activity__Group_4_3__12927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__AtelierAssignment_4_3_1_in_rule__Activity__Group_4_3__1__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__02988 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__02991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Activity__Group_5__0__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__13050 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__13053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Activity__Group_5__1__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__23112 = new BitSet(new long[]{0x0008200000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__23115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Res_allocAssignment_5_2_in_rule__Activity__Group_5__2__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__33172 = new BitSet(new long[]{0x0008200000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__4_in_rule__Activity__Group_5__33175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__0_in_rule__Activity__Group_5__3__Impl3202 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5__4__Impl_in_rule__Activity__Group_5__43233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Activity__Group_5__4__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__0__Impl_in_rule__Activity__Group_5_3__03302 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__1_in_rule__Activity__Group_5_3__03305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Activity__Group_5_3__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_5_3__1__Impl_in_rule__Activity__Group_5_3__13364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Res_allocAssignment_5_3_1_in_rule__Activity__Group_5_3__1__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__03425 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__03428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Activity__Group_6__0__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__13487 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__13490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Activity__Group_6__1__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__23549 = new BitSet(new long[]{0x0008200000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__3_in_rule__Activity__Group_6__23552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__RuleAssignment_6_2_in_rule__Activity__Group_6__2__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__3__Impl_in_rule__Activity__Group_6__33609 = new BitSet(new long[]{0x0008200000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__4_in_rule__Activity__Group_6__33612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__0_in_rule__Activity__Group_6__3__Impl3639 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6__4__Impl_in_rule__Activity__Group_6__43670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Activity__Group_6__4__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__0__Impl_in_rule__Activity__Group_6_3__03739 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__1_in_rule__Activity__Group_6_3__03742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Activity__Group_6_3__0__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_6_3__1__Impl_in_rule__Activity__Group_6_3__13801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__RuleAssignment_6_3_1_in_rule__Activity__Group_6_3__1__Impl3828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__0__Impl_in_rule__Res_Alloc__Group__03862 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__1_in_rule__Res_Alloc__Group__03865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__1__Impl_in_rule__Res_Alloc__Group__13923 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__2_in_rule__Res_Alloc__Group__13926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Res_Alloc__Group__1__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__2__Impl_in_rule__Res_Alloc__Group__23985 = new BitSet(new long[]{0x0180200000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__3_in_rule__Res_Alloc__Group__23988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Res_Alloc__Group__2__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__3__Impl_in_rule__Res_Alloc__Group__34047 = new BitSet(new long[]{0x0180200000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__4_in_rule__Res_Alloc__Group__34050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__0_in_rule__Res_Alloc__Group__3__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__4__Impl_in_rule__Res_Alloc__Group__44108 = new BitSet(new long[]{0x0180200000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__5_in_rule__Res_Alloc__Group__44111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__0_in_rule__Res_Alloc__Group__4__Impl4138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group__5__Impl_in_rule__Res_Alloc__Group__54169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Res_Alloc__Group__5__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__0__Impl_in_rule__Res_Alloc__Group_3__04240 = new BitSet(new long[]{0x4000000000000040L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__1_in_rule__Res_Alloc__Group_3__04243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Res_Alloc__Group_3__0__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_3__1__Impl_in_rule__Res_Alloc__Group_3__14302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__DurationAssignment_3_1_in_rule__Res_Alloc__Group_3__1__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__0__Impl_in_rule__Res_Alloc__Group_4__04363 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__1_in_rule__Res_Alloc__Group_4__04366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Res_Alloc__Group_4__0__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Group_4__1__Impl_in_rule__Res_Alloc__Group_4__14425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Res_Alloc__Res_typeAssignment_4_1_in_rule__Res_Alloc__Group_4__1__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04486 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14547 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__14550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Rule__Group__1__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__24609 = new BitSet(new long[]{0x0400200000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__24612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Rule__Group__2__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__34671 = new BitSet(new long[]{0x0400200000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__34674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl4701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__44732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Rule__Group__4__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__04801 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__04804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Rule__Group_3__0__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__14863 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__2_in_rule__Rule__Group_3__14866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Rule__Group_3__1__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__2__Impl_in_rule__Rule__Group_3__24925 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__3_in_rule__Rule__Group_3__24928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PredicatAssignment_3_2_in_rule__Rule__Group_3__2__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__3__Impl_in_rule__Rule__Group_3__34985 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__4_in_rule__Rule__Group_3__34988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__0_in_rule__Rule__Group_3__3__Impl5015 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3__4__Impl_in_rule__Rule__Group_3__45046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Rule__Group_3__4__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__0__Impl_in_rule__Rule__Group_3_3__05115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__1_in_rule__Rule__Group_3_3__05118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Rule__Group_3_3__0__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_3_3__1__Impl_in_rule__Rule__Group_3_3__15177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PredicatAssignment_3_3_1_in_rule__Rule__Group_3_3__1__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05238 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15299 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Date__Group__1__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25361 = new BitSet(new long[]{0x3000200000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Date__Group__2__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35423 = new BitSet(new long[]{0x3000200000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_3__0_in_rule__Date__Group__3__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45484 = new BitSet(new long[]{0x3000200000000000L});
        public static final BitSet FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_4__0_in_rule__Date__Group__4__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Date__Group__5__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_3__0__Impl_in_rule__Date__Group_3__05616 = new BitSet(new long[]{0x4000000000000040L});
        public static final BitSet FOLLOW_rule__Date__Group_3__1_in_rule__Date__Group_3__05619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Date__Group_3__0__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_3__1__Impl_in_rule__Date__Group_3__15678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_3_1_in_rule__Date__Group_3__1__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_4__0__Impl_in_rule__Date__Group_4__05739 = new BitSet(new long[]{0x0000000FFF000000L});
        public static final BitSet FOLLOW_rule__Date__Group_4__1_in_rule__Date__Group_4__05742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Date__Group_4__0__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group_4__1__Impl_in_rule__Date__Group_4__15801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__MonthAssignment_4_1_in_rule__Date__Group_4__1__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__05862 = new BitSet(new long[]{0x4000000000000040L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__05865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__EIntegerObject__Group__0__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__15927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__0__Impl_in_rule__ResourceType__Group__05987 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__1_in_rule__ResourceType__Group__05990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__1__Impl_in_rule__ResourceType__Group__16048 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__2_in_rule__ResourceType__Group__16051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__ResourceType__Group__1__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__2__Impl_in_rule__ResourceType__Group__26110 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__3_in_rule__ResourceType__Group__26113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__NameAssignment_2_in_rule__ResourceType__Group__2__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__3__Impl_in_rule__ResourceType__Group__36170 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__4_in_rule__ResourceType__Group__36173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ResourceType__Group__3__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__4__Impl_in_rule__ResourceType__Group__46232 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__5_in_rule__ResourceType__Group__46235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__0_in_rule__ResourceType__Group__4__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group__5__Impl_in_rule__ResourceType__Group__56293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__ResourceType__Group__5__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__0__Impl_in_rule__ResourceType__Group_4__06364 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__1_in_rule__ResourceType__Group_4__06367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__ResourceType__Group_4__0__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__Group_4__1__Impl_in_rule__ResourceType__Group_4__16426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceType__ResourceAssignment_4_1_in_rule__ResourceType__Group_4__1__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__06490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__06493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__16551 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__16554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Elevage__Group__1__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__26613 = new BitSet(new long[]{0x0000200000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__26616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Elevage__Group__2__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__36675 = new BitSet(new long[]{0x0000200000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__36678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__46736 = new BitSet(new long[]{0x0000200000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_rule__Elevage__Group__5_in_rule__Elevage__Group__46739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__0_in_rule__Elevage__Group__4__Impl6766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__5__Impl_in_rule__Elevage__Group__56797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Elevage__Group__5__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__06868 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__06871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__Elevage__Group_3__0__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__16930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__AnimalsAssignment_3_1_in_rule__Elevage__Group_3__1__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__0__Impl_in_rule__Elevage__Group_4__06991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__1_in_rule__Elevage__Group_4__06994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__Elevage__Group_4__0__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_4__1__Impl_in_rule__Elevage__Group_4__17053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__ActivityAssignment_4_1_in_rule__Elevage__Group_4__1__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__07114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__07117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__17175 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__17178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__Culture__Group__1__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__27237 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000028L});
        public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__27240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Culture__Group__2__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__37299 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000028L});
        public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__37302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl7329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__47360 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000028L});
        public static final BitSet FOLLOW_rule__Culture__Group__5_in_rule__Culture__Group__47363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__0_in_rule__Culture__Group__4__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__5__Impl_in_rule__Culture__Group__57421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Culture__Group__5__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__07492 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__07495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__Culture__Group_3__0__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__17554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__CerealsAssignment_3_1_in_rule__Culture__Group_3__1__Impl7581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__0__Impl_in_rule__Culture__Group_4__07615 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__1_in_rule__Culture__Group_4__07618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__Culture__Group_4__0__Impl7646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_4__1__Impl_in_rule__Culture__Group_4__17677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__ActivityAssignment_4_1_in_rule__Culture__Group_4__1__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicite_in_rule__Activity__PeriodiciteAssignment_2_17743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivites_in_rule__Activity__ActivitesAssignment_3_17774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_27809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__AtelierAssignment_4_3_17848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_27883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_rule__Activity__Res_allocAssignment_5_3_17914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_27945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__Activity__RuleAssignment_6_3_17976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__Activity__FinAssignment_88007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__Activity__DebutAssignment_108038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__Res_Alloc__DurationAssignment_3_18069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_rule__Res_Alloc__Res_typeAssignment_4_18100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_28135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rule__PredicatAssignment_3_3_18174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__Date__DayAssignment_3_18209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_4_18240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResourceType__NameAssignment_28271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResourceType__ResourceAssignment_4_18306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimals_in_rule__Elevage__AnimalsAssignment_3_18343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_4_18378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCereal_in_rule__Culture__CerealsAssignment_3_18413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_4_18448 = new BitSet(new long[]{0x0000000000000002L});
    }


}