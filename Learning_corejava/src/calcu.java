class Addition
{
	public int Addi(int num, int num1)
	{
		return num + num1;
	}
	public int Subs(int num , int num1)
	{
		return (num - num1);
	}
	public int Multi(int num, int num1)
	{
		return (num * num1);
	}
	public float Div(float num, float num1)
	{
		return (num / num1);
	}
	public int Mod(int num , int num1)
	{
		return (num % num1);
	}
}
public class calcu {
	public static void main(String_h args[])
	{
		Addition Add = new Addition();
		int result = Add.Addi(15,45);
		int result1 = Add.Subs(15,45);
		int result2 = Add.Multi(15,45);
		float result3 =  Add.Div(15f,45f);
		int result4 =Add.Mod(15,45);
		
			System.out.println(result);
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
	}
		
}
