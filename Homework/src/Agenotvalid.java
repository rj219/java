
public class Agenotvalid  extends Exception
{
	int Ag;
	
	public Agenotvalid(int Ag)
	{
		this.Ag = Ag;
	}
	public void toAge() 
	{
		System.err.println("18 Year should be completed!!!!" + " After "+Ag+" You can vote ");
		
		
	}

}
