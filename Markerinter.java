package Tut;

interface I
{
	
}

class Qq implements I
{
public void show()
{ 
System.out.println("In classs A");	
}
}

public class Markerinter 
{
	public static void main(String args[])
	{
	Qq obj=new Qq();
	if(obj instanceof I)
	{
		obj.show();
		
	}
	else
	{
		System.out.println("Permission Not granted");
		
	}
		
	}

}
