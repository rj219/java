package Collection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {
	
	public static void main(String[] args)
	
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the email address : s");
		String s = in.nextLine();
		Pattern pet = Pattern.compile("^[A-Za-z0-9]+@[a-z]+\\.[a-z]+$");
		Matcher match = pet.matcher(s);
		boolean b = match.matches();
		System.out.println(b);
		
		
	}

}