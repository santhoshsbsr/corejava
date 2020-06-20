package week2.day1;

import java.util.Arrays;

public class LearnReplaceAll {
public static void main(String[] args) {
	String str = "Good morning";
	char[] charArray = str.toCharArray();
	String string = Arrays.toString(charArray);// to change the array to string
	System.out.println(string); // prints the string
	
	//split function : to print the given string as independent word (ref syso)
	String str1 = "I love biriyani";
	String[] split = str1.split(" ");// returns a string array
	System.out.println(Arrays.toString(split));
	
	//Replace function - to replace a word to another char.
	String str2 = "Born On 2010";
	System.out.println(str2.replace("o", "#"));
	
	// replace all with regex - to retrieve only the number I should to remove the other charecters
	System.out.println(str2.replaceAll("[0-9]", ""));// removes the number
	// ^ -> cap function is used to keep the numbers
	System.out.println(str2.replaceAll("[^0-9]", ""));// removes the charecters and prints only the number
	System.out.println(str2.replaceAll("[^A-Z]", ""));// to pring only the capital letter
	System.out.println(str2.replaceAll("\\d", ""));// removes the number /d is a sequence which will neglect the numbers from the digit
	System.out.println(str2.replaceAll("\\D", ""));// using the capital D will neglect the characters

}
}
