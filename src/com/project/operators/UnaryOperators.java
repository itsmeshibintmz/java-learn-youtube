package com.project.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// Unary Operators
		/* 
		 * '+' : Unary Plus Operator, indicates positive value
		 * '-' : Unary minus operator, negates an expression
		 * '++' : Increment operator, increments a value by 1
		 * '--' : Decrement operator, decrements a value by 1
		 * '!' : Logical complement operator, inverts the value of a boolean
		 */
		
		int result = +1;
		System.out.println(result);
		
		result--;
		System.out.println(result);
		
		result++;
		System.out.println(result);
		
		result = -result;
		System.out.println(result);
		
		boolean success =  false;
		System.out.println(success);
		
		success = !success;
		System.out.println(success);
	}

}
