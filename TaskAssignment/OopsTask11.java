package TaskAssignment;


interface MathOperation{
	int Operation (int a,int b);
}
public class OopsTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a,b)->a+b;
		MathOperation sub = (a,b)->a-b;
		MathOperation multiple = (a,b)->a*b;

		System.out.println("Addition: "+ add.Operation(3, 5));
		System.out.println("Subtraction "+ sub.Operation(8, 4));
		System.out.println("Multiplicatioan " + multiple.Operation(2, 6));

	}

}
