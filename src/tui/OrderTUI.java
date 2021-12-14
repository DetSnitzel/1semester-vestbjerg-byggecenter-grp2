package tui;

import java.util.Scanner;
import controller.OrderController;
import model.PrivateCustomer;

public class OrderTUI {
	private OrderController orderController;

	public OrderTUI() {
		orderController = new OrderController();
	}

	public void start() {

		System.out.println("Order TUI: ");

		boolean running = true;

		while (running) {
			int selection = writeOrderMenu();
			switch (selection) {
			case 1:
				orderController.createOrder();
				System.out.println("Order is created. Now find customer by phone");

				boolean addPrivateCustomer = false;
				while (addPrivateCustomer == false && running == true) {
					System.out.println("Enter phone number of customer");
					Scanner scanCustomer = new Scanner(System.in);
					String phone = scanCustomer.nextLine();
					orderController.addCustomer(phone);
					PrivateCustomer pc = orderController.addCustomer(phone);
					if (pc != null) {
						System.out.println(pc.getName() + ": was added to order");
						addPrivateCustomer = true;
					}
				}
			}
		}

	}

//	private void orderMenu() {
//		boolean exit = false;
//		writeOrderMenu();
//		int choice = inputIntFromScanner();3
//		while (!exit) {
//			if (choice == 1) {
//				orderMenuSelection();
//				choice = -1;
//			} else if (choice == 2) {
//				System.out.println("Not yet implemented ");
//				choice = -1;
//				orderMenu();
//			} else {
//				exit = true;
//
//			}
//		}
//	}

	private int writeOrderMenu() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println();
		System.out.println("*** Order Menu ***");
		System.out.println(" (1) Create an order");
		System.out.println(" (2) Find an order");
		System.out.println(" (3) Cancel");
		System.out.println(" (0) Previous menu");
		System.out.print("Choose an option: ");
		System.out.println();

		while (!keyboard.hasNextInt()) {
			System.out.println("Input must be a number");
			keyboard.nextLine();
		}
		int selection = keyboard.nextInt();
		return selection;

	}
}
//	private void findCustomerMenu() {
//		System.out.println();
//		System.out.println("Search after: ");
//		System.out.println("Options: 0, 1");
//		System.out.println("(1) Search phoneNo");
//		System.out.println("(0) Previous menu");
//	
//	int x = inputIntFromScanner();
//    if(x == 1) {
//        System.out.println("The persons phonenumber :  ");
//        String phone = userPhoneNumber();
//        phoneNumberFromUser(phone);
//        findCustomer(phone);
//    }
//    else if(x == 0) {
//        orderMenuSelection();
//    }
//}
//
//	private String userPhoneNumber() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private void phoneNumberFromUser(String phone) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void findCustomer(String phone) {
//		if(orderCtrl.findCustomerByPhone(phone)) {
//			
//		}
//		
//	}
//
////	private int inputIntFromScanner() {
////		// Return user input as an int
////		Scanner keyboard = new Scanner(System.in);
////>>>>>>> 7b8682e1b579e88f7618facb32f5cd7ee466ef09
////		while (!keyboard.hasNextInt()) {
////			System.out.println("Input must be a number");
////			keyboard.nextLine();
////		}
////		int selection = keyboard.nextInt();
////		return selection;
////		
////	}
////}
//
//				
//
////	private void findCustomerMenu() {
////		System.out.println();
////		System.out.println("Search after: ");
////		System.out.println("Options: 0, 1");
////		System.out.println("(1) Search phoneNo");
////		System.out.println("(0) Previous menu");
////
////		int x = inputIntFromScanner();
////		if (x == 1) {
////			System.out.println("The persons phonenumber :  ");
////			String phone = userPhoneNumber();
////			phoneNumberFromUser(phone);
////			findCustomer(phone);
////		} else if (x == 0) {
////			writeOrderMenu();
////		}
////	}
//
//
////	private int inputIntFromScanner() {
////		// Return user input as an int
////		Scanner keyboard = new Scanner(System.in);
////		while (!keyboard.hasNextInt()) {
////			System.out.println("input has to be a number, try again");
////			keyboard.nextLine();
////		}
////		return keyboard.nextInt();
////	}
////
////	private void orderMenuSelection() {
////		// TODO Auto-generated method stub
////
////	}
////
////}
