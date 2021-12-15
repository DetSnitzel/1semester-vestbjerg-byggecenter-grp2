package model;
import java.util.ArrayList;

import model.Person;

public class CustomerContainer {
	private static CustomerContainer instance;
	private ArrayList<Person> customers;
	
	
	private CustomerContainer() {
		customers = new ArrayList<>();
		
	}
	
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
    	while(goon && i<customers.size()) {
    		if(customers.get(i).getPhone().equals(phone)) {
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
