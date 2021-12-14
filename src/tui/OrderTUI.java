package tui;



import java.util.Scanner;
import controller.OrderController;

public class OrderTUI {
	private OrderController orderCtrl;

	public OrderTUI() {
		orderCtrl = new OrderController();
	}

	public void start() {
		System.out.println("Order TUI: ");

		orderMenu();
	}

	private void orderMenu() {
		boolean exit = false;
	
		
		while (!exit) {
			int choice = writeOrderMenu();
			switch (choice) {
			case 1:
				orderCtrl.createOrder();
				System.out.println("Order is created: " + orderCtrl.getOrderNo());
				
				boolean addCustomer = false;
				while (addCustomer == false && exit == false) {
					System.out.println("Enter phone number of customer");
					Scanner scanCustomer = new Scanner(System.in);
					String phone = scanCustomer.nextLine();
					orderCtrl.addCustomer(phone);
					PrivateCustomer pc = orderCtrl.addCustomer(phone);
					
				}
			
			
				orderMenuSelection();
				choice = -1;
			} else if (choice == 2) {
				System.out.println("Not yet implemented ");
				choice = -1;
				orderMenu();
			} else {
				exit = true;
			}
		}
	}

	private void writeOrderMenu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println("*** Order Menu ***");
		System.out.println(" (1) Create an order");
		System.out.println(" (2) Find an order");
		System.out.println(" (3) Cancel");
		System.out.println(" (0) Previous menu");
		System.out.print("Choose an option: ");
		System.out.println();
	}

	private void findCustomerMenu() {
		System.out.println();
		System.out.println("Search after: ");
		System.out.println("Options: 0, 1");
		System.out.println("(1) Search phoneNo");
		System.out.println("(0) Previous menu");

		int x = inputIntFromScanner();
		if (x == 1) {
			System.out.println("The persons phonenumber :  ");
			String phone = userPhoneNumber();
			phoneNumberFromUser(phone);
			findCustomer(phone);
		} else if (x == 0) {
			orderMenuSelection();
		}
	}

	private String userPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	private void phoneNumberFromUser(String phone) {
		// TODO Auto-generated method stub

	}

	private void findCustomer(String phone) {
		if (orderCtrl.findCustomerByPhone(phone)) {

		}

	}

	private int inputIntFromScanner() {
		// Return user input as an int
		Scanner keyboard = new Scanner(System.in);
		while (!keyboard.hasNextInt()) {
			System.out.println("input has to be a number, try again");
			keyboard.nextLine();
		}
		return keyboard.nextInt();
	}

	private void orderMenuSelection() {
		// TODO Auto-generated method stub

	}

}
