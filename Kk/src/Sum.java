import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the num : ");
		int num = sc.nextInt();
		System.out.print("Input the num1 : ");
		int num1 = sc.nextInt();
		
		int sum = num + num1;
		
		System.out.println("Sum of the num and num1 is : "+sum);
	}

}
