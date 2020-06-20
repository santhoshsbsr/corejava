package week2.day2;
// polymorphism -> meathod overloading by passing different arguments in the same meathod syntax
//-> can be done with different types of arguments
public class Calculator1 {
	int a,b;
// constructor 1 // a constructor is a gateway to the class
	public Calculator1() {
		System.out.println("calculator is running");
	}
	//constructor 2
	public Calculator1(int x, int y) {
		a = x;
		b = y;
	}
	//1.different number of arguments
	public void add() // meathod
{
	//int a = 5, b =10; // in the meathod we are having two variables
	System.out.println("sum: " +(a+b));

}
	public static int add(int a, int b,int c, int d)
	{
		
		System.out.println("sum: " +(a+b+c+d));
		return a+b+c+d;
	}

	public void add(int a, int b)   //we can have the same meathod syntax and this is called meathod overloading 
	//2.here I have passed two arguments in the meathod
	{
		System.out.println("sum: " +(a+b));
	}
public void add(int a, int b, int c)   //we can have the same meathod syntax and this is called meathod overloading 
//2.here I have passed two arguments in the meathod
{
	System.out.println("sum: " +(a+b+c));
}

// now let us do with differnt type of arguments

public void add(double a, double b)   //we can have the same meathod syntax and this is called meathod overloading 
//here I have passed two arguments in the meathod
{
	System.out.println("sum: " +(a+b));
}

// main meathod to create 
public static void main(String[] args) {
	Calculator1 calculations = new Calculator1();
	Calculator1.add(1,1, 1, 1);
	calculations.add(2,3);
	calculations.add();
	calculations.add(2,1,3);
	calculations.add(24.1,3.1);
	
	
}




}
