package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

	private String date;
	private String orderNo;
	private double total;
	private Person customer;
	private Employee employee;
	private ArrayList<OrderLine> orderLines;
	private int id;
	
	public Order(Employee employee) {
		this.date = LocalDate.now().toString();
		this.total = 0;
		this.employee = employee;
		orderLines = new ArrayList<>();
	}

	public double getTotal() {
		return total;
	}


	public Person getCustomer() {
		return customer;
	}


	public Employee getEmployee() {
		return employee;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public void addPerson(Person person) {
		this.customer = person;
	}

	public void setID(int id) {
		this.id = id;
	}
	//Bruges til testen 
	public Product getProduct() {
		return orderLines.get(0).getProduct();
	}

	public void addProduct(Product p, int q) {
		OrderLine ol = new OrderLine(p, q);
		addOrderLine(ol);
	}

	private void addOrderLine(OrderLine ol) {
		orderLines.add(ol);
		total += ol.getSubtotal();
	}
}
