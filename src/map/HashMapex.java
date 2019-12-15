package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapex  {

	public static void main(String[] args) {
	
		Map <String,Integer> map= new HashMap<>();
		
		map.put("coffee", 12);

		map.put("tea", 22);map.put("tea", 34);map.put("tea", 3432);
		
		System.out.println(map.size());
		
		System.out.println(map.keySet());	
		
	
	map.remove("get");
	map.clear();
	System.out.println(map.size());
	
	}

}
