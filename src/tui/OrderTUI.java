package tui;

import java.util.Scanner;
import controller.OrderController;
import model.Order;
import model.Person;
import model.PrivateCustomer;
import model.Product;
import tui.MainMenuTUI;

public class OrderTUI {
	private OrderController orderController;
	private Order o;

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
				createOrder();
				break;
			case 2:
				errorMessage();
				break;
			case 3:
				System.out.println("blabla");
				break;
			case 0:
				running = false;
				break;
			default:
				System.out.println("That is a wrong number to type.");
				break;

			}
		}
	}

	private void createOrder() {
		o = orderController.createOrder();
		System.out.println("Order is created. Type cancel to cancel order.");

		boolean cont = addCustomer();
		if (cont) {
			//cont = addProduct();
			addProduct();
		}
		if (cont) {
			endOrder();
		}
	}

	private boolean addCustomer() {
		boolean res = true;
		boolean addPrivateCustomer = false;
		while (addPrivateCustomer == false && res) {
			System.out.println("Enter phone number of customer");
			Scanner scanCustomer = new Scanner(System.in);
			String phone = scanCustomer.nextLine();
			Person p = orderController.addCustomer(phone);
			if (phone.equalsIgnoreCase("cancel")) {
				// writeOrderMenu();
				res = false;
			} else if (p != null) {
				System.out.println(p.getName() + ": was added to order");
				addPrivateCustomer = true;
			}
		}
		return res;
	}

	private void addProduct() {
//		boolean res = true;
		boolean finished = false;
		while (!finished /*&& res*/) {
			System.out.println("Enter barcode of the product or type \"done\" to finish the order.");
			Scanner scanProduct = new Scanner(System.in);
			String barcode = scanProduct.nextLine();
			if (barcode.equalsIgnoreCase("done")) {
				break;
			} 
//			else if (barcode.equalsIgnoreCase("cancel")) {
//				res = false;
//			}
			boolean addProduct = false;
			while (addProduct == false) {
				System.out.println("Amount: ");
				Scanner scanQuantity = new Scanner(System.in);
				int q = Integer.parseInt(scanQuantity.nextLine());
				Product p = orderController.addProduct(barcode, q);
				if (p != null) {
					System.out.println(p.getName() + " was added to the order");
					addProduct = true;
				}
			}
		}
		//return res;
	}

	private void endOrder() {
		if (orderController.endOrder()) {
			printOrder();
		}
	}

	private void cancelOrder() {

	}

	private void printOrder() {
		System.out.println("Order was finished");
		System.out.println("-----------------------");
		System.out.println("Customer: " + o.getCustomer().getName());
		System.out.println("Employee: " + o.getEmployee().getEmployeeID() + " " + o.getEmployee().getName());
		System.out.println();
		System.out.println("Total price: " + o.getTotal());
	}

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

	public void errorMessage() {
		System.out.println("This has not yet been implemented.");
	}
}
