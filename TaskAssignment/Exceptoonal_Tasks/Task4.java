package Exceptoonal_Tasks;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int arr[]={20,30,49};
			int num=10/0;
			System.out.println(arr[5]);
		}catch(ArithmeticException e){
			System.out.println("Error Divided by Zero");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array INdex outof Bounds");
			
		}
		catch(Exception e){
			System.out.println("General Exception: "+ e.getMessage());
		}
		System.out.println("continuees.....");

	}

}
