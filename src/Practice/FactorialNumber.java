package Practice;

public class FactorialNumber {

	public static void main(String[] args) {
		
		fact(10);
		}
	
	public static void fact(int i) {
		
		
		int factorial=1;
		
		for(int p=1;p<=i;p++) {
			factorial = p * factorial;
			
		}
		System.out.println(factorial);
		
	}

}
