package week3.day2.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one plus", 45000);
		map.put("i phone 11 max pro", 145000);
		map.put("samsung s20", 85000);
		map.put("i phone 11 max pro", 115000); //since the key is unique it overrides the value while key remains the same
		map.put("i phone 11 max pro", 110000);//since the key is unique it overrides the value while key remains the same
		//to print the map
		System.out.println(map);
		System.out.println(map.get("i phone 11 max pro")); //to print a particular value
		System.out.println(map.get(" phone 11 max pro")); //if the key is inacurate the value will be null

		System.out.println("iterating the map using foreach");
		//to iterate the map
		//map.entrySet(); -> to retrieve all the key value pair
		//Set<Entry<String, Integer>> entrySet = map.entrySet(); // retuns a set
		// we need to build the foreach loop as shown below
		for (Entry<String, Integer> eachEntry : map.entrySet()) {
			//System.out.print(eachEntry); //to retrieve all the value
			
			//System.out.println(eachEntry.getKey()); //to retrieve the key
		
			System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
		}
		//another way to retrive all the value through foreach iterator
		System.out.println("*****************");
		Set<String> keyset = map.keySet();
		for (String string : keyset) {
			System.out.println(string+"->"+map.get(string));
		}
		System.out.println("________to print only the values_____________");
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		System.out.println("__________contains key___________");
		System.out.println(map.containsKey("i phone 11 max pro")); //retrieves a particular value
		System.out.println(map.containsValue(110000));//retrieves a particual key
		System.out.println(map.size());//fetches the size of the map
	}
}
