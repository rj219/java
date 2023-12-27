import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Fileinput {
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		FileOutputStream fout = null;
		
		try {
			
			System.out.print("Enter the Name : ");
			String name  = in.next();
			
			
			fout = new FileOutputStream("D:\\"+name);
			
			
			System.out.println("Enter the Email ID : ");
			String s = in.next();
			//byte b[] = s.getBytes();
			
			System.out.println("Enter the password : ");
			String pass = in.next();
			String k = s+"\n"+pass;
			byte c[]=k.getBytes();
			
			
			
			
			fout.write(c);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		
		finally {
			try
			{
				fout.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
