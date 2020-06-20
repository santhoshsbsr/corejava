package week3.day2.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//input String text = "Today is sunday"
//o/p = T=1,o=1,d=2,a=2,y=2...
public class ClassroomPrintTheCountofStringMeathod2 {
public static void main(String[] args) {
	
	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	String text = "Today is sunday";

for (int i = 0; i < text.length(); i++) {
	//System.out.print(text.charAt(i));
	if (map.containsKey(text.charAt(i))) {
		Integer value = map.get(text.charAt(i));
		map.put(text.charAt(i), value+1);
	}
	else {
		map.put(text.charAt(i), 1);
	}

}
System.out.println(map);
}
}
