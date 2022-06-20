package com.assignments;

import java.util.Scanner;

public class PrimeNumbers {

	
	
		 public static void main(String args[]){    
		  Scanner scan=new Scanner(System.in);
		  System.out.println("WELCOM TO PRIME NUMBER CHECKER PROGRAM");
		  System.out.println("======================================");
		  System.out.println("Enter any number: ");
		  int n=scan.nextInt();	  
			 
		  checkPrime(n); 
		  
		 // checkPrime(3);  
		  //checkPrime(17);  
		  //checkPrime(20);  
		}    
		 
	
	
	
static void checkPrime(int n){  
	  int i,m=0,flag=0;      
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+ " --> it's not a prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+ " --> it's not a prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+ " --> it's a prime number"); }  
	  }//end of else  
}
}
