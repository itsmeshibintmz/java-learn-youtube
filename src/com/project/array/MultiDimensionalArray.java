package com.project.array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int array[][][] = { { {1,2,3},{2,3,4} }, { {3,4,5},{4,5,6} } };
		
		System.out.println(array[0][0][2]);
	}

}


// { { {1,2,3},{2,3,4} }, {{3,4,5},{4,5,6}} };
/*
 * { {1,2,3},{2,3,4} } first x axis = 0
 * { {3,4,5},{4,5,6} } second x axis = 1
 * {1,2,3} = 1st x axis 1st y axis = [0][0]
 * {2,3,4} = 1st x axis second y axis = [0][1]
 * {3,4,5} = 2nd x axis first y axis = [1][0]
 * {4,5,6} = 2nd x axis second y axis = [1][1]
 * 
 * {1,2,3} => 1 = [0][0][0]
 * 2 => [0][0][1]
 * 3 => [0][0][2]
*/