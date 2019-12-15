package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrrayListExamples {

	public static void main(String[] args) {
		List<String> l= new ArrayList<String>();
		
		l.add("water");
		l.add("coffee");
		l.add("bottle");
		l.add("cup");
		l.add("cup");
		
	//	System.out.println(l.indexOf("cup"));
		
		String[] str=l.toArray(new String[4]);
		Arrays.sort(str);
		System.out.println(Arrays.binarySearch(str, "bottle"));
		
	l.clear();
	
	
	int[] num= {1,2,3,4,5};
	num=Arrays.copyOf(num, num.length+3);
	System.out.println(num.length);
	num[9]=12;
	System.out.println(num.length);
	
	

	
	}

}
