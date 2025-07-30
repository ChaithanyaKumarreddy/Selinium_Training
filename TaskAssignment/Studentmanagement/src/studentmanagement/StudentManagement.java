package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        List<Student> studentList = new ArrayList<>();

	        User admin = new User("chaitu", "1234") {
	            @Override
	            public boolean login(String u, String p) {
	                return this.username.equals(u) && this.password.equals(p);
	            }
	        };

	        System.out.print("Enter username: ");
	        String uname = scanner.nextLine();
	        System.out.print("Enter password: ");
	        String pwd = scanner.nextLine();

	        if (!admin.login(uname, pwd)) {
	            System.out.println("Login failed!");
	            return;
	        }

	        System.out.println("Login successful!");

	        while (true) {
	            System.out.println("\n1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Filter Students by Grade");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    scanner.nextLine(); 
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Student ID: ");
	                    String id = scanner.nextLine();
	                    System.out.print("Enter Grade: ");
	                    double grade = scanner.nextDouble();

	                    Student student = new Student(name, age, id, grade);
	                    studentList.add(student);
	                    System.out.println("Student added.");
	                    break;

	                case 2:
	                    System.out.println("\n--- Student List ---");
	                    for (Student s : studentList) {
	                        s.printDetails();
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter minimum grade to filter: ");
	                    double minGrade = scanner.nextDouble();
	                    System.out.println("Students with grade >= " + minGrade + ":");
	                    studentList.stream()
	                               .filter(s -> s.getGrade() >= minGrade)
	                               .forEach(Student::printDetails);
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    return;

	                default:
	                    System.out.println("Invalid option.");
	            }
	        }
		
		

	}

}
