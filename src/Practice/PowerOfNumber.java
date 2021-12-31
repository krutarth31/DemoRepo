package Practice;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =10;
		int power = 2;
		long result =1;
		
		while(power!=0) {
			result = result * num;
			power--; 
		}
		System.out.println(result);
		
	}}