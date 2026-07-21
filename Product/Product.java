package com.encapsulation;

public class Product {

	private double price;
	private int quantity;

	public void setprice(double p) {
		this.price = p;

	}

	public double getprice() {
		return price;

	}

	public void setquantity(int q) {
		this.quantity = q;
	}

	public int getquantity() {
		return quantity;
	}
	
    
	public double calculatetotalPrice() {
		return price * quantity;
	}
	
}
