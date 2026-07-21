package com.encapsulation;

public class Eclectricity {

  private String customerName;
	private int unites;
	private double rate;
	
	
	public void setCustomerName(String CustomerName) {
		this.customerName = CustomerName ;
	}
	public String getcustomerName() {
		return customerName;
	}
	public void setUnites(int Unites) {
		this.unites = Unites;
	}
	public int getunites() {
		return unites;
	}
	public void setrate(double Rate) {
		rate = Rate;
	}
	
	public double getRate() {
		return rate;
	}
	
	public double calculateBill() {
		return unites * rate;
		
	}
	
	
