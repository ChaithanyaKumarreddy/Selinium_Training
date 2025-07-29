package multiThreadTask;

import java.util.Random;

class Animal extends Thread{
	String name;
	Random rand =new Random();
	
	Animal(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+"running...");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Tortoise =new Animal("Tortoise");
		Animal Rabbit = new Animal("Rabbit");
		Animal Dog = new Animal("Dog");
		Tortoise.start();
		Rabbit.start();
		Dog.start();

	}

}
