package collectiondiscusion;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDiscussion {
	
	public static void main(String[] args) {
		
	

	TreeSet<String> ts = new TreeSet<String>();
	ts.add("446677");
	ts.add("Delhi");
	ts.add("Kolkata");
	ts.add("Mumbai");
	ts.add("Pune");
	System.out.println(ts);
	
	TreeSet<Integer> ts1 = new TreeSet<Integer>();
	
	ts1.add(56);
	ts1.add(0);
	ts1.add(90);
	ts1.add(78);
	System.out.println(ts1);
	
	TreeSet<String> ts2 = new TreeSet<String>(new MyComp());
	ts2.add("34839");
	ts2.add("Delhi");
	ts2.add("Kolkata");
	ts2.add("mumbai");
	ts2.add("pune");
	ts2.add("bengaluru");
	
	ts2.add("pune");
	System.out.println(ts2);
	
	
	
	
}
}