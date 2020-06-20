package week4.day1.learnAbstractClass;

public abstract class LearnAbstract {
//abstract is a class which can have both abstract and non-abstract meathods
	//it is 50% of class and 50% of interface
	//using abstract class we can not create an object
	//-object can be created only for the subclass
	//you can not directly run a abstract class
	
	public void print() {
		System.out.println("printed");
	}
	public abstract void display();
}
