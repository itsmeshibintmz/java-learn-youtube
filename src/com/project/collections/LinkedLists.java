package com.project.collections;

import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add(2, "E");
		list.addFirst("Q");
		list.push("W");
		list.addLast("X");
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.remove("B");
		System.out.println(list);
		list.removeFirstOccurrence("A");
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
	}

}
