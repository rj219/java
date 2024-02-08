import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {
	
	public Registration()
	{
		Scanner in = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Book","root","");
			
			System.out.println("Enter the Username :- ");
			String Uname = in.next();
			
			System.out.println("Enter the password:- ");
			int pass = in.nextInt();
			
			PreparedStatement ps = cn.prepareStatement("insert into userdata where uname=(?),pass=(?)");
			
			ps.setString(1, Uname);
			ps.setInt(2, pass);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Registration Successfull......");
			}
			else
			{
				System.out.println("PLease try after sometimes....");
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
	}

}
