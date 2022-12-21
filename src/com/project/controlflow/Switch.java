package com.project.controlflow;

public class Switch {

	public static void main(String[] args) {
		int month = 12;
		
		switch(month) {
		case 1:
			System.out.println("Month Name = January");
			break;
		case 2:
			System.out.println("Month Name = February");
			break;
		case 3:
			System.out.println("Month name = March");
			break;
		case 4:
			System.out.println("Month name = April");
			break;
		case 5:
			System.out.println("Month name = May");
			break;
		case 6:
			System.out.println("Month name = June");
			break;
		case 7:
			System.out.println("Month name = July");
			break;
		case 8:
			System.out.println("Month name = August");
			break;
		case 9:
			System.out.println("Month name = September");
			break;
		case 10:
			System.out.println("Month name = October");
			break;
		case 11:
			System.out.println("Month name = November");
			break;
		case 12:
			System.out.println("Month name = December");
			break;
		default:
			System.out.println("Invalid month");
			break;
		}
	}

}
