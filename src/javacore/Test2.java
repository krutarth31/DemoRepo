package javacore;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
			
		int i[] = {1,2,3,4};
		System.out.println(i.length);
		
		
		ArrayList<String> tools = new ArrayList<String>();
		tools.add("selenium");
		tools.add("Ketan");
	 
		System.out.println(tools.size());
		
		Object mix[] = {1, "Selenium"};
		System.out.println(mix.length);
		
		String x[][] = new String[2][3];
		System.out.println(x.length);
		System.out.println(x[0].length);
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.print(x[row][col]+"");
				
			}System.out.println();
		}
		
	}
}



