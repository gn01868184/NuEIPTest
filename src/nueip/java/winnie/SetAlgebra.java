package nueip.java.winnie;

import java.util.HashSet;

public class SetAlgebra {
	public static void main(String[] args) {
		int[] a = { 77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		HashSet<Integer> aSet = toSet(a);
		HashSet<Integer> bSet = toSet(b);
		System.out.println(intersect(aSet, bSet));
		System.out.println(expect(aSet, bSet));
		System.out.println(union(aSet, bSet));
	}

	public static HashSet<Integer> toSet(int[] arr) {
		HashSet<Integer> val = new HashSet<Integer>();
		for (int num : arr) {
			val.add(num);
		}
		return val;
	}

	public static HashSet<Integer> intersect(HashSet<Integer> a, HashSet<Integer> b) {
		HashSet<Integer> val = new HashSet<Integer>();
		for (int tmp : b) {
			if (a.contains(tmp)) {
				val.add(tmp);
			}
		}
		return val;
	}

	public static HashSet<Integer> expect(HashSet<Integer> a, HashSet<Integer> b) {
		HashSet<Integer> val = new HashSet<Integer>();
		val.addAll(a);
		val.removeAll(b);
		val.removeAll(intersect(a, b));
		return val;
	}

	public static HashSet<Integer> union(HashSet<Integer> a, HashSet<Integer> b) {
		HashSet<Integer> val = new HashSet<Integer>();
		val.addAll(a);
		val.addAll(b);
		return val;
	}
}
