package com.project.collections;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
//		TreeMap<Integer, String> treeMap = new TreeMap<>();
//		
//		treeMap.put(3, "A");
//		treeMap.put(2, "B");
//		treeMap.put(1, "C");
		
//		or if we change the key value terms
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("C", 1);
		treeMap.put("A", 3);
		treeMap.put("B", 2);
		
		System.out.println(treeMap);
		// {1=C, 2=B, 3=A}
	}

}
