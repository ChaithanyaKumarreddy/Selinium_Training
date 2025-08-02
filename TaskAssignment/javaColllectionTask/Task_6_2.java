package javaColllectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);

		// Square each number using Stream
		List<Integer> squaredNumbers = numbers.stream()
				.map(n -> n * n)
				.collect(Collectors.toList());

		System.out.println("Original Numbers: " + numbers);
		System.out.println("Squared Numbers: " + squaredNumbers);

	}

}
