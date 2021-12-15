package model;

public class BusinessCustomer extends Person {
	private String customerID;
	private int discount;
	private String cvr;


	public BusinessCustomer(String name, String phone, String address, String email, String postalCode,
			String customerID, int discount, String cvr) {
		super(name, phone, address, email, postalCode);
		this.customerID = customerID;
		this.discount = discount;
		this.cvr = cvr;

	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getCvr() {
		return cvr;
	}

	public void setCvr(String cvr) {
		this.cvr = cvr;
	}

	
}

