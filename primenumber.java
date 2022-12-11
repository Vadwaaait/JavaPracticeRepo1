package Tut;

import java.util.Scanner;

public class primenumber 
{
	public static void main(String arrgs[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("this number is divided by " +i);
				isprime=false;
				break;
				
			}
			
		}
		
		if(isprime)
		{
			System.out.println(n +" is a prime number");
			
		}
		else
		{
			
			System.out.println(n +" is not a prime number");
		}
		
	}

}
