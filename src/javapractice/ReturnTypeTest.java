package javapractice;

public class ReturnTypeTest {

	public static void main(String[] args) {
		sum();
		int i = sum1();
		System.out.println(i);
		String p = hello();
		System.out.println(p);
		
	}
	
	public static void sum() {
		int a = 5+5;
		
	}
	
	public static int sum1() {
		int b = 6+6;
		return b;
	}
		
	public static String hello() {
		String a = "selenium";
		return a;
	}
		
	}

