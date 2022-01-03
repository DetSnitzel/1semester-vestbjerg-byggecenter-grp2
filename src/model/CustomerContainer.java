package model;

import java.util.ArrayList;

import model.Person;


public class CustomerContainer {
	private static CustomerContainer instance;
	private ArrayList<Person> customers;

	/**
	 * Constructor for the class that is private so we follow the Singleton pattern
	 */
	private CustomerContainer() {
		customers = new ArrayList<>();

	}

	/**
	 * Method that creates an instance of this class. There can only be one instance
	 * at a time because of Singleton.
	 * 
	 * @return an instance of CustomerContainer
	 */
	public static CustomerContainer getInstance() {
		if (instance == null) {
			instance = new CustomerContainer();
		}
		return instance;
	}

	/**
	 * Method that searches for customer through their phone number.
	 * 
	 * @param phone
	 * @return customer
	 */
	public Person findCustomerByPhone(String phone) {
		Person customer = null;
		boolean goon = true;
		int i = 0;
		while (goon && i < customers.size()) {
			if (customers.get(i).getPhone().equals(phone)) {
				customer = customers.get(i);
				goon = false;
			}
			i++;
		}
		return customer;
	}

	/**
	 * Method that adds an instance of customer class to this container class.
	 * 
	 * @param customer
	 */
	public void addCustomer(Person customer) {
		customers.add(customer);
	}
}
