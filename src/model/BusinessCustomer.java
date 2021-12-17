package model;

/**
 * This class is a subclass of the superclass Person, so it inherits from
 * Person.
 */
public class BusinessCustomer extends Person {
	private String customerID;
	private int discount;
	private String cvr;

	/**
	 * Constructor of the class BusinessCustomer
	 * 
	 * @param name
	 * @param phone
	 * @param address
	 * @param email
	 * @param postalCode
	 * @param customerID
	 * @param discount
	 * @param cvr
	 */
	public BusinessCustomer(String name, String phone, String address, String email, String postalCode,
			String customerID, int discount, String cvr) {
		super(name, phone, address, email, postalCode);
		this.customerID = customerID;
		this.discount = discount;
		this.cvr = cvr;
	}

	/**
	 * Accessor that returns the value of customerID
	 * 
	 * @return customerID på businessCustomer
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * Mutator that sets the value of customerID
	 * 
	 * @param customerID på businessCustomer
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * Accessor that returns the value of discount
	 * 
	 * @return discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Mutator that sets the value of discount
	 * 
	 * @param discount
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * Accessor that returns the value of cvr
	 * 
	 * @return cvr
	 */
	public String getCvr() {
		return cvr;
	}

	/**
	 * Mutator that sets the value of cvr
	 * 
	 * @param cvr
	 */
	public void setCvr(String cvr) {
		this.cvr = cvr;
	}

}
