package assignments;

import java.util.Scanner;

public class matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("first matrice:");
	
		int matrice1[][]= {{1,2,3},{4,8,3}};
		for (int[] oa : matrice1) {
			for (int ia : oa) {
				System.out.print(ia+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("second matrice:");
		int matrice2[][]={{3,2,1},{7,1,3},{9,4,5}};
		for (int[] oa : matrice2) {
			for (int ia : oa) {
				System.out.print(ia+"\t");
			}
			System.out.println();
		}
		System.out.println("The matrix product resulting is:");
		System.out.println();
		int[][] mat3=new int[2][3];
		//multiplication
				for(int i=0; i<2; i++){
					for(int j=0; j<3; j++){ 
						mat3[i][j] = 0;    
						for(int k=0; k<3 ;k++)    
						{ 
							mat3[i][j] += matrice1[i][k] * matrice2[k][j];    
						}
						System.out.print(mat3[i][j]+" "); 
					}
					System.out.println();
				}  


		
	
	
		
		
	
	}
}
