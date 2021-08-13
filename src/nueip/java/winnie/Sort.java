package nueip.java.winnie;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] arr = { 77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9 };
		System.out.println(Arrays.toString(sort(arr)));
	}

	public static int[] sort(int[] arr) {
		int tmp;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		return arr;
	}
}
