package com.newvideo.tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("True or False");
		String scanned = sc.next();
		boolean value = Boolean.parseBoolean(scanned);
		System.out.println("the answer is: "+value);
	}

}
