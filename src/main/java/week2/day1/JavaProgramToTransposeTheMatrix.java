package week2.day1;

public class JavaProgramToTransposeTheMatrix {
public static void main(String[] args) {
	
	System.out.println("Java program to print the transpose");
	int[][] array = {{1,2,3},
			{4,5,6},
			{7,8,9}};
	
	int[][] transpose = new int [3][3];
	
	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j]+"");
		}
		System.out.println();
		
	}
	
	System.out.println("Transpose of the given matrix is: ");
	
	for (int i = 0; i < transpose.length; i++) {
		for (int j = 0; j < transpose[i].length; j++) {
			System.out.print(array[j][i]+ " ");
		}System.out.println();
		
	}
}
}
