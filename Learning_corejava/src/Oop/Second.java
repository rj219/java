package Oop;

class Female
{
	int price;
	String name;
	String Country;
	String style;
	
	Female()
	{
		System.out.println("In a Constructor");
	}
	Female(int price)
	{
		this.price = price;
		System.out.println(price);
	}
	
	public void toFuck()
	{
		System.out.println(name+" "+Country+" "+style+" "+price);
	}
}

public class Second {

	public static void main(String[] args)
	{
		Female f1 = new Female(600);
		
		f1.name = "Savita bhabhi";
		f1.Country = "Indian";
		f1.price = 600;
		f1.style = "Ubha Ubha";
		
		f1.toFuck();
	}
}
