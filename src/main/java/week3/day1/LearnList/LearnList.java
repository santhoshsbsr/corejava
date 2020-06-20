package week3.day1.LearnList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		
		
		//bring array just to compare with the collections topic
		int[] array = new int[10];
		array[0] = 10; // this is how we add value to an array

		
		Object[]  superArray = {1,2,3,"sadny",true,3};//object is a super array which helps to store all the premitive datatypes
		//**************************Learning Array List***************************
		// ArrayList 
		// 1. maintain the insersion order 2.allows duplicate values 3.FIFO first in first out

		// we are using Integer since the collections can only use the wrapper class of
		// the premetive data type
		List<Integer> list = new ArrayList<Integer>(); // scope restriction for list
		
		// to add value to the list
		list.add(99);
		list.add(54);
		list.add(22);
		list.add(27);
		list.add(54);
		list.add(1,100);//keying two arguments to add, we can add the value using the meathod overloading
		System.out.println("the size of the array list is: " + list.size());
		// to print the list
		System.out.println(list);
		System.out.println("_____________");
		// we can also use forloop to print the array
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");

		}System.out.println();
		System.out.println("to varify a particular value is available in the list: " +list.contains(99));
		System.out.println();
		System.out.println("printing specific value from the list: " + list.get(0));

		System.out.println("******"
				+ "******************");
		for (Integer eachNumber : list) {
			System.out.print(eachNumber+",");
		}
		
		System.out.println("__________________________");
		list.remove(0); 
		System.out.println("printing the list after removing the value from index 0: "+list);
		Collections.sort(list);
		System.out.println("displaying the list after sorting to ascending order: "+list);
		Collections.reverse(list);
		System.out.println("printing the sorted list in descending order"+list);
		//list.clear();//to clear all the values
		//list.isEmpty();//to check if the list is empty
	}
}
