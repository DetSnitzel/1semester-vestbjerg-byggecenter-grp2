package Test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.CustomerController;
import controller.EmployeeController;
import controller.OrderController;
import controller.ProductController;
import model.CustomerContainer;
import model.Order;
import model.OrderContainer;
import model.Person;
import model.PrivateCustomer;
import model.Product;
import model.ProductContainer;


class TestOrder {
	private static OrderController orderController; 
	private static CustomerController customerController; 
	private static ProductController productController; 
	private static EmployeeController employeeController; 
	private static Product p1, p2, p3;
	private static ProductContainer productContainer; 
	private static CustomerContainer customerContainer; 
	private static Person c1, c2, c3; 
	private static Order o1; 
	private static OrderContainer orderContainer; 
	
	@BeforeAll 
	public static void beforeClass() {
		orderController = new OrderController(); 
		customerController = new CustomerController(); 
		productController = new ProductController(); 
		//employeeController = new EmployeeController(); 
		productContainer = ProductContainer.getInstance(); 
		customerContainer = CustomerContainer.getInstance();
		
		p1 = new Product("Hammer", "101", 50);
		p2 = new Product("Sav", "202", 100);
		p3 = new Product("Kegle", "303", 400);
		
		productContainer.addProduct(p1);
		productContainer.addProduct(p2);
		productContainer.addProduct(p3);
		
		c1 = new PrivateCustomer("Bob", "30222998", "Bobvej 69", "Bob@bob.dk", "9000", "1", 10);
		c2 = new PrivateCustomer("Anna", "30231854", "Annavej 69", "Analgren@grenmail.dk", "9000", "2", 15);
		c3 = new PrivateCustomer("Caroline", "53352747", "Carovej 69", "Caro@bernmail.dk", "9000", "3", 20);
		
		customerContainer.addCustomer(c1);
		customerContainer.addCustomer(c2);
		customerContainer.addCustomer(c3);
	}
	@BeforeEach
	void setUp() throws Exception{
		
	}
	
	@Test 
	void createOrderTest() {
		orderController.createOrder(); 
	}
	
	@Test
	void addPersonByPhoneTest() {
		orderController.addCustomer("30231854"); 
		assertSame(p1, orderController.getOrder().getPerson());
	}
	
	@Test
	void addProductToOrderTest() {
		orderController.addProduct("101", 4);
		assertSame(p1, orderController.getOrder().getProduct()); 
	}
	
	@Test 
	void endOrderTest() {
		productController.endOrder(); 
	}
}
