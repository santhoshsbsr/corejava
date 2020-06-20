package week1.day1.hw;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find the greatest of three numbers(a=455,b=768,c=99");
		int a=4555, b=768,c =999;
		if(a>b && a>c ) {
			System.out.println("the greatest number is " +a);
		}else if (b>c && b>a) {
			System.out.println("the greatest number is " +b);
			
		}else {
			System.out.println("the greatest number is " +c);
		}
	}

}
