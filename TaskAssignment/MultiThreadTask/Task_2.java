package MultiThreadTask;

class  RunnableCounter implements Runnable{
	public void run(){
		for(int i =1;i<=10;i++){
			System.out.println("Number: "+i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println("thread Interupted");
			}
			
		}
	}
	
}
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableCounter count = new  RunnableCounter();
		Thread t=new Thread(count);
		t.start();

	}

}
