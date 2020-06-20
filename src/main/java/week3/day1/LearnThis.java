package week3.day1;

public class LearnThis {
	//Learn this keyword for constructor
//	LearnThis(){
//		this("balaji");
//		System.out.println("first constructor");
//		}
//	LearnThis(String str){
//		this(5);
//		System.out.println();
//	}
//	
//	LearnThis(){
//		
//	}
	int a = 5;

	public void print(String name) {
		System.out.println("hello " + name);
	}

	public void printData() {
		
		int var = this.a; 
		System.out.println(this.a);
		this.print("I am Sandy");
		
		System.out.println("_____printing value of a using var keyword_________");
		System.out.println(var);
	}

	public static void main(String[] args) {
		LearnThis obj = new LearnThis();
		System.out.println(obj.a);
		obj.print("sandy");
		System.out.println("______________________________________");
		obj.printData();

	}
}
