package ControlStatements;
import java.util.Scanner;

public class Find_Maximum_Minimum_BetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter frist number ");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(" frist number is big:::"+a);
		}
		else {
			System.out.println("second number is big :::"+b);
		}
	}

}
