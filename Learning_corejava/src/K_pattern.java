class K_pattern
{
	public static void main(String_h args[])
	{
		int i , j, k;
		
		for (i=1; i<=5; i++)
		{
			for (j=i; j<=5; j++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
		
		for(i=2; i<=5; i++)
		{
			for (j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}