package Tut;


class parent
{
	public void show()
	{
		System.out.println("In Parent");
		
	}
	
}
class childd extends parent
{
	public void show()
	{
		System.out.println("In child");
		
	}
	
}



public class inh {
	
	public static void main(String args[])
	{
		
		parent c=new parent();
		c.show();
	}

}
