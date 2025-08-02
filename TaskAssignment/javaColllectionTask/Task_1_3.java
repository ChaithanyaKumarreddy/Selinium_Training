package javaColllectionTask;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lang = new ArrayList<>();
		lang.add("java");
		lang.add("C");
		lang.add("java");
		lang.add("Python");
		System.out.println("Original list: "+lang);
		
		Set<String> uniqLang = new LinkedHashSet<>(lang);
		
		List<String> result=new ArrayList<>(uniqLang);
		
		System.out.println("List after removing Duplicates: "+result);
		

	}

}
