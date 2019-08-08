package ControlStatements;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Value");
		int i=sc.nextInt();
		System.out.println("Enter float Value");
		float f=sc.nextFloat();
		System.out.println("Enter Char value");
		String ch=sc.next();
		System.out.println("Enter long value");
		long l=sc.nextLong();
		System.out.println(i);
		System.out.println(f);
		System.out.println(ch);
		System.out.println(l);

	}

}
