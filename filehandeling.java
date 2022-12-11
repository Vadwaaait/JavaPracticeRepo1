package Tut;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
public class filehandeling
{
	public static void main(String args[]) throws Exception
	{
			FileOutputStream fos=new FileOutputStream("data.txt");
			DataOutputStream dos =new DataOutputStream(fos);
			dos.writeUTF("Kasa Kaay PUNE ?");
			System.out.println("done dona done");
			
			
			FileInputStream fis =new FileInputStream("data.txt");
			DataInputStream dis=new DataInputStream(fis);
			String a=dis.readUTF();
			System.out.println(a);
	}

}
