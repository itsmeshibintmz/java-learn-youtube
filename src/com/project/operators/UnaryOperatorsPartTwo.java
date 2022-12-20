package com.project.operators;

public class UnaryOperatorsPartTwo {
	public static void main(String[] args) {
		int result = -1;
		System.out.println(result);
		
		result++;
		System.out.println(result); // 0
		++result; 
		System.out.println(result); // 1
		System.out.println(result++); // 1 assigned, 2 is value( 1 incremented) : 
		// printed first, then incremented
		System.out.println(++result); // 2+1 incremented first, then printed
		System.out.println(result = result + 1);
	}
}
