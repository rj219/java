import java.util.Scanner;
class Primenum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : " );
		int a = sc.nextInt();
		int flag = 0;
		int num = 0;
		int i;
		
		for ( i=1; i<a; i++)
		{
			if(a%i == 0)
			{
				num=i;
				flag = 1;
			}
		}
		if(flag==0)
		{
			
			System.out.println(i+":"+"These are the prime number");
		}
		else
		{
			System.out.println(i+":"+"These are the non-prime number");
		}
		System.out.print(num);
	}
}