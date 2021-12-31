package javapractice;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(4,5));
		sum(1,1,1);
	}
	
	public static int sum(int p, int q) {
		int a=p+q;
		return a;
	}
	
	public static void sum(int p, int q, int r) {
		int z = p+q+r;
		System.out.println(z);
	}

}
