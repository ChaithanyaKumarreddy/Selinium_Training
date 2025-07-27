package com.school.student;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void StudentDetails(){
		System.out.println("Student name is "+name);
		System.out.println("Student Age is "+ age);
	}

}
