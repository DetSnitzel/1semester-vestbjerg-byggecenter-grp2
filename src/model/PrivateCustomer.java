package model;

/**
 * This class is a subclass of the superclass Person, so it inherits from
 * Person.
 */
public class PrivateCustomer extends Person{
	private String customerID;
	private int discount;

	/**
	 * Constructor - creates a new object with the below parameters:
	 * @param name
	 * @param phone
	 * @param address
	 * @param email
	 * @param postalCode
	 * @param customerID
	 * @param discount
	 */
	public PrivateCustomer(String name, String phone, String address, String email, String postalCode,
			String customerID, int discount) {
		super(name, phone, address, email, postalCode);
		this.customerID = customerID;
		this.discount = discount;
	}

	/**
	 * Accessor that returns the value of customerID
	 * 
	 * @return customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * Mutator that sets the value of customerID
	 * 
	 * @param customerID
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * Accessor that returns the value of discount
	 * 
	 * @return discount
	 */
	public int getDiscount() {
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
}


 