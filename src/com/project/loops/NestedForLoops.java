package com.project.loops;
import java.util.Scanner;
public class NestedForLoops {

	public static void main(String[] args) {
		int array[][][] = new int[2][2][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k = 0;k < 3;k++) {
					array[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Array is as follows");
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < 2;j++) {
				for(int k = 0;k < 3;k++) {
					System.out.print(array[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
