package Collection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		try
		{
			fw = new FileWriter("D:\\jnk");
			String str = sc.next();
			fw.write(str);
			fw.flush();
			System.out.println("Done...");
			
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				fw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
