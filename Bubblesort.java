package Tut;

public class Bubblesort 
{
	public static void main(String args[])
	{
	int a[]= {54,45,54,6,5,8,4,65,48,1,55,51,35,84,51};
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
		}
		
	}
	
	for(int i=0;i<a.length-1;i++)
	{
		System.out.println(a[i]);
		
	}
	
	}

}
