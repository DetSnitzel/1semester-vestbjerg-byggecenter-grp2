package model;

/**
 * This class inherits from the superclass Person.
 *
 */
public class Employee extends Person {

	/**
	 * Constructor
	 * 
	 * @param employeeRole
	 * @param employeeID
	 * @param name
	 * @param email
	 * @param postalCode
	 * @param phone
	 * @param address
	 */
	public Employee(String employeeRole, String employeeID, String name, String email, String postalCode, String phone,
			String address) {
		super(name, phone, address, email, postalCode);
		this.employeeRole = employeeRole;
		this.employeeID = employeeID;
	}

	private String employeeRole;
	private String employeeID;

	/**
	 * Accessor that returns the value of employeeRole
	 * 
	 * @return employeeRole
	 */
	public String getEmployeeRole() {
		return employeeRole;
	}

	/**
	 * Mutator that sets the value of employeeRole
	 * 
	 * @param employeeRole
	 */
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	/**
	 * Accessor that returns the value of employeeID
	 * 
	 * @return
	 */
	public String getEmployeeID() {
		return employeeID;
	}

	/**
	 * Mutator that sets the value of employeeID
	 * 
	 * @param employeeID
	 */
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

}
