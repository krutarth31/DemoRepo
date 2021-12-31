package javacore;

public class Operators {
	
	public static void main(String args[]) {
		int m = 5;
		int n =2;
		int k = m+n;
		int sub = m -n;
		double r = (double)m/n;
		int mul = m*n;
		
		System.out.println(k);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(r);
		
		
		if(m==0) {
			System.out.println("nothing");
		}else if(m%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
		//turnary 
		int j = m>10?1:2;
		System.out.println(j);
	}

}
