package com.assignments;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);   // Scanner class object is created
		//do {
		System.out.println("Enter number A:");
		double a=scan.nextDouble();
		
		System.out.println("Enter number B:");
		double b=scan.nextDouble();
		
		
		
		System.out.println("Enter number 1 for multiplication");
		System.out.println("Enter number 2 for addition");
		System.out.println("Enter number 3 for substraction");
		System.out.println("Enter number 4 for division");
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
			
				}
		//} while (true);
		
		
	}

}
