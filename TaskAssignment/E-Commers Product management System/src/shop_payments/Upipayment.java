package shop_payments;

public class Upipayment extends Payment {
    private String upiId;

    public Upipayment(String upiId, double amount) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + amount + " via UPI ID: " + upiId);
    }
}
