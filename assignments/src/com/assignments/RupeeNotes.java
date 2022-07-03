package com.assignments;

import java.util.Scanner;

public class RupeeNotes {
	
	Assignment 10:  Java Program to Find Total Notes in a Given Amount
In India, Currency notes are available in different denominations like 1 rupee note, 2 rupees note, 5 rupees note, 10 rupees note,
20 rupees note, 50 rupees note, 100 rupees note, 500 rupees note, 2000 rupees note.
Input and output:
Enter total amount = 6687
Number of 2000 notes = 3
Number of 500 notes = 1
Number of 100 notes = 1
Number of 50 notes = 1
Number of 20 notes = 1
Number of 10 notes = 1
Number of 5 notes = 1
Number of 2 notes = 1
Number of 1 notes = 0
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an amount: ");
		int amount=scan.nextInt();
		System.out.println("The amount entered is: "+amount);
		
	
		int modulo=amount%2000;  // rest of the division
		//System.out.println("Rest is: "+modulo);
		int twoThousandsNotes=(amount-modulo)/2000; // how many 2000 REPEATED IN AMOUNT WITHOUT THE MODULO
		System.out.println("Number of 2000 notes: "+twoThousandsNotes);
		
		
		amount=modulo; // the new amount to work on now is the rest or extra (modulo)
		//System.out.println("Rest is: "+amount);
		modulo=amount%500;
		int fiveHundredNotes=(amount-modulo)/500;
		System.out.println("Number of 500 notes: "+fiveHundredNotes);
		
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%100;
		int hundredNotes=(amount-modulo)/100;
		System.out.println("Number of 100 notes: "+hundredNotes);
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%50;
		int fiftyNotes=(amount-modulo)/50;
		System.out.println("Number of 50 notes: "+fiftyNotes);
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%20;
		int twentyNotes=(amount-modulo)/20;
		System.out.println("Number of 20 notes: "+twentyNotes);
		
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%10;
		int tenNotes=(amount-modulo)/10;
		System.out.println("Number of 10 notes: "+tenNotes);
		
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%5;
		int fiveNotes=(amount-modulo)/5;
		System.out.println("Number of 5 notes: "+fiveNotes);
		
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%2;
		int twoNotes=(amount-modulo)/2;
		System.out.println("Number of 2 notes: "+twoNotes);
		
		
		amount=modulo;
		//System.out.println("Rest is: "+amount);
		modulo=amount%1;
		int oneNotes=(amount-modulo)/1;
		System.out.println("Number of 1 notes: "+oneNotes);
		
	}

}
