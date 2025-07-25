package TaskAssignment;

import java.util.Scanner;

public class FundTask_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 integers:");
		for (int i = 0; i < 10; i++) {
			numbers[i] = sc.nextInt();
		}

		int sum = 0;
		int min = numbers[0];
		int max = numbers[0];

		for (int num : numbers) {
			sum += num;
			if (num < min) min = num;
			if (num > max) max = num;
		}

		double average = (double) sum / 10;

		System.out.println("Average: " + average);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);

		sc.close();

	}

}
