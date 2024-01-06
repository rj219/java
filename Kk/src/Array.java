import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[3][2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int row=0; row<arr.length; row++)
		{
			for(int colm=0; colm<arr[row].length; colm++)
			{
				arr[row][colm] = sc.nextInt();
			}
		}
//		for(int row=0; row<arr.length; row++)
//		{
//			for(int colm=0; colm<arr[row].length; colm++)
//			{
//				System.out.print(arr[row][colm]+" ");
//			}
//			System.out.println();
//		}
		
		for(int row=0; row<arr.length; row++)
		{
			System.out.println(Arrays.toString(arr[row]));
		}
		
	}

}
