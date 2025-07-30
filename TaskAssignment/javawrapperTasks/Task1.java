package javawrapperTasks;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=22;
		double b =223.33;
		char c ='z';
		
		Integer intobj = Integer.valueOf(a);
		Double dobj =Double.valueOf(b);
		Character cobj =Character.valueOf(c);
		
		
		
		int p1=intobj.intValue();
		double p2 =dobj.doubleValue();
		char p3 =cobj.charValue();
		
		System.out.println("++++++Wrapped obj+++++");
		System.out.println("wrapped integer: "+intobj);
		System.out.println("wrapped double: "+dobj);
		System.out.println("wrapped character"+cobj);
		
		
		System.out.println("+++++primitive number+++++");
		System.out.println("primitive integer: "+p1);
		System.out.println("primitive double: "+p2);
		System.out.println("primitive character: "+p3);
		
		

	}

}
