package week3.day2.map;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//to print values more than 20000 and less than 50000
public class ClassroomPrintValuesMoreThan {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("oneplus 7t pro", 47999);
	map.put("samsung s20 ultra", 97999);
	map.put("i phone 11 max pro", 147999);
	map.put("redimi", 25000);
	map.put("oppo", 35000);
	map.put("nokia", 45999);
	map.put("my mob", 20001);
	map.put("my mob1", 10001);
	map.put("my mob1", 10001);
	//System.out.println(map);
	//Meathod1
//	Set<String> keyset = map.keySet();
//	for (String eachVal : keyset) {
//		//System.out.println(map.get(eachVal));
//		if ((map.get(eachVal)<=50000) && (map.get(eachVal)>=20000)) {
//			System.out.println(eachVal+"->"+map.get(eachVal));
//		}
//	}
	//meathod 2
	for (Entry<String, Integer> eachEntry : map.entrySet()) {
		Integer eachValue = eachEntry.getValue();
		if (eachValue>=20000 && eachValue<=50000) {
			System.out.println(eachValue+"->"+ eachEntry.getKey());
		}
	}
	

}
}
