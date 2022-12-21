package com.project.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		boolean r1 = hashSet.add("A");
		System.out.println(r1);
		boolean r2 = hashSet.add("A"); // will be ignored by HashSet as it is a duplicate.
		System.out.println(r2);
		hashSet.add("B");
		hashSet.add("C");
		
		System.out.println(hashSet);
		// [A, B, C]
		
		System.out.println(hashSet.isEmpty());
		hashSet.remove("B");
		System.out.println(hashSet);
		System.out.println("A contain in the HashSet? "+ hashSet.contains("A"));
		
		for(String item : hashSet) {
			System.out.println(item);
		}
	}

}
