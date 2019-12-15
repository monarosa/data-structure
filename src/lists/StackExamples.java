package lists;

import java.util.Stack;

public class StackExamples {

	public static void main(String[] args) {
		Stack<String> lifo=new Stack<>();
		lifo.push("java");
		lifo.push("OCA");
		lifo.push("Selenium cookook");
		lifo.push("10X");
		lifo.push("10X");
		System.out.println(lifo.peek());
		System.out.println(lifo);
		System.out.println(lifo.search("OCA"));
	}

}
