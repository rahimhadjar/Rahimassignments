
package com.assignments;


	
	public class BaseClass{
		
	    public String getFood(){
	        return "food";
	    }
	}

	
	
	
      class SubClass extends BaseClass{

		
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass sub=new SubClass();
		System.out.println(sub.getFood());
			;
	}
}
