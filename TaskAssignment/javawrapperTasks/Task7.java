package javawrapperTasks;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Temp = new ArrayList<>();
		Temp.add("36");
		Temp.add("38");
		Temp.add("40");
		
		List<Integer> celsiusList =new ArrayList<>();
		for(String s: Temp){
			celsiusList.add(Integer.parseInt(s));
			
			
		}
		List<Double> fahrenheitList =new ArrayList<>();
		for(Integer c :celsiusList){
			double f=(c*9.0/5.0)+32;
			fahrenheitList.add(f);
		}
		System.out.println("celsiusList: "+celsiusList);
		System.out.println("fahrenheitList: "+fahrenheitList);
		
		
		
		

	}

}
