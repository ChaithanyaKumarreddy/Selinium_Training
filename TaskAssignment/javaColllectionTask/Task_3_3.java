package javaColllectionTask;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>student = new HashMap<>();
		student.put(103, "Chaithanya");
		student.put(156, "Divya");
		student.put(106, "Soniya");
		student.put(124, "Aakansha");
		student.put(1096, "Sresta");
		System.out.println("Unsorted HashMap");
		
		for(Map.Entry<Integer, String>entry: student.entrySet()){
			System.out.println(entry.getKey()+"= "+entry.getValue());
			
		}
		Map<Integer,String> sortedMap=new TreeMap<>(student);
		System.out.println("\nSorted TreeMap (by keys");
		
		for(Map.Entry<Integer,String>entry :sortedMap.entrySet()){
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}


	}

}
