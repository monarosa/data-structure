package lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListexamples {

	public static void main(String[] args) {
		List<String> linked= new LinkedList<>();
		linked.add("John");
		linked.add("Vijay");
		linked.add("Bob");
		linked.add("Mark");
		//System.out.println(linked.size()+ " "+linked);
		//System.out.println(linked.indexOf("Bob"));
		
		LinkedList<String>linkedd=(LinkedList<String>)linked;
		linkedd.addFirst("Epson");
		linkedd.addLast("ridvan");
		//System.out.println(linkedd);
		linkedd.add(3, "bera");
		//System.out.println(linkedd);
		
		linkedd.removeFirst();
		//System.out.println(linkedd);
	
		linkedd.poll();// it does not throw no such element exceptions return null
		System.out.println(linkedd.peekFirst());
	
		System.out.println(linkedd);
		
		
		linkedd.offer("asdfg");
		System.out.println(linkedd);
		
		
		
		
		
	}

}
