package TaskAssignment;

import java.util.Scanner;

public class FundTask_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int number;

	        do {
	            System.out.print("Enter a positive number (enter 1 to stop): ");
	            number = sc.nextInt();
	        } while (number != 1);

	        System.out.println("You entered 1. Program stopped.");
	        sc.close();

	}

}
