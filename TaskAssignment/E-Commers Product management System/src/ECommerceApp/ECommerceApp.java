package ECommerceApp;

import java.util.Arrays;
import shop_customer.Customer;
import shop_discount.Discountable;
import shop_orders.Order;
import shop_payments.CardPayment;
import shop_payments.CashOnDelivery;
import shop_payments.Payment;
import shop_payments.Upipayment;
import shop_products.Clothing;
import shop_products.Electronic;
import shop_products.Product;

public class ECommerceApp {
    public static void main(String[] args) {
//        Product phone = new Electronic("E001", "Samsung Galaxy", 34999, "Samsung", 24);
//        phone.setStock(5);

        Product tshirt = new Clothing("C003", "Tones", 1299, "s", "Cotton");
        tshirt.setStock(1);
        Product pant = new Clothing("C001", "allensolly", 999, "38", "CottonJeans");
        pant.setStock(1);


        Customer customer = new Customer("Chaithanya Reddy", "chaithanya@1234.com");

        Order order = new Order(customer, Arrays.asList(pant, tshirt));

        Discountable discount = (price) -> price * 0.85; // 15% discount

//        Payment payment = new CashOnDelivery(0);
        Payment payment = new Upipayment("chaithanya@gpay.com",0);
//        Payment payment = new CardPayment("234567890098765",0);

        

        order.placeOrder(payment, discount);
        order.saveOrderToFile("orders.txt");
    }
}
