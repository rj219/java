import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		while(num!=0)
		{
			int rem = num % 10;
			result = result*10+rem;
			num/=10;
		}
		
		System.out.println(result);
	}
}
