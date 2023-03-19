
abstract class EmployeeDetails {
	int EmployeeId;
	String EmployeeName;
	
	public EmployeeDetails(int id, String name ) {
		EmployeeId=id;
		EmployeeName=name;
	}
	abstract void salary();	
}
