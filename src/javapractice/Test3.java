package javapractice;

import selenium.Test4;

public class Test3 {
	
	static Test3 t3 = new Test3();
	static Test1 t1 = new Test1();
	static Test4 t4 = new Test4();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle();
		t3.sqaure();
		Test1.printMe();
		t1.useMe();
		Test4.audi();
		t4.bmw();
		
		
		
		

	}
	
	public static void circle() {
		System.out.println("circle");
	}
	
	public void sqaure() {
		System.out.println("square");
	}

}
