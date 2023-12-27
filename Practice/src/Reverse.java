import java.util.Scanner;

public class Reverse {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		int ans = 0;
//		String s = "";
		while(num>0)
		{
			 int rem = num % 10;
			
			ans = ans * 10 + rem;
//			s = s+rem;
			num/=10;
		}
		System.out.println(ans);
		
		
		
	}

}
