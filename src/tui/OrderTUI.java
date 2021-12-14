package tui;

import java.util.Scanner;
import controller.OrderController;

public class OrderTUI {
	private OrderController orderCtrl;

	public OrderTUI() {
		orderCtrl = new OrderController();
	}

	public void start() {
		orderMenu();
	}

	private void orderMenu() {
		boolean exit = false;
		writeOrderMenu();
		int choice = inputIntFromScanner();
		while (!exit) {
			if (choice == 1) {
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
