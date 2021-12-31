package OOPSPart2;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArraylListAndHashTable {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("krutarth");
		al.add(1);
		al.add("Rahul");
		al.remove(1);
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		for(Object a:al) {
			System.out.println(a);
		}
		
		Hashtable h = new Hashtable();
		h.put(1, "Rahul");
		h.put("ketan", 1);
		
		System.out.println(h.get("ketan"));
		System.out.println(h.get(1));
		
		Hashtable<String,Integer> h1 = new Hashtable<String,Integer>();
		h1.put("Ketan", 1);
		System.out.println(h1.get("Ketan"));
		System.out.println(h.size());
		
		
	}

}
