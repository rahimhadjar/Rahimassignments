package com.assignments;

	


class BankA extends Bank{
	int deposit1=1000;
	int getBalance () {
		return deposit1;
	}
}

class BankB extends Bank{
	int deposit2=1500;
	int getBalance () {
		return deposit2;
	}
}

class BankC extends Bank{
	int deposit3=2000;
int getBalance () {
	return deposit3;
}
}




 class Bank {

	int getBalance (){
	return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//or>
//Bank obj;


//obj=new BankA();
//obj.getBalance();

//obj=new BankB();
//obj.getBalance();

//obj=new BankC();
//obj.getBalance();
		
			
		
		
	BankA banka=new BankA();

	BankB bankb=new BankB();
	
	BankC bankc=new BankC();
	
	System.out.println("the amount deposited in Bank A is:");
	System.out.println(banka.getBalance());
	
	System.out.println("the amount deposited in Bank B is:");
	System.out.println(bankb.getBalance());
	
	System.out.println("the amount deposited in Bank C is:");
	System.out.println(bankc.getBalance());
	
	}
			
}




	
