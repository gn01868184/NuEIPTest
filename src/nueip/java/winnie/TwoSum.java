package nueip.java.winnie;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hash.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(target - nums[i])) {
				output[0] = i;
				output[1] = hash.get(target - nums[i]);
				break;
			}
		}
		return output;
	}
}