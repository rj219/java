package Collection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the email : ");
		String it = in.next();
		Pattern pet = Pattern.compile("^[A-Z][a-z][0-9]+@[a-z]+\\.[a-z]+$");
		Matcher match = pet.matcher(it);
		boolean b = match.matches();
		
		System.out.println(b);
		

		
	}

}
