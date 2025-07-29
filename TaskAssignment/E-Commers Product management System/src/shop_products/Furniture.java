package shop_products;

public class Furniture extends Product {
    private String material;
    private String dimensions;

    public Furniture(String id, String name, String material, double price, String dimensions) {
        super(id, name, price);
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + " | Material: " + material + " | Dimensions: " + dimensions + " | Price: ₹" + price);
    }
}
