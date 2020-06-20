package week1.day1;

public class PracticeMobile {
	public static void main(String[] args) {
		System.out.println("welcome to my programming");
		String mobileBrand = "Apple"; // string is non-premitive data type and string must be with in double quotes
		// and string also accepts numbers and spaces
		int model = 8; // for int it requires 32 bit of memory which will be saved by jvm where jvm
		// allocates 32 bit of memory for the variable
		// int can only store till 9 digits of value so anything beyond 9 digit we need
		// to go with long
		short noOfButtons = 4; // short is the shrinked version of int where we can have less than 4 or 5 digit
		// number
		long iemeNumber = 12345678910111213L; // long to be stored with L at the end to represent the number as long.
		float versionPhone = 12.87F; // uses 32 bit of memory which is used to store a smaller decimal value and F
		// has to be mentioned at the last to represent the number as float.
		// if F is not mentioned for float then it will implecitly concider the number
		// to be double
		double mobileSpeed = 14.223232322;// double is used for bigger decimal number, and no letter is required to
		// represent the double
		char mobileVarient = 'X'; // char must be declared with single quotes like how it is specified
		// char numbers can be only single characters
		//char varient1 = '\u0000'; // it is a unicode charecter used to represent null in the computer
		// understandable language
		boolean isCharged = true;
		
		System.out.println("the mobile name is " + mobileBrand);
		System.out.println("the mobile varient is " + mobileVarient);
		System.out.println("the speed of mobile is " + mobileSpeed);
		System.out.println("the total number of buttons are " + noOfButtons);
	}

}
