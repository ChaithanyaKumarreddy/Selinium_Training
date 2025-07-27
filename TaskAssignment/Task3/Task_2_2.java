package Task3;

interface RemoteControl2{
	void turnOn();
	default void batteryStatus(){
		System.out.println("Shows the battery percentage");
	}
	static void info(){
		System.out.println("Shows all the Deails");
	}
}
class TV1 implements RemoteControl{
	public void turnOn(){
		System.out.println("tv is On");
		
	}
}
public class Task_2_2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV1 t =new TV1();
		t.turnOn();
		t.batteryStatus();
		RemoteControl2.info();

	}

}
