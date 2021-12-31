
public class OOPSConcept {

		int mod;
		int wheel;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OOPSConcept obj = new OOPSConcept();
		obj.mod =10;
		System.out.println(obj.mod);
		
		OOPSConcept obj1 = new OOPSConcept();
		obj1.mod = 12;
		System.out.println(obj1.mod);
		
		obj =obj1;
		
		System.out.println(obj.mod);
		
		obj.nike();
	}
	
	public void nike() {
		System.out.println("nike");
	}

}
