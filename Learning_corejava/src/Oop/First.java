package Oop;

class Vehicle
{
	int Price;
	String Brand;
	String Model;
	
	public void toRide()
	{
		System.out.println(Price+" : "+Brand+" : "+Model);
	}
}
 public class First
 {
	 public static void main(String[] args)
	 {
		 Vehicle v1 = new Vehicle();
		 
		 v1.Price= 700000;
		 v1.Brand = "Shelby";
		 v1.Model = "Mustang 1969";
		 v1.toRide();
		 
		 Employee emp = new Employee();
		 
		 System.out.println(emp.setAge(10));
	 }
 }
