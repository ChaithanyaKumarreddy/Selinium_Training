package multiThreadTask;

class Buffer{
		int item;
		boolean isAvailable =false;
		
		synchronized void produce(int value){
			while(isAvailable){
				try{
					wait();
				}catch(Exception e){
					
				}
			}
			item=value;
			System.out.println("Produced: "+item);
			isAvailable= true;
			notify();
			
			
		}
		synchronized void consume(){
			while(!isAvailable){
				try{
					wait();
				}catch(Exception e){
					
				}
			}
			System.out.println("Consumed: "+item);
			isAvailable= false;
			notify();
			
			
		}
}
class  Producer extends Thread {
	Buffer buffer;
	
	Producer(Buffer buffer){
		this.buffer=buffer;
		
	}
	public void run(){
		for(int i =0;i<=5;i++){
			buffer.produce(i);
		}
	}
	
}
class Consumer extends Thread {
	Buffer buffer;
	
	Consumer(Buffer buffer){
		this.buffer=buffer;
		
	}
	public void run(){
		for(int i =0;i<=5;i++){
			buffer.consume();
		}
	}
	
}
public class Task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buffer =new Buffer();
		Producer producer=new Producer(buffer);
		Consumer consumer=new Consumer(buffer);
		
		producer.start();
		consumer.start();
		

	}

}
