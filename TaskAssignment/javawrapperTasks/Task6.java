package javawrapperTasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(23);
		marks.add(34);
		marks.add(54);
		marks.add(67);
		marks.add(87);
		System.out.println(marks);
		
		if(!marks.isEmpty()){
			Integer minmark = Collections.min(marks);
			marks.remove(minmark);
			System.out.println("Removed lowest mark: " +minmark);
			
		}
		int min = Collections.min(marks);
		int max = Collections.max(marks);
		
		double sum=0;
		for(Integer m:marks){
			sum+=m;
		}
		double average= sum/marks.size();
		
		System.out.println("marks after remove: "+marks);
		System.out.println("maximum: "+max);
		System.out.println("Minimum: "+min);
		System.out.println("Average of all: "+average);
		

	}

}
