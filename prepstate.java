package Tut;
import java.util.*;



import java.sql.*;

public class prepstate
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/admin1";
		String uname="root";
		String Pass="12345";
		String namee="Ricky Ponting";
		int rollnoo=49;
		String query1="insert into haha values (?,?)";
		String query="select * from haha";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,Pass);
		PreparedStatement stt=con.prepareStatement(query1);
		
		stt.setString(1, namee);
		stt.setInt(2, rollnoo);
		
	
		int count=stt.executeUpdate();
		ResultSet rs= stt.executeQuery(query); 
		System.out.println(count +"row affected");
	while	(rs.next())
	{
		//String name= rs.getString("namee");
		System.out.println(rs.getInt("Rollnoo") + ":" + rs.getString("namee"));
	}	
	
		
		stt.close();
		con.close();
	}

}
