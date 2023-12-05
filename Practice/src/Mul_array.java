import java.util.Scanner;

public class Mul_array {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter set : ");
		int set = sc.nextInt();
		System.out.println("Enter the value");
		int value = sc.nextInt();
		
		int a[][]= new int[set][value];
		int b[][]= new int[set][value];
		int c[][]= new int[set][value];
		
		for(int i=0; i<set; i++)
		{
			for(int j=0; j<value; j++)
			{
				System.out.print("Enter the vlaue of a : ");
				 a[i][j] = sc.nextInt();
				System.out.print("Enter the value of b : ");
				 b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i=0; i<set; i++)
		{
			for (int j=0; j<value; j++)
			{
				System.out.print(a[i][j]+" : "+b[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("***********************************");
		
//		for (int i=0; i<set; i++)
//		{
//			for (int j=0; j<value; j++)
//			{
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
