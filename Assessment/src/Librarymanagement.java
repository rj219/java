import java.util.Scanner;

public class Librarymanagement {

	public static void main(String[] args) {
		Operation op = new Operation();
		boolean b = op.Log();
		int choice = 0;

		if (b) {
			do {
			
				Scanner in = new Scanner(System.in);

				System.out.println("***************Main Menu***************");
				System.out.println("1. Add Books:- ");
				System.out.println("2. Delete Book:- ");
				System.out.println("3.Search Book:- ");
				System.out.println("4.View Book List:- ");
				System.out.println("5.Edit Book Record:- ");
				System.out.println("6.Change Password:- ");
				System.out.println("7.Close Application:-");

				System.out.println("Enter Your choice :- ");
				choice = in.nextInt();

				switch (choice) {
				case 1:
					op.Addbook();
					break;
				case 2:
					op.Deletebook();
					break;
				case 3:
					op.Searchbook();
					break;
				case 4:
					op.Viewbook();
					break;
				case 5:
					op.editbook();
					break;
				case 6:
					op.changepassword();
					break;
				}
			} while (choice != 7);
		} else {
			System.out.println("Username and password wrong..!!!!!!");
		}
	}

}
