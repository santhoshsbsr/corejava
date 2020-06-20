
package week1.day1.hw;

public class PrintingOddNumbers {
public static void main(String[] args) {
	System.out.println("The odd numbers in between 10 and 48");
	//meathod 1
//	for (int i = 10; i <= 48; i++) {
//		if(i%2==1) {
//			System.out.println(i);
//		}
//	}
	//meathod 2
	for(int i=11; i%2!=0 && i<=48;) {
		System.out.println(i);
		i=i+2;
	}
		
}
}
