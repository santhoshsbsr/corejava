package javaCode.Learnings;
//Write a java program to find the occurance of the character 'i' in the given String.
//String str = "It always seems impossible until it's done";

public class OccuranceOfALetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "It always seems impossible until it's donei";
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'i') {
			//count = count+1;
				count++;
			}
			
		}
		System.out.println(count);
		
		
	}

}
