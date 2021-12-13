package model;

import java.util.ArrayList;

public class Order {

	private String date;
	private String orderNo;
	private double total;
	private Person customer;
	private Employee employee;
	private ArrayList<OrderLine> orderLines;
	
	public Order(Employee employee) {
		this.employee = employee;
		orderLines = new ArrayList<>();
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
}
