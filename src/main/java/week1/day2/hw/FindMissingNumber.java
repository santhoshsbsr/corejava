package week1.day2.hw;

import java.util.Arrays;

//Write a java program to find the missing number in the given array.
//int[] num = {7,1,3,4,6,2}


public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {7,1,3,4,6,2};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		for (int i = 0; i < num.length-1; i++) {
			if(num[i+1]-num[i]!=1) {
				System.out.println("the missing number is: " +(num[i]+1));
			}
		}	
	}

}
