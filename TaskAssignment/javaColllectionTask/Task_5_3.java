package javaColllectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
	private String name;
	private String department;
	
	public Employee(String name,String department){
		this.name=name;
		this.department=department;
	}

	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	
}
public class Task_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees= new ArrayList<>();
		employees.add(new Employee("Alice ","Hr"));
		employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "IT"));
        employees.add(new Employee("David", "HR"));
        employees.add(new Employee("Eve", "Finance"));
        
        Map<String,List<Employee>> groupedByDept =new HashMap<>();
        
        for(Employee emp:employees){
        	 groupedByDept
             .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
             .add(emp);
        }
        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Employee e : entry.getValue()) {
                System.out.println(" - " + e.getName());
            }
        }

	}

}
