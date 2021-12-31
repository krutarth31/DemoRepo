package Practice;

public class PrimeOrNot {

	public static void main(String[] args) {
		
			int num =17;
			boolean flag = false;
			
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=true;
					break;
				}
					
			}
			if(!flag) {
				System.out.println("Prime number");
			}else {
				System.out.println("not Prime prime");
			}
	}
}
		