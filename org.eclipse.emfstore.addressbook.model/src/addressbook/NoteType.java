/**
 */
package addressbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Note Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see addressbook.AddressbookPackage#getNoteType()
 * @model
 * @generated
 */
public enum NoteType implements Enumerator {
	/**
	 * The '<em><b>MEETING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEETING_VALUE
	 * @generated
	 * @ordered
	 */
	MEETING(0, "MEETING", "MEETING"),

	/**
	 * The '<em><b>CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALL_VALUE
	 * @generated
	 * @ordered
	 */
	CALL(1, "CALL", "CALL"),

	/**
	 * The '<em><b>EMAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(2, "EMAIL", "EMAIL");

	/**
	 * The '<em><b>MEETING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEETING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEETING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEETING_VALUE = 0;

	/**
	 * The '<em><b>CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALL_VALUE = 1;

	/**
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoteType[] VALUES_ARRAY =
		new NoteType[] {
			MEETING,
			CALL,
			EMAIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoteType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoteType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoteType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoteType get(int value) {
		switch (value) {
			case MEETING_VALUE: return MEETING;
			case CALL_VALUE: return CALL;
			case EMAIL_VALUE: return EMAIL;
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
	private NoteType(int value, String name, String literal) {
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
	
} //NoteType
