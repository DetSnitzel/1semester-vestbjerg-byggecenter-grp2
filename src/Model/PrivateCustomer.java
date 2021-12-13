package Model;

public class PrivateCustomer extends Person{
	private String customerID;
	private String discount;

	public PrivateCustomer(String customerID, String discount) {
		super();
		this.setCustomerID(customerID);
		this.setDiscount(discount);
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


 