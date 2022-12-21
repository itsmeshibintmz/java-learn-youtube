package com.project.collections;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("B"); // B is added before C. it looks the type and use it's own -
		// sorting algorithm.
		treeSet.add("C");
		treeSet.add("Baloon");
		treeSet.add("Apple");
		// won't add duplicate values, it'll be ignored.
		
		System.out.println(treeSet);
		
		treeSet.remove("Baloon");
		System.out.println(treeSet);
	}

}
