package javapractice;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Krutarth");
		tools.add("BharatDada");
		tools.add("Ketan");
		tools.add("Chhaya");
		tools.add("Rahul");
		
		System.out.println(tools.size());
		
		tools.add("Patel");
		tools.add("Selenium");
		tools.remove(6);
		System.out.println(tools.get(0));
		
		for(int i=0;i<tools.size();i++) {
			System.out.println(tools.get(i));
		}
	}
		
		
}
