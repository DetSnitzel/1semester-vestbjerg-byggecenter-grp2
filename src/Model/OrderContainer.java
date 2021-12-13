package Model;
import java.util.ArrayList;

import Model.Order;
import Model.OrderContainer;

public class OrderContainer {
	private static OrderContainer instance;
	private ArrayList<Order> orders;
	
	private OrderContainer() {
        orders = new ArrayList<>();
    }
    
    public static OrderContainer getInstance() {
        if (instance == null) {
            instance = new OrderContainer();
        }
        return instance;
    }
    
    public boolean addOrder(Order order) {
    	boolean added = true;
    	orders.add(order);
    	return added;
    }

    public ArrayList<Order> getList(){
    	return orders;
  }
}
