import java.util.Scanner;

public class Stringcom {
	
public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First string : ");
		String s = in.next();
		System.out.print("Enter the second string : ");
		String s1 = in.next();
		
		char c[] = s.toCharArray();
		char c1[] = s1.toCharArray();
		
		for( i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(c[j] < c[i])
				{
					Object temp = null;
					temp = c[i];
					c[i] = c[j];
					c[j] = (char) temp;
				}
				
			}
			System.out.print(c[i]);
			
			
		}
		
		System.out.println();
		
		for( i=0; i<s1.length(); i++)
		{
			for(int j=i+1; j<s1.length(); j++)
			{
				if(c1[j] < c1[i])
				{
					Object temp = null;
					temp = c1[i];
					c1[i] = c1[j];
					c1[j] = (char) temp;
				}
				
			}
			System.out.print(c1[i]);
		}
		int x = 0;
		for( i=0; i<c.length; i++)
		{
			if(c[i]!=c1[i])
			{
				x = 1;
			}
		}
		System.out.println();
		if(x==0)
		{
			System.out.println("Arma String");
		}
		else
		{
			System.out.println("Non-arma String");
		}
		
	}

}
