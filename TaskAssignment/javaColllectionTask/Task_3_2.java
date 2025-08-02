package javaColllectionTask;

import java.util.HashMap;
import java.util.Map;

public class Task_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hello";
		Map<Character,Integer> frequency= new HashMap<>();
		for(char ch :input.toCharArray()){
			frequency.put(ch,frequency.getOrDefault(ch, 0)+1);
		}
		System.out.println("Character frequency: "+frequency);

	}

}
