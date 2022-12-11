package Tut;

import java.util.Scanner;

public class Ana1 

{
	
	public static void main(String args[])
	{
		String a[]=new String[2];
		Scanner sc=new Scanner(System.in);
		a[0]=sc.next();
		a[1]=sc.next();
		
		long sum[]= {1,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length();k++)
			{
			char j=a[i].charAt(k);
			
			sum[i]*=j-64;
			
			
			
			}
			System.out.println(sum[i]%47 +" ");
			
			}
		
		if(sum[0]%47 == sum[1]%47)
		{
			
			System.out.println("Chosen");
		}
		else
		{
			System.out.println("Not Choosen");
			
		}
		}
		
	}


