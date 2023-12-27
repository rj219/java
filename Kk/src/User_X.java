import java.util.Scanner;

public class User_X {
	
	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the num : ");
		int i =1;
		do
		{
			num = in.nextInt();
		}while(num != 'X');
		
		
		if (num == 'X' || num == 'x')
		{
			System.out.println("Invalid input!!!!!!!!");
		}
		
		 result += num;
		System.out.println("Total sum is : " + result);
	}
}
