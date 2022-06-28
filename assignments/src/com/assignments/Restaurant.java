package com.assignments;

abstract public class Restaurant {
;
	public void PrintName(String name)
	{
		System.out.println("this is: "+name);
	}
	
	public abstract void totalPrice();
	public  abstract void menu();
	
public static void main(String[] args) {
	McDonald obj1=new McDonald();
  obj1.PrintName("McDonalds");
  obj1.totalPrice();
  obj1.menu();

System.out.println();

    KFC obj2=new KFC();
  obj2.PrintName("KFC");
  obj2.totalPrice();
  obj2.menu();

	}
	
}


class McDonald extends Restaurant {

	

	@Override
	public void menu() {
		System.out.println("McDonald Menu:");
	}

	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub
		double tax = 0.06;
		System.out.println("Taxe in McDonald Restaurant is 6% = "+tax);
		
	}
	}


class KFC extends Restaurant{

	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub
		double tax = 0.06;
		System.out.println("Taxe in KFC Restaurant is 6% = "+tax);
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("KFC Menu:");
	}
	
}

class main {

}
