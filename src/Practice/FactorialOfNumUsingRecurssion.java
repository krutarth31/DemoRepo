package Practice;

public class FactorialOfNumUsingRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factNum(2));
	}
	
	public static int factNum(int i) {
		if(i!=0) {
			return i*factNum(i-1);
		}else {
			return 1;
		}
	}

}
