package com.project.collections;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(10);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i < 4;i++) {
			System.out.println("Enter the element of arraylist");
			arrayList.add(sc.nextInt());
		}
		
		for(int i = 0;i < 4;i++) {
			System.out.println("Enter the element of arraylist");
			arrayList.add(sc.nextInt());
		}
		
		for(int i = 0;i < arrayList.size();i++) {
			System.out.println(arrayList.get(i)+ " ");
		}
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
	}
}
