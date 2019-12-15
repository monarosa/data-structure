package warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Warm {



	public static void main(String args[]) {

		int[] dup = new int[] { 11, 32, 3, 24, 65, 6,6, 9, 8, 7, -1, 0,0 };

		System.out.println(met(dup));

		List<Integer> l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(2);

		System.out.println(metlist(l1));

	}

	public static boolean met(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int k = i + 1; k < nums.length; k++) {
				System.out.println("i is " + nums[i] + " while k is " + nums[k]);

				if (nums[i] == nums[k]) {

					System.out.println(nums[i] + " is a duplicate of  " + nums[k]);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean metlist(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int k = i+1; k < list.size(); k++) {

				if (list.get(k) == list.get(i))
					return true;
			}
		}

		return false;
	}
	
	
	 
	
}
