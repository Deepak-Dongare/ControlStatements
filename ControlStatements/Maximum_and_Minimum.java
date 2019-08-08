package ControlStatements;

import java.util.Scanner;

public class Maximum_and_Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Frist Value ");
		int a=sc.nextInt();
		//int a=10;
		System.out.println(" Enter Second Value");
		int b=sc.nextInt();
		//int b=20;
		if(a>b)
		{
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}

	}

}
