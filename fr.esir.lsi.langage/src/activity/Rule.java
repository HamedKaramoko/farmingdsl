/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Rule#getPredicat <em>Predicat</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicat</b></em>' reference list.
	 * The list contents are of type {@link activity.Predicat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicat</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicat</em>' reference list.
	 * @see activity.ActivityPackage#getRule_Predicat()
	 * @model
	 * @generated
	 */
	EList<Predicat> getPredicat();

} // Rule
