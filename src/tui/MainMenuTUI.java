package tui;

import java.util.Scanner;

public class MainMenuTUI {
	private OrderTUI orderTUI;
	public static void main(String[] args) {
		MainMenuTUI mainMenuTUI = new MainMenuTUI();
		mainMenuTUI.start();
}
	private void start() {
		mainMenu();
		
	}
	private void mainMenu() {
		boolean exit = false;
		while(!exit) {
			int choice = writeMainMenu();
			switch (choice) {
			case 1:
			orderTUI.start();
			break;
			case 2:
			System.out.println("has not been implemented yet");
			break;
			case 3: 
			System.out.println("has not been implemented yet");
			break;
			case 9:
			orderTUI.start();
			default:
			System.out.println("Exiting program.");
			exit = true;
			break;
			}
		}
		
	}
	private int writeMainMenu() {
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
