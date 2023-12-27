 class Student
	{
		private int id;
		private String name;
		float marks;
		
	public int setid(int id)
	{
		this.id = id;
		return id;
	}
		
	}
public class Encapsulation {
		
	public static void main(String[] args) 
	{
		Student st = new Student();
		System.out.println(st.setid(2));
	}

}
