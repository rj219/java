import java.util.Scanner;

public class Prime {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number : ");
//		int num = sc.nextInt();
		
//		boolean ans = isprime(num);
//		System.out.println(ans);
//		
//		for(int i=1; i<=num; i++)
//		{
//			if(isprime(i))
//			{
//				System.out.println(i+" ");
//			}
//		}
		
		for(int i=100; i<1000; i++)
		{
			if(isArmstrong(i))
			{
				System.out.print(i+" ");
			}
		}
		
		
		
	}
	static boolean isArmstrong(int num)
	{
		int original = num;
		int sum = 0;
		while(num>0)
		{
		int rem = num % 10;
		num/=10;
		sum += rem * rem * rem;
		}
		
		return original==sum;
	}
	
	static boolean isprime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		int c = 2;
		
		while(c * c <= num)
		{
			if(num % c == 0)
			{
				return false;
			}
			c++;
		}
		return  c * c > num;
	}
}
