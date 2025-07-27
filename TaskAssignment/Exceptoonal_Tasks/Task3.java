package Exceptoonal_Tasks;

public class Task3 {
	static void validateAge(int age)throws Exception{
		if(age<18){
			throw new Exception("Age must be Above 18");
		}else{
			System.out.println("Validate Age "+age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validateAge(18);
		}catch(Exception e){
			System.out.println("Exception caught: "+e.getMessage());
			
		}

	}

}
