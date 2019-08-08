package ControlStatements;

import java.util.Scanner;

public class ElectricityUnitCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UnitCharge");
		int unit= sc.nextInt();
		 if(unit <= 50)
		    {
		       int  amt = (int) (unit * 0.50);
		       System.out.println(amt);
		    }
		    else if(unit <= 150)
		    {
		       int  amt = (int) (25 + ((unit-50) * 0.75));
		       System.out.println(amt);
		    }
		    else if(unit <= 250)
		    {
		       int  amt = (int) (100 + ((unit-150) * 1.20));
		       System.out.println(amt);
		    }
		    else
		    {
		        int amt = (int) (220 + ((unit-250) * 1.50));
		        
		        System.out.println(amt);
		    }

		

	}

}
