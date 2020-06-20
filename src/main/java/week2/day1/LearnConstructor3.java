package week2.day1;

public class LearnConstructor3 {

	public LearnConstructor3() {
		System.out.println("Constructer invoked");
	}

	String str = "test";

	public static void main(String[] args) {
		LearnConstructor3 obj = new LearnConstructor3();
		System.out.println(obj.str);

	}

}
