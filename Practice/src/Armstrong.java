import java.util.Scanner;
public class Armstrong {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Number");
		int a = sc.nextInt();
		
		int num = a;
		int reminder;
		int result = 0;
		
		while(a!=0)
		{
			reminder = a % 10;
			
			result += reminder*reminder*reminder;
			
			a/=10;
		}
		if (num == result)
		{
			System.out.println("The number is armstrong number");
		}
		else
		{
			System.out.println("The number is non-armstrong number");
		}
	}

}
