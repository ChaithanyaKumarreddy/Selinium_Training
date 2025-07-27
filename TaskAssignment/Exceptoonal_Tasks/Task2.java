package Exceptoonal_Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= null;
		
		try{
			File file =new File("Chaithanya");
			sc=new Scanner(file);
			System.out.println("File Content: ");
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
			
			
		}catch(FileNotFoundException e){
			System.out.println("FileNotFound");
		}finally{
			if(sc !=null){
				sc.close();
				System.out.println("Scanner closed");
			}
		}

	}

}
