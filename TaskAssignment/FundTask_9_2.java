package TaskAssignment;

public class FundTask_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		int choice = 1; 

		switch (choice) {
		case 1:
			System.out.println("Addition: " + (a + b));
			break;
		case 2:
			System.out.println("Subtraction: " + (a - b));
			break;
		case 3:
			System.out.println("Multiplication: " + (a * b));
			break;
		case 4:
			System.out.println("Division: " + (a / b));
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

}
