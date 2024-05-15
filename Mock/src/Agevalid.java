
public class Agevalid extends Exception
{
	int Ag;
	public Agevalid(int Ag)
	{
		this. Ag= Ag;
	}
	
	public void toAge()
	{
		System.out.println("You can vote after: "+ Ag);
	}
}
