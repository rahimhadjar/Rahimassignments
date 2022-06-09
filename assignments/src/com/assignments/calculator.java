package com.assignments;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);   // Scanner class object is created
		//do {
		
		
		System.out.println("========================================");
		System.out.println("WELCOM TO SWITCH CASE CALCULATOR PROGRAM:");
		System.out.println("=========================================");
		
		System.out.println("Enter number A:");
		double a=scan.nextDouble();
		
		System.out.println("Enter number B:");
		double b=scan.nextDouble();
		
		System.out.println("========================================");
		System.out.println("PLEASE MAKE A SELACTION FROM OPTIONS BELOW: ");
		System.out.println("===========================================");
		
		System.out.println("Select number 1 for multiplication");
		System.out.println("Select number 2 for addition");
		System.out.println("Select number 3 for substraction");
		System.out.println("Select number 4 for division");
		int op=scan.nextInt();
		
		scan.close();
		
		double result=0;
		
		//switch supports byte,short, char, int, String
		switch (op) {
			case 1:
				System.out.println("The result of your multiplication is:");
				result=a*b;
				System.out.println(result);
				break;
			case 2:
				System.out.println("The result of your addition is:");
				result=a+b;
				System.out.println(result);
				break;
			case 3:
				System.out.println("The result of your substraction is:");
				result=a-b;
				System.out.println(result);
				break;
			case 4:
				System.out.println("The result of your division is:");
				result=a/b;
				System.out.println(result);
				break;
			
				
	default:
		System.err.println("Invalid selection");
		break;
		}
		 
		//while (true);
		
		
	}

}
