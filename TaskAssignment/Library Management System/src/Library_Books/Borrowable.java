package Library_Books;

public interface Borrowable {

	void borrow() throws Exception;
	void returnBook(boolean isLate) throws Exception;

	default void returnPolicy(){
		System.out.println("book must be return with in a 14 days .late return causes fine");
	}

}
