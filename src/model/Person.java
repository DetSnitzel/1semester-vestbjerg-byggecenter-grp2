package model;

/**
 * This class is an abstract superclass, so it is being inherited from
 * by subclasses PrivateCustomer, BusinessCustomer and Employee.
 * Also, it can not be instantiated.
 */
public abstract class Person {
	private String name;
	private String phone;
	private String address;
	private String email;
	private String postalCode;
	
	/**
	 * Constructor - creates a new Person object with the below parameters:
	 * @param name
	 * @param phone
	 * @param address
	 * @param email
	 * @param postalCode
	 */
	public Person(String name, String phone, String address, String email, String postalCode) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.postalCode = postalCode;
	}

	/**
	 * Accessor that returns the value of name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Mutator that sets the value of name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Accessor that returns the value of phone
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Mutator that sets the value of phone
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Accessor that returns the value of address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Mutator that sets the value of address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Accessor that returns the value of email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Mutator that sets the value of email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Accessor that returns the value of postalCode
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Mutator that sets the value of postalCode
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
