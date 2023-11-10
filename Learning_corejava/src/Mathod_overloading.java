class Calcy
{
	public int add(int num1 , int num2)
	{
		return num1 + num2;		
	}
	public int add(int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}
}
public class Mathod_overloading {
	
	public static void main(String_h args[])
	{
		Calcy calc = new Calcy();
		
		int result = calc.add(5, 4 ,9);
		
		System.out.println(result);
	}

}
