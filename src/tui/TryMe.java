package tui;

import model.*;

public class TryMe {
	private PrivateCustomer customer1;
	private PrivateCustomer customer2;
	private PrivateCustomer customer3;
	private Product product1;
	private Product product2;
	private Product product3;
	
	public TryMe() {
		
	}
	
	public void generateTestData() {
		//Getting the singleton contatiner
		CustomerContainer cc = CustomerContainer.getInstance();
		ProductContainer pc = ProductContainer.getInstance();
		
		/*customer = new PrivateCustomer(name, phone, address, email, postalcode, customerID, discount); */
		// Auto generated objects are being created to test the program.
		customer1 = new PrivateCustomer("Bob", "30222998", "Bobvej 69", "Bob@bob.dk", "9000", "1", 10);
		customer2 = new PrivateCustomer("Anna", "30231854", "Annavej 69", "Analgren@grenmail.dk", "9000", "2", 15);
		customer3 = new PrivateCustomer("Caroline", "53352747", "Carovej 69", "Caro@bernmail.dk", "9000", "3", 20);
		
		product1 = new Product("Hammer", "101", 50);
		product2 = new Product("Sav", "202", 100);
		product3 = new Product("Kegle", "303", 400);
		
		cc.addCustomer(customer1);
		cc.addCustomer(customer2);
		cc.addCustomer(customer3);
		
		pc.addProduct(product1);
		pc.addProduct(product2);
		pc.addProduct(product3);
		
		System.out.println("Customer1 info:");
		System.out.println("------------");
		System.out.println(customer1.getName());
		System.out.println(customer1.getPhone());
		System.out.println(customer1.getAddress());
		System.out.println(customer1.getEmail());
		System.out.println(customer1.getPostalCode());
		System.out.println(customer1.getCustomerID());
		System.out.println(customer1.getDiscount());
		System.out.println();
		System.out.println("Customer2 info:");
		System.out.println("------------");
		System.out.println(customer2.getName());
		System.out.println(customer2.getPhone());
		System.out.println(customer2.getAddress());
		System.out.println(customer2.getEmail());
		System.out.println(customer2.getPostalCode());
		System.out.println(customer2.getCustomerID());
		System.out.println(customer2.getDiscount());
		System.out.println();
		System.out.println("Customer3 info:");
		System.out.println("------------");
		System.out.println(customer3.getName());
		System.out.println(customer3.getPhone());
		System.out.println(customer3.getAddress());
		System.out.println(customer3.getEmail());
		System.out.println(customer3.getPostalCode());
		System.out.println(customer3.getCustomerID());
		System.out.println(customer3.getDiscount());
		System.out.println();
		
		System.out.println();
		System.out.println("TEST DATA GENERATED");
	}
}
