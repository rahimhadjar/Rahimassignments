package com.assignments;

import java.util.Scanner;

public class BankMenu {

	public static void main(String[] args) {
		char letter;
		int credit=0;
		Scanner scanner=new Scanner(System.in);
		do {
		
		System.out.println("========================================");
		System.out.println("WELCOM TO ABC BANK MENU:");
		System.out.println("=========================================");
		int op;
		
		int debit;
		int transfer;
		
		
		System.out.println("Please select an option from the menu: ");
		
		System.out.println("1.Create Account");
		System.out.println("2.Credit");
		System.out.println("3.Debit");
		System.out.println("4.Transfer amount");
		System.out.println("5.Mini Statement");
		
		

		 op=scanner.nextInt();
		
		switch (op) {
			case 1:
				System.out.println("Your account has been created.");
				break;
			case 2:
				System.out.println("enter the amount you want to credit your account ");
				credit=scanner.nextInt();
				System.out.println("your account has been credited with the amount of: "+ credit);
				break;
			case 3:
				System.out.println("enter the amount you want to  withdraw: ");
				debit=scanner.nextInt();
				System.out.println("your account has been debited with the amount of: "+ debit);
				break;
				
			case 4:
				System.out.println("enter the amount you want to  transfer: ");
				transfer=scanner.nextInt();
				System.out.println("the transfer of: "+ transfer+ " is done successfully");
				break;
				
			case 5:
				System.out.println("Your statment is: "+credit);
				
				
				break;
	
			default:
				System.err.println("Please select a valid option.");
				op=scanner.nextInt();
		}
		System.out.println("do you want to continue? Y/N");
		letter=scanner.next().charAt(0);
		
		}while(letter=='Y');
		scanner.close();
		
		System.out.println("thank you, visit again.");

	}

}
