package TaskAssignment;

class Animail{
	void sound(){
		System.out.println("Animal sounds");
	}
}
class Cat{
	void sound(){
		System.out.println("mew");
	}
	
}
class Dog{
	void sound(){
		System.out.println("bow");
	}
	
}
class Cow{
	void sound(){
		System.out.println("amboo");
	}
	
}

public class OopsTask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Cow cow =new Cow();
		Dog dog =new Dog();
		
		cat.sound();
		cow.sound();
		dog.sound();

	}

}
