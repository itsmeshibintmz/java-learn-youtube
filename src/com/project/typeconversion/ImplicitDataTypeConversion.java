package com.project.typeconversion;

public class ImplicitDataTypeConversion {

	public static void main(String[] args) {
		int a = 20;
		System.out.println("int value = " + a);
		
		long l = a;
		System.out.println("long value = " + l);
		
		float f = l;
		System.out.println("float value = " + f);
		
		double d = f;
		System.out.println("double value = " + d);

	}

}
