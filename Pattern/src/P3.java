import java.util.Scanner;

public class P3 {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the value");
			int a = sc.nextInt();
			
			int starcount = a;
			
			for(int i=1; i<=a; i++)
			{
				for(int j=1; j<=starcount; j++)
				{
					System.out.print("*");
				}
				System.out.println();
				starcount--;
			}
		}
}
