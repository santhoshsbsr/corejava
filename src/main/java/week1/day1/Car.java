package week1.day1;

public class Car {
	// Datatype variableName = value; // this is how we can declare any variable

	public static void main(String[] args) {
		System.out.println("welcome to my programming");
		String carName = "WagonR"; // string is non-premitive data type and string must be with in double quotes
		// and string also accepts numbers and spaces
		int seatingCapacity = 7; // for int it requires 32 bit of memory which will be saved by jvm where jvm
		// allocates 32 bit of memory for the variable
		// int can only store till 9 digits of value so anything beyond 9 digit we need
		// to go with long
		short noOfWheels = 4; // short is the shrinked version of int where we can have less than 4 or 5 digit
		// number
		long chasisNumber = 12345678910111213L; // long to be stored with L at the end to represent the number as long.
		float fuelTankCapacity = 26.87F; // uses 32 bit of memory which is used to store a smaller decimal value and F
		// has to be mentioned at the last to represent the number as float.
		// if F is not mentioned for float then it will implecitly concider the number
		// to be double
		double engineCapacity = 1.223232322;// double is used for bigger decimal number, and no letter is required to
		// represent the double
		char varient = 'P'; // char must be declared with single quotes like how it is specified
		// char numbers can be only single characters
		char varient1 = '\u0000'; // it is a unicode charecter used to represent null in the computer
		// understandable language
		boolean isPunctured = false;
		
		System.out.println("the car name is " + carName);
		System.out.println("the car varient is " +varient);
	}

}
