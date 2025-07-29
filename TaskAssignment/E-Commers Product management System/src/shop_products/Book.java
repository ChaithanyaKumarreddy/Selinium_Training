package shop_products;

public class Book extends Product {
    private String author;
    private String genre;

    public Book(String id, String name, String author, String genre, double price) {
        super(id, name, price);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author + " | Genre: " + genre + " | Price: ₹" + price);
    }
}
