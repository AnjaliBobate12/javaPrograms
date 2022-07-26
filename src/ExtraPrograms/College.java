package ExtraPrograms;


public class College {

	String name;
	static String collagename;
	int mathsmarks;
	int age;
	static String collagecity;
	 String nativeplace;
	 
	 
	 public static void main(String[] args) {
		
		 College s1 = new College();
		 s1.name="shiv";
		 s1.mathsmarks=50;
		 s1.age=18;
		 s1.nativeplace="nagpur";
		 collagename="pote";
		 collagecity="amravati";
		 
		 
		 College s2 = new College();
		 s2.name="sharvari";
		 s2.mathsmarks=60;
		 s2.age=20;
		 s2.nativeplace="chanda";
		 collagename="VNIT";
		 collagecity="nagpur";
		 
		 
		 System.out.println(s1.name);
		 System.out.println(s2.age);
		 
		 
	}

}
