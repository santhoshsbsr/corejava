package week2.day1;

public class PrintingAddOfTwoDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st matrix
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 2nd matrix
		int[][] array1 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println("Sum of the given matrix is: ");

		int[][] sum = new int[array.length][array1.length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = array[i][j] + array1[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
