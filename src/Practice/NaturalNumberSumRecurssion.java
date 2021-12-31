package Practice;

public class NaturalNumberSumRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(addNum(5));
	}
	
	public static int addNum(int i) {
		if(i!=0) {
			return i+addNum(i-1);
		}else {
			return i;
		}
		
		
	}

}
