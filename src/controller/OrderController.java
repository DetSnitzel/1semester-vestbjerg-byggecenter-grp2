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

	/*
	 * Creating an order, and adds and employee
	 */
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
	
	/**
	 * The method will find a product using a barcode, and return the total amount of products to the order.
	 * @param barcode
	 * @param q
	 * @return product
	 */
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
	

}
