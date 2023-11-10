class calculator
{
	public int add(int num1 , int num2)
	{
		int r = num1 + num2;
		return r;
	}
}

class C_obj
{
	public static void main(String_h args[])
	{
		int a = 4;
		int b = 5;
		
		calculator calc = new calculator();
		int result = calc.add(a,b);
		
		System.out.println(result);
	}
}