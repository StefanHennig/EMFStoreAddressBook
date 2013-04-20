/**
 */
package addressbook.impl;

import addressbook.Address;
import addressbook.AddressbookPackage;
import addressbook.Contact;
import addressbook.Note;
import addressbook.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link addressbook.impl.ContactImpl#getName <em>Name</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getInRelation <em>In Relation</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getRelates <em>Relates</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getIsRelated <em>Is Related</em>}</li>
 *   <li>{@link addressbook.impl.ContactImpl#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContactImpl extends EObjectImpl implements Contact {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected EList<String> phone;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected EList<String> website;

	/**
	 * The cached value of the '{@link #getEMail() <em>EMail</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eMail;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getInRelation() <em>In Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> inRelation;

	/**
	 * The cached value of the '{@link #getRelates() <em>Relates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelates()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relates;

	/**
	 * The cached value of the '{@link #getIsRelated() <em>Is Related</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> isRelated;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressbookPackage.Literals.CONTACT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.CONTACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPhone() {
		if (phone == null) {
			phone = new EDataTypeUniqueEList<String>(String.class, this, AddressbookPackage.CONTACT__PHONE);
		}
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWebsite() {
		if (website == null) {
			website = new EDataTypeUniqueEList<String>(String.class, this, AddressbookPackage.CONTACT__WEBSITE);
		}
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEMail() {
		if (eMail == null) {
			eMail = new EDataTypeUniqueEList<String>(String.class, this, AddressbookPackage.CONTACT__EMAIL);
		}
		return eMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, AddressbookPackage.CONTACT__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getInRelation() {
		if (inRelation == null) {
			inRelation = new EObjectResolvingEList<Contact>(Contact.class, this, AddressbookPackage.CONTACT__IN_RELATION);
		}
		return inRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelates() {
		if (relates == null) {
			relates = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, AddressbookPackage.CONTACT__RELATES, AddressbookPackage.RELATIONSHIP__SOURCE);
		}
		return relates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getIsRelated() {
		if (isRelated == null) {
			isRelated = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, AddressbookPackage.CONTACT__IS_RELATED, AddressbookPackage.RELATIONSHIP__TARGET);
		}
		return isRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Note>(Note.class, this, AddressbookPackage.CONTACT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.CONTACT__RELATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelates()).basicAdd(otherEnd, msgs);
			case AddressbookPackage.CONTACT__IS_RELATED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRelated()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.CONTACT__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case AddressbookPackage.CONTACT__RELATES:
				return ((InternalEList<?>)getRelates()).basicRemove(otherEnd, msgs);
			case AddressbookPackage.CONTACT__IS_RELATED:
				return ((InternalEList<?>)getIsRelated()).basicRemove(otherEnd, msgs);
			case AddressbookPackage.CONTACT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case AddressbookPackage.CONTACT__NAME:
				return getName();
			case AddressbookPackage.CONTACT__PHONE:
				return getPhone();
			case AddressbookPackage.CONTACT__WEBSITE:
				return getWebsite();
			case AddressbookPackage.CONTACT__EMAIL:
				return getEMail();
			case AddressbookPackage.CONTACT__ADDRESS:
				return getAddress();
			case AddressbookPackage.CONTACT__IN_RELATION:
				return getInRelation();
			case AddressbookPackage.CONTACT__RELATES:
				return getRelates();
			case AddressbookPackage.CONTACT__IS_RELATED:
				return getIsRelated();
			case AddressbookPackage.CONTACT__NOTE:
				return getNote();
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
			case AddressbookPackage.CONTACT__NAME:
				setName((String)newValue);
				return;
			case AddressbookPackage.CONTACT__PHONE:
				getPhone().clear();
				getPhone().addAll((Collection<? extends String>)newValue);
				return;
			case AddressbookPackage.CONTACT__WEBSITE:
				getWebsite().clear();
				getWebsite().addAll((Collection<? extends String>)newValue);
				return;
			case AddressbookPackage.CONTACT__EMAIL:
				getEMail().clear();
				getEMail().addAll((Collection<? extends String>)newValue);
				return;
			case AddressbookPackage.CONTACT__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case AddressbookPackage.CONTACT__IN_RELATION:
				getInRelation().clear();
				getInRelation().addAll((Collection<? extends Contact>)newValue);
				return;
			case AddressbookPackage.CONTACT__RELATES:
				getRelates().clear();
				getRelates().addAll((Collection<? extends Relationship>)newValue);
				return;
			case AddressbookPackage.CONTACT__IS_RELATED:
				getIsRelated().clear();
				getIsRelated().addAll((Collection<? extends Relationship>)newValue);
				return;
			case AddressbookPackage.CONTACT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Note>)newValue);
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
			case AddressbookPackage.CONTACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AddressbookPackage.CONTACT__PHONE:
				getPhone().clear();
				return;
			case AddressbookPackage.CONTACT__WEBSITE:
				getWebsite().clear();
				return;
			case AddressbookPackage.CONTACT__EMAIL:
				getEMail().clear();
				return;
			case AddressbookPackage.CONTACT__ADDRESS:
				getAddress().clear();
				return;
			case AddressbookPackage.CONTACT__IN_RELATION:
				getInRelation().clear();
				return;
			case AddressbookPackage.CONTACT__RELATES:
				getRelates().clear();
				return;
			case AddressbookPackage.CONTACT__IS_RELATED:
				getIsRelated().clear();
				return;
			case AddressbookPackage.CONTACT__NOTE:
				getNote().clear();
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
			case AddressbookPackage.CONTACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AddressbookPackage.CONTACT__PHONE:
				return phone != null && !phone.isEmpty();
			case AddressbookPackage.CONTACT__WEBSITE:
				return website != null && !website.isEmpty();
			case AddressbookPackage.CONTACT__EMAIL:
				return eMail != null && !eMail.isEmpty();
			case AddressbookPackage.CONTACT__ADDRESS:
				return address != null && !address.isEmpty();
			case AddressbookPackage.CONTACT__IN_RELATION:
				return inRelation != null && !inRelation.isEmpty();
			case AddressbookPackage.CONTACT__RELATES:
				return relates != null && !relates.isEmpty();
			case AddressbookPackage.CONTACT__IS_RELATED:
				return isRelated != null && !isRelated.isEmpty();
			case AddressbookPackage.CONTACT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Phone: ");
		result.append(phone);
		result.append(", Website: ");
		result.append(website);
		result.append(", EMail: ");
		result.append(eMail);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
