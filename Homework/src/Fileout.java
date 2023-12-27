import java.io.FileInputStream;
import java.io.IOException;

public class Fileout {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\xyz");
			int i = fis.read();
			
			while(i != -1)
			{
				char ch = (char)i;
				System.out.print(ch);
				i = fis.read();
			}
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fis.close();
			}
			catch (Exception e) {
					
				e.printStackTrace();
			}
		}
		
	}

}
