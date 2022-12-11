package Tut;

public class QueueMain 
{

	public static void main(String args[])
	{
		Queues q=new Queues();
		q.push(5);
		q.push(35);
		q.push(25);
		q.push(27);
		q.push(94);
		
		q.shows();
		q.pop();
		q.shows();
		
	}
	
	
}
