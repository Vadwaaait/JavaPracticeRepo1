package Tut;

class hello extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Hello Ji");	
try{Thread.sleep(1000);} catch(Exception e) {}
}
}
}

class hi extends Thread
{
public void run()
{
for(int j=0;j<5;j++)
{
System.out.println("Hi ji");	

try{Thread.sleep(1000);} catch(Exception e) {}

}
}
}

public class Threaddemo {
	
	public static void main(String args[])
	{
		hello obj=new hello();
		hi obj1=new hi();
		obj.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		obj1.start();
		
	}

}
