package javamethods;


public class StudentRollNo {
	static int rollno=0;
	String name;
	String sub;
	int Rollno;
	public int m1()
	{
		 rollno = rollno+1;
		 
		return rollno;
		
	}
	
	public static void main(String[] args) {
		StudentRollNo s1 = new StudentRollNo();
		s1.name="hari";
		s1.sub="maths";
		s1.rollno=s1.m1();
		StudentRollNo s2= new StudentRollNo();
		s2.name="raj";
		s2.sub="civil";
		s2.rollno=s2.rollno;
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		
		

						
		
		
	}

}
