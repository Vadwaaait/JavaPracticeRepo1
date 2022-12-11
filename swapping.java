package Tut;

public class swapping 
{
	public static void main(String args[])
	{
		int a=5;
		int b=8;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		/* int temp;
		temp=a;
		a=b;
		b=temp; */
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("------------------");
		System.out.println("after swapping");
		System.out.println("------------------");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
