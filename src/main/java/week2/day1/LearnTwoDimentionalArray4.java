package week2.day1;

public class LearnTwoDimentionalArray4 {
public static void main(String[] args) {
	
	//way 1 to create unidimentional array
	int[] array= {1,2,3,4,5};
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+ ",");
	}
	
	System.out.println();
	System.out.println();
	
	//way2 to create a uni-dimentional array
	int[] array1 = new int[5];// created an empty array with size of 5
	for (int i = 0; i < array1.length; i++) {
		System.out.print(array1[i]+ ",");
	}
	
	
	System.out.println();System.out.println();
	//two dimentional array
	// way 1 to create a two dimentional array with 3 rows and 4 columns
	int[][] array2 = {{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}}; // total row count is 3 and column count is 4
	for (int i = 0; i < array2.length; i++) {
		for (int j = 0; j < array2[i].length; j++) {
			System.out.print(array2[i][j]);
		} 
		
	}
	
	//way 2 to create 2 dimentional array
	int[][] array3 = new int[3][4];
	array3[0][1] = 1;
	array3[0][2] = 2;
}
}
