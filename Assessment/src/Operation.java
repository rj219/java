import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale.Category;
import java.util.Scanner;

public class Operation {

	Scanner sc = new Scanner(System.in);
	Connection cn = null;

	String Uname = null;

	public boolean Log() {

		boolean b = false;
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");

			System.out.println("Enter the user name : ");
			Uname = sc.next();

			System.out.println("Enter the password : ");
			int pass = sc.nextInt();

			PreparedStatement ps = cn.prepareStatement("select * from Userdata where Uname=? and pass=?");

			ps.setString(1, Uname);
			ps.setInt(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = true;
			} else {
				b = false;

			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return b;

	}

	public void Addbook()
	{	
		String category = null;
		
		do {
		System.out.println("********Select Category********");
		System.out.println("1 : Computer");
		System.out.println("2 : Electronics");
		System.out.println("3 : Electrical");
		System.out.println("4 : Civil");
		System.out.println("5 : Mechanical");
		System.out.println("6 : Architecture");
		System.out.println("7 : Back to main menu");
		System.out.println("Enter category..");
		category = sc.next();
		if(category.equals("7"))
		{
			System.out.println("Back to main menu");
		}
		else
		{
		 System.out.println("Enter the book name : ");
		 String Bookname = sc.next();
		 System.out.println("Enter the author name : ");
		 String Author = sc.next();
		 System.out.println("Enter the Quantity: ");
		 int Quantity = sc.nextInt();
		 System.out.println("Enter the price : ");
		 double price = sc.nextDouble();
		 
		 
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
			 
			 ps.setInt(1, 0);
			 ps.setString(2, Bookname);
			 ps.setString(3, Author);
			 ps.setInt(4, Quantity);
			 ps.setDouble(5, price);
			 ps.setString(6, category);
			 
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
		}while(!category.equals("7"));
		
	}

	public void Deletebook() {
		System.out.println("Enter the Book name :- ");
		String Bookname = sc.next();

		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");
			PreparedStatement ps = cn.prepareStatement("delete from bookdata where Bookname=(?)");
			ps.setString(1, Bookname);

			int i = ps.executeUpdate();

			if (i > 0) {
				System.err.println("Book Deleted Successfully..!!!!!!");
			} else {
				System.out.println("Book not found..!!!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void Searchbook() {
		
			System.out.println("Enter the Book id:- ");
			int BookId = sc.nextInt();
		
			System.out.println("Enter the book name:-");
			String Bookname = sc.next();
		

		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");
			PreparedStatement ps = cn.prepareStatement("select * from bookdata where BookId=? and Bookname=?");
			ps.setInt(1, BookId);
			ps.setString(2, Bookname);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("BookId");
				String name = rs.getString("Bookname");
				String ah = rs.getString("Author");
				int qty = rs.getInt("Quantity");
				double pc = rs.getDouble("price");
				String cty = rs.getString("category");

				System.out.println(id + " " + name+" "+ah+" "+qty+" "+pc+" "+cty);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void Viewbook() {
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");
			Statement st = cn.createStatement();

			ResultSet rs = st.executeQuery("Select * from bookdata");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ rs.getDouble(5) + " " + rs.getString(6));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void editbook() {
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		System.out.println("Enter the book Id :- ");
		int BookId = sc.nextInt();

		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");
			PreparedStatement ps = cn.prepareStatement("update bookdata set Bookname=(?),Author=(?),Quantity=(?),price=(?),category=(?) where BookId=(?) ");
			System.out.println("Enter the new BookName:- ");
			String Bookname = sc.next();
			System.out.println("Enter the new Author namw :- ");
			String Author = sc.next();
			System.out.println("Enter the new Quantity:- ");
			int Quantity = sc.nextInt();
			System.out.println("Enter the new price:- ");
			double price = sc.nextDouble();
			System.out.println("Enter the new category :- ");
			String category = sc.next();
			ps.setString(1, Bookname);
			ps.setString(2, Author);
			ps.setInt(3, Quantity);
			ps.setDouble(4,price);
			ps.setString(5, category);
			ps.setInt(6, BookId);
			

			int i = ps.executeUpdate();

			if (i > 0) {
				System.out.println("Book updated Successfully...!!!!!");
			} else {
				System.out.println("Error..!!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void changepassword() {
		System.out.println("Enter new pass : ");
		String npass = sc.next();
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/Books", "root", "");
			PreparedStatement ps = cn.prepareStatement("update userdata set pass=? where Uname=?");
			ps.setString(1, npass);
			ps.setString(2, Uname);

			int i = ps.executeUpdate();

			if (i > 0) {
				System.out.println("password changed successfully !!!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
