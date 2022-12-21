package com.project.controlflow;

public class IfElse {
	public static void main(String[] args) {
		int score = 76;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}
}
