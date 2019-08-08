package ControlStatements;
import java.util.Scanner;

public class Vowel_or_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//char =a,i,o,u,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("consonant");
		}

	}

}
