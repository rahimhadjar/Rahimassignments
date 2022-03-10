package assignments;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int arr1[][]= { {1,2},{2,1} };
		
		

		for (int[] oa : arr1) {       
			
			for (int ia : oa) {
				System.out.print(ia+"\t");	
			}
			System.out.println();		
		}	
		
		System.out.println();		
		
		int arr2[][]= { {1,3,1},{1,1,2} };
		
            for (int[] oa : arr2) {       
			
			for (int ia : oa) {
				System.out.print(ia+"\t");	
			}
			System.out.println();
            }
            
            */
		
		
		byte arr3[][]= {{3,4},{50,10}}; 
		
		for (byte[] oa : arr3) {  //for main array (outer array->oa)
			for (byte ia : oa) {   //for inner arrays
				System.out.print(ia+"\t");
			}
			System.out.println();
		}
		
	}

}
