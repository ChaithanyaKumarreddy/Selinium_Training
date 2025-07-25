package TaskAssignment;

abstract class Application{
	abstract void turnOn();

}
interface Connectable{
	void Connect();
}

class SmartTV extends Application implements Connectable{
	public void turnOn(){
		System.out.println("Smat TV Turned On");
	}
	public void Connect(){
		System.out.println("Smart Tv is Connected");
	}
}
public class Oopstask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV Tv = new SmartTV();
		Tv.turnOn();
		Tv.Connect();
	}

}
