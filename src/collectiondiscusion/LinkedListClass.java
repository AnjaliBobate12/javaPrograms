package collectiondiscusion;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(45);
		ll.add(50);
		ll.add(60);
		System.out.println(ll);
//		ll.remove(0);
//		System.out.println(ll);
//		ll.set(0, 656);
//		System.out.println(ll);
//		ll.get(0);
//		System.out.println(ll);
//	
		
		ll.add(null);
		ll.add(45);
		System.out.println(ll);
	
		
			Vector<String> v = new Vector<String>();
			v.add("abc");
			v.add(null);
			v.add("abc");
			System.out.println(v);
	}
}
