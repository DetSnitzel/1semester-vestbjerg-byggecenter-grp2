package Model;

public class Employee extends Person {
	
	public Employee(String employeeRole, String employeeID, String name, String email, String postalCode, String phone, String address) {
		super(name, phone, address, email, postalCode);
		this.employeeRole = employeeRole;
		this.employeeID = employeeID;
	}
	private String employeeRole;
	private String employeeID;
	
	
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

}
