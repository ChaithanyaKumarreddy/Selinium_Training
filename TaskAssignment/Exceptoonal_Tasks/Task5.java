package Exceptoonal_Tasks;

class InvalidAccountException extends Exception{
	public InvalidAccountException(String message){
		super(message);
	}
}
public class Task5 {
	static void CheckBalance(double balance)throws InvalidAccountException{
		if(balance<0){
			throw new InvalidAccountException("Account Balance Cannot be negative");
		}else{
			System.out.println("Account balance is :"+balance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			CheckBalance(-500);
		}catch(InvalidAccountException e){
			System.out.println("Exception caught: "+e.getMessage());
		}

	}

}
