class parent 
{
	public void Dance()
	{
		System.out.println("Dancing...");
	}
	
	public String Food(int cost)
	{
		if (cost >=499)
		{
		return "Food";
		}
		else
		{
		return "Nothing";
		}
	}
}
public class Me_thod {
	public static void main(String_h args[])
	{
		parent par = new parent();
		
		par.Dance();
		String str = par.Food(500);
		System.out.println(str);
	}

}
