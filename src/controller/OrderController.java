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

	public Order createOrder() {
		Employee employee = employeeController.getLoggedInEmployee();
		this.order = new Order(employee);
		return this.order;
	}

	public Person addCustomer(String phone) {
		Person res = customerController.findCustomerByPhone(phone);
		if (res != null) {
			order.addPerson(res);
		}

		return res;
	}

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
