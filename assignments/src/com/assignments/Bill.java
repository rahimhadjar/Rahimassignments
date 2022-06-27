package com.assignments;

//creating interface
public interface Bill {
	double calcBill(int units);
     void printBill(double amount);

}

//creating abstract class which implements the interface Bill
abstract  class Print implements Bill{

	public void printBill(double amount) {
		
		
	}
	
}

//creating class which inherits print class
class PowerBill extends Print{

	@Override
	
	 public double calcBill(int units) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
	
//creating class which inherits print class	
class WaterBill extends Print{

	@Override
	public double calcBill(int units) {
		// TODO Auto-generated method stub
		return 0;
	}
}
