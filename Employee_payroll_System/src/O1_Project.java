import java.util.ArrayList;

abstract class Employee
{
	private String name;
	private int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	
	public abstract double calculateSalary();

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", id=" + id + " ,Salary = "+ calculateSalary() + "]";
	}
}

class Full_timeEmployee extends Employee
{
	private double monthlySalary;
	
	public Full_timeEmployee(String name, int id,double monthlySalary)
	{
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double calculateSalary()
	{
		return monthlySalary;
	}
	 
}

class partTimeEmployee extends Employee
{
	private int hourlyWorked;
	private double hourlyRate;
	
	public partTimeEmployee(String name,int id,int hourlyWorked,double hourlyRate)
	{
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hourlyWorked = hourlyWorked;
	}

	@Override
	public double calculateSalary() {
	
		return hourlyRate * hourlyWorked;
	}
}

class payRollSystem
{
	private ArrayList<Employee> employelist;
	
	public payRollSystem()
	{
		employelist = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee)
	{
		employelist.add(employee);
	}
	public void removeEmployee(int id)
	{
		Employee employeeToremove = null;
		for(Employee emp : employelist)
		{
			if(emp.getId()==id)
			{
				employeeToremove = emp;
				break;
			}
		}
		if(employeeToremove != null)
		{
			employelist.remove(employeeToremove);
		}
	}
	
	public void displayEmployees()
	{
		for(Employee employee : employelist)
		{
			System.out.println(employee);
		}
	}
}
public class O1_Project {
	
	public static void main(String[] args)
	{
		payRollSystem pay = new payRollSystem();
		
		Full_timeEmployee full = new Full_timeEmployee("Janak", 01, 100000.0);
		
		partTimeEmployee part = new partTimeEmployee("Sahl", 02, 40, 100.0);
		
		pay.addEmployee(full);
		pay.addEmployee(part);
		
		System.out.println("Initial Employee details : " );
		pay.displayEmployees();
		
		System.out.println("Removing Employees : " );
		pay.removeEmployee(02);
		
		System.out.println("Remaining Employee details : ");
		pay.displayEmployees();
	}

}
