package com.practice.by.testMaximumUsingGenerics;

public class TestMaximum {
	public static void main(String[] args) {
		Integer[] integerList = { 9, 2, 3 };
		System.out.println(largestNumber(integerList));

		Double[] floatList = { 1.0, 5.0, 3.8 };
		System.out.println(largestNumber(floatList));
		
		String[] stringList = { "BIGGEZZZ", "BIGGEST", "BIG" };
		System.out.println(largestString(stringList));
	}

	public static <T extends Number & Comparable<T>> T largestNumber(T[] numbers) {
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
	
	public static <T extends Object & Comparable<T>> T largestString(T[] strings) {
		boolean onFirstObj = true;
		T largestVal = null;
		
		for (T t : strings) {
			System.out.println("Class Name :: " + t.getClass().getSimpleName());
			if (onFirstObj) {
				largestVal = t;
				onFirstObj = false;
			} else {
				if (t.compareTo(largestVal) > 0) {
					largestVal = t;
				}
			}
		}
		
		return largestVal;
     }

}
