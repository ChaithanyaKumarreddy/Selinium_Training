package Task3;
interface Controllable{
	void turnOn();
	default void status(){
		System.out.println("Device Status :Working");
	}
	static void deviceInfo(){
		System.out.println("Device Information is available");
	}
	
}
class SmartFan implements Controllable{
	public void turnOn(){
		System.out.println("Fan is On");
	}
	public void deviceInfo(){
		System.out.println("Device Information of Fan");
	}
	
}
class SmartLight implements Controllable{
	public void turnOn(){
		System.out.println("Light is ON");
	}
	public void deviceInfo(){
		System.out.println("Device Information of Light");
	}
}

public class Smart_Device {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartFan sf =new SmartFan();
		SmartLight sl = new SmartLight();
		sf.turnOn();
		sf.status();
		sf.deviceInfo();
		System.out.println("______________-------------_________");
		
		sl.deviceInfo();
		sl.turnOn();
		sl.status();

	}

}
