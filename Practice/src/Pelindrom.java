import java.util.Scanner;
public class Pelindrom {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int a = sc.nextInt();
		
		int Original = a;
		int reminder;
		int reverse = 0;
		while(a!=0)
		{
			reminder = a%10;
			reverse = reverse*10+reminder;
			 a /= 10;
			
		}
		if(reverse == Original)
		{
			System.out.println("The number is Palindrom");
		}
		else
		{
			System.out.println("The number is not palindrom");
		}
	}

}
