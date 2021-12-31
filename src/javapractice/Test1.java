package javapractice;

public class Test1 {
	
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("I am in main method");
		printMe();
		scanMe();  
		t1.testMe();
		t1.useMe();
		Test2.blue();
		t2.red();
		Test3.circle();
		t3.sqaure();
		
		
		
		

	}
	
	public static void printMe() {
		System.out.println("print me");
	}
	
	public static void scanMe() {
		System.out.println("Scan me");
	}
	
	public void testMe() {
		System.out.println("Test me");
	}
	
	public void useMe() {
		System.out.println("use me");
	}

}
