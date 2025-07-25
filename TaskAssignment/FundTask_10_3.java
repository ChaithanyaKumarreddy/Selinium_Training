package TaskAssignment;

public class FundTask_10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 2, 9, 1, 3};

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
