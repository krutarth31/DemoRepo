package OOPSPart2;

public class BankTest {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();  //static polymorphism
		hs.credit();
		hs.deposit();
		hs.hsbcM();
		hs.lend();
		
		ReserveBank rb = new HSBCBank(); //dynamic polymorphism
		rb.credit();
		rb.deposit();
		
		WorldBank wb = new HSBCBank();
		wb.lend();
		
		
		
	}

}
