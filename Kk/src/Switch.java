import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String ch = sc.next();
		
		switch(ch)
		{
		case "Mango":
		{
			System.out.println("King of the fruit");
			break;
		}
		case "Apple":
		{
			System.out.println("A Sweet red Fruit");
			break;
		}
		default:
		{
			System.out.println("Invalid input..!!!");
		}
		}
		sc.close();
	}

}
