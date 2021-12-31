package OOPSPart2;

public class HSBCBank implements ReserveBank, WorldBank{
	
	public void credit() {
		System.out.println("HSBC Credit");
	}
	
	public void deposit() {
		System.out.println("HSBC Deposit");
	}
	
	public void hsbcM() {
		System.out.println("HSBC Method");
	}
	
	public void lend() {
		System.out.println("HSBC Lend");
	}
}
