package Tut;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatecount  {
	public static void main(String args[]) throws Exception
	{
		String a="aata kasa vattay ?  ";
		char q[]=a.toCharArray();
		
		Map<Character,Integer> m= new HashMap<>();
		
		for(Character ch : q)
		{
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch) + 1);
				 
				
			}
			else
			{
				m.put(ch, 1);
				
			}
			
		}
		
		
		Set<Character> keysss=m.keySet();
		for (Character cha : keysss) {
			System.out.println("character : " +cha + "      Count : " +m.get(cha) );
			
		}
	}

}
