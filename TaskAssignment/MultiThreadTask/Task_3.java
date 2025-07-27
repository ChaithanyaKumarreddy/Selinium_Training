package MultiThreadTask;

class NumberPrinter extends Thread{
	public void main(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread :"+i);
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				System.out.println("thread Interrupted");
			}
		}
	}
	
}
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter t =new NumberPrinter();
		t.start();
		
		try{
			t.join();
		}catch(InterruptedException e){
			System.out.println("main Thread INteruppted");
		}
		System.out.println("main thread Done");

	}

}
