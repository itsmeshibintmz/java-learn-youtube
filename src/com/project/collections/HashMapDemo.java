package com.project.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// key value arrangement
		// Class HashMap<K, V>
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("a", 10);
		hashMap.put("b", 20);
		hashMap.put("c", 30);
		
		System.out.println(hashMap);
		System.out.println("size of the hashmap is: " + hashMap.size());
		
		if(hashMap.containsKey("a")) {
			Integer a = hashMap.get("a");
			System.out.println("The value of key 'a' is " + a);
		}
	} 

}
