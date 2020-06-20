package week1.day2.hw;

import java.util.Arrays;
import java.util.Collections;

//1. Print the following array in ascending order using for, for..each and while loops.
//String[] num = {Voldemort,Dumbledore,harry,ron,snape,Hagrid};

public class PrintTheArrayInAscending {
	public static void main(String[] args) {
		String[] num = {"Voldemort","Dumbledore","harry","ron","snape","Hagrid"};
		String[] num1 = {"Voldemort","Dumbledore","harry","ron","snape","Hagrid"};
		//	int length = num.length;
		//	System.out.println(length);
		//	
		//	for (int i = 0; i < length; i++) {
		//		System.out.println(num[i]);
		//		
		//	}
		System.out.println("_______________________________");
		System.out.println("the ascending order of given string using for iterator is: ");

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println( num[i]);
		}

		System.out.println("ascending order in foreach: ");


		System.out.println("____________________________________");
		System.out.println("using foreach loop");
		for (String ascending : num) {
			System.out.println(ascending);
		}

		System.out.println("________________________________");
		System.out.println("using while loop: ");
		int j=0;
		while(j<num.length) {
			System.out.println(num[j++]);
		}
		
		
		// descending sort
		
		System.out.println("____________________");
		System.out.println("to print the given array in descending order: ");
		Arrays.sort(num1, Collections.reverseOrder());
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
			
		}
	
	}
}
