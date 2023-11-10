class M_array
{
	public static void main(String_h args[])
	{
		int number[][] = new int [3][4];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				number[i][j]=(int)(Math.random()*10);
			}
		}
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<4; j++)
			{
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int n[] : number)
		{
			for (int m : n)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}