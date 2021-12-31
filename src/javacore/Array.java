package javacore;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num[][]= { 
				      {1,2,3,4},
				      {5,6,7,8}
		              };
		 
		 System.out.println(num[0][0]);
		 
//			for(int i=0;i<num.length;i++) {
//				for(int j=0;j<num[i].length
//						;j++) {
//					System.out.print(num[i][j]);
//				}System.out.println();		
		 
		 for(int[] a:num) {
			 
			 for(int k:a) {
				 System.out.print("  "+k);
			 }System.out.println();
			 
		 }
				
			}

	}
		 
		
	


