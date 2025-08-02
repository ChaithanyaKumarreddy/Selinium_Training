package javaColllectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits =new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grape");
		System.out.println("Fruits :"+fruits);
		
		ListIterator<String> listItr =fruits.listIterator();
		System.out.println("Forward Traversal");
		
		while(listItr.hasNext()){
			System.out.println(listItr.next());
		}
		System.out.println("Backword traversal");
		
		while(listItr.hasPrevious()){
			System.out.println(listItr.previous());
		}
	}

}
