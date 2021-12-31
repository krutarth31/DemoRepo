package Practice;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
	int num= 1;
	int counter = 0;
	
	while(num!=0) {
		num=num/10;
		counter++;
	}
	
	System.out.println("Number of digits: "+counter );
	
	}
}