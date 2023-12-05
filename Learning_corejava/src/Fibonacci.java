import java.util.Scanner;
class fib_recurs
{
	int fib(int n)
	{
		if (n == 1 || n == 2)
		{
			return n-1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
}
public class Fibonacci {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		
		
		fib_recurs recurs = new fib_recurs();
		int result = recurs.fib(a);
		
		System.out.println(result);
	}

}
