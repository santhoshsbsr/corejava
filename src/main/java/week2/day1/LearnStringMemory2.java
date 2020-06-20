package week2.day1;

public class LearnStringMemory2 {
	public static void main(String[] args) {
		String str1 = new String("testleaf");
		String str2 = new String("testleaf");
		System.out.println("object comparison using == " +str1==str2);	// gives the ans false
		System.out.println("object comparison using .equals " +str1.equals(str2));// this is how the  string object Strings
		
		
		// to compare string literal strings
		String Str3 = "testleaf";
		String str4 = "testleaf";
		System.out.println("Literal comparison using == " +Str3 == str4);
		System.out.println("Literal Comparison using .equals " +Str3.equals(str2));
		
	}

}
