package javawrapperTasks;

class BankAccount{
	private String accountnumber;
	private Double balance;
	
	public BankAccount(String accountnumber, Double balance){
		this.accountnumber=accountnumber;
		this.balance=(balance !=null)?balance:0.0;
		
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
			System.out.println("Deposited amount: "+amount);
		}else{
			System.out.println("Invalid deposit amount");
		}
		
	}
	public void withdraw(double amount){
		if(amount>0&&amount<=balance){
			balance-=amount;
			System.out.println("withdraw: "+amount);
			
		}else{
			System.out.println("Invalid or insufficient amount");
		}
	}
	public void showbalance(){
		System.out.println("AccountNumber: "+accountnumber);
		System.out.println("Balance: "+balance);
		
	}
}
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 =new BankAccount("chaitu",28000.00);
		b1.deposit(20000.00);
		b1.withdraw(3000.00);
		b1.showbalance();

		

	}

}
