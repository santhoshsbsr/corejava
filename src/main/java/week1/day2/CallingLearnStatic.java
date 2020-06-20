package week1.day2;

public class CallingLearnStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearnStatic ob = new LearnStatic();
System.out.println(ob.a);
System.out.println(LearnStatic.b);// we need to call the static variable using the class name where the static variable is declared

ob.change(); // to access the changed value

LearnStatic obj3 = new LearnStatic();
System.out.println(obj3.a);
System.out.println(LearnStatic.b);

LearnStatic.clear();// we need to call the meathod using class name where the static meathod is declared with out object

	}

}
