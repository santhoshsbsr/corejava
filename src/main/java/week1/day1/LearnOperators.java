package week1.day1;

public class LearnOperators {
	public static void main(String[] args) {
		int a = 5;
		// pre incremental
		System.out.println(++a);// this will give the value as 6 since it increments before.
		
		//post incremental
		System.out.println(a++);// it will give the result as only 5 since a++ is post incremental operator so
								// only after the semi-colon the value will be changed
		System.out.println(a);// post incremental like after a++ and the semi colon the value of a will be
								// changed by increases a number
		
		// a = a+1;// this will reassign the value for a and this corresponding value
		// will be printed
		// System.out.println(a); // result will be 6
	}
}
