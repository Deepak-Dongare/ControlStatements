package ControlStatements;
import java.util.Scanner;

public class TriangleEquilIsScaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Frist Side of Trangle");
		int a=sc.nextInt();
		System.out.println("Enter Second Side of Trangle");
		int b=sc.nextInt();
		System.out.println("Enter Theade side of Trangle");
		int c=sc.nextInt();
		if(a==b&&b==c)
		{
			System.out.println("Trangle is equilater");
		}
		else if(a==b||a==c||b==c)
		{
			System.out.println("Trangle is isosceles ");
		}
		else
		{
			System.out.println("Trangle is scalene ");
		}

	}

}
