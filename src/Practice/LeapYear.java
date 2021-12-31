package Practice;

public class LeapYear {

	public static void main(String[] args) {

		int i = 1700;
		
		boolean leap = false;
		
		if(i%4==0) {
			if(i%100==0) {
				if(i%400==0) {
					leap = true;
				}else {
					leap = false;
				}
			}else{
				leap = true;
			}
		}else {
			leap = false;
		}
		
		if(leap) {
			System.out.println("leap year");
		}else
		{System.out.println("Not leap year");
		}
}
}