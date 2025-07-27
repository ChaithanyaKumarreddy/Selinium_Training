package MultiThreadTask;

class MyPrinterThread extends Thread{
	public void run(){
		for(int i =1;i<=5;i++){
			System.out.println("Hello from Threads");
			try{
				Thread.sleep(1000);

			}catch(InterruptedException e){
				System.out.println("Thread interupted..");
				
			}
		}
	}
	
}
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPrinterThread t1 = new MyPrinterThread();
		t1.start();

	}

}
