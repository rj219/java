import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check whether the number is prime or not");
		int num = sc.nextInt();
		int c = 2;
		int flag = 0;
		
		while (c < num)
		{	
			if(num%c==0)
			{
				flag = 1;
				break;
			}
			c++;
		}
		if(flag == 1)
		{
			System.out.println("The num is non-prime"+num);
		}
		else
		{
			System.out.println("The num is prime"+num);
		}
	}
}
