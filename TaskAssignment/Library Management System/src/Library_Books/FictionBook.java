package Library_Books;

public class FictionBook extends Book implements Borrowable {

    private String genre;

    public FictionBook(String id, String title, String author, String genre) {
        super(id, title, author);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book | ID: " + id + " | Title: " + title + " | Author: " + author + " | Genre: " + genre + " | Borrowed: " + isBorrowed);
    }

    @Override
    public void borrow() throws Exception {
        borrowBook();
        System.out.println(title + " has been borrowed.");
    }

    @Override
    public void returnBook(boolean isLate) throws Exception {
        super.returnBook(isLate);
        System.out.println(title + " has been returned.");
    }
}