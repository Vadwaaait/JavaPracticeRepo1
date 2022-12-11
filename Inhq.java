package Tut;

public class Inhq {

	public static void main(String args[])
	{
		kkk cc=new child();
		cc.kasa(10);
		
	}
	
	
}

class kkk
{

	public void kasa(int aa)
	{
		System.out.println(aa);
		
	}
}

class child extends kkk
{
	
	public void kasa(double aa)
	{
		System.out.println(aa);
		
	}
	
}