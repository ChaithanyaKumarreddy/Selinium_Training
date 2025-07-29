package Library_Users;

import Library_Books.Borrowable;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Borrowable book) {
        try {
            book.borrow();
        } catch (Exception e) {
            System.out.println("Borrow error: " + e.getMessage());
        }
    }

    public void returnBook(Borrowable book, boolean isLate) {
        try {
            book.returnBook(isLate);
        } catch (Exception e) {
            System.out.println("Return error: " + e.getMessage());
        }
    }
}
