package com.project.collections;

import java.util.*;
import java.util.Map.Entry;

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
		 
		// To iterate over the Map
		for(String key : hashMap.keySet()) {
			System.out.println("The value of " + key + " is " + hashMap.get(key));
		}
		
		for(Entry<String, Integer> entry: hashMap.entrySet()) {
			System.out.println("key " + entry.getKey() + ", "+ "value: " + entry.getValue());
		}
	} 

}
