package Tut;

import Tut.aaa.aaq;

interface aaa
{
public void show();


class aaq implements aaa
{
	public void show()
	{
		System.out.println("show method");
		
	}
	
	
}
}



public class interfacee{
	public static void main(String args[])
	{
		aaq a=new aaq();
		a.show();
		
	}

}
