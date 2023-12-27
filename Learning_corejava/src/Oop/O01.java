package Oop;

class Calcy
{
		public void toCalcy()
		{
			System.out.println("Perfom all mathamatic equation : ");
		}
}
class Sum extends Calcy
{
	int a;
	int b;
	Sum(int a, int b)
	{
		this.a =a;
		this.b =b;
	}
	public void toCalcy()
	{
		System.out.println("The sum of a and b is :"+(a+b));
	}
}
class Sub extends Calcy
{
	int a;
	int b;
	Sub(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public void toCalcy()
	{
		System.out.println("The substraction of the a and b is : "+ (a-b));
	}
}
class Multi extends Calcy
{
	int a;
	int b;
	Multi(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void toCalcy()
	{
		System.out.println("The multiplication of the a and b is : "+ a*b);
	}
}
class Div extends Calcy
{
	double a;
	double b;
	Div(double a, double b)
	{
		this.a =a;
		this.b =b;
	}
	public void toCalcy()
	{
		System.out.println("Division of the value a and b is "+ a/b);
	}
}
class Mod extends Calcy
{
	float a;
	float b;
	
	Mod(float a, float b)
	{
		this.a = a;
		this.b = b;
	}
	public void toCalcy()
	{
		System.out.println("The modulo of the a and b is : "+ a%b);
	}
}
public class O01 {
	
	public static void main(String[] args)
	{
			Calcy cal = new Calcy();
			cal.toCalcy();
			Calcy cal1 = new Sum(12,34);
			cal1.toCalcy();
			Calcy cal2 = new Sub(30 ,20);
			cal2.toCalcy();
			Calcy cal3 = new Multi(15,2);
			cal3.toCalcy();
			Calcy cal4 = new Div(15.0,2.0);
			cal4.toCalcy();
			Calcy cal5 = new Mod(24f , 6f);
			cal5.toCalcy();
	}

}
