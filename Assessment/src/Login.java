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
	Scanner sc = new Scanner(System.in);
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books","root","");
		
		System.out.println("Enter the user name : ");
		String Uname = sc.next();
		
		System.out.println("Enter the password : ");
		int pass = sc.nextInt();
		
		PreparedStatement ps = cn.prepareStatement("select * from Userdata where Uname=? and pass=?");
		
		ps.setString(1, Uname);
		ps.setInt(2, pass);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			b=true;
		}
		else
		{
			b=false;
			
		}
	}
	catch (ClassNotFoundException | SQLException e)
	{
		
		e.printStackTrace();
	}
	return b;
	
	}
			
	

}
