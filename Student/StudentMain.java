package com.encapsulation;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Student Info-----------");
		System.out.println("Enter Name ");
		String name = sc.nextLine();
		System.out.println("Enter RollNo ");
		int rollNo = sc.nextInt();
		System.out.println("Enter Marks :");
		float marks = sc.nextFloat();
		
		s.setname(name);
		s.setrollNo(rollNo);
		s.setmarks(marks);
		System.out.println("-----------------------------------------");
		
		System.out.println(s.getname());
		System.out.println(s.getrollNo());
		System.out.println(s.getmarks());
	}

}

----------------------------------------------------------------------------------------------
  OUTPUT : 
---------Student Info-----------
Enter Name 
Vanshika
Enter RollNo 
44
Enter Marks :
77
-----------------------------------------
Vanshika
44
77.0
