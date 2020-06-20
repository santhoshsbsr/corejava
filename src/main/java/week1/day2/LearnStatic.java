package week1.day2;

public class LearnStatic {
	
	// static and non static variables
	public int a= 5; // normal variable and also a global variable
	
	public static int b=10; // this is a static variable
	
	
	public void change()// changing the value 
	{
		LearnStatic obj1 = new LearnStatic();
		obj1.a= obj1.a+5;
		System.out.println(obj1.a);// to print the value outside this block since it is not static
				b=b+5;
	}
	
	// static and non static meathods
	
	public void print() {
		System.out.println("printed");
	}
	
	public static void clear() {
		System.out.println("cleared");
	}
	
	public static void main(String[] args) {
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.a); // where a is non-static variable
		System.out.println(b); // if it is a static variable we dont need the object reference to call the static variable
		obj.print();
		clear();

	}
	
	
}
