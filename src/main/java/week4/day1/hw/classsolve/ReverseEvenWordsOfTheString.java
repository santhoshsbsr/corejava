package week4.day1.hw.classsolve;

public class ReverseEvenWordsOfTheString {
public static void main(String[] args) {
	String str = "what goes out will come in another way"; //replace the even words with its reverse order
	String[] array = str.split(" ");
	for (int i = 0; i < array.length; i++) {
		if(i%2!=0) {
			
			String text = array[i];
			for(int j=text.length()-1;j>=0;j--) {
				System.out.print(text.charAt(j));//this will print the even words in reverse order
			}
		}else {
			System.out.print(array[i]); //to print the odd words in same order
		}
			System.out.print(" ");
	}
	
	
	
	
	
}
}
