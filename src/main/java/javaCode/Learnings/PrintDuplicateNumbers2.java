package javaCode.Learnings;

import java.util.Arrays;

//3. Print the duplicate numbers in the given array
//int[] = {11,2,3,45,11,79,86,3,97,21,68,79}

public class PrintDuplicateNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {11,2,3,45,11,79,86,3,97,21,68,79};
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if(data[i] == data[j]) {
					System.out.println("the duplicate numbers are: " +data[i]);
				}
				
			}
			
		}
	}

	}

