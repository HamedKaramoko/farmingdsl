/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActivityRule()); }
	 iv_ruleActivity=ruleActivity 
	 { $current=$iv_ruleActivity.current; } 
	 EOF 
;

// Rule Activity
ruleActivity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Activity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_1());
    }
(	otherlv_2='periodicite' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getPeriodiciteKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getPeriodicitePeriodiciteEnumRuleCall_2_1_0()); 
	    }
		lv_periodicite_3_0=rulePeriodicite		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"periodicite",
        		lv_periodicite_3_0, 
        		"Periodicite");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='activites' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getActivitesKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getActivitesActivitesEnumRuleCall_3_1_0()); 
	    }
		lv_activites_5_0=ruleActivites		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"activites",
        		lv_activites_5_0, 
        		"Activites");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='atelier' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getAtelierKeyword_4_0());
    }
	otherlv_7='(' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getAtelierAtelierCrossReference_4_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_11=')' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getRightParenthesisKeyword_4_4());
    }
)?(	otherlv_12='res_alloc' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getRes_allocKeyword_5_0());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_2_0()); 
	    }
		lv_res_alloc_14_0=ruleRes_Alloc		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"res_alloc",
        		lv_res_alloc_14_0, 
        		"Res_Alloc");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getRes_allocRes_AllocParserRuleCall_5_3_1_0()); 
	    }
		lv_res_alloc_16_0=ruleRes_Alloc		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"res_alloc",
        		lv_res_alloc_16_0, 
        		"Res_Alloc");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17='}' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4());
    }
)?(	otherlv_18='rule' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRuleKeyword_6_0());
    }
	otherlv_19='{' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_2_0()); 
	    }
		lv_rule_20_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"rule",
        		lv_rule_20_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_21=',' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getRuleRuleParserRuleCall_6_3_1_0()); 
	    }
		lv_rule_22_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"rule",
        		lv_rule_22_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
    }
)?	otherlv_24='fin' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getFinKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getFinDateParserRuleCall_8_0()); 
	    }
		lv_fin_25_0=ruleDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"fin",
        		lv_fin_25_0, 
        		"Date");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_26='debut' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getDebutKeyword_9());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getDebutDateParserRuleCall_10_0()); 
	    }
		lv_debut_27_0=ruleDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"debut",
        		lv_debut_27_0, 
        		"Date");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11());
    }
)
;







// Entry rule entryRuleRes_Alloc
entryRuleRes_Alloc returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRes_AllocRule()); }
	 iv_ruleRes_Alloc=ruleRes_Alloc 
	 { $current=$iv_ruleRes_Alloc.current; } 
	 EOF 
;

// Rule Res_Alloc
ruleRes_Alloc returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRes_AllocAccess().getRes_AllocAction_0(),
            $current);
    }
)	otherlv_1='Res_Alloc' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRes_AllocAccess().getRes_AllocKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRes_AllocAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='duration' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRes_AllocAccess().getDurationKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRes_AllocAccess().getDurationEIntegerObjectParserRuleCall_3_1_0()); 
	    }
		lv_duration_4_0=ruleEIntegerObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRes_AllocRule());
	        }
       		set(
       			$current, 
       			"duration",
        		lv_duration_4_0, 
        		"EIntegerObject");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='res_type' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRes_AllocAccess().getRes_typeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRes_AllocAccess().getRes_typeResourceTypeParserRuleCall_4_1_0()); 
	    }
		lv_res_type_6_0=ruleResourceType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRes_AllocRule());
	        }
       		set(
       			$current, 
       			"res_type",
        		lv_res_type_6_0, 
        		"ResourceType");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRes_AllocAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRuleAccess().getRuleAction_0(),
            $current);
    }
)	otherlv_1='Rule' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='predicat' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getPredicatKeyword_3_0());
    }
	otherlv_4='(' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_3_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getPredicatPredicatCrossReference_3_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightParenthesisKeyword_3_4());
    }
)?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleDate
entryRuleDate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	 iv_ruleDate=ruleDate 
	 { $current=$iv_ruleDate.current; } 
	 EOF 
;

// Rule Date
ruleDate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDateAccess().getDateAction_0(),
            $current);
    }
)	otherlv_1='Date' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='day' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getDayKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntegerObjectParserRuleCall_3_1_0()); 
	    }
		lv_day_4_0=ruleEIntegerObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDateRule());
	        }
       		set(
       			$current, 
       			"day",
        		lv_day_4_0, 
        		"EIntegerObject");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='month' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getMonthKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_4_1_0()); 
	    }
		lv_month_6_0=ruleMonth		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDateRule());
	        }
       		set(
       			$current, 
       			"month",
        		lv_month_6_0, 
        		"Month");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleEIntegerObject
entryRuleEIntegerObject returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntegerObjectRule()); } 
	 iv_ruleEIntegerObject=ruleEIntegerObject 
	 { $current=$iv_ruleEIntegerObject.current.getText(); }  
	 EOF 
;

// Rule EIntegerObject
ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleResourceType
entryRuleResourceType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResourceTypeRule()); }
	 iv_ruleResourceType=ruleResourceType 
	 { $current=$iv_ruleResourceType.current; } 
	 EOF 
;

// Rule ResourceType
ruleResourceType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
            $current);
    }
)	otherlv_1='ResourceType' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getResourceTypeAccess().getResourceTypeKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResourceTypeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getResourceTypeAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='resource' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getResourceTypeAccess().getResourceKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getResourceTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getResourceTypeAccess().getResourceRessourceCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getResourceTypeAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;









// Entry rule entryRuleElevage
entryRuleElevage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElevageRule()); }
	 iv_ruleElevage=ruleElevage 
	 { $current=$iv_ruleElevage.current; } 
	 EOF 
;

// Rule Elevage
ruleElevage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getElevageAccess().getElevageAction_0(),
            $current);
    }
)	otherlv_1='Elevage' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='animals' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getAnimalsKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElevageAccess().getAnimalsAnimalsEnumRuleCall_3_1_0()); 
	    }
		lv_animals_4_0=ruleAnimals		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElevageRule());
	        }
       		set(
       			$current, 
       			"animals",
        		lv_animals_4_0, 
        		"Animals");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='activity' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getActivityKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getElevageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getElevageAccess().getActivityActivityCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleCulture
entryRuleCulture returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCultureRule()); }
	 iv_ruleCulture=ruleCulture 
	 { $current=$iv_ruleCulture.current; } 
	 EOF 
;

// Rule Culture
ruleCulture returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCultureAccess().getCultureAction_0(),
            $current);
    }
)	otherlv_1='Culture' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='cereals' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getCerealsKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCultureAccess().getCerealsCerealEnumRuleCall_3_1_0()); 
	    }
		lv_cereals_4_0=ruleCereal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCultureRule());
	        }
       		set(
       			$current, 
       			"cereals",
        		lv_cereals_4_0, 
        		"Cereal");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='activity' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getActivityKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getCultureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getCultureAccess().getActivityActivityCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Rule Periodicite
rulePeriodicite returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='HALF_DAILY' 
	{
        $current = grammarAccess.getPeriodiciteAccess().getHALF_DAILYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPeriodiciteAccess().getHALF_DAILYEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='DAILY' 
	{
        $current = grammarAccess.getPeriodiciteAccess().getDAILYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPeriodiciteAccess().getDAILYEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='WEEKLY' 
	{
        $current = grammarAccess.getPeriodiciteAccess().getWEEKLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPeriodiciteAccess().getWEEKLYEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='MONTHLY' 
	{
        $current = grammarAccess.getPeriodiciteAccess().getMONTHLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getPeriodiciteAccess().getMONTHLYEnumLiteralDeclaration_3()); 
    }
));



// Rule Activites
ruleActivites returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='LABOUR' 
	{
        $current = grammarAccess.getActivitesAccess().getLABOUREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getActivitesAccess().getLABOUREnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='SEMIS' 
	{
        $current = grammarAccess.getActivitesAccess().getSEMISEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getActivitesAccess().getSEMISEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='IRRIGATION' 
	{
        $current = grammarAccess.getActivitesAccess().getIRRIGATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getActivitesAccess().getIRRIGATIONEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='FERTILISATION' 
	{
        $current = grammarAccess.getActivitesAccess().getFERTILISATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getActivitesAccess().getFERTILISATIONEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='RECOLTE' 
	{
        $current = grammarAccess.getActivitesAccess().getRECOLTEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getActivitesAccess().getRECOLTEEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='ALIMENTATION' 
	{
        $current = grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getActivitesAccess().getALIMENTATIONEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='TRAITE' 
	{
        $current = grammarAccess.getActivitesAccess().getTRAITEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getActivitesAccess().getTRAITEEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='SURVEILLANCE_AGNELAGE' 
	{
        $current = grammarAccess.getActivitesAccess().getSURVEILLANCE_AGNELAGEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getActivitesAccess().getSURVEILLANCE_AGNELAGEEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='SURVEILLANCE_VELAGE' 
	{
        $current = grammarAccess.getActivitesAccess().getSURVEILLANCE_VELAGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getActivitesAccess().getSURVEILLANCE_VELAGEEnumLiteralDeclaration_8()); 
    }
));



// Rule Month
ruleMonth returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='JANUARY' 
	{
        $current = grammarAccess.getMonthAccess().getJANUARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJANUARYEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='FEBRARY' 
	{
        $current = grammarAccess.getMonthAccess().getFEBRARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFEBRARYEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='MARCH' 
	{
        $current = grammarAccess.getMonthAccess().getMARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMARCHEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='APRIL' 
	{
        $current = grammarAccess.getMonthAccess().getAPRILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAPRILEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='MAY' 
	{
        $current = grammarAccess.getMonthAccess().getMAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMAYEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='JUNE' 
	{
        $current = grammarAccess.getMonthAccess().getJUNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJUNEEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='JULY' 
	{
        $current = grammarAccess.getMonthAccess().getJULYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJULYEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='AUGUST' 
	{
        $current = grammarAccess.getMonthAccess().getAUGUSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAUGUSTEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='SEPTEMBER' 
	{
        $current = grammarAccess.getMonthAccess().getSEPTEMBEREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='OCTOBER' 
	{
        $current = grammarAccess.getMonthAccess().getOCTOBEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOCTOBEREnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='NOVEMBER' 
	{
        $current = grammarAccess.getMonthAccess().getNOVEMBEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
    }
)
    |(	enumLiteral_11='DECEMBER' 
	{
        $current = grammarAccess.getMonthAccess().getDECEMBEREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_11, grammarAccess.getMonthAccess().getDECEMBEREnumLiteralDeclaration_11()); 
    }
));



// Rule Animals
ruleAnimals returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='OVIN' 
	{
        $current = grammarAccess.getAnimalsAccess().getOVINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getAnimalsAccess().getOVINEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='BOVIN' 
	{
        $current = grammarAccess.getAnimalsAccess().getBOVINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getAnimalsAccess().getBOVINEnumLiteralDeclaration_1()); 
    }
));



// Rule Cereal
ruleCereal returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='CORN' 
	{
        $current = grammarAccess.getCerealAccess().getCORNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getCerealAccess().getCORNEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='WHEAT' 
	{
        $current = grammarAccess.getCerealAccess().getWHEATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getCerealAccess().getWHEATEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='SORGHUM' 
	{
        $current = grammarAccess.getCerealAccess().getSORGHUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getCerealAccess().getSORGHUMEnumLiteralDeclaration_2()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

