package Task3;

abstract class Shape1{
	abstract double area();
	
	void displayShapeType(){
		System.out.println("This is the Shape");
	}
}

class Circl extends Shape1{
	double radius;
	Circl(double radius){
		this.radius=radius;
	}
	double area(){
		return Math.PI*radius*radius;
	}
	void displayShapeType(){
		System.out.println("Shape is Circle");
	}
	
	
}
class Rectangl extends Shape1{
	double length,width;
	Rectangl(double length, double width){
		this.length=length;
		this.width=width;
	}
	double area(){
		return length*width;
		
	}
	void displayShapeType(){
		System.out.println("Shape is rectangle");
	}
	
	
}
public class Task_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circl c= new Circl(5);
		Rectangl r = new Rectangl(6,8);
		System.out.println("area of a circle : "+c.area());
		
		c.displayShapeType();
		System.out.println("area of a Rectangle : "+r.area());
		r.displayShapeType();


	}

}
