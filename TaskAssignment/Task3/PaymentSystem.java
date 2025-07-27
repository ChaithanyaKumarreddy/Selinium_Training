package Task3;

abstract class Paymentmethod{
	abstract void pay(double amount);
}
class CreditCard extends Paymentmethod{
	void pay(double amount){
		System.out.println("paid "+ amount+" through Credit card");
	}
	
	
}
class UPI extends Paymentmethod{
	void pay(double amount){
		System.out.println("paid "+ amount+" through UPI");
	}
	
	
}
class Cash extends Paymentmethod{
	void pay(double amount){
		System.out.println("paid "+ amount+" through Cash");
	}
	
	
}
public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard P1 = new CreditCard();
		UPI P2 = new UPI();
		Cash P3 = new Cash();
		
		P1.pay(222.00);
		P2.pay(33333.000);
		P3.pay(645362.7);

		

	}

}
