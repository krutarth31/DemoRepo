package Practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 371;
		int rev=0;
		int actNum=num;
		while(num!=0) {
			int mod = num%10;
			rev=mod*mod*mod+rev;
			num=num/10;
		}
		System.out.println(rev);
		
		if(actNum==rev) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("not a armstring number");
		}
	}

}
