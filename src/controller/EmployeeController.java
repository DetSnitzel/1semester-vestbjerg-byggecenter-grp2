package controller;

import model.Employee;

public class EmployeeController {

	private Employee loggedInEmployee;
	private static EmployeeController instance;
	
	//En ny employee bliver oprettet 
	private EmployeeController() {
		loggedInEmployee = new Employee("Servicemedarbejder", "69420", "Bob", "Bob@bob.dk", "9000", "88888888", "Bobvej 1337");
	}
	
	public static EmployeeController getInstance() {
		if (instance == null) {
			instance = new EmployeeController();
		}
		return instance;
	}
	//Metoden returnere en logget ind Employee
	public Employee getLoggedInEmployee() {
		return loggedInEmployee;
	}
}