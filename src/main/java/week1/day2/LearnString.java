package week1.day2;

public class LearnString {
	public static void main(String[] args) {
	
	// to create the variable
	//datatype variableName = value;
	
	//how to declare a string?
	
	//type 1 to declare a string -> String Literal
	//String variableName = value;
	
	//String text1 = "SandysLearning";
			//--------------------
	// type 2 -> String using object
	
	//String text2 = new String("Pheonix");
//-----------------------------------------------
		String text1 = "SandysLearning"; // String is immutable
		
		String text2= " is great";
		
		int length = text1.length();
		System.out.println(length);
		
		String concat = text1+text2;
		System.out.println(concat);
		
		String concat1=text1.concat(text2);
		System.out.println(concat1);
		
	String lowerCase = text1.toLowerCase(); // since string in immutable/not-changable we need a object reference to reflect the change we require to perform
	 System.out.println(lowerCase);
	 
	 String upperCase = text1.toUpperCase();
	 System.out.println(upperCase);
	 
	 
	 // how to compare two strings? 
	  /*we can not use == as we do for numbers
	 we can compare using equals functions from the string which returns a boolean value
	 String is case sensitive*/
	 
	 String word1 = "testing";
	 String word2 = "tesTing"; 
	 boolean equals = word1.equals(word2);
	 System.out.println(equals);
	 
	 // to compare ignoring the case sensitivity
	 
	 boolean equalsIgnoreCase = word1.equalsIgnoreCase(word2);
	 System.out.println(equalsIgnoreCase);
	 
	 // to check if a specific word or letter is present in the String
	 boolean contains = word1.contains("ing");
	 System.out.println(contains);
	 
	 
	 // to remove the space before and after the string we use trim function
	 String txt = "  All is Well    ";
			 String trim = txt.trim();
	 System.out.println(trim);
	 
	 //to change a charecter in the string ->trim.replace function is used
	 String text = "  All is well ";
			 String replace = trim.replace('l', '@');
			 System.out.println(replace);
	
	
	// to cut a part of a string -> we use substring function
			 
			 String myName ="Santhosh Balaaji";
			 String substring = myName.substring(8);
			 System.out.println(substring);
			//substing second type 
			 String namee ="Testing";
			 String substring2 = namee.substring(2, 4);
			 System.out.println(substring2);
			
			 // charAt func can be used to retrive a particual letter from the string		
			 char charAt = myName.charAt(0);
			 System.out.println(charAt);
	
			 // to retrieve all the charecters we can use forloop for charAt function
			 String name2 ="SanthoshBalaaji";
			 for (int i = 0; i < name2.length(); i++) {
				char charAt2 = name2.charAt(i);
				 System.out.println(charAt2);
				
			}
	
	}
	
}
