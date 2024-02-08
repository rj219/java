import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operation {
	
	Scanner sc = new Scanner(System.in);
	Connection cn = null;
	
	public void Addbook()
	{	
		 System.out.println("Enter the book name : ");
		 String Bookname = sc.next();
		 System.out.println("Enter the author name : ");
		 String Author = sc.next();
		 System.out.println("Enter the Quantity: ");
		 int Quantity = sc.nextInt();
		 System.out.println("Enter the price : ");
		 double price = sc.nextDouble();
		 System.out.println("Enter the product id : ");
		 int Pid = sc.nextInt();
		 
		try 
		{
			 cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/books","root","");
			PreparedStatement ps1 = cn.prepareStatement("select * from bookdata where Bookname=?");
			ps1.setString(1, Bookname);
			
			ResultSet rs = ps1.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Book alredy exists....!!!!!");
			}
			else
			{
			
			Class.forName("com.mysql.jdbc.Driver");
		
			
			 
			 PreparedStatement ps = cn.prepareStatement("insert into bookdata values (?,?,?,?,?,?)");
			 
			 ps.setInt(1, 1);
			 ps.setString(2, Bookname);
			 ps.setString(3, Author);
			 ps.setInt(4, Quantity);
			 ps.setDouble(5, price);
			 ps.setInt(6, Pid);
			 
			 int i = ps.executeUpdate();
			 
			 if(i>0)
			 {
				 System.out.println("Book Addedd...!!!!!!");
			 }
			 else
			 {
				 System.err.println("Error....");
			 }
			} 
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	public void Deletebook()
	{
		System.out.println("Enter the Book name :- ");
		String Bookname = sc.next();
		
		try 
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books","root","");
			PreparedStatement ps = cn.prepareStatement("delete from bookdata where Bookname=(?)");
			ps.setString(1, Bookname);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.err.println("Book Deleted Successfully..!!!!!!");
			}
			else
				{
					System.out.println("Book not found..!!!!");
				} 
			}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void Searchbook()
	{
		int choice=0;
		int Bookid=0;
		String Bookname="";
		if(choice==1)
		{
			System.out.println("Enter the Book id:- ");
			 Bookid = sc.nextInt();
		}
		else if(choice==2)
		{
			System.out.println("Enter the book name:-");
			 Bookname = sc.next();
		}
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books","root","");
			PreparedStatement ps = cn.prepareStatement("select Bookid=(?),bookname=(?) from bookdata");
			ps.setInt(1, Bookid);
			ps.setString(2, Bookname);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
			int id = rs.getInt(Bookid);
			String name = rs.getString(Bookname);
			
			System.out.println(id+" "+name);
			}
			
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void Viewbook()
	{	
			try 
			{
				cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books","root","");
				Statement st = cn.createStatement();
				
				ResultSet rs = st.executeQuery("Select * from bookdata");
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+rs.getDouble(5)+" "+rs.getInt(6));
				}
			}
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		
	}
	public void editbook()
	{
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books","root","");
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		System.out.println("Enter the book name :- ");
		String Bookname = sc.next();
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books","root","");
			PreparedStatement ps = cn.prepareStatement("update bookdata set bookname=(?) where bookname=(?) ");
			ps.setString(1, Bookname);
			System.out.println("Enter the new Bookname:- ");
			 Bookname = sc.next();
			ps.setString(2, Bookname);
			System.out.println(Bookname);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Book updated Successfully...!!!!!");
			}
			else
			{
				System.out.println("Error..!!");
			}
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
		
	}
	public void changepassword()
	{
		
	}

}
