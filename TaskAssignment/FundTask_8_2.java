package TaskAssignment;

public class FundTask_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;

		System.out.println("Post-increment (a++): " + a++);
		System.out.println("After post-increment: " + a);
		System.out.println("Pre-increment (++a): " + ++a);

		int b = 8;
		System.out.println("Left shift (b << 1): " + (b << 1));  
		System.out.println("Right shift (b >> 1): " + (b >> 1)); 

		int x = 0, y = 5;

		if (x != 0 && y / x > 1) {
			System.out.println("Logical AND");
		} else {
			System.out.println("Safe with &&");
		}

	}

}
