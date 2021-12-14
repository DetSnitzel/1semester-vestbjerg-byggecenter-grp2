package model;

public class PrivateCustomer extends Person{
	private String customerID;
	private int discount;

	public PrivateCustomer(String name, String phone, String address, String email, String postalCode,
			String customerID, int discount) {
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

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}


 