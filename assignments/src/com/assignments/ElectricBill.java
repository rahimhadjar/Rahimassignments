package com.assignments;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);   // Scanner class object is created
		System.out.println("enter the number of units");
		double units=scan.nextInt();
		System.out.println("units given is:"+units);
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
		System.out.println("your total bill is:  Rs"+billpay);
	}

}
