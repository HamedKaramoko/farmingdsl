/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Res Alloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Res_Alloc#getDuration <em>Duration</em>}</li>
 *   <li>{@link activity.Res_Alloc#getRes_type <em>Res type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getRes_Alloc()
 * @model
 * @generated
 */
public interface Res_Alloc extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Integer)
	 * @see activity.ActivityPackage#getRes_Alloc_Duration()
	 * @model
	 * @generated
	 */
	Integer getDuration();

	/**
	 * Sets the value of the '{@link activity.Res_Alloc#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Integer value);

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
	 * @see activity.ActivityPackage#getRes_Alloc_Res_type()
	 * @model containment="true"
	 * @generated
	 */
	ResourceType getRes_type();

	/**
	 * Sets the value of the '{@link activity.Res_Alloc#getRes_type <em>Res type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res type</em>' containment reference.
	 * @see #getRes_type()
	 * @generated
	 */
	void setRes_type(ResourceType value);

} // Res_Alloc
