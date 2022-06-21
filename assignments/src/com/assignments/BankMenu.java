package com.assignments;

import java.util.Scanner;

public class BankMenu {

	public static void main(String[] args) {
		char letter;
		double credit=0;
		double newbalance=0;
		Scanner scanner=new Scanner(System.in);
		do {
		
		System.out.println("========================================");
		System.out.println("WELCOM TO ABC BANK MENU:");
		System.out.println("=========================================");
		int op;
		
		double debit;
		double transfer;
		
		System.out.println("Please select an option from the below menu: ");
		
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
				System.out.println("Enter the amount you want to credit your account: ");
				credit=scanner.nextInt();
				newbalance+=credit;
				System.out.println("Your account has been credited with the amount of: "+"$"+ credit);
				System.out.println("Your new account balance is: "+"$"+ newbalance);
				break;
			case 3:
				System.out.println("Enter the amount you want to  withdraw: ");
				debit=scanner.nextInt();
				newbalance-=debit;
				System.out.println("your account has been debited with the amount of: "+"$"+ debit);
				System.out.println("Your new account balance is: "+"$"+ newbalance);
				break;
				
			case 4:
				System.out.println("Enter the amount you want to  transfer: ");
				transfer=scanner.nextInt();
				newbalance-=transfer;
				System.out.println("The transfer of: "+"$"+ transfer+ " is done successfully");
				System.out.println("Your new account balance is: "+"$"+ newbalance);
				break;
				
			case 5:
				System.out.println("Your statment is: "+"$"+newbalance);
				
				
				break;
	
			default:
				System.err.println("Please select a valid option.");
				op=scanner.nextInt();
		}
		System.out.println("Do you wish to continue? y/n");
		letter=scanner.next().charAt(0);
		
		}while(letter=='y');
		scanner.close();
		
		System.out.println("Thank you, Please visit again.");

	}

}
