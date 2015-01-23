/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Model#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link activity.Model#getActivity <em>Activity</em>}</li>
 *   <li>{@link activity.Model#getRes_type <em>Res type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Model)
	 * @see activity.ActivityPackage#getModel_EReference0()
	 * @model
	 * @generated
	 */
	Model getEReference0();

	/**
	 * Sets the value of the '{@link activity.Model#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Model value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see activity.ActivityPackage#getModel_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Res type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res type</em>' containment reference.
	 * @see #setRes_type(ResourceType)
	 * @see activity.ActivityPackage#getModel_Res_type()
	 * @model containment="true"
	 * @generated
	 */
	ResourceType getRes_type();

	/**
	 * Sets the value of the '{@link activity.Model#getRes_type <em>Res type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res type</em>' containment reference.
	 * @see #getRes_type()
	 * @generated
	 */
	void setRes_type(ResourceType value);

} // Model
