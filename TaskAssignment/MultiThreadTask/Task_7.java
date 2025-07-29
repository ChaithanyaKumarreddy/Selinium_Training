package multiThreadTask;


class Counter12{
	int count=0;
	public void increament(){
		synchronized(this){
			count++;
		}
	}
}
public class Task_7 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Counter12 counter= new Counter12();
		Thread t1 = new Thread(()->{
			for(int i =0;i<1000;i++){
				counter.increament();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++){
				counter.increament();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("Final Count : " +counter.count);

	}

}
