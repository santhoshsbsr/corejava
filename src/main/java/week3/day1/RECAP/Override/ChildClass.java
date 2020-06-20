package week3.day1.RECAP.Override;

public class ChildClass extends ParentClass{
	//calls the ParentClass by using the keyword super and it should be the first constructor and keyword
public ChildClass() {
	super();
}
	public void getHouse(){
		System.out.println("child house");
		
		
	}
	public void getParentHouse() {
		super.getHouse();
	}
}
