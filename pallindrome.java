package Tut;

import java.util.Scanner;

public class pallindrome
{
	public static void main(String args[])
	{	int s=0,r;
	
		int n=1233;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		
			 
		}
		System.out.println(s);
		
		
		
	}
	

}
