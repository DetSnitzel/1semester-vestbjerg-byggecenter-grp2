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

	public Order createOrder(String employeeID) {
		this.order = new Order();

		return this.order;

	}

	public Customer addCustomer(String phone) {
		Customer res = customerController.findCustomerByPhone(phone);
		if (res != null) {
			order.addPerson(res);
		}

		return res;

	}

}
