package multiThreadTask;


class BankAccount{
	private int  balance;
	
	public BankAccount(int balance){
		this.balance= balance;
		
	}
	
	public synchronized void withdraw(int amount){
		if(balance>=amount){
			System.out.println(Thread.currentThread().getName()+"is widrawing"+amount);
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			balance-=amount;
			System.out.println(Thread.currentThread().getName()+"Completed withdraw remaining balance"+balance);
		}else{
			System.out.println(Thread.currentThread().getName()+"tried to withdraw "+amount+"but insufficient balance"+balance);
		}
		
	}
	public int getbalance(){
		return balance;
	}
}
public class Task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc =new BankAccount(1000);
		Runnable WithdrawTask=()->{
			for(int i =0; i < 3 ; i++){
				acc.withdraw(400);
				
				
			}
		};
		Thread user1=new Thread(WithdrawTask,"User-1");
		Thread user2= new Thread(WithdrawTask,"User-2");
		
		user1.start();
		user2.start();
		
		try{
			user1.join();
			user2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("FinalBalance: "+acc.getbalance());
		

	}

}
