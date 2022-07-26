package collectiondiscusion;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Delhi");
		hs.add("Kolkata");
		hs.add("Mumbai");
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		hs.add("pune");
		System.out.println(hs);
		
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Delhi");
		lhs.add("Kolkata");
		lhs.add("Mumbai");
		lhs.add("Pune");
		lhs.add("Bengaluru");
		lhs.add(null);
		lhs.add(null);
		lhs.add("nagpur");
		System.out.println(lhs);
		
	}
}
