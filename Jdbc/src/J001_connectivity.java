import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J001_connectivity 
{
	
	public static void main(String[] args)
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded......");
			
			String url = "jdbc:mysql://localhost:3308/employ";
			String user = "root";
			String pass = "";
			
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established....");
			
			Statement st = cn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from employ_info");
			
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String dep = rs.getString(3);
				double sal = rs.getDouble(4);
				
				System.out.println(id+" "+name+" "+dep+" "+sal);
				
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
