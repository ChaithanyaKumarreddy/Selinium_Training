package Library_Books;
public abstract class Book {
	protected String id;
	protected String title;
	protected String author;
	protected boolean isBorrowed;

	public static final String LIBRARY_NAME = "Central City Library";
	public static final String LIBRARY_ADDRESS = "123 Main Street, City Center";

	public Book(String id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}

	public abstract void displayDetails();

	public String getId() {
		return id;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void borrowBook() throws Exception {
		if (isBorrowed) {
			throw new Exception("Book already borrowed.");
		}
		isBorrowed = true;
	}

	public void returnBook(boolean isLate) throws Exception {
		if (!isBorrowed) {
			throw new Exception("Book was not borrowed.");
		}
		if (isLate) {
			throw new Exception("Book returned late. Fine applicable.");
		}
		isBorrowed = false;
	}
}
