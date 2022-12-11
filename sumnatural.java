package Tut;

import java.util.Scanner;

public class sumnatural 
{
	
	static int fac(int n)
	{
		
		if(n==0)
		{
			
			return 1;
		}
		else
		{
			return n+fac(n-1);
			
		}
		
		
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number :");
		n=sc.nextInt();
		System.out.println("The sum of " +n +" Natural  number is " +fac(n));
		
		System.out.println("-------------------------------------");
		
		System.out.println("");
		
		
	
		
		
	}

}
