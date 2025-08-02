package javawrapperTasks;

import java.util.Optional;

public class Task9 {
	public static void main(String[] args) {
		Double balance =null;
		try{
			double unboxingbalance =balance;
			System.out.println("UnBoxed balance : "+unboxingbalance);
		}catch(NullPointerException ex){
			System.out.println("Caught null pointer Exception during unboxing");
			
		}
		Optional<Double>optionalBalance =Optional.ofNullable(balance);
		double safeBalance= optionalBalance.orElse(0.0);
		System.out.println("Safe unboxing balance using optional: "+safeBalance);
		
		double defaultBalance =(balance!=null)?balance:0.0;
		System.out.println("Safe nboxing using ternary :" +defaultBalance);
		
	}

}
