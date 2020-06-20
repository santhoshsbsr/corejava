package javaCode.Learnings;

// Write a java program to print only the numbers in the given string
//String str = "Since 1995";

public class PrintOnlyTheNumbers {

	public static void main(String[] args) {
		String str = "Since 1995";
		
		//meathod 1
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(Character.isDigit(c)) {
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println("..............meathod 2...............");
		//meathod 2
		String substring = str.substring(6);
		System.out.println(substring);
		
		//meathod3
		System.out.println("_____meathod 3_______");
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i));
				
			}
			}
		
		
		System.out.println();//
		//meathod 4
		System.out.println("meathod 4");
		System.out.println(str.replaceAll("[^0-9]", ""));
	}
}
