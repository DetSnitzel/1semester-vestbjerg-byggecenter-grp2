package model;

public abstract class Person {
	private String name;
	private String phone;
	private String address;
	private String email;
	private String postalCode;
	
	public Person(String name, String phone, String address, String email, String postalCode) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.postalCode = postalCode;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
