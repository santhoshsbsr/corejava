package week1.day1;

public class MyMobileAccessWithObject {
	// we can also access the MyMobileAccess variable by creating an object in this
	// class like demonstrated below
	public static void main(String[] args) {
		// to create the object (className obj = new Constructor();
		MyMobileAccess object = new MyMobileAccess();
		System.out.println("my mobile brand is : " + object.mobileBrand);
	}
}
