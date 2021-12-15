package controller;
import model.CustomerContainer;
import model.Person;
import model.PrivateCustomer;

public class CustomerController {
	private CustomerContainer customerContainer;
	
	
	public CustomerController() {
		customerContainer = CustomerContainer.getInstance();
	}
	
	//Metoden returnere en person fra customerContainer hvis der fundet et Person objekt. 
	public Person findCustomerByPhone(String phone) {
		return customerContainer.findCustomerByPhone(phone);
	}
}
