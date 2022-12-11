package Tut;




public class thiskey {

	
	public static void main(String args[])
	{
		students s=new students(11,"Sahajamalina Atubaa");
		System.out.println(s.name);
		System.out.println(s.roll);
	
	}
}

class students{
	int roll;
	String name;
	
	public students(int roll, String name) {
		// TODO Auto-generated constructor stub
		
		this.roll=roll;
		this.name=name;
	}


	
}
