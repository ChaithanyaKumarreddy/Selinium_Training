package multiThreadTask;

class MyThreads extends Thread{
	public MyThreads(String name){
		super(name);	
	}
	public void run(){
		for(int i =1;i<=3;i++){
			System.out.println(getName()+"running with priority"+getPriority());
		}
		System.out.println(getName()+"finished Excecution");
	}
	
}

public class Task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreads t1 = new MyThreads("Thread-1");
		MyThreads t2 = new MyThreads("Thread-2");
		MyThreads t3 = new MyThreads("Thread-3");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getName()+"Priority"+t1.getPriority());
		System.out.println(t2.getName()+"Priority"+t2.getPriority());
		System.out.println(t3.getName()+"Priority"+t3.getPriority());
		
		
		t1.start();
		t2.start();
		t3.start();


		

		

	}

}
