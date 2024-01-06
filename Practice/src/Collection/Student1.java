package Collection;

public class Student1 {
	
	int id;
	String name;
	String email;
	double sal;
	
	public Student1(int id, String name, String email, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", sal=" + sal + "]";
	}
}
