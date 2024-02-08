package library;

import java.util.Scanner;

public class Main 
{

	Registration rc = new Registration();
	
	public static void main(String[] args) 
	{
	
		Login lg = new Login();
		boolean b = lg.Log();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		if(b)
		{
		do
		{
		System.out.println("Choose the required operation : ");
		System.out.println("0 : To exit.");
		System.out.println("1 : Add Book : ");
		System.out.println("2 : View Book : ");
		System.out.println("3 : Delete Book : ");
		System.out.println("4 : Issue Book : ");
		choice = sc.nextInt();
		
		Operations op = new Operations();
		
		switch(choice)
		{
		case 0 : System.out.println("Exit Successfully...");
		break;
		case 1 : op.addBook(); 
		break;
		case 2 : op.viewbook();;
		break;
		case 3 : op.deletebook();
		break;
		case 4 : op.issuebook();
		break;
		default :
		{
			System.out.println("Invalid choice....");
		}
		}
		}while(choice!=0);
		}
		else
		{
			System.out.println("Check the username and password : ");
		}
		sc.close();
	}

}
