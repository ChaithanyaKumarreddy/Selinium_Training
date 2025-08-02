package javaColllectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private String department;

    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Task_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee1> employees = new ArrayList<>();
	        employees.add(new Employee1("Alice", "HR"));
	        employees.add(new Employee1("Bob", "IT"));
	        employees.add(new Employee1("Charlie", "IT"));
	        employees.add(new Employee1("David", "HR"));
	        employees.add(new Employee1("Eve", "Finance"));

	        // Group by department
	        Map<String, List<Employee1>> groupedByDept = employees.stream()
	            .collect(Collectors.groupingBy(Employee1::getDepartment));

	        // Print grouped employees
	        groupedByDept.forEach((dept, empList) -> {
	            System.out.println("Department: " + dept);
	            empList.forEach(emp -> System.out.println(" - " + emp));
	        });

	}

}
