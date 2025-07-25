package service;
import model.Student;

public class StudentService {
	
	public void save(Student s){
		System.out.println("Student saved succesfully : "+ s.getName() +s.getAge());
		
	}
	public void print(Student s){
		System.out.println("Student Name:"+s.getName()+"Student Age: "+s.getAge());
	}
	

}
