package ControlStatements;

import java.util.Scanner;

public class YearLeapYearNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter year ");
		long y=sc.nextLong();
		if(y%4==0) {
			if(y%100==0) {
				if(y%400==0)
				{
					System.out.println("Laep year");
				}
			}
		}
		else {
			System.out.println("YearLeapYearNot");
		}

	}

}
