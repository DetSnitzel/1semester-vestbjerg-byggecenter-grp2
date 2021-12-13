package tui;

public class OrderTUI {
	private OrderController orderCtrl;
	
	public OrderTUI() {
		orderCtrl = new orderController();
	}
	public void start() {
		orderMenu();
	}
	private void orderMenu() {
		boolean exit = false;
		writeOrderMenu();
		int choice = inputIntFromScanner();
		while(!exit) {
			if(choice == 1) {
				orderMenuSelection();
				choice = -1;
			}
		}
		
	}
	private void orderMenuSelection() {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
