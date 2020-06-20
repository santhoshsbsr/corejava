package week1.day2;

public class LearnMeathodArguments {
	
	public String text = "sandy's program";// this is a global variable
	
	public int addTwoNumbers(int a, int b) {
		//this space is called meathod block
		int sum = a+b;
		return sum; // return keyword helps us to return the value from the meathod
	}
	
	public int mulTwoNumbers(int a, int b) {
		//this space is called meathod block
		int mul = a*b;
		return mul; // return keyword helps us to return the value from the meathod
	}
	public int divTwoNumbers(int a, int b) {
		//this space is called meathod block
		int div = a/b;
		return div; // return keyword helps us to return the value from the meathod
	}
	
	public int subTwoNumbers(int a, int b) {
		//this space is called meathod block
		int sub = a-b;
		return sub; // return keyword helps us to return the value from the meathod
	}
	
	public void clear() {
		System.out.println("I have cleared the display");
	}
	
	public static void main(String[] args) {
		LearnMeathodArguments cal = new LearnMeathodArguments();
		
		System.out.println(cal.text);
		
		int addition = cal.addTwoNumbers(10, 10);
		System.out.println("The addition of a+b values " + addition);
		
		int multiplication = cal.mulTwoNumbers(2, 4);
		System.out.println("the multiplication value is " +multiplication);
		
		int division = cal.divTwoNumbers(4, 2);
		System.out.println("thd division value is " +division);
		
		int subtraction = cal.subTwoNumbers(3, 2);
		System.out.println("the subtraction valus is: " +subtraction);
		
		cal.clear();
		
	}
	
}
