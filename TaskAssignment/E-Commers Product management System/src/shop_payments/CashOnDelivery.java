package shop_payments;

public class CashOnDelivery extends Payment {
    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Cash on delivery chosen. Pay ₹" + amount + " on arrival.");
    }
}
