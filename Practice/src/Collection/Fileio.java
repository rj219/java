package Collection;

import java.io.File;
import java.io.IOException;

public class Fileio {
	
	public static void main(String[] args) 
	{
		
		File fe = new File("D://jnak");
		
		if(fe.exists())
		{
			System.out.println("File Exist...");
			fe.delete();
		}
		else
		{
			System.out.println("File not found.....");
			try
			{
				fe.createNewFile();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
