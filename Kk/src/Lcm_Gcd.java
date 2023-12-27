import java.util.Scanner;

public class Lcm_Gcd {

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num = in.nextInt();
		System.out.println("Enter the second number : ");
		int num1 = in.nextInt();
		
		int lcm = (num > num1) ? num : num1;
		
		while (true)
		{
			if (lcm % num == 0 && lcm % num1 == 0)
			{
				System.out.println("LCM of two number is : " + lcm);
				break;
			}
			lcm++;
		}
		
		while(num != num1)
		{
			if(num > num1)
			{
				num -= num1;
			}
			if(num < num1)
			{
				num1 -= num;
			}
		}
		
		System.out.println("HCF of enterd value is : " + num);
		
	}
	
}
