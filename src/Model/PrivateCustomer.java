package Model;

public class PrivateCustomer extends Person{
	private String phone;
	private String cusomerID;
	private String discount;

	public PrivateCustomer(String phone, String cusomerID, String discount) {
		super();
		this.setPhone(phone);
		this.setCusomerID(cusomerID);
		this.setDiscount(discount);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCusomerID() {
		return cusomerID;
	}

	public void setCusomerID(String cusomerID) {
		this.cusomerID = cusomerID;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
}


 