package com.pattern.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEveryDayDemo {

	public static void main(String[] args) {
		
		Integer[] arrayOfInts = new Integer[] {12, 23, 45, 21};
		
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		
		System.out.println(arrayOfInts);
		
		System.out.println(listOfInts);
	}
	
}
