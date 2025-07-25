package TaskAssignment;

public class FundTask_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		System.out.println("Original Matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nTranspose Matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}

}
