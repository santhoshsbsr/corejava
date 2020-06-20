package week1.day2.hw;
//Write a java program to find the occurance of the character 'i' in the given String.
//String str = "It always seems impossible until it's done";

public class OccuranceOfALetter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "It always seems impossible until it's donei";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'i') {
			//count = count+1;
				count++;
			}
			
		}
		System.out.println("the occurance of char 'i' is: " +count);
		
		
	}

}
