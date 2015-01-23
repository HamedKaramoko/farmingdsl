package org.xtext.example.mydsl.parser.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Activity'", "'{'", "'periodicite'", "'activites'", "'atelier'", "'('", "','", "')'", "'res_alloc'", "'}'", "'rule'", "'fin'", "'debut'", "'Res_Alloc'", "'duration'", "'res_type'", "'Rule'", "'predicat'", "'Date'", "'day'", "'month'", "'-'", "'ResourceType'", "'resource'", "'Elevage'", "'animals'", "'activity'", "'Culture'", "'cereals'", "'HALF_DAILY'", "'DAILY'", "'WEEKLY'", "'MONTHLY'", "'LABOUR'", "'SEMIS'", "'IRRIGATION'", "'FERTILISATION'", "'RECOLTE'", "'ALIMENTATION'", "'TRAITE'", "'SURVEILLANCE_AGNELAGE'", "'SURVEILLANCE_VELAGE'", "'JANUARY'", "'FEBRARY'", "'MARCH'", "'APRIL'", "'MAY'", "'JUNE'", "'JULY'", "'AUGUST'", "'SEPTEMBER'", "'OCTOBER'", "'NOVEMBER'", "'DECEMBER'", "'OVIN'", "'BOVIN'", "'CORN'", "'WHEAT'", "'SORGHUM'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Activity";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleActivity"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity75);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity85); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Enumerator lv_periodicite_3_0 = null;

        Enumerator lv_activites_5_0 = null;

        EObject lv_res_alloc_14_0 = null;

        EObject lv_res_alloc_16_0 = null;

        EObject lv_rule_20_0 = null;

        EObject lv_rule_22_0 = null;

        EObject lv_fin_25_0 = null;

        EObject lv_debut_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:3: otherlv_0= 'Activity' otherlv_1= '{' (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )? (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )? (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )? (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )? otherlv_24= 'fin' ( (lv_fin_25_0= ruleDate ) ) otherlv_26= 'debut' ( (lv_debut_27_0= ruleDate ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleActivity122); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity134); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:89:1: (otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:89:3: otherlv_2= 'periodicite' ( (lv_periodicite_3_0= rulePeriodicite ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleActivity147); 

                        	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: ( (lv_periodicite_3_0= rulePeriodicite ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: (lv_periodicite_3_0= rulePeriodicite )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:94:1: (lv_periodicite_3_0= rulePeriodicite )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:95:3: lv_periodicite_3_0= rulePeriodicite
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicite_in_ruleActivity168);
                    lv_periodicite_3_0=rulePeriodicite();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicite",
                            		lv_periodicite_3_0, 
                            		"Periodicite");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:4: (otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:6: otherlv_4= 'activites' ( (lv_activites_5_0= ruleActivites ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity183); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getActivitesKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ( (lv_activites_5_0= ruleActivites ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_activites_5_0= ruleActivites )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: (lv_activites_5_0= ruleActivites )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:3: lv_activites_5_0= ruleActivites
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActivites_in_ruleActivity204);
                    lv_activites_5_0=ruleActivites();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"activites",
                            		lv_activites_5_0, 
                            		"Activites");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:4: (otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:6: otherlv_6= 'atelier' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity219); 

                        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getAtelierKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleActivity231); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:141:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity254);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity267); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: ( ruleEString )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity290);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleActivity304); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:3: (otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:5: otherlv_12= 'res_alloc' otherlv_13= '{' ( (lv_res_alloc_14_0= ruleRes_Alloc ) ) (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleActivity319); 

                        	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getRes_allocKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity331); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: ( (lv_res_alloc_14_0= ruleRes_Alloc ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:1: (lv_res_alloc_14_0= ruleRes_Alloc )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:1: (lv_res_alloc_14_0= ruleRes_Alloc )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:189:3: lv_res_alloc_14_0= ruleRes_Alloc
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_ruleActivity352);
                    lv_res_alloc_14_0=ruleRes_Alloc();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"res_alloc",
                            		lv_res_alloc_14_0, 
                            		"Res_Alloc");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:2: (otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:4: otherlv_15= ',' ( (lv_res_alloc_16_0= ruleRes_Alloc ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity365); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:1: ( (lv_res_alloc_16_0= ruleRes_Alloc ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_res_alloc_16_0= ruleRes_Alloc )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_res_alloc_16_0= ruleRes_Alloc )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:3: lv_res_alloc_16_0= ruleRes_Alloc
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_ruleActivity386);
                    	    lv_res_alloc_16_0=ruleRes_Alloc();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"res_alloc",
                    	            		lv_res_alloc_16_0, 
                    	            		"Res_Alloc");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity400); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:3: (otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:5: otherlv_18= 'rule' otherlv_19= '{' ( (lv_rule_20_0= ruleRule ) ) (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleActivity415); 

                        	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRuleKeyword_6_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity427); 

                        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: ( (lv_rule_20_0= ruleRule ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_rule_20_0= ruleRule )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_rule_20_0= ruleRule )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:3: lv_rule_20_0= ruleRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleActivity448);
                    lv_rule_20_0=ruleRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"rule",
                            		lv_rule_20_0, 
                            		"Rule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:2: (otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:4: otherlv_21= ',' ( (lv_rule_22_0= ruleRule ) )
                    	    {
                    	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleActivity461); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:1: ( (lv_rule_22_0= ruleRule ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_rule_22_0= ruleRule )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_rule_22_0= ruleRule )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:3: lv_rule_22_0= ruleRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleActivity482);
                    	    lv_rule_22_0=ruleRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rule",
                    	            		lv_rule_22_0, 
                    	            		"Rule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity496); 

                        	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleActivity510); 

                	newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getFinKeyword_7());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:1: ( (lv_fin_25_0= ruleDate ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_fin_25_0= ruleDate )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_fin_25_0= ruleDate )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:3: lv_fin_25_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleActivity531);
            lv_fin_25_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"fin",
                    		lv_fin_25_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_26=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleActivity543); 

                	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getDebutKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:1: ( (lv_debut_27_0= ruleDate ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_debut_27_0= ruleDate )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_debut_27_0= ruleDate )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:3: lv_debut_27_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleActivity564);
            lv_debut_27_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"debut",
                    		lv_debut_27_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_28=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity576); 

                	newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleRes_Alloc"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: entryRuleRes_Alloc returns [EObject current=null] : iv_ruleRes_Alloc= ruleRes_Alloc EOF ;
    public final EObject entryRuleRes_Alloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRes_Alloc = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:2: (iv_ruleRes_Alloc= ruleRes_Alloc EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:2: iv_ruleRes_Alloc= ruleRes_Alloc EOF
            {
             newCompositeNode(grammarAccess.getRes_AllocRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc614);
            iv_ruleRes_Alloc=ruleRes_Alloc();

            state._fsp--;

             current =iv_ruleRes_Alloc; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRes_Alloc624); 

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
    // $ANTLR end "entryRuleRes_Alloc"


    // $ANTLR start "ruleRes_Alloc"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: ruleRes_Alloc returns [EObject current=null] : ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRes_Alloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        EObject lv_res_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:28: ( ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: ( () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: () otherlv_1= 'Res_Alloc' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRes_AllocAccess().getRes_AllocAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRes_Alloc670); 

                	newLeafNode(otherlv_1, grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRes_Alloc682); 

                	newLeafNode(otherlv_2, grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:3: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRes_Alloc695); 

                        	newLeafNode(otherlv_3, grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: ( (lv_duration_4_0= ruleEIntegerObject ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_duration_4_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_duration_4_0= ruleEIntegerObject )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:3: lv_duration_4_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleRes_Alloc716);
                    lv_duration_4_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRes_AllocRule());
                    	        }
                           		set(
                           			current, 
                           			"duration",
                            		lv_duration_4_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:4: (otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:6: otherlv_5= 'res_type' ( (lv_res_type_6_0= ruleResourceType ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRes_Alloc731); 

                        	newLeafNode(otherlv_5, grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: ( (lv_res_type_6_0= ruleResourceType ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (lv_res_type_6_0= ruleResourceType )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (lv_res_type_6_0= ruleResourceType )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:3: lv_res_type_6_0= ruleResourceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_ruleRes_Alloc752);
                    lv_res_type_6_0=ruleResourceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRes_AllocRule());
                    	        }
                           		set(
                           			current, 
                           			"res_type",
                            		lv_res_type_6_0, 
                            		"ResourceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRes_Alloc766); 

                	newLeafNode(otherlv_7, grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRes_Alloc"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule802);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule812); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: ruleRule returns [EObject current=null] : ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:28: ( ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:2: () otherlv_1= 'Rule' otherlv_2= '{' (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleAccess().getRuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRule858); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule870); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:1: (otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:3: otherlv_3= 'predicat' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRule883); 

                        	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getPredicatKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRule895); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRule918);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:474:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRule931); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:1: ( ( ruleEString ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ( ruleEString )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRuleRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRule954);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRule968); 

                        	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRule982); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate1018);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate1028); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:518:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_day_4_0 = null;

        Enumerator lv_month_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:28: ( ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: ( () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: () otherlv_1= 'Date' otherlv_2= '{' (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDate1074); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate1086); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:1: (otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:3: otherlv_3= 'day' ( (lv_day_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDate1099); 

                        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getDayKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: ( (lv_day_4_0= ruleEIntegerObject ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:1: (lv_day_4_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:1: (lv_day_4_0= ruleEIntegerObject )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:3: lv_day_4_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleDate1120);
                    lv_day_4_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"day",
                            		lv_day_4_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:4: (otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:6: otherlv_5= 'month' ( (lv_month_6_0= ruleMonth ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDate1135); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getMonthKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: ( (lv_month_6_0= ruleMonth ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: (lv_month_6_0= ruleMonth )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: (lv_month_6_0= ruleMonth )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:3: lv_month_6_0= ruleMonth
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMonth_in_ruleDate1156);
                    lv_month_6_0=ruleMonth();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"month",
                            		lv_month_6_0, 
                            		"Month");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate1170); 

                	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1207);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject1218); 

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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEIntegerObject1257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEIntegerObject1274); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleResourceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:626:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:627:2: (iv_ruleResourceType= ruleResourceType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:628:2: iv_ruleResourceType= ruleResourceType EOF
            {
             newCompositeNode(grammarAccess.getResourceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_entryRuleResourceType1319);
            iv_ruleResourceType=ruleResourceType();

            state._fsp--;

             current =iv_ruleResourceType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceType1329); 

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
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:1: ruleResourceType returns [EObject current=null] : ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:28: ( ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:1: ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:1: ( () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:2: () otherlv_1= 'ResourceType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resource' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:640:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleResourceType1375); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResourceType1396);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleResourceType1408); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (otherlv_4= 'resource' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:3: otherlv_4= 'resource' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleResourceType1421); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResourceType1444);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleResourceType1458); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1495);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1506); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:711:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1546); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:723:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1572); 

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


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: entryRuleElevage returns [EObject current=null] : iv_ruleElevage= ruleElevage EOF ;
    public final EObject entryRuleElevage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElevage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:2: (iv_ruleElevage= ruleElevage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:2: iv_ruleElevage= ruleElevage EOF
            {
             newCompositeNode(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage1621);
            iv_ruleElevage=ruleElevage();

            state._fsp--;

             current =iv_ruleElevage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage1631); 

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
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:1: ruleElevage returns [EObject current=null] : ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleElevage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_animals_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:28: ( ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:2: () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElevageAccess().getElevageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleElevage1677); 

                	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElevage1689); 

                	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:1: (otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:3: otherlv_3= 'animals' ( (lv_animals_4_0= ruleAnimals ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleElevage1702); 

                        	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getAnimalsKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:1: ( (lv_animals_4_0= ruleAnimals ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:1: (lv_animals_4_0= ruleAnimals )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:1: (lv_animals_4_0= ruleAnimals )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:3: lv_animals_4_0= ruleAnimals
                    {
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnimals_in_ruleElevage1723);
                    lv_animals_4_0=ruleAnimals();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElevageRule());
                    	        }
                           		set(
                           			current, 
                           			"animals",
                            		lv_animals_4_0, 
                            		"Animals");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:4: (otherlv_5= 'activity' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:6: otherlv_5= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleElevage1738); 

                        	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getActivityKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:795:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElevageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElevage1761);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElevage1775); 

                	newLeafNode(otherlv_7, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:822:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:823:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture1811);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture1821); 

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
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: ruleCulture returns [EObject current=null] : ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_cereals_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:28: ( ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:2: () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )? (otherlv_5= 'activity' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCultureAccess().getCultureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCulture1867); 

                	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCulture1879); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:1: (otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:3: otherlv_3= 'cereals' ( (lv_cereals_4_0= ruleCereal ) )
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCulture1892); 

                        	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getCerealsKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:1: ( (lv_cereals_4_0= ruleCereal ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: (lv_cereals_4_0= ruleCereal )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: (lv_cereals_4_0= ruleCereal )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:3: lv_cereals_4_0= ruleCereal
                    {
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCereal_in_ruleCulture1913);
                    lv_cereals_4_0=ruleCereal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCultureRule());
                    	        }
                           		set(
                           			current, 
                           			"cereals",
                            		lv_cereals_4_0, 
                            		"Cereal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:4: (otherlv_5= 'activity' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:6: otherlv_5= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCulture1928); 

                        	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getActivityKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:1: ( ( ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:1: ( ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:876:1: ( ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:877:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCultureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCulture1951);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCulture1965); 

                	newLeafNode(otherlv_7, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCulture"


    // $ANTLR start "rulePeriodicite"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:902:1: rulePeriodicite returns [Enumerator current=null] : ( (enumLiteral_0= 'HALF_DAILY' ) | (enumLiteral_1= 'DAILY' ) | (enumLiteral_2= 'WEEKLY' ) | (enumLiteral_3= 'MONTHLY' ) ) ;
    public final Enumerator rulePeriodicite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:904:28: ( ( (enumLiteral_0= 'HALF_DAILY' ) | (enumLiteral_1= 'DAILY' ) | (enumLiteral_2= 'WEEKLY' ) | (enumLiteral_3= 'MONTHLY' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:1: ( (enumLiteral_0= 'HALF_DAILY' ) | (enumLiteral_1= 'DAILY' ) | (enumLiteral_2= 'WEEKLY' ) | (enumLiteral_3= 'MONTHLY' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:1: ( (enumLiteral_0= 'HALF_DAILY' ) | (enumLiteral_1= 'DAILY' ) | (enumLiteral_2= 'WEEKLY' ) | (enumLiteral_3= 'MONTHLY' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                alt22=3;
                }
                break;
            case 43:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:2: (enumLiteral_0= 'HALF_DAILY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:2: (enumLiteral_0= 'HALF_DAILY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:905:4: enumLiteral_0= 'HALF_DAILY'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePeriodicite2015); 

                            current = grammarAccess.getPeriodiciteAccess().getHALF_DAILYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPeriodiciteAccess().getHALF_DAILYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:6: (enumLiteral_1= 'DAILY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:6: (enumLiteral_1= 'DAILY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:8: enumLiteral_1= 'DAILY'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePeriodicite2032); 

                            current = grammarAccess.getPeriodiciteAccess().getDAILYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPeriodiciteAccess().getDAILYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:6: (enumLiteral_2= 'WEEKLY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:6: (enumLiteral_2= 'WEEKLY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:8: enumLiteral_2= 'WEEKLY'
                    {
                    enumLiteral_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePeriodicite2049); 

                            current = grammarAccess.getPeriodiciteAccess().getWEEKLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPeriodiciteAccess().getWEEKLYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:6: (enumLiteral_3= 'MONTHLY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:6: (enumLiteral_3= 'MONTHLY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:8: enumLiteral_3= 'MONTHLY'
                    {
                    enumLiteral_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePeriodicite2066); 

                            current = grammarAccess.getPeriodiciteAccess().getMONTHLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPeriodiciteAccess().getMONTHLYEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "rulePeriodicite"


    // $ANTLR start "ruleActivites"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: ruleActivites returns [Enumerator current=null] : ( (enumLiteral_0= 'LABOUR' ) | (enumLiteral_1= 'SEMIS' ) | (enumLiteral_2= 'IRRIGATION' ) | (enumLiteral_3= 'FERTILISATION' ) | (enumLiteral_4= 'RECOLTE' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'TRAITE' ) | (enumLiteral_7= 'SURVEILLANCE_AGNELAGE' ) | (enumLiteral_8= 'SURVEILLANCE_VELAGE' ) ) ;
    public final Enumerator ruleActivites() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:935:28: ( ( (enumLiteral_0= 'LABOUR' ) | (enumLiteral_1= 'SEMIS' ) | (enumLiteral_2= 'IRRIGATION' ) | (enumLiteral_3= 'FERTILISATION' ) | (enumLiteral_4= 'RECOLTE' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'TRAITE' ) | (enumLiteral_7= 'SURVEILLANCE_AGNELAGE' ) | (enumLiteral_8= 'SURVEILLANCE_VELAGE' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:1: ( (enumLiteral_0= 'LABOUR' ) | (enumLiteral_1= 'SEMIS' ) | (enumLiteral_2= 'IRRIGATION' ) | (enumLiteral_3= 'FERTILISATION' ) | (enumLiteral_4= 'RECOLTE' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'TRAITE' ) | (enumLiteral_7= 'SURVEILLANCE_AGNELAGE' ) | (enumLiteral_8= 'SURVEILLANCE_VELAGE' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:1: ( (enumLiteral_0= 'LABOUR' ) | (enumLiteral_1= 'SEMIS' ) | (enumLiteral_2= 'IRRIGATION' ) | (enumLiteral_3= 'FERTILISATION' ) | (enumLiteral_4= 'RECOLTE' ) | (enumLiteral_5= 'ALIMENTATION' ) | (enumLiteral_6= 'TRAITE' ) | (enumLiteral_7= 'SURVEILLANCE_AGNELAGE' ) | (enumLiteral_8= 'SURVEILLANCE_VELAGE' ) )
            int alt23=9;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt23=1;
                }
                break;
            case 45:
                {
                alt23=2;
                }
                break;
            case 46:
                {
                alt23=3;
                }
                break;
            case 47:
                {
                alt23=4;
                }
                break;
            case 48:
                {
                alt23=5;
                }
                break;
            case 49:
                {
                alt23=6;
                }
                break;
            case 50:
                {
                alt23=7;
                }
                break;
            case 51:
                {
                alt23=8;
                }
                break;
            case 52:
                {
                alt23=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:2: (enumLiteral_0= 'LABOUR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:2: (enumLiteral_0= 'LABOUR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:4: enumLiteral_0= 'LABOUR'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleActivites2111); 

                            current = grammarAccess.getActivitesAccess().getLABOUREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getActivitesAccess().getLABOUREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:6: (enumLiteral_1= 'SEMIS' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:6: (enumLiteral_1= 'SEMIS' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:8: enumLiteral_1= 'SEMIS'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleActivites2128); 

                            current = grammarAccess.getActivitesAccess().getSEMISEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getActivitesAccess().getSEMISEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:6: (enumLiteral_2= 'IRRIGATION' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:6: (enumLiteral_2= 'IRRIGATION' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:8: enumLiteral_2= 'IRRIGATION'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleActivites2145); 

                            current = grammarAccess.getActivitesAccess().getIRRIGATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getActivitesAccess().getIRRIGATIONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:6: (enumLiteral_3= 'FERTILISATION' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:6: (enumLiteral_3= 'FERTILISATION' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:8: enumLiteral_3= 'FERTILISATION'
                    {
                    enumLiteral_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleActivites2162); 

                            current = grammarAccess.getActivitesAccess().getFERTILISATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getActivitesAccess().getFERTILISATIONEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:6: (enumLiteral_4= 'RECOLTE' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:6: (enumLiteral_4= 'RECOLTE' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:8: enumLiteral_4= 'RECOLTE'
                    {
                    enumLiteral_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleActivites2179); 

                            current = grammarAccess.getActivitesAccess().getRECOLTEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getActivitesAccess().getRECOLTEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:6: (enumLiteral_5= 'ALIMENTATION' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:6: (enumLiteral_5= 'ALIMENTATION' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:8: enumLiteral_5= 'ALIMENTATION'
                    {
                    enumLiteral_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleActivites2196); 

                            current = grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:6: (enumLiteral_6= 'TRAITE' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:6: (enumLiteral_6= 'TRAITE' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:8: enumLiteral_6= 'TRAITE'
                    {
                    enumLiteral_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleActivites2213); 

                            current = grammarAccess.getActivitesAccess().getTRAITEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getActivitesAccess().getTRAITEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:6: (enumLiteral_7= 'SURVEILLANCE_AGNELAGE' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:6: (enumLiteral_7= 'SURVEILLANCE_AGNELAGE' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:8: enumLiteral_7= 'SURVEILLANCE_AGNELAGE'
                    {
                    enumLiteral_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleActivites2230); 

                            current = grammarAccess.getActivitesAccess().getSURVEILLANCE_AGNELAGEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getActivitesAccess().getSURVEILLANCE_AGNELAGEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:6: (enumLiteral_8= 'SURVEILLANCE_VELAGE' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:6: (enumLiteral_8= 'SURVEILLANCE_VELAGE' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:8: enumLiteral_8= 'SURVEILLANCE_VELAGE'
                    {
                    enumLiteral_8=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleActivites2247); 

                            current = grammarAccess.getActivitesAccess().getSURVEILLANCE_VELAGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getActivitesAccess().getSURVEILLANCE_VELAGEEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "ruleActivites"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:1: ruleMonth returns [Enumerator current=null] : ( (enumLiteral_0= 'JANUARY' ) | (enumLiteral_1= 'FEBRARY' ) | (enumLiteral_2= 'MARCH' ) | (enumLiteral_3= 'APRIL' ) | (enumLiteral_4= 'MAY' ) | (enumLiteral_5= 'JUNE' ) | (enumLiteral_6= 'JULY' ) | (enumLiteral_7= 'AUGUST' ) | (enumLiteral_8= 'SEPTEMBER' ) | (enumLiteral_9= 'OCTOBER' ) | (enumLiteral_10= 'NOVEMBER' ) | (enumLiteral_11= 'DECEMBER' ) ) ;
    public final Enumerator ruleMonth() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:28: ( ( (enumLiteral_0= 'JANUARY' ) | (enumLiteral_1= 'FEBRARY' ) | (enumLiteral_2= 'MARCH' ) | (enumLiteral_3= 'APRIL' ) | (enumLiteral_4= 'MAY' ) | (enumLiteral_5= 'JUNE' ) | (enumLiteral_6= 'JULY' ) | (enumLiteral_7= 'AUGUST' ) | (enumLiteral_8= 'SEPTEMBER' ) | (enumLiteral_9= 'OCTOBER' ) | (enumLiteral_10= 'NOVEMBER' ) | (enumLiteral_11= 'DECEMBER' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:1: ( (enumLiteral_0= 'JANUARY' ) | (enumLiteral_1= 'FEBRARY' ) | (enumLiteral_2= 'MARCH' ) | (enumLiteral_3= 'APRIL' ) | (enumLiteral_4= 'MAY' ) | (enumLiteral_5= 'JUNE' ) | (enumLiteral_6= 'JULY' ) | (enumLiteral_7= 'AUGUST' ) | (enumLiteral_8= 'SEPTEMBER' ) | (enumLiteral_9= 'OCTOBER' ) | (enumLiteral_10= 'NOVEMBER' ) | (enumLiteral_11= 'DECEMBER' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:1: ( (enumLiteral_0= 'JANUARY' ) | (enumLiteral_1= 'FEBRARY' ) | (enumLiteral_2= 'MARCH' ) | (enumLiteral_3= 'APRIL' ) | (enumLiteral_4= 'MAY' ) | (enumLiteral_5= 'JUNE' ) | (enumLiteral_6= 'JULY' ) | (enumLiteral_7= 'AUGUST' ) | (enumLiteral_8= 'SEPTEMBER' ) | (enumLiteral_9= 'OCTOBER' ) | (enumLiteral_10= 'NOVEMBER' ) | (enumLiteral_11= 'DECEMBER' ) )
            int alt24=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt24=1;
                }
                break;
            case 54:
                {
                alt24=2;
                }
                break;
            case 55:
                {
                alt24=3;
                }
                break;
            case 56:
                {
                alt24=4;
                }
                break;
            case 57:
                {
                alt24=5;
                }
                break;
            case 58:
                {
                alt24=6;
                }
                break;
            case 59:
                {
                alt24=7;
                }
                break;
            case 60:
                {
                alt24=8;
                }
                break;
            case 61:
                {
                alt24=9;
                }
                break;
            case 62:
                {
                alt24=10;
                }
                break;
            case 63:
                {
                alt24=11;
                }
                break;
            case 64:
                {
                alt24=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:2: (enumLiteral_0= 'JANUARY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:2: (enumLiteral_0= 'JANUARY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:4: enumLiteral_0= 'JANUARY'
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMonth2292); 

                            current = grammarAccess.getMonthAccess().getJANUARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJANUARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:6: (enumLiteral_1= 'FEBRARY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:6: (enumLiteral_1= 'FEBRARY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:8: enumLiteral_1= 'FEBRARY'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMonth2309); 

                            current = grammarAccess.getMonthAccess().getFEBRARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFEBRARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:6: (enumLiteral_2= 'MARCH' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:6: (enumLiteral_2= 'MARCH' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:8: enumLiteral_2= 'MARCH'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMonth2326); 

                            current = grammarAccess.getMonthAccess().getMARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMARCHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:6: (enumLiteral_3= 'APRIL' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:6: (enumLiteral_3= 'APRIL' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:8: enumLiteral_3= 'APRIL'
                    {
                    enumLiteral_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMonth2343); 

                            current = grammarAccess.getMonthAccess().getAPRILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAPRILEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:6: (enumLiteral_4= 'MAY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:6: (enumLiteral_4= 'MAY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:8: enumLiteral_4= 'MAY'
                    {
                    enumLiteral_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMonth2360); 

                            current = grammarAccess.getMonthAccess().getMAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:6: (enumLiteral_5= 'JUNE' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:6: (enumLiteral_5= 'JUNE' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:8: enumLiteral_5= 'JUNE'
                    {
                    enumLiteral_5=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMonth2377); 

                            current = grammarAccess.getMonthAccess().getJUNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJUNEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:6: (enumLiteral_6= 'JULY' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:6: (enumLiteral_6= 'JULY' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:8: enumLiteral_6= 'JULY'
                    {
                    enumLiteral_6=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleMonth2394); 

                            current = grammarAccess.getMonthAccess().getJULYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJULYEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:6: (enumLiteral_7= 'AUGUST' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:6: (enumLiteral_7= 'AUGUST' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:8: enumLiteral_7= 'AUGUST'
                    {
                    enumLiteral_7=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleMonth2411); 

                            current = grammarAccess.getMonthAccess().getAUGUSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:6: (enumLiteral_8= 'SEPTEMBER' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:6: (enumLiteral_8= 'SEPTEMBER' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:8: enumLiteral_8= 'SEPTEMBER'
                    {
                    enumLiteral_8=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleMonth2428); 

                            current = grammarAccess.getMonthAccess().getSEPTEMBEREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:6: (enumLiteral_9= 'OCTOBER' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:6: (enumLiteral_9= 'OCTOBER' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:8: enumLiteral_9= 'OCTOBER'
                    {
                    enumLiteral_9=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleMonth2445); 

                            current = grammarAccess.getMonthAccess().getOCTOBEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1057:6: (enumLiteral_10= 'NOVEMBER' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1057:6: (enumLiteral_10= 'NOVEMBER' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1057:8: enumLiteral_10= 'NOVEMBER'
                    {
                    enumLiteral_10=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleMonth2462); 

                            current = grammarAccess.getMonthAccess().getNOVEMBEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:6: (enumLiteral_11= 'DECEMBER' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:6: (enumLiteral_11= 'DECEMBER' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:8: enumLiteral_11= 'DECEMBER'
                    {
                    enumLiteral_11=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleMonth2479); 

                            current = grammarAccess.getMonthAccess().getDECEMBEREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                        

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
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleAnimals"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: ruleAnimals returns [Enumerator current=null] : ( (enumLiteral_0= 'OVIN' ) | (enumLiteral_1= 'BOVIN' ) ) ;
    public final Enumerator ruleAnimals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:28: ( ( (enumLiteral_0= 'OVIN' ) | (enumLiteral_1= 'BOVIN' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:1: ( (enumLiteral_0= 'OVIN' ) | (enumLiteral_1= 'BOVIN' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:1: ( (enumLiteral_0= 'OVIN' ) | (enumLiteral_1= 'BOVIN' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            else if ( (LA25_0==66) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:2: (enumLiteral_0= 'OVIN' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:2: (enumLiteral_0= 'OVIN' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:4: enumLiteral_0= 'OVIN'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleAnimals2524); 

                            current = grammarAccess.getAnimalsAccess().getOVINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnimalsAccess().getOVINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:6: (enumLiteral_1= 'BOVIN' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:6: (enumLiteral_1= 'BOVIN' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:8: enumLiteral_1= 'BOVIN'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleAnimals2541); 

                            current = grammarAccess.getAnimalsAccess().getBOVINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnimalsAccess().getBOVINEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleAnimals"


    // $ANTLR start "ruleCereal"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: ruleCereal returns [Enumerator current=null] : ( (enumLiteral_0= 'CORN' ) | (enumLiteral_1= 'WHEAT' ) | (enumLiteral_2= 'SORGHUM' ) ) ;
    public final Enumerator ruleCereal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:28: ( ( (enumLiteral_0= 'CORN' ) | (enumLiteral_1= 'WHEAT' ) | (enumLiteral_2= 'SORGHUM' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:1: ( (enumLiteral_0= 'CORN' ) | (enumLiteral_1= 'WHEAT' ) | (enumLiteral_2= 'SORGHUM' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:1: ( (enumLiteral_0= 'CORN' ) | (enumLiteral_1= 'WHEAT' ) | (enumLiteral_2= 'SORGHUM' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt26=1;
                }
                break;
            case 68:
                {
                alt26=2;
                }
                break;
            case 69:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:2: (enumLiteral_0= 'CORN' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:2: (enumLiteral_0= 'CORN' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:4: enumLiteral_0= 'CORN'
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCereal2586); 

                            current = grammarAccess.getCerealAccess().getCORNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCerealAccess().getCORNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:6: (enumLiteral_1= 'WHEAT' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:6: (enumLiteral_1= 'WHEAT' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:8: enumLiteral_1= 'WHEAT'
                    {
                    enumLiteral_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCereal2603); 

                            current = grammarAccess.getCerealAccess().getWHEATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCerealAccess().getWHEATEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1107:6: (enumLiteral_2= 'SORGHUM' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1107:6: (enumLiteral_2= 'SORGHUM' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1107:8: enumLiteral_2= 'SORGHUM'
                    {
                    enumLiteral_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCereal2620); 

                            current = grammarAccess.getCerealAccess().getSORGHUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCerealAccess().getSORGHUMEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleCereal"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleActivity122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity134 = new BitSet(new long[]{0x000000000068E000L});
        public static final BitSet FOLLOW_13_in_ruleActivity147 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_rulePeriodicite_in_ruleActivity168 = new BitSet(new long[]{0x000000000068C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity183 = new BitSet(new long[]{0x001FF00000000000L});
        public static final BitSet FOLLOW_ruleActivites_in_ruleActivity204 = new BitSet(new long[]{0x0000000000688000L});
        public static final BitSet FOLLOW_15_in_ruleActivity219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleActivity231 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity254 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleActivity267 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity290 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleActivity304 = new BitSet(new long[]{0x0000000000680000L});
        public static final BitSet FOLLOW_19_in_ruleActivity319 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity331 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_ruleActivity352 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleActivity365 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_ruleActivity386 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleActivity400 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleActivity415 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity427 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleActivity448 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_17_in_ruleActivity461 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleActivity482 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleActivity496 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleActivity510 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleActivity531 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleActivity543 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleActivity564 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleActivity576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRes_Alloc_in_entryRuleRes_Alloc614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRes_Alloc624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleRes_Alloc670 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRes_Alloc682 = new BitSet(new long[]{0x0000000006100000L});
        public static final BitSet FOLLOW_25_in_ruleRes_Alloc695 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleRes_Alloc716 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleRes_Alloc731 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleResourceType_in_ruleRes_Alloc752 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRes_Alloc766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRule858 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule870 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_28_in_ruleRule883 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRule895 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRule918 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleRule931 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRule954 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleRule968 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRule982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDate1074 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDate1086 = new BitSet(new long[]{0x00000000C0100000L});
        public static final BitSet FOLLOW_30_in_ruleDate1099 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleDate1120 = new BitSet(new long[]{0x0000000080100000L});
        public static final BitSet FOLLOW_31_in_ruleDate1135 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleMonth_in_ruleDate1156 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDate1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEIntegerObject1257 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceType_in_entryRuleResourceType1319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceType1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleResourceType1375 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResourceType1396 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleResourceType1408 = new BitSet(new long[]{0x0000000400100000L});
        public static final BitSet FOLLOW_34_in_ruleResourceType1421 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResourceType1444 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleResourceType1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleElevage1677 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElevage1689 = new BitSet(new long[]{0x0000003000100000L});
        public static final BitSet FOLLOW_36_in_ruleElevage1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_ruleAnimals_in_ruleElevage1723 = new BitSet(new long[]{0x0000002000100000L});
        public static final BitSet FOLLOW_37_in_ruleElevage1738 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElevage1761 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleElevage1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture1811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCulture1867 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCulture1879 = new BitSet(new long[]{0x000000A000100000L});
        public static final BitSet FOLLOW_39_in_ruleCulture1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
        public static final BitSet FOLLOW_ruleCereal_in_ruleCulture1913 = new BitSet(new long[]{0x0000002000100000L});
        public static final BitSet FOLLOW_37_in_ruleCulture1928 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCulture1951 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCulture1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePeriodicite2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePeriodicite2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePeriodicite2049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePeriodicite2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleActivites2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleActivites2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleActivites2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleActivites2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleActivites2179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleActivites2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleActivites2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleActivites2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleActivites2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleMonth2292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMonth2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMonth2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMonth2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMonth2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMonth2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleMonth2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleMonth2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleMonth2428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleMonth2445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleMonth2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMonth2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleAnimals2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleAnimals2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCereal2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleCereal2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleCereal2620 = new BitSet(new long[]{0x0000000000000002L});
    }


}