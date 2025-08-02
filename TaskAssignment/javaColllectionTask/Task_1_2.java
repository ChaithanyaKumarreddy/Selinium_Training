package javaColllectionTask;

import java.util.ArrayList;
import java.util.Collections;

public class Task_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> in=new ArrayList<>();
		in.add(23);
		in.add(43);
		in.add(86);
		in.add(55);
		in.add(69);
		
		System.out.println("Original List : "+in);
		
			Collections.sort(in);
			System.out.println("Ascending Order: "+in);
			
			Collections.sort(in,Collections.reverseOrder());
			System.out.println("Decending order: "+in);
		

	}

}
