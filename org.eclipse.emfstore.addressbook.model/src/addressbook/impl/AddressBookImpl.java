/**
 */
package addressbook.impl;

import addressbook.AddressBook;
import addressbook.AddressbookPackage;
import addressbook.Contact;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link addressbook.impl.AddressBookImpl#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressBookImpl extends EObjectImpl implements AddressBook {
	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressbookPackage.Literals.ADDRESS_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<Contact>(Contact.class, this, AddressbookPackage.ADDRESS_BOOK__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__CONTACT:
				return getContact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends Contact>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__CONTACT:
				getContact().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__CONTACT:
				return contact != null && !contact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddressBookImpl
