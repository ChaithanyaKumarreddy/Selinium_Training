package javaColllectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Alice");
		names.add("Jack");
		names.add("Bob");
		names.add("Jill");
		names.add("Charlie");
		List<String> filtered = names.stream()
				.filter(name -> name.startsWith("J"))
				.collect(Collectors.toList());

		System.out.println("Names starting with 'J':");
		filtered.forEach(System.out::println);

	}

}
