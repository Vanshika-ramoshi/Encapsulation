package com.encapsulation;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=============== Bank Account Creation ============== ");

		System.out.println("Enter Account Holder Name");
		String name = sc.nextLine();

		System.out.println("Enter Account Number ");
		int number = sc.nextInt();

		System.out.println("Enter Initial Balance");
		double balance = sc.nextDouble();

		BankAccount b1 = new BankAccount(name, number, balance);

		int choice;
		do {
			System.out.println("================Bank Menu ===================");
			System.out.println("1.Deposit ");
			System.out.println("2.Withdraw ");
			System.out.println("3.Balance inquiry ");
			System.out.println("4.Account Details ");
			System.out.println("5.Exit");
			System.out.println("Enter Choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Deposit Ammount : ");
				double deposit = sc.nextDouble();
				b1.deposit(deposit);
				break;

			case 2:
				System.out.println("Enter Withdraw Amount : ");
				double withdraw = sc.nextDouble();
				b1.withdraw(withdraw);

			case 3:
				System.out.println("Current Balane : " + b1.getbalance());
				break;

			case 4:
				b1.displayDetails();
				break;

			case 5:
				System.out.println("Thank You For Using Bank Management System ");
				break;

			default:
				System.out.println("Invalid Choice");

			}

		} while (choice != 5);

		sc.close();

	}

}

----------------------------------------------------------------------------------------------------------------------------
  OUTPUT : 
  
=============== Bank Account Creation ============== 
Enter Account Holder Name
vanshika
Enter Account Number 
80356
Enter Initial Balance
4000
================Bank Menu ===================
1.Deposit 
2.Withdraw 
3.Balance inquiry 
4.Account Details 
5.Exit
Enter Choice : 
1
Enter Deposit Ammount : 
2000
$ = 2000.0Deposit Succesfully
================Bank Menu ===================
1.Deposit 
2.Withdraw 
3.Balance inquiry 
4.Account Details 
5.Exit
Enter Choice : 
2
Enter Withdraw Amount : 
3000
$3000.0Withdraw Succesfully
Current Balane : 3000.0
================Bank Menu ===================
1.Deposit 
2.Withdraw 
3.Balance inquiry 
4.Account Details 
5.Exit
Enter Choice : 
