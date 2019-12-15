package map;

import java.util.HashMap;
import java.util.Map;

public class MapAnotherExample {
	public static void main(String[] args) {
		
		Map<String,Integer> myMap=new HashMap<>();
		
		Map<String,Integer> myMap2=new HashMap<>();
		
		myMap.put("hasan", 2);
		myMap.put("bera", 4);
		myMap.put("ramiz", 4);
		System.out.println(myMap);
		myMap.put("bera",6);
		myMap.put("bera",4);
		System.out.println(myMap.containsKey("asd"));
	
		
		Map<String,String> person1=new HashMap<>();
		
		person1.put("name", "ridvan");
		person1.put("age", "32");
		person1.put("city", "trabzon");
		
		Map<String,String> person2=new HashMap<>();
		person2.put("name", "meryem");
		person2.put("age", "31");
		person2.put("city", "rize");
		
		
		
		System.out.println(person1);
		System.out.println(person2);

	}

}
