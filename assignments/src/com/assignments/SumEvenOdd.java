package com.assignments;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int numOFval;
		int evenSum=0;
		int oddSum=0;
		System.out.println("Enter the number of elements you want to store");
		numOFval=scan.nextInt();
		int array[]=new int[numOFval];
        System.out.println("Enter your elements:  ");
        int i=0;
      while (i<array.length) {
    	  System.out.println("Element n°"+(i+1)+":");  
		array[i]=scan.nextInt();
		if (array[i]%2==0) {
			evenSum+=array[i];
		}
		else {
			oddSum+=array[i];
		}
		i++;
	}
      
      System.out.println("Displaying all your elements");
      for ( i=0; i<array.length; i++) {
      System.out.print(array[i]+"\t");
      
      }
      System.out.println();
      System.out.println("the sum of  even numbers is: "+evenSum);
     
      System.out.println("the sum of odd numbers is: "+oddSum);
      
	}
			
		
	}


