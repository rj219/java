package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login 
{
	public boolean Log()
	{
		boolean b = false;
		Scanner in = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","");
			
			
			System.out.println("Enter the User_name: ");
			String User_name = in.next();
			System.out.println("Enter the password : ");
			String Pass = in.next();
			PreparedStatement st = cn.prepareStatement("select * from login where User_name = ? and Pass = ?");
			st.setString(1, User_name);
			st.setString(2, Pass);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				b= true;
			}
			else
			{
				b=false;
				System.out.println("Invalid User_name and Password.......");
			}
			
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
		
		return b;
	
	}
}
