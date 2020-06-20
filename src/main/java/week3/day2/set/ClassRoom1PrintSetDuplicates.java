package week3.day2.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.naming.spi.ResolveResult;

import org.testng.annotations.IFactoryAnnotation;

//1.Print only the duplicate values
//2.print only the unique value
//List = [12,22,33,22,24,35,46,57,89,46,12]



public class ClassRoom1PrintSetDuplicates {
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(12,22,33,22,24,35,46,57,89,46,12));
//	list1.add(12);
//	list1.add(22);
//	list1.add(33);
//	list1.add(22);
//	list1.add(24);
//	list1.add(35);
//	list1.add(46);
//	list1.add(57);
//	list1.add(89);
//	list1.add(46);
//	list1.add(12);
	
	System.out.println("The given list is: " +list1);
	
	System.out.println();
	
	Set<Integer> setObj = new LinkedHashSet<Integer>();
	System.out.println();
	System.out.println("the duplication values are:");
	for (int i = 0; i < list1.size(); i++) {
		
		boolean result = setObj.add(list1.get(i));
		if (result ==false) {
			System.out.print(list1.get(i) + " ");
		}
		
	}
	System.out.println();
	System.out.println();
	System.out.println("The unique values are: "+setObj);

	
}
}
