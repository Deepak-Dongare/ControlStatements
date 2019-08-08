package ControlStatements;
import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CoreJava Mark ");
		int a=sc.nextInt();
		System.out.println("Enter Advava Mark");
		int b=sc.nextInt();
		System.out.println("Enter the DataBase Mark" );
		int c=sc.nextInt();
		System.out.println("Enter the HTML Mark");
		int d=sc.nextInt();
		System.out.println("Enter the Framwork Mark ");
		int e=sc.nextInt();
		
		System.out.println("Total mark");
		int total=a+b+c+d+e;
		System.out.println(total);
		System.out.println("Average");
		int Average=total/5;
		System.out.println(Average);
		System.out.println("percentage");
	//	double percentage=(total/500.0)*100f;
	//	System.out.println(percentage);
		double percentage1=(float) ((a+b+c+d+e)/5.0);
		System.out.println(percentage1);
		if(percentage1>=90)
		{
			System.out.println("Grade A");
		}
		if(percentage1>=80)
		{
			System.out.println("Grade B");
		}
		if(percentage1>=70)
		{
			System.out.println("Grade C");
		}
		if(percentage1>=60)
		
		{
			System.out.println("Grade D");
		}
		if(percentage1>=40)
		{
			System.out.println("Grade E");
		}
		if(percentage1<40) {
			System.out.println("FAIL");
		}
	}

}
