package com.project.loops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int array[] = {1,2,3,4};
		
		for (int i : array) {
			System.out.println("Array element at index "+ (i-1) + " is " + i);
		}
	}

}
