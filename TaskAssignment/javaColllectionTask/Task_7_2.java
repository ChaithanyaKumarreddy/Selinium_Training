package javaColllectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> techStack = new ArrayList<>();
        techStack.add("Java");
        techStack.add("Python");
        techStack.add("Java");
        techStack.add("C++");
        techStack.add("JavaScript");
        techStack.add("Java");

        // Count frequency of "Java"
        int javaCount = Collections.frequency(techStack, "Java");

        System.out.println("List: " + techStack);
        System.out.println("Frequency of 'Java': " + javaCount);

	}

}
