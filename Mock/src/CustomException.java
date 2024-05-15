import java.util.Scanner;

class Vote
{
	public void toAge(int age) throws Agevalid
	{
		
		if(age<18)
		{
			int Ag = 18-age;
			throw new Agevalid(Ag);
		}
		else
		{
			System.out.println("You are Eligible for Votting......");
		}
		
	}
}
public class CustomException 
{
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age:- ");
		int age = sc.nextInt();
		
		Vote vt = new Vote();
		try 
		{
			vt.toAge(age);
		} catch (Agevalid e)
		{
			e.printStackTrace();
			e.toAge();
		}
		
	}
}
