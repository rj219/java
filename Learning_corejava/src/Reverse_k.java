class Reverse_k
{
	public static void main(String_h args[])
	{
		int i,j,k;
		
		for(i=5; i>=1; i--)
		{
			for(j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			for (k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=2; i<=5; i++)
		{
			for(j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (k=i; k>=1; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}