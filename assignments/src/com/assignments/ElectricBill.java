package com.assignments;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double previous;
		double current;
		Scanner scan=new Scanner(System.in);   // Scanner class object is created
		System.out.println("========================================");
		System.out.println("WELCOM TO ELECTIC BILL MANAGMENT PROGRAM");
		System.out.println("========================================");

		
		
		System.out.println("Please enter previous month meter reading: ");
		previous=scan.nextInt();
		
		
		System.out.println("Please enter current month meter reading: ");
		current=scan.nextInt(); 
		
	    double units=current-previous;
		
		System.out.println("Your total consumption for this month is: "+units+ " units");
		scan.close();
	    
		double billpay=0;
		
		if (units>=0 && units<50) {
			
			billpay = (units*1);
			
		} else if(units>=50 && units<100){
			billpay=50*1+(units-50)*2;
			
		}else if(units>=100 && units<200) {
				billpay=50*1+50*2+(units-100)*3;
			
			}else if(units>=200 && units<400){
			   billpay=50*1+50*2+100*3+(units-200)*4;
			
			   
		} else if(units>400) {
			billpay=50*1+50*2+100*3+200*4+(units-400)*5;
		}  	
		System.out.println("your total bill is:  $"+billpay);
	}

}
