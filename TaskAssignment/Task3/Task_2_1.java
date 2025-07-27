package Task3;

interface RemoteControl{
	void turnOn();
	default void batteryStatus(){
		System.out.println("Shows the battery percentage");
	}
}
class TV implements RemoteControl{
	public void turnOn(){
		System.out.println("tv is On");
		
	}
}

public class Task_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t =new TV();
		t.turnOn();
		t.batteryStatus();

	}

}
