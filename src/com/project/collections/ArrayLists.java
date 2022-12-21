package com.project.collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	
	/* ArrayList functions
	 * Declare : 
	 * List<DataType(Integer)> arrayListName = new ArrayList<Datatype(Integer)>(size-optional);
	 * arrayListName.add(index)
	 * arrayListName.remove(index)
	 * arrayListName.get(index)
	 * To fully print an arrayList, sysout(arrayListName)
	 */

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(5);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) { // dynamic array, can add any number of elements
			System.out.println("Enter the element of the arrayList");
			arrayList.add(sc.nextInt());
		}
		
		System.out.println(arrayList);
		 
		arrayList.remove(2); // remove(index)
		
		System.out.println(arrayList);
		
		for(int i = 0;i < arrayList.size();i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		
	}
}
