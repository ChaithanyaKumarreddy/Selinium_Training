package shop_products;

public class Electronic extends Product {
    private String brand;
    private int warranty;

    public Electronic(String id, String name, double price, String brand, int warranty) {
        super(id, name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronic: " + name + " | Brand: " + brand + " | Warranty: " + warranty + " months | Price: ₹" + price);
    }
}
