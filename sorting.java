package Tut;

public class sorting {
	
	public static void main(String args[])
	{
		int a[]= {5,65,2,4,8,6,45,45,454,45,45,45,45,546,54,56,70};
		
		for(int i=0;i<a.length;i++)
		{
			 for(int j=i;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int t =a[i];
					 a[i]=a[j];
					 a[j]=t;
					 
					 
				 }
				 
				 
			 }
			
		}
		
		for(int h:a)
		{
			
		System.out.println(h);	
		}
		
		
	}

}

