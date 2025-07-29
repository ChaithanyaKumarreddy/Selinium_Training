package shop_products;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setStock(int quantity) {
        this.stockQuantity = quantity;
    }

    public boolean isInStock(int requestedQuantity) {
        return stockQuantity >= requestedQuantity;
    }

    public void reduceStock(int quantity) {
        if (isInStock(quantity)) {
            stockQuantity -= quantity;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}
