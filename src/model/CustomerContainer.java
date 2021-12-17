package model;

import java.util.ArrayList;

import model.Person;

/**
 * This class stores the data from customers after they are created.
 */
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
	 * Met
	 * @return an instance of CustomerContainer
	 */
	public static CustomerContainer getInstance() {
		if (instance == null) {
			instance = new CustomerContainer();
		}
		return instance;
	}

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

	public void addCustomer(Person customer) {
		customers.add(customer);
	}
}
