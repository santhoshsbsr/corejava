package javaCode.Learnings;

import org.apache.commons.math3.stat.regression.RegressionResults;

public class MatrixAddition2 {

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] array1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] array2= {{9,8,7},{6,5,4},{3,2,1}};
		int[][] sum = new int[3][3];
		System.out.println("Array1 is: ");
		printArray(array1);

		System.out.println("Array2 is: ");
		printArray(array2);
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = array1[i][j]+array2[i][j];
			}
		}System.out.println("solution: ");
	printArray(sum);
	}

}
