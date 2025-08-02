package javaColllectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private int marks;
	
	public Student(String name,int marks){
		super();
		this.name=name;
		this.marks=marks;
	}
	public String getname(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Student other){
		return Integer.compare(this.marks, other.marks);
	}
}

public class Task_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		students.add(new Student("Alice",95));
		students.add(new Student("chaitu",99));
		students.add(new Student("jaiswal",70));
		students.add(new Student("Sudharshan",55));
		
		Collections.sort(students);
		
		System.out.println("Students sort by marks ascending");
		
		for(Student s:students){
			System.out.println(s);
		}
		
		
		

	}

}
