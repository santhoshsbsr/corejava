package week1.day2;

public class LearnMeathod {
//syntax to create a meathod
	//AccessModifier ReturnType meathodName(args if needed){/*body of the meathod*/}
	// return type can be anything such as premitive data type, class, int, void , interface and so on...
	public int addTwoNumbers() {
		//this space is called meathod block
		int a=2, b=4;
		int sum = a+b;
		return sum; // return keyword helps us to return the value from the meathod
	}
	public int multiplyTwoNumbers() {
		int c=3, d=3;
		int mul = c*d;
		return mul;
	}
	public static void main(String[] args) {
	//classname obj = new classname(); -> syntax to create an object
		LearnMeathod calculator = new LearnMeathod();
		int solution_Sum = calculator.addTwoNumbers();
		System.out.println(solution_Sum);
		
		int multiplyTwoNumbers = calculator.multiplyTwoNumbers();
		System.out.println(multiplyTwoNumbers);
	}
}
