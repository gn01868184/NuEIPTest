package nueip.java.winnie;

import java.util.Arrays;

public class ArrHandler {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(subtract(arr));
		int[] odd = arrSplit(arr, "odd");
		int[] even = arrSplit(arr, "even");
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));
	}

	public static int subtract(int[] arr) {
		int val = 0;
		for (int tmp : arr) {
			if (tmp % 2 == 0)
				val -= tmp;
			else
				val += tmp;
		}
		return val;
	}

	public static int[] arrSplit(int[] arr, String type) {
		int[] oddVal = new int[5];
		int[] evenVal = new int[5];
		int i = 0;
		for (int tmp : arr) {
			if (tmp % 2 == 0) {
				evenVal[i] = tmp;
				i++;
			} else {
				oddVal[i] = tmp;
			}
		}
		if (type.equals("odd"))
			return oddVal;
		else
			return evenVal;
	}
}
