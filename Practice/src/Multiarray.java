import java.util.Scanner;

public class Multiarray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter set : ");
		int set = sc.nextInt();
		System.out.println("Enter value : ");
		int value = sc.nextInt();
		int a[][]= new int[set][value];
		int b[][]= new int[set][value];
		int c[][]= new int[set][value];
		
		for(int i=0; i<set; i++)
		{
			for(int j=0; j<value; j++)
			{
				System.out.println("Enter the value for a  : ");
				a[i][j]=sc.nextInt();
				System.out.println("Enter the value for b  : ");
				b[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("***************************");
		
		for(int i=0; i<set; i++)
		{
			for(int j=0; j<value; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("***************************");
		
		for(int i=0; i<set; i++)
		{
			for(int j=0; j<value; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("***************************");
//		
//		for(int k[] : b)
//		{
//			for(int m : k)
//			{
//				System.out.print(m+" ");
//			}
//			System.out.println();
		
		for(int i=0; i<set; i++)
		{
			for(int j=0; j<value; j++)
			{
				    c[i][j]=0;
					for(int k=0; k<value; k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
					
					System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
