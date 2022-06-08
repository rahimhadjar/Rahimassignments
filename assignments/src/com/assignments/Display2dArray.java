package com.assignments;

public class Display2dArray {

	public static void main(String[] args) {
		
		int arr1[][]= {{1},{2,1,2},{3,2,1,2,3},{4,3,2,1,2,3,4},{5,4,3,2,1,2,3,4,5}};  //2-D
		
		
		for (int outer[] : arr1) {  
			for (int inner : outer) {  
				System.out.print(inner+" ");
			}
			System.out.println();
		}
		
	}

}
