package Task3;
abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double area(){
		return Math.PI*radius*radius;
	}
	
	
}
class Rectangle extends Shape{
	double length,width;
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	double area(){
		return length*width;
		
	}
	
	
}
public class Task1 {
	public static void main(String[] args) {
		Circle c = new Circle(8);
		System.out.println("area of a circle: "+c.area());
		Rectangle r = new Rectangle(8,9);
		System.out.println("area of a rectangle: "+ r.area());
		
	}

}
