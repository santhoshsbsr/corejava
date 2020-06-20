package week1.day1.hw;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// meathod 1
//		System.out.println("Program to find the sum of the digits of the given integer 675, i.e. 6+7+5");
//		int num = 675; // so what is 6+7+5?
//		int sum=0;
//		while(num>0) {
//			sum=sum+num%10;
//			num=num/10;
//		}
//		System.out.println(sum);
		
		long n,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextLong();
		for(sum=0 ;n!=0 ;n/=10)
		{
		sum+=n%10;
		}
		System.out.println("Sum of digits "+sum);
		
}

}
