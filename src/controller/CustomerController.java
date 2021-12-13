package controller;
import model.CustomerContainer;
import model.Person;

public class CustomerController {
	private CustomerContainer customerContainer;
	
	
	public Person findCustomerByPhone(String phone) {
		Person customer = null;
		CustomerContainer cc = CustomerContainer.getInstance();
		customer = cc.findCustomerByPhone(phone);
		return customer;
	}
}
