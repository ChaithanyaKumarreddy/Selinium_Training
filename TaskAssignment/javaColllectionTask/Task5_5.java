package javaColllectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Students11 {  
	private String name;
	private String id;
	private int marks;

	public Students11(String id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student{id='" + id + "', name='" + name + "', marks=" + marks + "}";
	}
}
public class Task5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students11> students = new ArrayList<>();
        students.add(new Students11("S101", "Alice", 88));
        students.add(new Students11("S102", "Bob", 75));
        students.add(new Students11("S103", "Charlie", 92));
        students.add(new Students11("S104", "David", 81));
        students.add(new Students11("S105", "Eve", 95));

        // Max heap based on marks
        PriorityQueue<Students11> maxHeap = new PriorityQueue<>(
            (s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks())
        );
    
        maxHeap.addAll(students);
        System.out.println("Top 3 Highest Scoring Students:");
        for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
            System.out.println(maxHeap.poll());
        }

		

	}

}
