package Tut;

public class LList 
{

	Node1 head;
	
	public void insert(int data)
	{
		Node1 node=new Node1();
		node.data=data;
		node.next=null;
		
		if(head == null)
		{
			head=node;
			
		}
		else
		{
			Node1 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				
			}
			temp.next =node;
			
		}
		
	}
	
	public void show()
	{
		
		Node1 tempp=head;
		while(tempp.next!=null)
		{
			System.out.println(tempp.data);
			tempp=tempp.next;
			
		}
	}
	
}
