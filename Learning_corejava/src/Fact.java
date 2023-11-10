class rec_fact
{
	public int Fact(int n)
	{
		if (n == 0 || n ==1)
		{
			return 1;
		}
		else
		{
			return (n*Fact(n-1));
		}
	}
}
public class Fact {
	
	public static void main(String_h args[])
	{
		int num = 5;
		
		rec_fact fac = new rec_fact();
		int result = fac.Fact(num);
		
		System.out.println(result);
	}

}
