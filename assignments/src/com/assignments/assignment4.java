package com.assignments;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2[][]= {{1},{2,1,2},{3,2,1,2,3},{4,3,2,1,2,3,4},{5,4,3,2,1,2,3,4,5}};
		
		

		for (int[] oa : arr2) {       
			
			for (int ia : oa) {
				System.out.print(ia);	
			}
			System.out.println();		
		}
	}

}
