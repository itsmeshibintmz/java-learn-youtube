package com.project.typeconversion;

public class ExplicitDataTypeConversion {

	public static void main(String[] args) {
		double d = 123.42;
		System.out.println("Double value = "+ d);
		
		float f = (float) d;
		System.out.println("float value = "+ f);
		
		long l = (long) f;
		System.out.println("long value = "+ l);
		
		int i = (int) l;
		System.out.println("int value = " + i);
		

	}

}
