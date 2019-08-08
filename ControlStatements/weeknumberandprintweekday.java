package ControlStatements;

import java.util.Scanner;

public class weeknumberandprintweekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of week");
		int w=sc.nextInt();
		
		int d=w*7;
		System.out.println("Total days"+d);
	}

}
