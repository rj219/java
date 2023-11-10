
public class Jagged_arrays {
	
	public static void main(String_h args[])
	{
		int numb[][] = new int [3][]; //Jagged array
		
		numb[0] = new int [3];
		numb[1] = new int [4];
		numb[2] = new int [2];
		
		for(int i=0; i<numb.length; i++)
		{
			for (int j=0; j<numb[i].length; j++)
			{
				numb[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int n[] : numb)
		{
			for (int m : n)
			{
				System.out.print(m);
			}
			System.out.println();
		}
	}

}
