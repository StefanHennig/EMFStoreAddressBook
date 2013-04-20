/**
 */
package addressbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link addressbook.AddressBook#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see addressbook.AddressbookPackage#getAddressBook()
 * @model
 * @generated
 */
public interface AddressBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link addressbook.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see addressbook.AddressbookPackage#getAddressBook_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContact();

} // AddressBook
