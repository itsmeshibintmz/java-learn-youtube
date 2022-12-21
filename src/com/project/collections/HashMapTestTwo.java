package com.project.collections;

import java.util.*;

public class HashMapTestTwo {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Aadhar ID ", 1234);
		hashMap.put("Voter ID ", 2321);
		hashMap.put("License ID ", 12133);
		
		System.out.println(hashMap);
		
		for(String key : hashMap.keySet()) {
			System.out.println("the value of hashmap at key " + key + "is " + hashMap.get(key));
		}
		
		if(hashMap.containsKey("Aadhar ID ")) {
			int value = hashMap.get("Aadhar ID ");
			System.out.println(value);
		}
	} 	

}
