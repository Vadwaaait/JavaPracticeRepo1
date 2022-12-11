package Tut;

import java.util.Scanner;

public class factoreccure {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		fact f=new fact();
		
		System.out.println(f.fact(number));
		
		
	}

}

class fact
{
	public int fact(int number)
	{
		if(number ==0 || number==1)
		{
			return 1;
			
		}
		else
		{
			return number* fact(number-1);	
			
		}
		
		
	}	
	
}
