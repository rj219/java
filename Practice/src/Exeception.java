import java.util.Scanner;

public class Exeception {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = in.nextInt();
		
		try {
			int result = num/0;
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("Program ended!!!!!!");
		
	}

}
