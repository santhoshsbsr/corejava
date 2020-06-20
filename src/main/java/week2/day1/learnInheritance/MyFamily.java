package week2.day1.learnInheritance;

public class MyFamily extends MyFatherSubclass{
public static void main(String[] args) {
	MyFatherSubclass myFather = new MyFatherSubclass();
	System.out.println(myFather.apartment);
	myFather.givingNothing();
	
	GrandfatherSuperClass gFather = new GrandfatherSuperClass();
	System.out.println(gFather.house);
}
}
