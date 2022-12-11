package Tut;

import java.util.Scanner;

public class binsearch {

	public static void main(String args[]) 
	{
		
		
int a[]= {10,20,30,35,40,45,48,50,60,65,66,69,70,80,86,89,90,95,99,100};
int search=90;
int low=0;
int high=a.length-1;


while(low<=high)
{
	int mid=(low + high)/2;
	
	if(search>a[mid])
	{
		
		low=mid+1;
	}
	else if(search<a[mid])
	{
		high=mid-1;
		
	}
	else 
	{
	System.out.println(mid);
	return;
		
	}
	
	
	}

System.out.println(-1);

		
		
	}
	
}
