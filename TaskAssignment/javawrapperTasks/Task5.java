package javawrapperTasks;

class Box<T>{
	private T value;
	public void set(T value){
		this.value=value;
	}
	public T get(){
		return value;
	}
}
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> intBox= new Box<>();
		Box<Double> doubleBox=new Box<>();
		
		intBox.set(42);
		doubleBox.set(3.14);
		
		int intValue=intBox.get();
		double doubleValue=doubleBox.get();
		
		System.out.println("Integer Value: "+intValue);
		System.out.println("Double Value: "+doubleValue);
	}

}
