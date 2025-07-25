package TaskAssignment;

abstract class Shape {
	abstract double area();
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double length, width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}
}

public class OopsTask4_ShapeDemo {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.area());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.area());

	}

}
