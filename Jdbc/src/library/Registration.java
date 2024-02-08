package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration
{

	public static void main(String[] args)
	{

		
		Connection cn = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Set the username : ");
		String User_name = sc.next();
		
		System.out.print("Set the Password : ");
		String pass = sc.next();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","");
			
			PreparedStatement ps = cn.prepareStatement("insert into login values(?,?,?)");
			
			ps.setInt(1, 0);
			ps.setString(2, User_name);
			ps.setString(3, pass);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Registration Successfully....");
			}
			else
			{
				System.out.println("Please try after again sometimes");
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}
