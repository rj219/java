package Oop;

class Employee
{
	private int age;
	private String name;
	private double salary;
	
	public int setAge(int age)
	{
		this.age = age;
		return age;
	}
	
}

public class Encapsulation {
	
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		
		System.out.println(emp.setAge(10));
		
	}

}
