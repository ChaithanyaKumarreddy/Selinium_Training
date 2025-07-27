package Task3;


class Vehicle{
	public final void engineType(){
		System.out.println("Engine type is Petrol");
		
		
	}
}
class Car extends Vehicle{
//	public void engineType(){
//		System.out.println("Engine type is Diesel");
//		
//	}
}
//final key word canot be override
public class Task_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.engineType();

	}

}
