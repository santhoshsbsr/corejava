package week3.day1.LearnList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnListLinkedArray {
public static void main(String[] args) {
	List<Integer> list1 = new LinkedList<>(Arrays.asList(11,21,12,13,43,12,99)); 
	//list1.add(11);
	//System.out.println(list1);
	System.out.println("to print the list using for loop");
for (int i = 0; i < list1.size(); i++) {
	System.out.print(list1.get(i)+" ");
}

System.out.println();

System.out.println("to varify a particular value is available in the list: " +list1.contains(99));


System.out.println();
System.out.println("printing specific value from the list: " + list1.get(1));

System.out.println();System.out.println("using foreach loop to print the given i");
for (Integer integer : list1) {
	System.out.println(integer);
}

System.out.println("__________________________");
list1.remove(0); 
System.out.println("printing the list after removing the value from index 0: "+list1);

System.out.println();
Collections.sort(list1);
System.out.println("displaying the list after sorting to ascending order: "+list1);
Collections.reverse(list1);
System.out.println("printing the sorted list in descending order"+list1);

list1.clear();//to clear all the values
list1.isEmpty();//to check if the list is empty
System.out.println("printing empty list after using Clear function : "+list1);

}
}
