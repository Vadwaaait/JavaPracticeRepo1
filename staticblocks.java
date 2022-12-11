package Tut;

public class staticblocks {
	
	public static void main(String args[]) throws Exception	{
		
		
	 abc q=new abc();
		
	}

}

class abc{
	//static block
	static
	{
		System.out.println("In static block");
		
	}
	
	//instance
	{
		System.out.println("In instance block");
		
	}
	
}
