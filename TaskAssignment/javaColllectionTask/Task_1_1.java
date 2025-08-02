package javaColllectionTask;

import java.util.ArrayList;

public class Task_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> elements =new ArrayList<>();
		elements.add("Java");
		elements.add("C");
		elements.add("C++");
		elements.add("Ruby");
		elements.add("Python");
		
		elements.remove(1);
		System.out.println(elements);

	}

}
