package TaskAssignment;
class Employee{
static int count =0;
	
	Employee(){
		count++;
	}
	static void displayCount(){
		System.out.println("Total Employees is: " + count);
	}
	
}
public class OopsTask2_Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp = new Employee();
		Employee Emp2 = new Employee();
		Employee Emp3 = new Employee();
		

		Employee.displayCount();

	}

}
