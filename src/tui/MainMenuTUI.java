package tui;

import java.util.Scanner;
import tui.TryMe;

public class MainMenuTUI {
	private static OrderTUI orderTUI;
	private static TryMe tryMe;

	public static void main(String[] args) {
		MainMenuTUI mainMenuTUI = new MainMenuTUI();
		orderTUI = new OrderTUI();
		tryMe = new TryMe();

		mainMenuTUI.start();

	}

	public void start() {
		mainMenu();

	}

	public void mainMenu() {
		boolean exit = false;
		while (!exit) {
			int choice = writeMainMenu();
			switch (choice) {
			case 1:
				System.out.println("has not been implemented yet");
				break;
			case 2:
				System.out.println("has not been implemented yet");
				break;
			case 3:
				orderTUI.start();
				break;
			case 4:
				System.out.println("has not been implemented yet");
				break;
			case 9:
				tryMe.generateTestData();
				mainMenu();
				break;
			case 0:
				System.out.println("Quitting program, bye scrub.");
				exit = true;
				break;
			default:
				System.out.println("That is a wrong number to type.");
				break;
			}
		}

	}

	private int writeMainMenu() {
		/**
		 * 
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println("****** Main Menu ******");
		System.out.println("(1) Customer menu");
		System.out.println("(2) Product menu ");
		System.out.println("(3) Order menu");
		System.out.println("(4) Leasing menu");
		System.out.println("(9) Generate testdata");
		System.out.println("(0) Quit the program");
		System.out.println();
		System.out.println("Choice: 1 2 3 4 9 0 ");
		System.out.println();

		while (!keyboard.hasNextInt()) {
			System.out.println("Enter one of the above number choices.");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		return choice;
	}
}
