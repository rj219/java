class Recurs
{
	public int rec(int number)
	{
		if(number == 1 || number == 2)
		return (number - 1);
		else
		{
			return (rec(number-1)+rec(number-2)); 
		}
	}
}
public class Fib_recursive {
	public static void main(String_h args[])
	{
		int num = 7;
		
		Recurs fib = new Recurs();
		int result = fib.rec(num);
		
		System.out.println(result);
	}

}
