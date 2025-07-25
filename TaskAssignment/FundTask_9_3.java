package TaskAssignment;

public class FundTask_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		for (int num = 2; count < 10; num++) {
			boolean isPrime = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(num);
				count++;
			}
		}

	}

}
