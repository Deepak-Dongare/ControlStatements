package ControlStatements;

import java.util.Scanner;

public class AlphabetDigitSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter char ");
		char ch=sc.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("char");
		}
		if(ch >= '0' && ch <= '9') {
			System.out.println("number");
		}
		else {
			System.out.println("Special char");
		}

	}

}
