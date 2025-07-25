package TaskAssignment;

public class OopsTask3_BankAccount {

	private String accountnumber;
	private double balance;



	public void deposit(double amount){
		if(amount >0){
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}else{
			System.out.println("Invalid Deposit amount");
		}

	}
	public void withdraw(double amount){
		if(amount<=balance){
			balance-=amount;
			System.out.println("withdraw :" +amount);
		}else{
			System.out.println("Insufficient amount");
		}


	}
	public double getbalance(){
		return balance;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsTask3_BankAccount acc = new OopsTask3_BankAccount();
		acc.deposit(10000);
		acc.withdraw(333);
		System.out.println("Account balance is: "+ acc.getbalance());


	}

}
