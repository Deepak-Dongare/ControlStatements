package ControlStatements;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter frist number");
		long a=sc.nextLong();
		System.out.println("enter second number ");
		long b=sc.nextInt();
		
		
		System.out.println("Enter 1 for add ::2 for sub::3 for mul::4 for divi ");
		int i=sc.nextInt();
		switch(i) {
		case 1:System.out.println("Addition of user number is "+(a+b));
		break;
		case 2:System.out.println("sub of user number is "+(a-b));
		break;
		case 3:System.out.println("mul of user number is" +(a*b));
		break;
		case 4:System.out.println("  div of user number is"+(a/b));
		break;
		case 5:
			if(b==0) {
			System.out.println("Zero is not enter is denometer");
		}

	}
	}
}
