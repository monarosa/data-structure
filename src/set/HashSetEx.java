package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(5);
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(5);
		
		System.out.println(set.size());
		
		List<String> list=Arrays.asList("two","one","two","one","three","two");
		System.out.println(list.size());
		
		
		Set<String> s=new HashSet<>(list);
		System.out.println(s);
		

	}

}
