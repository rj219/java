import java.util.Scanner;

public class P5 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		
		int spacecount = a-1;
		int starcount = 1;
		
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=spacecount; j++)
			{
				System.out.print(" ");
			}
				for(int k=1; k<=starcount; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
				spacecount--;
				starcount++;
		}
	}

}
