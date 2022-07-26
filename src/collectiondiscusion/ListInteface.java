package collectiondiscusion;

import java.util.ArrayList;

public class ListInteface {

	
	public static void main(String[] args) {
	
//		ArrayList al = new ArrayList<String>();
//		
//		al.add(50);
//		al.add("abc");
//		al.add(true);
//		System.out.println(al);
//		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("abc");
		al2.add("def");
		al2.add("ghi");
		al2.add("syz");
		al2.add(null);
		al2.add("abc");
		System.out.println(al2);
		
		al2.remove(0);
		System.out.println(al2);
		
		al2.set(1, "wxy");
		System.out.println(al2);
		al2.add("tuv");
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.add("Delhi");
		al3.add("Mumbai");
		al3.add("Kolkata");
		al3.add("Pune");
		System.out.println(al3);
		
		al3.addAll(al2);
		System.out.println(al3);
		
		// to check whether all the elements from al2 is present inside al3 or not/////
		
		boolean ispresent = al3.containsAll(al2);
		System.out.println(ispresent);
		
		//to remove all the elements of al2 from al3/////
		al3.removeAll(al2);
		System.out.println(al3);
		
		String value = al3.get(1);
		System.out.println(value);
		
	}
}
