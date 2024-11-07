package string_challenge;

import java.util.Scanner;

public class BirthDayCalculator{
	public static void main(String []args) {
		getBirthday();
	}
	public static void getBirthday() {
		Scanner scan = new Scanner(System.in);
		int birthday =0;
		for(int i=0;i<5;i++) {
		System.out.println(getSet(i+1));
		System.out.println("\nIs your birthday date in set of numbers provided?\nEnter 1 for yes and 2 for no ");
		int response = scan.nextInt();
		if(response==1) {
			birthday+=switch(i+1) {
			case 1 ->1;
			case 2 ->2;
			case 3 ->4;
			case 4 ->8;
			case 5 -> 16;
			default -> 0;
			};
		}
		}
		System.out.println("YOUR BIRHDAY DATE IS "+birthday);
	}
public static String getSet(int set) {
	return switch(set) {
	case 1 -> " 1 3 5 7\n" +
			" 9 11 13 15\n" +
			"17 19 21 23\n" +
			"25 27 29 31";
	case 2 -> " 2 3 6 7\n" +
			"10 11 14 15\n" +
			"18 19 22 23\n" +
			"26 27 30 31";
	case 3 -> " 4 5 6 7\n" +
			"12 13 14 15\n" +
			"20 21 22 23\n" +
			"28 29 30 31";
	case 4 -> " 8 9 10 11\n" +
			"12 13 14 15\n" +
			"24 25 26 27\n" +
			"28 29 30 31";
	case 5 -> "16 17 18 19\n" +
			"20 21 22 23\n" +
			"24 25 26 27\n" +
			"28 29 30 31";
	default -> "INAVLID INPUT";
	};
}
}
