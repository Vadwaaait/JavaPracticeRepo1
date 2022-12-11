package Tut;

class hello11 implements Runnable
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

class hi11 extends Thread
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

public class ThreadusingInterface{
	
	public static void main(String args[])
	{
		Runnable obj=new hello11();
	Runnable obj1=new hi11();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
	}

}
