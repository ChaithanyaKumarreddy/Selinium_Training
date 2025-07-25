package TaskAssignment;

class Calculator { 
	int add(int a, int b) { 
		return a + b; 
	} 
	double add(double a, double b) { 
		return a + b;
	} 
	String add(String a, String b) { 
		return a + b; 
	} 
} 
public class OopsTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator(); 
		System.out.println("Int Add: " + calc.add(5, 33)); 
		System.out.println("Double Add: " + calc.add(18.5, 23.5)); 
		System.out.println("String Add: " + calc.add("Chait", "hanya"));

	}

}
