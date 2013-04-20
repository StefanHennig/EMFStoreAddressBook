/**
 */
package addressbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link addressbook.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link addressbook.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link addressbook.Relationship#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see addressbook.AddressbookPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link addressbook.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see addressbook.RelationshipType
	 * @see #setType(RelationshipType)
	 * @see addressbook.AddressbookPackage#getRelationship_Type()
	 * @model
	 * @generated
	 */
	RelationshipType getType();

	/**
	 * Sets the value of the '{@link addressbook.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see addressbook.RelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link addressbook.Contact#getIsRelated <em>Is Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Contact)
	 * @see addressbook.AddressbookPackage#getRelationship_Target()
	 * @see addressbook.Contact#getIsRelated
	 * @model opposite="isRelated" required="true"
	 * @generated
	 */
	Contact getTarget();

	/**
	 * Sets the value of the '{@link addressbook.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Contact value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link addressbook.Contact#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Contact)
	 * @see addressbook.AddressbookPackage#getRelationship_Source()
	 * @see addressbook.Contact#getRelates
	 * @model opposite="relates" required="true" transient="false"
	 * @generated
	 */
	Contact getSource();

	/**
	 * Sets the value of the '{@link addressbook.Relationship#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Contact value);

} // Relationship
