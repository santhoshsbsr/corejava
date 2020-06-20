package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int age= 25;

		//to store ages of 4 ppl
		int[] ages = {20,12,13,14}; // all the values will be independently stored with 32bits in the variable ages
		int length = ages.length;
		System.out.println(length);
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println(ages[0]);

		// string array
		String[] names1 = {"sandy","d"}; 
		int length2 = names1.length;
		System.out.println(length2);

		//to store names of 5 ppl
		String[] names = new String[5]; // we need to give the number of values to be stored as an array for string
		names[0] = "sandy";
		names[1] = "pragu";
		names[2]= "anand";
		names[3] ="babu";
		names[4] ="balaji";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
		System.out.println("--------------------");
		Arrays.sort(names); // to sort the array in alphabetical order
			for (String localVariable : names) {
				System.out.println(localVariable);
			}	


	}

}
