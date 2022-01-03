package model;

import java.util.ArrayList;
import java.util.List;

import model.Order;
//import model.OrderContainer;

public class OrderContainer {
	private static OrderContainer instance;
	private ArrayList<Order> orders;
	private int id;

	/**
	 * Constructor Set to private so we follow the Singleton pattern
	 */
	private OrderContainer() {
		orders = new ArrayList<>();
		id = 1;
	}

	/**
	 * Method that creates an instance of this class. There can only be one instance
	 * at a time because of Singleton.
	 * 
	 * @return an instance of OrderContainer
	 */
	public static OrderContainer getInstance() {
		if (instance == null) {
			instance = new OrderContainer();
		}
		return instance;
	}

	/**
	 * Method that adds an order with an orderID
	 * 
	 * @param order
	 * @return order with ID
	 */
	public boolean addOrder(Order order) {
		order.setID(id++);
		return orders.add(order);
	}

	/**
	 * Method that returns a list of orders
	 * 
	 * @return list of orders
	 */
	public ArrayList<Order> getList() {
		return orders;
	}

	public List<Order> findAll() {
		return new ArrayList<>(this.orders);
	}
}
