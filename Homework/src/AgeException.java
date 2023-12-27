import java.util.Scanner;

class Age
{
	public void toVote(int age) throws Agenotvalid
	{
		if(age<18)
		{
			int Ag = 18 - age;
			throw new Agenotvalid(Ag);
		}
		else
		{
			System.out.println("You are eligible for votting...");
		}
	}
}
public class AgeException {
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		
		int age2 = in.nextInt();
		
		Age vott = new Age();
		
		try
		{
			vott.toVote(age2);
		}
		catch (Agenotvalid e)
		{
			e.printStackTrace();
			e.toAge();
		}
		
	}

}
