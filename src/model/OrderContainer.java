package model;
import java.util.ArrayList;

import model.Order;
import model.OrderContainer;

public class OrderContainer {
	private static OrderContainer instance;
	private ArrayList<Order> orders;
	private int id;
	
	private OrderContainer() {
        orders = new ArrayList<>();
        id = 1;
    }
    
    public static OrderContainer getInstance() {
        if (instance == null) {
            instance = new OrderContainer();
        }
        return instance;
    }
    
    public boolean addOrder(Order order) {
//    	order.setID(id++);
    	return orders.add(order);
    }

    public ArrayList<Order> getList(){
    	return orders;
  }
}
