package week3.day2.map;

import java.util.HashMap;
import java.util.Map;

//input String text = "Today is sunday"
//o/p = T=1,o=1,d=2,a=2,y=2...
public class ClassroomPrintTheCountofString {
public static void main(String[] args) {
	String str = "Today is sunday";
	int count =0;
	char[] char_array =str.toCharArray();
	Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
	for (char ch : char_array) {
		if (charCounter.containsKey(ch)) {
			charCounter.put(ch, charCounter.get(ch)+1);
			
		}else {
			charCounter.put(ch, 1);
		}
	}System.out.println(charCounter);
}
}
