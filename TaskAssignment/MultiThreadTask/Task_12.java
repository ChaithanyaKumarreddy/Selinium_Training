package multiThreadTask;

class countdown extends Thread{
	public void run(){
		for(int i=10;i>0;i--){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("times is up");
	}
}
public class Task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown time =new countdown();
		time.start();

	}

}
