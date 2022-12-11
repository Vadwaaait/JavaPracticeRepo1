package Tut;
import java.util.*;
public class facto {
public static void main(String args[])
{
	int num;
	Scanner sc=new Scanner(System.in);
			
				num=sc.nextInt();
				
				factorial fa=new factorial();
				fa.fac(num);
			
}
}

class factorial
{
	public void fac(int num)
	{
		
		int fac=1;
		for(int i=num;i>0;i--)
		{
			fac=i*fac;
			
		}
		System.out.println(fac);
			

		
		
	}
}
