package Exceptoonal_Tasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		try{
			int num = sc.nextInt();
			int result=100/num;
			System.out.println("result is: "+result); 
		}catch(ArithmeticException ex){
			System.out.println("Cannot be divided by Zero");
			
		}

	}

}
