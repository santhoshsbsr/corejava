package week3.day1;
//final class which can not be exteded to use its functions as part of inheritance
public final class LearnFinal { 
//final meathod
public final void getBankBalance() {
	System.out.println("final meathod can not be overriden or the implementation can be changed in a  child class");
}

// final variable
	int a = 5;
	final int b = 10; // a variable declared final can not be changed
	public static void main(String[] args) {
//	System.out.println(new LearnFinal().a);
//	System.out.println(new LearnFinal().a+2);
//System.out.println(new LearnFinal().b);

		LearnFinal fn = new LearnFinal();
		System.out.println(fn.a);
		System.out.println(fn.a+1);
		System.out.println(fn.b);
		fn.a+=5; // value can be changed 
		
		
		System.out.println(fn.a);
		//fn.b+=10; // final variable value can not be changed
	}

	
}


