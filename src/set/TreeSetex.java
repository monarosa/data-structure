package set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetex {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		SortedSet<String> sortedSet = new TreeSet<>();

		set.add("ac");
		set.add("ss");
		set.add("th");
		set.add("ed");
		set.add("th");
		set.add("ed");set.add("ed");
		set.add("th");
		set.add("ed");
		set.add("ss");
		set.add("th");
		set.add("ed");
		set.add("th");
		set.add("ed");set.add("ed");
		set.add("th");
		set.add("12");


		sortedSet.add("ac");
		sortedSet.add("ss");
		sortedSet.add("th");
		sortedSet.add("ed");
		sortedSet.add("th");
		sortedSet.add("ed");
		sortedSet.add("ac");
		sortedSet.add("ss");
		sortedSet.add("th");
		sortedSet.add("ed");
		sortedSet.add("th");
		sortedSet.add("12");
		
		
		System.out.println(set);
		System.out.println(sortedSet);
	}
}
