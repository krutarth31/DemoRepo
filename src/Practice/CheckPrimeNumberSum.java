package Practice;

public class CheckPrimeNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPrimeNumber(4));
		int num=34;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(checkPrimeNumber(num-i)==false) {
				System.out.println(num+" = "+i+" "+(num-i));
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("can not");
		}
	}
		
		
		
	
	
	public static boolean checkPrimeNumber(int i) {
		boolean flag=false;
		
		for(int p=2;p<=i/2;p++) {
			if(i%p==0) {
				flag=true;
				break;
			}
			
		}
		
		return flag;
	}

}
