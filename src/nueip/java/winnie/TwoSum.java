package nueip.java.winnie;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		System.out.println(Arrays.toString(towSum(nums, target)));
	}

	public static int[] towSum(int[] nums, int target) {
		int[] output = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					output[0] = i;
					output[1] = j;
					return output;
				}
			}
		}
		return output;
	}
}