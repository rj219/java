
public class Loop_program {
	public static void main(String_h args[])
	{
		int b;
		int c;
		
		for (int i=1; i<=5; i++)
		{
			for (b=i; b<=5; b++)
			{
				System.out.print(" ");
			}
			for(c=1; c<=i; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
