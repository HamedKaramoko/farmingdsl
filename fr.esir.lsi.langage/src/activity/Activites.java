/**
 */
package activity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activites</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage#getActivites()
 * @model
 * @generated
 */
public enum Activites implements Enumerator {
	/**
	 * The '<em><b>LABOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABOUR_VALUE
	 * @generated
	 * @ordered
	 */
	LABOUR(0, "LABOUR", "labour"),

	/**
	 * The '<em><b>SEMIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMIS_VALUE
	 * @generated
	 * @ordered
	 */
	SEMIS(1, "SEMIS", "semis"),

	/**
	 * The '<em><b>IRRIGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRRIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	IRRIGATION(2, "IRRIGATION", "irrigation"),

	/**
	 * The '<em><b>FERTILISATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERTILISATION_VALUE
	 * @generated
	 * @ordered
	 */
	FERTILISATION(3, "FERTILISATION", "fertilisation"),

	/**
	 * The '<em><b>RECOLTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOLTE_VALUE
	 * @generated
	 * @ordered
	 */
	RECOLTE(4, "RECOLTE", "recolte"),

	/**
	 * The '<em><b>ALIMENTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ALIMENTATION(5, "ALIMENTATION", "ALIMENTATION"),

	/**
	 * The '<em><b>TRAITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAITE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAITE(6, "TRAITE", "traite"),

	/**
	 * The '<em><b>SURVEILLANCE AGNELAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_AGNELAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEILLANCE_AGNELAGE(7, "SURVEILLANCE_AGNELAGE", "surveillance_agnelage"),

	/**
	 * The '<em><b>SURVEILLANCE VELAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_VELAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEILLANCE_VELAGE(8, "SURVEILLANCE_VELAGE", "surveillange_velage");

	/**
	 * The '<em><b>LABOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABOUR
	 * @model literal="labour"
	 * @generated
	 * @ordered
	 */
	public static final int LABOUR_VALUE = 0;

	/**
	 * The '<em><b>SEMIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEMIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMIS
	 * @model literal="semis"
	 * @generated
	 * @ordered
	 */
	public static final int SEMIS_VALUE = 1;

	/**
	 * The '<em><b>IRRIGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IRRIGATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRRIGATION
	 * @model literal="irrigation"
	 * @generated
	 * @ordered
	 */
	public static final int IRRIGATION_VALUE = 2;

	/**
	 * The '<em><b>FERTILISATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FERTILISATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FERTILISATION
	 * @model literal="fertilisation"
	 * @generated
	 * @ordered
	 */
	public static final int FERTILISATION_VALUE = 3;

	/**
	 * The '<em><b>RECOLTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECOLTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOLTE
	 * @model literal="recolte"
	 * @generated
	 * @ordered
	 */
	public static final int RECOLTE_VALUE = 4;

	/**
	 * The '<em><b>ALIMENTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALIMENTATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIMENTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALIMENTATION_VALUE = 5;

	/**
	 * The '<em><b>TRAITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAITE
	 * @model literal="traite"
	 * @generated
	 * @ordered
	 */
	public static final int TRAITE_VALUE = 6;

	/**
	 * The '<em><b>SURVEILLANCE AGNELAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SURVEILLANCE AGNELAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_AGNELAGE
	 * @model literal="surveillance_agnelage"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEILLANCE_AGNELAGE_VALUE = 7;

	/**
	 * The '<em><b>SURVEILLANCE VELAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SURVEILLANCE VELAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVEILLANCE_VELAGE
	 * @model literal="surveillange_velage"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEILLANCE_VELAGE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Activites</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Activites[] VALUES_ARRAY =
		new Activites[] {
			LABOUR,
			SEMIS,
			IRRIGATION,
			FERTILISATION,
			RECOLTE,
			ALIMENTATION,
			TRAITE,
			SURVEILLANCE_AGNELAGE,
			SURVEILLANCE_VELAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Activites</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Activites> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activites</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activites get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Activites result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activites</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activites getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Activites result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activites</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activites get(int value) {
		switch (value) {
			case LABOUR_VALUE: return LABOUR;
			case SEMIS_VALUE: return SEMIS;
			case IRRIGATION_VALUE: return IRRIGATION;
			case FERTILISATION_VALUE: return FERTILISATION;
			case RECOLTE_VALUE: return RECOLTE;
			case ALIMENTATION_VALUE: return ALIMENTATION;
			case TRAITE_VALUE: return TRAITE;
			case SURVEILLANCE_AGNELAGE_VALUE: return SURVEILLANCE_AGNELAGE;
			case SURVEILLANCE_VELAGE_VALUE: return SURVEILLANCE_VELAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Activites(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Activites
