package controller;
import model.CustomerContainer;
import model.Person;
import model.PrivateCustomer;

public class CustomerController {
	private CustomerContainer customerContainer;
	
	
	public CustomerController() {
		customerContainer = CustomerContainer.getInstance();
	}
	public Person findCustomerByPhone(String phone) {
		return customerContainer.findCustomerByPhone(phone);
	}
}
