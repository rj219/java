import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Year : ");
		int year = in.nextInt();
		
		if (year % 4 == 0)
		{
			System.out.println(year + " Is Leap year");
		}
		else
		{
			System.out.println(year + " Is not leap year");
		}
	}
	
}
