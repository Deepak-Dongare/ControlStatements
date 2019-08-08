package ControlStatements;
import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
	//	Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter number");
	//	n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				System.out.println("Odd Number::="+i);
				
			}
			else {
				System.out.println("Even Number"+i);
			}
		}

	}

}
