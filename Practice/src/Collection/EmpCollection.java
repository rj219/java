package Collection;

public class EmpCollection implements Comparable<EmpCollection>
{
	int id;
	String name;
	String email;
	double salary;
	
	public EmpCollection(int id, String name, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+salary);
	}
	public String toString()
	{
		return id+" "+name+" "+email+" "+salary;
	}

	@Override
	public int compareTo(EmpCollection o) {
		int a = o.id;
		int b = this.id;
		int i = 0;
		if(b > a)
		{
			i = 1;
		}
		else if(b < a)
		{
			i = -1;
		}
		else
		{
			i = 0;
		}
		return i;
	}
	
	
	
	
}
