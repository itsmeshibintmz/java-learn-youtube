package com.project.basics;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		String str = "test";
		System.out.println("String is :" + str);
		
		String str1 = new String("test");
		System.out.println("Another string is :" + str1);
		
		int arr[];
		arr = new int[2];
		arr[0] = 3;
		arr[1] = 6;
		// arr[2] = 2;
		
		System.out.println(arr); // as this is non-primitive, it'll display memory size/location
		System.out.println(arr[0] +" " + arr[1]);
		// System.out.println(arr[2]); // get arrayoutofboundexception as array have size limit 2;
	}

}
