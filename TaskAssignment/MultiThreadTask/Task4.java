package multiThreadTask;

class MyThread extends Thread{
	public void run(){
		System.out.println("thread is Running");
		try{
			Thread.sleep(500);
		}catch(InterruptedException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("Thread finished Excecution");
	}
}
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		System.out.println("Before Start: "+t.isAlive());
		t.start();
		System.out.println("After Start: "+t.isAlive());
		try{
			t.join();
		}catch(InterruptedException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("After join: "+t.isAlive());

	}

}
