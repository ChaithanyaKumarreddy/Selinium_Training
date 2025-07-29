package multiThreadTask;

class Counter{
	int count=0;
	public void increament(){
		count++;
	}
}

class MyThread1 extends Thread{
	Counter c;
	
	public MyThread1(Counter c){
		this.c=c;
	}
	public void run(){
		for(int i=0;i<1000;i++){
			c.increament();
		}
	}
}

public class Task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		MyThread1 t1 = new MyThread1(counter);
		MyThread1 t2 = new MyThread1(counter);
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("Final Counter value :"+ counter.count);

		

	}

}
