package Tut;


abstract class A{
	
	abstract public void show();
	 public void config()
	{
		System.out.println("Kasa kaay MUMBAIIIIII ???");
		
	}
}

class B extends A{
	
	public void show()
	{
		System.out.println("Kasa ky PUNEEEEEE ???");
		
	}
}

public class abstactaa {
public static void main(String args[])
{
	
	A q=new B();
	q.config();
	q.show();
	
	
}
}
