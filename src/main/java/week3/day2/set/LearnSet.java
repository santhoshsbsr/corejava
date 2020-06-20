package week3.day2.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		System.out.println("LinkedHashSet which maintains the insertion order in the o/p:");
		Set<String> setObj = new LinkedHashSet<>(); // Linkedhashset maintains the insertion order
		setObj.add("A");
		setObj.add("B");
		setObj.add("C");
		setObj.add("D");
		setObj.add("E");
		setObj.add("F");
		System.out.println("o/p for linked hashset: " + setObj);
		
		System.out.println();
		System.out.println("Foreach iterator");
		for (String eachWord : setObj) {
			System.out.println(eachWord);
		}
		//Converting set to list way 1
		List<String> list = new ArrayList<String>(setObj);
	System.out.println("The set to list converted o/p: "+list);
//		//converting set to list way 2
//		list.addAll(setObj);
//		System.out.println("meathod 2 to convert the set to list"+list);
	System.out.println("Retrieving a particular value from the set: " +list.get(1));

		System.out.println();
		

		System.out.println("HashSet which using hashing algorithm this gives random output:");
		Set<String> setObjHash = new HashSet<>(); // using hashing algorithm this gives random output
		setObjHash.add("Zarry");
		setObjHash.add("Balaaj");
		setObjHash.add("Cathy");
		setObjHash.add("Donkey");
		setObjHash.add("Eifle");
		setObjHash.add("Fish");
		System.out.println("o/p for hashset: " + setObjHash);

		System.out.println();

		System.out.println("TreeSet the output will be based on the ascii order");
		// using tree set we dont have to use collections.sort to sort the input coz it-
		// -naturally works based on the ascii order which sorts itself in the o/p
		Set<String> setObjTree = new TreeSet<>(); // o/p will be based on ascii order
		setObjTree.add("Zarry");
		setObjTree.add("Balaaj");
		setObjTree.add("Cathy");
		setObjTree.add("Donkey");
		setObjTree.add("Eifle");
		setObjTree.add("Fish");
		System.out.println("o/p for TreeSet: " + setObjTree);
		
		System.out.println();
		
		System.out.println("Checking with duplicate value");
		//for a duplicate value the returned boolean value will be false as shown in the o/p
		//the duplicate value will automatically be neglected
		Set<String> setObjDup = new TreeSet<>(); // o/p will be based on ascii order
		boolean res1 = setObjDup.add("Zarry");
		System.out.println(res1);
		setObjDup.add("Balaaj");
		boolean res2 = setObjDup.add("Zarry");
		System.out.println(res2);
		setObjDup.add("Donkey");
		setObjDup.add("Eifle");
		setObjDup.add("Fish");
		System.out.println("o/p for hashset: " + setObjTree);
		
		System.out.println();
		System.out.println("Notes:");
		System.out.println("note1: since the implementing classes gives different kind of o/t the get funtion is not avalilable for set");
		System.out.println("note2: Hashset is faster than the rest of the implementation classes i.e. tree and linked set");
	}

	
	//note: the get funtion will not work in set because it may/may not give the o/p in insertion order
	//-since the implementing classes gives different kind of o/t the get funtion is not avalilable for set
	//-Hashset is faster than the rest of the implementation classes i.e. tree and linked set
}
