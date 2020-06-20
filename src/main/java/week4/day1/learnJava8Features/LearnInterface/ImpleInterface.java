package week4.day1.learnJava8Features.LearnInterface;

public class ImpleInterface implements LearnJava8Features {
public static void main(String[] args) {
LearnJava8Features obj = new ImpleInterface();
obj.sendKeys();
LearnJava8Features.click();//the static meathod from the interface is also an abstraction where we can call with the interface referance
//static meathod in interface is from java 8 only
}

@Override
public void sendKeys() {
	// TODO Auto-generated method stub
	System.out.println("hey");
}
}
