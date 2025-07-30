package javawrapperTasks;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="123";
		String b ="45.67";
		String c= "true";
		
		
		int i =Integer.parseInt(a);
		double d =Double.parseDouble(b);
		boolean z =Boolean.parseBoolean(c);
		
		System.out.println("parse Int: "+i);
		System.out.println("parse Double: "+d);
		System.out.println("parse Boolean: "+z);
		

	}

}
