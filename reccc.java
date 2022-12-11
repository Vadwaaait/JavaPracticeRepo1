package Tut;

public class reccc
{
	
	static int printnaa(int n)
	{
		if(n==0)
		{
			return 1;
			
		}
		else
		{
		System.out.println(n +"  kasa ky pune");
		return printnaa(n-1);
		
		}
	}
	
	
	public static void main(String args[])
	{
		int n=5;
		printnaa(n);
		
	}

}
