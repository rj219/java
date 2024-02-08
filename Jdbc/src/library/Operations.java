package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Operations 
{
	Connection cn = null;
	public  Operations()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
	Scanner in = new Scanner(System.in);
	public void addBook()
	{
		System.out.println("Enter the id : ");
		int id = in.nextInt();
		System.out.println("Enter the Book Name : ");
		String name = in.next();
		System.out.println("Enter the Book price : ");
		double price = in.nextDouble();
		System.out.println("Enter the quantity : ");
		int qty = in.nextInt();
		
		try {
			
			PreparedStatement pre = cn.prepareStatement("select * from BookData where name=?");
			pre.setString(1, name);
			ResultSet rs = pre.executeQuery();
			if(rs.next())
			{
				System.out.println("Book Already Exist...");
			}
			else
			{
			PreparedStatement ps =  cn.prepareStatement("insert into BookData values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, price);
			ps.setInt(4, qty);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Book Added....");
			}
			}
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
	}
	public void viewbook()
	{
		
		try {
			PreparedStatement ps = cn.prepareStatement("Select * from Bookdata");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
	}
	public void deletebook()
	{
		System.out.println("Enter the book name : ");
		String name = in.next();
		try
		{
			PreparedStatement ps = cn.prepareStatement("delete  from BookData where name=?");
			ps.setString(1, name);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Book Deleted....");
			}
			else
			{
				System.out.println("Book Not found....");
			}
			
		} 
		catch (SQLException e) {
			
			System.out.println("Book not found...");
		}
	}
	public void issuebook()
	{
		System.out.println("Enter the book name to issue....");
		String name = in.next();
		
		PreparedStatement ps;
		
		try
		{
			ps = cn.prepareStatement("select * from BookData where name = ?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int qty = rs.getInt(4);
				if(qty==0)
				{
					System.out.println("Currently book not available......");
				}
				else
				{
					qty = qty-1;
					PreparedStatement ps1 = cn.prepareStatement("update Bookdata set=? where name=?");
					ps1.setInt(1, qty);
					ps1.setString(2, name);
					
					int i = ps1.executeUpdate();
					if(i>0)
					{
						System.out.println("Book Issued....");
					}
				}
			}
			else
			{
				System.out.println("Book not found.....");
			}
		} 
		catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
