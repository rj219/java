class Human
{
	private int age;
	private String name;


public int getage()
{
	return age;
}
public String getname()
{
	return name;
}

public void setage(int a)
{
	age = a;
}

public void setname(String n)
{	
	name = n;
}

}

class Dem_o
{
	public static void main(String args[])
	{
		Human man = new Human();
		
		man.setage(25);
		man.setname("Janak_Rathod");
		
		System.out.println(man.getage()+" : "+man.getname());
	}
}