package com.project.controlflow;

public class NestedIf {

	public static void main(String[] args) {
		int a = 10;
		
		if(a == 10) {
			System.out.println("a is 10");
		} if(a > 5) {
			System.out.println("a is > 5");
		} if( a > 10) {
			System.out.println("a is > 10");
		}	
	}

}
