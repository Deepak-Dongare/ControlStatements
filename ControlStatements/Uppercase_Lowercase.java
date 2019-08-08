package ControlStatements;
import java.util.Scanner;

public abstract class Uppercase_Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=sc.next().charAt(0);
		if( ch>64 && ch<91)
		{
			System.out.println("It is uppercase character");
		}
		
		else {
			System.out.println("Lowercase character");
		}

	}

}
