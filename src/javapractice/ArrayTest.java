package javapractice;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tool="Selenium";
		System.out.println(tool);
		
		String tools[] = {"selenium","krutarth","ketan","rahul","chhaya","bharatdada"};
		System.out.println(tools.length);
		
		for(int i=0;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
		
		int number[] = {1,2,3,4,5};
		System.out.println(number.length);
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
			}
		
		Object mix[]= {1,"krutarth"};
		System.out.println(mix.length);
		for(int i=0;i<mix.length;i++) {
			System.out.println(mix[i]);
		}
		
	}

}
