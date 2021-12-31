package Practice;

public class SumOfNaturalNumbbers {

	public static void main(String[] args) {
		
		int num = 100;
		int sum =0;
		
		for(int i=0;i<=num;i++) {
			sum = i + sum;
			
		}
		System.out.println(sum);
	
	
	//while loop
	
	int p=0;
	int sum1 = 0;
	while(p<=100) {
		sum1 = p + sum1;
		p++;
		
	}
	System.out.println(sum );

}
}