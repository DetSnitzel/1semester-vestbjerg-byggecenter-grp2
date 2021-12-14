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
		employeeController = new EmployeeController();
		customerController = new CustomerController();
	}

	public Order createOrder(Employee employeeID) {
		this.order = new Order(employeeID);

		return this.order;

	}

	public PrivateCustomer addCustomer(String phone) {
		PrivateCustomer res = customerController.findCustomerByPhone(phone);
		if (res != null) {
			order.addPerson(res);
		}
		return res;
	}
}
