package shop_orders;

import shop_customer.Customer;
import shop_products.Product;
import shop_payments.Payment;
import shop_discount.Discountable;

import java.io.*;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> product;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> product) {
        this.customer = customer;
        this.product = product;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return product.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Order is cancelled. Cannot proceed.");
            return;
        }

        customer.displayCustomer();
        product.forEach(Product::displayDetails);

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();

        for (Product p : product) {
            p.reduceStock(1);
        }
    }

    public void cancelOrder() {
        if (!isCancelled) {
            isCancelled = true;
            System.out.println("Order cancelled successfully.");
        } else {
            System.out.println("Order already cancelled.");
        }
    }

    public void saveOrderToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("Customer: " + customer.getName() + "\n");
            for (Product p : product) {
                writer.write("Product: " + p.getClass().getSimpleName() + " - " + p.getName() + "\n");
            }
            writer.write("Total: ₹" + totalAmount + "\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readOrdersFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
