/**
 */
package activity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activity.ActivityFactory
 * @model kind="package"
 * @generated
 */
public interface ActivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://activity/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityPackage eINSTANCE = activity.impl.ActivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link activity.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ResourceTypeImpl
	 * @see activity.impl.ActivityPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.PredicatImpl <em>Predicat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.PredicatImpl
	 * @see activity.impl.ActivityPackageImpl#getPredicat()
	 * @generated
	 */
	int PREDICAT = 1;

	/**
	 * The number of structural features of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.RuleImpl
	 * @see activity.impl.ActivityPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Predicat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PREDICAT = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ActivityImpl
	 * @see activity.impl.ActivityPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Periodicite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERIODICITE = 0;

	/**
	 * The feature id for the '<em><b>Res alloc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RES_ALLOC = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RULE = 2;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FIN = 3;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DEBUT = 4;

	/**
	 * The feature id for the '<em><b>Atelier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ATELIER = 5;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITES = 6;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ModelImpl
	 * @see activity.impl.ActivityPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Res type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RES_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.DateImpl
	 * @see activity.impl.ActivityPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 5;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 1;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.Res_AllocImpl <em>Res Alloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.Res_AllocImpl
	 * @see activity.impl.ActivityPackageImpl#getRes_Alloc()
	 * @generated
	 */
	int RES_ALLOC = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_ALLOC__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Res type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_ALLOC__RES_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Res Alloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_ALLOC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Res Alloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_ALLOC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.Month <em>Month</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.Month
	 * @see activity.impl.ActivityPackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 7;

	/**
	 * The meta object id for the '{@link activity.Periodicite <em>Periodicite</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.Periodicite
	 * @see activity.impl.ActivityPackageImpl#getPeriodicite()
	 * @generated
	 */
	int PERIODICITE = 8;


	/**
	 * The meta object id for the '{@link activity.Activites <em>Activites</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.Activites
	 * @see activity.impl.ActivityPackageImpl#getActivites()
	 * @generated
	 */
	int ACTIVITES = 9;

	/**
	 * Returns the meta object for class '{@link activity.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see activity.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link activity.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activity.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for the reference '{@link activity.ResourceType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see activity.ResourceType#getResource()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Resource();

	/**
	 * Returns the meta object for class '{@link activity.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicat</em>'.
	 * @see activity.Predicat
	 * @generated
	 */
	EClass getPredicat();

	/**
	 * Returns the meta object for class '{@link activity.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see activity.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference list '{@link activity.Rule#getPredicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicat</em>'.
	 * @see activity.Rule#getPredicat()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Predicat();

	/**
	 * Returns the meta object for class '{@link activity.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see activity.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link activity.Activity#getPeriodicite <em>Periodicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicite</em>'.
	 * @see activity.Activity#getPeriodicite()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Periodicite();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Activity#getRes_alloc <em>Res alloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Res alloc</em>'.
	 * @see activity.Activity#getRes_alloc()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Res_alloc();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Activity#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see activity.Activity#getRule()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Activity#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see activity.Activity#getFin()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Fin();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Activity#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see activity.Activity#getDebut()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Debut();

	/**
	 * Returns the meta object for the reference list '{@link activity.Activity#getAtelier <em>Atelier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atelier</em>'.
	 * @see activity.Activity#getAtelier()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Atelier();

	/**
	 * Returns the meta object for the attribute '{@link activity.Activity#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activites</em>'.
	 * @see activity.Activity#getActivites()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Activites();

	/**
	 * Returns the meta object for class '{@link activity.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see activity.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference '{@link activity.Model#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see activity.Model#getEReference0()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_EReference0();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Model#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see activity.Model#getActivity()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Model#getRes_type <em>Res type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res type</em>'.
	 * @see activity.Model#getRes_type()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Res_type();

	/**
	 * Returns the meta object for class '{@link activity.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see activity.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link activity.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see activity.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link activity.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see activity.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for class '{@link activity.Res_Alloc <em>Res Alloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Alloc</em>'.
	 * @see activity.Res_Alloc
	 * @generated
	 */
	EClass getRes_Alloc();

	/**
	 * Returns the meta object for the attribute '{@link activity.Res_Alloc#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see activity.Res_Alloc#getDuration()
	 * @see #getRes_Alloc()
	 * @generated
	 */
	EAttribute getRes_Alloc_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Res_Alloc#getRes_type <em>Res type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res type</em>'.
	 * @see activity.Res_Alloc#getRes_type()
	 * @see #getRes_Alloc()
	 * @generated
	 */
	EReference getRes_Alloc_Res_type();

	/**
	 * Returns the meta object for enum '{@link activity.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month</em>'.
	 * @see activity.Month
	 * @generated
	 */
	EEnum getMonth();

	/**
	 * Returns the meta object for enum '{@link activity.Periodicite <em>Periodicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Periodicite</em>'.
	 * @see activity.Periodicite
	 * @generated
	 */
	EEnum getPeriodicite();

	/**
	 * Returns the meta object for enum '{@link activity.Activites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activites</em>'.
	 * @see activity.Activites
	 * @generated
	 */
	EEnum getActivites();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityFactory getActivityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activity.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ResourceTypeImpl
		 * @see activity.impl.ActivityPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RESOURCE = eINSTANCE.getResourceType_Resource();

		/**
		 * The meta object literal for the '{@link activity.impl.PredicatImpl <em>Predicat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.PredicatImpl
		 * @see activity.impl.ActivityPackageImpl#getPredicat()
		 * @generated
		 */
		EClass PREDICAT = eINSTANCE.getPredicat();

		/**
		 * The meta object literal for the '{@link activity.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.RuleImpl
		 * @see activity.impl.ActivityPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Predicat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PREDICAT = eINSTANCE.getRule_Predicat();

		/**
		 * The meta object literal for the '{@link activity.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ActivityImpl
		 * @see activity.impl.ActivityPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Periodicite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PERIODICITE = eINSTANCE.getActivity_Periodicite();

		/**
		 * The meta object literal for the '<em><b>Res alloc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RES_ALLOC = eINSTANCE.getActivity_Res_alloc();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RULE = eINSTANCE.getActivity_Rule();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FIN = eINSTANCE.getActivity_Fin();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DEBUT = eINSTANCE.getActivity_Debut();

		/**
		 * The meta object literal for the '<em><b>Atelier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ATELIER = eINSTANCE.getActivity_Atelier();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITES = eINSTANCE.getActivity_Activites();

		/**
		 * The meta object literal for the '{@link activity.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ModelImpl
		 * @see activity.impl.ActivityPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EREFERENCE0 = eINSTANCE.getModel_EReference0();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTIVITY = eINSTANCE.getModel_Activity();

		/**
		 * The meta object literal for the '<em><b>Res type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RES_TYPE = eINSTANCE.getModel_Res_type();

		/**
		 * The meta object literal for the '{@link activity.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.DateImpl
		 * @see activity.impl.ActivityPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '{@link activity.impl.Res_AllocImpl <em>Res Alloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.Res_AllocImpl
		 * @see activity.impl.ActivityPackageImpl#getRes_Alloc()
		 * @generated
		 */
		EClass RES_ALLOC = eINSTANCE.getRes_Alloc();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_ALLOC__DURATION = eINSTANCE.getRes_Alloc_Duration();

		/**
		 * The meta object literal for the '<em><b>Res type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_ALLOC__RES_TYPE = eINSTANCE.getRes_Alloc_Res_type();

		/**
		 * The meta object literal for the '{@link activity.Month <em>Month</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.Month
		 * @see activity.impl.ActivityPackageImpl#getMonth()
		 * @generated
		 */
		EEnum MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '{@link activity.Periodicite <em>Periodicite</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.Periodicite
		 * @see activity.impl.ActivityPackageImpl#getPeriodicite()
		 * @generated
		 */
		EEnum PERIODICITE = eINSTANCE.getPeriodicite();

		/**
		 * The meta object literal for the '{@link activity.Activites <em>Activites</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.Activites
		 * @see activity.impl.ActivityPackageImpl#getActivites()
		 * @generated
		 */
		EEnum ACTIVITES = eINSTANCE.getActivites();

	}

} //ActivityPackage
