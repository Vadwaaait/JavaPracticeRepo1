package Tut;

public class araisetobrec {
	
	static int powww(int a, int b)
	{
	if(a==0 || b==0)
	{
		return 1;
		
	}
	else
	{
		return a*powww(a,b-1);
		
	}
		
	}
	
	public static void main(String args[])
	{
		int a=2;
		int b=3;
		System.out.println(powww(a,b));
		
	}

}
