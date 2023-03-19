
public class EmployeeMain implements EmployeeRecords{

	public static void main(String[] args) {
		EmployeeMain e=new EmployeeMain();
		e.displayEmployeeDetails();
		e.displaySalary();
		
		//EmployeeRecords er=new EmployeeMain();
		//er.displayEmployeeDetails();
		
		

	}

	@Override
	public void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
	}

	@Override
	public void displaySalary() {
		// TODO Auto-generated method stub
		System.out.println("Salary: "+salary);
		
	}

}
