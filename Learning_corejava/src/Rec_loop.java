class first
{
	public int Loop()
	{
		int i;
		int j;
	
	for (i=1; i<=5; i++)
	{
		for (j=1; j<=i; j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	return 0;
	}
}

class second
{
	public int Loop()
	{
		int i;
		int j;
		int l;
		
		for (i=1; i<=5; i++)
		{
			for (j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			for(l=1; l<=i; l++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		return 0;
	}
}
public class Rec_loop {
	public static void main(String_h args[])
	{
		first obj = new first();
		obj.Loop();
		second obj1 = new second();
		obj1.Loop();
	}

}
