package javawrapperTasks;

import java.util.List;
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> marks=new ArrayList<>();
		marks.add(93.35);
		marks.add(87.35);
		marks.add(69.35);
		marks.add(93.35);
		marks.add(98.35);
		
		double sum=0;
		for(double mark:marks){
			sum +=mark;
		}
		double average = sum/marks.size();
		
		System.out.println("total Sum :"+sum);
		System.out.println("Average: "+average);
	}

}
