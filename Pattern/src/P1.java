import java.util.Scanner;
public class P1 {
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the co-ordinates : ");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=a; j++)
			{
				if(i==1||i==a||j==1||j==a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}

}
