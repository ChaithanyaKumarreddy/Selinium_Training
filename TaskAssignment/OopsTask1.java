package TaskAssignment;


class Book{
	String title;
	String author;
	double price;
	
	Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price= price;
	}
	void displaydetails(){
		System.out.println("Title is:"+title);
		System.out.println("author is "+author);
		System.out.println("price is :"+price);
	}
}
public class OopsTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book("the distraction","theo",230.00);
		Book b2= new Book("402 room","Alen",280.00);
		b1.displaydetails();
		b2.displaydetails();

	}

}
