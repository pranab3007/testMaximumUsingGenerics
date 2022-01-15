package com.practice.by.testMaximumUsingGenerics;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMaximum {
	public static void main(String[] args) {
		Integer[] integerList = { 9, 2, 3 };
		System.out.println(largestObject(integerList));

		Double[] floatList = { 1.0, 5.0, 3.8 };
		System.out.println(largestObject(floatList));
		
		String[] stringList = { "BIGGEZZZ", "BIGGEST", "BIG" };
		System.out.println(largestObject(stringList));
		
		List <Integer> objList = new LinkedList<Integer>();
		objList.add(22);
		objList.add(44);
		System.out.println("Max number :: " +testMaximum(objList));
		
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
	
	public static <T> T testMaximum(List<T> objList) {
	    return objList.stream().sorted().collect(Collectors.toList()).get(objList.size()-1);
	}

}
