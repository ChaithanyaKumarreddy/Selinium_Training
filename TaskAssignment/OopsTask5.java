package TaskAssignment;

class Vehicle{
	String brand;
	int speed;
	void showdetails(){
		System.out.println("Brand:"+ brand+ ",Speed"+ speed);
	}
}
class Car extends Vehicle{
	int wheels=5;
	
	void showdetails(){
		System.out.println("Car Brand: "+brand +",Speed is: "+ speed +" Wheels :"+ wheels );
	}
	
}
class Bike extends Vehicle{
	int wheels=2;
	void showdetails(){
		System.out.println("Car Brand: "+brand +",Speed is : "+ speed +" Wheels :"+ wheels );
	}
	
}

public class OopsTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.brand="maruthi";
		c.speed=120;
		Bike b = new Bike();
		b.brand="Ducati";
		b.speed=220;
		b.showdetails();
		c.showdetails();

	}

}
