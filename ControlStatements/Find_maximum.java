package ControlStatements;
import java.util.Scanner;

public class Find_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Frist Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		System.out.println("Enter thread Number");
		int c=sc.nextInt();
		if(a>b)
		{
			System.out.println("Frist number is Big");
		}
		if(b>a)
		{
			System.out.println("Second number is Big ");
		}
		if(c>a&&c>b)
		
		{
			System.out.println("Thread number is Big ");
		}
		else
		{
			System.out.println("Enter three number only OR Enter diffenet Number");
		}
		

	}

}
