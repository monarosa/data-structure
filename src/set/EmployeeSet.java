package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		Set<Employee> set= new HashSet<>();
		set.add(new Employee(123,"cemal"));
		set.add(new Employee(124,"Patel"));
		set.add(new Employee(124,"Patel"));
		System.out.println(set.toString());
		
		
	}

}
