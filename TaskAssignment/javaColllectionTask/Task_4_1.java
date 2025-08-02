package javaColllectionTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("chaitu");
		names.add("Bharath");
		names.add("Adithya");
		names.add("hardik");

		System.out.println("names: "+names);

		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			String name=itr.next();
			if(name.startsWith("A")){
				itr.remove();
			}
		}
		System.out.println("After removing Aletter Starting with the names: "+names);




	}

}
