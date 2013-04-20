/**
 */
package addressbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link addressbook.Contact#getName <em>Name</em>}</li>
 *   <li>{@link addressbook.Contact#getPhone <em>Phone</em>}</li>
 *   <li>{@link addressbook.Contact#getWebsite <em>Website</em>}</li>
 *   <li>{@link addressbook.Contact#getEMail <em>EMail</em>}</li>
 *   <li>{@link addressbook.Contact#getAddress <em>Address</em>}</li>
 *   <li>{@link addressbook.Contact#getInRelation <em>In Relation</em>}</li>
 *   <li>{@link addressbook.Contact#getRelates <em>Relates</em>}</li>
 *   <li>{@link addressbook.Contact#getIsRelated <em>Is Related</em>}</li>
 *   <li>{@link addressbook.Contact#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see addressbook.AddressbookPackage#getContact()
 * @model abstract="true"
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see addressbook.AddressbookPackage#getContact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link addressbook.Contact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute list.
	 * @see addressbook.AddressbookPackage#getContact_Phone()
	 * @model
	 * @generated
	 */
	EList<String> getPhone();

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute list.
	 * @see addressbook.AddressbookPackage#getContact_Website()
	 * @model
	 * @generated
	 */
	EList<String> getWebsite();

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMail</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute list.
	 * @see addressbook.AddressbookPackage#getContact_EMail()
	 * @model
	 * @generated
	 */
	EList<String> getEMail();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link addressbook.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see addressbook.AddressbookPackage#getContact_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>In Relation</b></em>' reference list.
	 * The list contents are of type {@link addressbook.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relation</em>' reference list.
	 * @see addressbook.AddressbookPackage#getContact_InRelation()
	 * @model
	 * @generated
	 */
	EList<Contact> getInRelation();

	/**
	 * Returns the value of the '<em><b>Relates</b></em>' containment reference list.
	 * The list contents are of type {@link addressbook.Relationship}.
	 * It is bidirectional and its opposite is '{@link addressbook.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' containment reference list.
	 * @see addressbook.AddressbookPackage#getContact_Relates()
	 * @see addressbook.Relationship#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelates();

	/**
	 * Returns the value of the '<em><b>Is Related</b></em>' reference list.
	 * The list contents are of type {@link addressbook.Relationship}.
	 * It is bidirectional and its opposite is '{@link addressbook.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related</em>' reference list.
	 * @see addressbook.AddressbookPackage#getContact_IsRelated()
	 * @see addressbook.Relationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relationship> getIsRelated();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link addressbook.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see addressbook.AddressbookPackage#getContact_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNote();

} // Contact
