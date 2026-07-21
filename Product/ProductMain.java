package com.encapsulation;

import java.util.Scanner;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product p = new Product();

		System.out.println("Enter Product Price");
		double price = sc.nextDouble();
		
		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();
		
		p.setprice(price);
		p.setquantity(quantity);
		
		System.out.println("---------------Product Details----------------");
		
		System.out.println("Price = " + p.getprice());
	  System.out.println("Quantity = " + p.getquantity());
	  System.out.println("Total Price = "+ p.calculatetotalPrice());
	  sc.close();
	}

}
