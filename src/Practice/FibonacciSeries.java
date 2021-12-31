package Practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int p = 0;
		int q = 1;
		int num=10;
		for(int i=1;i<=10;i++) {
			System.out.println(p);//1
			int sum = p+q; //2
			p=q;//2
			q=sum;//2
		}
	}
}
