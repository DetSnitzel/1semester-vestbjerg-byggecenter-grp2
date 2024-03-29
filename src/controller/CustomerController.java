package controller;
import java.util.List;

import model.CustomerContainer;
import model.Person;
import model.PrivateCustomer;
import model.ProductContainer;

public class CustomerController {
	private CustomerContainer customerContainer;
	
	//Contructor
	public CustomerController() {
		customerContainer = CustomerContainer.getInstance();
	}
	

	/**
	 * The method will return a person from a customerContainer, if a person object has been found.
	 * @param phone
	 * @return person
	 */
	public Person findCustomerByPhone(String phone) {
		return customerContainer.findCustomerByPhone(phone);
	}


	public List<Person> findAll() {
		return CustomerContainer.getInstance().findAll();
	}
}
