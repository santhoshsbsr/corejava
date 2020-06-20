package javaCode.Learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aventstack.extentreports.gherkin.model.And;

//3. print only the names starting with j 
//List=[james,adam,joe,jon,khalisi,james]
public class Classroom2PrintNameStartingwith {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>(Arrays.asList("James","adam","joe","jon","khalisi","james"));
	System.out.println(list);
	
	System.out.println("The names starting for j and J");
	for (String eachName : list) {
//		if ((eachName.startsWith("j"))||(eachName.startsWith("J")) ){
//			System.out.print(eachName + " ");
//		}
//		
		if (eachName.startsWith("j") || eachName.startsWith("J")) {
			System.out.print(eachName + " ");
		}
	}
}
}
