package com.encapsulation;

public class BankAccount {
// *20* | Bank Management System (account creation, deposit, withdraw, balance inquiry, validations, menu-driven program) Expert

	private String accountHolder;
	private int accountNumber;
	private double balance;

	BankAccount(String a, int b, double c) {
		this.accountHolder = a;
		this.accountNumber = b;
		this.balance = c;

	}

	public String getaccountHolder() {
		return accountHolder;

	}

	public int getaccountNumber() {
		return accountNumber;

	}

	public double getbalance() {
		return balance;

	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("$ = " + amount + "Deposit Succesfully");
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Amount!");
		} else if (amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amount;
			System.out.println("$" + amount + "Withdraw Succesfully");
		}

	}
	
	public void displayDetails() {
		System.out.println("\n----------------Account Details------------------");
		System.out.println("Account Holder =" + accountHolder);
		System.out.println("Account Number =" + accountNumber);
		System.out.println("Current Balance =" + balance);
	}
}
