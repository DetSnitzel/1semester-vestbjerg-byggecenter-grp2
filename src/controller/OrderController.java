package controller;

import model.*;

public class OrderController {

	private OrderContainer orderContainer;
	private ProductController productController;
	private EmployeeController employeeController;
	private CustomerController customerController;
	private Order order;

	public OrderController() {
		orderContainer = OrderContainer.getInstance();
		productController = new ProductController();
		employeeController = EmployeeController.getInstance();
		customerController = new CustomerController();
	}
	//Metoden laver en ordre, hvor den tilføjer en Employee 
	public Order createOrder() {
		Employee employee = employeeController.getLoggedInEmployee();
		this.order = new Order(employee);
		return this.order;
	}
	//Metoden finder og returnere en person via det indtastede telefonnr og derefter bliver personen tilføjet til ordren. 
	public Person addCustomer(String phone) {
		Person res = customerController.findCustomerByPhone(phone);
		if (res != null) {
			order.addPerson(res);
		}

		return res;
	}
	//Metoden finder et product via stregkoden og derefter tilføjer den resultatet af den indtastede barcode og antallet af produktet til ordren. 
	public Product addProduct(String barcode, int q) {
		Product res = productController.findProductByBarcode(barcode);
		if (res != null) {
			order.addProduct(res, q);
		}
		return productController.findProductByBarcode(barcode);
	}

	public boolean endOrder() {
		return orderContainer.addOrder(order);
	}
	
	//Den her bruges i TestOrder, så den skal måske slettes 
	//public Order getOrder() {
		
		//return order;
	//}
}
