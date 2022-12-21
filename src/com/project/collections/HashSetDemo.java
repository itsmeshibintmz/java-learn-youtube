package com.project.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		hashSet.add("A");
		hashSet.add("A"); // will be ignored by HashSet as it is a duplicate.
		hashSet.add("B");
		hashSet.add("C");
		
		System.out.println(hashSet);
		// [A, B, C]
		
		System.out.println(hashSet.isEmpty());

	}

}
