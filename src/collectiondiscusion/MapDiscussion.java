package collectiondiscusion;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDiscussion {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Delhi");
		hm.put(506, "Pune");
		hm.put(201, "Delhi");
		hm.put(900, "Bengaluru");
		
		System.out.println(hm);
		
		Collection<String> v = hm.values(); // to get all the values
		System.out.println(v);
		
		String val = hm.get(506);
		System.out.println(val);
		
		boolean iskeypresent = hm.containsKey(101);
		System.out.println(iskeypresent);
		
		boolean isvaluepresent = hm.containsValue("Bengaluru");
		System.out.println(isvaluepresent);
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(101, "Delhi");
		lhm.put(102, "Pune");
		lhm.put(103, "Delhi");
		lhm.put(104, "Bengaluru");
		System.out.println(lhm);
	
	}
}
