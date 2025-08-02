package javaColllectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TAsk_7_1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original List: " + names);

        Collections.reverse(names);

        System.out.println("Reversed List: " + names);

	}

}
