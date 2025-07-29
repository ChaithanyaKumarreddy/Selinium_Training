package shop_products;

public class Clothing extends Product {
    private String fabric;
    private String size;

    public Clothing(String id, String name, double price, String size, String fabric) {
        super(id, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + name + " | Size: " + size + " | Fabric: " + fabric + " | Price: ₹" + price + " | Stock: " + stockQuantity);
    }
}
