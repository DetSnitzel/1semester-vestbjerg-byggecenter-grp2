package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private String date;
	private String orderNo;
	private double total;
	private Person customer;
	private Employee employee;
	private ArrayList<OrderLine> orderLines;
	private int id;

	/**
	 * Constructor
	 * 
	 * @param employee so we can see which employee who created the order.
	 */
	public Order(Employee employee) {
		this.date = LocalDate.now().toString();
		this.total = 0;
		this.employee = employee;
		orderLines = new ArrayList<>();
	}

	/**
	 * Accessor that returns the value of total
	 * 
	 * @return total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * Accessor that returns the value of customer
	 * 
	 * @return customer
	 */
	public Person getCustomer() {
		return customer;
	}

	/**
	 * Accessor that returns the value of employee
	 * 
	 * @return employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * Accessor that returns the value of date
	 * 
	 * @return date of the order creation
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Mutator that sets the value of date
	 * 
	 * @param date of the order creation
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Accessor that returns the value of orderNo
	 * 
	 * @return orderNo of the order
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * Mutator that sets the value of orderNo
	 * 
	 * @param orderNo of the order
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * Method that adds a person to the order
	 * 
	 * @param person
	 */
	public void addPerson(Person person) {
		this.customer = person;
	}

	/**
	 * Mutator that sets the value of id of the order.
	 * 
	 * @param id
	 */
	public void setID(int id) {
		this.id = id;
	}

	/**
	 * ccessor that returns a list of orderLines
	 * 
	 * @return list of orderLines
	 */
	public List<OrderLine> getOrderLines() {
		return new ArrayList<>(this.orderLines);
	}

	/**
	 * Method that adds products to the orderline
	 * 
	 * @param p = product
	 * @param q = quantity
	 */
	public void addProduct(Product p, int q) {
		OrderLine ol = new OrderLine(p, q);
		addOrderLine(ol);
	}

	/**
	 * Method that adds orderline to order
	 * 
	 * @param ol
	 */
	private void addOrderLine(OrderLine ol) {
		orderLines.add(ol);
		total += ol.getSubtotal();
	}
}
