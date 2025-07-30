package javawrapperTasks;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=100;
		Integer b=100;
		
		Integer c = new Integer(100);
		Integer d = new Integer(100);
		
		
		System.out.println("using == operator");
		System.out.println("a==b "+(a==b));
		System.out.println("c==d "+(c==d));
		System.out.println("a==c "+(a==c));
		System.out.println("b==d "+(b==d));
		
		System.out.println("using Equal() method");
		System.out.println("a.equals(b) "+a.equals(b));
		System.out.println("b.equals(c) "+b.equals(c));
		System.out.println("c.equals(d) "+c.equals(d));

	}

}
