package Tut;

import java.util.Stack;

public class stac 

{
	
	public static void main(String args[])
	{
		
		Stack<Character> s=new Stack<Character>();
		String a="(((a+b)+{1+2+3}++(55))";
		for(int i=0;i<a.length();i++)
		{
			char q=a.charAt(i);
			
			if(q=='(' || q=='{' || q=='[')
			{
				s.push(q);
				
			}
			
				
				
				
			System.out.println(s);		
			
			}
			
		
		}
		
		
		
		
		
	}

}
