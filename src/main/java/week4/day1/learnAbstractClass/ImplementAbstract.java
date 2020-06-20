package week4.day1.learnAbstractClass;

public class ImplementAbstract extends LearnAbstract {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		//implemented the unimplemented meathods
	}
public static void main(String[] args) {
	ImplementAbstract obj = new ImplementAbstract();//object reference for abstract class can only be created for the subclass
	obj.display();
	obj.print();
}
}
