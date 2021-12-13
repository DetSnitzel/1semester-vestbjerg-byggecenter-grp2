package model;

public class PrivateCustomer extends Person{
	private String customerID;
	private String discount;

	public PrivateCustomer(String name, String phone, String address, String email, String postalCode,
			String customerID, String discount) {
		super(name, phone, address, email, postalCode);
		this.customerID = customerID;
		this.discount = discount;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
}


 