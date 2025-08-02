package javaColllectionTask;

import java.util.HashMap;
import java.util.Map;

public class Task_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> student = new HashMap<>();
		student.put("chaithanya",102);
		student.put("Rithu",100);
		student.put("yadgiri",122);
		student.put("Nirmala",192);
		student.put("Dayal",107);
		
		student.remove(100);
		System.out.println("Student Records: ");
		for(Map.Entry<String,Integer> entry: student.entrySet()){
			System.out.println("RollNo: "+entry.getValue()+" Name: "+entry.getKey());
			
		}
		
		

	}

}
