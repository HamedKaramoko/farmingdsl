package org.xtext.example.mydsl.serializer;

import activity.Activity;
import activity.ActivityPackage;
import activity.Date;
import activity.Predicat;
import activity.Res_Alloc;
import activity.ResourceType;
import activity.Rule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import exploitation.Culture;
import exploitation.Elevage;
import exploitation.ExploitationPackage;
import exploitation.Ressource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActivityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActivityPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.DATE:
				if(context == grammarAccess.getDateRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.PREDICAT:
				if(context == grammarAccess.getPredicatRule()) {
					sequence_Predicat(context, (Predicat) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RES_ALLOC:
				if(context == grammarAccess.getRes_AllocRule()) {
					sequence_Res_Alloc(context, (Res_Alloc) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RESOURCE_TYPE:
				if(context == grammarAccess.getResourceTypeRule()) {
					sequence_ResourceType(context, (ResourceType) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ExploitationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExploitationPackage.CULTURE:
				if(context == grammarAccess.getAtelierRule() ||
				   context == grammarAccess.getCultureRule()) {
					sequence_Culture(context, (Culture) semanticObject); 
					return; 
				}
				else break;
			case ExploitationPackage.ELEVAGE:
				if(context == grammarAccess.getAtelierRule() ||
				   context == grammarAccess.getElevageRule()) {
					sequence_Elevage(context, (Elevage) semanticObject); 
					return; 
				}
				else break;
			case ExploitationPackage.RESSOURCE:
				if(context == grammarAccess.getRessourceRule()) {
					sequence_Ressource(context, (Ressource) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         periodicite=Periodicite? 
	 *         activites=Activites? 
	 *         (atelier+=[Atelier|EString] atelier+=[Atelier|EString]*)? 
	 *         (res_alloc+=Res_Alloc res_alloc+=Res_Alloc*)? 
	 *         (rule+=Rule rule+=Rule*)? 
	 *         fin=Date 
	 *         debut=Date
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cereals=Cereal? activity=[Activity|EString]?)
	 */
	protected void sequence_Culture(EObject context, Culture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (day=EIntegerObject? month=Month?)
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (animals=Animals? activity=[Activity|EString]?)
	 */
	protected void sequence_Elevage(EObject context, Elevage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Predicat}
	 */
	protected void sequence_Predicat(EObject context, Predicat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (duration=EIntegerObject? res_type=ResourceType?)
	 */
	protected void sequence_Res_Alloc(EObject context, Res_Alloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString resource=[Ressource|EString]?)
	 */
	protected void sequence_ResourceType(EObject context, ResourceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString resourceType=[ResourceType|EString]?)
	 */
	protected void sequence_Ressource(EObject context, Ressource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((predicat+=[Predicat|EString] predicat+=[Predicat|EString]*)?)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
