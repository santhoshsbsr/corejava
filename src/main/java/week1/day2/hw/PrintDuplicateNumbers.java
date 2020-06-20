package week1.day2.hw;

import java.util.Arrays;

//3. Print the duplicate numbers in the given array
//int[] = {11,2,3,45,11,79,86,3,97,21,68,79}

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {11,2,3,45,11,79,86,3,97,21,68,79};
		Arrays.sort(data);
		
		System.out.println(Arrays.toString(data));
		for (int i = 0; i < data.length-1; i++) {
	//System.out.println(data[i]);
	
	if(data [i] == data [i+1]) {
		
		System.out.println(data[i]);
	}
			}
		
	}

	}

