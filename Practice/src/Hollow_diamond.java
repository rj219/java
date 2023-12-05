import java.util.Scanner;
public class Hollow_diamond {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++)
		{
			for (int j=1; j<=i; j++)
			{
//				if(j%2==0 || i%2==0)
//				{
//					System.out.print("#");
//				}
//				else
//				{
//					System.out.print("*");
//				}
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
