/**
 */
package addressbook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link addressbook.Company#getIndustry <em>Industry</em>}</li>
 * </ul>
 * </p>
 *
 * @see addressbook.AddressbookPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends Contact {
	/**
	 * Returns the value of the '<em><b>Industry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Industry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry</em>' attribute.
	 * @see #setIndustry(String)
	 * @see addressbook.AddressbookPackage#getCompany_Industry()
	 * @model
	 * @generated
	 */
	String getIndustry();

	/**
	 * Sets the value of the '{@link addressbook.Company#getIndustry <em>Industry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Industry</em>' attribute.
	 * @see #getIndustry()
	 * @generated
	 */
	void setIndustry(String value);

} // Company
