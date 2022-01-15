package com.practice.by.testMaximumUsingGenerics;

public class TestMaximum {
	public static void main(String[] args) {
		Integer[] integerList = { 9, 2, 3 };
		System.out.println(largestObject(integerList));

		Double[] floatList = { 1.0, 5.0, 3.8 };
		System.out.println(largestObject(floatList));
		
		String[] stringList = { "BIGGEZZZ", "BIGGEST", "BIG" };
		System.out.println(largestObject(stringList));
	}

	public static <T extends Object & Comparable<T>> T largestObject(T[] numbers) {
		boolean onFirstObj = true;
		T largestVal = null;

		for (T t : numbers) {
			System.out.println("Class Name :: " + t.getClass().getSimpleName());
			if (t.getClass().getSimpleName().equals("String")) {
				if (onFirstObj) {
					largestVal = t;
					onFirstObj = false;
				} else {
					if (t.compareTo(largestVal) > 0) {
						largestVal = t;
					}
				}
			}
		}

		return largestVal;
	}

}
