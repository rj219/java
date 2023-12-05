import java.util.Scanner;

public class P7 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		
		int spacecount = a-1;
		int mid = (a/2)+1;
		int starcount = 1;
		
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=spacecount; j++)
			{
				System.out.print(" ");
			}
				for(int k=1; k<=starcount; k++)
				{
					if(k==1 || k==starcount)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
				if(i<mid)
				{
					starcount+=2;
					spacecount--;
				}
				else
				{
					starcount-=2;
					spacecount++;
				}
		}
	}

}
