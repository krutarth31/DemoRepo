package Practice;

public class PrimeNumberInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =18;
		int high = 50;
		
		while(num<=high) {
			boolean flag = false;
			
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(num);
			}
				num++;
			}
			
		}
	}
