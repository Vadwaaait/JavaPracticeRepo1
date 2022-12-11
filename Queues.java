package Tut;
import java.util.*;

public class Queues 
{
	
	int a[]=new int[5];
	int top=5;
	int start=0;
	int first=0;
	public void push(int data)
	 {
		try {
	a[start]=data;
		}
		catch(Exception e)
		{
			
			System.out.println("bhai queue full hai");
		}
	start++;
		
	String starta=Integer.toString(start);
	String topa=Integer.toString(top);
	if(starta.equals(topa))
	{
		System.out.println("Queue is full");
		
	}
	}
	
	
	public void pop()
	{	
		a[start]=a[start];
		
	}

	

	public void shows() {
		for (int n: a)
		{
			System.out.println(n);
			
		}
		
	}
	

}
