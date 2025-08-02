package javaColllectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	private String name;
	private int marks;
	
	public Students(String name, int marks){
		this.name=name;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", marks=" + marks + "]";
	}

	public int getMarks() {
		return marks;
	}
}

class nameComparator implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareToIgnoreCase(s2.getName());
	}
	
	
}
public class Task_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Students> student = new ArrayList<>();
		student.add(new Students("Alice",98));
		student.add(new Students("bob",82));
		student.add(new Students("charlie",88));
		student.add(new Students("zandy",73));
		student.add(new Students("cobra",65));
		student.add(new Students("Daniel",100));
		
		System.out.println("Before Sorting: ");
		for(Students s:student){
			System.out.println(s);
			
		}
		Collections.sort(student,new nameComparator());
		
		System.out.println("After sorting by name");
		
		for(Students s:student){
			System.out.println(s);
		}
		

	}

}
