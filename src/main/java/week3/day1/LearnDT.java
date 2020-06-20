package week3.day1;

public class LearnDT {
	public static void main(String[] args) {
		
		Object[] array = {1,2,3,4, "sandy" , true}; // object is a super class where we can save any type of value in the same arrayI
		int a = 5;
		System.out.println(a);
		System.out.println((float)+a);// type casting
		System.out.println(a+"");//to concidering the given input as a string
		
		Integer b = 8; // similar to int
		double value = b.doubleValue();
	System.out.println(value);
	
	System.out.println(b.compareTo(a));
	}

}
