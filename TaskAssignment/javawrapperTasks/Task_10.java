package javawrapperTasks;

import java.util.Arrays;
import java.util.Collections;

public class Task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers ={43,54,56,67,78,13,23};
		Arrays.sort(numbers,Collections.reverseOrder());
		System.out.println("Sorted in decending order"+Arrays.toString(numbers));
		
		Integer first =numbers[0];
		Integer secondHighest =null;
		
		for(int i =0;i<numbers.length;i++){
			if(!numbers[i].equals(first)){
				secondHighest=numbers[i];
				break;
				
			}
		}
		if(secondHighest!=null){
			System.out.println("second highest value: "+secondHighest);
		}else{
			System.out.println("No Second highest value found (all elements are equal).");
		}
		

	}

}
