package com.project.operators;

public class ComparisonOperator {

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
	} 

}
