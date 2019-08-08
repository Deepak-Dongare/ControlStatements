package ControlStatements;

import java.util.Scanner;

public class Grosssalary  {

	public static void main(String[] args) {
		double  gross;
		double hra;
		double da;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		 float basic=sc.nextLong();
		if(basic <= 10000)
	    {
	         da  = basic * 0.8;
	        hra = basic * 0.2;
	    }
	    else if(basic <= 20000)
	    {
	        da  = basic * 0.9;
	        hra = basic * 0.25;
	    }
	    else
	    {
	        da  = basic * 0.95;
	        hra = basic * 0.3;
	    }

	    /* Calculate gross salary */
	    gross = basic + hra + da;

	    System.out.println(gross);

	  //  return 0;
	}

	}


