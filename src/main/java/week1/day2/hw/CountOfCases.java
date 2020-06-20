package week1.day2.hw;
//Write a java program to find the count of the uppercase, lowercase, number, spaces in the given String
public class CountOfCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Numbers have life; they're not just symbols on paper. See Rs.1,00,000/-";
		
		int upperCase = 0, lowerCase=0, letter=0,space=0,number=0;
	     
			
			char[] charArray = str.toCharArray();
			for (char ch : charArray) {
				if(ch >= 'A' && ch<= 'Z') {
					upperCase++;
					
				}else if(ch >= 'a' && ch<='z'){
					lowerCase++;
					
				}
				else if (ch>= ' ' && ch <= ' ') {
					space++;
				}
				else if (ch >= '0' && ch<= '9') {
					number++;
				}
				else {
					continue;
				}
				
			}
			
			System.out.println("the total count of lowercase is: " +lowerCase);
			System.out.println("the total count of uppercase is: " +upperCase);
			System.out.println("the total number of spaces is: " +space);
			System.out.println("the total count of numbers are: " +number);
	}

}
