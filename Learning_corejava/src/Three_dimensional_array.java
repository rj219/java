
public class Three_dimensional_array {
	public static void main(String args[])
	{
		int num[][][] = new int [3][4][5];
		
		for(int i=0; i<3; i++)
		{
			for (int j=0; j<4; j++)
			{
				for (int k=0; k<5; k++)
				{
					num[i][j][k] = (int)(Math.random()*10);	
				}	
			}
		}
		
//		for (int n[][] : num )
//		{
//			for (int m : )
//			{
//				System.out.println(m);
//			}
//		}
	}
}
