package com.encapsulation;

import java.util.Scanner;

public class EclectricityMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Eclectricity e1 =  new Eclectricity();
		
		
		System.out.println("-------------Eclecricity Bill----------------");
		
		   System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Units Consumed: ");
	        int unites = sc.nextInt();

	        System.out.print("Enter Rate Per Unit: ");
	        double rate = sc.nextDouble();
	        
	        e1.setCustomerName(name);
	        e1.setUnites(unites);
	        e1.setrate(rate);
	        

	        System.out.println("\n------ Electricity Bill ------");
	        System.out.println("Customer Name : " + e1.getcustomerName());
	        System.out.println("Units         : " + e1.getunites());
	        System.out.println("Rate          : " + e1.getRate());
	        System.out.println("Total Bill    : " + e1.calculateBill());

	        sc.close();
	    }

	}

--------------------------------------------------------------------------------------------------------------------
  OUTPUT : 
-------------Eclecricity Bill----------------
Enter Customer Name: vanshika
Enter Units Consumed: 150
Enter Rate Per Unit: 8.5

------ Electricity Bill ------
Customer Name : vanshika
Units         : 150
Rate          : 8.5
Total Bill    : 1275.0
