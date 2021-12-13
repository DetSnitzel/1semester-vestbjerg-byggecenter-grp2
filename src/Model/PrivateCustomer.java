package Model;

public class PrivateCustomer extends Person{
	private String phone; 
	private String CusomerID;
	private String Discount;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCusomerID() {
		return CusomerID;
	}
	public void setCusomerID(String cusomerID) {
		CusomerID = cusomerID;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
}
 