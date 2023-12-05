import java.util.Scanner;

public class P9 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			for (int j=1; j<=a; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
