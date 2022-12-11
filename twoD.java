package Tut;

public class twoD 
{
	
	public static void main(String args[])
	{
		
		
	int[][]	a= {
				{76,56,78,65,02 },
				{ 54,56,67,90,65},
				{45,02,01,58,45,14 },
				{97,23,48,46,15 },
				{45,25,15,54,89,88 }
				
		};
	for(int i=0;i<5;i++)
	{
		
	for(int j=0;j<5;j++)
	{
	System.out.print(a[i][j]+"  |  " );
	}	
	System.out.println(" ");
	}
	
	System.out.println("------------------------------------------------");
	
	int mini=0;
	int minj=0;
	int maxi=a.length-1;
	int maxj=a[0].length-1;
		
	int total=5*5;
	int cnt=0;
	while(cnt<total)
	{
		//left wall
		for(int i=mini,j=minj;i<=maxi && cnt<total ;i++)
		{
			System.out.println(a[i][j]);
			
		}
		cnt++;
		minj++;
		
		
		//bottom wall
		for(int i=maxi,j=minj;j<=maxj && cnt<total;j++)
		{
			System.out.println(a[i][j]);
			
		}
		cnt++;
		maxi--;
	}
			
		//right wall
		for(int j=maxj,i=maxi;i>=mini && cnt<total;i--)
		{
			System.out.println(a[i][j]);
		}
		cnt++;
		maxj--;
		
		
		//upper wall
		for(int i=mini,j=maxj;j>=minj && cnt<total;j--)
		{
			System.out.println(a[i][j]);
			
		}
		cnt++;
		mini++;
		
		
	}

}
