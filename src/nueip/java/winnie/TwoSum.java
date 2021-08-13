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
			if ((nums[i] + nums[i + 1]) == target) {
				output[0] = i;
				output[1] = i + 1;
				break;
			}
		}
		return output;
	}
}
