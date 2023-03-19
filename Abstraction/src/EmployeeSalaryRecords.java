
public class EmployeeSalaryRecords extends EmployeeDetails{

	double monthlysalary;
	double totalSalary;
	public EmployeeSalaryRecords(int id, String name, double salary) {
		super(id, name);
		 monthlysalary=salary;
	}

	@Override
	void salary() {
		 totalSalary= monthlysalary*12;
	}
	void display() {
		System.out.println("EmployeeID: "+EmployeeId);
		System.out.println("EmployeeName: "+EmployeeName);
		System.out.println("EmployeeAnnualSalary: "+totalSalary);
	}
	

}
