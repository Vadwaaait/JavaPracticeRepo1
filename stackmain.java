package Tut;

public class stackmain {
	
	public static void main(String args[])
	{
		
		Stackk nums=new Stackk();
		nums.push(5);
		nums.push(50);
		nums.push(35);
		nums.push(80);
		nums.push(90);
		nums.show();
		System.out.println(nums.pop());  
	
		System.out.println("");
		nums.push(100);
		nums.show();
		nums.size();
	
	}

}
