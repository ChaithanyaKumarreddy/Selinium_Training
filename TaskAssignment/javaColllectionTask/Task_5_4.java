package javaColllectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Students1 {  
	private String name;
	private String id;
	private int marks;

	public Students1(String id, String name, int marks) {
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

public class Task_5_4 {

	public static void main(String[] args) {
		List<Students1> students = new ArrayList<>();
		students.add(new Students1("S101", "Alice", 88));
		students.add(new Students1("S102", "Bob", 75));
		students.add(new Students1("S103", "Charlie", 92));

		// ✅ Map must use Students, not Student
		Map<String, Students1> studentMap = new HashMap<>();
		for (Students1 s : students) {
			studentMap.put(s.getId(), s);
		}

		// Print the map
		for (Map.Entry<String, Students1> entry : studentMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
		}
	}
}
