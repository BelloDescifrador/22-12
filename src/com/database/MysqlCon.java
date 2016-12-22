package com.database;
import java.sql.*;

public class MysqlCon {
	
	public Connection func(){
		Statement stmt=null;
		Connection con=null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","root");  
			//here sonoo is database name, root is username and password  
			stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from xyz");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
			
			}
			catch(Exception e)
			{
				System.out.println(e);
				}  
		  
	return con;
	}
}
