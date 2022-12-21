package com.project.operators;

public class ComparisonAndConditionalAndLogicalOperator {

	public static void main(String[] args) {
		int value1 = 2;
		int value2 = 3;
		
		if(value1 == value2) {
			System.out.println("value 1 = value 2");
		}
		
		if(value1 != value2) {
			System.out.println("value 1 is not equal to value 2");
		}
		
		if(value1 > value2) {
			System.out.println("value 1 > value 2");
		}
		
		if(value1 < value2) {
			System.out.println("value 1 < value 2");
		}
		
		if(value1 >= value2) {
			System.out.println("value 1 is greater than or equal to value2");
		}
		
		if(value1 <= value2) {
			System.out.println("value 1 is less than or equal to value 2");
		}
		
		// Conditional Operators
		if((value1 == 2) && (value2 == 3)) {
			System.out.println("value1 is 2 AND value2 is 3");
		}if((value1 > value2) || (value1 < value2)) {
			System.out.println("Value 1 is > value 2 OR value is < value2");
		}
		
		String greater = value1 > value2 ? "value 1 is greater" : "value 2 is greater"; 
		System.out.println(greater);
		
		if((value1 == 3) && (value1 == 2) || (value1 < value2)) {
			System.out.println("value 1 = 3 AND value 2 = 2 OR value 1 < value 2");
		}
	} 

}
