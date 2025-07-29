package shop_payments;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(String cardNumber, double amount) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + amount + " using Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
    }
}
