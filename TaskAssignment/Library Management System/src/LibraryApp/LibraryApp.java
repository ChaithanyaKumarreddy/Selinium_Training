package LibraryApp;

import Library_Books.Book;
import Library_Books.FictionBook;
import Library_Users.User;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Welcome to " + Book.LIBRARY_NAME + " at " + Book.LIBRARY_ADDRESS);
        
        FictionBook book1 = new FictionBook("F001", "Room no 405", "Paulo Coelho", "Thriller");
        User user = new User("chaithanya");

        book1.displayDetails();
        book1.returnPolicy(); 

        user.borrowBook(book1);
        user.borrowBook(book1); 

        book1.displayDetails();

        user.returnBook(book1, true);  
        user.returnBook(book1, false); 
    }
}
