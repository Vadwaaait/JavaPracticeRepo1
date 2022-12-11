package Tut;
import java.util.*;



import java.sql.*;

public class JD
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/admin1";
		String uname="root";
		String Pass="12345";
		String query1="insert into haha values ('Sachin Tendulkar',10)";
		String query="select * from haha";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,Pass);
		Statement st=con.createStatement();
		
		st.executeQuery(query);
		
	
		int count=st.executeUpdate(query1);
		ResultSet rs= st.executeQuery(query);
		System.out.println(count +"row affected");
	while	(rs.next())
	{
		//String name= rs.getString("namee");
		System.out.println(rs.getInt("Rollnoo") + ":" + rs.getString("namee"));
	}	
	
		
		st.close();
		con.close();
	}

}
