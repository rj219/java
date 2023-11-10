class Phone
{
	static String name;
	int price;
	char typeCharge;
	
	public void show()
	{
		System.out.println(name+":"+price+":"+ typeCharge);
	}
}

public class Mobile {
	
	public static void main(String args[])
	{
		Phone ph = new Phone();
		
		ph.name = "Apple";
		ph.price = 35000;
		ph.typeCharge = 'c';
		
		Phone ph1 = new Phone();
		
		
		Phone.name = "Samsung";
		ph1.price = 40000;
		ph1.typeCharge = 'c';
		
		ph.name = "Motorola";
		
		ph.show();
		ph1.show();
		
	}

}
