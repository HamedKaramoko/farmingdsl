/**
 */
package activity;

import exploitation.Atelier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Activity#getPeriodicite <em>Periodicite</em>}</li>
 *   <li>{@link activity.Activity#getRes_alloc <em>Res alloc</em>}</li>
 *   <li>{@link activity.Activity#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.Activity#getFin <em>Fin</em>}</li>
 *   <li>{@link activity.Activity#getDebut <em>Debut</em>}</li>
 *   <li>{@link activity.Activity#getAtelier <em>Atelier</em>}</li>
 *   <li>{@link activity.Activity#getActivites <em>Activites</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Periodicite</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.Periodicite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicite</em>' attribute.
	 * @see activity.Periodicite
	 * @see #setPeriodicite(Periodicite)
	 * @see activity.ActivityPackage#getActivity_Periodicite()
	 * @model
	 * @generated
	 */
	Periodicite getPeriodicite();

	/**
	 * Sets the value of the '{@link activity.Activity#getPeriodicite <em>Periodicite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicite</em>' attribute.
	 * @see activity.Periodicite
	 * @see #getPeriodicite()
	 * @generated
	 */
	void setPeriodicite(Periodicite value);

	/**
	 * Returns the value of the '<em><b>Res alloc</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Res_Alloc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res alloc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res alloc</em>' containment reference list.
	 * @see activity.ActivityPackage#getActivity_Res_alloc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Res_Alloc> getRes_alloc();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see activity.ActivityPackage#getActivity_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' containment reference.
	 * @see #setFin(Date)
	 * @see activity.ActivityPackage#getActivity_Fin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getFin();

	/**
	 * Sets the value of the '{@link activity.Activity#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Date value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' containment reference.
	 * @see #setDebut(Date)
	 * @see activity.ActivityPackage#getActivity_Debut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getDebut();

	/**
	 * Sets the value of the '{@link activity.Activity#getDebut <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' containment reference.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Atelier</b></em>' reference list.
	 * The list contents are of type {@link exploitation.Atelier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atelier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atelier</em>' reference list.
	 * @see activity.ActivityPackage#getActivity_Atelier()
	 * @model
	 * @generated
	 */
	EList<Atelier> getAtelier();

	/**
	 * Returns the value of the '<em><b>Activites</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.Activites}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activites</em>' attribute.
	 * @see activity.Activites
	 * @see #setActivites(Activites)
	 * @see activity.ActivityPackage#getActivity_Activites()
	 * @model
	 * @generated
	 */
	Activites getActivites();

	/**
	 * Sets the value of the '{@link activity.Activity#getActivites <em>Activites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activites</em>' attribute.
	 * @see activity.Activites
	 * @see #getActivites()
	 * @generated
	 */
	void setActivites(Activites value);

} // Activity
