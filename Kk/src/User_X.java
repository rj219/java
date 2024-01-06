import java.util.Scanner;

public class User_X {
	
	public static void main(String[] args) {
		
		int num = 0;
		int result = 0;
		String s = "";
		Scanner in = new Scanner(System.in);
		System.out.println("enter number : ");
		do
		{
		if(in.hasNextInt())
		{
			
			num = in.nextInt();
			result+=num;
		}
		else
		{
			s = in.next();
			
		}
		}while(!s.equals("x"));
		
		System.out.println(result);
		
		
		
//		System.out.print("Enter the num : ");
//		int i =1;
//		do
//		{
//			num = in.nextInt();
//			
//		}while(num != 'X');
//		
//		
//		if (num == 'X' || num == 'x')
//		{
//			System.out.println("Invalid input!!!!!!!!");
//		}
//		
//		 result += num;
//		System.out.println("Total sum is : " + result);
	}
}

//
//import java.util.Scanner;
//
//public class User_X {
//
//    public static void main(String[] args) {
//        int result = 0;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the num : ");
//        int num;
//
//        while (true) {
//            // Check if the input is an integer
//            if (in.hasNextInt()) {
//                num = in.nextInt();
//                result += num;
//            } else {
//                // If the input is not an integer, check if it's 'X' or 'x'
//                String input = in.next();
//                if (input.equalsIgnoreCase("X")) {
//                    break;
//                } else {
//                    System.out.println("Invalid input! Enter a valid number or 'X' to exit.");
//                }
//            }
//        }
//
//        System.out.println("Total sum is : " + result);
//        in.close();
//    }
//}
