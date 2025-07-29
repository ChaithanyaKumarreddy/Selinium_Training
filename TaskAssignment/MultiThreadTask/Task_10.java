package multiThreadTask;

class Chat{
	boolean senderturn =true;

	public synchronized void sendMessage(String msg){
		while(!senderturn){
			try{
				wait();
			}catch(InterruptedException e){

			}
		}
		System.out.println("Sender: "+msg);
		senderturn =false;
		notify();
	}
	public synchronized void recieverMessage(String msg){
		while(senderturn){
			try{
				wait();
			}catch(InterruptedException e){

			}
		}
		System.out.println("Reciever: "+msg);
		senderturn =true;
		notify();
	}

}
class Sender extends Thread{
	Chat chat;
	Sender(Chat chat){
		this.chat=chat;
	}
	public void run(){
		String[] sender ={"Hi","How are you?","I'm doing great!","Bye"};
		for(String msg :sender){
			chat.sendMessage(msg);
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){

			}

		}

	}

}
class Reciever extends Thread{
	Chat chat;

	Reciever(Chat chat){
		this.chat=chat;
	}
	public void run(){
		String[] reciever ={"Hello!","I am Fine u","Nice to Hear","Seeyou!"};
		for(String msg : reciever){
			chat.recieverMessage(msg);
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){	
			}	
		}	
	}
}

public class Task_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat chat= new Chat();
		Sender sender = new Sender(chat);
		Reciever reciever =new Reciever(chat);
		sender.start();
		reciever.start();
	}

}
